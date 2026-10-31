package l;

/* JADX INFO: renamed from: l.֫ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 32SL */
/* JADX INFO: loaded from: classes2.dex */
public class C1637 extends Exception {
    public C1637(int i) {
        super(C4925.m14327(i));
    }

    @Override // java.lang.Throwable
    public synchronized C1637 initCause(Throwable th) {
        super.initCause(th);
        return this;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String name = Exception.class.getName();
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? C22870.m50967(name, ": ", localizedMessage) : name;
    }
}
