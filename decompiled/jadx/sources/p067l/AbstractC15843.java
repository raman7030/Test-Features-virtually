package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15843 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C11151 f45898;

    /* JADX INFO: renamed from: ۙ */
    public int f45899;

    /* JADX INFO: renamed from: ۬ */
    public C20539 f45900;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f45901;

    /* JADX INFO: renamed from: ᩸ */
    public int f45902;

    /* JADX INFO: renamed from: ᩹ */
    public int f45903 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7362(int i, Object obj);

    public AbstractC15843(C11151 c11151) {
        this.f45898 = c11151;
        this.f45899 = c11151.f30923;
        this.f45902 = c11151.f30926;
        this.f45901 = c11151.f30931;
    }

    public final boolean hasNext() {
        return this.f45902 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m35958() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f45902--;
        boolean z = this.f45901;
        C11151 c11151 = this.f45898;
        if (z) {
            this.f45901 = false;
            int i2 = c11151.f30923;
            this.f45903 = i2;
            return i2;
        }
        Object[] objArr = c11151.f30922;
        do {
            i = this.f45899 - 1;
            this.f45899 = i;
            if (i < 0) {
                this.f45903 = Integer.MIN_VALUE;
                Object obj = this.f45900.get((-i) - 1);
                int iM34881 = C15322.m34881(c11151.f30933.mo10800(obj));
                int i3 = c11151.f30928;
                while (true) {
                    int i4 = iM34881 & i3;
                    if (c11151.f30933.mo10801(obj, objArr[i4])) {
                        return i4;
                    }
                    iM34881 = i4 + 1;
                    i3 = c11151.f30928;
                }
            }
        } while (objArr[i] == null);
        this.f45903 = i;
        return i;
    }

    public void forEachRemaining(Consumer consumer) {
        int i;
        boolean z = this.f45901;
        C11151 c11151 = this.f45898;
        if (z) {
            this.f45901 = false;
            int i2 = c11151.f30923;
            this.f45903 = i2;
            mo7362(i2, consumer);
            this.f45902--;
        }
        Object[] objArr = c11151.f30922;
        while (this.f45902 != 0) {
            int i3 = this.f45899 - 1;
            this.f45899 = i3;
            if (i3 < 0) {
                this.f45903 = Integer.MIN_VALUE;
                Object obj = this.f45900.get((-i3) - 1);
                int iM34881 = C15322.m34881(c11151.f30933.mo10800(obj));
                int i4 = c11151.f30928;
                while (true) {
                    i = iM34881 & i4;
                    if (c11151.f30933.mo10801(obj, objArr[i])) {
                        break;
                    }
                    iM34881 = i + 1;
                    i4 = c11151.f30928;
                }
                mo7362(i, consumer);
                this.f45902--;
            } else if (objArr[i3] != null) {
                this.f45903 = i3;
                mo7362(i3, consumer);
                this.f45902--;
            }
        }
    }

    public void remove() {
        Object obj;
        int i = this.f45903;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C11151 c11151 = this.f45898;
        int i2 = c11151.f30923;
        if (i == i2) {
            c11151.f30931 = false;
            c11151.f30922[i2] = null;
            c11151.f30929[i2] = null;
        } else {
            int i3 = this.f45899;
            if (i3 >= 0) {
                Object[] objArr = c11151.f30922;
                Object[] objArr2 = c11151.f30929;
                loop0: while (true) {
                    int i4 = (i + 1) & c11151.f30928;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM34881 = C15322.m34881(c11151.f30933.mo10800(obj));
                            int i5 = c11151.f30928;
                            int i6 = iM34881 & i5;
                            if (i > i4) {
                                if (i >= i6 && i6 > i4) {
                                    break;
                                } else {
                                    i4 = (i4 + 1) & i5;
                                }
                            } else if (i >= i6 || i6 > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (i4 < i) {
                        if (this.f45900 == null) {
                            this.f45900 = new C20539(2);
                        }
                        this.f45900.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    objArr2[i] = objArr2[i4];
                    i = i4;
                }
                objArr[i] = null;
                objArr2[i] = null;
            } else {
                c11151.remove(this.f45900.set((-i3) - 1, null));
                this.f45903 = -1;
                return;
            }
        }
        c11151.f30926--;
        this.f45903 = -1;
    }
}
