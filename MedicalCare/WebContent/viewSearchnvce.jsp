<%@ page import="java.util.*" %>
 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
    </head>
    <body>
        <table width="700px" align="center"
               style="border:1px solid #000000;">
            <tr>
                <td colspan=9 align="center"
                    style="background-color:#00BFFF">
                    <b>invoice</b></td>
            </tr>
            <tr style="background-color:#ddd;">
                <td><b>Batch_no</b></td>
                <td><b>Customer_name</b></td>
                <td><b>Email</b></td>
                <td><b>Date</b></td>
                <td><b>Payment_method</b></td>
                <td><b>item</b></td>
                <td><b>Exp_date</b></td>
                <td><b>quantity</b></td>
                <td><b>Price</b></td>
                <td><b>Gst</b></td>
                <td><b>Discount</b></td>
                <td><b>Final_amount</b></td>
                <td><b>Total</b></td>
            </tr>
            <%
                int count = 0;
                String color = "#F9EBB3";
                if (request.getAttribute("piList") != null) {
                    ArrayList al = (ArrayList) request.getAttribute("piList");
                    System.out.println(al);
                    Iterator itr = al.iterator();
                    while (itr.hasNext()) {

                        if ((count % 2) == 0) {
                            color = "#eeffee";
                        }
                        count++;
                        ArrayList pList = (ArrayList) itr.next();
            %>
            <tr style="background-color:<%=color%>;">
                <td><%=pList.get(0)%></td>
                <td><%=pList.get(1)%></td>
                <td><%=pList.get(2)%></td>
                <td><%=pList.get(3)%></td>
                <td><%=pList.get(4)%></td>
                <td><%=pList.get(5)%></td>
                <td><%=pList.get(6)%></td>
                <td><%=pList.get(7)%></td>
                <td><%=pList.get(8)%></td>
                <td><%=pList.get(9)%></td>
                <td><%=pList.get(10)%></td>
                <td><%=pList.get(11)%></td>
                <td><%=pList.get(12)%></td>
                
            </tr>
            <%
                    }
                }
                if (count == 0) {
            %>
            <tr>
                <td colspan=4 align="center"
                    style="background-color:#eeffee"><b>No Record Found..</b></td>
            </tr>
            <%            }
            %>
        </table>
        <a href="welcome.jsp">back to home page</a>
    </body>
</html>