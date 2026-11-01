package p067l;

/* JADX INFO: renamed from: l.᩹۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23573 {
    /* JADX INFO: renamed from: a */
    public static C24224 m52385a(Object[] objArr, int i, int i2) {
        C23554.m52341a(((Object[]) C12826.requireNonNull(objArr)).length, i, i2);
        return new C24224(objArr, i, i2, 1040);
    }

    public static InterfaceC19157 stream(Object[] objArr) {
        return stream(objArr, 0, objArr.length);
    }

    public static InterfaceC19157 stream(Object[] objArr, int i, int i2) {
        return C16474.stream(m52385a(objArr, i, i2), false);
    }

    public static InterfaceC13123 stream(int[] iArr) {
        return C16474.m37399a(C23554.spliterator(iArr, 0, iArr.length, 1040));
    }
}
