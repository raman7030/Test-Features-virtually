package p067l;

import java.io.IOException;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.ܿ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C19115 {

    /* JADX INFO: renamed from: ֫ */
    public SoftReference f57025;

    /* JADX INFO: renamed from: ۧ */
    public volatile int f57026;

    /* JADX INFO: renamed from: ܽ */
    public final C13108 f57027;

    /* JADX INFO: renamed from: ܿ */
    public final C15581 f57028;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 f57029;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m43427() {
        byte[] bArrM53400;
        int i = this.f57026 - 1;
        this.f57026 = i;
        if (i == 0 && (bArrM53400 = this.f57027.m33502().m53400()) != null) {
            this.f57027.m33502().m53401((byte[]) null);
            if (this.f57025.get() == null) {
                this.f57025 = new SoftReference(bArrM53400);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m43426() {
        this.f57026++;
        try {
            if (this.f57027.m33502().m53400() == null) {
                byte[] bArrM38664 = (byte[]) this.f57025.get();
                if (bArrM38664 == null) {
                    bArrM38664 = this.f57029.m38664();
                }
                if (bArrM38664 == null) {
                    throw new IOException("Failed to load dex buffer: " + this.f57029.mo25505());
                }
                this.f57027.m33502().m53401(bArrM38664);
            }
        } catch (Throwable th) {
            this.f57026--;
            throw th;
        }
    }

    public C19115(C13108 c13108, AbstractC17043 abstractC17043, int i, int i2, long j, int i3) {
        this.f57027 = c13108;
        this.f57029 = abstractC17043;
        this.f57028 = new C15581(i, i2, j, i3, new C19786(this));
        c13108.m33473(this);
        byte[] bArrM53400 = c13108.m33502().m53400();
        c13108.m33502().m53401((byte[]) null);
        this.f57025 = new SoftReference(bArrM53400);
    }
}
