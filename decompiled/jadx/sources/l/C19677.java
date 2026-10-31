package l;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.alipay.sdk.m.y.k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩵᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16SF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19677 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f63556;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public FutureC3575 f63557;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f63559;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f63560;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f63562;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C11915 f63563;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22477 f63564;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C1478 f63565;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C22372 f63566;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Throwable f63567;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f63568;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f63569;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f63570;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C21565 f63572;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C15545 f63573;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f63574;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f63575;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f63576;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC18971 f63578;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12392 f63579;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Executor f63580;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f63581;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f63582;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Handler f63577 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f63571 = new FutureC3575();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C2037 f63561 = new C2037();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile String f63583 = "waiting_directory";

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f63558 = true;

    public C19677(C22372 c22372, InterfaceC18971 interfaceC18971, int i) {
        this.f63566 = c22372;
        C12392 c12392 = c22372.f72517;
        this.f63579 = c12392;
        this.f63573 = c22372.f72504;
        this.f63578 = interfaceC18971;
        this.f63581 = i;
        this.f63556 = c12392.m30436();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m45253() {
        return this.f63578 != null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m45254() {
        return this.f63571.m10921((InterfaceC21423) new C6976());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45249(String str, InterfaceC20758 interfaceC20758) {
        C1478 c1478 = new C1478(new C4154(this), new C23909(interfaceC20758, str));
        this.f63565 = c1478;
        c1478.m5118();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m45235(C19677 c19677) {
        int i;
        String str;
        String str2;
        synchronized (c19677) {
            i = c19677.f63569;
        }
        StringBuilder sb = new StringBuilder("stage=");
        sb.append(c19677.f63583);
        sb.append("\nworkerState=");
        sb.append(i);
        sb.append("\napplyingState=");
        sb.append(c19677.f63568);
        sb.append("\ncleaning=");
        sb.append(c19677.f63575);
        sb.append("\ncanceled=");
        sb.append(c19677.f63574);
        sb.append("\ndirectoryReady=");
        C22477 c22477 = c19677.f63564;
        sb.append(c22477 == null || c22477.m50427().isDone());
        sb.append("\npersistence=");
        FutureC3575 futureC3575 = c19677.f63557;
        if (futureC3575 == null) {
            str = "absent";
        } else if (futureC3575.isDone()) {
            str = futureC3575.m10931() ? k.j : "done";
        } else {
            str = "pending";
        }
        sb.append(str);
        sb.append("\nrestoration=");
        FutureC3575 futureC3576 = c19677.f63559;
        if (futureC3576 == null) {
            str2 = "absent";
        } else if (futureC3576.isDone()) {
            str2 = futureC3576.m10931() ? k.j : "done";
        } else {
            str2 = "pending";
        }
        sb.append(str2);
        sb.append("\nfailure=");
        sb.append(Log.getStackTraceString(c19677.f63567));
        sb.append("\n");
        sb.append(c19677.f63579.m30368());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45251(C22477 c22477, final Executor executor) {
        this.f63564 = c22477;
        c22477.m50427().m10910(new InterfaceC8017() { // from class: l.ۧ᩵ᩳ
            @Override // l.InterfaceC8017
            /* JADX INFO: renamed from: ۧ */
            public final void mo4663(Object obj, Throwable th) {
                C19677.m45238(this.f33636, th, executor);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45238(final C19677 c19677, final Throwable th, final Executor executor) {
        Runnable runnable = new Runnable() { // from class: l.ۖ᩵ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C19677.m45231(this.f8542, th, executor);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            c19677.f63577.post(runnable);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45231(C19677 c19677, Throwable th, Executor executor) {
        if (c19677.f63582 || c19677.f63575 || c19677.f63574) {
            return;
        }
        if (th == null) {
            c19677.m45250(executor);
            return;
        }
        synchronized (c19677) {
            c19677.f63569 = 2;
        }
        c19677.f63567 = th;
        c19677.m45246();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45250(Executor executor) {
        this.f63580 = executor;
        if (this.f63578 == null) {
            m45243();
        } else {
            m45234(true);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m45243() {
        this.f63583 = "configuring_view";
        if (this.f63582 || this.f63575) {
            return;
        }
        if (this.f63574 || !m45240()) {
            m45248();
            return;
        }
        try {
            this.f63557 = this.f63563.m29080();
            C11915 c11915 = this.f63563;
            c11915.f35623.f31452.m17225(c11915.f35630.mo1601());
            C15545 c15545 = this.f63573;
            C11915 c11916 = this.f63563;
            C6249 c6249 = c11916.f35623.f31452;
            c15545.m36680(c6249.f19335, c6249.f19334, c11916.f35630, this.f63572);
            m45234(false);
        } catch (Throwable th) {
            synchronized (this) {
                this.f63569 = 2;
                this.f63567 = th;
                m45246();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45234(final boolean z) {
        this.f63583 = z ? "queued_open" : "queued_layout";
        synchronized (this) {
            if (this.f63574) {
                this.f63569 = 2;
                m45246();
                return;
            }
            this.f63569 = 0;
            try {
                this.f63580.execute(new Runnable() { // from class: l.ܳ᩵ᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19677.m45233(this.f45001, z);
                    }
                });
            } catch (RuntimeException e) {
                synchronized (this) {
                    this.f63569 = 2;
                    this.f63567 = e;
                    m45246();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45233(final C19677 c19677, final boolean z) {
        final CancellationException cancellationException;
        synchronized (c19677) {
            if (c19677.f63569 != 0) {
                return;
            }
            c19677.f63569 = 1;
            c19677.f63583 = z ? "opening_session" : "preparing_layout";
            try {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Session preparation requires a background executor");
                }
                if (c19677.f63574) {
                    throw new CancellationException("Fragment session loading was canceled");
                }
                if (z) {
                    C11915 c11915Mo5717 = c19677.f63578.mo5717(c19677.f63561);
                    c19677.f63563 = c11915Mo5717;
                    C22477 c22477 = c19677.f63564;
                    if (c22477 != null) {
                        c11915Mo5717.m29078(c22477);
                    }
                } else {
                    c19677.f63579.m30305(c19677.f63563.f35630, new InterfaceC17066() { // from class: l.ۡ᩵ᩳ
                        @Override // l.InterfaceC17066
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo1526() {
                            return this.f27559.f63574;
                        }
                    });
                }
                if (c19677.f63574) {
                    throw new CancellationException("Fragment session loading was canceled");
                }
                th = null;
                cancellationException = th;
                synchronized (c19677) {
                    c19677.f63569 = 2;
                }
                c19677.f63577.post(new Runnable() { // from class: l.ܺ᩵ᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19677.m45232(this.f49744, cancellationException, z);
                    }
                });
            } catch (Throwable th) {
                th = th;
                if (c19677.f63574 && !(th instanceof CancellationException)) {
                    cancellationException = new CancellationException("Fragment session loading was canceled");
                    cancellationException.addSuppressed(th);
                }
                synchronized (c19677) {
                    c19677.f63569 = 2;
                    c19677.f63577.post(new Runnable() { // from class: l.ܺ᩵ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19677.m45232(this.f49744, cancellationException, z);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45232(C19677 c19677, Throwable th, boolean z) {
        if (c19677.f63582 || c19677.f63575) {
            return;
        }
        if (c19677.f63567 == null) {
            c19677.f63567 = th;
        }
        if (z && c19677.f63567 == null && !c19677.f63574) {
            c19677.m45243();
        } else {
            c19677.m45246();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45248() {
        C1478 c1478 = this.f63565;
        if (c1478 != null) {
            c1478.m5119();
        }
        if (this.f63582 || this.f63575) {
            return;
        }
        this.f63574 = true;
        this.f63561.cancel();
        synchronized (this) {
            if (this.f63569 == 0) {
                this.f63569 = 2;
            }
        }
        this.f63579.m30462();
        FutureC3575 futureC3575 = this.f63559;
        if (futureC3575 != null) {
            futureC3575.cancel(false);
        }
        FutureC3575 futureC3576 = this.f63560;
        if (futureC3576 != null) {
            futureC3576.cancel(false);
        }
        m45246();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45252() {
        this.f63562 = true;
        m45248();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean m45240() {
        C22372 c22372 = this.f63566;
        return c22372.f72503 && c22372.f72517 == this.f63579 && c22372.f72504 == this.f63573;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m45246() {
        if (this.f63582 || this.f63575 || this.f63576) {
            return;
        }
        this.f63576 = true;
        this.f63577.post(new RunnableC17559(this));
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45228(final C19677 c19677) {
        boolean z;
        FutureC3575 futureC3575;
        c19677.f63576 = false;
        if (c19677.f63582 || c19677.f63575) {
            return;
        }
        synchronized (c19677) {
            if (c19677.f63569 != 2) {
                if (c19677.f63574) {
                    c19677.f63561.cancel();
                    c19677.f63576 = true;
                    c19677.f63577.postDelayed(new RunnableC17559(c19677), 10L);
                }
                return;
            }
            if (!c19677.m45240()) {
                c19677.f63574 = true;
            }
            if (c19677.f63574 || c19677.f63567 != null) {
                c19677.f63561.cancel();
                if (!c19677.f63561.m6627()) {
                    c19677.f63576 = true;
                    c19677.f63577.postDelayed(new RunnableC17559(c19677), 10L);
                    return;
                }
            }
            if (c19677.f63567 == null) {
                c19677.f63567 = c19677.f63579.m30417();
            }
            if (!c19677.f63574 && c19677.f63567 == null && (futureC3575 = c19677.f63557) != null) {
                if (!futureC3575.isDone()) {
                    c19677.f63583 = "waiting_persistence";
                    c19677.f63576 = true;
                    c19677.f63577.postDelayed(new RunnableC17559(c19677), 10L);
                    return;
                } else {
                    try {
                        c19677.f63557.m10930();
                    } catch (Throwable th) {
                        c19677.f63567 = th;
                    }
                }
            }
            if (c19677.f63574 || c19677.f63567 != null) {
                c19677.f63579.m30462();
            }
            if (c19677.f63574 || c19677.f63567 != null || c19677.f63568 || !c19677.f63558) {
                z = false;
            } else {
                C12392 c12392 = c19677.f63579;
                C11915 c11915 = c19677.f63563;
                if (c12392.m30355(c11915.f35630, c11915.f35623.f31452.f19331)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (c19677.f63579.m30370() && !z) {
                c19677.f63583 = "waiting_layout";
                c19677.f63576 = true;
                c19677.f63577.postDelayed(new RunnableC17559(c19677), 10L);
                return;
            }
            if (!c19677.f63574 && c19677.f63567 == null) {
                if (c19677.f63568) {
                    return;
                }
                c19677.f63568 = true;
                c19677.f63583 = "restoring_view_state";
                try {
                    c19677.f63579.m30360();
                    c19677.f63579.m30435();
                    try {
                        FutureC3575 futureC3575M50217 = c19677.f63566.m50217(c19677.f63563, c19677.f63581, c19677.f63572);
                        c19677.f63579.m30450();
                        if (z) {
                            FutureC3575 futureC3575M30474 = c19677.f63579.m30474((InterfaceC7785) c19677.f63563.f35630);
                            c19677.f63560 = futureC3575M30474;
                            futureC3575M30474.m10910(new InterfaceC8017() { // from class: l.᩷᩵ᩳ
                                @Override // l.InterfaceC8017
                                /* JADX INFO: renamed from: ۧ */
                                public final void mo4663(Object obj, Throwable th2) {
                                    C19677.m45236(this.f68008, th2);
                                }
                            });
                        }
                        c19677.f63559 = futureC3575M50217;
                        futureC3575M50217.m10910(new InterfaceC8017() { // from class: l.ۢ᩵ᩳ
                            @Override // l.InterfaceC8017
                            /* JADX INFO: renamed from: ۧ */
                            public final void mo4663(Object obj, Throwable th2) {
                                C19677.m45229(this.f29624, th2);
                            }
                        });
                        return;
                    } catch (Throwable th2) {
                        c19677.f63579.m30450();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c19677.f63579.m30450();
                    c19677.f63567 = th3;
                    c19677.m45246();
                    return;
                }
            }
            c19677.f63583 = "releasing_failed_session";
            c19677.f63575 = true;
            FutureC3575 futureC3576 = c19677.f63560;
            if (futureC3576 != null) {
                futureC3576.cancel(false);
            }
            final Throwable cancellationException = c19677.f63567;
            if (cancellationException == null) {
                cancellationException = new CancellationException("Fragment session loading was canceled");
            }
            try {
                C11915 c11916 = c19677.f63563;
                if (c11916 != null) {
                    c19677.f63579.m30329((InterfaceC7785) c11916.f35630);
                }
                if (c19677.f63562) {
                    InterfaceC7785 interfaceC7785M30436 = c19677.f63579.m30436();
                    InterfaceC7785 interfaceC7785 = c19677.f63556;
                    if (interfaceC7785M30436 == interfaceC7785) {
                        c19677.f63579.m30329(interfaceC7785);
                    }
                }
                c19677.f63579.m30412(false);
                C11915 c11917 = c19677.f63563;
                (c11917 == null ? FutureC3575.m10905(null) : c11917.m29068()).m10910(new InterfaceC8017() { // from class: l.ܽ᩵ᩳ
                    @Override // l.InterfaceC8017
                    /* JADX INFO: renamed from: ۧ */
                    public final void mo4663(Object obj, Throwable th4) {
                        C19677 c19678 = this.f51723;
                        c19678.f63577.post(new Runnable() { // from class: l.ᩳ᩵ᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C19677.m45230(c19678, th4, th);
                            }
                        });
                    }
                });
            } catch (Throwable th4) {
                cancellationException.addSuppressed(th4);
                c19677.f63582 = true;
                c19677.f63566.m50227(c19677, c19677.f63563, false);
                c19677.f63579.m30342(c19677.f63572);
                c19677.f63571.m10914(cancellationException);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45236(C19677 c19677, Throwable th) {
        if (c19677.f63582 || c19677.f63575 || c19677.f63574 || !c19677.m45240() || th != null || !c19677.f63579.m30433(c19677.f63563.f35630)) {
            return;
        }
        c19677.f63570 = true;
        C1478 c1478 = c19677.f63565;
        if (c1478 != null) {
            c1478.m5119();
        }
        c19677.f63566.m50226(c19677);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45229(C19677 c19677, Throwable th) {
        if (c19677.f63582 || c19677.f63575) {
            return;
        }
        if (th != null) {
            c19677.f63567 = th;
        }
        if (!c19677.m45240() || c19677.f63579.m30436() != c19677.f63563.f35630) {
            c19677.f63574 = true;
        }
        if (c19677.f63574 || c19677.f63567 != null) {
            c19677.m45246();
            return;
        }
        c19677.f63561.m6626();
        c19677.f63582 = true;
        FutureC3575 futureC3575 = c19677.f63560;
        if (futureC3575 != null) {
            futureC3575.cancel(false);
        }
        c19677.f63566.m50227(c19677, c19677.f63563, true);
        c19677.f63579.m30342(c19677.f63572);
        c19677.f63571.m10912(c19677.f63563);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45230(C19677 c19677, Throwable th, Throwable th2) {
        C22477 c22477;
        C12392 c12392 = c19677.f63579;
        if (th != null) {
            th2.addSuppressed(th);
        }
        try {
            if (c19677.f63562) {
                InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
                InterfaceC7785 interfaceC7785 = c19677.f63556;
                if (interfaceC7785M30436 == interfaceC7785) {
                    c12392.m30329(interfaceC7785);
                }
            }
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        c19677.f63582 = true;
        if (c19677.f63563 == null && (c22477 = c19677.f63564) != null) {
            c22477.m50428((Throwable) null);
        }
        c19677.f63566.m50227(c19677, c19677.f63563, false);
        c12392.m30342(c19677.f63572);
        c19677.f63571.m10914(th2);
    }
}
