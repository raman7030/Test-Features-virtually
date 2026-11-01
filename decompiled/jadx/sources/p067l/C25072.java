package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩻ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6SG */
/* JADX INFO: loaded from: classes.dex */
public final class C25072 {

    /* JADX INFO: renamed from: ֫ */
    public C16354 f79986;

    /* JADX INFO: renamed from: ۖ */
    public C8467 f79987;

    /* JADX INFO: renamed from: ۘ */
    public final C24913 f79988;

    /* JADX INFO: renamed from: ۜ */
    public final Executor f79989;

    /* JADX INFO: renamed from: ۡ */
    public C16354 f79990;

    /* JADX INFO: renamed from: ۢ */
    public int f79991;

    /* JADX INFO: renamed from: ۧ */
    public final C3455 f79992;

    /* JADX INFO: renamed from: ܳ */
    public C15271 f79993;

    /* JADX INFO: renamed from: ܺ */
    public int f79994;

    /* JADX INFO: renamed from: ܽ */
    public boolean f79995;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC22097 f79996;

    /* JADX INFO: renamed from: ᩳ */
    public volatile IOException f79997;

    /* JADX INFO: renamed from: ᩴ */
    public final UUID f79998;

    /* JADX INFO: renamed from: ᩻ */
    public final FutureC5767 f80000 = new FutureC5767();

    /* JADX INFO: renamed from: ᩷ */
    public long f79999 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC22097 m55045() {
        return this.f79996;
    }

    public C25072(C24913 c24913, InterfaceC22097 interfaceC22097, C3455 c3455, Executor executor) {
        this.f79988 = c24913;
        this.f79998 = c24913.m54755();
        C12826.requireNonNull(interfaceC22097);
        this.f79996 = interfaceC22097;
        C12826.requireNonNull(c3455);
        this.f79992 = c3455;
        C12826.requireNonNull(executor);
        this.f79989 = executor;
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m55040(C15013 c15013) {
        return m55033(c15013, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final FutureC5767 m55042(C15013 c15013) {
        return m55033(c15013, true);
    }

    /* JADX INFO: renamed from: ܽ */
    public final IOException m55044() {
        return this.f79997;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m55043() throws Throwable {
        synchronized (this) {
            if (!m55038()) {
                throw new IllegalStateException("Attachment collection requires a drained queue");
            }
        }
        try {
            C13280 c13280M23109 = C9847.m23109(this.f79998, this.f79988.m54751());
            if (c13280M23109 != null) {
                InterfaceC22097 interfaceC22097 = this.f79996;
                UUID uuid = this.f79998;
                Object[] objArr = {c13280M23109};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                C12826.requireNonNull(obj);
                arrayList.add(obj);
                C13280.m30346(interfaceC22097, uuid, C21562.unmodifiableList(arrayList));
            }
            this.f79997 = null;
        } catch (IOException e) {
            this.f79997 = e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m55041(C24913 c24913) {
        return this.f79988 == c24913;
    }

    /* JADX INFO: renamed from: ֫ */
    private FutureC5767 m55033(C15013 c15013, boolean z) {
        boolean z2;
        Throwable illegalStateException;
        boolean z3;
        C16354 c16354;
        Throwable illegalStateException2;
        C16354 c16355;
        C12826.requireNonNull(c15013);
        C16354 c16356 = new C16354(c15013, z);
        synchronized (this) {
            C16354 c16357 = this.f79986;
            z2 = true;
            illegalStateException = null;
            z3 = false;
            if ((c16357 != null && c16357.f48048 == c15013) || ((c16354 = this.f79990) != null && c16354.f48048 == c15013)) {
                illegalStateException = new IllegalStateException("Checkpoint is already queued");
                c16355 = null;
            } else {
                if (this.f79995) {
                    illegalStateException2 = new IllegalStateException("Checkpoint queue is closed");
                } else if (!this.f79998.equals(c15013.m34374())) {
                    illegalStateException2 = new IllegalArgumentException("Checkpoint belongs to another session");
                } else if (c15013.m34373() <= this.f79999) {
                    illegalStateException2 = new IllegalArgumentException("Checkpoint is out of order");
                } else {
                    this.f79999 = c15013.m34373();
                    if (this.f79986 == null) {
                        this.f79986 = c16356;
                        z2 = false;
                        z3 = true;
                        c16355 = null;
                    } else {
                        c16355 = this.f79990;
                        this.f79990 = c16356;
                        if (c16355 != null) {
                            this.f79994++;
                        }
                        z2 = false;
                    }
                }
                illegalStateException = illegalStateException2;
                c16355 = null;
                z2 = false;
            }
        }
        if (illegalStateException != null) {
            if (!z2) {
                c15013.close();
            }
            c16356.f48049.m12891(illegalStateException);
        }
        if (c16355 != null) {
            m55034(c16355);
            c16355.f48049.m12891((Throwable) new CancellationException("Checkpoint was superseded or discarded"));
        }
        if (z3) {
            m55037(c16356);
        }
        return c16356.f48049.m12898((InterfaceC22729) new C5633(3));
    }

    /* JADX INFO: renamed from: ۧ */
    private void m55037(final C16354 c16354) {
        synchronized (this) {
            if (!this.f79995 && this.f79986 == c16354) {
                try {
                    this.f79989.execute(new Runnable() { // from class: l.ᩳᩴᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C25072.m55036(this.f59914, c16354);
                        }
                    });
                } catch (RuntimeException e) {
                    m55035(c16354, e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55036(C25072 c25072, C16354 c16354) {
        Throwable th;
        Long lValueOf;
        Throwable th2;
        Long l2;
        C16354 c16355;
        boolean zM55038;
        synchronized (c25072) {
            if (!c25072.f79995 && c25072.f79986 == c16354) {
                c16354.f48051 = true;
                try {
                    long jM34371 = c16354.f48048.m34371(c25072.f79996, c25072.f79992);
                    lValueOf = Long.valueOf(jM34371);
                    try {
                        if (c25072.f79993 != null) {
                            c25072.f79988.m54757(jM34371).m12907();
                            c25072.f79993.m34762(c25072.f79991, c16354.f48048.m34377(), c16354.f48048.m34376(), c16354.f48048.m34380(), c16354.f48048.m34375());
                        }
                        if (c16354.f48050) {
                            c25072.f79988.m54757(jM34371).m12907();
                            C15013 c15013 = c16354.f48048;
                            try {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(c15013.m34372());
                                C13280 c13280M23109 = C9847.m23109(c25072.f79998, c25072.f79988.m54751());
                                if (c13280M23109 != null) {
                                    arrayList.add(c13280M23109);
                                }
                                C13280.m30346(c25072.f79996, c25072.f79998, arrayList);
                                c25072.f79997 = null;
                            } catch (IOException e) {
                                c25072.f79997 = e;
                            }
                        }
                        c16354.f48048.close();
                        l2 = lValueOf;
                        th2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        c16354.f48048.close();
                        th2 = th;
                        l2 = lValueOf;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    lValueOf = null;
                }
                synchronized (c25072) {
                    c16355 = c25072.f79990;
                    c25072.f79990 = null;
                    c25072.f79986 = c16355;
                    zM55038 = c25072.m55038();
                }
                if (zM55038) {
                    c25072.f80000.m12889((Object) null);
                }
                if (th2 == null) {
                    c16354.f48049.m12889(l2);
                } else {
                    c16354.f48049.m12891(th2);
                }
                if (c16355 != null) {
                    c25072.m55037(c16355);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m55035(C16354 c16354, RuntimeException runtimeException) {
        synchronized (this) {
            C16354 c16355 = this.f79986;
            if (c16355 != c16354) {
                return;
            }
            C16354 c16356 = this.f79990;
            this.f79990 = null;
            this.f79986 = null;
            this.f79994 = 1 + (c16356 == null ? 0 : 1) + this.f79994;
            m55034(c16355);
            if (c16356 != null) {
                m55034(c16356);
            }
            c16355.f48049.m12891((Throwable) runtimeException);
            if (c16356 != null) {
                c16356.f48049.m12891((Throwable) runtimeException);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m55039() {
        C16354 c16354;
        C16354 c16355;
        C16354 c16356;
        boolean zM55038;
        synchronized (this) {
            this.f79995 = true;
            c16354 = this.f79986;
            c16355 = this.f79990;
            this.f79990 = null;
            if (c16354 == null || c16354.f48051) {
                c16356 = c16354;
                c16354 = null;
            } else {
                this.f79986 = null;
                c16356 = null;
            }
            this.f79994 = (c16354 == null ? 0 : 1) + (c16355 == null ? 0 : 1) + this.f79994;
        }
        if (c16354 != null) {
            m55034(c16354);
        }
        if (c16355 != null) {
            m55034(c16355);
        }
        if (c16356 != null) {
            c16356.f48048.close();
        }
        synchronized (this) {
            zM55038 = m55038();
        }
        if (zM55038) {
            this.f80000.m12889((Object) null);
        }
        if (c16354 != null) {
            this.f80000.m12884((Runnable) new RunnableC19037(0, c16354));
        }
        if (c16355 != null) {
            this.f80000.m12884((Runnable) new RunnableC19037(0, c16355));
        }
        return this.f80000.m12898((InterfaceC22729) new C7470());
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m55038() {
        return this.f79995 && this.f79986 == null && this.f79990 == null && this.f79994 == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m55034(C16354 c16354) {
        boolean zM55038;
        c16354.f48048.close();
        synchronized (this) {
            this.f79994--;
            zM55038 = m55038();
        }
        if (zM55038) {
            this.f80000.m12889((Object) null);
        }
    }
}
