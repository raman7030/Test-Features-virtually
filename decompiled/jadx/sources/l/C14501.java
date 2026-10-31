package l;

/* JADX INFO: renamed from: l.ܳۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAIW */
/* JADX INFO: loaded from: classes3.dex */
public final class C14501 extends Exception {
    public C14501(int i) {
        super(C4925.m14327(i));
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
        return localizedMessage != null ? C22870.m50967(name, ": ", localizedMessage) : name;
    }
}
