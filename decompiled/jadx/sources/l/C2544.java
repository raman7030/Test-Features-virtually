package l;

/* JADX INFO: renamed from: l.ۖ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9FX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2544 extends RuntimeException {
    public C2544(Exception exc, String str, Object... objArr) {
        super(String.format(str, objArr), exc);
    }

    public C2544(String str, Object... objArr) {
        super(String.format(str, objArr));
    }
}
