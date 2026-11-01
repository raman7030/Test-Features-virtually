package p067l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۧܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12942 implements Runnable {

    /* JADX INFO: renamed from: ֫֫ */
    public final int f36383;

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC9768 f36384;

    /* JADX INFO: renamed from: ۙ */
    public final int f36385;

    /* JADX INFO: renamed from: ۛ */
    public final boolean f36386;

    /* JADX INFO: renamed from: ۟ */
    public final int f36387;

    /* JADX INFO: renamed from: ۤ */
    public final C19647 f36388;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f36389;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C18976 f36390;

    /* JADX INFO: renamed from: ۫ */
    public final int f36391;

    /* JADX INFO: renamed from: ۬ */
    public final C20182 f36392;

    /* JADX INFO: renamed from: ܰ */
    public final int f36393;

    /* JADX INFO: renamed from: ᩶ */
    public RunnableC3931 f36394;

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f36395;

    /* JADX INFO: renamed from: ᩹ */
    public final int f36396;

    /* JADX INFO: renamed from: ᩺ */
    public final int f36397;

    public RunnableC12942(C18976 c18976, int i, C19647 c19647, int i2, int i3) {
        this.f36390 = c18976;
        this.f36384 = c18976.f12815;
        this.f36387 = c18976.m11825();
        C14146 c14146 = c18976.f12821;
        this.f36391 = c14146.m32460();
        this.f36396 = c18976.f56590.get();
        this.f36383 = c14146.m32606();
        this.f36386 = c14146.mo27920();
        this.f36392 = c14146.m32608();
        this.f36385 = i;
        this.f36388 = c19647;
        this.f36393 = i2;
        this.f36397 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29667() {
        if (this.f36395 || this.f36390.f56593 != this || this.f36390.f12826 || this.f36396 != this.f36390.f56590.get()) {
            return true;
        }
        C18976 c18976 = this.f36390;
        if (c18976.f12821.f40275 != c18976) {
            return true;
        }
        InterfaceC9768 interfaceC9768 = c18976.f12815;
        InterfaceC9768 interfaceC9769 = this.f36384;
        return (interfaceC9768 == interfaceC9769 && interfaceC9769.mo28581() == this.f36387) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z;
        Runnable runnableC24718;
        SystemClock.elapsedRealtime();
        while (true) {
            z = false;
            try {
                try {
                    if (!this.f36390.f12816 || m29667()) {
                        break;
                    } else {
                        SystemClock.sleep(10L);
                    }
                } catch (Throwable th) {
                    this.f36384.setReadOnly(false);
                    C7050.m16212(new RunnableC24718(2, this));
                    throw th;
                }
            } catch (Error | Exception e) {
                final Throwable th2 = m29667() ? null : e;
                this.f36384.setReadOnly(false);
                runnableC24718 = new Runnable() { // from class: l.ܰۧܿ
                    @Override // java.lang.Runnable
                    public final void run() {
                        RunnableC12942.m29666(this.f44169, th2);
                    }
                };
            }
        }
        if (m29667()) {
            this.f36384.setReadOnly(false);
            runnableC24718 = new RunnableC24718(2, this);
        } else {
            final C9729 c9729Mo28589 = this.f36384.mo28589();
            try {
                if (c9729Mo28589.m22747() != this.f36387) {
                    c9729Mo28589.close();
                    this.f36384.setReadOnly(false);
                    runnableC24718 = new RunnableC24718(2, this);
                } else {
                    final C22076 c22076 = new C22076();
                    C24481 c24481M22743 = c9729Mo28589.m22743(this.f36386 ? c9729Mo28589.length() : 0, c9729Mo28589.length());
                    try {
                        C13533 c13533 = new C13533();
                        int i = 0;
                        int i2 = 0;
                        while (!m29667()) {
                            int iM53980 = c24481M22743.m53980();
                            int i3 = i2 + 1;
                            c13533.m30799(i, iM53980 < 0 ? c9729Mo28589.length() : iM53980, i2);
                            c22076.m49680(c13533);
                            i = iM53980 + 1;
                            if (iM53980 < 0) {
                                c24481M22743.close();
                                ArrayList<C22330> arrayListM25195 = C10930.m25195(c9729Mo28589, c22076, (C6652) null, new C24184(this));
                                ArrayList arrayList = new ArrayList(arrayListM25195.size());
                                for (final C22330 c22330 : arrayListM25195) {
                                    arrayList.add(new InterfaceC16293() { // from class: l.۟ۧܿ
                                        @Override // p067l.InterfaceC16293
                                        /* JADX INFO: renamed from: ֫ */
                                        public final C22076 mo15412(C15763 c15763) {
                                            RunnableC12942 runnableC12942 = this.f25759;
                                            return C18976.m43095((CharSequence) c15763, c22076, c22330, runnableC12942.f36385, runnableC12942.f36388, (BooleanSupplier) new C24184(runnableC12942));
                                        }
                                    });
                                }
                                int i4 = 0;
                                while (i4 < arrayListM25195.size() && ((C22330) arrayListM25195.get(i4)).m50151() < this.f36393) {
                                    i4++;
                                }
                                final boolean z2 = true;
                                int iMin = Math.min(arrayList.size(), Math.max(C8918.f24163, i4 + 1));
                                final C22076 c22076M20611 = C8918.m20611(new Supplier() { // from class: l.ۨۧܿ
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return c9729Mo28589.m22742();
                                    }
                                }, arrayList.subList(0, iMin), new C24184(this));
                                float fM26496 = this.f36388.f59772.m26496();
                                while (c22076M20611 != null && iMin < arrayList.size() && !m29667() && (((long) (c22076M20611.size() - C18976.m43117(c22076M20611, this.f36393))) - 1) * fM26496 <= this.f36383 + this.f36397) {
                                    int iMin2 = Math.min(arrayList.size(), C8918.f24163 + iMin);
                                    C22076 c22076M20612 = C8918.m20611(new Supplier() { // from class: l.ۨۧܿ
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            return c9729Mo28589.m22742();
                                        }
                                    }, arrayList.subList(iMin, iMin2), new C24184(this));
                                    if (c22076M20612 == null) {
                                        c9729Mo28589.close();
                                        this.f36384.setReadOnly(false);
                                        runnableC24718 = new RunnableC24718(2, this);
                                    } else {
                                        c22076M20611.m49681(c22076M20612);
                                        iMin = iMin2;
                                    }
                                }
                                if (c22076M20611 == null || m29667()) {
                                    c9729Mo28589.close();
                                    this.f36384.setReadOnly(false);
                                    runnableC24718 = new RunnableC24718(2, this);
                                } else {
                                    if (iMin == arrayList.size()) {
                                        this.f36390.m43100(arrayList.size(), C8918.f24163, c22076M20611);
                                        final int iM43117 = C18976.m43117(c22076M20611, this.f36393);
                                        C7050.m16212(new Runnable() { // from class: l.֫ܽܿ
                                            /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                RunnableC12942 runnableC12942 = this.f9297;
                                                boolean z3 = z2;
                                                C22076 c22077 = c22076M20611;
                                                int i5 = iM43117;
                                                if (runnableC12942.m29667()) {
                                                    return;
                                                }
                                                if (!runnableC12942.f36392.equals(runnableC12942.f36390.f12821.m32608()) || runnableC12942.f36385 != (runnableC12942.f36390.f56585 - runnableC12942.f36390.mo10202()) - runnableC12942.f36390.mo10195()) {
                                                    runnableC12942.f36390.m43115();
                                                    return;
                                                }
                                                if (z3 || runnableC12942.f36391 == runnableC12942.f36390.f12821.m32460()) {
                                                    synchronized (runnableC12942.f36390) {
                                                        runnableC12942.f36390.f12819 = false;
                                                        C18976 c18976 = runnableC12942.f36390;
                                                        c18976.f12798 = c22077;
                                                        c18976.f56588 = z3 ? null : c22077;
                                                        if (z3) {
                                                            runnableC12942.f36390.f56584 = c22077;
                                                            runnableC12942.f36390.f56586 = runnableC12942.f36385;
                                                            runnableC12942.f36390.f12818 = runnableC12942.f36392;
                                                        }
                                                    }
                                                    if (runnableC12942.f36391 == runnableC12942.f36390.f12821.m32460()) {
                                                        C18976 c18977 = runnableC12942.f36390;
                                                        if (c18977.f12821.m32418(c18977)) {
                                                            C14146 c14146 = runnableC12942.f36390.f12821;
                                                            c14146.m32428(c14146.m32585(c14146.m32472()));
                                                        } else {
                                                            C14146 c14147 = runnableC12942.f36390.f12821;
                                                            c14147.m32428(c14147.m32585(((int) (runnableC12942.f36388.f59772.m26496() * i5)) + runnableC12942.f36397));
                                                        }
                                                    } else {
                                                        C14146 c14148 = runnableC12942.f36390.f12821;
                                                        c14148.m32428(c14148.m32585(c14148.m32472()));
                                                    }
                                                    runnableC12942.f36390.f12821.invalidate();
                                                }
                                            }
                                        });
                                    } else {
                                        C18976 c18976 = this.f36390;
                                        int size = arrayList.size();
                                        int i5 = C8918.f24163;
                                        c18976.m43100(size, i5, c22076M20611);
                                        final int iM43118 = C18976.m43117(c22076M20611, this.f36393);
                                        C7050.m16212(new Runnable() { // from class: l.֫ܽܿ
                                            /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                RunnableC12942 runnableC12942 = this.f9297;
                                                boolean z3 = z;
                                                C22076 c22077 = c22076M20611;
                                                int i6 = iM43118;
                                                if (runnableC12942.m29667()) {
                                                    return;
                                                }
                                                if (!runnableC12942.f36392.equals(runnableC12942.f36390.f12821.m32608()) || runnableC12942.f36385 != (runnableC12942.f36390.f56585 - runnableC12942.f36390.mo10202()) - runnableC12942.f36390.mo10195()) {
                                                    runnableC12942.f36390.m43115();
                                                    return;
                                                }
                                                if (z3 || runnableC12942.f36391 == runnableC12942.f36390.f12821.m32460()) {
                                                    synchronized (runnableC12942.f36390) {
                                                        runnableC12942.f36390.f12819 = false;
                                                        C18976 c18977 = runnableC12942.f36390;
                                                        c18977.f12798 = c22077;
                                                        c18977.f56588 = z3 ? null : c22077;
                                                        if (z3) {
                                                            runnableC12942.f36390.f56584 = c22077;
                                                            runnableC12942.f36390.f56586 = runnableC12942.f36385;
                                                            runnableC12942.f36390.f12818 = runnableC12942.f36392;
                                                        }
                                                    }
                                                    if (runnableC12942.f36391 == runnableC12942.f36390.f12821.m32460()) {
                                                        C18976 c18978 = runnableC12942.f36390;
                                                        if (c18978.f12821.m32418(c18978)) {
                                                            C14146 c14148 = runnableC12942.f36390.f12821;
                                                            c14148.m32428(c14148.m32585(c14148.m32472()));
                                                        } else {
                                                            C14146 c14147 = runnableC12942.f36390.f12821;
                                                            c14147.m32428(c14147.m32585(((int) (runnableC12942.f36388.f59772.m26496() * i6)) + runnableC12942.f36397));
                                                        }
                                                    } else {
                                                        C14146 c14149 = runnableC12942.f36390.f12821;
                                                        c14149.m32428(c14149.m32585(c14149.m32472()));
                                                    }
                                                    runnableC12942.f36390.f12821.invalidate();
                                                }
                                            }
                                        });
                                        C22076 c22076M20613 = C8918.m20611(new Supplier() { // from class: l.ۨۧܿ
                                            @Override // java.util.function.Supplier
                                            public final Object get() {
                                                return c9729Mo28589.m22742();
                                            }
                                        }, arrayList.subList(iMin, arrayList.size()), new C24184(this));
                                        if (c22076M20613 == null || m29667()) {
                                            c9729Mo28589.close();
                                            this.f36384.setReadOnly(false);
                                            runnableC24718 = new RunnableC24718(2, this);
                                        } else {
                                            final C22076 c22077 = new C22076(c22076M20611);
                                            c22077.m49681(c22076M20613);
                                            this.f36390.m43100(arrayList.size(), i5, c22077);
                                            final int iM43119 = C18976.m43117(c22077, this.f36393);
                                            C7050.m16212(new Runnable() { // from class: l.֫ܽܿ
                                                /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    RunnableC12942 runnableC12942 = this.f9297;
                                                    boolean z3 = z2;
                                                    C22076 c22078 = c22077;
                                                    int i6 = iM43119;
                                                    if (runnableC12942.m29667()) {
                                                        return;
                                                    }
                                                    if (!runnableC12942.f36392.equals(runnableC12942.f36390.f12821.m32608()) || runnableC12942.f36385 != (runnableC12942.f36390.f56585 - runnableC12942.f36390.mo10202()) - runnableC12942.f36390.mo10195()) {
                                                        runnableC12942.f36390.m43115();
                                                        return;
                                                    }
                                                    if (z3 || runnableC12942.f36391 == runnableC12942.f36390.f12821.m32460()) {
                                                        synchronized (runnableC12942.f36390) {
                                                            runnableC12942.f36390.f12819 = false;
                                                            C18976 c18977 = runnableC12942.f36390;
                                                            c18977.f12798 = c22078;
                                                            c18977.f56588 = z3 ? null : c22078;
                                                            if (z3) {
                                                                runnableC12942.f36390.f56584 = c22078;
                                                                runnableC12942.f36390.f56586 = runnableC12942.f36385;
                                                                runnableC12942.f36390.f12818 = runnableC12942.f36392;
                                                            }
                                                        }
                                                        if (runnableC12942.f36391 == runnableC12942.f36390.f12821.m32460()) {
                                                            C18976 c18978 = runnableC12942.f36390;
                                                            if (c18978.f12821.m32418(c18978)) {
                                                                C14146 c14149 = runnableC12942.f36390.f12821;
                                                                c14149.m32428(c14149.m32585(c14149.m32472()));
                                                            } else {
                                                                C14146 c14147 = runnableC12942.f36390.f12821;
                                                                c14147.m32428(c14147.m32585(((int) (runnableC12942.f36388.f59772.m26496() * i6)) + runnableC12942.f36397));
                                                            }
                                                        } else {
                                                            C14146 c141410 = runnableC12942.f36390.f12821;
                                                            c141410.m32428(c141410.m32585(c141410.m32472()));
                                                        }
                                                        runnableC12942.f36390.f12821.invalidate();
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    c9729Mo28589.close();
                                    this.f36384.setReadOnly(false);
                                    runnableC24718 = new RunnableC24718(2, this);
                                }
                            } else {
                                i2 = i3;
                            }
                        }
                        c24481M22743.close();
                        c9729Mo28589.close();
                        this.f36384.setReadOnly(false);
                        runnableC24718 = new RunnableC24718(2, this);
                    } catch (Throwable th3) {
                        try {
                            c24481M22743.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c9729Mo28589.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        }
        C7050.m16212(runnableC24718);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0055 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:5:0x000a, B:7:0x000e, B:9:0x0014, B:11:0x001c, B:13:0x0022, B:15:0x002a, B:19:0x003b, B:21:0x0041, B:22:0x0046, B:24:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x006e), top: B:34:0x0000 }] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m29666(RunnableC12942 runnableC12942, Throwable th) {
        C18976 c18976;
        try {
            if (runnableC12942.f36390.f56593 == runnableC12942) {
                if (!runnableC12942.f36389 || runnableC12942.f36390.f12826) {
                    if (th != null && !runnableC12942.m29667()) {
                        runnableC12942.f36390.f56583 = th;
                    }
                    runnableC12942.f36390.f56593 = null;
                    c18976 = runnableC12942.f36390;
                    if (c18976.f12798 != c18976.f56584) {
                        C18976 c18977 = runnableC12942.f36390;
                        c18977.f12798 = c18977.f56584;
                    }
                    runnableC12942.f36390.f56588 = null;
                    if (!runnableC12942.f36390.f12816) {
                        runnableC12942.f36390.f12819 = false;
                    }
                    runnableC12942.f36390.f12821.invalidate();
                    C18976 c18978 = runnableC12942.f36390;
                    c18978.f12821.m32564(c18978);
                } else {
                    C18976 c18979 = runnableC12942.f36390;
                    if (c18979.f12821.f40275 == c18979) {
                        InterfaceC9768 interfaceC9768 = c18979.f12815;
                        InterfaceC9768 interfaceC9769 = runnableC12942.f36384;
                        if (interfaceC9768 != interfaceC9769 || interfaceC9769.mo28581() != runnableC12942.f36387 || runnableC12942.f36396 != runnableC12942.f36390.f56590.get()) {
                            if (th != null) {
                                runnableC12942.f36390.f56583 = th;
                            }
                            runnableC12942.f36390.f56593 = null;
                            c18976 = runnableC12942.f36390;
                            if (c18976.f12798 != c18976.f56584) {
                                C18976 c189710 = runnableC12942.f36390;
                                c189710.f12798 = c189710.f56584;
                            }
                            runnableC12942.f36390.f56588 = null;
                            if (!runnableC12942.f36390.f12816) {
                                runnableC12942.f36390.f12819 = false;
                            }
                            runnableC12942.f36390.f12821.invalidate();
                            C18976 c189711 = runnableC12942.f36390;
                            c189711.f12821.m32564(c189711);
                        }
                    } else {
                        if (th != null) {
                            runnableC12942.f36390.f56583 = th;
                        }
                        runnableC12942.f36390.f56593 = null;
                        c18976 = runnableC12942.f36390;
                        if (c18976.f12798 != c18976.f56584) {
                            C18976 c189712 = runnableC12942.f36390;
                            c189712.f12798 = c189712.f56584;
                        }
                        runnableC12942.f36390.f56588 = null;
                        if (!runnableC12942.f36390.f12816) {
                            runnableC12942.f36390.f12819 = false;
                        }
                        runnableC12942.f36390.f12821.invalidate();
                        C18976 c189713 = runnableC12942.f36390;
                        c189713.f12821.m32564(c189713);
                    }
                }
            }
        } finally {
            runnableC12942.f36394.run();
        }
    }
}
