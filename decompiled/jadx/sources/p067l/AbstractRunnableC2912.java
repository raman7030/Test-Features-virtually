package p067l;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֡ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9HB */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC2912 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public Thread f5030;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC10665 f5033;

    /* JADX INFO: renamed from: ᩹ */
    public BufferedInputStream f5034;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC4410 f5032 = C13128.m30022(getClass());

    /* JADX INFO: renamed from: ۙ */
    public AtomicBoolean f5031 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC7487 mo4712();

    public AbstractRunnableC2912(String str, InputStream inputStream, InterfaceC10665 interfaceC10665) {
        if (inputStream instanceof BufferedInputStream) {
            this.f5034 = (BufferedInputStream) inputStream;
        } else {
            this.f5034 = new BufferedInputStream(inputStream);
        }
        this.f5033 = interfaceC10665;
        StringBuilder sbM11879 = C5410.m11879("Packet Reader for ", str, ", Original Thread name: ");
        sbM11879.append(Thread.currentThread().getName());
        Thread thread = new Thread(this, sbM11879.toString());
        this.f5030 = thread;
        thread.setDaemon(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4410 interfaceC4410;
        AtomicBoolean atomicBoolean;
        InterfaceC10665 interfaceC10665 = this.f5033;
        while (true) {
            boolean zIsInterrupted = Thread.currentThread().isInterrupted();
            interfaceC4410 = this.f5032;
            atomicBoolean = this.f5031;
            if (zIsInterrupted || atomicBoolean.get()) {
                break;
            }
            try {
                InterfaceC7487 interfaceC7487Mo4712 = mo4712();
                interfaceC4410.mo9195(interfaceC7487Mo4712, "Received packet {}");
                ((C24845) interfaceC10665).m54560(interfaceC7487Mo4712);
            } catch (C4630 e) {
                if (!atomicBoolean.get()) {
                    interfaceC4410.mo9184("PacketReader error, got exception.", (Exception) e);
                    ((C24845) interfaceC10665).m54559(e);
                    return;
                }
            }
        }
        if (atomicBoolean.get()) {
            interfaceC4410.mo9182(this.f5030, "{} stopped.");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m4714() {
        this.f5032.mo9183("Stopping PacketReader...");
        this.f5031.set(true);
        this.f5030.interrupt();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4713() {
        Thread thread = this.f5030;
        this.f5032.mo9195(thread.getName(), "Starting PacketReader on thread: {}");
        thread.start();
    }
}
