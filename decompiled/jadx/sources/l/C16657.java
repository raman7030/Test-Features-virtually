package l;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ܽ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C78L */
/* JADX INFO: loaded from: classes4.dex */
public final class C16657 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16431 f51152;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Executor f51153;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51154;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f51155;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f51156;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f51157;

    public C16657(C16431 c16431) {
        ExecutorService executorService = C1802.f6208;
        this.f51152 = c16431;
        this.f51153 = executorService;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39178() {
        synchronized (this) {
            this.f51154 = true;
            m39175();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39176() {
        synchronized (this) {
            this.f51157 = true;
            m39175();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39177() {
        synchronized (this) {
            this.f51156 = true;
            m39175();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m39175() {
        if (!this.f51155 && this.f51154 && this.f51157 && this.f51156) {
            this.f51155 = true;
            final C16431 c16431 = this.f51152;
            C11003.requireNonNull(c16431);
            this.f51153.execute(new Runnable() { // from class: l.ۧ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    c16431.m38740();
                }
            });
        }
    }
}
