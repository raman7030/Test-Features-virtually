package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LY */
/* JADX INFO: loaded from: classes2.dex */
public final class C5718 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f17638;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17639;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f17640;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21946 f17641;

    public C5718(C12773 c12773) {
        this.f17640 = c12773.f38376;
        this.f17641 = c12773.f38377;
        this.f17638 = new ArrayList(c12773.f38374);
        ArrayList arrayList = new ArrayList(c12773.f38375.size() + 1);
        this.f17639 = arrayList;
        arrayList.addAll(c12773.f38375);
        arrayList.add(new C2896());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16156(AbstractC0197 abstractC0197, StringBuilder sb) {
        C11003.requireNonNull(abstractC0197, "node must not be null");
        C9952 c9952 = new C9952(this, new C11363(sb));
        c9952.m25078(abstractC0197);
        c9952.mo25076(abstractC0197);
        c9952.m25077(abstractC0197);
    }
}
