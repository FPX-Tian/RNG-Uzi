package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>美淘网后台登录</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("html, body\r\n");
      out.write("{\r\n");
      out.write("    height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body\r\n");
      out.write("{\r\n");
      out.write("    font: 12px 'Lucida Sans Unicode', 'Trebuchet MS', Arial, Helvetica;    \r\n");
      out.write("    margin: 0;\r\n");
      out.write("    background-color: #d9dee2;\r\n");
      out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#ebeef2), to(#d9dee2));\r\n");
      out.write("    background-image: -webkit-linear-gradient(top, #ebeef2, #d9dee2);\r\n");
      out.write("    background-image: -moz-linear-gradient(top, #ebeef2, #d9dee2);\r\n");
      out.write("    background-image: -ms-linear-gradient(top, #ebeef2, #d9dee2);\r\n");
      out.write("    background-image: -o-linear-gradient(top, #ebeef2, #d9dee2);\r\n");
      out.write("    background-image: linear-gradient(top, #ebeef2, #d9dee2);    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login\r\n");
      out.write("{\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#fff), to(#eee));\r\n");
      out.write("    background-image: -webkit-linear-gradient(top, #fff, #eee);\r\n");
      out.write("    background-image: -moz-linear-gradient(top, #fff, #eee);\r\n");
      out.write("    background-image: -ms-linear-gradient(top, #fff, #eee);\r\n");
      out.write("    background-image: -o-linear-gradient(top, #fff, #eee);\r\n");
      out.write("    background-image: linear-gradient(top, #fff, #eee);  \r\n");
      out.write("    height: 240px;\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    margin: -150px 0 0 -230px;\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    z-index: 0;\r\n");
      out.write("    -moz-border-radius: 3px;\r\n");
      out.write("    -webkit-border-radius: 3px;\r\n");
      out.write("    border-radius: 3px;  \r\n");
      out.write("    -webkit-box-shadow:\r\n");
      out.write("          0 0 2px rgba(0, 0, 0, 0.2),\r\n");
      out.write("          0 1px 1px rgba(0, 0, 0, .2),\r\n");
      out.write("          0 3px 0 #fff,\r\n");
      out.write("          0 4px 0 rgba(0, 0, 0, .2),\r\n");
      out.write("          0 6px 0 #fff,  \r\n");
      out.write("          0 7px 0 rgba(0, 0, 0, .2);\r\n");
      out.write("    -moz-box-shadow:\r\n");
      out.write("          0 0 2px rgba(0, 0, 0, 0.2),  \r\n");
      out.write("          1px 1px   0 rgba(0,   0,   0,   .1),\r\n");
      out.write("          3px 3px   0 rgba(255, 255, 255, 1),\r\n");
      out.write("          4px 4px   0 rgba(0,   0,   0,   .1),\r\n");
      out.write("          6px 6px   0 rgba(255, 255, 255, 1),  \r\n");
      out.write("          7px 7px   0 rgba(0,   0,   0,   .1);\r\n");
      out.write("    box-shadow:\r\n");
      out.write("          0 0 2px rgba(0, 0, 0, 0.2),  \r\n");
      out.write("          0 1px 1px rgba(0, 0, 0, .2),\r\n");
      out.write("          0 3px 0 #fff,\r\n");
      out.write("          0 4px 0 rgba(0, 0, 0, .2),\r\n");
      out.write("          0 6px 0 #fff,  \r\n");
      out.write("          0 7px 0 rgba(0, 0, 0, .2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login:before\r\n");
      out.write("{\r\n");
      out.write("    content: '';\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    z-index: -1;\r\n");
      out.write("    border: 1px dashed #ccc;\r\n");
      out.write("    top: 5px;\r\n");
      out.write("    bottom: 5px;\r\n");
      out.write("    left: 5px;\r\n");
      out.write("    right: 5px;\r\n");
      out.write("    -moz-box-shadow: 0 0 0 1px #fff;\r\n");
      out.write("    -webkit-box-shadow: 0 0 0 1px #fff;\r\n");
      out.write("    box-shadow: 0 0 0 1px #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1\r\n");
      out.write("{\r\n");
      out.write("    text-shadow: 0 1px 0 rgba(255, 255, 255, .7), 0px 2px 0 rgba(0, 0, 0, .5);\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color: #666;\r\n");
      out.write("    margin: 0 0 30px 0;\r\n");
      out.write("    letter-spacing: 4px;\r\n");
      out.write("    font: normal 26px/1 Verdana, Helvetica;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1:after, h1:before\r\n");
      out.write("{\r\n");
      out.write("    background-color: #777;\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    height: 1px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 15px;\r\n");
      out.write("    width: 120px;   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1:after\r\n");
      out.write("{ \r\n");
      out.write("    background-image: -webkit-gradient(linear, left top, right top, from(#777), to(#fff));\r\n");
      out.write("    background-image: -webkit-linear-gradient(left, #777, #fff);\r\n");
      out.write("    background-image: -moz-linear-gradient(left, #777, #fff);\r\n");
      out.write("    background-image: -ms-linear-gradient(left, #777, #fff);\r\n");
      out.write("    background-image: -o-linear-gradient(left, #777, #fff);\r\n");
      out.write("    background-image: linear-gradient(left, #777, #fff);      \r\n");
      out.write("    right: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1:before\r\n");
      out.write("{\r\n");
      out.write("    background-image: -webkit-gradient(linear, right top, left top, from(#777), to(#fff));\r\n");
      out.write("    background-image: -webkit-linear-gradient(right, #777, #fff);\r\n");
      out.write("    background-image: -moz-linear-gradient(right, #777, #fff);\r\n");
      out.write("    background-image: -ms-linear-gradient(right, #777, #fff);\r\n");
      out.write("    background-image: -o-linear-gradient(right, #777, #fff);\r\n");
      out.write("    background-image: linear-gradient(right, #777, #fff);\r\n");
      out.write("    left: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("fieldset\r\n");
      out.write("{\r\n");
      out.write("    border: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#inputs input\r\n");
      out.write("{\r\n");
      out.write("    background: #f1f1f1 url(images/login-sprite.png) no-repeat;\r\n");
      out.write("    padding: 15px 15px 15px 30px;\r\n");
      out.write("    margin: 0 0 10px 0;\r\n");
      out.write("    width: 353px; /* 353 + 2 + 45 = 400 */\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    -moz-border-radius: 5px;\r\n");
      out.write("    -webkit-border-radius: 5px;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    -moz-box-shadow: 0 1px 1px #ccc inset, 0 1px 0 #fff;\r\n");
      out.write("    -webkit-box-shadow: 0 1px 1px #ccc inset, 0 1px 0 #fff;\r\n");
      out.write("    box-shadow: 0 1px 1px #ccc inset, 0 1px 0 #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#username\r\n");
      out.write("{\r\n");
      out.write("    background-position: 5px -2px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#password\r\n");
      out.write("{\r\n");
      out.write("    background-position: 5px -52px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#inputs input:focus\r\n");
      out.write("{\r\n");
      out.write("    background-color: #fff;\r\n");
      out.write("    border-color: #e8c291;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    -moz-box-shadow: 0 0 0 1px #e8c291 inset;\r\n");
      out.write("    -webkit-box-shadow: 0 0 0 1px #e8c291 inset;\r\n");
      out.write("    box-shadow: 0 0 0 1px #e8c291 inset;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#actions\r\n");
      out.write("{\r\n");
      out.write("    margin: 25px 0 0 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#submit\r\n");
      out.write("{\t\t\r\n");
      out.write("    background-color: #ffb94b;\r\n");
      out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#fddb6f), to(#ffb94b));\r\n");
      out.write("    background-image: -webkit-linear-gradient(top, #fddb6f, #ffb94b);\r\n");
      out.write("    background-image: -moz-linear-gradient(top, #fddb6f, #ffb94b);\r\n");
      out.write("    background-image: -ms-linear-gradient(top, #fddb6f, #ffb94b);\r\n");
      out.write("    background-image: -o-linear-gradient(top, #fddb6f, #ffb94b);\r\n");
      out.write("    background-image: linear-gradient(top, #fddb6f, #ffb94b);\r\n");
      out.write("    \r\n");
      out.write("    -moz-border-radius: 3px;\r\n");
      out.write("    -webkit-border-radius: 3px;\r\n");
      out.write("    border-radius: 3px;\r\n");
      out.write("    \r\n");
      out.write("    text-shadow: 0 1px 0 rgba(255,255,255,0.5);\r\n");
      out.write("    \r\n");
      out.write("     -moz-box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0 rgba(255, 255, 255, 0.3) inset;\r\n");
      out.write("     -webkit-box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0 rgba(255, 255, 255, 0.3) inset;\r\n");
      out.write("     box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0 rgba(255, 255, 255, 0.3) inset;    \r\n");
      out.write("    \r\n");
      out.write("    border-width: 1px;\r\n");
      out.write("    border-style: solid;\r\n");
      out.write("    border-color: #d69e31 #e3a037 #d5982d #e3a037;\r\n");
      out.write("\r\n");
      out.write("    float: left;\r\n");
      out.write("    height: 35px;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    width: 120px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    font: bold 15px Arial, Helvetica;\r\n");
      out.write("    color: #8f5a0a;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#submit:hover,#submit:focus\r\n");
      out.write("{\t\t\r\n");
      out.write("    background-color: #fddb6f;\r\n");
      out.write("    background-image: -webkit-gradient(linear, left top, left bottom, from(#ffb94b), to(#fddb6f));\r\n");
      out.write("    background-image: -webkit-linear-gradient(top, #ffb94b, #fddb6f);\r\n");
      out.write("    background-image: -moz-linear-gradient(top, #ffb94b, #fddb6f);\r\n");
      out.write("    background-image: -ms-linear-gradient(top, #ffb94b, #fddb6f);\r\n");
      out.write("    background-image: -o-linear-gradient(top, #ffb94b, #fddb6f);\r\n");
      out.write("    background-image: linear-gradient(top, #ffb94b, #fddb6f);\r\n");
      out.write("}\t\r\n");
      out.write("\r\n");
      out.write("#submit:active\r\n");
      out.write("{\t\t\r\n");
      out.write("    outline: none;\r\n");
      out.write("   \r\n");
      out.write("     -moz-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;\r\n");
      out.write("     -webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;\r\n");
      out.write("     box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#submit::-moz-focus-inner\r\n");
      out.write("{\r\n");
      out.write("  border: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#actions a\r\n");
      out.write("{\r\n");
      out.write("    color: #3151A2;    \r\n");
      out.write("    float: right;\r\n");
      out.write("    line-height: 35px;\r\n");
      out.write("    margin-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#back\r\n");
      out.write("{\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top: 60px;\r\n");
      out.write("    color: #999;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form id=\"login\" action=\"login2\" method=\"post\">\r\n");
      out.write("    <h1>美淘后台系统</h1>\r\n");
      out.write("    <fieldset id=\"inputs\">\r\n");
      out.write("        <input id=\"username\" name=\"login\" type=\"text\" placeholder=\"Username\" autofocus required>   \r\n");
      out.write("        <input id=\"password\" name=\"password\" type=\"password\" placeholder=\"Password\" required>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("    <fieldset id=\"actions\">\r\n");
      out.write("        <input type=\"submit\" id=\"submit\" value=\"登录\">\r\n");
      out.write("        <a href=\"\">Forgot your password?</a><a href=\"\">Register</a>\r\n");
      out.write("    </fieldset>\r\n");
      out.write("</form>\r\n");
      out.write("<br><br>\r\n");
      out.write("<div style=\"text-align:center;clear:both\">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
