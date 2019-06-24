package Beans;

import Dao.GrupoDao;
import Models.Grupo;
import Models.Tarefa;
import org.primefaces.model.timeline.TimelineEvent;
import org.primefaces.model.timeline.TimelineModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean(name = "timeLineBean")
@ViewScoped
public class TimeLineBean {
    private TimelineModel model;
    private Date startDate;
    private Date endDate;

    private Grupo grupo = new Grupo();
    private GrupoDao dao;

    private List<Tarefa> tarefaList = new ArrayList<>();


    @PostConstruct
    protected void init() {

        model= new TimelineModel();
        this.dao = new GrupoDao(grupo);

        //get the list of Tarefa
        tarefaList = dao.tarefaList(1);

        //Loop  adding all Tarefa on timeline
        for (Tarefa tarefa: tarefaList){
            model.add(new TimelineEvent(tarefa.getNome(),tarefa.getDataDeInicio()));

        }

        endDate = grupo.getUltimaModificacao();
        startDate = grupo.getDataDeInicio();
    }

    private void addVersion(int year, int month, int day, String desc) {
        model.add(new TimelineEvent(desc, getDate(year, month, day)));
    }

    private Date getDate(int year, int month, int day) {
        Instant instant = LocalDate.of(year, month, day)
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant();
        return Date.from(instant);
    }

    public TimelineModel getModel() {
        return model;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Grupo getGrupo() {
        grupo = dao.findById(1);
        return grupo;
    }

}
