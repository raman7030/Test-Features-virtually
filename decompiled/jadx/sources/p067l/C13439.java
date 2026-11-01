package p067l;

/* JADX INFO: renamed from: l.ۨۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWG */
/* JADX INFO: loaded from: classes3.dex */
public final class C13439 {

    /* JADX INFO: renamed from: ֫ */
    public Object[] f37736 = new Object[16];

    /* JADX INFO: renamed from: ۧ */
    public int f37737;

    /* JADX INFO: renamed from: ܽ */
    public int f37738;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30583() {
        return this.f37737 == this.f37738;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30582(AbstractC8822 abstractC8822) {
        Object[] objArr = this.f37736;
        int i = this.f37738;
        objArr[i] = abstractC8822;
        int length = (objArr.length - 1) & (i + 1);
        this.f37738 = length;
        int i2 = this.f37737;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            C24108.m53363(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = this.f37736;
            int length3 = objArr3.length;
            int i3 = this.f37737;
            C24108.m53363(objArr3, objArr2, length3 - i3, 0, i3, 4);
            this.f37736 = objArr2;
            this.f37737 = 0;
            this.f37738 = length2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m30584() {
        int i = this.f37737;
        if (i == this.f37738) {
            return null;
        }
        Object[] objArr = this.f37736;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f37737 = (i + 1) & (objArr.length - 1);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
