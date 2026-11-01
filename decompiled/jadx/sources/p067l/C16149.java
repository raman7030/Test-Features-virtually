package p067l;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ܳۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6NG */
/* JADX INFO: loaded from: classes3.dex */
public final class C16149 {

    /* JADX INFO: renamed from: ֡ */
    public float f47504;

    /* JADX INFO: renamed from: ֡֫ */
    public float f47505;

    /* JADX INFO: renamed from: ֨ */
    public float f47506;

    /* JADX INFO: renamed from: ֨֫ */
    public final float f47507;

    /* JADX INFO: renamed from: ֫ */
    public int f47508;

    /* JADX INFO: renamed from: ֫֫ */
    public float f47509;

    /* JADX INFO: renamed from: ۖ */
    public float f47510;

    /* JADX INFO: renamed from: ۖ֫ */
    public float f47511;

    /* JADX INFO: renamed from: ۗ */
    public float f47512;

    /* JADX INFO: renamed from: ۗ֫ */
    public boolean f47513;

    /* JADX INFO: renamed from: ۘ */
    public float f47514;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f47515;

    /* JADX INFO: renamed from: ۙ */
    public float f47516;

    /* JADX INFO: renamed from: ۙ֫ */
    public float f47517;

    /* JADX INFO: renamed from: ۚ */
    public float f47518;

    /* JADX INFO: renamed from: ۚ֫ */
    public float f47519;

    /* JADX INFO: renamed from: ۛ */
    public float f47520;

    /* JADX INFO: renamed from: ۜ */
    public float f47521;

    /* JADX INFO: renamed from: ۜ֫ */
    public float f47522;

    /* JADX INFO: renamed from: ۟ */
    public boolean f47523;

    /* JADX INFO: renamed from: ۠ */
    public boolean f47524;

    /* JADX INFO: renamed from: ۠֫ */
    public float f47525;

    /* JADX INFO: renamed from: ۡ */
    public long f47526;

    /* JADX INFO: renamed from: ۡ֫ */
    public float f47527;

    /* JADX INFO: renamed from: ۢ */
    public final float f47528;

    /* JADX INFO: renamed from: ۢ֫ */
    public long f47529;

    /* JADX INFO: renamed from: ۤ */
    public boolean f47530;

    /* JADX INFO: renamed from: ۧ */
    public final RunnableC21572 f47531;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f47532;

    /* JADX INFO: renamed from: ۨ */
    public final float f47533;

    /* JADX INFO: renamed from: ۫ */
    public final float f47534;

    /* JADX INFO: renamed from: ۫֫ */
    public final C10172 f47535;

    /* JADX INFO: renamed from: ۬ */
    public final float f47536;

    /* JADX INFO: renamed from: ۬֫ */
    public VelocityTracker f47537;

    /* JADX INFO: renamed from: ܰ */
    public float f47538;

    /* JADX INFO: renamed from: ܳ */
    public float f47539;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f47540;

    /* JADX INFO: renamed from: ܶ */
    public boolean f47541;

    /* JADX INFO: renamed from: ܺ */
    public float f47543;

    /* JADX INFO: renamed from: ܺ֫ */
    public VelocityTracker f47544;

    /* JADX INFO: renamed from: ܽ */
    public final float f47545;

    /* JADX INFO: renamed from: ܽ֫ */
    public float f47546;

    /* JADX INFO: renamed from: ܿ */
    public float f47547;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f47548;

    /* JADX INFO: renamed from: ᩳ */
    public float f47549;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f47550;

    /* JADX INFO: renamed from: ᩵ */
    public float f47553;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f47554;

    /* JADX INFO: renamed from: ᩶ */
    public float f47555;

    /* JADX INFO: renamed from: ᩶֫ */
    public float f47556;

    /* JADX INFO: renamed from: ᩷ */
    public final float f47557;

    /* JADX INFO: renamed from: ᩷֫ */
    public long f47558;

    /* JADX INFO: renamed from: ᩸ */
    public long f47559;

    /* JADX INFO: renamed from: ᩸֫ */
    public boolean f47560;

    /* JADX INFO: renamed from: ᩹ */
    public long f47561;

    /* JADX INFO: renamed from: ᩹֫ */
    public long f47562;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f47563;

    /* JADX INFO: renamed from: ᩻ */
    public float f47564;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f47565;

    /* JADX INFO: renamed from: ܶ֫ */
    public EnumC18832 f47542 = EnumC18832.IDLE;

    /* JADX INFO: renamed from: ᩴ */
    public int f47551 = -1;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f47552 = -1;

    public C16149(C10172 c10172) {
        this.f47535 = c10172;
        float f = c10172.getResources().getDisplayMetrics().density;
        this.f47545 = f;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(c10172.getContext());
        this.f47507 = viewConfiguration.getScaledTouchSlop();
        this.f47528 = viewConfiguration.getScaledDoubleTapSlop();
        float scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f47534 = scaledMinimumFlingVelocity;
        float scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f47536 = scaledMaximumFlingVelocity;
        this.f47533 = Math.min(scaledMaximumFlingVelocity, Math.max(scaledMinimumFlingVelocity, 600.0f * f));
        this.f47557 = Math.min(scaledMaximumFlingVelocity, Math.max(scaledMinimumFlingVelocity, f * 1000.0f));
        this.f47531 = new RunnableC21572(1, this, c10172);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m36746(C16149 c16149, C10172 c10172) {
        if (c16149.f47523) {
            c16149.f47523 = false;
            if (c16149.f47542 == EnumC18832.IDLE) {
                c10172.m23695(c16149.f47556, c16149.f47517);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m36756() {
        EnumC18832 enumC18832 = this.f47542;
        return enumC18832 == EnumC18832.PAN || enumC18832 == EnumC18832.SCALE || enumC18832 == EnumC18832.QUICK_SCALE;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m36755() {
        return this.f47532 > 1;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m36757() {
        if (this.f47542 != EnumC18832.PENDING || !this.f47530 || this.f47541 || this.f47524) {
            return;
        }
        m36747();
        this.f47530 = false;
        VelocityTracker velocityTracker = this.f47537;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36752() {
        m36751();
        VelocityTracker velocityTracker = this.f47537;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f47537 = null;
        }
        m36750();
        this.f47542 = EnumC18832.IDLE;
        this.f47552 = -1;
        this.f47551 = -1;
        this.f47532 = 0;
        this.f47524 = false;
        this.f47541 = false;
        this.f47554 = false;
        this.f47563 = false;
        this.f47513 = false;
        this.f47514 = 0.0f;
        C10172 c10172 = this.f47535;
        if (c10172.getParent() != null) {
            c10172.getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m36758() {
        m36751();
        this.f47542 = EnumC18832.SETTLING;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36754(boolean z) {
        this.f47524 = false;
        this.f47541 = false;
        this.f47514 = 0.0f;
        if (z && this.f47513 && this.f47532 > 0) {
            this.f47513 = false;
            this.f47563 = true;
            m36747();
            VelocityTracker velocityTracker = this.f47537;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
            this.f47542 = this.f47552 >= 0 ? EnumC18832.SCALE : EnumC18832.PAN;
            return;
        }
        this.f47513 = false;
        this.f47542 = EnumC18832.IDLE;
        m36750();
        C10172 c10172 = this.f47535;
        C13525 c13525M23702 = c10172.m23702();
        if (z && this.f47532 == 0 && c13525M23702 != null && c13525M23702.m30768() && c13525M23702.m30765() != c13525M23702.m30779()) {
            c10172.m23690(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x030c  */
    /* JADX WARN: Code duplicated, block: B:158:0x039b  */
    /* JADX INFO: renamed from: ֫ */
    public final void m36753(MotionEvent motionEvent) {
        float yVelocity;
        float f;
        int i;
        boolean z;
        float f2;
        float fCopySign;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        C10172 c10172 = this.f47535;
        if (actionMasked == 0) {
            boolean zMo16697 = c10172.mo16697();
            c10172.m23692();
            boolean z2 = this.f47523 && motionEvent.getEventTime() - this.f47562 <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.hypot((double) (motionEvent.getX() - this.f47556), (double) (motionEvent.getY() - this.f47517)) <= ((double) this.f47528);
            m36751();
            VelocityTracker velocityTracker = this.f47537;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f47537 = null;
            }
            m36750();
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f47537 = velocityTrackerObtain;
            velocityTrackerObtain.addMovement(motionEvent);
            this.f47551 = motionEvent.getPointerId(0);
            this.f47552 = -1;
            this.f47532 = 1;
            float x = motionEvent.getX();
            this.f47516 = x;
            this.f47543 = x;
            this.f47553 = x;
            float y = motionEvent.getY();
            this.f47512 = y;
            this.f47510 = y;
            this.f47504 = y;
            long eventTime = motionEvent.getEventTime();
            this.f47526 = eventTime;
            this.f47561 = eventTime;
            this.f47559 = eventTime;
            this.f47520 = 0.0f;
            this.f47542 = EnumC18832.PENDING;
            this.f47554 = z2 && !zMo16697;
            this.f47560 = !zMo16697;
            this.f47513 = false;
            this.f47563 = false;
            this.f47530 = false;
            this.f47514 = 0.0f;
            this.f47508 = 0;
            this.f47541 = c10172.m23701() != 0.0f;
            this.f47524 = c10172.m23691() != 0.0f;
            if (c10172.getParent() != null) {
                c10172.getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            m36752();
            c10172.m23690(false);
            return;
        }
        if (this.f47551 < 0) {
            return;
        }
        VelocityTracker velocityTracker2 = this.f47537;
        if (velocityTracker2 != null && !this.f47513) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (actionMasked == 5) {
            m36743(motionEvent, -1);
            this.f47560 = false;
            this.f47554 = false;
            m36751();
            this.f47563 = true;
            VelocityTracker velocityTracker3 = this.f47537;
            if (velocityTracker3 != null) {
                velocityTracker3.clear();
            }
            if (this.f47540) {
                this.f47542 = EnumC18832.SCALE;
                m36747();
                m36748(motionEvent.getEventTime());
                return;
            } else if (!this.f47513 && (c10172.m23701() != 0.0f || c10172.m23691() != 0.0f || this.f47541 || this.f47524)) {
                this.f47513 = true;
                c10172.m23690(true);
                return;
            } else {
                if (this.f47513) {
                    return;
                }
                this.f47542 = EnumC18832.SCALE;
                m36747();
                return;
            }
        }
        if (actionMasked == 6) {
            m36743(motionEvent, motionEvent.getActionIndex());
            this.f47563 = true;
            VelocityTracker velocityTracker4 = this.f47537;
            if (velocityTracker4 != null) {
                velocityTracker4.clear();
            }
            m36747();
            if (this.f47540) {
                m36748(motionEvent.getEventTime());
            }
            if (this.f47513) {
                return;
            }
            this.f47542 = this.f47552 >= 0 ? EnumC18832.SCALE : EnumC18832.PAN;
            return;
        }
        float f8 = this.f47507;
        if (actionMasked != 2) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker5 = this.f47537;
                float f9 = this.f47536;
                if (velocityTracker5 == null || motionEvent.getEventTime() - this.f47559 > 80) {
                    yVelocity = 0.0f;
                    f = 0.0f;
                } else {
                    this.f47537.computeCurrentVelocity(1000, f9);
                    float xVelocity = this.f47537.getXVelocity(this.f47551);
                    yVelocity = this.f47537.getYVelocity(this.f47551);
                    f = xVelocity;
                }
                if (!this.f47540 || this.f47544 == null) {
                    i = 0;
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f47551);
                    m36741(iFindPointerIndex >= 0 ? motionEvent.getY(iFindPointerIndex) - this.f47504 : 0.0f, this.f47529, motionEvent.getEventTime());
                    if (motionEvent.getEventTime() - this.f47558 <= 80) {
                        this.f47544.computeCurrentVelocity(1000, f9);
                        yVelocity = this.f47544.getYVelocity();
                        i = 0;
                    } else {
                        i = 0;
                        yVelocity = 0.0f;
                    }
                }
                this.f47532 = i;
                this.f47552 = -1;
                this.f47551 = -1;
                VelocityTracker velocityTracker6 = this.f47537;
                if (velocityTracker6 != null) {
                    velocityTracker6.recycle();
                    this.f47537 = null;
                }
                if (c10172.getParent() != null) {
                    c10172.getParent().requestDisallowInterceptTouchEvent(false);
                }
                if (this.f47513) {
                    return;
                }
                if (this.f47541 || this.f47524) {
                    z = false;
                    c10172.m23690(false);
                } else {
                    if (this.f47540) {
                        m36738(yVelocity);
                    } else {
                        EnumC18832 enumC18832 = this.f47542;
                        if (enumC18832 == EnumC18832.PAGE_DRAG) {
                            float fM23701 = c10172.m23701();
                            boolean z3 = Math.abs(f) >= this.f47533;
                            if ((z3 && Math.signum(f) != Math.signum(fM23701)) || (Math.abs(fM23701) < c10172.getWidth() * 0.25f && (!z3 || Math.abs(fM23701) < f8 * 2.0f))) {
                                i2 = 0;
                            } else if (fM23701 < 0.0f) {
                                i2 = 1;
                            }
                            c10172.m23699(i2);
                        } else if (enumC18832 == EnumC18832.DISMISS_DRAG) {
                            m36738(yVelocity);
                        } else if (enumC18832 == EnumC18832.SCALE || enumC18832 == EnumC18832.QUICK_SCALE) {
                            z = false;
                            c10172.m23690(false);
                        } else if (enumC18832 == EnumC18832.PAN) {
                            float fAbs = Math.abs(f);
                            float f10 = this.f47534;
                            float f11 = fAbs >= f10 ? f : 0.0f;
                            if (Math.abs(yVelocity) < f10) {
                                yVelocity = 0.0f;
                            }
                            c10172.m23689(f11, yVelocity);
                        } else if (enumC18832 == EnumC18832.PENDING && this.f47560 && !this.f47530 && motionEvent.getEventTime() - this.f47526 < ViewConfiguration.getLongPressTimeout()) {
                            this.f47542 = EnumC18832.IDLE;
                            if (this.f47554) {
                                c10172.m23698(this.f47543, this.f47510);
                            } else {
                                this.f47523 = true;
                                this.f47556 = this.f47543;
                                this.f47517 = this.f47510;
                                this.f47562 = motionEvent.getEventTime();
                                c10172.postDelayed(this.f47531, ViewConfiguration.getDoubleTapTimeout());
                            }
                        } else {
                            this.f47542 = EnumC18832.IDLE;
                            z = false;
                            c10172.m23690(false);
                        }
                    }
                    z = false;
                }
                this.f47554 = z;
                return;
            }
            return;
        }
        long j = this.f47561;
        this.f47561 = motionEvent.getEventTime();
        m36749(motionEvent);
        if (this.f47513) {
            return;
        }
        EnumC18832 enumC18833 = this.f47542;
        EnumC18832 enumC18834 = EnumC18832.SCALE;
        float f12 = this.f47545;
        if (enumC18833 == enumC18834 && this.f47552 >= 0) {
            long eventTime2 = motionEvent.getEventTime();
            float f13 = this.f47553;
            float f14 = this.f47505;
            float f15 = (f13 + f14) * 0.5f;
            float f16 = this.f47504;
            float f17 = this.f47519;
            float f18 = (f16 + f17) * 0.5f;
            float fHypot = (float) Math.hypot(f13 - f14, f16 - f17);
            float degrees = (float) Math.toDegrees(Math.atan2(this.f47519 - this.f47504, this.f47505 - this.f47553));
            long j2 = eventTime2 - j;
            float fMax = Math.max(f8 * 2.0f, f12 * 48.0f);
            if (this.f47525 > fMax && fHypot > fMax) {
                float f19 = (((degrees - this.f47509) + 540.0f) % 360.0f) - 180.0f;
                if (this.f47548) {
                    fCopySign = f19;
                    f2 = degrees;
                } else {
                    this.f47538 += f19;
                    float f20 = this.f47511;
                    if (f20 > 0.0f && Math.abs((fHypot / f20) - 1.0f) >= 0.08f) {
                        this.f47515 = true;
                    }
                    f2 = degrees;
                    float fExp = (float) Math.exp((-Math.max(0L, j2)) / 80.0d);
                    this.f47546 = (this.f47546 * fExp) + ((float) Math.toRadians(f19));
                    this.f47550 = Math.abs((float) Math.log(fHypot / this.f47525)) + (this.f47550 * fExp);
                    float f21 = this.f47515 ? 20.0f : 12.0f;
                    if (Math.abs(this.f47538) > f21 && this.f47538 * f19 > 0.0f && (!this.f47515 || Math.abs(this.f47546) > this.f47550 * 1.2f)) {
                        this.f47548 = true;
                        fCopySign = Math.copySign(Math.min(Math.abs(f19), Math.abs(this.f47538) - f21), this.f47538);
                    }
                }
                C13525 c13525M23702 = c10172.m23702();
                if (this.f47525 <= 1.0f && fHypot > 1.0f && c13525M23702 != null && c13525M23702.m30768()) {
                    float fMin = f18 - this.f47506;
                    if (!this.f47540) {
                        if (!this.f47548 && c13525M23702.m30765() == 0.0f) {
                            this.f47565 = false;
                        } else if (!this.f47565 || f18 <= this.f47506) {
                            this.f47565 = true;
                            this.f47564 = this.f47518;
                            float f22 = this.f47506;
                            this.f47521 = f22;
                            this.f47549 = this.f47512;
                            this.f47547 = this.f47555;
                            this.f47539 = this.f47525;
                            if (f18 <= f22) {
                                this.f47564 = f15;
                                this.f47521 = f18;
                                this.f47549 = this.f47504;
                                this.f47547 = this.f47519;
                                this.f47539 = fHypot;
                            } else {
                                float f23 = f15 - this.f47564;
                                f7 = f18 - this.f47521;
                                if (f7 > f8 && f7 >= Math.abs(f23) * 1.2f && f7 > (Math.abs(fHypot - this.f47539) * 0.5f) + f8 && this.f47504 > this.f47549 && this.f47519 > this.f47547) {
                                    this.f47540 = true;
                                    fMin = Math.min(fMin, (f18 - this.f47521) - f8);
                                    m36748(j);
                                }
                            }
                        } else {
                            float f24 = f15 - this.f47564;
                            f7 = f18 - this.f47521;
                            if (f7 > f8) {
                                this.f47540 = true;
                                fMin = Math.min(fMin, (f18 - this.f47521) - f8);
                                m36748(j);
                            }
                        }
                    }
                    float f25 = fMin;
                    if (this.f47540) {
                        f2 = f2;
                        f3 = f18;
                        m36745(c13525M23702, fHypot / this.f47525, fCopySign, this.f47518, this.f47506, f15, f18, f25, j, eventTime2);
                        f6 = f15;
                        f5 = fHypot;
                    } else {
                        f3 = f18;
                        f4 = f15;
                        f5 = fHypot;
                        m36744(c13525M23702, f5 / this.f47525, fCopySign, this.f47518, this.f47506, f4, f3);
                    }
                    this.f47518 = f6;
                    this.f47506 = f3;
                    this.f47525 = f5;
                    this.f47509 = f2;
                    this.f47516 = this.f47553;
                    this.f47512 = this.f47504;
                    this.f47555 = this.f47519;
                    return;
                }
                f3 = f18;
                f4 = f15;
                f5 = fHypot;
                f6 = f4;
                this.f47518 = f6;
                this.f47506 = f3;
                this.f47525 = f5;
                this.f47509 = f2;
                this.f47516 = this.f47553;
                this.f47512 = this.f47504;
                this.f47555 = this.f47519;
                return;
            }
            f2 = degrees;
            this.f47515 = false;
            this.f47548 = false;
            this.f47550 = 0.0f;
            this.f47546 = 0.0f;
            this.f47538 = 0.0f;
            this.f47511 = fHypot;
            fCopySign = 0.0f;
            C13525 c13525M23703 = c10172.m23702();
            if (this.f47525 <= 1.0f) {
                f3 = f18;
                f4 = f15;
                f5 = fHypot;
                f6 = f4;
            } else {
                f3 = f18;
                f4 = f15;
                f5 = fHypot;
                f6 = f4;
            }
            this.f47518 = f6;
            this.f47506 = f3;
            this.f47525 = f5;
            this.f47509 = f2;
            this.f47516 = this.f47553;
            this.f47512 = this.f47504;
            this.f47555 = this.f47519;
            return;
        }
        float f26 = this.f47553;
        float f27 = f26 - this.f47516;
        float f28 = this.f47504;
        float f29 = f28 - this.f47512;
        float f30 = f26 - this.f47543;
        float f31 = f28 - this.f47510;
        this.f47516 = f26;
        this.f47512 = f28;
        float fMax2 = Math.max(Math.abs(f30), Math.abs(f31));
        if (f27 != 0.0f || f29 != 0.0f) {
            this.f47559 = motionEvent.getEventTime();
        }
        if (fMax2 > f8) {
            this.f47530 = true;
            this.f47560 = false;
            m36751();
        }
        C13525 c13525M23704 = c10172.m23702();
        if (this.f47554 && !this.f47563 && this.f47542 == EnumC18832.PENDING && Math.abs(f31) > f8 && c13525M23704 != null && c13525M23704.m30768()) {
            this.f47542 = EnumC18832.QUICK_SCALE;
        }
        EnumC18832 enumC18835 = this.f47542;
        if (enumC18835 == EnumC18832.QUICK_SCALE) {
            float fExp2 = (float) Math.exp(f29 / (f12 * 160.0f));
            float f32 = this.f47543;
            float f33 = this.f47510;
            m36744(c13525M23704, fExp2, 0.0f, f32, f33, f32, f33);
            return;
        }
        if (this.f47530 || enumC18835 != EnumC18832.PENDING) {
            if (this.f47540) {
                this.f47542 = EnumC18832.PAN;
                float f34 = this.f47553;
                float f35 = f34 - f27;
                float f36 = this.f47504;
                m36745(c13525M23704, 1.0f, 0.0f, f35, f36 - f29, f34, f36, f29, j, motionEvent.getEventTime());
                return;
            }
            if (this.f47541) {
                this.f47542 = EnumC18832.PAGE_DRAG;
                this.f47508 = 1;
                this.f47541 = false;
            } else if (this.f47524) {
                this.f47542 = EnumC18832.DISMISS_DRAG;
                this.f47508 = 2;
                this.f47524 = false;
            }
            EnumC18832 enumC18836 = this.f47542;
            if (enumC18836 == EnumC18832.PAGE_DRAG) {
                m36739(f27, f27, f29, j, motionEvent);
                float fM23702 = c10172.m23701();
                if (fM23702 != 0.0f && Math.signum(f27) != Math.signum(fM23702) && Math.abs(f27) >= Math.abs(fM23702)) {
                    c10172.m23693();
                    this.f47542 = EnumC18832.PAN;
                    this.f47514 = 0.0f;
                    m36740(f27 + fM23702, f29, c10172.m23702());
                    return;
                }
                c10172.m23694(f27);
                return;
            }
            EnumC18832 enumC18837 = EnumC18832.DISMISS_DRAG;
            if (enumC18836 == enumC18837) {
                m36739(f29, f27, f29, j, motionEvent);
                c10172.m23688(f29);
                return;
            }
            EnumC18832 enumC18838 = EnumC18832.PAN;
            if (enumC18836 == enumC18838) {
                this.f47508 = Math.abs(f27) > Math.abs(f29) * 1.2f ? 1 : 2;
            } else if (this.f47508 == 0) {
                float fAbs2 = Math.abs(f30);
                float fAbs3 = Math.abs(f31);
                if (fAbs2 > f8 && fAbs2 >= fAbs3 * 1.2f) {
                    this.f47508 = 1;
                } else if (fAbs3 > f8 && fAbs3 >= 1.2f * fAbs2) {
                    this.f47508 = 2;
                } else if (Math.max(fAbs2, fAbs3) >= 2.0f * f8) {
                    this.f47508 = (fAbs2 <= fAbs3 && (fAbs3 > fAbs2 || !(c13525M23704 == null || !c13525M23704.m30755() || c13525M23704.m30766()))) ? 2 : 1;
                }
            }
            EnumC18832 enumC18839 = this.f47542;
            EnumC18832 enumC188310 = EnumC18832.PENDING;
            if (enumC18839 == enumC188310 && !this.f47563 && this.f47508 == 2 && f31 > 0.0f && c13525M23704 != null && c13525M23704.m30777()) {
                this.f47542 = enumC18837;
                this.f47520 = Math.signum(f29);
                c10172.m23688(Math.max(0.0f, f31 - f8));
                return;
            }
            if (this.f47542 == enumC188310) {
                if (c13525M23704 != null && c13525M23704.m30768() && c13525M23704.m30763(f27, f29)) {
                    this.f47542 = enumC18838;
                } else if (this.f47508 == 0) {
                    return;
                }
            }
            m36740(f27, f29, c13525M23704);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36745(C13525 c13525, float f, float f2, float f3, float f4, float f5, float f6, float f7, long j, long j2) {
        C10172 c10172 = this.f47535;
        float fM23691 = c10172.m23691();
        float fM23697 = c10172.m23697(fM23691);
        c10172.m23688(f7);
        float fM23692 = c10172.m23691();
        float fM23698 = c10172.m23697(fM23692);
        float width = c10172.getWidth() * 0.5f;
        float height = c10172.getHeight() * 0.5f;
        m36744(c13525, f, f2, ((f3 - width) / fM23697) + width, (((f4 - height) - fM23691) / fM23697) + height, width + ((f5 - width) / fM23698), (((f6 - height) - fM23692) / fM23698) + height);
        m36741(f6 - f4, j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36744(C13525 c13525, float f, float f2, float f3, float f4, float f5, float f6) {
        if (c13525 == null || !c13525.m30768()) {
            return;
        }
        c13525.m30758(c13525.m30780() * (((c13525.m30780() >= c13525.m30769() || f >= 1.0f) && (c13525.m30780() <= 8.0f || f <= 1.0f)) ? f : (float) Math.pow(f, 0.30000001192092896d)), c13525.m30765() + f2, f3, f4, f5, f6, false);
        this.f47535.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36740(float f, float f2, C13525 c13525) {
        C10172 c10172 = this.f47535;
        if (c13525 != null && c13525.m30768()) {
            float fM30754 = c13525.m30754();
            f = c13525.m30771(f, f2);
            float fM30755 = f2 - (c13525.m30754() - fM30754);
            if (fM30755 != 0.0f && !c13525.m30766()) {
                c13525.m30760(c13525.m30780(), c13525.m30781(), (fM30755 * C24867.m54625(Math.max(c13525.m30764() - c13525.m30754(), c13525.m30754() - c13525.m30770()), c10172.getHeight())) + c13525.m30754(), false);
            }
        }
        if (f != 0.0f && this.f47508 == 1 && !this.f47563) {
            if (Math.signum(this.f47514) != Math.signum(f)) {
                this.f47514 = 0.0f;
            }
            float f3 = this.f47514 + f;
            this.f47514 = f3;
            float fAbs = Math.abs(f3);
            float f4 = this.f47507;
            if (fAbs > f4) {
                this.f47542 = EnumC18832.PAGE_DRAG;
                this.f47520 = Math.signum(f);
                float f5 = this.f47514;
                c10172.m23694(f5 - Math.copySign(f4, f5));
                this.f47514 = 0.0f;
            }
        } else {
            this.f47514 = 0.0f;
            if (c13525 != null && c13525.m30768() && f != 0.0f && !c13525.m30766()) {
                c13525.m30760(c13525.m30780(), (f * C24867.m54625(Math.max(c13525.m30776() - c13525.m30781(), c13525.m30781() - c13525.m30782()), c10172.getWidth())) + c13525.m30781(), c13525.m30754(), false);
            }
        }
        if (this.f47542 == EnumC18832.PENDING && c13525 != null && c13525.m30768()) {
            this.f47542 = EnumC18832.PAN;
        }
        c10172.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36738(float f) {
        C10172 c10172 = this.f47535;
        float fM23691 = c10172.m23691();
        float f2 = this.f47557;
        c10172.m23696(f > (-f2) && (fM23691 >= ((float) c10172.getHeight()) * 0.2f || (fM23691 >= this.f47545 * 48.0f && f >= f2)));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36743(MotionEvent motionEvent, int i) {
        int pointerId = i < 0 ? -1 : motionEvent.getPointerId(i);
        if (this.f47551 == pointerId) {
            this.f47551 = this.f47552;
        }
        int i2 = this.f47552;
        if (i2 == pointerId || i2 == this.f47551) {
            this.f47552 = -1;
        }
        this.f47532 = motionEvent.getPointerCount() - (i >= 0 ? 1 : 0);
        for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
            if (i3 != i) {
                int pointerId2 = motionEvent.getPointerId(i3);
                int i4 = this.f47551;
                if (i4 < 0) {
                    this.f47551 = pointerId2;
                } else if (this.f47552 < 0 && pointerId2 != i4) {
                    this.f47552 = pointerId2;
                }
            }
        }
        m36749(motionEvent);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m36749(MotionEvent motionEvent) {
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f47551);
        if (iFindPointerIndex >= 0) {
            this.f47553 = motionEvent.getX(iFindPointerIndex);
            this.f47504 = motionEvent.getY(iFindPointerIndex);
        }
        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f47552);
        if (iFindPointerIndex2 >= 0) {
            this.f47505 = motionEvent.getX(iFindPointerIndex2);
            this.f47519 = motionEvent.getY(iFindPointerIndex2);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m36747() {
        float f = this.f47553;
        this.f47516 = f;
        this.f47543 = f;
        float f2 = this.f47504;
        this.f47512 = f2;
        this.f47510 = f2;
        float f3 = this.f47505;
        this.f47518 = (f + f3) * 0.5f;
        float f4 = this.f47519;
        this.f47506 = (f2 + f4) * 0.5f;
        this.f47525 = this.f47552 < 0 ? 0.0f : (float) Math.hypot(f - f3, f2 - f4);
        this.f47509 = (float) Math.toDegrees(Math.atan2(this.f47519 - this.f47504, this.f47505 - this.f47553));
        float f5 = this.f47525;
        this.f47515 = false;
        this.f47548 = false;
        this.f47550 = 0.0f;
        this.f47546 = 0.0f;
        this.f47538 = 0.0f;
        this.f47511 = f5;
        this.f47555 = this.f47519;
        this.f47565 = false;
        this.f47514 = 0.0f;
        this.f47508 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36739(float f, float f2, float f3, long j, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (Math.abs(f) <= this.f47507) {
            return;
        }
        if (this.f47520 != 0.0f && Math.signum(f) != this.f47520 && (velocityTracker = this.f47537) != null) {
            velocityTracker.clear();
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            int i = this.f47551;
            pointerProperties.id = i;
            pointerProperties.toolType = motionEvent.getToolType(motionEvent.findPointerIndex(i));
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.x = this.f47553 - f2;
            pointerCoords.y = this.f47504 - f3;
            MotionEvent motionEventObtain = MotionEvent.obtain(this.f47526, j, 2, 1, new MotionEvent.PointerProperties[]{pointerProperties}, new MotionEvent.PointerCoords[]{pointerCoords}, 0, 0, 1.0f, 1.0f, motionEvent.getDeviceId(), 0, motionEvent.getSource(), 0);
            this.f47537.addMovement(motionEventObtain);
            motionEventObtain.recycle();
            this.f47537.addMovement(motionEvent);
        }
        this.f47520 = Math.signum(f);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m36748(long j) {
        if (this.f47544 == null) {
            this.f47544 = VelocityTracker.obtain();
        }
        m36742(j);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36741(float f, long j, long j2) {
        long jMax = Math.max(j, this.f47529);
        if (this.f47544 == null) {
            m36748(jMax);
        }
        if (Math.abs(f) > this.f47507) {
            if (this.f47522 != 0.0f && Math.signum(f) != this.f47522) {
                this.f47544.clear();
                m36742(jMax);
            }
            this.f47522 = Math.signum(f);
        }
        if (f != 0.0f) {
            this.f47558 = j2;
        }
        this.f47527 += f;
        m36742(j2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36742(long j) {
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f47526, j, 2, 0.0f, this.f47527, 0);
        this.f47544.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.f47529 = j;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m36750() {
        this.f47565 = false;
        this.f47540 = false;
        this.f47522 = 0.0f;
        this.f47527 = 0.0f;
        this.f47529 = 0L;
        this.f47558 = 0L;
        VelocityTracker velocityTracker = this.f47544;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f47544 = null;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m36751() {
        this.f47523 = false;
        this.f47535.removeCallbacks(this.f47531);
    }
}
