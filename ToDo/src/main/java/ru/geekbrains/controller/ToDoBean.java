//package main.java.ru.geekbrains.controller;
//
//import main.java.ru.geekbrains.persist.ToDo;
//import main.java.ru.geekbrains.persist.ToDoRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.enterprise.context.SessionScoped;
//import javax.inject.Inject;
//import javax.inject.Named;
//import java.io.Serializable;
//import java.sql.SQLException;
//import java.util.List;
//
//@SessionScoped
//@Named
//public class ToDoBean implements Serializable {
//
//    private static final Logger logger = LoggerFactory.getLogger(ToDoBean.class);
//
//
//    @Inject
//    private ToDoRepository toDoRepository;
//
//    private ToDo toDo;
//
//    public ToDo getToDo() {
//        return toDo;
//    }
//
//    public void setToDo(ToDo toDo) {
//        this.toDo = toDo;
//    }
//
//    public List<ToDo> getAllToDo() throws SQLException {
//        return toDoRepository.findAll();
//    }
//
//    public String createToDo() {
//        this.toDo = new ToDo();
//        return "/todo.jsp?faces-redirect=true";
//    }
//
//    public String saveToDo() throws SQLException {
//        if (toDo.getId() == null){
//            toDoRepository.insert(toDo);
//        }else {
//            toDoRepository.update(toDo);
//        }
//        return "/index.jsp?faces-redirect=true";
//    }
//
//    public String deleteToDo() throws SQLException {
//        if ()
//    }
//}
