package l;

/* JADX INFO: renamed from: l.ۖۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2475 extends C0357 {
    public final C0357[] e;

    public C2475(C0357[] c0357Arr) {
        super(-1, null, null);
        this.e = c0357Arr;
    }

    @Override // l.C0357
    public final C0357 a(int i, Object obj) {
        C0357 c0357K;
        Object obj2;
        C0357[] c0357Arr = this.e;
        while (true) {
            int length = c0357Arr.length;
            if (length == 0 || (c0357K = ConcurrentMapC10942.k(c0357Arr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = c0357K.a;
                if (i2 == i && ((obj2 = c0357K.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c0357K;
                }
                if (i2 < 0) {
                    if (c0357K instanceof C2475) {
                        c0357Arr = ((C2475) c0357K).e;
                    } else {
                        return c0357K.a(i, obj);
                    }
                } else {
                    c0357K = c0357K.d;
                }
            } while (c0357K != null);
            return null;
        }
    }
}
