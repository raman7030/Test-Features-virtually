package p067l;

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

/* JADX INFO: renamed from: l.ۤۚ */
/* JADX INFO: compiled from: L1CU */
/* JADX INFO: loaded from: classes4.dex */
public class C1342 extends C1715 implements InterfaceC0931 {

    /* JADX INFO: renamed from: ۢۧ */
    public static boolean f33266;

    /* JADX INFO: renamed from: ֡֫ */
    public C1937 f33267;

    /* JADX INFO: renamed from: ֨֫ */
    public ArrayList f33268;

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f33269;

    /* JADX INFO: renamed from: ֫ۧ */
    public float f33270;

    /* JADX INFO: renamed from: ۖ֫ */
    public int f33271;

    /* JADX INFO: renamed from: ۗ */
    public int f33272;

    /* JADX INFO: renamed from: ۗ֫ */
    public float f33273;

    /* JADX INFO: renamed from: ۘ֫ */
    public float f33274;

    /* JADX INFO: renamed from: ۙ */
    public int f33275;

    /* JADX INFO: renamed from: ۙ֫ */
    public float f33276;

    /* JADX INFO: renamed from: ۚ֫ */
    public boolean f33277;

    /* JADX INFO: renamed from: ۛ */
    public int f33278;

    /* JADX INFO: renamed from: ۛ֫ */
    public C0992 f33279;

    /* JADX INFO: renamed from: ۜ֫ */
    public float f33280;

    /* JADX INFO: renamed from: ۜۧ */
    public boolean f33281;

    /* JADX INFO: renamed from: ۟ */
    public int f33282;

    /* JADX INFO: renamed from: ۟֫ */
    public float f33283;

    /* JADX INFO: renamed from: ۠֫ */
    public ArrayList f33284;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f33285;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f33286;

    /* JADX INFO: renamed from: ۤ */
    public int f33287;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f33288;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f33289;

    /* JADX INFO: renamed from: ۧۧ */
    public boolean f33290;

    /* JADX INFO: renamed from: ۨ */
    public int f33291;

    /* JADX INFO: renamed from: ۨ֫ */
    public C1755 f33292;

    /* JADX INFO: renamed from: ۫ */
    public C1902 f33293;

    /* JADX INFO: renamed from: ۫֫ */
    public int f33294;

    /* JADX INFO: renamed from: ۬ */
    public C1587 f33295;

    /* JADX INFO: renamed from: ۬֫ */
    public long f33296;

    /* JADX INFO: renamed from: ܰ */
    public int f33297;

    /* JADX INFO: renamed from: ܰ֫ */
    public ArrayList f33298;

    /* JADX INFO: renamed from: ܳ֫ */
    public C1580 f33299;

    /* JADX INFO: renamed from: ܳۧ */
    public float f33300;

    /* JADX INFO: renamed from: ܶ֫ */
    public float f33301;

    /* JADX INFO: renamed from: ܺ֫ */
    public float f33302;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f33303;

    /* JADX INFO: renamed from: ܽۧ */
    public float f33304;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f33305;

    /* JADX INFO: renamed from: ܿۧ */
    public ArrayList f33306;

    /* JADX INFO: renamed from: ᩳ֫ */
    public Interpolator f33307;

    /* JADX INFO: renamed from: ᩳۧ */
    public long f33308;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f33309;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f33310;

    /* JADX INFO: renamed from: ᩶ */
    public RectF f33311;

    /* JADX INFO: renamed from: ᩶֫ */
    public float f33312;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f33313;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f33314;

    /* JADX INFO: renamed from: ᩸ */
    public long f33315;

    /* JADX INFO: renamed from: ᩸֫ */
    public View f33316;

    /* JADX INFO: renamed from: ᩹ */
    public int f33317;

    /* JADX INFO: renamed from: ᩹֫ */
    public C1202 f33318;

    /* JADX INFO: renamed from: ᩺ */
    public HashMap f33319;

    /* JADX INFO: renamed from: ᩺֫ */
    public boolean f33320;

    /* JADX INFO: renamed from: ᩻֫ */
    public long f33321;

    /* JADX INFO: renamed from: ᩻ۧ */
    public EnumC1447 f33322;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // p067l.InterfaceC1203
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // p067l.InterfaceC1203
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    public C1342(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33302 = 0.0f;
        this.f33317 = -1;
        this.f33275 = -1;
        this.f33287 = -1;
        this.f33271 = 0;
        this.f33313 = 0;
        this.f33303 = true;
        this.f33319 = new HashMap();
        this.f33315 = 0L;
        this.f33283 = 1.0f;
        this.f33300 = 0.0f;
        this.f33304 = 0.0f;
        this.f33270 = 0.0f;
        this.f33289 = false;
        this.f33272 = 0;
        this.f33320 = false;
        this.f33292 = new C1755();
        this.f33295 = new C1587(this);
        this.f33281 = false;
        this.f33305 = false;
        this.f33284 = null;
        this.f33268 = null;
        this.f33306 = null;
        this.f33297 = 0;
        this.f33321 = -1L;
        this.f33280 = 0.0f;
        this.f33309 = 0;
        this.f33274 = 0.0f;
        this.f33310 = false;
        this.f33299 = new C1580();
        this.f33269 = false;
        this.f33322 = EnumC1447.UNDEFINED;
        this.f33267 = new C1937(this);
        this.f33277 = false;
        this.f33311 = new RectF();
        this.f33316 = null;
        this.f33298 = new ArrayList();
        m27306(attributeSet);
    }

    public C1342(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33302 = 0.0f;
        this.f33317 = -1;
        this.f33275 = -1;
        this.f33287 = -1;
        this.f33271 = 0;
        this.f33313 = 0;
        this.f33303 = true;
        this.f33319 = new HashMap();
        this.f33315 = 0L;
        this.f33283 = 1.0f;
        this.f33300 = 0.0f;
        this.f33304 = 0.0f;
        this.f33270 = 0.0f;
        this.f33289 = false;
        this.f33272 = 0;
        this.f33320 = false;
        this.f33292 = new C1755();
        this.f33295 = new C1587(this);
        this.f33281 = false;
        this.f33305 = false;
        this.f33284 = null;
        this.f33268 = null;
        this.f33306 = null;
        this.f33297 = 0;
        this.f33321 = -1L;
        this.f33280 = 0.0f;
        this.f33309 = 0;
        this.f33274 = 0.0f;
        this.f33310 = false;
        this.f33299 = new C1580();
        this.f33269 = false;
        this.f33322 = EnumC1447.UNDEFINED;
        this.f33267 = new C1937(this);
        this.f33277 = false;
        this.f33311 = new RectF();
        this.f33316 = null;
        this.f33298 = new ArrayList();
        m27306(attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27336(EnumC1447 enumC1447) {
        EnumC1447 enumC1448 = EnumC1447.FINISHED;
        if (enumC1447 == enumC1448 && this.f33275 == -1) {
            return;
        }
        EnumC1447 enumC1449 = this.f33322;
        this.f33322 = enumC1447;
        EnumC1447 enumC14410 = EnumC1447.MOVING;
        if (enumC1449 == enumC14410 && enumC1447 == enumC14410) {
            m27316();
        }
        int i = C1237.f27513[enumC1449.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && enumC1447 == enumC1448) {
                m27328();
                return;
            }
            return;
        }
        if (enumC1447 == enumC14410) {
            m27316();
        }
        if (enumC1447 == enumC1448) {
            m27328();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27337(C1517 c1517) {
        this.f33318.m21380(c1517);
        m27336(EnumC1447.SETUP);
        int i = this.f33275;
        C1517 c1518 = this.f33318.f25155;
        if (i == (c1518 == null ? -1 : c1518.f43642)) {
            this.f33304 = 1.0f;
            this.f33300 = 1.0f;
            this.f33270 = 1.0f;
        } else {
            this.f33304 = 0.0f;
            this.f33300 = 0.0f;
            this.f33270 = 0.0f;
        }
        this.f33308 = c1517.m34810() ? -1L : System.nanoTime();
        int iM21387 = this.f33318.m21387();
        C1517 c1519 = this.f33318.f25155;
        int i2 = c1519 != null ? c1519.f43642 : -1;
        if (iM21387 == this.f33317 && i2 == this.f33287) {
            return;
        }
        this.f33317 = iM21387;
        this.f33287 = i2;
        this.f33318.m21376(iM21387, i2);
        C1050 c1050M21375 = this.f33318.m21375(this.f33317);
        C1050 c1050M21376 = this.f33318.m21375(this.f33287);
        C1937 c1937 = this.f33267;
        c1937.m51987(c1050M21375, c1050M21376);
        int i3 = this.f33317;
        int i4 = this.f33287;
        c1937.f73438 = i3;
        c1937.f73437 = i4;
        c1937.m51988();
        c1937.m51988();
        invalidate();
    }

    @Override // p067l.C1715
    public final void loadLayoutDescription(int i) {
        C1937 c1937 = this.f33267;
        if (i != 0) {
            try {
                this.f33318 = new C1202(getContext(), this, i);
                if (super.isAttachedToWindow()) {
                    this.f33318.m21378(this);
                    c1937.m51987(this.f33318.m21375(this.f33317), this.f33318.m21375(this.f33287));
                    c1937.m51988();
                    invalidate();
                    this.f33318.m21382(isRtl());
                    return;
                }
                return;
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        }
        this.f33318 = null;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m27332(int r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C1342.m27332(int):void");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27334(int i, int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.f33279 == null) {
                this.f33279 = new C0992(this);
            }
            C0992 c0992 = this.f33279;
            c0992.f12349 = i;
            c0992.f12347 = i2;
            return;
        }
        C1202 c1202 = this.f33318;
        if (c1202 != null) {
            this.f33317 = i;
            this.f33287 = i2;
            c1202.m21376(i, i2);
            C1050 c1050M21375 = this.f33318.m21375(i);
            C1050 c1050M21376 = this.f33318.m21375(i2);
            C1937 c1937 = this.f33267;
            c1937.m51987(c1050M21375, c1050M21376);
            c1937.m51988();
            invalidate();
            this.f33304 = 0.0f;
            m27329(0.0f);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27340(float f) {
        if (!super.isAttachedToWindow()) {
            if (this.f33279 == null) {
                this.f33279 = new C0992(this);
            }
            this.f33279.f12348 = f;
            return;
        }
        if (f <= 0.0f) {
            this.f33275 = this.f33317;
            if (this.f33304 == 0.0f) {
                m27336(EnumC1447.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.f33275 = this.f33287;
            if (this.f33304 == 1.0f) {
                m27336(EnumC1447.FINISHED);
            }
        } else {
            this.f33275 = -1;
            m27336(EnumC1447.MOVING);
        }
        if (this.f33318 == null) {
            return;
        }
        this.f33290 = true;
        this.f33270 = f;
        this.f33300 = f;
        this.f33308 = -1L;
        this.f33315 = -1L;
        this.f33307 = null;
        this.f33289 = true;
        invalidate();
    }

    @Override // p067l.C1715
    public final void setState(int i, int i2, int i3) {
        m27336(EnumC1447.SETUP);
        this.f33275 = i;
        this.f33317 = -1;
        this.f33287 = -1;
        C1190 c1190 = this.mConstraintLayoutSpec;
        if (c1190 != null) {
            c1190.m20947(i2, i3, i);
            return;
        }
        C1202 c1202 = this.f33318;
        if (c1202 != null) {
            c1202.m21375(i).m14552((C1715) this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX INFO: renamed from: ֫ */
    public final void m27330(float f, float f2, int i) {
        C1517 c1517;
        float fM34610;
        if (this.f33318 == null || this.f33304 == f) {
            return;
        }
        this.f33320 = true;
        this.f33315 = System.nanoTime();
        float fM21383 = this.f33318.m21383() / 1000.0f;
        this.f33283 = fM21383;
        this.f33270 = f;
        this.f33289 = true;
        C1755 c1755 = this.f33292;
        if (i == 0 || i == 1 || i == 2) {
            if (i == 1) {
                f = 0.0f;
            } else if (i == 2) {
                f = 1.0f;
            }
            float f3 = this.f33304;
            float fM21388 = this.f33318.m21388();
            C1202 c1202 = this.f33318;
            C1517 c1518 = c1202.f25155;
            this.f33292.m45100(f3, f, f2, fM21383, fM21388, (c1518 == null || c1518.f43634 == null) ? 0.0f : c1202.f25155.f43634.m34610());
            int i2 = this.f33275;
            this.f33270 = f;
            this.f33275 = i2;
            this.f33307 = c1755;
        } else {
            C1587 c1587 = this.f33295;
            if (i == 4) {
                float f4 = this.f33304;
                float fM21389 = this.f33318.m21388();
                c1587.f48902 = f2;
                c1587.f48901 = f4;
                c1587.f48903 = fM21389;
                this.f33307 = c1587;
            } else if (i == 5) {
                float f5 = this.f33304;
                float fM213810 = this.f33318.m21388();
                if (f2 > 0.0f) {
                    float f6 = f2 / fM213810;
                    if (((f2 * f6) - (((fM213810 * f6) * f6) / 2.0f)) + f5 > 1.0f) {
                        float f7 = this.f33304;
                        float fM213811 = this.f33318.m21388();
                        c1587.f48902 = f2;
                        c1587.f48901 = f7;
                        c1587.f48903 = fM213811;
                        this.f33307 = c1587;
                    } else {
                        float f8 = this.f33304;
                        float f9 = this.f33283;
                        float fM213812 = this.f33318.m21388();
                        C1202 c1203 = this.f33318;
                        c1517 = c1203.f25155;
                        if (c1517 != null || c1517.f43634 == null) {
                            fM34610 = 0.0f;
                        } else {
                            fM34610 = c1203.f25155.f43634.m34610();
                        }
                        this.f33292.m45100(f8, f, f2, f9, fM213812, fM34610);
                        this.f33302 = 0.0f;
                        int i3 = this.f33275;
                        this.f33270 = f;
                        this.f33275 = i3;
                        this.f33307 = c1755;
                    }
                } else {
                    float f10 = (-f2) / fM213810;
                    if ((((fM213810 * f10) * f10) / 2.0f) + (f2 * f10) + f5 < 0.0f) {
                        float f11 = this.f33304;
                        float fM213813 = this.f33318.m21388();
                        c1587.f48902 = f2;
                        c1587.f48901 = f11;
                        c1587.f48903 = fM213813;
                        this.f33307 = c1587;
                    } else {
                        float f12 = this.f33304;
                        float f13 = this.f33283;
                        float fM213814 = this.f33318.m21388();
                        C1202 c1204 = this.f33318;
                        c1517 = c1204.f25155;
                        if (c1517 != null) {
                            fM34610 = 0.0f;
                        } else {
                            fM34610 = 0.0f;
                        }
                        this.f33292.m45100(f12, f, f2, f13, fM213814, fM34610);
                        this.f33302 = 0.0f;
                        int i4 = this.f33275;
                        this.f33270 = f;
                        this.f33275 = i4;
                        this.f33307 = c1755;
                    }
                }
            }
        }
        this.f33290 = false;
        this.f33315 = System.nanoTime();
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27329(float f) {
        C1202 c1202 = this.f33318;
        if (c1202 == null) {
            return;
        }
        float f2 = this.f33304;
        float f3 = this.f33300;
        if (f2 != f3 && this.f33290) {
            this.f33304 = f3;
        }
        float f4 = this.f33304;
        if (f4 == f) {
            return;
        }
        this.f33320 = false;
        this.f33270 = f;
        this.f33283 = c1202.m21383() / 1000.0f;
        m27340(this.f33270);
        this.f33307 = this.f33318.m21386();
        this.f33290 = false;
        this.f33315 = System.nanoTime();
        this.f33289 = true;
        this.f33300 = f4;
        this.f33304 = f4;
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27335(C1356 c1356, float f, float f2, float[] fArr, int i) {
        float interpolation;
        float fMo16605 = this.f33302;
        float f3 = this.f33304;
        if (this.f33307 != null) {
            float fSignum = Math.signum(this.f33270 - f3);
            float interpolation2 = this.f33307.getInterpolation(this.f33304 + 1.0E-5f);
            interpolation = this.f33307.getInterpolation(this.f33304);
            fMo16605 = (((interpolation2 - interpolation) / 1.0E-5f) * fSignum) / this.f33283;
        } else {
            interpolation = f3;
        }
        Interpolator interpolator = this.f33307;
        if (interpolator instanceof AbstractInterpolatorC1097) {
            fMo16605 = ((AbstractInterpolatorC1097) interpolator).mo16605();
        }
        C1797 c1797 = (C1797) this.f33319.get(c1356);
        if ((i & 1) == 0) {
            c1797.m46695(interpolation, c1356.getWidth(), c1356.getHeight(), f, f2, fArr);
        } else {
            c1797.m46694(interpolation, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * fMo16605;
            fArr[1] = fArr[1] * fMo16605;
        }
    }

    @Override // p067l.C1715, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        C1202 c1202;
        C1517 c1517;
        if (this.f33310 || this.f33275 != -1 || (c1202 = this.f33318) == null || (c1517 = c1202.f25155) == null || c1517.m34807() != 0) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C0845.m3341(context, this.f33317) + "->" + C0845.m3341(context, this.f33287) + " (pos:" + this.f33304 + " Dpos/Dt:" + this.f33302;
    }

    @Override // p067l.C1715, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f33318 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.f33271 == i && this.f33313 == i2) ? false : true;
        if (this.f33277) {
            this.f33277 = false;
            m27342();
            m27325();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.f33271 = i;
        this.f33313 = i2;
        int iM21387 = this.f33318.m21387();
        C1517 c1517 = this.f33318.f25155;
        int i3 = c1517 == null ? -1 : c1517.f43642;
        C1937 c1937 = this.f33267;
        if ((!z3 && iM21387 == c1937.f73438 && i3 == c1937.f73437) || this.f33317 == -1) {
            z = true;
        } else {
            super.onMeasure(i, i2);
            c1937.m51987(this.f33318.m21375(iM21387), this.f33318.m21375(i3));
            c1937.m51988();
            c1937.f73438 = iM21387;
            c1937.f73437 = i3;
            z = false;
        }
        if (this.f33310 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iM37911 = this.mLayoutWidget.m37911() + getPaddingRight() + getPaddingLeft();
            int iM37890 = this.mLayoutWidget.m37890() + paddingBottom;
            int i4 = this.f33314;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.f33288;
                iM37911 = (int) ((this.f33301 * (this.f33291 - i5)) + i5);
                requestLayout();
            }
            int i6 = this.f33282;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.f33294;
                iM37890 = (int) ((this.f33301 * (this.f33278 - i7)) + i7);
                requestLayout();
            }
            setMeasuredDimension(iM37911, iM37890);
        }
        float fSignum = Math.signum(this.f33270 - this.f33304);
        long jNanoTime = System.nanoTime();
        Interpolator interpolator = this.f33307;
        float interpolation = this.f33304 + (!(interpolator instanceof C1755) ? (((jNanoTime - this.f33308) * fSignum) * 1.0E-9f) / this.f33283 : 0.0f);
        if (this.f33290) {
            interpolation = this.f33270;
        }
        if ((fSignum <= 0.0f || interpolation < this.f33270) && (fSignum > 0.0f || interpolation > this.f33270)) {
            z2 = false;
        } else {
            interpolation = this.f33270;
        }
        if (interpolator != null && !z2) {
            if (this.f33320) {
                interpolation = interpolator.getInterpolation((jNanoTime - this.f33315) * 1.0E-9f);
            } else {
                interpolation = interpolator.getInterpolation(interpolation);
            }
        }
        if ((fSignum > 0.0f && interpolation >= this.f33270) || (fSignum <= 0.0f && interpolation <= this.f33270)) {
            interpolation = this.f33270;
        }
        this.f33301 = interpolation;
        int childCount = getChildCount();
        long jNanoTime2 = System.nanoTime();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C1797 c1797 = (C1797) this.f33319.get(childAt);
            if (c1797 != null) {
                c1797.m46704(interpolation, jNanoTime2, childAt, this.f33299);
            }
        }
        if (this.f33310) {
            requestLayout();
        }
    }

    @Override // p067l.InterfaceC1203
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C1517 c1517;
        C1202 c1202 = this.f33318;
        return (c1202 == null || (c1517 = c1202.f25155) == null || c1517.m34808() == null || (this.f33318.f25155.m34808().m34601() & 2) != 0) ? false : true;
    }

    @Override // p067l.InterfaceC1203
    public final void onStopNestedScroll(View view, int i) {
        C1202 c1202 = this.f33318;
        if (c1202 == null) {
            return;
        }
        float f = this.f33276;
        float f2 = this.f33312;
        float f3 = f / f2;
        float f4 = this.f33273 / f2;
        C1517 c1517 = c1202.f25155;
        if (c1517 == null || c1517.f43634 == null) {
            return;
        }
        c1202.f25155.f43634.m34614(f3, f4);
    }

    @Override // p067l.InterfaceC0931
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f33281 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f33281 = false;
    }

    @Override // p067l.InterfaceC1203
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C1517 c1517;
        C1511 c1511M34808;
        int iM34612;
        C1202 c1202 = this.f33318;
        if (c1202 == null || (c1517 = c1202.f25155) == null || !c1517.m34806()) {
            return;
        }
        C1517 c1518 = this.f33318.f25155;
        if (c1518 == null || !c1518.m34806() || (c1511M34808 = c1518.m34808()) == null || (iM34612 = c1511M34808.m34612()) == -1 || view.getId() == iM34612) {
            C1202 c1203 = this.f33318;
            if (c1203 != null) {
                C1517 c1519 = c1203.f25155;
                if ((c1519 == null || c1519.f43634 == null) ? false : c1203.f25155.f43634.m34615()) {
                    float f = this.f33300;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
            }
            if (c1518.m34808() != null && (this.f33318.f25155.m34808().m34601() & 1) != 0) {
                C1202 c1204 = this.f33318;
                float f2 = i;
                float f3 = i2;
                C1517 c15110 = c1204.f25155;
                float fM34606 = (c15110 == null || c15110.f43634 == null) ? 0.0f : c1204.f25155.f43634.m34606(f2, f3);
                float f4 = this.f33304;
                if ((f4 <= 0.0f && fM34606 < 0.0f) || (f4 >= 1.0f && fM34606 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC0887((ViewGroup) view));
                    return;
                }
            }
            float f5 = this.f33300;
            long jNanoTime = System.nanoTime();
            float f6 = i;
            this.f33276 = f6;
            float f7 = i2;
            this.f33273 = f7;
            this.f33312 = (float) ((jNanoTime - this.f33296) * 1.0E-9d);
            this.f33296 = jNanoTime;
            C1202 c1205 = this.f33318;
            C1517 c15111 = c1205.f25155;
            if (c15111 != null && c15111.f43634 != null) {
                c1205.f25155.f43634.m34611(f6, f7);
            }
            if (f5 != this.f33300) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m27338(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f33281 = true;
        }
    }

    @Override // p067l.C1715, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        String resourceEntryName;
        m27338(false);
        super.dispatchDraw(canvas);
        if (this.f33318 == null) {
            return;
        }
        if ((this.f33272 & 1) == 1 && !isInEditMode()) {
            this.f33297++;
            long jNanoTime = System.nanoTime();
            long j = this.f33321;
            if (j != -1) {
                long j2 = jNanoTime - j;
                if (j2 > 200000000) {
                    this.f33280 = ((int) ((this.f33297 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f33297 = 0;
                    this.f33321 = jNanoTime;
                }
            } else {
                this.f33321 = jNanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float f = ((int) (this.f33304 * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33280);
            sb.append(" fps ");
            int i = this.f33317;
            StringBuilder sbM17248 = C7470.m17248(C10965.m25286(sb, i == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i), " -> "));
            int i2 = this.f33287;
            sbM17248.append(i2 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i2));
            sbM17248.append(" (progress: ");
            sbM17248.append(f);
            sbM17248.append(" ) state=");
            int i3 = this.f33275;
            if (i3 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i3 != -1 ? getContext().getResources().getResourceEntryName(i3) : "UNDEFINED";
            }
            sbM17248.append(resourceEntryName);
            String string = sbM17248.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f33272 > 1) {
            if (this.f33293 == null) {
                this.f33293 = new C1902(this);
            }
            this.f33293.m50748(canvas, this.f33319, this.f33318.m21383(), this.f33272);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27338(boolean z) {
        float f;
        boolean z2;
        int i;
        float interpolation;
        boolean z3;
        if (this.f33308 == -1) {
            this.f33308 = System.nanoTime();
        }
        float f2 = this.f33304;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f33275 = -1;
        }
        boolean z4 = false;
        if (this.f33305 || (this.f33289 && (z || this.f33270 != f2))) {
            float fSignum = Math.signum(this.f33270 - f2);
            long jNanoTime = System.nanoTime();
            Interpolator interpolator = this.f33307;
            if (interpolator instanceof AbstractInterpolatorC1097) {
                f = 0.0f;
            } else {
                f = (((jNanoTime - this.f33308) * fSignum) * 1.0E-9f) / this.f33283;
                this.f33302 = f;
            }
            float f3 = this.f33304 + f;
            if (this.f33290) {
                f3 = this.f33270;
            }
            if ((fSignum <= 0.0f || f3 < this.f33270) && (fSignum > 0.0f || f3 > this.f33270)) {
                z2 = false;
            } else {
                f3 = this.f33270;
                this.f33289 = false;
                z2 = true;
            }
            this.f33304 = f3;
            this.f33300 = f3;
            this.f33308 = jNanoTime;
            if (interpolator != null && !z2) {
                if (this.f33320) {
                    interpolation = interpolator.getInterpolation((jNanoTime - this.f33315) * 1.0E-9f);
                    this.f33304 = interpolation;
                    this.f33308 = jNanoTime;
                    Interpolator interpolator2 = this.f33307;
                    if (interpolator2 instanceof AbstractInterpolatorC1097) {
                        float fMo16605 = ((AbstractInterpolatorC1097) interpolator2).mo16605();
                        this.f33302 = fMo16605;
                        if (Math.abs(fMo16605) * this.f33283 <= 1.0E-5f) {
                            this.f33289 = false;
                        }
                        if (fMo16605 > 0.0f && interpolation >= 1.0f) {
                            this.f33304 = 1.0f;
                            this.f33289 = false;
                            interpolation = 1.0f;
                        }
                        if (fMo16605 < 0.0f && interpolation <= 0.0f) {
                            this.f33304 = 0.0f;
                            this.f33289 = false;
                            f3 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.f33307;
                    if (interpolator3 instanceof AbstractInterpolatorC1097) {
                        this.f33302 = ((AbstractInterpolatorC1097) interpolator3).mo16605();
                    } else {
                        this.f33302 = ((interpolator3.getInterpolation(f3 + f) - interpolation) * fSignum) / f;
                    }
                }
                f3 = interpolation;
            }
            if (Math.abs(this.f33302) > 1.0E-5f) {
                m27336(EnumC1447.MOVING);
            }
            if ((fSignum > 0.0f && f3 >= this.f33270) || (fSignum <= 0.0f && f3 <= this.f33270)) {
                f3 = this.f33270;
                this.f33289 = false;
            }
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.f33289 = false;
                m27336(EnumC1447.FINISHED);
            }
            int childCount = getChildCount();
            this.f33305 = false;
            long jNanoTime2 = System.nanoTime();
            this.f33301 = f3;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1797 c1797 = (C1797) this.f33319.get(childAt);
                if (c1797 != null) {
                    this.f33305 = c1797.m46704(f3, jNanoTime2, childAt, this.f33299) | this.f33305;
                }
            }
            boolean z5 = (fSignum > 0.0f && f3 >= this.f33270) || (fSignum <= 0.0f && f3 <= this.f33270);
            if (!this.f33305 && !this.f33289 && z5) {
                m27336(EnumC1447.FINISHED);
            }
            if (this.f33310) {
                requestLayout();
            }
            this.f33305 = (!z5) | this.f33305;
            if (f3 > 0.0f || (i = this.f33317) == -1 || this.f33275 == i) {
                z4 = false;
            } else {
                this.f33275 = i;
                this.f33318.m21375(i).m14551(this);
                m27336(EnumC1447.FINISHED);
                z4 = true;
            }
            if (f3 >= 1.0d) {
                int i3 = this.f33275;
                int i4 = this.f33287;
                if (i3 != i4) {
                    this.f33275 = i4;
                    this.f33318.m21375(i4).m14551(this);
                    m27336(EnumC1447.FINISHED);
                    z4 = true;
                }
            }
            if (this.f33305 || this.f33289) {
                invalidate();
            } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                m27336(EnumC1447.FINISHED);
            }
            if ((!this.f33305 && this.f33289 && fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                m27342();
            }
        }
        float f4 = this.f33304;
        if (f4 >= 1.0f) {
            int i5 = this.f33275;
            int i6 = this.f33287;
            z3 = i5 == i6 ? z4 : true;
            this.f33275 = i6;
        } else {
            if (f4 <= 0.0f) {
                int i7 = this.f33275;
                int i8 = this.f33317;
                z3 = i7 == i8 ? z4 : true;
                this.f33275 = i8;
            }
            this.f33277 |= z4;
            if (z4 && !this.f33269) {
                requestLayout();
            }
            this.f33300 = this.f33304;
        }
        z4 = z3;
        this.f33277 |= z4;
        if (z4) {
            requestLayout();
        }
        this.f33300 = this.f33304;
    }

    @Override // p067l.C1715, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f33269 = true;
        try {
            if (this.f33318 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f33285 != i5 || this.f33286 != i6) {
                this.f33267.m51988();
                invalidate();
                m27338(true);
            }
            this.f33285 = i5;
            this.f33286 = i6;
        } finally {
            this.f33269 = false;
        }
    }

    @Override // p067l.C1715
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27306(AttributeSet attributeSet) {
        C1202 c1202;
        C1202 c1203;
        f33266 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72697);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.f33318 = new C1202(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f33275 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f33270 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f33289 = true;
                } else if (index == 0) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.f33272 == 0) {
                        this.f33272 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f33272 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z) {
                this.f33318 = null;
            }
        }
        if (this.f33272 != 0 && (c1203 = this.f33318) != null) {
            int iM21387 = c1203.m21387();
            C1202 c1204 = this.f33318;
            C1050 c1050M21375 = c1204.m21375(c1204.m21387());
            C0845.m3341(getContext(), iM21387);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (c1050M21375.m14544(childAt.getId()) == null) {
                    C0845.m3343(childAt);
                }
            }
            int[] iArrM14554 = c1050M21375.m14554();
            for (int i3 = 0; i3 < iArrM14554.length; i3++) {
                int i4 = iArrM14554[i3];
                C0845.m3341(getContext(), i4);
                findViewById(iArrM14554[i3]);
                c1050M21375.m14555(i4);
                c1050M21375.m14559(i4);
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            for (C1517 c1517 : this.f33318.m21374()) {
                C1517 c1518 = this.f33318.f25155;
                c1517.m34803(getContext());
                int iM34809 = c1517.m34809();
                int iM34805 = c1517.m34805();
                C0845.m3341(getContext(), iM34809);
                C0845.m3341(getContext(), iM34805);
                sparseIntArray.get(iM34809);
                sparseIntArray2.get(iM34805);
                sparseIntArray.put(iM34809, iM34805);
                sparseIntArray2.put(iM34805, iM34809);
                this.f33318.m21375(iM34809);
                this.f33318.m21375(iM34805);
            }
        }
        if (this.f33275 != -1 || (c1202 = this.f33318) == null) {
            return;
        }
        this.f33275 = c1202.m21387();
        this.f33317 = this.f33318.m21387();
        C1517 c1519 = this.f33318.f25155;
        this.f33287 = c1519 != null ? c1519.f43642 : -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m27310(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m27310(view.getLeft() + f, view.getTop() + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        float left = view.getLeft() + f;
        float top = view.getTop() + f2;
        float right = f + view.getRight();
        float bottom = f2 + view.getBottom();
        RectF rectF = this.f33311;
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
        C1517 c1517;
        C1511 c1511M34808;
        int iM34612;
        RectF rectFM34607;
        C1202 c1202 = this.f33318;
        if (c1202 == null || !this.f33303 || (c1517 = c1202.f25155) == null || !c1517.m34806() || (c1511M34808 = c1517.m34808()) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (rectFM34607 = c1511M34808.m34607(this, new RectF())) != null && !rectFM34607.contains(motionEvent.getX(), motionEvent.getY())) || (iM34612 = c1511M34808.m34612()) == -1) {
            return false;
        }
        View view = this.f33316;
        if (view == null || view.getId() != iM34612) {
            this.f33316 = findViewById(iM34612);
        }
        View view2 = this.f33316;
        if (view2 == null) {
            return false;
        }
        float left = view2.getLeft();
        float top = this.f33316.getTop();
        float right = this.f33316.getRight();
        float bottom = this.f33316.getBottom();
        RectF rectF = this.f33311;
        rectF.set(left, top, right, bottom);
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || m27310(0.0f, 0.0f, this.f33316, motionEvent)) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1202 c1202 = this.f33318;
        if (c1202 != null && this.f33303 && c1202.m21385()) {
            C1517 c1517 = this.f33318.f25155;
            if (c1517 != null && !c1517.m34806()) {
                return super.onTouchEvent(motionEvent);
            }
            this.f33318.m21377(motionEvent, this.f33275, this);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C1517 c1517;
        int i;
        super.onAttachedToWindow();
        C1202 c1202 = this.f33318;
        if (c1202 != null && (i = this.f33275) != -1) {
            C1050 c1050M21375 = c1202.m21375(i);
            this.f33318.m21378(this);
            if (c1050M21375 != null) {
                c1050M21375.m14552((C1715) this);
            }
            this.f33317 = this.f33275;
        }
        m27342();
        C0992 c0992 = this.f33279;
        if (c0992 != null) {
            C1342 c1342 = c0992.f12350;
            int i2 = c0992.f12349;
            if (i2 != -1 || c0992.f12347 != -1) {
                if (i2 == -1) {
                    c1342.m27332(c0992.f12347);
                } else {
                    int i3 = c0992.f12347;
                    if (i3 == -1) {
                        c1342.setState(i2, -1, -1);
                    } else {
                        c1342.m27334(i2, i3);
                    }
                }
                c1342.m27336(EnumC1447.SETUP);
            }
            if (Float.isNaN(Float.NaN)) {
                if (Float.isNaN(c0992.f12348)) {
                    return;
                }
                c1342.m27340(c0992.f12348);
                return;
            }
            float f = c0992.f12348;
            if (!super.isAttachedToWindow()) {
                if (c1342.f33279 == null) {
                    c1342.f33279 = new C0992(c1342);
                }
                c1342.f33279.f12348 = f;
            } else {
                c1342.m27340(f);
                c1342.m27336(EnumC1447.MOVING);
                c1342.f33302 = Float.NaN;
                c1342.m27329(1.0f);
            }
            c0992.f12348 = Float.NaN;
            c0992.f12349 = -1;
            c0992.f12347 = -1;
            return;
        }
        C1202 c1203 = this.f33318;
        if (c1203 == null || (c1517 = c1203.f25155) == null || c1517.m34802() != 4) {
            return;
        }
        m27329(1.0f);
        m27336(EnumC1447.SETUP);
        m27336(EnumC1447.MOVING);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        C1202 c1202 = this.f33318;
        if (c1202 != null) {
            c1202.m21382(isRtl());
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m27342() {
        C1202 c1202;
        C1517 c1517;
        C1202 c1203 = this.f33318;
        if (c1203 == null) {
            return;
        }
        if (c1203.m21384(this, this.f33275)) {
            requestLayout();
            return;
        }
        int i = this.f33275;
        if (i != -1) {
            this.f33318.m21379(this, i);
        }
        if (!this.f33318.m21385() || (c1517 = (c1202 = this.f33318).f25155) == null || c1517.f43634 == null) {
            return;
        }
        c1202.f25155.f43634.m34608();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27333(int i, float f, float f2, float f3, float[] fArr) {
        View viewById = getViewById(i);
        C1797 c1797 = (C1797) this.f33319.get(viewById);
        if (c1797 != null) {
            c1797.m46694(f, f2, f3, fArr);
            viewById.getY();
        } else {
            if (viewById == null) {
                return;
            }
            viewById.getContext().getResources().getResourceName(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27331(float f, boolean z, int i) {
        ArrayList arrayList = this.f33306;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1482) it.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m27316() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f33306;
        if (arrayList2 == null || arrayList2.isEmpty() || this.f33274 == this.f33300) {
            return;
        }
        if (this.f33309 != -1 && (arrayList = this.f33306) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1482) it.next()).getClass();
            }
        }
        this.f33309 = -1;
        this.f33274 = this.f33300;
        ArrayList arrayList3 = this.f33306;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1482) it2.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27328() {
        ArrayList arrayList = this.f33306;
        if (arrayList != null && !arrayList.isEmpty() && this.f33309 == -1) {
            this.f33309 = this.f33275;
            ArrayList arrayList2 = this.f33298;
            int iIntValue = !arrayList2.isEmpty() ? ((Integer) C20013.m45383(arrayList2, 1)).intValue() : -1;
            int i = this.f33275;
            if (iIntValue != i && i != -1) {
                arrayList2.add(Integer.valueOf(i));
            }
        }
        m27325();
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m27325() {
        ArrayList arrayList = this.f33306;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<Integer> arrayList2 = this.f33298;
        for (Integer num : arrayList2) {
            ArrayList<InterfaceC1482> arrayList3 = this.f33306;
            if (arrayList3 != null) {
                for (InterfaceC1482 interfaceC1482 : arrayList3) {
                    num.getClass();
                    interfaceC1482.getClass();
                }
            }
        }
        arrayList2.clear();
    }

    @Override // p067l.C1715, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C0852) {
            C0852 c0852 = (C0852) view;
            if (this.f33306 == null) {
                this.f33306 = new ArrayList();
            }
            this.f33306.add(c0852);
            if (c0852.m3752()) {
                if (this.f33284 == null) {
                    this.f33284 = new ArrayList();
                }
                this.f33284.add(c0852);
            }
            if (c0852.m3753()) {
                if (this.f33268 == null) {
                    this.f33268 = new ArrayList();
                }
                this.f33268.add(c0852);
            }
        }
    }

    @Override // p067l.C1715, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f33284;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f33268;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m27341() {
        return this.f33317;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m27339() {
        return this.f33287;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m27343() {
        return this.f33303;
    }
}
