import com.openwebserver.core.Domain;
import com.openwebserver.core.Routing.Router;
import com.openwebserver.core.WebServer;

public class Main {

    public static void main(String[] args) {

        SessionTest test = new SessionTest("/");

        new WebServer().addDomain(
                new Domain()
                    .addHandler(test)
        ).start();
        Router.print();
    }

}
