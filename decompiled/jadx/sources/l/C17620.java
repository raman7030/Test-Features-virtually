package l;

import java.io.IOException;
import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: l.ܿ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17620 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SoftReference f53831;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile int f53832;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11300 f53833;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13902 f53834;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f53835;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m41181() {
        byte[] bArrM51009;
        int i = this.f53832 - 1;
        this.f53832 = i;
        if (i == 0 && (bArrM51009 = this.f53833.m31416().m51009()) != null) {
            this.f53833.m31416().m51010((byte[]) null);
            if (this.f53831.get() == null) {
                this.f53831 = new SoftReference(bArrM51009);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m41180() {
        this.f53832++;
        try {
            if (this.f53833.m31416().m51009() == null) {
                byte[] bArrM36506 = (byte[]) this.f53831.get();
                if (bArrM36506 == null) {
                    bArrM36506 = this.f53835.m36506();
                }
                if (bArrM36506 == null) {
                    throw new IOException("Failed to load dex buffer: " + this.f53835.mo23554());
                }
                this.f53833.m31416().m51010(bArrM36506);
            }
        } catch (Throwable th) {
            this.f53832--;
            throw th;
        }
    }

    public C17620(C11300 c11300, AbstractC15440 abstractC15440, int i, int i2, long j, int i3) {
        this.f53833 = c11300;
        this.f53835 = abstractC15440;
        this.f53834 = new C13902(i, i2, j, i3, new C18326(this));
        c11300.m31387(this);
        byte[] bArrM51009 = c11300.m31416().m51009();
        c11300.m31416().m51010((byte[]) null);
        this.f53831 = new SoftReference(bArrM51009);
    }
}
