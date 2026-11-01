package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import p067l.C19768;

/* JADX INFO: renamed from: org.json.alipay.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C2394a {

    /* JADX INFO: renamed from: a */
    public ArrayList f81803a;

    public C2394a() {
        this.f81803a = new ArrayList();
    }

    public C2394a(Object obj) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            m55442a(Array.get(obj, i));
        }
    }

    public C2394a(String str) {
        this(new C2396c(str));
    }

    public C2394a(Collection collection) {
        this.f81803a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public C2394a(C2396c c2396c) throws JSONException {
        char c;
        ArrayList arrayList;
        Object objM55460d;
        this();
        char cM55459c = c2396c.m55459c();
        if (cM55459c == '[') {
            c = ']';
        } else {
            if (cM55459c != '(') {
                throw c2396c.m55456a("A JSONArray text must start with '['");
            }
            c = ')';
        }
        if (c2396c.m55459c() == ']') {
            return;
        }
        do {
            c2396c.m55457a();
            char cM55459c2 = c2396c.m55459c();
            c2396c.m55457a();
            if (cM55459c2 == ',') {
                arrayList = this.f81803a;
                objM55460d = null;
            } else {
                arrayList = this.f81803a;
                objM55460d = c2396c.m55460d();
            }
            arrayList.add(objM55460d);
            char cM55459c3 = c2396c.m55459c();
            if (cM55459c3 != ')') {
                if (cM55459c3 != ',' && cM55459c3 != ';') {
                    if (cM55459c3 != ']') {
                        throw c2396c.m55456a("Expected a ',' or ']'");
                    }
                }
            }
            if (c == cM55459c3) {
                return;
            }
            throw c2396c.m55456a("Expected a '" + new Character(c) + "'");
        } while (c2396c.m55459c() != ']');
    }

    /* JADX INFO: renamed from: a */
    public int m55439a() {
        return this.f81803a.size();
    }

    /* JADX INFO: renamed from: a */
    public Object m55440a(int i) throws JSONException {
        Object objM55443b = m55443b(i);
        if (objM55443b != null) {
            return objM55443b;
        }
        throw new JSONException(C19768.m44906(i, "JSONArray[", "] not found."));
    }

    /* JADX INFO: renamed from: a */
    public String m55441a(String str) {
        int iM55439a = m55439a();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iM55439a; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(C2395b.m55446b(this.f81803a.get(i)));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public C2394a m55442a(Object obj) {
        this.f81803a.add(obj);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Object m55443b(int i) {
        if (i < 0 || i >= m55439a()) {
            return null;
        }
        return this.f81803a.get(i);
    }

    public String toString() {
        try {
            return "[" + m55441a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }
}
