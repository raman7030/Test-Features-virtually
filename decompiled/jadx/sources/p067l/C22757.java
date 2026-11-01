package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B74J */
/* JADX INFO: loaded from: classes4.dex */
public final class C22757 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public Boolean f71767;

    /* JADX INFO: renamed from: ۙ */
    public final C16720 f71768;

    /* JADX INFO: renamed from: ۬ */
    public boolean f71769;

    /* JADX INFO: renamed from: ᩶ */
    public long f71770;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f71771;

    /* JADX INFO: renamed from: ᩹ */
    public String f71772;

    public /* synthetic */ C22757(C16720 c16720, int i) {
        this(c16720);
    }

    public C22757(C16720 c16720) {
        this.f71770 = -1L;
        this.f71768 = c16720;
    }

    /* JADX INFO: renamed from: ܳ */
    public static C22757 m50938() {
        C22757 c22757 = new C22757(null);
        c22757.f71769 = true;
        return c22757;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50940() {
        String str;
        synchronized (C5322.f12523) {
            str = (!this.f71771 || this.f71769) ? null : this.f71772;
        }
        return str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m50941() {
        long j;
        synchronized (C5322.f12523) {
            j = (!this.f71771 || this.f71769) ? -1L : this.f71770;
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Boolean m50942() {
        Boolean bool;
        synchronized (C5322.f12523) {
            bool = (!this.f71771 || this.f71769) ? null : this.f71767;
        }
        return bool;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50935(C22757 c22757, String str, long j, Boolean bool) {
        C16720 c16720;
        if (c22757.f71769 || (c16720 = c22757.f71768) == null) {
            return;
        }
        c16720.f49306--;
        c16720.f49299++;
        c22757.f71772 = str;
        c22757.f71770 = j;
        c22757.f71767 = bool;
        c22757.f71771 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public void m50939() {
        if (this.f71769) {
            return;
        }
        this.f71769 = true;
        C16720 c16720 = this.f71768;
        if (c16720 != null) {
            if (this.f71771) {
                c16720.f49299--;
            } else {
                c16720.f49306--;
            }
        }
        this.f71771 = false;
        this.f71772 = null;
        this.f71770 = -1L;
        this.f71767 = null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC22753 interfaceC22753;
        Thread thread;
        synchronized (C5322.f12523) {
            m50939();
            C16720 c16720 = this.f71768;
            if (c16720 != null && c16720.f49302 && c16720.f49306 + c16720.f49299 == 0) {
                interfaceC22753 = c16720.f49307;
                thread = c16720.f49300;
            } else {
                interfaceC22753 = null;
                thread = null;
            }
            C5322.f12523.notifyAll();
        }
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (interfaceC22753 != null) {
            try {
                interfaceC22753.close();
            } catch (IOException unused) {
            }
        }
    }
}
