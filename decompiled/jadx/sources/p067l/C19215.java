package p067l;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19215 implements InterfaceC8340 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f57411;

    /* JADX INFO: renamed from: ۜ */
    public final List f57412;

    /* JADX INFO: renamed from: ۧ */
    public final WeakReference f57413;

    /* JADX INFO: renamed from: ܳ */
    public final String f57414;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 f57415;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f57416;

    /* JADX INFO: renamed from: ᩳ */
    public final String f57417;

    /* JADX INFO: renamed from: ᩻ */
    public final int f57418 = C21898.m49411();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m43757() {
        if (this.f57411) {
            return true;
        }
        this.f57411 = true;
        C17873 c17873 = C21898.f68879;
        int i = this.f57418;
        c17873.getClass();
        C24433.m53908(this);
        try {
            C24433.m53920(i);
            return true;
        } catch (Throwable unused) {
            C24433.m53915(this);
            this.f57411 = false;
            return false;
        }
    }

    public C19215(C12510 c12510) {
        this.f57413 = new WeakReference(c12510.f35058);
        this.f57415 = c12510.f35059;
        this.f57416 = c12510.f35063;
        this.f57414 = c12510.f35062;
        this.f57412 = c12510.f35060;
        this.f57417 = c12510.f35061;
    }

    @Override // p067l.InterfaceC8340
    /* JADX INFO: renamed from: ֫ */
    public final void mo14834(int i, int i2) {
        if (i != this.f57418) {
            return;
        }
        synchronized (this) {
            if (this.f57411) {
                this.f57411 = false;
                C21898.f68879.getClass();
                C24433.m53915(this);
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) this.f57413.get();
                if (abstractActivityC5549 != null) {
                    C12510 c12510 = new C12510(abstractActivityC5549, this.f57415, this.f57416, this.f57414, this.f57412, this.f57417);
                    if (i2 == 0) {
                        c12510.m28816(EnumC7934.SHIZUKU);
                    } else {
                        c12510.m28817(EnumC7934.SHIZUKU);
                    }
                }
            }
        }
    }
}
