package p067l;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ۘۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class C6100 {

    /* JADX INFO: renamed from: ֡ */
    public final /* synthetic */ C14146 f15321;

    /* JADX INFO: renamed from: ֨ */
    public float f15322;

    /* JADX INFO: renamed from: ֫ */
    public AbstractC5390 f15323;

    /* JADX INFO: renamed from: ۖ */
    public final int f15324;

    /* JADX INFO: renamed from: ۘ */
    public boolean f15325;

    /* JADX INFO: renamed from: ۚ */
    public float f15326;

    /* JADX INFO: renamed from: ۜ */
    public AbstractC5390 f15327;

    /* JADX INFO: renamed from: ۠ */
    public boolean f15328;

    /* JADX INFO: renamed from: ۡ */
    public volatile C6770 f15329;

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC9768 f15330;

    /* JADX INFO: renamed from: ۧ */
    public boolean f15331;

    /* JADX INFO: renamed from: ܳ */
    public C20182 f15332;

    /* JADX INFO: renamed from: ܶ */
    public int f15333;

    /* JADX INFO: renamed from: ܺ */
    public int f15334;

    /* JADX INFO: renamed from: ܽ */
    public volatile boolean f15335;

    /* JADX INFO: renamed from: ܿ */
    public int f15336;

    /* JADX INFO: renamed from: ᩳ */
    public C16611 f15337;

    /* JADX INFO: renamed from: ᩴ */
    public int f15338;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f15339;

    /* JADX INFO: renamed from: ᩷ */
    public C9729 f15340;

    /* JADX INFO: renamed from: ᩸ */
    public int f15341;

    /* JADX INFO: renamed from: ᩻ */
    public C5311 f15342;

    public C6100(C14146 c14146, InterfaceC9768 interfaceC9768, AbstractC5390 abstractC5390) {
        this.f15321 = c14146;
        this.f15330 = interfaceC9768;
        this.f15323 = abstractC5390;
        this.f15327 = abstractC5390;
        this.f15337 = C16611.m37650(abstractC5390.m11826(), new C9906[0]);
        this.f15336 = abstractC5390.m11825();
        this.f15324 = c14146.m32477();
        this.f15332 = abstractC5390.f12818;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13887(int i, int i2, int i3, int i4) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        int iMo28581 = this.f15330.mo28581();
        C16611 c16611 = this.f15337;
        if (c16611 != null && this.f15336 == i4 && iMo28581 == i4 + 1 && c16611.m37665() == (((long) this.f15330.length()) - ((long) i3)) + ((long) i2)) {
            this.f15337 = this.f15337.m37655(new C9906(i, i2 + i, i3));
        } else {
            this.f15337 = null;
        }
        this.f15336 = iMo28581;
        this.f15329 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m13890() {
        return !this.f15335 && this.f15321.f40319 == this && this.f15321.f40339 == this.f15330 && !this.f15321.f40211;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m13891(AbstractC5390 abstractC5390) {
        C6770 c6770 = this.f15329;
        return m13890() && this.f15330.mo28581() == this.f15333 && c6770 != null && c6770.f17534 == abstractC5390 && c6770.f17533 == abstractC5390.mo10197() && c6770.f17536.m15389() == this.f15321.m32458() && abstractC5390.mo10200(c6770.f17536);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۡۨᩳ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ۢۨᩳ] */
    /* JADX INFO: renamed from: ۧ */
    public final void m13892() {
        final AbstractC5390 c18976;
        try {
            if (m13890()) {
                C5311 c5311 = this.f15342;
                boolean z = true;
                if (c5311 != null && c5311.m11490(this.f15323, this.f15333, this.f15321.m32458())) {
                    if (this.f15341 == 0) {
                        C14146 c14146 = this.f15321;
                        c18976 = new C4816(c14146, this.f15330, c14146.f40262, this.f15338, c5311, new BooleanSupplier() { // from class: l.ۢۨᩳ
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return !this.f31975.m13890();
                            }
                        }, this.f15340);
                    } else {
                        C14146 c14147 = this.f15321;
                        c18976 = new C18976(c14147, this.f15330, c14147.f40262, this.f15341 == 1, this.f15338, c5311, new BooleanSupplier() { // from class: l.ۡۨᩳ
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                return !this.f29925.m13890();
                            }
                        }, this.f15340);
                    }
                } else if (this.f15341 == 0) {
                    C14146 c14148 = this.f15321;
                    c18976 = new C4816(c14148, this.f15330, c14148.f40262, this.f15338, this.f15340);
                } else {
                    C14146 c14149 = this.f15321;
                    c18976 = new C18976(c14149, this.f15330, c14149.f40262, this.f15341 == 1, this.f15338, this.f15340);
                }
                try {
                    C6731 c6731Mo10207 = c18976.mo10207();
                    if (m13890() && this.f15330.mo28581() == this.f15333 && c6731Mo10207 != null && c18976.mo10200(c6731Mo10207) && c18976.mo11824(Math.max(this.f15321.m32508(), this.f15321.m32512()))) {
                        final C6770 c6770 = new C6770(c18976, c18976.mo10197(), c6731Mo10207);
                        this.f15329 = c6770;
                        m13884(c18976, c6731Mo10207.m15391());
                        C7050.m16212(new Runnable() { // from class: l.ܺۨᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C6100.m13885(this.f52317, c6770);
                            }
                        });
                    } else {
                        z = false;
                    }
                    while (c18976.mo11814()) {
                        if (!m13890()) {
                            c18976.mo10198();
                            break;
                        }
                        SystemClock.sleep(10L);
                    }
                    Throwable thMo10204 = c18976.mo10204();
                    if (thMo10204 instanceof RuntimeException) {
                        throw ((RuntimeException) thMo10204);
                    }
                    if (thMo10204 instanceof Error) {
                        throw ((Error) thMo10204);
                    }
                    if (thMo10204 != null) {
                        throw new IllegalStateException("Large edit layout preparation failed", thMo10204);
                    }
                    if (!z && m13890() && this.f15330.mo28581() == this.f15333) {
                        m13884(c18976, Math.max(0, ((int) (c18976.m11834(Math.min(this.f15338, this.f15330.length())) * this.f15321.f40262.m26496())) - (this.f15321.m32606() / 2)));
                    }
                } catch (Throwable th) {
                    th = th;
                    if (c18976 != null) {
                        c18976.mo10198();
                    }
                }
            } else {
                c18976 = null;
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c18976 = null;
        }
        C9729 c9729 = this.f15340;
        if (c9729 != null) {
            c9729.close();
            this.f15340 = null;
        }
        C7050.m16212(new Runnable() { // from class: l.ۖۨᩳ
            @Override // java.lang.Runnable
            public final void run() {
                this.f10779.m13889(c18976, th);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13884(AbstractC5390 abstractC5390, int i) {
        if (m13890()) {
            C14146 c14146 = this.f15321;
            C23929 c23929 = c14146.f40262;
            C8898 c8898 = c14146.f40252;
            if (c23929.f75992 && c8898.m20524()) {
                long jMo11822 = abstractC5390.mo11822(i, Math.max(1, c14146.m32606()));
                c8898.m20515(this.f15330, (int) (jMo11822 >>> 32), (int) jMo11822);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13885(C6100 c6100, C6770 c6770) {
        if (c6100.f15329 == c6770 && c6100.m13891(c6770.f17534)) {
            C14146 c14146 = c6100.f15321;
            if (c14146.f40275 != c6100.f15327) {
                return;
            }
            c14146.m32190(c6770.f17534, false);
            c6100.f15327 = c6770.f17534;
            c6100.f15321.m32187(c6770.f17536.m15390(), c6770.f17536.m15391(), false);
            c6100.f15334 = c6770.f17536.m15388();
            c6770.f17535 = true;
            c6100.f15321.f40252.m20546(c6100.f15330);
            c6100.f15321.invalidate();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13888(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        C14146 c14146 = this.f15321;
        if (actionMasked == 0) {
            this.f15328 = c14146.m32443();
            this.f15326 = motionEvent.getX();
            this.f15322 = motionEvent.getY();
            return;
        }
        if (actionMasked != 2 || !this.f15328) {
            if (actionMasked != 2) {
                this.f15328 = false;
                return;
            }
            return;
        }
        int x = (int) (this.f15326 - motionEvent.getX());
        int y = (int) (this.f15322 - motionEvent.getY());
        if (m13890()) {
            m13886(x, y);
        } else if (c14146.f40319 == null) {
            InterfaceC9768 interfaceC9768 = c14146.f40339;
            InterfaceC9768 interfaceC9769 = this.f15330;
            if (interfaceC9768 == interfaceC9769 && !c14146.f40211 && interfaceC9769.mo28581() == this.f15333 && c14146.f40275 == this.f15327 && c14146.m32238()) {
                c14146.scrollTo(c14146.m32454(c14146.getScrollX() + x), c14146.m32585(c14146.m32472() + y));
                c14146.invalidate();
            }
        }
        this.f15326 = motionEvent.getX();
        this.f15322 = motionEvent.getY();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13886(int i, int i2) {
        C14146 c14146 = this.f15321;
        if (c14146.m32443()) {
            this.f15334 = Math.min(this.f15334, c14146.m32606());
            int iM32454 = c14146.m32454(c14146.getScrollX() + i);
            int iMo10185 = c14146.f40275.mo10185(c14146.m32472() + i2, this.f15334);
            if (c14146.f40275.mo10200(new C6731(iM32454, iMo10185, c14146.m32458(), this.f15334))) {
                if (iM32454 == c14146.getScrollX() && iMo10185 == c14146.m32472()) {
                    return;
                }
                this.f15331 = true;
                c14146.scrollTo(iM32454, iMo10185);
                c14146.invalidate();
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
    /* JADX INFO: renamed from: ֫ */
    public final void m13889(AbstractC5390 abstractC5390, Throwable e) {
        C9729 c9729 = this.f15340;
        if (c9729 != null) {
            c9729.close();
            this.f15340 = null;
        }
        if (this.f15321.f40319 != this) {
            if (this.f15339) {
                this.f15339 = false;
                try {
                    this.f15330.setReadOnly(false);
                    return;
                } finally {
                    this.f15321.m32503();
                }
            }
            return;
        }
        this.f15325 = false;
        if (m13890() && abstractC5390 != null && e == null && this.f15330.mo28581() != this.f15333) {
            this.f15323 = abstractC5390;
            if (this.f15341 != this.f15321.f40217 || !this.f15332.equals(this.f15321.m32608())) {
                this.f15337 = null;
            }
            this.f15342 = null;
            this.f15329 = null;
            C7050.m16212(new RunnableC13437(this));
            return;
        }
        if (m13890() && e == null && abstractC5390 != null && (this.f15341 != this.f15321.f40217 || !this.f15332.equals(this.f15321.m32608()) || (this.f15341 != 0 && abstractC5390.mo10196() != this.f15321.m32458() && this.f15321.m32458() > 0))) {
            this.f15329 = null;
            this.f15342 = null;
            this.f15321.invalidate();
            try {
                this.f15323 = abstractC5390;
                this.f15337 = null;
                C7050.m16212(new RunnableC13437(this));
                return;
            } catch (RuntimeException e2) {
                e = e2;
            }
        }
        try {
            if (m13890() && this.f15339 && this.f15330.mo28581() == this.f15333) {
                C14146 c14146 = this.f15321;
                if (c14146.f40275 == this.f15327 && abstractC5390 != null && e == null) {
                    c14146.m32190(abstractC5390, false);
                } else if (m13890()) {
                    if (!(e instanceof Error)) {
                        throw ((Error) e);
                    }
                    if (e instanceof RuntimeException) {
                        if (this.f15321.m32421(this.f15330, (RuntimeException) e)) {
                            if (abstractC5390 != null) {
                                abstractC5390.f12814 = -1;
                            }
                            this.f15342 = null;
                            this.f15321.f40319 = null;
                            this.f15321.f40251 = 0L;
                            if (this.f15339) {
                                this.f15330.setReadOnly(false);
                            }
                            return;
                        }
                    }
                    this.f15321.f40252.m20533(this.f15330);
                    this.f15321.m32597();
                }
            } else if (m13890() && this.f15339) {
                if (!(e instanceof Error)) {
                    throw ((Error) e);
                }
                if (e instanceof RuntimeException) {
                    if (this.f15321.m32421(this.f15330, (RuntimeException) e)) {
                        if (abstractC5390 != null) {
                            abstractC5390.f12814 = -1;
                        }
                        this.f15342 = null;
                        this.f15321.f40319 = null;
                        this.f15321.f40251 = 0L;
                        try {
                            if (this.f15339) {
                                this.f15330.setReadOnly(false);
                            }
                            return;
                        } finally {
                            if (this.f15339) {
                                this.f15321.m32503();
                            }
                            C7050.m16212(new RunnableC18820(1, this.f15321));
                        }
                    }
                }
                this.f15321.f40252.m20533(this.f15330);
                this.f15321.m32597();
            }
            if (abstractC5390 != null) {
                abstractC5390.f12814 = -1;
            }
            this.f15342 = null;
            this.f15321.f40319 = null;
            this.f15321.f40251 = 0L;
            try {
                if (this.f15339) {
                    this.f15330.setReadOnly(false);
                }
                if (this.f15339) {
                    this.f15321.m32503();
                }
                C7050.m16212(new RunnableC18820(1, this.f15321));
                if (this.f15335 || this.f15321.f40339 != this.f15330 || this.f15321.f40211) {
                    return;
                }
                this.f15321.f40190.m19806(this.f15330);
                this.f15321.f40252.m20546(this.f15330);
                C14146 c14147 = this.f15321;
                AbstractC23000 abstractC23000 = c14147.f40253;
                if (abstractC23000 != null) {
                    abstractC23000.mo12317(c14147);
                }
                if (!this.f15321.m32357() && this.f15321.f40335 == null && !this.f15331) {
                    this.f15321.m32409(true);
                }
                C14146 c14148 = this.f15321;
                c14148.m32375(c14148.m32508(), this.f15321.m32512());
                this.f15321.m32469();
                this.f15321.m32570();
                int iM32477 = this.f15321.m32477();
                if (this.f15324 != iM32477) {
                    this.f15321.mo27930(iM32477);
                }
                this.f15321.requestLayout();
                this.f15321.invalidate();
                this.f15321.m32229();
            } catch (Throwable th) {
                if (this.f15339) {
                    this.f15321.m32503();
                }
                C7050.m16212(new RunnableC18820(1, this.f15321));
                throw th;
            }
        } catch (Throwable th2) {
            if (abstractC5390 != null) {
                abstractC5390.f12814 = -1;
            }
            this.f15342 = null;
            this.f15321.f40319 = null;
            this.f15321.f40251 = 0L;
            try {
                if (this.f15339) {
                    this.f15330.setReadOnly(false);
                }
                throw th2;
            } finally {
                if (this.f15339) {
                    this.f15321.m32503();
                }
                C7050.m16212(new RunnableC18820(1, this.f15321));
            }
        }
    }
}
