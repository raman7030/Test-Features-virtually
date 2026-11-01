package p067l;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۙ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZA */
/* JADX INFO: loaded from: classes3.dex */
public class C7029 extends ReentrantLock implements InterfaceC5688 {
    public static final long serialVersionUID = -3264781576883412227L;

    /* JADX INFO: renamed from: ۬ */
    public static InterfaceC4410 f18314 = C13128.m30023(C7029.class.getName());

    /* JADX INFO: renamed from: ᩶ */
    public volatile C10738 f18317 = null;

    /* JADX INFO: renamed from: ۗ */
    public volatile AbstractC4012 f18315 = null;

    /* JADX INFO: renamed from: ۙ */
    public volatile EnumC9396 f18316 = EnumC9396.f25674;

    /* JADX INFO: renamed from: ᩸ */
    public final C21782 f18318 = new C21782("Announce");

    /* JADX INFO: renamed from: ᩹ */
    public final C21782 f18319 = new C21782("Cancel");

    /* JADX INFO: renamed from: ۧ */
    public final C10738 m16171() {
        return this.f18317;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo16167(C10738 c10738) {
        this.f18317 = c10738;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16169(AbstractC22118 abstractC22118, EnumC9396 enumC9396) {
        if (this.f18315 == null && this.f18316 == enumC9396) {
            lock();
            try {
                if (this.f18315 == null && this.f18316 == enumC9396) {
                    mo16172(abstractC22118);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16168(AbstractC22118 abstractC22118) {
        if (this.f18315 == abstractC22118) {
            lock();
            try {
                if (this.f18315 == abstractC22118) {
                    mo16172(null);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo16172(AbstractC22118 abstractC22118) {
        this.f18315 = abstractC22118;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16166(EnumC9396 enumC9396) {
        lock();
        try {
            this.f18316 = enumC9396;
            if (this.f18316.m21887()) {
                this.f18318.m49153();
            }
            if (this.f18316.m21892()) {
                this.f18319.m49153();
                this.f18318.m49153();
            }
        } finally {
            unlock();
        }
    }

    @Override // p067l.InterfaceC5688
    /* JADX INFO: renamed from: ֫ */
    public final void mo12669(AbstractC4012 abstractC4012) {
        if (this.f18315 == abstractC4012) {
            lock();
            try {
                if (this.f18315 == abstractC4012) {
                    m16166(this.f18316.m21884());
                } else {
                    f18314.mo9193("Trying to advance state whhen not the owner. owner: {} perpetrator: {}", this.f18315, abstractC4012);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m16173() {
        if (m16165()) {
            return;
        }
        lock();
        try {
            if (!m16165()) {
                m16166(this.f18316.m21890());
                mo16172(null);
            }
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16170() {
        boolean z = false;
        if (m16165()) {
            return false;
        }
        lock();
        try {
            if (!m16165()) {
                m16166(EnumC9396.f25675);
                mo16172(null);
                z = true;
            }
            return z;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m16174() {
        if (!this.f18316.m21892()) {
            this.f18319.m49154(5000L);
        }
        if (!this.f18316.m21892()) {
            this.f18319.m49154(10L);
            if (!this.f18316.m21892() && !this.f18316.m21886() && !this.f18316.m21885()) {
                f18314.mo9198(this, "Wait for canceled timed out: {}");
            }
        }
        return this.f18316.m21892();
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m16165() {
        return this.f18316.m21892() || this.f18316.m21891();
    }

    @Override // java.util.concurrent.locks.ReentrantLock
    public final String toString() {
        String str;
        String str2 = "NO DNS";
        try {
            StringBuilder sb = new StringBuilder();
            if (this.f18317 != null) {
                str = "DNS: " + this.f18317.getName() + " [" + this.f18317.m24735() + "]";
            } else {
                str = "NO DNS";
            }
            sb.append(str);
            sb.append(" state: ");
            sb.append(this.f18316);
            sb.append(" task: ");
            sb.append(this.f18315);
            return sb.toString();
        } catch (IOException unused) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f18317 != null) {
                str2 = "DNS: " + this.f18317.getName();
            }
            sb2.append(str2);
            sb2.append(" state: ");
            sb2.append(this.f18316);
            sb2.append(" task: ");
            sb2.append(this.f18315);
            return sb2.toString();
        }
    }
}
