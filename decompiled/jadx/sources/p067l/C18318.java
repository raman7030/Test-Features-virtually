package p067l;

import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܽܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 77LO */
/* JADX INFO: loaded from: classes4.dex */
public final class C18318 {

    /* JADX INFO: renamed from: ۧ */
    public static final C6468 f54726 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public HashMap f54727;

    /* JADX INFO: renamed from: ֫ */
    public static C18318 m41754(C5127 c5127) {
        C6468 c6468 = f54726;
        C18318 c18318 = (C18318) c5127.m10905(c6468);
        if (c18318 != null) {
            return c18318;
        }
        C18318 c18319 = new C18318();
        c18319.f54727 = new HashMap();
        c5127.m10908(c6468, c18319);
        return c18319;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4036 m41755(AbstractC21195 abstractC21195) {
        return (C4036) this.f54727.get(abstractC21195);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41757(AbstractC21195 abstractC21195, C4036 c4036) {
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4036 m41759(AbstractC21195 abstractC21195) {
        return (C4036) this.f54727.remove(abstractC21195);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Collection m41758() {
        return this.f54727.values();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41756() {
        this.f54727.clear();
    }
}
