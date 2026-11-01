package p067l;

/* JADX INFO: renamed from: l.֫ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 32SL */
/* JADX INFO: loaded from: classes2.dex */
public class C3924 extends Exception {
    public C3924(int i) {
        super(C7050.m16224(i));
    }

    @Override // java.lang.Throwable
    public synchronized C3924 initCause(Throwable th) {
        super.initCause(th);
        return this;
    }

    @Override // java.lang.Throwable
    public String toString() {
        String name = Exception.class.getName();
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? C24104.m53357(name, ": ", localizedMessage) : name;
    }
}
