package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۘۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3926 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f12514;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f12515;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC3179 f12516;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f12517;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f12518;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f12519;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC3179 f12520;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f12521;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile C4631 f12522;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f12523;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f12524;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18743 f12525;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f12526;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f12527;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f12528;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f12529;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14986 f12530;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f12531;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f12532;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7744 f12533;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12534;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3096 f12535;

    public C3926(C12392 c12392, InterfaceC7785 interfaceC7785, AbstractC3179 abstractC3179) {
        this.f12514 = c12392;
        this.f12523 = interfaceC7785;
        this.f12516 = abstractC3179;
        this.f12520 = abstractC3179;
        this.f12530 = C14986.m35494(abstractC3179.m9782(), new C7931[0]);
        this.f12529 = abstractC3179.m9781();
        this.f12517 = c12392.m30413();
        this.f12525 = abstractC3179.f10018;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11967(int i, int i2, int i3, int i4) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        int iMo26548 = this.f12523.mo26548();
        C14986 c14986 = this.f12530;
        if (c14986 != null && this.f12529 == i4 && iMo26548 == i4 + 1 && c14986.m35509() == (((long) this.f12523.length()) - ((long) i3)) + ((long) i2)) {
            this.f12530 = this.f12530.m35499(new C7931(i, i2 + i, i3));
        } else {
            this.f12530 = null;
        }
        this.f12529 = iMo26548;
        this.f12522 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11970() {
        return !this.f12528 && this.f12514.f37302 == this && this.f12514.f37322 == this.f12523 && !this.f12514.f37194;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11971(AbstractC3179 abstractC3179) {
        C4631 c4631 = this.f12522;
        return m11970() && this.f12523.mo26548() == this.f12526 && c4631 != null && c4631.f14706 == abstractC3179 && c4631.f14705 == abstractC3179.mo8164() && c4631.f14708.m13500() == this.f12514.m30394() && abstractC3179.mo8167(c4631.f14708);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۡۨᩳ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ۢۨᩳ] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11972() {
        final AbstractC3179 c17474;
        try {
            if (m11970()) {
                C3096 c3096 = this.f12535;
                boolean z = true;
                if (c3096 != null && c3096.m9447(this.f12516, this.f12526, this.f12514.m30394())) {
                    if (this.f12534 == 0) {
                        C12392 c12392 = this.f12514;
                        c17474 = new C2575(c12392, this.f12523, c12392.f37245, this.f12531, c3096, new BooleanSupplier() { // from class: l.ۢۨᩳ
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return !this.f29028.m11970();
                            }
                        }, this.f12533);
                    } else {
                        C12392 c12393 = this.f12514;
                        c17474 = new C17474(c12393, this.f12523, c12393.f37245, this.f12534 == 1, this.f12531, c3096, new BooleanSupplier() { // from class: l.ۡۨᩳ
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return !this.f27002.m11970();
                            }
                        }, this.f12533);
                    }
                } else if (this.f12534 == 0) {
                    C12392 c12394 = this.f12514;
                    c17474 = new C2575(c12394, this.f12523, c12394.f37245, this.f12531, this.f12533);
                } else {
                    C12392 c12395 = this.f12514;
                    c17474 = new C17474(c12395, this.f12523, c12395.f37245, this.f12534 == 1, this.f12531, this.f12533);
                }
                try {
                    C4590 c4590Mo8174 = c17474.mo8174();
                    if (m11970() && this.f12523.mo26548() == this.f12526 && c4590Mo8174 != null && c17474.mo8167(c4590Mo8174) && c17474.mo9780(Math.max(this.f12514.m30444(), this.f12514.m30448()))) {
                        final C4631 c4631 = new C4631(c17474, c17474.mo8164(), c4590Mo8174);
                        this.f12522 = c4631;
                        m11964(c17474, c4590Mo8174.m13502());
                        C4925.m14315(new Runnable() { // from class: l.ܺۨᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C3926.m11965(this.f49171, c4631);
                            }
                        });
                    } else {
                        z = false;
                    }
                    while (c17474.mo9770()) {
                        if (!m11970()) {
                            c17474.mo8165();
                            break;
                        }
                        SystemClock.sleep(10L);
                    }
                    Throwable thMo8171 = c17474.mo8171();
                    if (thMo8171 instanceof RuntimeException) {
                        throw ((RuntimeException) thMo8171);
                    }
                    if (thMo8171 instanceof Error) {
                        throw ((Error) thMo8171);
                    }
                    if (thMo8171 != null) {
                        throw new IllegalStateException("Large edit layout preparation failed", thMo8171);
                    }
                    if (!z && m11970() && this.f12523.mo26548() == this.f12526) {
                        m11964(c17474, Math.max(0, ((int) (c17474.m9790(Math.min(this.f12531, this.f12523.length())) * this.f12514.f37245.m24484())) - (this.f12514.m30542() / 2)));
                    }
                } catch (Throwable th) {
                    th = th;
                    if (c17474 != null) {
                        c17474.mo8165();
                    }
                }
            } else {
                c17474 = null;
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c17474 = null;
        }
        C7744 c7744 = this.f12533;
        if (c7744 != null) {
            c7744.close();
            this.f12533 = null;
        }
        C4925.m14315(new Runnable() { // from class: l.ۖۨᩳ
            @Override // java.lang.Runnable
            public final void run() {
                this.f7989.m11969(c17474, th);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11964(AbstractC3179 abstractC3179, int i) {
        if (m11970()) {
            C12392 c12392 = this.f12514;
            C22686 c22686 = c12392.f37245;
            C6870 c6870 = c12392.f37235;
            if (c22686.f73267 && c6870.m18575()) {
                long jMo9778 = abstractC3179.mo9778(i, Math.max(1, c12392.m30542()));
                c6870.m18566(this.f12523, (int) (jMo9778 >>> 32), (int) jMo9778);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11965(C3926 c3926, C4631 c4631) {
        if (c3926.f12522 == c4631 && c3926.m11971(c4631.f14706)) {
            C12392 c12392 = c3926.f12514;
            if (c12392.f37258 != c3926.f12520) {
                return;
            }
            c12392.m30126(c4631.f14706, false);
            c3926.f12520 = c4631.f14706;
            c3926.f12514.m30123(c4631.f14708.m13501(), c4631.f14708.m13502(), false);
            c3926.f12527 = c4631.f14708.m13499();
            c4631.f14707 = true;
            c3926.f12514.f37235.m18597(c3926.f12523);
            c3926.f12514.invalidate();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11968(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C12392 c12392 = this.f12514;
        if (actionMasked == 0) {
            this.f12521 = c12392.m30379();
            this.f12519 = motionEvent.getX();
            this.f12515 = motionEvent.getY();
            return;
        }
        if (actionMasked != 2 || !this.f12521) {
            if (actionMasked != 2) {
                this.f12521 = false;
                return;
            }
            return;
        }
        int x = (int) (this.f12519 - motionEvent.getX());
        int y = (int) (this.f12515 - motionEvent.getY());
        if (m11970()) {
            m11966(x, y);
        } else if (c12392.f37302 == null) {
            InterfaceC7785 interfaceC7785 = c12392.f37322;
            InterfaceC7785 interfaceC7786 = this.f12523;
            if (interfaceC7785 == interfaceC7786 && !c12392.f37194 && interfaceC7786.mo26548() == this.f12526 && c12392.f37258 == this.f12520 && c12392.m30174()) {
                c12392.scrollTo(c12392.m30390(c12392.getScrollX() + x), c12392.m30521(c12392.m30408() + y));
                c12392.invalidate();
            }
        }
        this.f12519 = motionEvent.getX();
        this.f12515 = motionEvent.getY();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11966(int i, int i2) {
        C12392 c12392 = this.f12514;
        if (c12392.m30379()) {
            this.f12527 = Math.min(this.f12527, c12392.m30542());
            int iM30390 = c12392.m30390(c12392.getScrollX() + i);
            int iMo8152 = c12392.f37258.mo8152(c12392.m30408() + i2, this.f12527);
            if (c12392.f37258.mo8167(new C4590(iM30390, iMo8152, c12392.m30394(), this.f12527))) {
                if (iM30390 == c12392.getScrollX() && iMo8152 == c12392.m30408()) {
                    return;
                }
                this.f12524 = true;
                c12392.scrollTo(iM30390, iMo8152);
                c12392.invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[Catch: all -> 0x021f, TryCatch #5 {all -> 0x021f, blocks: (B:57:0x00df, B:58:0x00e4, B:60:0x00ea, B:62:0x00ee, B:64:0x00f2, B:66:0x00f6, B:85:0x0146, B:86:0x0155, B:87:0x0157), top: B:153:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2 A[Catch: all -> 0x021f, TryCatch #5 {all -> 0x021f, blocks: (B:57:0x00df, B:58:0x00e4, B:60:0x00ea, B:62:0x00ee, B:64:0x00f2, B:66:0x00f6, B:85:0x0146, B:86:0x0155, B:87:0x0157), top: B:153:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6 A[Catch: all -> 0x021f, TRY_LEAVE, TryCatch #5 {all -> 0x021f, blocks: (B:57:0x00df, B:58:0x00e4, B:60:0x00ea, B:62:0x00ee, B:64:0x00f2, B:66:0x00f6, B:85:0x0146, B:86:0x0155, B:87:0x0157), top: B:153:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x0116 A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:71:0x0112, B:73:0x0116), top: B:143:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x011f A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:86:0x0155 A[Catch: all -> 0x021f, TryCatch #5 {all -> 0x021f, blocks: (B:57:0x00df, B:58:0x00e4, B:60:0x00ea, B:62:0x00ee, B:64:0x00f2, B:66:0x00f6, B:85:0x0146, B:86:0x0155, B:87:0x0157), top: B:153:0x00c3 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11969(AbstractC3179 abstractC3179, Throwable e) {
        C7744 c7744 = this.f12533;
        if (c7744 != null) {
            c7744.close();
            this.f12533 = null;
        }
        if (this.f12514.f37302 != this) {
            if (this.f12532) {
                this.f12532 = false;
                try {
                    this.f12523.setReadOnly(false);
                    return;
                } finally {
                    this.f12514.m30439();
                }
            }
            return;
        }
        this.f12518 = false;
        if (m11970() && abstractC3179 != null && e == null && this.f12523.mo26548() != this.f12526) {
            this.f12516 = abstractC3179;
            if (this.f12534 != this.f12514.f37200 || !this.f12525.equals(this.f12514.m30544())) {
                this.f12530 = null;
            }
            this.f12535 = null;
            this.f12522 = null;
            C4925.m14315(new RunnableC11646(this));
            return;
        }
        if (m11970() && e == null && abstractC3179 != null && (this.f12534 != this.f12514.f37200 || !this.f12525.equals(this.f12514.m30544()) || (this.f12534 != 0 && abstractC3179.mo8163() != this.f12514.m30394() && this.f12514.m30394() > 0))) {
            this.f12522 = null;
            this.f12535 = null;
            this.f12514.invalidate();
            try {
                this.f12516 = abstractC3179;
                this.f12530 = null;
                C4925.m14315(new RunnableC11646(this));
                return;
            } catch (RuntimeException e2) {
                e = e2;
            }
        }
        try {
            if (m11970() && this.f12532 && this.f12523.mo26548() == this.f12526) {
                C12392 c12392 = this.f12514;
                if (c12392.f37258 == this.f12520 && abstractC3179 != null && e == null) {
                    c12392.m30126(abstractC3179, false);
                } else if (m11970()) {
                    if (!(e instanceof Error)) {
                        throw ((Error) e);
                    }
                    if (e instanceof RuntimeException) {
                        if (this.f12514.m30357(this.f12523, (RuntimeException) e)) {
                            if (abstractC3179 != null) {
                                abstractC3179.f10014 = -1;
                            }
                            this.f12535 = null;
                            this.f12514.f37302 = null;
                            this.f12514.f37234 = 0L;
                            if (this.f12532) {
                                this.f12523.setReadOnly(false);
                            }
                            return;
                        }
                    }
                    this.f12514.f37235.m18584(this.f12523);
                    this.f12514.m30533();
                }
            } else if (m11970() && this.f12532) {
                if (!(e instanceof Error)) {
                    throw ((Error) e);
                }
                if (e instanceof RuntimeException) {
                    if (this.f12514.m30357(this.f12523, (RuntimeException) e)) {
                        if (abstractC3179 != null) {
                            abstractC3179.f10014 = -1;
                        }
                        this.f12535 = null;
                        this.f12514.f37302 = null;
                        this.f12514.f37234 = 0L;
                        try {
                            if (this.f12532) {
                                this.f12523.setReadOnly(false);
                            }
                            return;
                        } finally {
                            if (this.f12532) {
                                this.f12514.m30439();
                            }
                            C4925.m14315(new RunnableC17310(1, this.f12514));
                        }
                    }
                }
                this.f12514.f37235.m18584(this.f12523);
                this.f12514.m30533();
            }
            if (abstractC3179 != null) {
                abstractC3179.f10014 = -1;
            }
            this.f12535 = null;
            this.f12514.f37302 = null;
            this.f12514.f37234 = 0L;
            try {
                if (this.f12532) {
                    this.f12523.setReadOnly(false);
                }
                if (this.f12532) {
                    this.f12514.m30439();
                }
                C4925.m14315(new RunnableC17310(1, this.f12514));
                if (this.f12528 || this.f12514.f37322 != this.f12523 || this.f12514.f37194) {
                    return;
                }
                this.f12514.f37173.m17859(this.f12523);
                this.f12514.f37235.m18597(this.f12523);
                C12392 c12393 = this.f12514;
                AbstractC21708 abstractC21708 = c12393.f37236;
                if (abstractC21708 != null) {
                    abstractC21708.mo10280(c12393);
                }
                if (!this.f12514.m30293() && this.f12514.f37318 == null && !this.f12524) {
                    this.f12514.m30345(true);
                }
                C12392 c12394 = this.f12514;
                c12394.m30311(c12394.m30444(), this.f12514.m30448());
                this.f12514.m30405();
                this.f12514.m30506();
                int iM30413 = this.f12514.m30413();
                if (this.f12517 != iM30413) {
                    this.f12514.mo25908(iM30413);
                }
                this.f12514.requestLayout();
                this.f12514.invalidate();
                this.f12514.m30165();
            } catch (Throwable th) {
                if (this.f12532) {
                    this.f12514.m30439();
                }
                C4925.m14315(new RunnableC17310(1, this.f12514));
                throw th;
            }
        } catch (Throwable th2) {
            if (abstractC3179 != null) {
                abstractC3179.f10014 = -1;
            }
            this.f12535 = null;
            this.f12514.f37302 = null;
            this.f12514.f37234 = 0L;
            try {
                if (this.f12532) {
                    this.f12523.setReadOnly(false);
                }
                throw th2;
            } finally {
                if (this.f12532) {
                    this.f12514.m30439();
                }
                C4925.m14315(new RunnableC17310(1, this.f12514));
            }
        }
    }
}
