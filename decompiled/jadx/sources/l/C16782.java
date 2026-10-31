package l;

import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 77LO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16782 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C4314 f51544 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f51545;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16782 m39518(C2903 c2903) {
        C4314 c4314 = f51544;
        C16782 c16782 = (C16782) c2903.m8838(c4314);
        if (c16782 != null) {
            return c16782;
        }
        C16782 c16783 = new C16782();
        c16783.f51545 = new HashMap();
        c2903.m8841(c4314, c16783);
        return c16783;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1755 m39519(AbstractC19810 abstractC19810) {
        return (C1755) this.f51545.get(abstractC19810);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39521(AbstractC19810 abstractC19810, C1755 c1755) {
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1755 m39523(AbstractC19810 abstractC19810) {
        return (C1755) this.f51545.remove(abstractC19810);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Collection m39522() {
        return this.f51545.values();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39520() {
        this.f51545.clear();
    }
}
