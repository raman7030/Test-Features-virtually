package p067l;

import android.os.Debug;
import android.os.Looper;

/* JADX INFO: renamed from: l.ܶܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAQ7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16962 extends Thread {

    /* JADX INFO: renamed from: ۤ */
    public static final C21545 f50183 = new C21545();

    /* JADX INFO: renamed from: ۛ */
    public static final C21545 f50182 = new C21545();

    /* JADX INFO: renamed from: ᩸ */
    public C21545 f50189 = f50183;

    /* JADX INFO: renamed from: ۙ */
    public C21545 f50185 = f50182;

    /* JADX INFO: renamed from: ۗ */
    public String f50184 = "";

    /* JADX INFO: renamed from: ᩶ */
    public boolean f50188 = true;

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f50190 = false;

    /* JADX INFO: renamed from: ۬ */
    public volatile boolean f50187 = true;

    /* JADX INFO: renamed from: ۫ */
    public final int f50186 = 15000;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C3552 c3552M6335;
        setName("|ANR-WatchDog|");
        RunnableC10258 runnableC10258 = new RunnableC10258(0, this);
        while (!isInterrupted()) {
            if (!C5338.f12563.getLifecycle().mo21805().m35142(EnumC15415.STARTED)) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e = e;
                    this.f50185.getClass();
                    e.getMessage();
                    return;
                }
            } else {
                this.f50190 = false;
                int i = 0;
                while (true) {
                    if (i < 3) {
                        C7050.m16212(runnableC10258);
                        try {
                            Thread.sleep(this.f50186 / 3);
                            if (this.f50190 || !C5338.f12563.getLifecycle().mo21805().m35142(EnumC15415.STARTED)) {
                                break;
                            } else {
                                i++;
                            }
                        } catch (InterruptedException e2) {
                            e = e2;
                            this.f50185.getClass();
                            e.getMessage();
                            return;
                        }
                    } else {
                        if (!this.f50187) {
                            break;
                        }
                        if (!this.f50188 && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                            this.f50187 = false;
                            break;
                        }
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        if (stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.os.MessageQueue")) {
                            this.f50187 = false;
                            break;
                        }
                        String str = this.f50184;
                        if (str != null) {
                            c3552M6335 = C3552.m6336(this.f50186, str, this);
                        } else {
                            c3552M6335 = C3552.m6335(this.f50186);
                        }
                        this.f50189.getClass();
                        throw c3552M6335;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m38550(C16962 c16962) {
        c16962.f50190 = true;
        c16962.f50187 = true;
    }
}
