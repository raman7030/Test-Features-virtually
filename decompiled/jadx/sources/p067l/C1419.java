package p067l;

/* JADX INFO: renamed from: l.ۨۤ */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes4.dex */
public class C1419 implements InterfaceC1139 {

    /* JADX INFO: renamed from: ֫ */
    public final Object[] f37711;

    /* JADX INFO: renamed from: ۧ */
    public int f37712;

    @Override // p067l.InterfaceC1139
    /* JADX INFO: renamed from: ֫ */
    public boolean mo18733(Object obj) {
        Object[] objArr;
        boolean z;
        C13045.m29867(obj, AbstractC18164.MATCH_INSTANCE_STR);
        int i = this.f37712;
        int i2 = 0;
        while (true) {
            objArr = this.f37711;
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
        int i3 = this.f37712;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f37712 = i3 + 1;
        return true;
    }

    public C1419(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f37711 = new Object[i];
    }

    @Override // p067l.InterfaceC1139
    /* JADX INFO: renamed from: ֫ */
    public Object mo18732() {
        int i = this.f37712;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f37711;
        Object obj = objArr[i2];
        C13045.m29862(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.f37712--;
        return obj;
    }
}
