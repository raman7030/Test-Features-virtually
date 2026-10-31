package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes4.dex */
public class C10075 extends C17606 implements InterfaceC1794 {

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean f30305;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C22069 f30306;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public ArrayList f30307;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f30308;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public float f30309;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f30310;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f30311;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public float f30312;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public float f30313;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30314;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public float f30315;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f30316;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f30317;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public C3019 f30318;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public float f30319;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f30320;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f30321;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public float f30322;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public ArrayList f30323;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f30324;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f30325;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30326;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f30327;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f30328;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public boolean f30329;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f30330;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public C18396 f30331;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21364 f30332;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public int f30333;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15012 f30334;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public long f30335;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f30336;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f30337;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C14867 f30338;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public float f30339;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public float f30340;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public float f30341;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f30342;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public float f30343;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f30344;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f30345;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public Interpolator f30346;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public long f30347;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f30348;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f30349;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public RectF f30350;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public float f30351;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f30352;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f30353;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f30354;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public View f30355;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f30356;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C7252 f30357;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public HashMap f30358;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public boolean f30359;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public long f30360;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public EnumC12191 f30361;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // l.InterfaceC7273
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // l.InterfaceC7273
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    public C10075(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30341 = 0.0f;
        this.f30356 = -1;
        this.f30314 = -1;
        this.f30326 = -1;
        this.f30310 = 0;
        this.f30352 = 0;
        this.f30342 = true;
        this.f30358 = new HashMap();
        this.f30354 = 0L;
        this.f30322 = 1.0f;
        this.f30339 = 0.0f;
        this.f30343 = 0.0f;
        this.f30309 = 0.0f;
        this.f30328 = false;
        this.f30311 = 0;
        this.f30359 = false;
        this.f30331 = new C18396();
        this.f30334 = new C15012(this);
        this.f30320 = false;
        this.f30344 = false;
        this.f30323 = null;
        this.f30307 = null;
        this.f30345 = null;
        this.f30336 = 0;
        this.f30360 = -1L;
        this.f30319 = 0.0f;
        this.f30348 = 0;
        this.f30313 = 0.0f;
        this.f30349 = false;
        this.f30338 = new C14867();
        this.f30308 = false;
        this.f30361 = EnumC12191.UNDEFINED;
        this.f30306 = new C22069(this);
        this.f30316 = false;
        this.f30350 = new RectF();
        this.f30355 = null;
        this.f30337 = new ArrayList();
        m25287(attributeSet);
    }

    public C10075(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30341 = 0.0f;
        this.f30356 = -1;
        this.f30314 = -1;
        this.f30326 = -1;
        this.f30310 = 0;
        this.f30352 = 0;
        this.f30342 = true;
        this.f30358 = new HashMap();
        this.f30354 = 0L;
        this.f30322 = 1.0f;
        this.f30339 = 0.0f;
        this.f30343 = 0.0f;
        this.f30309 = 0.0f;
        this.f30328 = false;
        this.f30311 = 0;
        this.f30359 = false;
        this.f30331 = new C18396();
        this.f30334 = new C15012(this);
        this.f30320 = false;
        this.f30344 = false;
        this.f30323 = null;
        this.f30307 = null;
        this.f30345 = null;
        this.f30336 = 0;
        this.f30360 = -1L;
        this.f30319 = 0.0f;
        this.f30348 = 0;
        this.f30313 = 0.0f;
        this.f30349 = false;
        this.f30338 = new C14867();
        this.f30308 = false;
        this.f30361 = EnumC12191.UNDEFINED;
        this.f30306 = new C22069(this);
        this.f30316 = false;
        this.f30350 = new RectF();
        this.f30355 = null;
        this.f30337 = new ArrayList();
        m25287(attributeSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25317(EnumC12191 enumC12191) {
        EnumC12191 enumC12192 = EnumC12191.FINISHED;
        if (enumC12191 == enumC12192 && this.f30314 == -1) {
            return;
        }
        EnumC12191 enumC12193 = this.f30361;
        this.f30361 = enumC12191;
        EnumC12191 enumC12194 = EnumC12191.MOVING;
        if (enumC12193 == enumC12194 && enumC12191 == enumC12194) {
            m25297();
        }
        int i = C7958.f24599[enumC12193.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && enumC12191 == enumC12192) {
                m25309();
                return;
            }
            return;
        }
        if (enumC12191 == enumC12194) {
            m25297();
        }
        if (enumC12191 == enumC12192) {
            m25309();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25318(C13601 c13601) {
        this.f30357.m19414(c13601);
        m25317(EnumC12191.SETUP);
        int i = this.f30314;
        C13601 c13602 = this.f30357.f22265;
        if (i == (c13602 == null ? -1 : c13602.f40564)) {
            this.f30343 = 1.0f;
            this.f30339 = 1.0f;
            this.f30309 = 1.0f;
        } else {
            this.f30343 = 0.0f;
            this.f30339 = 0.0f;
            this.f30309 = 0.0f;
        }
        this.f30347 = c13601.m32698() ? -1L : System.nanoTime();
        int iM19421 = this.f30357.m19421();
        C13601 c13603 = this.f30357.f22265;
        int i2 = c13603 != null ? c13603.f40564 : -1;
        if (iM19421 == this.f30356 && i2 == this.f30326) {
            return;
        }
        this.f30356 = iM19421;
        this.f30326 = i2;
        this.f30357.m19410(iM19421, i2);
        C4201 c4201M19409 = this.f30357.m19409(this.f30356);
        C4201 c4201M194010 = this.f30357.m19409(this.f30326);
        C22069 c22069 = this.f30306;
        c22069.m49649(c4201M19409, c4201M194010);
        int i3 = this.f30356;
        int i4 = this.f30326;
        c22069.f70717 = i3;
        c22069.f70716 = i4;
        c22069.m49650();
        c22069.m49650();
        invalidate();
    }

    @Override // l.C17606
    public final void loadLayoutDescription(int i) {
        C22069 c22069 = this.f30306;
        if (i != 0) {
            try {
                this.f30357 = new C7252(getContext(), this, i);
                if (super.isAttachedToWindow()) {
                    this.f30357.m19412(this);
                    c22069.m49649(this.f30357.m19409(this.f30356), this.f30357.m19409(this.f30326));
                    c22069.m49650();
                    invalidate();
                    this.f30357.m19416(isRtl());
                    return;
                }
                return;
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        }
        this.f30357 = null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 float, still in use, count: 1, list:
          (r3v1 float) from 0x0022: INVOKE (r0v7 int) = 
          (r0v6 l.ￛﾙ￡ﾩﾸ)
          (-1 int)
          (r3v1 float)
          (wrap int:0x001f: IGET (r12v0 'this' l.ￛﾤￛﾚ A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:1835) l.ￛﾤￛﾚ.ￛﾙ int)
          (r13v0 int)
         VIRTUAL call: l.ￛﾙ￡ﾩﾸ.ￖﾫ(float, float, int, int):int A[FORCE_ASSIGN_INLINE, MD:(float, float, int, int):int (m), WRAPPED] (LINE:1835)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:148)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:101)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:117)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:115)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25313(int r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10075.m25313(int):void");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25315(int i, int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.f30318 == null) {
                this.f30318 = new C3019(this);
            }
            C3019 c3019 = this.f30318;
            c3019.f9547 = i;
            c3019.f9545 = i2;
            return;
        }
        C7252 c7252 = this.f30357;
        if (c7252 != null) {
            this.f30356 = i;
            this.f30326 = i2;
            c7252.m19410(i, i2);
            C4201 c4201M19409 = this.f30357.m19409(i);
            C4201 c4201M194010 = this.f30357.m19409(i2);
            C22069 c22069 = this.f30306;
            c22069.m49649(c4201M19409, c4201M194010);
            c22069.m49650();
            invalidate();
            this.f30343 = 0.0f;
            m25310(0.0f);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25321(float f) {
        if (!super.isAttachedToWindow()) {
            if (this.f30318 == null) {
                this.f30318 = new C3019(this);
            }
            this.f30318.f9546 = f;
            return;
        }
        if (f <= 0.0f) {
            this.f30314 = this.f30356;
            if (this.f30343 == 0.0f) {
                m25317(EnumC12191.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.f30314 = this.f30326;
            if (this.f30343 == 1.0f) {
                m25317(EnumC12191.FINISHED);
            }
        } else {
            this.f30314 = -1;
            m25317(EnumC12191.MOVING);
        }
        if (this.f30357 == null) {
            return;
        }
        this.f30329 = true;
        this.f30309 = f;
        this.f30339 = f;
        this.f30347 = -1L;
        this.f30354 = -1L;
        this.f30346 = null;
        this.f30328 = true;
        invalidate();
    }

    @Override // l.C17606
    public final void setState(int i, int i2, int i3) {
        m25317(EnumC12191.SETUP);
        this.f30314 = i;
        this.f30356 = -1;
        this.f30326 = -1;
        C7023 c7023 = this.mConstraintLayoutSpec;
        if (c7023 != null) {
            c7023.m18990(i2, i3, i);
            return;
        }
        C7252 c7252 = this.f30357;
        if (c7252 != null) {
            c7252.m19409(i).m12676((C17606) this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25311(float f, float f2, int i) {
        C13601 c13601;
        float fM32508;
        if (this.f30357 == null || this.f30343 == f) {
            return;
        }
        this.f30359 = true;
        this.f30354 = System.nanoTime();
        float fM19417 = this.f30357.m19417() / 1000.0f;
        this.f30322 = fM19417;
        this.f30309 = f;
        this.f30328 = true;
        C18396 c18396 = this.f30331;
        if (i == 0 || i == 1 || i == 2) {
            if (i == 1) {
                f = 0.0f;
            } else if (i == 2) {
                f = 1.0f;
            }
            float f3 = this.f30343;
            float fM19422 = this.f30357.m19422();
            C7252 c7252 = this.f30357;
            C13601 c13602 = c7252.f22265;
            this.f30331.m42828(f3, f, f2, fM19417, fM19422, (c13602 == null || c13602.f40556 == null) ? 0.0f : c7252.f22265.f40556.m32508());
            int i2 = this.f30314;
            this.f30309 = f;
            this.f30314 = i2;
            this.f30346 = c18396;
        } else {
            C15012 c15012 = this.f30334;
            if (i == 4) {
                float f4 = this.f30343;
                float fM19423 = this.f30357.m19422();
                c15012.f45785 = f2;
                c15012.f45784 = f4;
                c15012.f45786 = fM19423;
                this.f30346 = c15012;
            } else if (i == 5) {
                float f5 = this.f30343;
                float fM19424 = this.f30357.m19422();
                if (f2 > 0.0f) {
                    float f6 = f2 / fM19424;
                    if (((f2 * f6) - (((fM19424 * f6) * f6) / 2.0f)) + f5 > 1.0f) {
                        float f7 = this.f30343;
                        float fM19425 = this.f30357.m19422();
                        c15012.f45785 = f2;
                        c15012.f45784 = f7;
                        c15012.f45786 = fM19425;
                        this.f30346 = c15012;
                    } else {
                        float f8 = this.f30343;
                        float f9 = this.f30322;
                        float fM19426 = this.f30357.m19422();
                        C7252 c7253 = this.f30357;
                        c13601 = c7253.f22265;
                        if (c13601 != null || c13601.f40556 == null) {
                            fM32508 = 0.0f;
                        } else {
                            fM32508 = c7253.f22265.f40556.m32508();
                        }
                        this.f30331.m42828(f8, f, f2, f9, fM19426, fM32508);
                        this.f30341 = 0.0f;
                        int i3 = this.f30314;
                        this.f30309 = f;
                        this.f30314 = i3;
                        this.f30346 = c18396;
                    }
                } else {
                    float f10 = (-f2) / fM19424;
                    if ((((fM19424 * f10) * f10) / 2.0f) + (f2 * f10) + f5 < 0.0f) {
                        float f11 = this.f30343;
                        float fM19427 = this.f30357.m19422();
                        c15012.f45785 = f2;
                        c15012.f45784 = f11;
                        c15012.f45786 = fM19427;
                        this.f30346 = c15012;
                    } else {
                        float f12 = this.f30343;
                        float f13 = this.f30322;
                        float fM19428 = this.f30357.m19422();
                        C7252 c7254 = this.f30357;
                        c13601 = c7254.f22265;
                        if (c13601 != null) {
                            fM32508 = 0.0f;
                        } else {
                            fM32508 = 0.0f;
                        }
                        this.f30331.m42828(f12, f, f2, f13, fM19428, fM32508);
                        this.f30341 = 0.0f;
                        int i4 = this.f30314;
                        this.f30309 = f;
                        this.f30314 = i4;
                        this.f30346 = c18396;
                    }
                }
            }
        }
        this.f30329 = false;
        this.f30354 = System.nanoTime();
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25310(float f) {
        C7252 c7252 = this.f30357;
        if (c7252 == null) {
            return;
        }
        float f2 = this.f30343;
        float f3 = this.f30339;
        if (f2 != f3 && this.f30329) {
            this.f30343 = f3;
        }
        float f4 = this.f30343;
        if (f4 == f) {
            return;
        }
        this.f30359 = false;
        this.f30309 = f;
        this.f30322 = c7252.m19417() / 1000.0f;
        m25321(this.f30309);
        this.f30346 = this.f30357.m19420();
        this.f30329 = false;
        this.f30354 = System.nanoTime();
        this.f30328 = true;
        this.f30339 = f4;
        this.f30343 = f4;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25316(C10362 c10362, float f, float f2, float[] fArr, int i) {
        float interpolation;
        float fMo14697 = this.f30341;
        float f3 = this.f30343;
        if (this.f30346 != null) {
            float fSignum = Math.signum(this.f30309 - f3);
            float interpolation2 = this.f30346.getInterpolation(this.f30343 + 1.0E-5f);
            interpolation = this.f30346.getInterpolation(this.f30343);
            fMo14697 = (((interpolation2 - interpolation) / 1.0E-5f) * fSignum) / this.f30322;
        } else {
            interpolation = f3;
        }
        Interpolator interpolator = this.f30346;
        if (interpolator instanceof AbstractInterpolatorC5136) {
            fMo14697 = ((AbstractInterpolatorC5136) interpolator).mo14697();
        }
        C19248 c19248 = (C19248) this.f30358.get(c10362);
        if ((i & 1) == 0) {
            c19248.m44401(interpolation, c10362.getWidth(), c10362.getHeight(), f, f2, fArr);
        } else {
            c19248.m44400(interpolation, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * fMo14697;
            fArr[1] = fArr[1] * fMo14697;
        }
    }

    @Override // l.C17606, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        C7252 c7252;
        C13601 c13601;
        if (this.f30349 || this.f30314 != -1 || (c7252 = this.f30357) == null || (c13601 = c7252.f22265) == null || c13601.m32695() != 0) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C0050.m931(context, this.f30356) + "->" + C0050.m931(context, this.f30326) + " (pos:" + this.f30343 + " Dpos/Dt:" + this.f30341;
    }

    @Override // l.C17606, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f30357 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.f30310 == i && this.f30352 == i2) ? false : true;
        if (this.f30316) {
            this.f30316 = false;
            m25323();
            m25306();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.f30310 = i;
        this.f30352 = i2;
        int iM19421 = this.f30357.m19421();
        C13601 c13601 = this.f30357.f22265;
        int i3 = c13601 == null ? -1 : c13601.f40564;
        C22069 c22069 = this.f30306;
        if ((!z3 && iM19421 == c22069.f70717 && i3 == c22069.f70716) || this.f30356 == -1) {
            z = true;
        } else {
            super.onMeasure(i, i2);
            c22069.m49649(this.f30357.m19409(iM19421), this.f30357.m19409(i3));
            c22069.m49650();
            c22069.f70717 = iM19421;
            c22069.f70716 = i3;
            z = false;
        }
        if (this.f30349 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iM35753 = this.mLayoutWidget.m35753() + getPaddingRight() + getPaddingLeft();
            int iM35732 = this.mLayoutWidget.m35732() + paddingBottom;
            int i4 = this.f30353;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.f30327;
                iM35753 = (int) ((this.f30340 * (this.f30330 - i5)) + i5);
                requestLayout();
            }
            int i6 = this.f30321;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.f30333;
                iM35732 = (int) ((this.f30340 * (this.f30317 - i7)) + i7);
                requestLayout();
            }
            setMeasuredDimension(iM35753, iM35732);
        }
        float fSignum = Math.signum(this.f30309 - this.f30343);
        long jNanoTime = System.nanoTime();
        Interpolator interpolator = this.f30346;
        float interpolation = this.f30343 + (!(interpolator instanceof C18396) ? (((jNanoTime - this.f30347) * fSignum) * 1.0E-9f) / this.f30322 : 0.0f);
        if (this.f30329) {
            interpolation = this.f30309;
        }
        if ((fSignum <= 0.0f || interpolation < this.f30309) && (fSignum > 0.0f || interpolation > this.f30309)) {
            z2 = false;
        } else {
            interpolation = this.f30309;
        }
        if (interpolator != null && !z2) {
            if (this.f30359) {
                interpolation = interpolator.getInterpolation((jNanoTime - this.f30354) * 1.0E-9f);
            } else {
                interpolation = interpolator.getInterpolation(interpolation);
            }
        }
        if ((fSignum > 0.0f && interpolation >= this.f30309) || (fSignum <= 0.0f && interpolation <= this.f30309)) {
            interpolation = this.f30309;
        }
        this.f30340 = interpolation;
        int childCount = getChildCount();
        long jNanoTime2 = System.nanoTime();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C19248 c19248 = (C19248) this.f30358.get(childAt);
            if (c19248 != null) {
                c19248.m44410(interpolation, jNanoTime2, childAt, this.f30338);
            }
        }
        if (this.f30349) {
            requestLayout();
        }
    }

    @Override // l.InterfaceC7273
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C13601 c13601;
        C7252 c7252 = this.f30357;
        return (c7252 == null || (c13601 = c7252.f22265) == null || c13601.m32696() == null || (this.f30357.f22265.m32696().m32499() & 2) != 0) ? false : true;
    }

    @Override // l.InterfaceC7273
    public final void onStopNestedScroll(View view, int i) {
        C7252 c7252 = this.f30357;
        if (c7252 == null) {
            return;
        }
        float f = this.f30315;
        float f2 = this.f30351;
        float f3 = f / f2;
        float f4 = this.f30312 / f2;
        C13601 c13601 = c7252.f22265;
        if (c13601 == null || c13601.f40556 == null) {
            return;
        }
        c7252.f22265.f40556.m32512(f3, f4);
    }

    @Override // l.InterfaceC1794
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f30320 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f30320 = false;
    }

    @Override // l.InterfaceC7273
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C13601 c13601;
        C13477 c13477M32696;
        int iM32510;
        C7252 c7252 = this.f30357;
        if (c7252 == null || (c13601 = c7252.f22265) == null || !c13601.m32694()) {
            return;
        }
        C13601 c13602 = this.f30357.f22265;
        if (c13602 == null || !c13602.m32694() || (c13477M32696 = c13602.m32696()) == null || (iM32510 = c13477M32696.m32510()) == -1 || view.getId() == iM32510) {
            C7252 c7253 = this.f30357;
            if (c7253 != null) {
                C13601 c13603 = c7253.f22265;
                if ((c13603 == null || c13603.f40556 == null) ? false : c7253.f22265.f40556.m32513()) {
                    float f = this.f30339;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
            }
            if (c13602.m32696() != null && (this.f30357.f22265.m32696().m32499() & 1) != 0) {
                C7252 c7254 = this.f30357;
                float f2 = i;
                float f3 = i2;
                C13601 c13604 = c7254.f22265;
                float fM32504 = (c13604 == null || c13604.f40556 == null) ? 0.0f : c7254.f22265.f40556.m32504(f2, f3);
                float f4 = this.f30343;
                if ((f4 <= 0.0f && fM32504 < 0.0f) || (f4 >= 1.0f && fM32504 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC0902((ViewGroup) view));
                    return;
                }
            }
            float f5 = this.f30339;
            long jNanoTime = System.nanoTime();
            float f6 = i;
            this.f30315 = f6;
            float f7 = i2;
            this.f30312 = f7;
            this.f30351 = (float) ((jNanoTime - this.f30335) * 1.0E-9d);
            this.f30335 = jNanoTime;
            C7252 c7255 = this.f30357;
            C13601 c13605 = c7255.f22265;
            if (c13605 != null && c13605.f40556 != null) {
                c7255.f22265.f40556.m32509(f6, f7);
            }
            if (f5 != this.f30339) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m25319(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f30320 = true;
        }
    }

    @Override // l.C17606, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        String resourceEntryName;
        m25319(false);
        super.dispatchDraw(canvas);
        if (this.f30357 == null) {
            return;
        }
        if ((this.f30311 & 1) == 1 && !isInEditMode()) {
            this.f30336++;
            long jNanoTime = System.nanoTime();
            long j = this.f30360;
            if (j != -1) {
                long j2 = jNanoTime - j;
                if (j2 > 200000000) {
                    this.f30319 = ((int) ((this.f30336 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f30336 = 0;
                    this.f30360 = jNanoTime;
                }
            } else {
                this.f30360 = jNanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float f = ((int) (this.f30343 * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30319);
            sb.append(" fps ");
            int i = this.f30356;
            StringBuilder sbM15339 = C5368.m15339(C9045.m23341(sb, i == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i), " -> "));
            int i2 = this.f30326;
            sbM15339.append(i2 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i2));
            sbM15339.append(" (progress: ");
            sbM15339.append(f);
            sbM15339.append(" ) state=");
            int i3 = this.f30314;
            if (i3 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i3 != -1 ? getContext().getResources().getResourceEntryName(i3) : "UNDEFINED";
            }
            sbM15339.append(resourceEntryName);
            String string = sbM15339.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f30311 > 1) {
            if (this.f30332 == null) {
                this.f30332 = new C21364(this);
            }
            this.f30332.m48412(canvas, this.f30358, this.f30357.m19417(), this.f30311);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25319(boolean z) {
        float f;
        boolean z2;
        int i;
        float interpolation;
        boolean z3;
        if (this.f30347 == -1) {
            this.f30347 = System.nanoTime();
        }
        float f2 = this.f30343;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f30314 = -1;
        }
        boolean z4 = false;
        if (this.f30344 || (this.f30328 && (z || this.f30309 != f2))) {
            float fSignum = Math.signum(this.f30309 - f2);
            long jNanoTime = System.nanoTime();
            Interpolator interpolator = this.f30346;
            if (interpolator instanceof AbstractInterpolatorC5136) {
                f = 0.0f;
            } else {
                f = (((jNanoTime - this.f30347) * fSignum) * 1.0E-9f) / this.f30322;
                this.f30341 = f;
            }
            float f3 = this.f30343 + f;
            if (this.f30329) {
                f3 = this.f30309;
            }
            if ((fSignum <= 0.0f || f3 < this.f30309) && (fSignum > 0.0f || f3 > this.f30309)) {
                z2 = false;
            } else {
                f3 = this.f30309;
                this.f30328 = false;
                z2 = true;
            }
            this.f30343 = f3;
            this.f30339 = f3;
            this.f30347 = jNanoTime;
            if (interpolator != null && !z2) {
                if (this.f30359) {
                    interpolation = interpolator.getInterpolation((jNanoTime - this.f30354) * 1.0E-9f);
                    this.f30343 = interpolation;
                    this.f30347 = jNanoTime;
                    Interpolator interpolator2 = this.f30346;
                    if (interpolator2 instanceof AbstractInterpolatorC5136) {
                        float fMo14697 = ((AbstractInterpolatorC5136) interpolator2).mo14697();
                        this.f30341 = fMo14697;
                        if (Math.abs(fMo14697) * this.f30322 <= 1.0E-5f) {
                            this.f30328 = false;
                        }
                        if (fMo14697 > 0.0f && interpolation >= 1.0f) {
                            this.f30343 = 1.0f;
                            this.f30328 = false;
                            interpolation = 1.0f;
                        }
                        if (fMo14697 < 0.0f && interpolation <= 0.0f) {
                            this.f30343 = 0.0f;
                            this.f30328 = false;
                            f3 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.f30346;
                    if (interpolator3 instanceof AbstractInterpolatorC5136) {
                        this.f30341 = ((AbstractInterpolatorC5136) interpolator3).mo14697();
                    } else {
                        this.f30341 = ((interpolator3.getInterpolation(f3 + f) - interpolation) * fSignum) / f;
                    }
                }
                f3 = interpolation;
            }
            if (Math.abs(this.f30341) > 1.0E-5f) {
                m25317(EnumC12191.MOVING);
            }
            if ((fSignum > 0.0f && f3 >= this.f30309) || (fSignum <= 0.0f && f3 <= this.f30309)) {
                f3 = this.f30309;
                this.f30328 = false;
            }
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.f30328 = false;
                m25317(EnumC12191.FINISHED);
            }
            int childCount = getChildCount();
            this.f30344 = false;
            long jNanoTime2 = System.nanoTime();
            this.f30340 = f3;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C19248 c19248 = (C19248) this.f30358.get(childAt);
                if (c19248 != null) {
                    this.f30344 = c19248.m44410(f3, jNanoTime2, childAt, this.f30338) | this.f30344;
                }
            }
            boolean z5 = (fSignum > 0.0f && f3 >= this.f30309) || (fSignum <= 0.0f && f3 <= this.f30309);
            if (!this.f30344 && !this.f30328 && z5) {
                m25317(EnumC12191.FINISHED);
            }
            if (this.f30349) {
                requestLayout();
            }
            this.f30344 = (!z5) | this.f30344;
            if (f3 > 0.0f || (i = this.f30356) == -1 || this.f30314 == i) {
                z4 = false;
            } else {
                this.f30314 = i;
                this.f30357.m19409(i).m12675(this);
                m25317(EnumC12191.FINISHED);
                z4 = true;
            }
            if (f3 >= 1.0d) {
                int i3 = this.f30314;
                int i4 = this.f30326;
                if (i3 != i4) {
                    this.f30314 = i4;
                    this.f30357.m19409(i4).m12675(this);
                    m25317(EnumC12191.FINISHED);
                    z4 = true;
                }
            }
            if (this.f30344 || this.f30328) {
                invalidate();
            } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                m25317(EnumC12191.FINISHED);
            }
            if ((!this.f30344 && this.f30328 && fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                m25323();
            }
        }
        float f4 = this.f30343;
        if (f4 >= 1.0f) {
            int i5 = this.f30314;
            int i6 = this.f30326;
            z3 = i5 == i6 ? z4 : true;
            this.f30314 = i6;
        } else {
            if (f4 <= 0.0f) {
                int i7 = this.f30314;
                int i8 = this.f30356;
                z3 = i7 == i8 ? z4 : true;
                this.f30314 = i8;
            }
            this.f30316 |= z4;
            if (z4 && !this.f30308) {
                requestLayout();
            }
            this.f30339 = this.f30343;
        }
        z4 = z3;
        this.f30316 |= z4;
        if (z4) {
            requestLayout();
        }
        this.f30339 = this.f30343;
    }

    @Override // l.C17606, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f30308 = true;
        try {
            if (this.f30357 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f30324 != i5 || this.f30325 != i6) {
                this.f30306.m49650();
                invalidate();
                m25319(true);
            }
            this.f30324 = i5;
            this.f30325 = i6;
        } finally {
            this.f30308 = false;
        }
    }

    @Override // l.C17606
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25287(AttributeSet attributeSet) {
        C7252 c7252;
        C7252 c7253;
        f30305 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69988);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.f30357 = new C7252(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f30314 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f30309 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f30328 = true;
                } else if (index == 0) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.f30311 == 0) {
                        this.f30311 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f30311 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.f30357 = null;
            }
        }
        if (this.f30311 != 0 && (c7253 = this.f30357) != null) {
            int iM19421 = c7253.m19421();
            C7252 c7254 = this.f30357;
            C4201 c4201M19409 = c7254.m19409(c7254.m19421());
            C0050.m931(getContext(), iM19421);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (c4201M19409.m12668(childAt.getId()) == null) {
                    C0050.m933(childAt);
                }
            }
            int[] iArrM12678 = c4201M19409.m12678();
            for (int i3 = 0; i3 < iArrM12678.length; i3++) {
                int i4 = iArrM12678[i3];
                C0050.m931(getContext(), i4);
                findViewById(iArrM12678[i3]);
                c4201M19409.m12679(i4);
                c4201M19409.m12683(i4);
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            for (C13601 c13601 : this.f30357.m19408()) {
                C13601 c13602 = this.f30357.f22265;
                c13601.m32691(getContext());
                int iM32697 = c13601.m32697();
                int iM32693 = c13601.m32693();
                C0050.m931(getContext(), iM32697);
                C0050.m931(getContext(), iM32693);
                sparseIntArray.get(iM32697);
                sparseIntArray2.get(iM32693);
                sparseIntArray.put(iM32697, iM32693);
                sparseIntArray2.put(iM32693, iM32697);
                this.f30357.m19409(iM32697);
                this.f30357.m19409(iM32693);
            }
        }
        if (this.f30314 != -1 || (c7252 = this.f30357) == null) {
            return;
        }
        this.f30314 = c7252.m19421();
        this.f30356 = this.f30357.m19421();
        C13601 c13603 = this.f30357.f22265;
        this.f30326 = c13603 != null ? c13603.f40564 : -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m25291(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m25291(view.getLeft() + f, view.getTop() + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        float left = view.getLeft() + f;
        float top = view.getTop() + f2;
        float right = f + view.getRight();
        float bottom = f2 + view.getBottom();
        RectF rectF = this.f30350;
        rectF.set(left, top, right, bottom);
        if (motionEvent.getAction() == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C13601 c13601;
        C13477 c13477M32696;
        int iM32510;
        RectF rectFM32505;
        C7252 c7252 = this.f30357;
        if (c7252 == null || !this.f30342 || (c13601 = c7252.f22265) == null || !c13601.m32694() || (c13477M32696 = c13601.m32696()) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (rectFM32505 = c13477M32696.m32505(this, new RectF())) != null && !rectFM32505.contains(motionEvent.getX(), motionEvent.getY())) || (iM32510 = c13477M32696.m32510()) == -1) {
            return false;
        }
        View view = this.f30355;
        if (view == null || view.getId() != iM32510) {
            this.f30355 = findViewById(iM32510);
        }
        View view2 = this.f30355;
        if (view2 == null) {
            return false;
        }
        float left = view2.getLeft();
        float top = this.f30355.getTop();
        float right = this.f30355.getRight();
        float bottom = this.f30355.getBottom();
        RectF rectF = this.f30350;
        rectF.set(left, top, right, bottom);
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || m25291(0.0f, 0.0f, this.f30355, motionEvent)) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7252 c7252 = this.f30357;
        if (c7252 != null && this.f30342 && c7252.m19419()) {
            C13601 c13601 = this.f30357.f22265;
            if (c13601 != null && !c13601.m32694()) {
                return super.onTouchEvent(motionEvent);
            }
            this.f30357.m19411(motionEvent, this.f30314, this);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C13601 c13601;
        int i;
        super.onAttachedToWindow();
        C7252 c7252 = this.f30357;
        if (c7252 != null && (i = this.f30314) != -1) {
            C4201 c4201M19409 = c7252.m19409(i);
            this.f30357.m19412(this);
            if (c4201M19409 != null) {
                c4201M19409.m12676((C17606) this);
            }
            this.f30356 = this.f30314;
        }
        m25323();
        C3019 c3019 = this.f30318;
        if (c3019 != null) {
            C10075 c10075 = c3019.f9548;
            int i2 = c3019.f9547;
            if (i2 != -1 || c3019.f9545 != -1) {
                if (i2 == -1) {
                    c10075.m25313(c3019.f9545);
                } else {
                    int i3 = c3019.f9545;
                    if (i3 == -1) {
                        c10075.setState(i2, -1, -1);
                    } else {
                        c10075.m25315(i2, i3);
                    }
                }
                c10075.m25317(EnumC12191.SETUP);
            }
            if (Float.isNaN(Float.NaN)) {
                if (Float.isNaN(c3019.f9546)) {
                    return;
                }
                c10075.m25321(c3019.f9546);
                return;
            }
            float f = c3019.f9546;
            if (!super.isAttachedToWindow()) {
                if (c10075.f30318 == null) {
                    c10075.f30318 = new C3019(c10075);
                }
                c10075.f30318.f9546 = f;
            } else {
                c10075.m25321(f);
                c10075.m25317(EnumC12191.MOVING);
                c10075.f30341 = Float.NaN;
                c10075.m25310(1.0f);
            }
            c3019.f9546 = Float.NaN;
            c3019.f9547 = -1;
            c3019.f9545 = -1;
            return;
        }
        C7252 c7253 = this.f30357;
        if (c7253 == null || (c13601 = c7253.f22265) == null || c13601.m32690() != 4) {
            return;
        }
        m25310(1.0f);
        m25317(EnumC12191.SETUP);
        m25317(EnumC12191.MOVING);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        C7252 c7252 = this.f30357;
        if (c7252 != null) {
            c7252.m19416(isRtl());
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m25323() {
        C7252 c7252;
        C13601 c13601;
        C7252 c7253 = this.f30357;
        if (c7253 == null) {
            return;
        }
        if (c7253.m19418(this, this.f30314)) {
            requestLayout();
            return;
        }
        int i = this.f30314;
        if (i != -1) {
            this.f30357.m19413(this, i);
        }
        if (!this.f30357.m19419() || (c13601 = (c7252 = this.f30357).f22265) == null || c13601.f40556 == null) {
            return;
        }
        c7252.f22265.f40556.m32506();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25314(int i, float f, float f2, float f3, float[] fArr) {
        View viewById = getViewById(i);
        C19248 c19248 = (C19248) this.f30358.get(viewById);
        if (c19248 != null) {
            c19248.m44400(f, f2, f3, fArr);
            viewById.getY();
        } else {
            if (viewById == null) {
                return;
            }
            viewById.getContext().getResources().getResourceName(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25312(float f, boolean z, int i) {
        ArrayList arrayList = this.f30345;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC12896) it.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m25297() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f30345;
        if (arrayList2 == null || arrayList2.isEmpty() || this.f30313 == this.f30339) {
            return;
        }
        if (this.f30348 != -1 && (arrayList = this.f30345) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC12896) it.next()).getClass();
            }
        }
        this.f30348 = -1;
        this.f30313 = this.f30339;
        ArrayList arrayList3 = this.f30345;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((InterfaceC12896) it2.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25309() {
        ArrayList arrayList = this.f30345;
        if (arrayList != null && !arrayList.isEmpty() && this.f30348 == -1) {
            this.f30348 = this.f30314;
            ArrayList arrayList2 = this.f30337;
            int iIntValue = !arrayList2.isEmpty() ? ((Integer) C18566.m43105(arrayList2, 1)).intValue() : -1;
            int i = this.f30314;
            if (iIntValue != i && i != -1) {
                arrayList2.add(Integer.valueOf(i));
            }
        }
        m25306();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m25306() {
        ArrayList arrayList = this.f30345;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<Integer> arrayList2 = this.f30337;
        for (Integer num : arrayList2) {
            ArrayList<InterfaceC12896> arrayList3 = this.f30345;
            if (arrayList3 != null) {
                for (InterfaceC12896 interfaceC12896 : arrayList3) {
                    num.getClass();
                    interfaceC12896.getClass();
                }
            }
        }
        arrayList2.clear();
    }

    @Override // l.C17606, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C0196) {
            C0196 c0196 = (C0196) view;
            if (this.f30345 == null) {
                this.f30345 = new ArrayList();
            }
            this.f30345.add(c0196);
            if (c0196.m1339()) {
                if (this.f30323 == null) {
                    this.f30323 = new ArrayList();
                }
                this.f30323.add(c0196);
            }
            if (c0196.m1340()) {
                if (this.f30307 == null) {
                    this.f30307 = new ArrayList();
                }
                this.f30307.add(c0196);
            }
        }
    }

    @Override // l.C17606, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f30323;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f30307;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m25322() {
        return this.f30356;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m25320() {
        return this.f30326;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m25324() {
        return this.f30342;
    }
}
