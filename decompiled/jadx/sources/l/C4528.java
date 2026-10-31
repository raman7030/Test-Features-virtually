package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C4528 implements InterfaceC18581 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f14383;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7932 f14384;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f14385;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f14386;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10130 f14387 = new C10130();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f14388;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f14389;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f14390;

    @Override // l.InterfaceC18581
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo9497() {
        if (this.f14385) {
            return;
        }
        try {
            try {
                if (!this.f14383) {
                    throw new IllegalStateException("Legacy save was not captured");
                }
                this.f14390.mo35195();
                byte[] bArrM11705 = C3878.m11705(this.f14387.size(), this.f14387.m25438());
                synchronized (this.f14389) {
                    this.f14390.m36502(bArrM11705);
                }
                this.f14385 = true;
                this.f14384.close();
            } catch (IOException e) {
                this.f14384.m21239(e);
                this.f14389.f5603.m46502((Throwable) e);
            } catch (Error e2) {
                e = e2;
                this.f14384.m21239(e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                this.f14384.m21239(e);
                throw e;
            }
        } catch (Throwable th) {
            this.f14385 = true;
            this.f14384.close();
            throw th;
        }
    }

    @Override // l.InterfaceC18581
    /* JADX INFO: renamed from: ۧ */
    public final synchronized void mo9498() {
        if (this.f14383 || this.f14385) {
            return;
        }
        try {
            this.f14387.writeInt(1382224737);
            C23077 c23077 = this.f14389.f72513;
            this.f14387.m25425(c23077 != null);
            if (c23077 != null) {
                c23077.m51239(this.f14387);
            }
            this.f14387.writeInt(1382224738);
            this.f14388.m30331(this.f14387, true);
            this.f14387.writeInt(1382224739);
            this.f14386.m36688(this.f14387);
            this.f14387.writeInt(1382224740);
            this.f14386.m36681(this.f14387);
            this.f14383 = true;
        } catch (Error | RuntimeException e) {
            this.f14385 = true;
            this.f14384.m21239(e);
            throw e;
        }
    }

    public C4528(C22372 c22372, C12392 c12392, C15545 c15545, C7932 c7932, AbstractC15440 abstractC15440) {
        this.f14389 = c22372;
        this.f14388 = c12392;
        this.f14386 = c15545;
        this.f14384 = c7932;
        this.f14390 = abstractC15440;
    }
}
