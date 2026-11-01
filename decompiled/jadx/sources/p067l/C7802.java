package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LY */
/* JADX INFO: loaded from: classes2.dex */
public final class C7802 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f20483;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f20484;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f20485;

    /* JADX INFO: renamed from: ᩳ */
    public final C23225 f20486;

    public C7802(C14507 c14507) {
        this.f20485 = c14507.f41416;
        this.f20486 = c14507.f41417;
        this.f20483 = new ArrayList(c14507.f41414);
        ArrayList arrayList = new ArrayList(c14507.f41415.size() + 1);
        this.f20484 = arrayList;
        arrayList.addAll(c14507.f41415);
        arrayList.add(new C5120());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18075(AbstractC2555 abstractC2555, StringBuilder sb) {
        C12826.requireNonNull(abstractC2555, "node must not be null");
        C11826 c11826 = new C11826(this, new C13167(sb));
        c11826.m27095(abstractC2555);
        c11826.mo27093(abstractC2555);
        c11826.m27094(abstractC2555);
    }
}
