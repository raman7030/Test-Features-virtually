package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12003 extends AbstractC10147 {

    /* JADX INFO: renamed from: ᩶ */
    public final int f33469;

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f33470;

    /* JADX INFO: renamed from: ᩹ */
    public final int f33471;

    public C12003(C14645 c14645, C20168 c20168) {
        this.f33470 = c14645;
        int iM45635 = c20168.m45635();
        this.f33471 = iM45635;
        this.f33469 = c20168.m45631();
        for (int i = 0; i < iM45635; i++) {
            AbstractC12342.m28424(c20168);
        }
    }

    @Override // p067l.InterfaceC21650
    public final List getValue() {
        return new C14014(this, this.f33470, this.f33469, this.f33471);
    }
}
