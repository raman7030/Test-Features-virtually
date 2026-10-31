package l;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ۜ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A0C */
/* JADX INFO: loaded from: classes2.dex */
public final class C6419 extends Thread {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f19855;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InetAddress f19856;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public UnknownHostException f19857;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f19858;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20531 f19859;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC4551[] f19860;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f19861;

    public C6419(C20531 c20531, String str, int i, InetAddress inetAddress, C11107 c11107) {
        super(C20094.m46315("JCIFS-QueryThread: ", str));
        this.f19860 = null;
        this.f19859 = c20531;
        this.f19861 = str;
        this.f19858 = i;
        this.f19856 = inetAddress;
        this.f19855 = c11107;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                this.f19860 = ((RunnableC9242) this.f19855.mo27539()).m23705(this.f19861, this.f19858, this.f19856);
                synchronized (this.f19859) {
                    C20531 c20531 = this.f19859;
                    c20531.f66142--;
                    c20531.notify();
                }
            } catch (UnknownHostException e) {
                this.f19857 = e;
                synchronized (this.f19859) {
                    C20531 c20532 = this.f19859;
                    c20532.f66142--;
                    c20532.notify();
                }
            } catch (Exception e2) {
                this.f19857 = new UnknownHostException(e2.getMessage());
                synchronized (this.f19859) {
                    C20531 c20533 = this.f19859;
                    c20533.f66142--;
                    c20533.notify();
                }
            }
        } catch (Throwable th) {
            synchronized (this.f19859) {
                C20531 c20534 = this.f19859;
                c20534.f66142--;
                c20534.notify();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4551[] m17747() {
        return this.f19860;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final UnknownHostException m17748() {
        return this.f19857;
    }
}
