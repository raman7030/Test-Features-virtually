package p067l;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.۟ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D4CH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9574 extends C16989 {

    /* JADX INFO: renamed from: ܿ */
    public C16989 f26364;

    /* JADX INFO: renamed from: ۜ */
    public final void m22304() {
        this.f26364 = C16989.f50239;
    }

    @Override // p067l.C16989
    /* JADX INFO: renamed from: ۧ */
    public final C16989 mo22306(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return this.f26364.mo22306(j);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C16989 m22311() {
        return this.f26364;
    }

    @Override // p067l.C16989
    /* JADX INFO: renamed from: ܳ */
    public final long mo22307() {
        return this.f26364.mo22307();
    }

    @Override // p067l.C16989
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo22310() {
        return this.f26364.mo22310();
    }

    @Override // p067l.C16989
    /* JADX INFO: renamed from: ܽ */
    public final long mo22308() {
        return this.f26364.mo22308();
    }

    @Override // p067l.C16989
    /* JADX INFO: renamed from: ֫ */
    public final C16989 mo22303(long j) {
        return this.f26364.mo22303(j);
    }

    @Override // p067l.C16989
    /* JADX INFO: renamed from: ۧ */
    public final C16989 mo22305() {
        return this.f26364.mo22305();
    }

    @Override // p067l.C16989
    /* JADX INFO: renamed from: ֫ */
    public final C16989 mo22302() {
        return this.f26364.mo22302();
    }

    public C9574(C16989 c16989) {
        if (c16989 == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f26364 = c16989;
    }

    @Override // p067l.C16989
    /* JADX INFO: renamed from: ܿ */
    public final void mo22309() throws InterruptedIOException {
        this.f26364.mo22309();
    }
}
