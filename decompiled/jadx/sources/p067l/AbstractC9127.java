package p067l;

/* JADX INFO: renamed from: l.۟֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K2J6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9127 {

    /* JADX INFO: renamed from: ֫ */
    public final String f24700;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo3368(Object obj);

    public AbstractC9127(String str) {
        this.f24700 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo21073(Object obj, Object obj2) {
        throw new UnsupportedOperationException(C10965.m25286(new StringBuilder("Property "), this.f24700, " is read-only"));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m21072() {
        return this.f24700;
    }
}
