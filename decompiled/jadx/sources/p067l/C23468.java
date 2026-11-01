package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩹ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F7KC */
/* JADX INFO: loaded from: classes.dex */
public final class C23468 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f74733;

    /* JADX INFO: renamed from: ۧ */
    public final C16525 f74734;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C21457 f74735;

    /* JADX INFO: renamed from: ᩳ */
    public final Object[] f74736;

    public C23468(C21457 c21457, C16525 c16525, int[] iArr) {
        this.f74735 = c21457;
        this.f74733 = iArr;
        this.f74736 = new Object[iArr.length];
        this.f74734 = c16525;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m52193(int i) {
        int[] iArr = this.f74733;
        if (i <= 0 || i >= iArr.length) {
            C21457 c21457 = this.f74735;
            throw c21457.f67676.m48431("bad.const.pool.index", c21457.f67676.f67397, Integer.valueOf(i), Integer.valueOf(iArr.length));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m52194(int i) {
        m52193(i);
        return this.f74733[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m52195(BitSet bitSet, int i) {
        m52193(i);
        Object[] objArr = this.f74736;
        Object obj = objArr[i];
        if (obj != null) {
            return obj;
        }
        boolean z = bitSet.get(m52196(i));
        C21457 c21457 = this.f74735;
        if (!z) {
            throw c21457.f67676.m48431("unexpected.const.pool.tag.at", Integer.valueOf(m52196(i)), Integer.valueOf(m52194(i)));
        }
        Object objM48592 = C21457.m48592(c21457, this.f74734, m52196(i), m52194(i));
        objArr[i] = objM48592;
        return objM48592;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m52196(int i) {
        return this.f74734.f48563[m52194(i) - 1];
    }
}
