/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2013-07-29 22:30:43 UTC
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
    _jspx_dependants.put("/templates/header.jsp", Long.valueOf(1374860514000L));
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
      out.write("\t\n");
      out.write("<!-- Custom Styles -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\"\n");
      out.write("\tmedia=\"screen\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Recommender</title>\n");
      out.write("</head>");
      out.write("\n");
      out.write("\n");
      out.write("<body id=\"splash\">\n");
      out.write("  <div class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("    <div class=\"navbar-inner\">\n");
      out.write("      <a class=\"brand\" href=\"/Recommender/login.jsp\">Recommender</a>\n");
      out.write("      <span class=\"powered-by\">Powered by MongoDB</span>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"span6 offset3\">\n");
      out.write("        <h1 class=\"tagline\">Get customized movie recommendations based on your favorite movies.</h1>\n");
      out.write("        <div class=\"login-box\" id=\"loginbox\">\n");
      out.write("          <div class=\"login-heading clearfix\">\n");
      out.write("            <h2>Sign In</h2>\n");
      out.write("            <p class=\"login-switch\">Need an account? <a href=\"#\" onclick=\"unhide(); hideMsg(); hideLogin();\">Create New Account</a></p>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <form class=\"form-horizontal login-form\" action=\"Login\" method=\"post\">\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("              <label class=\"control-label\" for=\"unique_id\">Username</label>\n");
      out.write("              <div class=\"controls\">\n");
      out.write("                <input class=\"span3\" type=\"text\" name=\"unique_id\" id=\"userid\" placeholder=\"Username\" autofocus>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("              <div class=\"controls\">\n");
      out.write("                <button class=\"btn btn-primary btn-large\" type=\"submit\">Sign In</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          <div id=\"messagediv\" class=\"text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"login-box\" id=\"newuser\" style=\"display:none;\">\n");
      out.write("          <div class=\"login-heading clearfix\">\n");
      out.write("            <h2>Create Account</h2>\n");
      out.write("            <p class=\"login-switch\">Already have an account? <a href=\"#\" onclick=\"\">Log In</a></p>\n");
      out.write("          </div>\n");
      out.write("          <form class=\"form-horizontal login-form\" action=\"CreateUser\" method=\"post\">\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("              <label class=\"control-label\" for=\"newfield\">New Username</label>\n");
      out.write("              <div class=\"controls\">\n");
      out.write("                  <input class=\"span3\" type=\"text\" id=\"newfield\" name=\"unique_id\" placeholder=\"New Username\" autofocus><br> \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("              <label class=\"control-label\" for=\"realname\">Real Name</label>\n");
      out.write("              <div class=\"controls\">\n");
      out.write("                <input class=\"span3\" type=\"text\" name=\"realname\" id=\"realname\" placeholder=\"Real Name\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("              <div class=\"controls\">\n");
      out.write("                <button class=\"btn btn-primary btn-large\" type=\"submit\">Create Account</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    function unhide() {\n");
      out.write("      var hiddenDiv = document.getElementById('newuser');\n");
      out.write("      hiddenDiv.style.display = 'block';\n");
      out.write("      var field = document.getElementById('newfield');\n");
      out.write("      field.focus();\n");
      out.write("    }\n");
      out.write("    function hideLogin() {\n");
      out.write("      var login = document.getElementById('loginbox');\n");
      out.write("      login.style.display = 'none';\n");
      out.write("    }\n");
      out.write("    function hideMsg() {\n");
      out.write("      var msgdiv = document.getElementById('messagediv');\n");
      out.write("      msgdiv.style.display = 'none';\n");
      out.write("    }\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("  ");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
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
