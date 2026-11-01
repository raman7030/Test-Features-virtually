package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;

/* JADX INFO: renamed from: l.۬᩵ */
/* JADX INFO: compiled from: 85M9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1502 implements Cloneable {

    /* JADX INFO: renamed from: ۗ */
    public static final Object f42906 = new Object();

    /* JADX INFO: renamed from: ۙ */
    public Object[] f42907;

    /* JADX INFO: renamed from: ᩶ */
    public int f42908;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f42909;

    /* JADX INFO: renamed from: ᩹ */
    public int[] f42910;

    public C1502() {
        this(10);
    }

    public C1502(int i) {
        this.f42909 = false;
        if (i != 0) {
            int i2 = i * 4;
            for (int i3 = 4; i3 < 32; i3++) {
                int i4 = (1 << i3) - 12;
                if (i2 <= i4) {
                    i2 = i4;
                    break;
                }
            }
            int i5 = i2 / 4;
            this.f42910 = new int[i5];
            this.f42907 = new Object[i5];
            return;
        }
        this.f42910 = C0872.f5138;
        this.f42907 = C0872.f5139;
    }

    public final C1502 clone() {
        try {
            C1502 c1502 = (C1502) super.clone();
            c1502.f42910 = (int[]) this.f42910.clone();
            c1502.f42907 = (Object[]) this.f42907.clone();
            return c1502;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m34385(int i, Integer num) {
        Object obj;
        int iM4842 = C0872.m4842(this.f42908, i, this.f42910);
        return (iM4842 < 0 || (obj = this.f42907[iM4842]) == f42906) ? num : obj;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m34389(int i) {
        int iM4842 = C0872.m4842(this.f42908, i, this.f42910);
        if (iM4842 >= 0) {
            Object[] objArr = this.f42907;
            Object obj = objArr[iM4842];
            Object obj2 = f42906;
            if (obj != obj2) {
                objArr[iM4842] = obj2;
                this.f42909 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m34382() {
        int i = this.f42908;
        int[] iArr = this.f42910;
        Object[] objArr = this.f42907;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f42906) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f42909 = false;
        this.f42908 = i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m34390(int i, Object obj) {
        int iM4842 = C0872.m4842(this.f42908, i, this.f42910);
        if (iM4842 >= 0) {
            this.f42907[iM4842] = obj;
            return;
        }
        int i2 = ~iM4842;
        int i3 = this.f42908;
        if (i2 < i3) {
            Object[] objArr = this.f42907;
            if (objArr[i2] == f42906) {
                this.f42910[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f42909 && i3 >= this.f42910.length) {
            m34382();
            i2 = ~C0872.m4842(this.f42908, i, this.f42910);
        }
        int i4 = this.f42908;
        if (i4 >= this.f42910.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f42910;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f42907;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f42910 = iArr;
            this.f42907 = objArr2;
        }
        int i9 = this.f42908 - i2;
        if (i9 != 0) {
            int[] iArr3 = this.f42910;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.f42907;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f42908 - i2);
        }
        this.f42910[i2] = i;
        this.f42907[i2] = obj;
        this.f42908++;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m34388() {
        if (this.f42909) {
            m34382();
        }
        return this.f42908;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34383(int i) {
        if (this.f42909) {
            m34382();
        }
        return this.f42910[i];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Object m34391(int i) {
        if (this.f42909) {
            m34382();
        }
        return this.f42907[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34384(C1555 c1555) {
        if (this.f42909) {
            m34382();
        }
        for (int i = 0; i < this.f42908; i++) {
            if (this.f42907[i] == c1555) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34386() {
        int i = this.f42908;
        Object[] objArr = this.f42907;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f42908 = 0;
        this.f42909 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34387(int i, Object obj) {
        int i2 = this.f42908;
        if (i2 != 0 && i <= this.f42910[i2 - 1]) {
            m34390(i, obj);
            return;
        }
        if (this.f42909 && i2 >= this.f42910.length) {
            m34382();
        }
        int i3 = this.f42908;
        if (i3 >= this.f42910.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.f42910;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f42907;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f42910 = iArr;
            this.f42907 = objArr;
        }
        this.f42910[i3] = i;
        this.f42907[i3] = obj;
        this.f42908 = i3 + 1;
    }

    public final String toString() {
        if (m34388() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f42908 * 28);
        sb.append('{');
        for (int i = 0; i < this.f42908; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m34383(i));
            sb.append(C0184a.f880h);
            Object objM34391 = m34391(i);
            if (objM34391 != this) {
                sb.append(objM34391);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
