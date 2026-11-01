package p067l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q3ZI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13565 {

    /* JADX INFO: renamed from: ܽ */
    public static final C6468 f38157 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public C4848 f38158;

    /* JADX INFO: renamed from: ۧ */
    public LinkedHashMap f38159;

    /* JADX INFO: renamed from: ֫ */
    public static C13565 m30871(C5127 c5127) {
        C6468 c6468 = f38157;
        C13565 c13565 = (C13565) c5127.m10905(c6468);
        if (c13565 != null) {
            return c13565;
        }
        C13565 c13566 = new C13565();
        c13566.f38158 = C4848.m10283();
        c13566.f38159 = new LinkedHashMap();
        c5127.m10908(c6468, c13566);
        return c13566;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m30872(String str) {
        return (String) this.f38159.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m30873(EnumC2483 enumC2483) {
        return (String) this.f38159.get(enumC2483.f3990);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m30879(String str) {
        return this.f38159.get(str) != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m30880(EnumC2483 enumC2483) {
        return this.f38159.get(enumC2483.f3990) != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30877(EnumC2483 enumC2483, String str) {
        LinkedHashMap linkedHashMap = this.f38159;
        StringBuilder sb = new StringBuilder();
        sb.append(enumC2483.f3990);
        sb.append(str);
        return linkedHashMap.get(sb.toString()) != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m30883(String str) {
        return this.f38159.get(str) == null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m30884(EnumC2483 enumC2483) {
        return this.f38159.get(enumC2483.f3990) == null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m30881(EnumC2483 enumC2483, String str) {
        LinkedHashMap linkedHashMap = this.f38159;
        StringBuilder sb = new StringBuilder();
        sb.append(enumC2483.f3990);
        sb.append(str);
        return linkedHashMap.get(sb.toString()) == null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30876(String str, String str2) {
        this.f38159.put(str, str2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m30882(EnumC2483 enumC2483, String str) {
        this.f38159.put(enumC2483.f3990, str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m30885(String str) {
        this.f38159.remove(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Set m30874() {
        return this.f38159.keySet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30875(Runnable runnable) {
        C4848 c4848 = this.f38158;
        c4848.getClass();
        this.f38158 = new C4848(runnable, c4848);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30878() {
        Iterator it = this.f38158.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
