package p067l;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ۜ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A0C */
/* JADX INFO: loaded from: classes2.dex */
public final class C8469 extends Thread {

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC20106 f22727;

    /* JADX INFO: renamed from: ۙ */
    public InetAddress f22728;

    /* JADX INFO: renamed from: ۫ */
    public UnknownHostException f22729;

    /* JADX INFO: renamed from: ۬ */
    public int f22730;

    /* JADX INFO: renamed from: ᩶ */
    public C21881 f22731;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC6694[] f22732;

    /* JADX INFO: renamed from: ᩹ */
    public String f22733;

    public C8469(C21881 c21881, String str, int i, InetAddress inetAddress, C12925 c12925) {
        super(C21466.m48631("JCIFS-QueryThread: ", str));
        this.f22732 = null;
        this.f22731 = c21881;
        this.f22733 = str;
        this.f22730 = i;
        this.f22728 = inetAddress;
        this.f22727 = c12925;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                this.f22732 = ((RunnableC11152) this.f22727.mo29601()).m25705(this.f22733, this.f22730, this.f22728);
                synchronized (this.f22731) {
                    C21881 c21881 = this.f22731;
                    c21881.f68819--;
                    c21881.notify();
                }
            } catch (UnknownHostException e) {
                this.f22729 = e;
                synchronized (this.f22731) {
                    C21881 c21882 = this.f22731;
                    c21882.f68819--;
                    c21882.notify();
                }
            } catch (Exception e2) {
                this.f22729 = new UnknownHostException(e2.getMessage());
                synchronized (this.f22731) {
                    C21881 c21883 = this.f22731;
                    c21883.f68819--;
                    c21883.notify();
                }
            }
        } catch (Throwable th) {
            synchronized (this.f22731) {
                C21881 c21884 = this.f22731;
                c21884.f68819--;
                c21884.notify();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6694[] m19694() {
        return this.f22732;
    }

    /* JADX INFO: renamed from: ۧ */
    public final UnknownHostException m19695() {
        return this.f22729;
    }
}
