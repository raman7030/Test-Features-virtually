package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܶ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16833 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public final C15530 f49830;

    /* JADX INFO: renamed from: ᩳ */
    public void mo37081() {
    }

    @Override // p067l.C15854
    /* JADX INFO: renamed from: ۧ */
    public final void mo12739(AbstractC7257 abstractC7257) {
        if (abstractC7257 != null) {
            if (this.f49830.test(abstractC7257)) {
                abstractC7257.mo3382(this);
            } else {
                mo37081();
            }
        }
    }

    public AbstractC16833(EnumSet enumSet) {
        this.f49830 = new C15530(1, enumSet);
    }
}
