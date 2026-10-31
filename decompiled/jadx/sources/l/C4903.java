package l;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۙ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9ZA */
/* JADX INFO: loaded from: classes3.dex */
public class C4903 extends ReentrantLock implements InterfaceC3492 {
    public static final long serialVersionUID = -3264781576883412227L;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f15481 = C11321.m27962(C4903.class.getName());

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C8806 f15484 = null;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile AbstractC1729 f15482 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile EnumC7394 f15483 = EnumC7394.f22762;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20426 f15485 = new C20426("Announce");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20426 f15486 = new C20426("Cancel");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8806 m14274() {
        return this.f15484;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo14270(C8806 c8806) {
        this.f15484 = c8806;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14272(AbstractC20780 abstractC20780, EnumC7394 enumC7394) {
        if (this.f15482 == null && this.f15483 == enumC7394) {
            lock();
            try {
                if (this.f15482 == null && this.f15483 == enumC7394) {
                    mo14275(abstractC20780);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14271(AbstractC20780 abstractC20780) {
        if (this.f15482 == abstractC20780) {
            lock();
            try {
                if (this.f15482 == abstractC20780) {
                    mo14275(null);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo14275(AbstractC20780 abstractC20780) {
        this.f15482 = abstractC20780;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14269(EnumC7394 enumC7394) {
        lock();
        try {
            this.f15483 = enumC7394;
            if (this.f15483.m19914()) {
                this.f15485.m46830();
            }
            if (this.f15483.m19919()) {
                this.f15486.m46830();
                this.f15485.m46830();
            }
        } finally {
            unlock();
        }
    }

    @Override // l.InterfaceC3492
    /* JADX INFO: renamed from: ֫ */
    public final void mo10674(AbstractC1729 abstractC1729) {
        if (this.f15482 == abstractC1729) {
            lock();
            try {
                if (this.f15482 == abstractC1729) {
                    m14269(this.f15483.m19911());
                } else {
                    f15481.mo7098("Trying to advance state whhen not the owner. owner: {} perpetrator: {}", this.f15482, abstractC1729);
                }
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14276() {
        if (m14268()) {
            return;
        }
        lock();
        try {
            if (!m14268()) {
                m14269(this.f15483.m19917());
                mo14275(null);
            }
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14273() {
        boolean z = false;
        if (m14268()) {
            return false;
        }
        lock();
        try {
            if (!m14268()) {
                m14269(EnumC7394.f22763);
                mo14275(null);
                z = true;
            }
            return z;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m14277() {
        if (!this.f15483.m19919()) {
            this.f15486.m46831(5000L);
        }
        if (!this.f15483.m19919()) {
            this.f15486.m46831(10L);
            if (!this.f15483.m19919() && !this.f15483.m19913() && !this.f15483.m19912()) {
                f15481.mo7103(this, "Wait for canceled timed out: {}");
            }
        }
        return this.f15483.m19919();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m14268() {
        return this.f15483.m19919() || this.f15483.m19918();
    }

    @Override // java.util.concurrent.locks.ReentrantLock
    public final String toString() {
        String str;
        String str2 = "NO DNS";
        try {
            StringBuilder sb = new StringBuilder();
            if (this.f15484 != null) {
                str = "DNS: " + this.f15484.getName() + " [" + this.f15484.m22765() + "]";
            } else {
                str = "NO DNS";
            }
            sb.append(str);
            sb.append(" state: ");
            sb.append(this.f15483);
            sb.append(" task: ");
            sb.append(this.f15482);
            return sb.toString();
        } catch (IOException unused) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f15484 != null) {
                str2 = "DNS: " + this.f15484.getName();
            }
            sb2.append(str2);
            sb2.append(" state: ");
            sb2.append(this.f15483);
            sb2.append(" task: ");
            sb2.append(this.f15482);
            return sb2.toString();
        }
    }
}
