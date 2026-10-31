package l;

/* JADX INFO: renamed from: l.ۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes4.dex */
public class C11631 implements InterfaceC5986 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] f34714;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f34715;

    @Override // l.InterfaceC5986
    /* JADX INFO: renamed from: ֫ */
    public boolean mo16807(Object obj) {
        Object[] objArr;
        boolean z;
        C11233.m27805(obj, AbstractC16620.MATCH_INSTANCE_STR);
        int i = this.f34715;
        int i2 = 0;
        while (true) {
            objArr = this.f34714;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f34715;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f34715 = i3 + 1;
        return true;
    }

    public C11631(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f34714 = new Object[i];
    }

    @Override // l.InterfaceC5986
    /* JADX INFO: renamed from: ֫ */
    public Object mo16806() {
        int i = this.f34715;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f34714;
        Object obj = objArr[i2];
        C11233.m27800(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f34715--;
        return obj;
    }
}
