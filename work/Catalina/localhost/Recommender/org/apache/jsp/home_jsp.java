/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.40
 * Generated at: 2013-07-24 21:52:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/templates/footer.jsp", Long.valueOf(1371670985000L));
    _jspx_dependants.put("/templates/scroll.jsp", Long.valueOf(1373491792000L));
    _jspx_dependants.put("/templates/header.jsp", Long.valueOf(1374690036000L));
    _jspx_dependants.put("/templates/navbar.jsp", Long.valueOf(1374700784000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<body onload=\"loadScroll(); activateTab()\" onunload=\"saveScroll()\">\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"span4\">\n");
      out.write("\t\t\t\t<h1>Recommender</h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<br>\n");
      out.write("\n");
      out.write("\t\t");
      out.write("<ul class=\"nav nav-tabs\">\n");
      out.write("\t<li id=\"hometab\"><a href=\"#\" onclick=\"document.getElementById('b1').click(); return false;\" id=\"home\">My Favorites</a></li>\n");
      out.write("\t<li id=\"updatetab\"><a href=\"#\" onclick=\"document.getElementById('b2').click(); return false;\" id=\"update\">Update Movies</a></li>\n");
      out.write("\t<li id=\"recommendtab\"><a href=\"#\" onclick=\"document.getElementById('b3').click(); return false;\" id=\"recommend\">Recommendations</a></li>\n");
      out.write("\t<li><a href=\"login.jsp\">Log Out</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div style=\"display: none\">\n");
      out.write("\t<form action=\"Login\" method=\"post\" name=\"home\">\n");
      out.write("\t\t<button id=\"b1\" name=\"userid\" type=\"submit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unique_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\t\t</button>\n");
      out.write("\t</form>\n");
      out.write("\t<form action=\"Recommend\" method=\"get\" name=\"update\">\n");
      out.write("\t\t<button id=\"b2\" name=\"unique_id\" type=\"submit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unique_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\t\t</button>\n");
      out.write("\t</form>\n");
      out.write("\t<form action=\"Recommend\" method=\"post\">\n");
      out.write("\t\t<button id=\"b3\" name=\"unique_id\" type=\"submit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unique_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></button>\n");
      out.write("\t</form>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<h4 style=\"color:#C0C0C0\">Click Movie to Remove from Favorites</h4>\n");
      out.write("\t\t\n");
      out.write("\t\t<br>\n");
      out.write("\n");
      out.write("\t\t<div class=\"text-left\">\n");
      out.write("\t\t\t<!--  This part here prints all of the user's preferences. -->\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Hidden form to allow us to grab the user's item prefs. -->\n");
      out.write("\t\t<form id=\"grabItems\" action=\"Login\" method=\"get\" hidden=true>\n");
      out.write("\t\t\t<input name=\"unique_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unique_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t\t<!--  Another hidden form to allow for seamless removal/refresh of movies -->\n");
      out.write("\t\t<form name=\"removeRefresh\" action=\"RemoveItem\" method=\"post\"\n");
      out.write("\t\t\thidden=\"true\">\n");
      out.write("\t\t\t<input id=\"removethis\" name=\"remove\" value=\"\"> <input\n");
      out.write("\t\t\t\tname=\"unique_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unique_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!--  AJAX call to get the user's item preferences. -->\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!--  JQuery deletions in response to box-checking. -->\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t$('input:checkbox').change(function() {\n");
      out.write("\t\tif ($(this).is(':checked')) {\n");
      out.write("\t\t\tvar tempScrollTop = $(window).scrollTop();\n");
      out.write("\t\t\tvar value = $(this).val();\n");
      out.write("\t\t\tvar input = $('#removethis');\n");
      out.write("\t\t\tinput.val(value); // Set the form value.\n");
      out.write("\t\t\t// Submit the form.\n");
      out.write("\t\t\t$('form[name=\"removeRefresh\"]').submit();\n");
      out.write("\t\t\t$(window).scrollTop(tempScrollTop);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tfunction activateTab() {\n");
      out.write("\t\tvar homeTab = document.getElementById(\"hometab\");\n");
      out.write("\t\thomeTab.className = \"active\";\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tcookieName = \"page_scroll\"\n");
      out.write("\texpdays = 365\n");
      out.write("\n");
      out.write("\t// An adaptation of Dorcht's cookie functions.\n");
      out.write("\n");
      out.write("\tfunction setCookie(name, value, expires, path, domain, secure) {\n");
      out.write("\t\tif (!expires) {\n");
      out.write("\t\t\texpires = new Date()\n");
      out.write("\t\t}\n");
      out.write("\t\tdocument.cookie = name\n");
      out.write("\t\t\t\t+ \"=\"\n");
      out.write("\t\t\t\t+ escape(value)\n");
      out.write("\t\t\t\t+ ((expires == null) ? \"\" : \"; expires=\"\n");
      out.write("\t\t\t\t\t\t+ expires.toGMTString())\n");
      out.write("\t\t\t\t+ ((path == null) ? \"\" : \"; path=\" + path)\n");
      out.write("\t\t\t\t+ ((domain == null) ? \"\" : \"; domain=\" + domain)\n");
      out.write("\t\t\t\t+ ((secure == null) ? \"\" : \"; secure\")\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction getCookie(name) {\n");
      out.write("\t\tvar arg = name + \"=\"\n");
      out.write("\t\tvar alen = arg.length\n");
      out.write("\t\tvar clen = document.cookie.length\n");
      out.write("\t\tvar i = 0\n");
      out.write("\t\twhile (i < clen) {\n");
      out.write("\t\t\tvar j = i + alen\n");
      out.write("\t\t\tif (document.cookie.substring(i, j) == arg) {\n");
      out.write("\t\t\t\treturn getCookieVal(j)\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ti = document.cookie.indexOf(\" \", i) + 1\n");
      out.write("\t\t\tif (i == 0)\n");
      out.write("\t\t\t\tbreak\n");
      out.write("\t\t}\n");
      out.write("\t\treturn null\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction getCookieVal(offset) {\n");
      out.write("\t\tvar endstr = document.cookie.indexOf(\";\", offset)\n");
      out.write("\t\tif (endstr == -1)\n");
      out.write("\t\t\tendstr = document.cookie.length\n");
      out.write("\t\treturn unescape(document.cookie.substring(offset, endstr))\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction deleteCookie(name, path, domain) {\n");
      out.write("\t\tdocument.cookie = name + \"=\" + ((path == null) ? \"\" : \"; path=\" + path)\n");
      out.write("\t\t\t\t+ ((domain == null) ? \"\" : \"; domain=\" + domain)\n");
      out.write("\t\t\t\t+ \"; expires=Thu, 01-Jan-00 00:00:01 GMT\"\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction saveScroll() { // added function\n");
      out.write("\t\tvar expdate = new Date()\n");
      out.write("\t\texpdate.setTime(expdate.getTime() + (expdays * 24 * 60 * 60 * 1000)); // expiry date\n");
      out.write("\n");
      out.write("\t\tvar x = (document.pageXOffset ? document.pageXOffset\n");
      out.write("\t\t\t\t: document.body.scrollLeft)\n");
      out.write("\t\tvar y = (document.pageYOffset ? document.pageYOffset\n");
      out.write("\t\t\t\t: document.body.scrollTop)\n");
      out.write("\t\tData = x + \"_\" + y\n");
      out.write("\t\tsetCookie(cookieName, Data, expdate)\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction loadScroll() { // added function\n");
      out.write("\t\tinf = getCookie(cookieName)\n");
      out.write("\t\tif (!inf) {\n");
      out.write("\t\t\treturn\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\t\tvar ar = inf.split(\"_\")\n");
      out.write("\t\tif (ar.length == 2) {\n");
      out.write("\t\t\twindow.scrollTo(parseInt(ar[0]), parseInt(ar[1]))\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>");
      out.write('\n');
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /home.jsp(25,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/home.jsp(25,3) '${titles}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${titles}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /home.jsp(25,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<div>\n");
          out.write("\t\t\t\t\t");
          if (_jspx_meth_c_005fchoose_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t\t<br>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /home.jsp(28,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ids[loop.index] == -1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<h5>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titles[loop.index]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</h5>\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /home.jsp(31,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ids[loop.index] != -1}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"movie\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ids[loop.index]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titles[loop.index]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /home.jsp(61,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titles == null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<script type=\"text/javascript\">\n");
        out.write("\t\t(function() {\n");
        out.write("\t\t\tvar getInfo = document.getElementById(\"grabItems\");\n");
        out.write("\t\t\tgetInfo.submit();\n");
        out.write("\t\t})();\n");
        out.write("\t</script>\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
