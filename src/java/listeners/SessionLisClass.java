package listeners;

import jakarta.servlet.http.*;

public class SessionLisClass implements HttpSessionListener, HttpSessionAttributeListener {

    @Override
    public void sessionCreated(HttpSessionEvent hse) {
        System.out.println(hse.getSession().getId() + "Created");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent hse) {
        System.out.println("Session Killed");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent hsbe) {
        System.out.println("attribute added");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent hsbe) {
        System.out.println("attribute removed");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent hsbe) {
        System.out.println("attribute reblaced");
    }
}
