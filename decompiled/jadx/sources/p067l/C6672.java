package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6672 implements InterfaceC20028 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f17210;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C9907 f17211;

    /* JADX INFO: renamed from: ۧ */
    public boolean f17212;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C17143 f17213;

    /* JADX INFO: renamed from: ܽ */
    public final C11996 f17214 = new C11996();

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C14146 f17215;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C23631 f17216;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractC17043 f17217;

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo11540() {
        if (this.f17212) {
            return;
        }
        try {
            try {
                if (!this.f17210) {
                    throw new IllegalStateException("Legacy save was not captured");
                }
                this.f17217.mo37342();
                byte[] bArrM13641 = C6054.m13641(this.f17214.size(), this.f17214.m27458());
                synchronized (this.f17216) {
                    this.f17217.m38660(bArrM13641);
                }
                this.f17212 = true;
                this.f17211.close();
            } catch (IOException e) {
                this.f17211.m23205(e);
                this.f17216.f8383.m48823((Throwable) e);
            } catch (Error e2) {
                e = e2;
                this.f17211.m23205(e);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                this.f17211.m23205(e);
                throw e;
            }
        } catch (Throwable th) {
            this.f17212 = true;
            this.f17211.close();
            throw th;
        }
    }

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ۧ */
    public final synchronized void mo11541() {
        if (this.f17210 || this.f17212) {
            return;
        }
        try {
            this.f17214.writeInt(1382224737);
            C24301 c24301 = this.f17216.f75238;
            this.f17214.m27445(c24301 != null);
            if (c24301 != null) {
                c24301.m53632(this.f17214);
            }
            this.f17214.writeInt(1382224738);
            this.f17215.m32395(this.f17214, true);
            this.f17214.writeInt(1382224739);
            this.f17213.m38849(this.f17214);
            this.f17214.writeInt(1382224740);
            this.f17213.m38842(this.f17214);
            this.f17210 = true;
        } catch (Error | RuntimeException e) {
            this.f17212 = true;
            this.f17211.m23205(e);
            throw e;
        }
    }

    public C6672(C23631 c23631, C14146 c14146, C17143 c17143, C9907 c9907, AbstractC17043 abstractC17043) {
        this.f17216 = c23631;
        this.f17215 = c14146;
        this.f17213 = c17143;
        this.f17211 = c9907;
        this.f17217 = abstractC17043;
    }
}
