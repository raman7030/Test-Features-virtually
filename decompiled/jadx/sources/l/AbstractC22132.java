package l;

/* JADX INFO: renamed from: l.᩹۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O62Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22132 extends AbstractC1349 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18729 f71826;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo7600(C18729 c18729);

    public AbstractC22132(C12918 c12918, int i) {
        this.f71826 = c12918.m31418().m11939(i);
    }

    @Override // l.AbstractC1349
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1890() {
        C18729 c18729 = this.f71826;
        Object objMo7600 = mo7600(c18729);
        if (objMo7600 == null) {
            c18729.getClass();
            c18729.m43359();
        }
        return objMo7600;
    }
}
