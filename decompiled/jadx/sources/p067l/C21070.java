package p067l;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.alipay.sdk.p010m.p058y.C0248k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩵᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SF */
/* JADX INFO: loaded from: classes4.dex */
public final class C21070 {

    /* JADX INFO: renamed from: ֡ */
    public final InterfaceC9768 f66177;

    /* JADX INFO: renamed from: ֨ */
    public FutureC5767 f66178;

    /* JADX INFO: renamed from: ۖ */
    public FutureC5767 f66180;

    /* JADX INFO: renamed from: ۗ */
    public FutureC5767 f66181;

    /* JADX INFO: renamed from: ۙ */
    public boolean f66183;

    /* JADX INFO: renamed from: ۚ */
    public C13693 f66184;

    /* JADX INFO: renamed from: ۜ */
    public C23731 f66185;

    /* JADX INFO: renamed from: ۠ */
    public C3773 f66186;

    /* JADX INFO: renamed from: ۡ */
    public final C23631 f66187;

    /* JADX INFO: renamed from: ۢ */
    public Throwable f66188;

    /* JADX INFO: renamed from: ۧ */
    public boolean f66189;

    /* JADX INFO: renamed from: ۫ */
    public int f66190;

    /* JADX INFO: renamed from: ۬ */
    public boolean f66191;

    /* JADX INFO: renamed from: ܶ */
    public C22864 f66193;

    /* JADX INFO: renamed from: ܺ */
    public final C17143 f66194;

    /* JADX INFO: renamed from: ܽ */
    public volatile boolean f66195;

    /* JADX INFO: renamed from: ܿ */
    public boolean f66196;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f66197;

    /* JADX INFO: renamed from: ᩵ */
    public final InterfaceC20399 f66199;

    /* JADX INFO: renamed from: ᩶ */
    public final C14146 f66200;

    /* JADX INFO: renamed from: ᩷ */
    public Executor f66201;

    /* JADX INFO: renamed from: ᩸ */
    public final int f66202;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f66203;

    /* JADX INFO: renamed from: ᩴ */
    public final Handler f66198 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܳ */
    public final FutureC5767 f66192 = new FutureC5767();

    /* JADX INFO: renamed from: ۘ */
    public final C4305 f66182 = new C4305();

    /* JADX INFO: renamed from: ᩻ */
    public volatile String f66204 = "waiting_directory";

    /* JADX INFO: renamed from: ֫ */
    public boolean f66179 = true;

    public C21070(C23631 c23631, InterfaceC20399 interfaceC20399, int i) {
        this.f66187 = c23631;
        C14146 c14146 = c23631.f75242;
        this.f66200 = c14146;
        this.f66194 = c23631.f75229;
        this.f66199 = interfaceC20399;
        this.f66202 = i;
        this.f66177 = c14146.m32500();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m47550() {
        return this.f66199 != null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final FutureC5767 m47551() {
        return this.f66192.m12898((InterfaceC22729) new C8999());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47546(String str, InterfaceC22097 interfaceC22097) {
        C3773 c3773 = new C3773(new C6317(this), new C25092(interfaceC22097, str));
        this.f66186 = c3773;
        c3773.m7360();
    }

    /* JADX INFO: renamed from: ۜ */
    public static String m47532(C21070 c21070) {
        int i;
        String str;
        String str2;
        synchronized (c21070) {
            i = c21070.f66190;
        }
        StringBuilder sb = new StringBuilder("stage=");
        sb.append(c21070.f66204);
        sb.append("\nworkerState=");
        sb.append(i);
        sb.append("\napplyingState=");
        sb.append(c21070.f66189);
        sb.append("\ncleaning=");
        sb.append(c21070.f66196);
        sb.append("\ncanceled=");
        sb.append(c21070.f66195);
        sb.append("\ndirectoryReady=");
        C23731 c23731 = c21070.f66185;
        sb.append(c23731 == null || c23731.m52768().isDone());
        sb.append("\npersistence=");
        FutureC5767 futureC5767 = c21070.f66178;
        if (futureC5767 == null) {
            str = "absent";
        } else if (futureC5767.isDone()) {
            str = futureC5767.m12908() ? C0248k.f1176j : "done";
        } else {
            str = "pending";
        }
        sb.append(str);
        sb.append("\nrestoration=");
        FutureC5767 futureC5768 = c21070.f66180;
        if (futureC5768 == null) {
            str2 = "absent";
        } else if (futureC5768.isDone()) {
            str2 = futureC5768.m12908() ? C0248k.f1176j : "done";
        } else {
            str2 = "pending";
        }
        sb.append(str2);
        sb.append("\nfailure=");
        sb.append(Log.getStackTraceString(c21070.f66188));
        sb.append("\n");
        sb.append(c21070.f66200.m32432());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47548(C23731 c23731, final Executor executor) {
        this.f66185 = c23731;
        c23731.m52768().m12887(new InterfaceC9988() { // from class: l.ۧ᩵ᩳ
            @Override // p067l.InterfaceC9988
            /* JADX INFO: renamed from: ۧ */
            public final void mo6895(Object obj, Throwable th) {
                C21070.m47535(this.f36635, th, executor);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m47535(final C21070 c21070, final Throwable th, final Executor executor) {
        Runnable runnable = new Runnable() { // from class: l.ۖ᩵ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C21070.m47528(this.f11336, th, executor);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            c21070.f66198.post(runnable);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47528(C21070 c21070, Throwable th, Executor executor) {
        if (c21070.f66203 || c21070.f66196 || c21070.f66195) {
            return;
        }
        if (th == null) {
            c21070.m47547(executor);
            return;
        }
        synchronized (c21070) {
            c21070.f66190 = 2;
        }
        c21070.f66188 = th;
        c21070.m47543();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47547(Executor executor) {
        this.f66201 = executor;
        if (this.f66199 == null) {
            m47540();
        } else {
            m47531(true);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m47540() {
        this.f66204 = "configuring_view";
        if (this.f66203 || this.f66196) {
            return;
        }
        if (this.f66195 || !m47537()) {
            m47545();
            return;
        }
        try {
            this.f66178 = this.f66184.m31132();
            C13693 c13693 = this.f66184;
            c13693.f38632.f34416.m19163(c13693.f38639.mo3999());
            C17143 c17143 = this.f66194;
            C13693 c13694 = this.f66184;
            C8308 c8308 = c13694.f38632.f34416;
            c17143.m38841(c8308.f22199, c8308.f22198, c13694.f38639, this.f66193);
            m47531(false);
        } catch (Throwable th) {
            synchronized (this) {
                this.f66190 = 2;
                this.f66188 = th;
                m47543();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47531(final boolean z) {
        this.f66204 = z ? "queued_open" : "queued_layout";
        synchronized (this) {
            if (this.f66195) {
                this.f66190 = 2;
                m47543();
                return;
            }
            this.f66190 = 0;
            try {
                this.f66201.execute(new Runnable() { // from class: l.ܳ᩵ᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21070.m47530(this.f48114, z);
                    }
                });
            } catch (RuntimeException e) {
                synchronized (this) {
                    this.f66190 = 2;
                    this.f66188 = e;
                    m47543();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX INFO: renamed from: ֫ */
    public static void m47530(final C21070 c21070, final boolean z) {
        final CancellationException cancellationException;
        synchronized (c21070) {
            if (c21070.f66190 != 0) {
                return;
            }
            c21070.f66190 = 1;
            c21070.f66204 = z ? "opening_session" : "preparing_layout";
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Session preparation requires a background executor");
                }
                if (c21070.f66195) {
                    throw new CancellationException("Fragment session loading was canceled");
                }
                if (z) {
                    C13693 c13693Mo7950 = c21070.f66199.mo7950(c21070.f66182);
                    c21070.f66184 = c13693Mo7950;
                    C23731 c23731 = c21070.f66185;
                    if (c23731 != null) {
                        c13693Mo7950.m31130(c23731);
                    }
                } else {
                    c21070.f66200.m32369(c21070.f66184.f38639, new InterfaceC18588() { // from class: l.ۡ᩵ᩳ
                        @Override // p067l.InterfaceC18588
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo3924() {
                            return this.f30496.f66195;
                        }
                    });
                }
                if (c21070.f66195) {
                    throw new CancellationException("Fragment session loading was canceled");
                }
                th = null;
                cancellationException = th;
                synchronized (c21070) {
                    c21070.f66190 = 2;
                }
                c21070.f66198.post(new Runnable() { // from class: l.ܺ᩵ᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21070.m47529(this.f52910, cancellationException, z);
                    }
                });
            } catch (Throwable th) {
                th = th;
                if (c21070.f66195 && !(th instanceof CancellationException)) {
                    cancellationException = new CancellationException("Fragment session loading was canceled");
                    cancellationException.addSuppressed(th);
                }
                synchronized (c21070) {
                    c21070.f66190 = 2;
                    c21070.f66198.post(new Runnable() { // from class: l.ܺ᩵ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C21070.m47529(this.f52910, cancellationException, z);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47529(C21070 c21070, Throwable th, boolean z) {
        if (c21070.f66203 || c21070.f66196) {
            return;
        }
        if (c21070.f66188 == null) {
            c21070.f66188 = th;
        }
        if (z && c21070.f66188 == null && !c21070.f66195) {
            c21070.m47540();
        } else {
            c21070.m47543();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47545() {
        C3773 c3773 = this.f66186;
        if (c3773 != null) {
            c3773.m7361();
        }
        if (this.f66203 || this.f66196) {
            return;
        }
        this.f66195 = true;
        this.f66182.cancel();
        synchronized (this) {
            if (this.f66190 == 0) {
                this.f66190 = 2;
            }
        }
        this.f66200.m32526();
        FutureC5767 futureC5767 = this.f66180;
        if (futureC5767 != null) {
            futureC5767.cancel(false);
        }
        FutureC5767 futureC5768 = this.f66181;
        if (futureC5768 != null) {
            futureC5768.cancel(false);
        }
        m47543();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47549() {
        this.f66183 = true;
        m47545();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public boolean m47537() {
        C23631 c23631 = this.f66187;
        return c23631.f75228 && c23631.f75242 == this.f66200 && c23631.f75229 == this.f66194;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m47543() {
        if (this.f66203 || this.f66196 || this.f66197) {
            return;
        }
        this.f66197 = true;
        this.f66198.post(new RunnableC19057(this));
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX INFO: renamed from: ֫ */
    public static void m47525(final C21070 c21070) {
        boolean z;
        FutureC5767 futureC5767;
        c21070.f66197 = false;
        if (c21070.f66203 || c21070.f66196) {
            return;
        }
        synchronized (c21070) {
            if (c21070.f66190 != 2) {
                if (c21070.f66195) {
                    c21070.f66182.cancel();
                    c21070.f66197 = true;
                    c21070.f66198.postDelayed(new RunnableC19057(c21070), 10L);
                }
                return;
            }
            if (!c21070.m47537()) {
                c21070.f66195 = true;
            }
            if (c21070.f66195 || c21070.f66188 != null) {
                c21070.f66182.cancel();
                if (!c21070.f66182.m8753()) {
                    c21070.f66197 = true;
                    c21070.f66198.postDelayed(new RunnableC19057(c21070), 10L);
                    return;
                }
            }
            if (c21070.f66188 == null) {
                c21070.f66188 = c21070.f66200.m32481();
            }
            if (!c21070.f66195 && c21070.f66188 == null && (futureC5767 = c21070.f66178) != null) {
                if (!futureC5767.isDone()) {
                    c21070.f66204 = "waiting_persistence";
                    c21070.f66197 = true;
                    c21070.f66198.postDelayed(new RunnableC19057(c21070), 10L);
                    return;
                } else {
                    try {
                        c21070.f66178.m12907();
                    } catch (Throwable th) {
                        c21070.f66188 = th;
                    }
                }
            }
            if (c21070.f66195 || c21070.f66188 != null) {
                c21070.f66200.m32526();
            }
            if (c21070.f66195 || c21070.f66188 != null || c21070.f66189 || !c21070.f66179) {
                z = false;
            } else {
                C14146 c14146 = c21070.f66200;
                C13693 c13693 = c21070.f66184;
                if (c14146.m32419(c13693.f38639, c13693.f38632.f34416.f22195)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (c21070.f66200.m32434() && !z) {
                c21070.f66204 = "waiting_layout";
                c21070.f66197 = true;
                c21070.f66198.postDelayed(new RunnableC19057(c21070), 10L);
                return;
            }
            if (!c21070.f66195 && c21070.f66188 == null) {
                if (c21070.f66189) {
                    return;
                }
                c21070.f66189 = true;
                c21070.f66204 = "restoring_view_state";
                try {
                    c21070.f66200.m32424();
                    c21070.f66200.m32499();
                    try {
                        FutureC5767 futureC5767M52557 = c21070.f66187.m52557(c21070.f66184, c21070.f66202, c21070.f66193);
                        c21070.f66200.m32514();
                        if (z) {
                            FutureC5767 futureC5767M32538 = c21070.f66200.m32538((InterfaceC9768) c21070.f66184.f38639);
                            c21070.f66181 = futureC5767M32538;
                            futureC5767M32538.m12887(new InterfaceC9988() { // from class: l.᩷᩵ᩳ
                                @Override // p067l.InterfaceC9988
                                /* JADX INFO: renamed from: ۧ */
                                public final void mo6895(Object obj, Throwable th2) {
                                    C21070.m47533(this.f70690, th2);
                                }
                            });
                        }
                        c21070.f66180 = futureC5767M52557;
                        futureC5767M52557.m12887(new InterfaceC9988() { // from class: l.ۢ᩵ᩳ
                            @Override // p067l.InterfaceC9988
                            /* JADX INFO: renamed from: ۧ */
                            public final void mo6895(Object obj, Throwable th2) {
                                C21070.m47526(this.f32575, th2);
                            }
                        });
                        return;
                    } catch (Throwable th2) {
                        c21070.f66200.m32514();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c21070.f66200.m32514();
                    c21070.f66188 = th3;
                    c21070.m47543();
                    return;
                }
            }
            c21070.f66204 = "releasing_failed_session";
            c21070.f66196 = true;
            FutureC5767 futureC5768 = c21070.f66181;
            if (futureC5768 != null) {
                futureC5768.cancel(false);
            }
            final Throwable cancellationException = c21070.f66188;
            if (cancellationException == null) {
                cancellationException = new CancellationException("Fragment session loading was canceled");
            }
            try {
                C13693 c13694 = c21070.f66184;
                if (c13694 != null) {
                    c21070.f66200.m32393((InterfaceC9768) c13694.f38639);
                }
                if (c21070.f66183) {
                    InterfaceC9768 interfaceC9768M32500 = c21070.f66200.m32500();
                    InterfaceC9768 interfaceC9768 = c21070.f66177;
                    if (interfaceC9768M32500 == interfaceC9768) {
                        c21070.f66200.m32393(interfaceC9768);
                    }
                }
                c21070.f66200.m32476(false);
                C13693 c13695 = c21070.f66184;
                (c13695 == null ? FutureC5767.m12882(null) : c13695.m31120()).m12887(new InterfaceC9988() { // from class: l.ܽ᩵ᩳ
                    @Override // p067l.InterfaceC9988
                    /* JADX INFO: renamed from: ۧ */
                    public final void mo6895(Object obj, Throwable th4) {
                        C21070 c21071 = this.f54903;
                        c21071.f66198.post(new Runnable() { // from class: l.ᩳ᩵ᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C21070.m47527(c21071, th4, th);
                            }
                        });
                    }
                });
            } catch (Throwable th4) {
                cancellationException.addSuppressed(th4);
                c21070.f66203 = true;
                c21070.f66187.m52567(c21070, c21070.f66184, false);
                c21070.f66200.m32406(c21070.f66193);
                c21070.f66192.m12891(cancellationException);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m47533(C21070 c21070, Throwable th) {
        if (c21070.f66203 || c21070.f66196 || c21070.f66195 || !c21070.m47537() || th != null || !c21070.f66200.m32497(c21070.f66184.f38639)) {
            return;
        }
        c21070.f66191 = true;
        C3773 c3773 = c21070.f66186;
        if (c3773 != null) {
            c3773.m7361();
        }
        c21070.f66187.m52566(c21070);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47526(C21070 c21070, Throwable th) {
        if (c21070.f66203 || c21070.f66196) {
            return;
        }
        if (th != null) {
            c21070.f66188 = th;
        }
        if (!c21070.m47537() || c21070.f66200.m32500() != c21070.f66184.f38639) {
            c21070.f66195 = true;
        }
        if (c21070.f66195 || c21070.f66188 != null) {
            c21070.m47543();
            return;
        }
        c21070.f66182.m8752();
        c21070.f66203 = true;
        FutureC5767 futureC5767 = c21070.f66181;
        if (futureC5767 != null) {
            futureC5767.cancel(false);
        }
        c21070.f66187.m52567(c21070, c21070.f66184, true);
        c21070.f66200.m32406(c21070.f66193);
        c21070.f66192.m12889(c21070.f66184);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m47527(C21070 c21070, Throwable th, Throwable th2) {
        C23731 c23731;
        C14146 c14146 = c21070.f66200;
        if (th != null) {
            th2.addSuppressed(th);
        }
        try {
            if (c21070.f66183) {
                InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
                InterfaceC9768 interfaceC9768 = c21070.f66177;
                if (interfaceC9768M32500 == interfaceC9768) {
                    c14146.m32393(interfaceC9768);
                }
            }
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        c21070.f66203 = true;
        if (c21070.f66184 == null && (c23731 = c21070.f66185) != null) {
            c23731.m52769((Throwable) null);
        }
        c21070.f66187.m52567(c21070, c21070.f66184, false);
        c14146.m32406(c21070.f66193);
        c21070.f66192.m12891(th2);
    }
}
