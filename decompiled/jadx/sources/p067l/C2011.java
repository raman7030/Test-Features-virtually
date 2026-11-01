package p067l;

/* JADX INFO: renamed from: l.᩻۠ */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2011 {

    /* JADX INFO: renamed from: ֫ */
    public final Object[] f78383 = new Object[256];

    /* JADX INFO: renamed from: ۧ */
    public int f78384;

    /* JADX INFO: renamed from: ֫ */
    public final Object m54428() {
        int i = this.f78384;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f78383;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f78384 = i - 1;
        return obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54430(C1381 c1381) {
        int i = this.f78384;
        Object[] objArr = this.f78383;
        if (i < objArr.length) {
            objArr[i] = c1381;
            this.f78384 = i + 1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54429(int i, Object[] objArr) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f78384;
            Object[] objArr2 = this.f78383;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f78384 = i3 + 1;
            }
        }
    }
}
