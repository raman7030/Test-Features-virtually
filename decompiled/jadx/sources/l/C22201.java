package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩹ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F7KC */
/* JADX INFO: loaded from: classes.dex */
public final class C22201 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f72012;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14896 f72013;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20085 f72014;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object[] f72015;

    public C22201(C20085 c20085, C14896 c14896, int[] iArr) {
        this.f72014 = c20085;
        this.f72012 = iArr;
        this.f72015 = new Object[iArr.length];
        this.f72013 = c14896;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m49866(int i) {
        int[] iArr = this.f72012;
        if (i <= 0 || i >= iArr.length) {
            C20085 c20085 = this.f72014;
            throw c20085.f65036.m46116("bad.const.pool.index", c20085.f65036.f64755, Integer.valueOf(i), Integer.valueOf(iArr.length));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m49867(int i) {
        m49866(i);
        return this.f72012[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m49868(BitSet bitSet, int i) {
        m49866(i);
        Object[] objArr = this.f72015;
        Object obj = objArr[i];
        if (obj != null) {
            return obj;
        }
        boolean z = bitSet.get(m49869(i));
        C20085 c20085 = this.f72014;
        if (!z) {
            throw c20085.f65036.m46116("unexpected.const.pool.tag.at", Integer.valueOf(m49869(i)), Integer.valueOf(m49867(i)));
        }
        Object objM46276 = C20085.m46276(c20085, this.f72013, m49869(i), m49867(i));
        objArr[i] = objM46276;
        return objM46276;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m49869(int i) {
        return this.f72013.f45448[m49867(i) - 1];
    }
}
