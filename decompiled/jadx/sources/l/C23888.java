package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.᩻ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6SG */
/* JADX INFO: loaded from: classes.dex */
public final class C23888 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14715 f77235;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6417 f77236;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23721 f77237;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Executor f77238;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C14715 f77239;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f77240;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1143 f77241;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13576 f77242;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f77243;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f77244;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f77245;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile IOException f77246;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final UUID f77247;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f77249 = new FutureC3575();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f77248 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m52636() {
        return this.f77245;
    }

    public C23888(C23721 c23721, InterfaceC20758 interfaceC20758, C1143 c1143, Executor executor) {
        this.f77237 = c23721;
        this.f77247 = c23721.m52352();
        C11003.requireNonNull(interfaceC20758);
        this.f77245 = interfaceC20758;
        C11003.requireNonNull(c1143);
        this.f77241 = c1143;
        C11003.requireNonNull(executor);
        this.f77238 = executor;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52631(C13304 c13304) {
        return m52624(c13304, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52633(C13304 c13304) {
        return m52624(c13304, true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final IOException m52635() {
        return this.f77246;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52634() throws Throwable {
        synchronized (this) {
            if (!m52629()) {
                throw new IllegalStateException("Attachment collection requires a drained queue");
            }
        }
        try {
            C11481 c11481M21144 = C7869.m21144(this.f77247, this.f77237.m52348());
            if (c11481M21144 != null) {
                InterfaceC20758 interfaceC20758 = this.f77245;
                UUID uuid = this.f77247;
                Object[] objArr = {c11481M21144};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                C11003.requireNonNull(obj);
                arrayList.add(obj);
                C11481.m28302(interfaceC20758, uuid, C20195.unmodifiableList(arrayList));
            }
            this.f77246 = null;
        } catch (IOException e) {
            this.f77246 = e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52632(C23721 c23721) {
        return this.f77237 == c23721;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private FutureC3575 m52624(C13304 c13304, boolean z) {
        boolean z2;
        Throwable illegalStateException;
        boolean z3;
        C14715 c14715;
        Throwable illegalStateException2;
        C14715 c14716;
        C11003.requireNonNull(c13304);
        C14715 c14717 = new C14715(c13304, z);
        synchronized (this) {
            C14715 c14718 = this.f77235;
            z2 = true;
            illegalStateException = null;
            z3 = false;
            if ((c14718 != null && c14718.f44934 == c13304) || ((c14715 = this.f77239) != null && c14715.f44934 == c13304)) {
                illegalStateException = new IllegalStateException("Checkpoint is already queued");
                c14716 = null;
            } else {
                if (this.f77244) {
                    illegalStateException2 = new IllegalStateException("Checkpoint queue is closed");
                } else if (!this.f77247.equals(c13304.m32273())) {
                    illegalStateException2 = new IllegalArgumentException("Checkpoint belongs to another session");
                } else if (c13304.m32272() <= this.f77248) {
                    illegalStateException2 = new IllegalArgumentException("Checkpoint is out of order");
                } else {
                    this.f77248 = c13304.m32272();
                    if (this.f77235 == null) {
                        this.f77235 = c14717;
                        z2 = false;
                        z3 = true;
                        c14716 = null;
                    } else {
                        c14716 = this.f77239;
                        this.f77239 = c14717;
                        if (c14716 != null) {
                            this.f77243++;
                        }
                        z2 = false;
                    }
                }
                illegalStateException = illegalStateException2;
                c14716 = null;
                z2 = false;
            }
        }
        if (illegalStateException != null) {
            if (!z2) {
                c13304.close();
            }
            c14717.f44935.m10914(illegalStateException);
        }
        if (c14716 != null) {
            m52625(c14716);
            c14716.f44935.m10914((Throwable) new CancellationException("Checkpoint was superseded or discarded"));
        }
        if (z3) {
            m52628(c14717);
        }
        return c14717.f44935.m10921((InterfaceC21423) new C3435(3));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52628(final C14715 c14715) {
        synchronized (this) {
            if (!this.f77244 && this.f77235 == c14715) {
                try {
                    this.f77238.execute(new Runnable() { // from class: l.ᩳᩴᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23888.m52627(this.f56696, c14715);
                        }
                    });
                } catch (RuntimeException e) {
                    m52626(c14715, e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52627(C23888 c23888, C14715 c14715) {
        Throwable th;
        Long lValueOf;
        Throwable th2;
        Long l2;
        C14715 c14716;
        boolean zM52629;
        synchronized (c23888) {
            if (!c23888.f77244 && c23888.f77235 == c14715) {
                c14715.f44937 = true;
                try {
                    long jM32270 = c14715.f44934.m32270(c23888.f77245, c23888.f77241);
                    lValueOf = Long.valueOf(jM32270);
                    try {
                        if (c23888.f77242 != null) {
                            c23888.f77237.m52354(jM32270).m10930();
                            c23888.f77242.m32650(c23888.f77240, c14715.f44934.m32276(), c14715.f44934.m32275(), c14715.f44934.m32279(), c14715.f44934.m32274());
                        }
                        if (c14715.f44936) {
                            c23888.f77237.m52354(jM32270).m10930();
                            C13304 c13304 = c14715.f44934;
                            try {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(c13304.m32271());
                                C11481 c11481M21144 = C7869.m21144(c23888.f77247, c23888.f77237.m52348());
                                if (c11481M21144 != null) {
                                    arrayList.add(c11481M21144);
                                }
                                C11481.m28302(c23888.f77245, c23888.f77247, arrayList);
                                c23888.f77246 = null;
                            } catch (IOException e) {
                                c23888.f77246 = e;
                            }
                        }
                        c14715.f44934.close();
                        l2 = lValueOf;
                        th2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        c14715.f44934.close();
                        th2 = th;
                        l2 = lValueOf;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    lValueOf = null;
                }
                synchronized (c23888) {
                    c14716 = c23888.f77239;
                    c23888.f77239 = null;
                    c23888.f77235 = c14716;
                    zM52629 = c23888.m52629();
                }
                if (zM52629) {
                    c23888.f77249.m10912((Object) null);
                }
                if (th2 == null) {
                    c14715.f44935.m10912(l2);
                } else {
                    c14715.f44935.m10914(th2);
                }
                if (c14716 != null) {
                    c23888.m52628(c14716);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52626(C14715 c14715, RuntimeException runtimeException) {
        synchronized (this) {
            C14715 c14716 = this.f77235;
            if (c14716 != c14715) {
                return;
            }
            C14715 c14717 = this.f77239;
            this.f77239 = null;
            this.f77235 = null;
            this.f77243 = 1 + (c14717 == null ? 0 : 1) + this.f77243;
            m52625(c14716);
            if (c14717 != null) {
                m52625(c14717);
            }
            c14716.f44935.m10914((Throwable) runtimeException);
            if (c14717 != null) {
                c14717.f44935.m10914((Throwable) runtimeException);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52630() {
        C14715 c14715;
        C14715 c14716;
        C14715 c14717;
        boolean zM52629;
        synchronized (this) {
            this.f77244 = true;
            c14715 = this.f77235;
            c14716 = this.f77239;
            this.f77239 = null;
            if (c14715 == null || c14715.f44937) {
                c14717 = c14715;
                c14715 = null;
            } else {
                this.f77235 = null;
                c14717 = null;
            }
            this.f77243 = (c14715 == null ? 0 : 1) + (c14716 == null ? 0 : 1) + this.f77243;
        }
        if (c14715 != null) {
            m52625(c14715);
        }
        if (c14716 != null) {
            m52625(c14716);
        }
        if (c14717 != null) {
            c14717.f44934.close();
        }
        synchronized (this) {
            zM52629 = m52629();
        }
        if (zM52629) {
            this.f77249.m10912((Object) null);
        }
        if (c14715 != null) {
            this.f77249.m10907((Runnable) new RunnableC17538(0, c14715));
        }
        if (c14716 != null) {
            this.f77249.m10907((Runnable) new RunnableC17538(0, c14716));
        }
        return this.f77249.m10921((InterfaceC21423) new C5368());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m52629() {
        return this.f77244 && this.f77235 == null && this.f77239 == null && this.f77243 == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52625(C14715 c14715) {
        boolean zM52629;
        c14715.f44934.close();
        synchronized (this) {
            this.f77243--;
            zM52629 = m52629();
        }
        if (zM52629) {
            this.f77249.m10912((Object) null);
        }
    }
}
