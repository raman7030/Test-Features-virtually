package com.alipay.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class o extends u {
    public String b;
    public byte[] c;
    public boolean g;
    public ArrayList e = new ArrayList();
    public Map f = new HashMap();
    public String d = "application/x-www-form-urlencoded";

    public o(String str) {
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(String str, String str2) {
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(str, str2);
    }

    public void a(Header header) {
        this.e.add(header);
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void a(byte[] bArr) {
        this.c = bArr;
    }

    public String b(String str) {
        Map map = this.f;
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    public byte[] b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public ArrayList d() {
        return this.e;
    }

    public boolean e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        byte[] bArr = this.c;
        if (bArr == null) {
            if (oVar.c != null) {
                return false;
            }
        } else if (!bArr.equals(oVar.c)) {
            return false;
        }
        String str = this.b;
        String str2 = oVar.b;
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
        Map map = this.f;
        int iHashCode = ((map == null || !map.containsKey("id")) ? 1 : ((String) this.f.get("id")).hashCode() + 31) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return String.format("Url : %s,HttpHeader: %s", a(), d());
    }
}
