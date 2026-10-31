package l;

/* JADX INFO: renamed from: l.ۨۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11648 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object[] f34737 = new Object[16];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f34738;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f34739;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28535() {
        return this.f34738 == this.f34739;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28534(AbstractC6790 abstractC6790) {
        Object[] objArr = this.f34737;
        int i = this.f34739;
        objArr[i] = abstractC6790;
        int length = (objArr.length - 1) & (i + 1);
        this.f34739 = length;
        int i2 = this.f34738;
        if (length == i2) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            C22874.m50973(objArr, objArr2, 0, i2, 0, 10);
            Object[] objArr3 = this.f34737;
            int length3 = objArr3.length;
            int i3 = this.f34738;
            C22874.m50973(objArr3, objArr2, length3 - i3, 0, i3, 4);
            this.f34737 = objArr2;
            this.f34738 = 0;
            this.f34739 = length2;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m28536() {
        int i = this.f34738;
        if (i == this.f34739) {
            return null;
        }
        Object[] objArr = this.f34737;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f34738 = (i + 1) & (objArr.length - 1);
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
