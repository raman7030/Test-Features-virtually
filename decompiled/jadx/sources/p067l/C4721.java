package p067l;

/* JADX INFO: renamed from: l.ۖۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4721 extends C2708 {

    /* JADX INFO: renamed from: e */
    public final C2708[] f10674e;

    public C4721(C2708[] c2708Arr) {
        super(-1, null, null);
        this.f10674e = c2708Arr;
    }

    @Override // p067l.C2708
    /* JADX INFO: renamed from: a */
    public final C2708 mo4197a(int i, Object obj) {
        C2708 c2708M29312k;
        Object obj2;
        C2708[] c2708Arr = this.f10674e;
        while (true) {
            int length = c2708Arr.length;
            if (length == 0 || (c2708M29312k = ConcurrentMapC12768.m29312k(c2708Arr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = c2708M29312k.f4544a;
                if (i2 == i && ((obj2 = c2708M29312k.f4545b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c2708M29312k;
                }
                if (i2 < 0) {
                    if (c2708M29312k instanceof C4721) {
                        c2708Arr = ((C4721) c2708M29312k).f10674e;
                    } else {
                        return c2708M29312k.mo4197a(i, obj);
                    }
                } else {
                    c2708M29312k = c2708M29312k.f4547d;
                }
            } while (c2708M29312k != null);
            return null;
        }
    }
}
