package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T62G */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17640 extends C10936 {

    /* JADX INFO: renamed from: ᩻ */
    public Object f52703;

    /* JADX INFO: renamed from: ᩳ */
    public int f52702 = 0;

    /* JADX INFO: renamed from: ܿ */
    public Object f52701 = null;

    /* JADX INFO: renamed from: ܳ */
    public int f52700 = 0;

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo40164(Object obj);

    /* JADX INFO: renamed from: ۜ */
    public abstract Object mo40165();

    @Override // p067l.C10936
    /* JADX INFO: renamed from: ܿ */
    public Object mo25206() {
        Object objM25207 = m25207(0);
        int i = this.f30310 + 1;
        this.f30310 = i;
        ArrayList arrayList = this.f30309;
        if (i == arrayList.size() && this.f52700 == 0) {
            this.f52703 = objM25207;
            this.f30310 = 0;
            arrayList.clear();
        }
        return objM25207;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40166() {
        m40167(1);
        mo25206();
        this.f52702++;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m40167(int i) {
        int i2 = this.f30310 + i;
        ArrayList arrayList = this.f30309;
        int size = ((i2 - 1) - arrayList.size()) + 1;
        if (size > 0) {
            for (int i3 = 1; i3 <= size; i3++) {
                Object objMo40165 = mo40165();
                if (mo40164(objMo40165)) {
                    this.f52701 = objMo40165;
                }
                arrayList.add(objMo40165);
            }
        }
    }

    @Override // p067l.C10936
    public final int size() {
        throw new UnsupportedOperationException("streams are of unknown size");
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m40168(int i) {
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.f30309;
        if (i >= 0) {
            m40167(i);
            return (this.f30310 + i) + (-1) > arrayList.size() ? this.f52701 : m25207(i - 1);
        }
        int i2 = this.f30310 - (-i);
        if (i2 == -1) {
            return this.f52703;
        }
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (i2 < -1) {
            throw new UnsupportedOperationException("can't look more than one token before the beginning of this stream's buffer");
        }
        throw new UnsupportedOperationException("can't look past the end of this stream's buffer using LB(int)");
    }

    public final int index() {
        return this.f52702;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m40170() {
        this.f52700++;
        return this.f30310;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m40169(int i) {
        this.f52700--;
        this.f52702 -= this.f30310 - i;
        this.f30310 = i;
    }
}
