package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.proto.C0824a;
import com.umeng.commonsdk.statistics.proto.C0825b;
import com.umeng.commonsdk.statistics.proto.C0826c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.a */
/* JADX INFO: compiled from: L4JT */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0802a {

    /* JADX INFO: renamed from: a */
    public final int f3407a = 10;

    /* JADX INFO: renamed from: b */
    public final int f3408b = 100;

    /* JADX INFO: renamed from: c */
    public final String f3409c;

    /* JADX INFO: renamed from: d */
    public List f3410d;

    /* JADX INFO: renamed from: e */
    public C0825b f3411e;

    /* JADX INFO: renamed from: f */
    public abstract String mo3066f();

    public AbstractC0802a(String str) {
        this.f3409c = str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3061a() {
        return m3056g();
    }

    /* JADX INFO: renamed from: b */
    public String m3062b() {
        return this.f3409c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3063c() {
        C0825b c0825b = this.f3411e;
        return c0825b == null || c0825b.m3175h() <= 100;
    }

    /* JADX INFO: renamed from: g */
    private boolean m3056g() {
        C0825b c0825b = this.f3411e;
        String strM3167b = c0825b == null ? null : c0825b.m3167b();
        int iM3175h = c0825b == null ? 0 : c0825b.m3175h();
        String strM3057a = m3057a(mo3066f());
        if (strM3057a == null || strM3057a.equals(strM3167b)) {
            return false;
        }
        if (c0825b == null) {
            c0825b = new C0825b();
        }
        c0825b.m3164a(strM3057a);
        c0825b.m3163a(System.currentTimeMillis());
        c0825b.m3162a(iM3175h + 1);
        C0824a c0824a = new C0824a();
        c0824a.m3126a(this.f3409c);
        c0824a.m3131c(strM3057a);
        c0824a.m3128b(strM3167b);
        c0824a.m3125a(c0825b.m3172e());
        if (this.f3410d == null) {
            this.f3410d = new ArrayList(2);
        }
        this.f3410d.add(c0824a);
        if (this.f3410d.size() > 10) {
            this.f3410d.remove(0);
        }
        this.f3411e = c0825b;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public C0825b m3064d() {
        return this.f3411e;
    }

    /* JADX INFO: renamed from: a */
    public void m3058a(C0825b c0825b) {
        this.f3411e = c0825b;
    }

    /* JADX INFO: renamed from: e */
    public List m3065e() {
        return this.f3410d;
    }

    /* JADX INFO: renamed from: a */
    public void m3060a(List list) {
        this.f3410d = list;
    }

    /* JADX INFO: renamed from: a */
    public String m3057a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0 || "0".equals(strTrim) || "unknown".equals(strTrim.toLowerCase(Locale.US))) {
            return null;
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: a */
    public void m3059a(C0826c c0826c) {
        this.f3411e = (C0825b) c0826c.m3204c().get(this.f3409c);
        List<C0824a> listM3210h = c0826c.m3210h();
        if (listM3210h == null || listM3210h.size() <= 0) {
            return;
        }
        if (this.f3410d == null) {
            this.f3410d = new ArrayList();
        }
        for (C0824a c0824a : listM3210h) {
            if (this.f3409c.equals(c0824a.f3473a)) {
                this.f3410d.add(c0824a);
            }
        }
    }
}
