package l;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17726 implements InterfaceC6283 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f54220;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f54221;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakReference f54222;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f54223;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f54224;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f54225;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f54226;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f54227 = C20549.m47088();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m41511() {
        if (this.f54220) {
            return true;
        }
        this.f54220 = true;
        C16314 c16314 = C20549.f66202;
        int i = this.f54227;
        c16314.getClass();
        C23216.m51511(this);
        try {
            C23216.m51523(i);
            return true;
        } catch (Throwable unused) {
            C23216.m51518(this);
            this.f54220 = false;
            return false;
        }
    }

    public C17726(C10671 c10671) {
        this.f54222 = new WeakReference(c10671.f32087);
        this.f54224 = c10671.f32088;
        this.f54225 = c10671.f32092;
        this.f54223 = c10671.f32091;
        this.f54221 = c10671.f32089;
        this.f54226 = c10671.f32090;
    }

    @Override // l.InterfaceC6283
    /* JADX INFO: renamed from: ֫ */
    public final void mo12970(int i, int i2) {
        if (i != this.f54227) {
            return;
        }
        synchronized (this) {
            if (this.f54220) {
                this.f54220 = false;
                C20549.f66202.getClass();
                C23216.m51518(this);
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) this.f54222.get();
                if (abstractActivityC3346 != null) {
                    C10671 c10671 = new C10671(abstractActivityC3346, this.f54224, this.f54225, this.f54223, this.f54221, this.f54226);
                    if (i2 == 0) {
                        c10671.m26777(EnumC5856.SHIZUKU);
                    } else {
                        c10671.m26778(EnumC5856.SHIZUKU);
                    }
                }
            }
        }
    }
}
