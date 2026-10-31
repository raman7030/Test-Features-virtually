package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۧܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11125 implements Runnable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int f33383;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f33384;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33385;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f33386;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f33387;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18180 f33388;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f33389;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17474 f33390;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f33391;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C18743 f33392;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f33393;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public RunnableC1644 f33394;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f33395;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f33396;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f33397;

    public RunnableC11125(C17474 c17474, int i, C18180 c18180, int i2, int i3) {
        this.f33390 = c17474;
        this.f33384 = c17474.f10015;
        this.f33387 = c17474.m9781();
        C12392 c12392 = c17474.f10021;
        this.f33391 = c12392.m30396();
        this.f33396 = c17474.f53403.get();
        this.f33383 = c12392.m30542();
        this.f33386 = c12392.mo25898();
        this.f33392 = c12392.m30544();
        this.f33385 = i;
        this.f33388 = c18180;
        this.f33393 = i2;
        this.f33397 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27605() {
        if (this.f33395 || this.f33390.f53406 != this || this.f33390.f10026 || this.f33396 != this.f33390.f53403.get()) {
            return true;
        }
        C17474 c17474 = this.f33390;
        if (c17474.f10021.f37258 != c17474) {
            return true;
        }
        InterfaceC7785 interfaceC7785 = c17474.f10015;
        InterfaceC7785 interfaceC7786 = this.f33384;
        return (interfaceC7785 == interfaceC7786 && interfaceC7786.mo26548() == this.f33387) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z;
        Runnable runnableC23516;
        SystemClock.elapsedRealtime();
        while (true) {
            z = false;
            try {
                try {
                    if (!this.f33390.f10016 || m27605()) {
                        break;
                    } else {
                        SystemClock.sleep(10L);
                    }
                } catch (Throwable th) {
                    this.f33384.setReadOnly(false);
                    C4925.m14315(new RunnableC23516(2, this));
                    throw th;
                }
            } catch (Error | Exception e) {
                final Throwable th2 = m27605() ? null : e;
                this.f33384.setReadOnly(false);
                runnableC23516 = new Runnable() { // from class: l.ܰۧܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC11125.m27604(this.f41092, th2);
                    }
                };
            }
        }
        if (m27605()) {
            this.f33384.setReadOnly(false);
            runnableC23516 = new RunnableC23516(2, this);
        } else {
            final C7744 c7744Mo26556 = this.f33384.mo26556();
            try {
                if (c7744Mo26556.m20767() != this.f33387) {
                    c7744Mo26556.close();
                    this.f33384.setReadOnly(false);
                    runnableC23516 = new RunnableC23516(2, this);
                } else {
                    final C20736 c20736 = new C20736();
                    C23266 c23266M20763 = c7744Mo26556.m20763(this.f33386 ? c7744Mo26556.length() : 0, c7744Mo26556.length());
                    try {
                        C11747 c11747 = new C11747();
                        int i = 0;
                        int i2 = 0;
                        while (!m27605()) {
                            int iM51584 = c23266M20763.m51584();
                            int i3 = i2 + 1;
                            c11747.m28751(i, iM51584 < 0 ? c7744Mo26556.length() : iM51584, i2);
                            c20736.m47353(c11747);
                            i = iM51584 + 1;
                            if (iM51584 < 0) {
                                c23266M20763.close();
                                ArrayList<C21003> arrayListM23251 = C9008.m23251(c7744Mo26556, c20736, (C4507) null, new C22954(this));
                                ArrayList arrayList = new ArrayList(arrayListM23251.size());
                                for (final C21003 c21003 : arrayListM23251) {
                                    arrayList.add(new InterfaceC14651() { // from class: l.۟ۧܿ
                                        @Override // l.InterfaceC14651
                                        /* JADX INFO: renamed from: ֫ */
                                        public final C20736 mo13523(C14093 c14093) {
                                            RunnableC11125 runnableC11125 = this.f22846;
                                            return C17474.m40837((CharSequence) c14093, c20736, c21003, runnableC11125.f33385, runnableC11125.f33388, (BooleanSupplier) new C22954(runnableC11125));
                                        }
                                    });
                                }
                                int i4 = 0;
                                while (i4 < arrayListM23251.size() && ((C21003) arrayListM23251.get(i4)).m47821() < this.f33393) {
                                    i4++;
                                }
                                final boolean z2 = true;
                                int iMin = Math.min(arrayList.size(), Math.max(C6891.f21286, i4 + 1));
                                final C20736 c20736M18662 = C6891.m18662(new Supplier() { // from class: l.ۨۧܿ
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return c7744Mo26556.m20762();
                                    }
                                }, arrayList.subList(0, iMin), new C22954(this));
                                float fM24484 = this.f33388.f56559.m24484();
                                while (c20736M18662 != null && iMin < arrayList.size() && !m27605() && (((long) (c20736M18662.size() - C17474.m40859(c20736M18662, this.f33393))) - 1) * fM24484 <= this.f33383 + this.f33397) {
                                    int iMin2 = Math.min(arrayList.size(), C6891.f21286 + iMin);
                                    C20736 c20736M18663 = C6891.m18662(new Supplier() { // from class: l.ۨۧܿ
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            return c7744Mo26556.m20762();
                                        }
                                    }, arrayList.subList(iMin, iMin2), new C22954(this));
                                    if (c20736M18663 == null) {
                                        c7744Mo26556.close();
                                        this.f33384.setReadOnly(false);
                                        runnableC23516 = new RunnableC23516(2, this);
                                    } else {
                                        c20736M18662.m47354(c20736M18663);
                                        iMin = iMin2;
                                    }
                                }
                                if (c20736M18662 == null || m27605()) {
                                    c7744Mo26556.close();
                                    this.f33384.setReadOnly(false);
                                    runnableC23516 = new RunnableC23516(2, this);
                                } else {
                                    if (iMin == arrayList.size()) {
                                        this.f33390.m40842(arrayList.size(), C6891.f21286, c20736M18662);
                                        final int iM40859 = C17474.m40859(c20736M18662, this.f33393);
                                        C4925.m14315(new Runnable() { // from class: l.֫ܽܿ
                                            /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                RunnableC11125 runnableC11125 = this.f6518;
                                                boolean z3 = z2;
                                                C20736 c20737 = c20736M18662;
                                                int i5 = iM40859;
                                                if (runnableC11125.m27605()) {
                                                    return;
                                                }
                                                if (!runnableC11125.f33392.equals(runnableC11125.f33390.f10021.m30544()) || runnableC11125.f33385 != (runnableC11125.f33390.f53398 - runnableC11125.f33390.mo8169()) - runnableC11125.f33390.mo8162()) {
                                                    runnableC11125.f33390.m40857();
                                                    return;
                                                }
                                                if (z3 || runnableC11125.f33391 == runnableC11125.f33390.f10021.m30396()) {
                                                    synchronized (runnableC11125.f33390) {
                                                        runnableC11125.f33390.f10019 = false;
                                                        C17474 c17474 = runnableC11125.f33390;
                                                        c17474.f9998 = c20737;
                                                        c17474.f53401 = z3 ? null : c20737;
                                                        if (z3) {
                                                            runnableC11125.f33390.f53397 = c20737;
                                                            runnableC11125.f33390.f53399 = runnableC11125.f33385;
                                                            runnableC11125.f33390.f10018 = runnableC11125.f33392;
                                                        }
                                                    }
                                                    if (runnableC11125.f33391 == runnableC11125.f33390.f10021.m30396()) {
                                                        C17474 c17475 = runnableC11125.f33390;
                                                        if (c17475.f10021.m30354(c17475)) {
                                                            C12392 c12392 = runnableC11125.f33390.f10021;
                                                            c12392.m30364(c12392.m30521(c12392.m30408()));
                                                        } else {
                                                            C12392 c12393 = runnableC11125.f33390.f10021;
                                                            c12393.m30364(c12393.m30521(((int) (runnableC11125.f33388.f56559.m24484() * i5)) + runnableC11125.f33397));
                                                        }
                                                    } else {
                                                        C12392 c12394 = runnableC11125.f33390.f10021;
                                                        c12394.m30364(c12394.m30521(c12394.m30408()));
                                                    }
                                                    runnableC11125.f33390.f10021.invalidate();
                                                }
                                            }
                                        });
                                    } else {
                                        C17474 c17474 = this.f33390;
                                        int size = arrayList.size();
                                        int i5 = C6891.f21286;
                                        c17474.m40842(size, i5, c20736M18662);
                                        final int iM408510 = C17474.m40859(c20736M18662, this.f33393);
                                        C4925.m14315(new Runnable() { // from class: l.֫ܽܿ
                                            /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                RunnableC11125 runnableC11125 = this.f6518;
                                                boolean z3 = z;
                                                C20736 c20737 = c20736M18662;
                                                int i6 = iM408510;
                                                if (runnableC11125.m27605()) {
                                                    return;
                                                }
                                                if (!runnableC11125.f33392.equals(runnableC11125.f33390.f10021.m30544()) || runnableC11125.f33385 != (runnableC11125.f33390.f53398 - runnableC11125.f33390.mo8169()) - runnableC11125.f33390.mo8162()) {
                                                    runnableC11125.f33390.m40857();
                                                    return;
                                                }
                                                if (z3 || runnableC11125.f33391 == runnableC11125.f33390.f10021.m30396()) {
                                                    synchronized (runnableC11125.f33390) {
                                                        runnableC11125.f33390.f10019 = false;
                                                        C17474 c17475 = runnableC11125.f33390;
                                                        c17475.f9998 = c20737;
                                                        c17475.f53401 = z3 ? null : c20737;
                                                        if (z3) {
                                                            runnableC11125.f33390.f53397 = c20737;
                                                            runnableC11125.f33390.f53399 = runnableC11125.f33385;
                                                            runnableC11125.f33390.f10018 = runnableC11125.f33392;
                                                        }
                                                    }
                                                    if (runnableC11125.f33391 == runnableC11125.f33390.f10021.m30396()) {
                                                        C17474 c17476 = runnableC11125.f33390;
                                                        if (c17476.f10021.m30354(c17476)) {
                                                            C12392 c12394 = runnableC11125.f33390.f10021;
                                                            c12394.m30364(c12394.m30521(c12394.m30408()));
                                                        } else {
                                                            C12392 c12393 = runnableC11125.f33390.f10021;
                                                            c12393.m30364(c12393.m30521(((int) (runnableC11125.f33388.f56559.m24484() * i6)) + runnableC11125.f33397));
                                                        }
                                                    } else {
                                                        C12392 c12395 = runnableC11125.f33390.f10021;
                                                        c12395.m30364(c12395.m30521(c12395.m30408()));
                                                    }
                                                    runnableC11125.f33390.f10021.invalidate();
                                                }
                                            }
                                        });
                                        C20736 c20736M18664 = C6891.m18662(new Supplier() { // from class: l.ۨۧܿ
                                            @Override // java.util.function.Supplier
                                            public final Object get() {
                                                return c7744Mo26556.m20762();
                                            }
                                        }, arrayList.subList(iMin, arrayList.size()), new C22954(this));
                                        if (c20736M18664 == null || m27605()) {
                                            c7744Mo26556.close();
                                            this.f33384.setReadOnly(false);
                                            runnableC23516 = new RunnableC23516(2, this);
                                        } else {
                                            final C20736 c20737 = new C20736(c20736M18662);
                                            c20737.m47354(c20736M18664);
                                            this.f33390.m40842(arrayList.size(), i5, c20737);
                                            final int iM408511 = C17474.m40859(c20737, this.f33393);
                                            C4925.m14315(new Runnable() { // from class: l.֫ܽܿ
                                                /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    RunnableC11125 runnableC11125 = this.f6518;
                                                    boolean z3 = z2;
                                                    C20736 c20738 = c20737;
                                                    int i6 = iM408511;
                                                    if (runnableC11125.m27605()) {
                                                        return;
                                                    }
                                                    if (!runnableC11125.f33392.equals(runnableC11125.f33390.f10021.m30544()) || runnableC11125.f33385 != (runnableC11125.f33390.f53398 - runnableC11125.f33390.mo8169()) - runnableC11125.f33390.mo8162()) {
                                                        runnableC11125.f33390.m40857();
                                                        return;
                                                    }
                                                    if (z3 || runnableC11125.f33391 == runnableC11125.f33390.f10021.m30396()) {
                                                        synchronized (runnableC11125.f33390) {
                                                            runnableC11125.f33390.f10019 = false;
                                                            C17474 c17475 = runnableC11125.f33390;
                                                            c17475.f9998 = c20738;
                                                            c17475.f53401 = z3 ? null : c20738;
                                                            if (z3) {
                                                                runnableC11125.f33390.f53397 = c20738;
                                                                runnableC11125.f33390.f53399 = runnableC11125.f33385;
                                                                runnableC11125.f33390.f10018 = runnableC11125.f33392;
                                                            }
                                                        }
                                                        if (runnableC11125.f33391 == runnableC11125.f33390.f10021.m30396()) {
                                                            C17474 c17476 = runnableC11125.f33390;
                                                            if (c17476.f10021.m30354(c17476)) {
                                                                C12392 c12395 = runnableC11125.f33390.f10021;
                                                                c12395.m30364(c12395.m30521(c12395.m30408()));
                                                            } else {
                                                                C12392 c12393 = runnableC11125.f33390.f10021;
                                                                c12393.m30364(c12393.m30521(((int) (runnableC11125.f33388.f56559.m24484() * i6)) + runnableC11125.f33397));
                                                            }
                                                        } else {
                                                            C12392 c12396 = runnableC11125.f33390.f10021;
                                                            c12396.m30364(c12396.m30521(c12396.m30408()));
                                                        }
                                                        runnableC11125.f33390.f10021.invalidate();
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    c7744Mo26556.close();
                                    this.f33384.setReadOnly(false);
                                    runnableC23516 = new RunnableC23516(2, this);
                                }
                            } else {
                                i2 = i3;
                            }
                        }
                        c23266M20763.close();
                        c7744Mo26556.close();
                        this.f33384.setReadOnly(false);
                        runnableC23516 = new RunnableC23516(2, this);
                    } catch (Throwable th3) {
                        try {
                            c23266M20763.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c7744Mo26556.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        }
        C4925.m14315(runnableC23516);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27604(RunnableC11125 runnableC11125, Throwable th) {
        C17474 c17474;
        try {
            if (runnableC11125.f33390.f53406 == runnableC11125) {
                if (!runnableC11125.f33389 || runnableC11125.f33390.f10026) {
                    if (th != null && !runnableC11125.m27605()) {
                        runnableC11125.f33390.f53396 = th;
                    }
                    runnableC11125.f33390.f53406 = null;
                    c17474 = runnableC11125.f33390;
                    if (c17474.f9998 != c17474.f53397) {
                        C17474 c17475 = runnableC11125.f33390;
                        c17475.f9998 = c17475.f53397;
                    }
                    runnableC11125.f33390.f53401 = null;
                    if (!runnableC11125.f33390.f10016) {
                        runnableC11125.f33390.f10019 = false;
                    }
                    runnableC11125.f33390.f10021.invalidate();
                    C17474 c17476 = runnableC11125.f33390;
                    c17476.f10021.m30500(c17476);
                } else {
                    C17474 c17477 = runnableC11125.f33390;
                    if (c17477.f10021.f37258 == c17477) {
                        InterfaceC7785 interfaceC7785 = c17477.f10015;
                        InterfaceC7785 interfaceC7786 = runnableC11125.f33384;
                        if (interfaceC7785 != interfaceC7786 || interfaceC7786.mo26548() != runnableC11125.f33387 || runnableC11125.f33396 != runnableC11125.f33390.f53403.get()) {
                            if (th != null) {
                                runnableC11125.f33390.f53396 = th;
                            }
                            runnableC11125.f33390.f53406 = null;
                            c17474 = runnableC11125.f33390;
                            if (c17474.f9998 != c17474.f53397) {
                                C17474 c17478 = runnableC11125.f33390;
                                c17478.f9998 = c17478.f53397;
                            }
                            runnableC11125.f33390.f53401 = null;
                            if (!runnableC11125.f33390.f10016) {
                                runnableC11125.f33390.f10019 = false;
                            }
                            runnableC11125.f33390.f10021.invalidate();
                            C17474 c17479 = runnableC11125.f33390;
                            c17479.f10021.m30500(c17479);
                        }
                    } else {
                        if (th != null) {
                            runnableC11125.f33390.f53396 = th;
                        }
                        runnableC11125.f33390.f53406 = null;
                        c17474 = runnableC11125.f33390;
                        if (c17474.f9998 != c17474.f53397) {
                            C17474 c174710 = runnableC11125.f33390;
                            c174710.f9998 = c174710.f53397;
                        }
                        runnableC11125.f33390.f53401 = null;
                        if (!runnableC11125.f33390.f10016) {
                            runnableC11125.f33390.f10019 = false;
                        }
                        runnableC11125.f33390.f10021.invalidate();
                        C17474 c174711 = runnableC11125.f33390;
                        c174711.f10021.m30500(c174711);
                    }
                }
            }
        } finally {
            runnableC11125.f33394.run();
        }
    }
}
