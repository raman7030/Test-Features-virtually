package p067l;

/* JADX INFO: renamed from: l.ܳۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAIW */
/* JADX INFO: loaded from: classes3.dex */
public final class C16150 extends Exception {
    public C16150(int i) {
        super(C7050.m16224(i));
    }

    @Override // java.lang.Throwable
    public final Throwable initCause(Throwable th) {
        synchronized (this) {
            super.initCause(th);
        }
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String name = Exception.class.getName();
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? C24104.m53357(name, ": ", localizedMessage) : name;
    }
}
