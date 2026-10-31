package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S4DD */
/* JADX INFO: loaded from: classes2.dex */
public final class C6444 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public IOException f19925;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public IOException f19926;

    public C6444(IOException iOException) {
        super(iOException);
        this.f19925 = iOException;
        this.f19926 = iOException;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IOException m17799() {
        return this.f19925;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final IOException m17801() {
        return this.f19926;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17800(IOException iOException) {
        C20032.m46180((Throwable) this.f19925, iOException);
        this.f19926 = iOException;
    }
}
