/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2013-07-24 21:49:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/templates/footer.jsp", Long.valueOf(1371670985000L));
    _jspx_dependants.put("/templates/header.jsp", Long.valueOf(1374690036000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\"\n");
      out.write("\tmedia=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap-responsive.min.css\"\n");
      out.write("\ttype=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.js\" type=\"text/css\"\n");
      out.write("\tmedia=\"screen\">\n");
      out.write("\n");
      out.write("<!--  Custom Login Box -->\n");
      out.write("<style type=\"text/css\">\n");
      out.write("/* Override some defaults */\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tpadding-top: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The white background content wrapper */\n");
      out.write(".container>.content {\n");
      out.write("\tbackground-color: #fff;\n");
      out.write("\tpadding: 20px;\n");
      out.write("\tmargin: 0 -20px;\n");
      out.write("\t-webkit-border-radius: 10px 10px 10px 10px;\n");
      out.write("\t-moz-border-radius: 10px 10px 10px 10px;\n");
      out.write("\tborder-radius: 10px 10px 10px 10px;\n");
      out.write("\t-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .15);\n");
      out.write("\t-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .15);\n");
      out.write("\tbox-shadow: 0 1px 2px rgba(0, 0, 0, .15);\n");
      out.write("\tborder-style:solid;\n");
      out.write("\tborder-color:#000000;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form {\n");
      out.write("\tmargin-left: 65px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("legend {\n");
      out.write("\tmargin-right: -50px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor: #404040;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Recommender</title>\n");
      out.write("</head>");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"text-center\">\n");
      out.write("\t\t<h1>Recommender</h1>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"text-center\">\n");
      out.write("\t\t<h4 style=\"color: #C0C0C0\">Sign In / Create Account</h4>\n");
      out.write("\t\t<br>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\" id=\"loginbox\" style=\"width: 300px\">\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"login-form\">\n");
      out.write("\t\t\t\t\t<form action=\"Login\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"userid\" placeholder=\"Username\"\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"border-color: black; border-style: solid; border-width: 2px;\"\n");
      out.write("\t\t\t\t\t\t\t\t\tautofocus>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t<div style=\"display:inline; float:none\">\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn btn-primary\" type=\"submit\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"width: 100px\">Sign In</button>\n");
      out.write("\t\t\t\t\t\t\t<button style=\"width: 100px\" class=\"btn\" type=\"button\"\n");
      out.write("\t\t\t\t\t\t\t\tonClick=\"unhide(); hideMsg(); hideLogin();\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"displaynewuserbutton\">New User?</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t<div id=\"messagediv\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\" style=\"visibility: hidden\" style=\"width:300px\"\n");
      out.write("\t\tid=\"newuser\">\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"login-form\">\n");
      out.write("\t\t\t\t\t<form action=\"CreateUser\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" id=\"newfield\" name=\"userid\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"New Username\"\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"border-color: black; border-style: solid; border-width: 2px;\"\n");
      out.write("\t\t\t\t\t\t\t\t\tautofocus><br> <input type=\"text\" name=\"realname\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Real Name\"\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"border-color: black; border-style: solid; border-width: 2px;\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-primary\" type=\"submit\">Create\n");
      out.write("\t\t\t\t\t\t\tAccount</button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction unhide() {\n");
      out.write("\t\t\tvar hiddenDiv = document.getElementById('newuser');\n");
      out.write("\t\t\thiddenDiv.style.visibility = 'visible';\n");
      out.write("\t\t\thiddenDiv.style.width = '300px'; // Required for some browsers.\n");
      out.write("\t\t\tvar field = document.getElementById('newfield');\n");
      out.write("\t\t\tfield.focus();\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction hideLogin() {\n");
      out.write("\t\t\tvar login = document.getElementById('loginbox');\n");
      out.write("\t\t\tlogin.style.display = 'none';\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction hideMsg() {\n");
      out.write("\t\t\tvar msgdiv = document.getElementById('messagediv');\n");
      out.write("\t\t\tmsgdiv.style.display = 'none';\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("\t");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
