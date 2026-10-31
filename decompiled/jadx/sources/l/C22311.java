package l;

/* JADX INFO: renamed from: l.᩹۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22311 {
    public static C22996 a(Object[] objArr, int i, int i2) {
        C22291.a(((Object[]) C11003.requireNonNull(objArr)).length, i, i2);
        return new C22996(objArr, i, i2, 1040);
    }

    public static InterfaceC17664 stream(Object[] objArr) {
        return stream(objArr, 0, objArr.length);
    }

    public static InterfaceC17664 stream(Object[] objArr, int i, int i2) {
        return C14841.stream(a(objArr, i, i2), false);
    }

    public static InterfaceC11315 stream(int[] iArr) {
        return C14841.a(C22291.spliterator(iArr, 0, iArr.length, 1040));
    }
}
