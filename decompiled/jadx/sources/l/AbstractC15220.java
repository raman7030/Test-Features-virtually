package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܶ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15220 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13849 f46706;

    /* JADX INFO: renamed from: ᩳ */
    public void mo34934() {
    }

    @Override // l.C14190
    /* JADX INFO: renamed from: ۧ */
    public final void mo10758(AbstractC5144 abstractC5144) {
        if (abstractC5144 != null) {
            if (this.f46706.test(abstractC5144)) {
                abstractC5144.mo988(this);
            } else {
                mo34934();
            }
        }
    }

    public AbstractC15220(EnumSet enumSet) {
        this.f46706 = new C13849(1, enumSet);
    }
}
