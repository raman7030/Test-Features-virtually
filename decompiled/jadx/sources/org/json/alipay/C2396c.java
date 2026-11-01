package org.json.alipay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import p067l.C7470;

/* JADX INFO: renamed from: org.json.alipay.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C2396c {

    /* JADX INFO: renamed from: a */
    public int f81806a;

    /* JADX INFO: renamed from: b */
    public Reader f81807b;

    /* JADX INFO: renamed from: c */
    public char f81808c;

    /* JADX INFO: renamed from: d */
    public boolean f81809d;

    public C2396c(Reader reader) {
        this.f81807b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.f81809d = false;
        this.f81806a = 0;
    }

    public C2396c(String str) {
        this(new StringReader(str));
    }

    /* JADX INFO: renamed from: a */
    public String m55454a(char c) throws JSONException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            char cM55458b = m55458b();
            if (cM55458b == 0 || cM55458b == '\n' || cM55458b == '\r') {
                break;
            }
            if (cM55458b == '\\') {
                cM55458b = m55458b();
                if (cM55458b == 'b') {
                    cM55458b = '\b';
                } else if (cM55458b == 'f') {
                    cM55458b = '\f';
                } else if (cM55458b == 'n') {
                    stringBuffer.append('\n');
                } else if (cM55458b != 'r') {
                    if (cM55458b != 'x') {
                        if (cM55458b != 't') {
                            i = cM55458b == 'u' ? 4 : 2;
                        } else {
                            cM55458b = '\t';
                        }
                    }
                    cM55458b = (char) Integer.parseInt(m55455a(i), 16);
                } else {
                    stringBuffer.append('\r');
                }
            } else if (cM55458b == c) {
                return stringBuffer.toString();
            }
            stringBuffer.append(cM55458b);
        }
        throw m55456a("Unterminated string");
    }

    /* JADX INFO: renamed from: a */
    public String m55455a(int i) throws JSONException {
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        int i2 = 0;
        if (this.f81809d) {
            this.f81809d = false;
            cArr[0] = this.f81808c;
            i2 = 1;
        }
        while (i2 < i) {
            try {
                int i3 = this.f81807b.read(cArr, i2, i - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            } catch (IOException e) {
                throw new JSONException(e);
            }
        }
        this.f81806a += i2;
        if (i2 < i) {
            throw m55456a("Substring bounds error");
        }
        this.f81808c = cArr[i - 1];
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    public JSONException m55456a(String str) {
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(toString());
        return new JSONException(sbM17248.toString());
    }

    /* JADX INFO: renamed from: a */
    public void m55457a() {
        int i;
        if (this.f81809d || (i = this.f81806a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.f81806a = i - 1;
        this.f81809d = true;
    }

    /* JADX INFO: renamed from: b */
    public char m55458b() throws JSONException {
        if (this.f81809d) {
            this.f81809d = false;
            char c = this.f81808c;
            if (c != 0) {
                this.f81806a++;
            }
            return c;
        }
        try {
            int i = this.f81807b.read();
            if (i <= 0) {
                this.f81808c = (char) 0;
                return (char) 0;
            }
            this.f81806a++;
            char c2 = (char) i;
            this.f81808c = c2;
            return c2;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public char m55459c() {
        char cM55458b;
        char cM55458b2;
        while (true) {
            char cM55458b3 = m55458b();
            if (cM55458b3 == '/') {
                char cM55458b4 = m55458b();
                if (cM55458b4 == '*') {
                    while (true) {
                        char cM55458b5 = m55458b();
                        if (cM55458b5 == 0) {
                            throw m55456a("Unclosed comment");
                        }
                        if (cM55458b5 == '*') {
                            if (m55458b() == '/') {
                                break;
                            }
                            m55457a();
                        }
                    }
                } else {
                    if (cM55458b4 != '/') {
                        m55457a();
                        return '/';
                    }
                    do {
                        cM55458b = m55458b();
                        if (cM55458b == '\n' || cM55458b == '\r') {
                            break;
                        }
                    } while (cM55458b != 0);
                }
            } else if (cM55458b3 == '#') {
                do {
                    cM55458b2 = m55458b();
                    if (cM55458b2 == '\n' || cM55458b2 == '\r') {
                        break;
                    }
                } while (cM55458b2 != 0);
            } else if (cM55458b3 == 0 || cM55458b3 > ' ') {
                return cM55458b3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public Object m55460d() {
        char cM55459c = m55459c();
        if (cM55459c != '\"') {
            if (cM55459c != '[') {
                if (cM55459c == '{') {
                    m55457a();
                    return new C2395b(this);
                }
                if (cM55459c != '\'') {
                    if (cM55459c != '(') {
                        StringBuffer stringBuffer = new StringBuffer();
                        char cM55458b = cM55459c;
                        while (cM55458b >= ' ' && ",:]}/\\\"[{;=#".indexOf(cM55458b) < 0) {
                            stringBuffer.append(cM55458b);
                            cM55458b = m55458b();
                        }
                        m55457a();
                        String strTrim = stringBuffer.toString().trim();
                        if (strTrim.equals("")) {
                            throw m55456a("Missing value");
                        }
                        if (strTrim.equalsIgnoreCase("true")) {
                            return Boolean.TRUE;
                        }
                        if (strTrim.equalsIgnoreCase("false")) {
                            return Boolean.FALSE;
                        }
                        if (strTrim.equalsIgnoreCase("null")) {
                            return C2395b.f81804a;
                        }
                        if ((cM55459c >= '0' && cM55459c <= '9') || cM55459c == '.' || cM55459c == '-' || cM55459c == '+') {
                            if (cM55459c == '0') {
                                try {
                                    return (strTrim.length() <= 2 || !(strTrim.charAt(1) == 'x' || strTrim.charAt(1) == 'X')) ? new Integer(Integer.parseInt(strTrim, 8)) : new Integer(Integer.parseInt(strTrim.substring(2), 16));
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                try {
                                    try {
                                        return new Integer(strTrim);
                                    } catch (Exception unused2) {
                                        return new Double(strTrim);
                                    }
                                } catch (Exception unused3) {
                                    return new Long(strTrim);
                                }
                            } catch (Exception unused4) {
                            }
                        }
                        return strTrim;
                    }
                }
            }
            m55457a();
            return new C2394a(this);
        }
        return m55454a(cM55459c);
    }

    public String toString() {
        return " at character " + this.f81806a;
    }
}
