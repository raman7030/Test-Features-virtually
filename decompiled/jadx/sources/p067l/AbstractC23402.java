package p067l;

/* JADX INFO: renamed from: l.᩹۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O62Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23402 extends AbstractC3651 {

    /* JADX INFO: renamed from: ᩶ */
    public final C20168 f74548;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo9671(C20168 c20168);

    public AbstractC23402(C14645 c14645, int i) {
        this.f74548 = c14645.m33504().m13859(i);
    }

    @Override // p067l.AbstractC3651
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4282() {
        C20168 c20168 = this.f74548;
        Object objMo9671 = mo9671(c20168);
        if (objMo9671 == null) {
            c20168.getClass();
            c20168.m45626();
        }
        return objMo9671;
    }
}
