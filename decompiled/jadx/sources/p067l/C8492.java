package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S4DD */
/* JADX INFO: loaded from: classes2.dex */
public final class C8492 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸ */
    public IOException f22798;

    /* JADX INFO: renamed from: ᩹ */
    public IOException f22799;

    public C8492(IOException iOException) {
        super(iOException);
        this.f22798 = iOException;
        this.f22799 = iOException;
    }

    /* JADX INFO: renamed from: ֫ */
    public final IOException m19746() {
        return this.f22798;
    }

    /* JADX INFO: renamed from: ۧ */
    public final IOException m19748() {
        return this.f22799;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19747(IOException iOException) {
        C21407.m48496((Throwable) this.f22798, iOException);
        this.f22799 = iOException;
    }
}
