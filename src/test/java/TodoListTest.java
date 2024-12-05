import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mallon.TodoItem;
import org.mallon.TodoList;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TodoListTest {

    TodoList myList ;
    TodoItem item;
    @BeforeEach
    void setUp(){
        item = new TodoItem("email set up");
        myList = new TodoList("First Week of Work");
    }
    @Test
    public void addItemTest(){
        myList.addTodo(item); //now list contains one element
        assertEquals(1, ( (List<TodoItem>) myList.getAllTodos()).size());
    }

    @Test
    public void addToemptyListTest(){
        assertTrue(myList.addTodo(item));
        assertTrue(myList.getAllTodos().iterator().hasNext());
    };
}
