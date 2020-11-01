import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

@WebServlet(name = "ServletCustomer ", urlPatterns = "")
public class ServletCustomer extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        LinkedList<Customers> listCustomer = new LinkedList<>();
        Customers customers1 = new Customers("Bùi Tiến Dũng", "1/12/1990", "hà tĩnh", "<img class='imgkhachang' src='https://znews-stc.zdn.vn/static/topic/person/tien%20dung.jpg'>");
        Customers customers2 = new Customers("Quang Hải", "22/4/1997", "hà nội", "<img class='imgkhachang' src='https://nguoi-noi-tieng.com/images/post/tieu-su-cau-thu-nguyen-quang-hai-531265.jpg' >");
        Customers customers3 = new Customers("Văn Lâm", "15/3/1995", "hải phòng", "<img class='imgkhachang' src='https://vnn-imgs-f.vgcloud.vn/2019/07/22/20/dang-van-lam-muangthong-united.jpg' >");

        listCustomer.add(customers1);
        listCustomer.add(customers2);
        listCustomer.add(customers3);

        RequestDispatcher dispatcher  = request.getRequestDispatcher("index.jsp");
        request.setAttribute("listCustomer",listCustomer);
        dispatcher.forward(request, response);
    }
}
