package org.json.alipay;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p067l.C1514;
import p067l.C17073;

/* JADX INFO: renamed from: org.json.alipay.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C2395b {

    /* JADX INFO: renamed from: a */
    public static final Object f81804a = new a();

    /* JADX INFO: renamed from: b */
    public Map f81805b;

    /* JADX INFO: renamed from: org.json.alipay.b$a */
    /* JADX INFO: compiled from: N673 */
    public final class a {
        public a() {
        }

        public final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public String toString() {
            return "null";
        }
    }

    public C2395b() {
        this.f81805b = new HashMap();
    }

    public C2395b(String str) {
        this(new C2396c(str));
    }

    public C2395b(Map map) {
        this.f81805b = map == null ? new HashMap() : map;
    }

    public C2395b(C2396c c2396c) throws JSONException {
        this();
        if (c2396c.m55459c() != '{') {
            throw c2396c.m55456a("A JSONObject text must begin with '{'");
        }
        while (true) {
            char cM55459c = c2396c.m55459c();
            if (cM55459c == 0) {
                throw c2396c.m55456a("A JSONObject text must end with '}'");
            }
            if (cM55459c == '}') {
                return;
            }
            c2396c.m55457a();
            String string = c2396c.m55460d().toString();
            char cM55459c2 = c2396c.m55459c();
            if (cM55459c2 == '=') {
                if (c2396c.m55458b() != '>') {
                    c2396c.m55457a();
                }
            } else if (cM55459c2 != ':') {
                throw c2396c.m55456a("Expected a ':' after a key");
            }
            m55450a(string, c2396c.m55460d());
            char cM55459c3 = c2396c.m55459c();
            if (cM55459c3 != ',' && cM55459c3 != ';') {
                if (cM55459c3 != '}') {
                    throw c2396c.m55456a("Expected a ',' or '}'");
                }
                return;
            } else if (c2396c.m55459c() == '}') {
                return;
            } else {
                c2396c.m55457a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m55444a(Number number) throws JSONException {
        if (number == null) {
            throw new JSONException("Null pointer");
        }
        m55445a((Object) number);
        String string = number.toString();
        if (string.indexOf(46) <= 0 || string.indexOf(101) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith("0")) {
            string = C17073.m38720(1, 0, string);
        }
        return string.endsWith(".") ? C17073.m38720(1, 0, string) : string;
    }

    /* JADX INFO: renamed from: a */
    public static void m55445a(Object obj) throws JSONException {
        if (obj != null) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (d.isInfinite() || d.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
                return;
            }
            if (obj instanceof Float) {
                Float f = (Float) obj;
                if (f.isInfinite() || f.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m55446b(Object obj) {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (obj instanceof Number) {
            return m55444a((Number) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof C2395b) || (obj instanceof C2394a)) {
            return obj.toString();
        }
        if (obj instanceof Map) {
            return new C2395b((Map) obj).toString();
        }
        if (obj instanceof Collection) {
            return new C2394a((Collection) obj).toString();
        }
        return obj.getClass().isArray() ? new C2394a(obj).toString() : m55447d(obj.toString());
    }

    /* JADX INFO: renamed from: a */
    public Object m55448a(String str) throws JSONException {
        Object objM55452c = m55452c(str);
        if (objM55452c != null) {
            return objM55452c;
        }
        throw new JSONException("JSONObject[" + m55447d(str) + "] not found.");
    }

    /* JADX INFO: renamed from: a */
    public Iterator m55449a() {
        return this.f81805b.keySet().iterator();
    }

    /* JADX INFO: renamed from: a */
    public C2395b m55450a(String str, Object obj) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        if (obj == null) {
            m55453e(str);
            return this;
        }
        m55445a(obj);
        this.f81805b.put(str, obj);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m55451b(String str) {
        return this.f81805b.containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public Object m55452c(String str) {
        if (str == null) {
            return null;
        }
        return this.f81805b.get(str);
    }

    /* JADX INFO: renamed from: e */
    public Object m55453e(String str) {
        return this.f81805b.remove(str);
    }

    public String toString() {
        try {
            Iterator itM55449a = m55449a();
            StringBuffer stringBuffer = new StringBuffer("{");
            while (itM55449a.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(',');
                }
                Object next = itM55449a.next();
                stringBuffer.append(m55447d(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(m55446b(this.f81805b.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0034. Please report as an issue. */
    /* JADX INFO: renamed from: d */
    public static String m55447d(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append('\"');
        int i = 0;
        char c = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"') {
                    stringBuffer.append('\\');
                } else if (cCharAt != '/') {
                    if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                str2 = "\\b";
                                break;
                            case '\t':
                                str2 = "\\t";
                                break;
                            case '\n':
                                str2 = "\\n";
                                break;
                            default:
                                if (cCharAt < ' ' || ((cCharAt >= 128 && cCharAt < 160) || (cCharAt >= 8192 && cCharAt < 8448))) {
                                    String strM34687 = C1514.m34687(new StringBuilder("000"), cCharAt);
                                    str2 = "\\u" + strM34687.substring(strM34687.length() - 4);
                                }
                                break;
                        }
                        i++;
                        c = cCharAt;
                    } else {
                        stringBuffer.append('\\');
                    }
                } else if (c == '<') {
                    stringBuffer.append('\\');
                }
                stringBuffer.append(cCharAt);
                i++;
                c = cCharAt;
            } else {
                str2 = "\\r";
            }
            stringBuffer.append(str2);
            i++;
            c = cCharAt;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }
}
