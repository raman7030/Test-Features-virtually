package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14178 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9241 f42811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42812;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C19119 f42813;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f42814;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f42815;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f42816 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5120(int i, Object obj);

    public AbstractC14178(C9241 c9241) {
        this.f42811 = c9241;
        this.f42812 = c9241.f27977;
        this.f42815 = c9241.f27980;
        this.f42814 = c9241.f27985;
    }

    public final boolean hasNext() {
        return this.f42815 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33826() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f42815--;
        boolean z = this.f42814;
        C9241 c9241 = this.f42811;
        if (z) {
            this.f42814 = false;
            int i2 = c9241.f27977;
            this.f42816 = i2;
            return i2;
        }
        Object[] objArr = c9241.f27976;
        do {
            i = this.f42812 - 1;
            this.f42812 = i;
            if (i < 0) {
                this.f42816 = Integer.MIN_VALUE;
                Object obj = this.f42813.get((-i) - 1);
                int iM32766 = C13630.m32766(c9241.f27987.mo8733(obj));
                int i3 = c9241.f27982;
                while (true) {
                    int i4 = iM32766 & i3;
                    if (c9241.f27987.mo8734(obj, objArr[i4])) {
                        return i4;
                    }
                    iM32766 = i4 + 1;
                    i3 = c9241.f27982;
                }
            }
        } while (objArr[i] == null);
        this.f42816 = i;
        return i;
    }

    public void forEachRemaining(Consumer consumer) {
        int i;
        boolean z = this.f42814;
        C9241 c9241 = this.f42811;
        if (z) {
            this.f42814 = false;
            int i2 = c9241.f27977;
            this.f42816 = i2;
            mo5120(i2, consumer);
            this.f42815--;
        }
        Object[] objArr = c9241.f27976;
        while (this.f42815 != 0) {
            int i3 = this.f42812 - 1;
            this.f42812 = i3;
            if (i3 < 0) {
                this.f42816 = Integer.MIN_VALUE;
                Object obj = this.f42813.get((-i3) - 1);
                int iM32766 = C13630.m32766(c9241.f27987.mo8733(obj));
                int i4 = c9241.f27982;
                while (true) {
                    i = iM32766 & i4;
                    if (c9241.f27987.mo8734(obj, objArr[i])) {
                        break;
                    }
                    iM32766 = i + 1;
                    i4 = c9241.f27982;
                }
                mo5120(i, consumer);
                this.f42815--;
            } else if (objArr[i3] != null) {
                this.f42816 = i3;
                mo5120(i3, consumer);
                this.f42815--;
            }
        }
    }

    public void remove() {
        Object obj;
        int i = this.f42816;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C9241 c9241 = this.f42811;
        int i2 = c9241.f27977;
        if (i == i2) {
            c9241.f27985 = false;
            c9241.f27976[i2] = null;
            c9241.f27983[i2] = null;
        } else {
            int i3 = this.f42812;
            if (i3 >= 0) {
                Object[] objArr = c9241.f27976;
                Object[] objArr2 = c9241.f27983;
                loop0: while (true) {
                    int i4 = (i + 1) & c9241.f27982;
                    while (true) {
                        obj = objArr[i4];
                        if (obj != null) {
                            int iM32766 = C13630.m32766(c9241.f27987.mo8733(obj));
                            int i5 = c9241.f27982;
                            int i6 = iM32766 & i5;
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
                        if (this.f42813 == null) {
                            this.f42813 = new C19119(2);
                        }
                        this.f42813.add(objArr[i4]);
                    }
                    objArr[i] = obj;
                    objArr2[i] = objArr2[i4];
                    i = i4;
                }
                objArr[i] = null;
                objArr2[i] = null;
            } else {
                c9241.remove(this.f42813.set((-i3) - 1, null));
                this.f42816 = -1;
                return;
            }
        }
        c9241.f27980--;
        this.f42816 = -1;
    }
}
