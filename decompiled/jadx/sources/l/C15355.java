package l;

import android.os.Debug;
import android.os.Looper;

/* JADX INFO: renamed from: l.ܶܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAQ7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15355 extends Thread {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C20177 f47058 = new C20177();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C20177 f47057 = new C20177();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C20177 f47064 = f47058;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20177 f47060 = f47057;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f47059 = "";

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f47063 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f47065 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f47062 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f47061 = 15000;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1245 c1245M4091;
        setName("|ANR-WatchDog|");
        RunnableC8301 runnableC8301 = new RunnableC8301(0, this);
        while (!isInterrupted()) {
            if (!C3125.f9760.getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e = e;
                    this.f47060.getClass();
                    e.getMessage();
                    return;
                }
            } else {
                this.f47065 = false;
                int i = 0;
                while (true) {
                    if (i < 3) {
                        C4925.m14315(runnableC8301);
                        try {
                            Thread.sleep(this.f47061 / 3);
                            if (this.f47065 || !C3125.f9760.getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
                                break;
                            } else {
                                i++;
                            }
                        } catch (InterruptedException e2) {
                            e = e2;
                            this.f47060.getClass();
                            e.getMessage();
                            return;
                        }
                    } else {
                        if (!this.f47062) {
                            break;
                        }
                        if (!this.f47063 && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                            this.f47062 = false;
                            break;
                        }
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        if (stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.os.MessageQueue")) {
                            this.f47062 = false;
                            break;
                        }
                        String str = this.f47059;
                        if (str != null) {
                            c1245M4091 = C1245.m4092(this.f47061, str, this);
                        } else {
                            c1245M4091 = C1245.m4091(this.f47061);
                        }
                        this.f47064.getClass();
                        throw c1245M4091;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36392(C15355 c15355) {
        c15355.f47065 = true;
        c15355.f47062 = true;
    }
}
