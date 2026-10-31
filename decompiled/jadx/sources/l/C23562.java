package l;

/* JADX INFO: renamed from: l.᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23562 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] f75637 = new Object[256];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f75638;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m52026() {
        int i = this.f75638;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f75637;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f75638 = i - 1;
        return obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52028(C10863 c10863) {
        int i = this.f75638;
        Object[] objArr = this.f75637;
        if (i < objArr.length) {
            objArr[i] = c10863;
            this.f75638 = i + 1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52027(int i, Object[] objArr) {
        if (i > objArr.length) {
            i = objArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            int i3 = this.f75638;
            Object[] objArr2 = this.f75637;
            if (i3 < objArr2.length) {
                objArr2[i3] = obj;
                this.f75638 = i3 + 1;
            }
        }
    }
}
