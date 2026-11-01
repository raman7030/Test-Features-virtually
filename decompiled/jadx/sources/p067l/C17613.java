package p067l;

/* JADX INFO: renamed from: l.ܺܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G53U */
/* JADX INFO: loaded from: classes4.dex */
public final class C17613 {

    /* JADX INFO: renamed from: ֫ */
    public Object[] f52626 = new Object[40];

    /* JADX INFO: renamed from: ۧ */
    public int f52627 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final Object m40104() {
        return this.f52626[this.f52627];
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m40106() {
        Object[] objArr = this.f52626;
        int i = this.f52627;
        Object obj = objArr[i];
        this.f52627 = i - 1;
        objArr[i] = null;
        return obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40105(C13731 c13731) {
        int i = this.f52627 + 1;
        this.f52627 = i;
        Object[] objArr = this.f52626;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            this.f52626 = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        this.f52626[this.f52627] = c13731;
    }
}
