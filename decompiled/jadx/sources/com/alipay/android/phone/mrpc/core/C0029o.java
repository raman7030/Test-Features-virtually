package com.alipay.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.o */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0029o extends AbstractC0035u {

    /* JADX INFO: renamed from: b */
    public String f125b;

    /* JADX INFO: renamed from: c */
    public byte[] f126c;

    /* JADX INFO: renamed from: g */
    public boolean f130g;

    /* JADX INFO: renamed from: e */
    public ArrayList f128e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public Map f129f = new HashMap();

    /* JADX INFO: renamed from: d */
    public String f127d = "application/x-www-form-urlencoded";

    public C0029o(String str) {
        this.f125b = str;
    }

    /* JADX INFO: renamed from: a */
    public String m214a() {
        return this.f125b;
    }

    /* JADX INFO: renamed from: a */
    public void m215a(String str) {
        this.f127d = str;
    }

    /* JADX INFO: renamed from: a */
    public void m216a(String str, String str2) {
        if (this.f129f == null) {
            this.f129f = new HashMap();
        }
        this.f129f.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m217a(Header header) {
        this.f128e.add(header);
    }

    /* JADX INFO: renamed from: a */
    public void m218a(boolean z) {
        this.f130g = z;
    }

    /* JADX INFO: renamed from: a */
    public void m219a(byte[] bArr) {
        this.f126c = bArr;
    }

    /* JADX INFO: renamed from: b */
    public String m220b(String str) {
        Map map = this.f129f;
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    /* JADX INFO: renamed from: b */
    public byte[] m221b() {
        return this.f126c;
    }

    /* JADX INFO: renamed from: c */
    public String m222c() {
        return this.f127d;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList m223d() {
        return this.f128e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m224e() {
        return this.f130g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0029o c0029o = (C0029o) obj;
        byte[] bArr = this.f126c;
        if (bArr == null) {
            if (c0029o.f126c != null) {
                return false;
            }
        } else if (!bArr.equals(c0029o.f126c)) {
            return false;
        }
        String str = this.f125b;
        String str2 = c0029o.f125b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Map map = this.f129f;
        int iHashCode = ((map == null || !map.containsKey("id")) ? 1 : ((String) this.f129f.get("id")).hashCode() + 31) * 31;
        String str = this.f125b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return String.format("Url : %s,HttpHeader: %s", m214a(), m223d());
    }
}
