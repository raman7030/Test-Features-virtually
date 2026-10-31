package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩵ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A2RB */
/* JADX INFO: loaded from: classes4.dex */
public class C19401 extends IOException {
    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C19401(int i) {
        super(C4925.m14327(i));
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String name = IOException.class.getName();
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? C22870.m50967(name, ": ", localizedMessage) : name;
    }
}
