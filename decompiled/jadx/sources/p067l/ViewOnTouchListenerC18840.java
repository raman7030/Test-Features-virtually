package p067l;

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.BaseInputConnection;

/* JADX INFO: renamed from: l.ܿۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC18840 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f56262;

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f56263;

    /* JADX INFO: renamed from: ۗ */
    public boolean f56264;

    /* JADX INFO: renamed from: ۘ֫ */
    public float f56265;

    /* JADX INFO: renamed from: ۙ */
    public float f56266;

    /* JADX INFO: renamed from: ۛ */
    public int f56267;

    /* JADX INFO: renamed from: ۟ */
    public boolean f56269;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f56270;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f56271;

    /* JADX INFO: renamed from: ۤ */
    public long f56272;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f56273;

    /* JADX INFO: renamed from: ۨ */
    public float f56274;

    /* JADX INFO: renamed from: ۬ */
    public boolean f56276;

    /* JADX INFO: renamed from: ܳ֫ */
    public float f56278;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f56279;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f56280;

    /* JADX INFO: renamed from: ܿ֫ */
    public float f56281;

    /* JADX INFO: renamed from: ᩳ֫ */
    public float f56282;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final /* synthetic */ C14146 f56283;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f56284;

    /* JADX INFO: renamed from: ᩶ */
    public float f56285;

    /* JADX INFO: renamed from: ᩸ */
    public int f56287;

    /* JADX INFO: renamed from: ᩹ */
    public int f56288;

    /* JADX INFO: renamed from: ᩺ */
    public float f56289;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f56290;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f56286 = false;

    /* JADX INFO: renamed from: ۫ */
    public ResultReceiverC6157 f56275 = new ResultReceiverC6157();

    /* JADX INFO: renamed from: ۜ֫ */
    public int f56268 = -1;

    /* JADX INFO: renamed from: ܰ */
    public int f56277 = -1;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public ViewOnTouchListenerC18840(C14146 c14146, Context context) {
        this.f56283 = c14146;
        this.f56279 = c14146.f40275.m11840();
        this.f56267 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        m42905();
        C14146 c14146 = this.f56283;
        int iM32508 = c14146.m32508();
        if (iM32508 == c14146.m32512()) {
            c14146.m32562(iM32508, true);
            c14146.m32409(true);
            c14146.m32363(-1);
        }
        c14146.f40280 = SystemClock.uptimeMillis();
        c14146.m32464();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14146 c14146 = this.f56283;
        this.f56276 = c14146.isFocused();
        if (c14146.f40302.isFinished()) {
            return false;
        }
        c14146.f40302.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f);
        C14146 c14146 = this.f56283;
        if (fAbs > fAbs2) {
            f = 0.0f;
        } else {
            if (!c14146.f40275.mo10193()) {
                return false;
            }
            f2 = 0.0f;
        }
        int iM32527 = c14146.m32527();
        int iM32592 = c14146.m32592();
        c14146.f40338 = true;
        c14146.f40302.fling(c14146.getScrollX(), c14146.m32472(), (int) (-f), (int) (-f2), 0, iM32527, 0, iM32592);
        if (f2 != 0.0f) {
            c14146.m32517();
            return true;
        }
        if (f != 0.0f) {
            c14146.m32506();
            return true;
        }
        c14146.postInvalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C14146 c14146 = this.f56283;
        C23929 c23929 = c14146.f40262;
        if (c14146.m32583()) {
            return;
        }
        m42905();
        c14146.performHapticFeedback(0);
        if (!c14146.isFocused()) {
            c14146.requestFocus();
        }
        float x = (motionEvent.getX() + c14146.getScrollX()) - c14146.getPaddingLeft();
        float y = (motionEvent.getY() + c14146.m32472()) - c14146.getPaddingTop();
        int iM32508 = c14146.m32508();
        int iM32512 = c14146.m32512();
        if (iM32508 > iM32512) {
            iM32512 = iM32508;
            iM32508 = iM32512;
        }
        if (c23929.f75988 && c14146.m32328(x)) {
            int iM11803 = c14146.f40275.m11803(y);
            C22076 c22076 = c14146.f40275.f12798;
            int i = c22076.get(c22076.m49693(iM11803)).f38061;
            C22076 c22077 = c14146.f40275.f12798;
            int i2 = c22077.get(c22077.m49692(iM11803)).f38062;
            BaseInputConnection.removeComposingSpans(c14146.f40339);
            if (iM32508 == iM32512) {
                c14146.f40339.setSelection(i, i2);
                c14146.f40315 = i;
                c14146.f40329 = i2;
            } else {
                if (c14146.f40315 == -1) {
                    c14146.f40315 = iM32508;
                    c14146.f40329 = iM32512;
                }
                if (i < c14146.f40315) {
                    iM32508 = i;
                }
                if (i2 >= c14146.f40329) {
                    iM32512 = i2;
                }
                c14146.f40339.setSelection(iM32508, iM32512);
            }
            c14146.m32584();
            c14146.invalidate();
            return;
        }
        int iM11804 = c14146.f40275.m11804(x, y);
        if (!c14146.mo27936()) {
            if (iM32508 == iM32512 || iM32508 > iM11804 || iM11804 > iM32512) {
                c14146.m32562(iM11804, false);
                c14146.m32409(true);
            }
            c14146.m32363(-1);
            c14146.f40280 = SystemClock.uptimeMillis();
            c14146.m32464();
        } else if (iM32508 != iM32512 && iM32508 <= iM11804 && iM11804 <= iM32512) {
            c14146.m32363(-1);
            c14146.f40280 = SystemClock.uptimeMillis();
            c14146.m32464();
        } else {
            int[] iArrM32544 = c14146.m32544(iM11804, false);
            c14146.f40324 = true;
            c14146.f40283 = iM11804;
            c14146.m32519(c14146.m32508(), iArrM32544[0]);
            c14146.mo27944(iArrM32544[0], iArrM32544[1]);
            c14146.f40330 = iArrM32544[0];
            c14146.f40280 = 0L;
            c14146.f40236 = Math.min(c23929.m26496() + (c14146.m32523() / 2.0f) + c14146.getPaddingTop(), motionEvent.getY());
            c14146.f40218 = Math.max((c14146.getHeight() - c14146.getPaddingBottom()) - c14146.m32523(), motionEvent.getY());
            c14146.f40191 = 0;
            c14146.invalidate();
            c14146.m32409(true);
            c14146.m32264((int) motionEvent.getX(), (int) motionEvent.getY(), c23929.f75999);
        }
        c14146.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42910(boolean z) {
        if (this.f56286 != z) {
            this.f56283.getParent().requestDisallowInterceptTouchEvent(z);
            this.f56286 = z;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14146 c14146 = this.f56283;
        C23929 c23929 = c14146.f40262;
        if (!c14146.isFocused()) {
            c14146.requestFocus();
        }
        if (c14146.f40275.mo10193() && Math.abs(f) > Math.abs(f2)) {
            int scrollX = c14146.getScrollX() + ((int) f);
            if (scrollX < 0) {
                if (motionEvent2 != null && c23929.f76009) {
                    C24587.m54228(c14146.f40233, (-f) / c14146.getWidth(), 1.0f - (motionEvent2.getY() / c14146.getHeight()));
                    c14146.postInvalidateOnAnimation();
                    if (!c14146.f40292.isFinished()) {
                        c14146.f40292.onRelease();
                    }
                }
                scrollX = 0;
            } else {
                int iM32527 = c14146.m32527();
                if (scrollX > iM32527) {
                    if (motionEvent2 != null && c23929.f76009) {
                        C24587.m54228(c14146.f40292, f / c14146.getWidth(), motionEvent2.getY() / c14146.getHeight());
                        c14146.postInvalidateOnAnimation();
                        if (!c14146.f40233.isFinished()) {
                            c14146.f40233.onRelease();
                        }
                    }
                    scrollX = iM32527;
                }
            }
            c14146.scrollTo(scrollX, c14146.m32472());
            c14146.m32506();
        } else {
            int iM32472 = c14146.m32472() + ((int) f2);
            if (iM32472 < 0) {
                if (this.f56264) {
                    m42910(false);
                }
                if (motionEvent2 != null && c23929.f76009) {
                    C24587.m54228(c14146.f40320, (-f2) / c14146.getHeight(), motionEvent2.getX() / c14146.getWidth());
                    c14146.postInvalidateOnAnimation();
                    if (!c14146.f40206.isFinished()) {
                        c14146.f40206.onRelease();
                    }
                }
                iM32472 = 0;
            } else {
                int iM32592 = c14146.m32592();
                if (iM32472 > iM32592) {
                    if (this.f56264) {
                        m42910(false);
                    }
                    if (motionEvent2 != null && c23929.f76009) {
                        C24587.m54228(c14146.f40206, f2 / c14146.getHeight(), 1.0f - (motionEvent2.getX() / c14146.getWidth()));
                        c14146.postInvalidateOnAnimation();
                        if (!c14146.f40320.isFinished()) {
                            c14146.f40320.onRelease();
                        }
                    }
                    iM32472 = iM32592;
                }
            }
            c14146.scrollTo(c14146.getScrollX(), iM32472);
            c14146.m32517();
        }
        if (!this.f56264) {
            return true;
        }
        this.f56264 = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        final C14146 c14146 = this.f56283;
        int scrollX = c14146.getScrollX();
        C23929 c23929 = c14146.f40262;
        int iM11804 = c14146.f40275.m11804((x + scrollX) - c14146.getPaddingLeft(), (motionEvent.getY() + c14146.m32472()) - c14146.getPaddingTop());
        int iM32508 = c14146.m32508();
        int iM32512 = c14146.m32512();
        if (iM32508 > iM32512) {
            iM32512 = iM32508;
            iM32508 = iM32512;
        }
        boolean zMo11814 = c14146.f40275.mo11814();
        ResultReceiverC6157 resultReceiverC6157 = this.f56275;
        if (zMo11814 || c23929.f75997 || !c14146.isFocused()) {
            z = false;
        } else {
            resultReceiverC6157.m13951();
            c14146.f40291.showSoftInput(c14146, 0, resultReceiverC6157);
            z = true;
        }
        if (c14146.f40275.f12802) {
            if (z && iM32508 != iM32512 && iM32508 <= iM11804 && iM11804 <= iM32512 && resultReceiverC6157.m13950() == 2) {
                c14146.postDelayed(new Runnable() { // from class: l.ۧۨᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c14146.m32363(-1);
                    }
                }, 100L);
            } else if (iM32508 == iM32512 && iM32508 == iM11804) {
                if (!c14146.f40275.mo11814() && !c23929.f75997) {
                    if (this.f56276 && SystemClock.uptimeMillis() - this.f56272 > 4500) {
                        if (this.f56279 == c14146.f40275.m11840()) {
                            c14146.m32363(-1);
                            this.f56272 = SystemClock.uptimeMillis();
                        }
                    } else {
                        this.f56272 = 0L;
                    }
                }
            } else {
                c14146.m32519(c14146.m32508(), iM11804);
                c14146.f40339.setSelection(iM11804);
                c14146.m32291();
                this.f56272 = 0L;
            }
            if (!c14146.f40275.mo11814() && !c23929.f75997) {
                c14146.m32409(false);
            }
        } else if (iM32508 == iM32512 && iM11804 == iM32508) {
            if (this.f56276 && SystemClock.uptimeMillis() - this.f56272 > 4500) {
                if (this.f56279 == c14146.f40275.m11840()) {
                    c14146.m32363(-1);
                    this.f56272 = SystemClock.uptimeMillis();
                }
            } else {
                this.f56272 = 0L;
            }
        } else if (iM32508 > iM11804 || iM11804 > iM32512 || !c23929.f75981) {
            c14146.m32519(c14146.m32508(), iM11804);
            c14146.f40339.setSelection(iM11804);
            c14146.m32291();
            this.f56272 = 0L;
            if (!c14146.f40275.mo11814() && !c23929.f75997) {
                c14146.m32413(iM11804, false);
            }
        } else if (!z || resultReceiverC6157.m13950() != 2) {
            c14146.m32363(-1);
        } else {
            c14146.postDelayed(new Runnable() { // from class: l.ۧۨᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    c14146.m32363(-1);
                }
            }, 100L);
        }
        this.f56279 = c14146.f40275.m11840();
        c14146.f40280 = SystemClock.uptimeMillis();
        c14146.m32464();
        c14146.invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42905() {
        boolean z = this.f56269;
        this.f56280 = false;
        this.f56273 = false;
        this.f56262 = false;
        this.f56269 = false;
        this.f56277 = -1;
        this.f56274 = 0.0f;
        this.f56289 = 0.0f;
        this.f56283.f40191 = 0;
        if (z) {
            m42910(false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42907(MotionEvent motionEvent) {
        m42914(motionEvent);
        float y = motionEvent.getY();
        C14146 c14146 = this.f56283;
        boolean z = c14146.f40191 == 0;
        float f = c14146.f40236;
        if (y < f) {
            c14146.f40191 = -C14146.m32248((int) (f - y));
            if (z) {
                c14146.f40241 = SystemClock.uptimeMillis();
            }
            c14146.postInvalidateOnAnimation();
        } else {
            float f2 = c14146.f40218;
            if (y > f2) {
                c14146.f40191 = C14146.m32248((int) (y - f2));
                if (z) {
                    c14146.f40241 = SystemClock.uptimeMillis();
                }
                c14146.postInvalidateOnAnimation();
            } else {
                c14146.f40191 = 0;
            }
        }
        float x = motionEvent.getX() - c14146.getPaddingLeft();
        float y2 = motionEvent.getY() - c14146.getPaddingTop();
        c14146.f40306 = x;
        c14146.f40310 = y2;
        m42906(x, y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m42906(float f, float f2) {
        C14146 c14146 = this.f56283;
        int iM11804 = c14146.f40275.m11804(c14146.getScrollX() + f, c14146.m32472() + f2);
        if (c14146.m32508() == this.f56277 && c14146.m32512() == iM11804) {
            return;
        }
        c14146.f40339.setSelection(this.f56277, iM11804);
        c14146.m32302(iM11804);
        c14146.invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42908(ViewOnTouchListenerC18840 viewOnTouchListenerC18840) {
        C14146 c14146 = viewOnTouchListenerC18840.f56283;
        c14146.setPressed(false);
        c14146.m32584();
        viewOnTouchListenerC18840.m42905();
    }

    /* JADX INFO: renamed from: ܿ */
    private void m42914(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C14146 c14146 = this.f56283;
        boolean z = x >= 0.0f && x <= ((float) c14146.getWidth()) && y >= 0.0f && y <= ((float) c14146.getHeight());
        if (z != c14146.isPressed()) {
            c14146.setPressed(z);
            c14146.invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0182  */
    /* JADX WARN: Code duplicated, block: B:106:0x0189  */
    /* JADX WARN: Code duplicated, block: B:109:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:115:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:118:0x0201 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:121:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x020a  */
    /* JADX WARN: Code duplicated, block: B:125:0x021a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0228  */
    /* JADX WARN: Code duplicated, block: B:131:0x0233  */
    /* JADX WARN: Code duplicated, block: B:133:0x0246  */
    /* JADX WARN: Code duplicated, block: B:135:0x024a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0257  */
    /* JADX WARN: Code duplicated, block: B:140:0x0269  */
    /* JADX WARN: Code duplicated, block: B:142:0x0276  */
    /* JADX WARN: Code duplicated, block: B:144:0x027f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0295  */
    /* JADX WARN: Code duplicated, block: B:148:0x029e  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:164:0x02df  */
    /* JADX WARN: Code duplicated, block: B:166:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:167:0x0313  */
    /* JADX WARN: Code duplicated, block: B:169:0x0317  */
    /* JADX WARN: Code duplicated, block: B:171:0x0320  */
    /* JADX WARN: Code duplicated, block: B:173:0x0331  */
    /* JADX WARN: Code duplicated, block: B:175:0x0337  */
    /* JADX WARN: Code duplicated, block: B:216:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:218:0x040b  */
    /* JADX WARN: Code duplicated, block: B:220:0x041f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0431  */
    /* JADX WARN: Code duplicated, block: B:226:0x0433  */
    /* JADX WARN: Code duplicated, block: B:229:0x043a  */
    /* JADX WARN: Code duplicated, block: B:231:0x0445  */
    /* JADX WARN: Code duplicated, block: B:233:0x044f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0455  */
    /* JADX WARN: Code duplicated, block: B:237:0x045f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0469  */
    /* JADX WARN: Code duplicated, block: B:242:0x047e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0482  */
    /* JADX WARN: Code duplicated, block: B:245:0x0484  */
    /* JADX WARN: Code duplicated, block: B:247:0x0488  */
    /* JADX WARN: Code duplicated, block: B:250:0x048d  */
    /* JADX WARN: Code duplicated, block: B:253:0x0495  */
    /* JADX WARN: Code duplicated, block: B:255:0x0499  */
    /* JADX WARN: Code duplicated, block: B:256:0x049b  */
    /* JADX WARN: Code duplicated, block: B:259:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:261:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:263:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:265:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:267:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:269:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:271:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:273:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:293:0x053b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0540  */
    /* JADX WARN: Code duplicated, block: B:296:0x0546  */
    /* JADX WARN: Code duplicated, block: B:298:0x054c  */
    /* JADX WARN: Code duplicated, block: B:300:0x0556  */
    /* JADX WARN: Code duplicated, block: B:304:0x0562  */
    /* JADX WARN: Code duplicated, block: B:308:0x0576  */
    /* JADX WARN: Code duplicated, block: B:310:0x0582  */
    /* JADX WARN: Code duplicated, block: B:313:0x058d  */
    /* JADX WARN: Code duplicated, block: B:316:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:319:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:321:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:323:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:328:0x0608  */
    /* JADX WARN: Code duplicated, block: B:330:0x0613  */
    /* JADX WARN: Code duplicated, block: B:332:0x0628  */
    /* JADX WARN: Code duplicated, block: B:336:0x0638  */
    /* JADX WARN: Code duplicated, block: B:338:0x0645  */
    /* JADX WARN: Code duplicated, block: B:340:0x0699  */
    /* JADX WARN: Code duplicated, block: B:342:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:344:0x0707  */
    /* JADX WARN: Code duplicated, block: B:346:0x0714  */
    /* JADX WARN: Code duplicated, block: B:350:0x0773  */
    /* JADX WARN: Code duplicated, block: B:358:0x0796  */
    /* JADX WARN: Code duplicated, block: B:359:0x0798  */
    /* JADX WARN: Code duplicated, block: B:362:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x0110  */
    /* JADX WARN: Code duplicated, block: B:77:0x0114  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124  */
    /* JADX WARN: Code duplicated, block: B:88:0x0140  */
    /* JADX WARN: Code duplicated, block: B:91:0x0146  */
    /* JADX WARN: Code duplicated, block: B:93:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0152  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C24047 c24047M32607;
        int action;
        int iM32508;
        int iM32512;
        float fM11821;
        AbstractC5390 abstractC5390;
        AbstractC5390 abstractC5391;
        RectF rectF;
        RectF rectF2;
        float x;
        boolean z;
        RectF rectF3;
        C16427 c16427;
        C16427 c16428;
        int iM32509;
        int iM32513;
        final C14146 c14146;
        final InterfaceC3299 interfaceC3299;
        float x2;
        float y;
        float y2;
        boolean z2;
        float f;
        float f2;
        float fM26496;
        float paddingTop;
        float f3;
        int i;
        C14146 c14147;
        final C14146 c14148;
        final InterfaceC3299 interfaceC32910;
        C14146 c14149;
        int actionMasked;
        float x3;
        C24047 c24047;
        ViewTreeObserverOnPreDrawListenerC10518[] viewTreeObserverOnPreDrawListenerC10518Arr;
        int actionMasked2;
        C14146 c141410 = this.f56283;
        C23929 c23929 = c141410.f40262;
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 0) {
            c141410.m32255();
            c141410.f40245 = null;
        }
        if (c141410.f40245 == null && c141410.m32583()) {
            c141410.f40245 = c141410.f40319;
        }
        if (c141410.f40245 == null) {
            int actionMasked4 = motionEvent.getActionMasked();
            if (actionMasked4 == 0) {
                c141410.m32258();
                if (!C14146.m32278(motionEvent) || (motionEvent.getButtonState() & 1) == 0) {
                    C14146.m32303(c141410);
                } else {
                    float x4 = (motionEvent.getX() + c141410.getScrollX()) - c141410.getPaddingLeft();
                    float fM11822 = c141410.f40275.m11821(motionEvent.getY());
                    AbstractC5390 abstractC5392 = c141410.f40275;
                    if (!abstractC5392.f12829 || !abstractC5392.f12799.m37324(x4, fM11822)) {
                        AbstractC5390 abstractC5393 = c141410.f40275;
                        if (!abstractC5393.f12828 || !abstractC5393.f12797.m37324(x4, fM11822)) {
                            C14146.m32303(c141410);
                        }
                    }
                }
            } else if (actionMasked4 == 3) {
                c141410.m32342();
            }
            if (!c141410.isFocused() && motionEvent.getActionMasked() == 1 && c141410.isPressed()) {
                c141410.requestFocus();
            }
            int i2 = 0;
            if (C14146.m32278(motionEvent)) {
                int actionMasked5 = motionEvent.getActionMasked();
                if (c141410.f40220) {
                    c141410.f40193 = true;
                    if (actionMasked5 == 0) {
                        c141410.setPressed(true);
                        return true;
                    }
                    if (actionMasked5 == 1 || actionMasked5 == 3) {
                        c141410.setPressed(false);
                        m42910(false);
                        c141410.m32584();
                        C14146.m32349(c141410);
                        return true;
                    }
                } else {
                    if (actionMasked5 == 0 && (motionEvent.getButtonState() & 2) != 0) {
                        C14146.m32315(c141410);
                        c141410.f40193 = true;
                        c141410.setPressed(true);
                        c141410.m32310(motionEvent);
                        return true;
                    }
                    if (this.f56273) {
                        actionMasked2 = motionEvent.getActionMasked();
                        if (actionMasked2 != 1) {
                            c141410.setPressed(false);
                            c141410.m32584();
                            m42905();
                            return true;
                        }
                        if (actionMasked2 != 2) {
                            m42907(motionEvent);
                            return true;
                        }
                        if (actionMasked2 == 3) {
                            c141410.setPressed(false);
                            c141410.m32584();
                            m42905();
                            return true;
                        }
                    }
                    c24047M32607 = c141410.m32607();
                    if (c24047M32607 != null) {
                        if (this.f56280) {
                            actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 1) {
                                m42905();
                            } else {
                                if (actionMasked != 2) {
                                    x3 = motionEvent.getX() - this.f56274;
                                    float y3 = motionEvent.getY() - this.f56289;
                                    if (Math.abs(x3) <= this.f56267) {
                                    }
                                    this.f56280 = false;
                                    this.f56273 = true;
                                    if (!c141410.isFocused()) {
                                        c141410.requestFocus();
                                    }
                                    if (!this.f56262) {
                                        c141410.m32519(c141410.m32508(), this.f56277);
                                        c141410.m32291();
                                        this.f56262 = true;
                                    }
                                    c141410.f40236 = Math.min(c23929.m26496() + c141410.getPaddingTop(), this.f56289);
                                    c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c23929.m26496(), this.f56289);
                                    c141410.f40191 = 0;
                                    c141410.f40280 = 0L;
                                    c24047 = c141410.f40198;
                                    if (c24047 != null) {
                                        c24047.m53294();
                                    }
                                    c141410.invalidate();
                                    m42910(true);
                                    this.f56269 = true;
                                    c141410.f40274.m5650(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    m42907(motionEvent);
                                    return true;
                                }
                                if (actionMasked == 3) {
                                    m42905();
                                }
                            }
                        }
                        action = motionEvent.getAction() & 255;
                        if (action != 0) {
                            c141410.setPressed(true);
                            c141410.m32507();
                            if (!c141410.isFocused()) {
                                c141410.invalidate();
                            }
                            this.f56264 = true;
                            if (c141410.mo27947()) {
                                m42910(true);
                            }
                            this.f56284 = false;
                            this.f56290 = 0;
                            this.f56287 = (c141410.getScrollX() + ((int) motionEvent.getX())) - c141410.getPaddingLeft();
                            this.f56288 = (c141410.m32472() + ((int) motionEvent.getY())) - c141410.getPaddingTop();
                            this.f56263 = false;
                            iM32508 = c141410.m32508();
                            iM32512 = c141410.m32512();
                            if (iM32508 > iM32512) {
                                iM32512 = iM32508;
                                iM32508 = iM32512;
                            }
                            fM11821 = c141410.f40275.m11821(motionEvent.getY());
                            abstractC5390 = c141410.f40275;
                            if (abstractC5390.f12829) {
                                c16428 = abstractC5390.f12799;
                                if (c16428.m37324(this.f56287, fM11821)) {
                                    c141410.f40312 = true;
                                    this.f56281 = c16428.f48280 - fM11821;
                                    if (!c141410.f40302.isFinished()) {
                                        c141410.f40302.abortAnimation();
                                    }
                                    m42910(true);
                                    c141410.invalidate();
                                    return true;
                                }
                            }
                            abstractC5391 = c141410.f40275;
                            if (abstractC5391.f12828) {
                                c16427 = abstractC5391.f12797;
                                if (c16427.m37324(this.f56287, fM11821)) {
                                    c141410.f40308 = true;
                                    this.f56282 = c16427.f48277 - this.f56287;
                                    if (!c141410.f40302.isFinished()) {
                                        c141410.f40302.abortAnimation();
                                    }
                                    m42910(true);
                                    c141410.invalidate();
                                    return true;
                                }
                            }
                            if (iM32508 == iM32512) {
                                rectF3 = c141410.f40275.f12804;
                                if (rectF3.contains(this.f56287, fM11821)) {
                                    c141410.f40221 = true;
                                    this.f56282 = ((rectF3.left + rectF3.right) / 2.0f) - this.f56287;
                                    this.f56281 = (rectF3.top - fM11821) - (c23929.m26496() / 2.0f);
                                    c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                    c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                    c141410.f40191 = 0;
                                    m42910(true);
                                    return true;
                                }
                            } else {
                                rectF = c141410.f40275.f12832;
                                if (rectF.contains(this.f56287, fM11821)) {
                                    rectF2 = c141410.f40275.f12810;
                                    if (rectF2.contains(this.f56287, fM11821)) {
                                        c141410.f40284 = true;
                                        c141410.f40330 = iM32508;
                                        float f4 = rectF2.left;
                                        this.f56282 = (((rectF2.right - f4) / 4.0f) + f4) - this.f56287;
                                        this.f56281 = (rectF2.top - fM11821) - (c23929.m26496() / 2.0f);
                                        c141410.f40325 = false;
                                        c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                        c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                        c141410.f40191 = 0;
                                        m42910(true);
                                        return true;
                                    }
                                } else {
                                    c141410.f40284 = true;
                                    c141410.f40330 = iM32512;
                                    float f5 = rectF.left;
                                    this.f56282 = ((((rectF.right - f5) * 3.0f) / 4.0f) + f5) - this.f56287;
                                    this.f56281 = (rectF.top - fM11821) - (c23929.m26496() / 2.0f);
                                    c141410.f40325 = true;
                                    c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                    c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                    c141410.f40191 = 0;
                                    m42910(true);
                                    return true;
                                }
                            }
                            if (c23929.f76010) {
                                x = motionEvent.getX();
                                if (c141410.m32321(x, motionEvent.getY())) {
                                    z = !c141410.m32328((x + c141410.getScrollX()) - c141410.getPaddingLeft());
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    this.f56280 = true;
                                    this.f56273 = false;
                                    this.f56262 = false;
                                    this.f56277 = c141410.f40275.m11804(this.f56287, this.f56288);
                                    this.f56274 = motionEvent.getX();
                                    this.f56289 = motionEvent.getY();
                                }
                            }
                        } else if (action != 1) {
                            c141410.setPressed(false);
                            m42910(false);
                            c141410.m32584();
                            if (this.f56284) {
                                m42911();
                                c14146 = c141410.f40298;
                                if (c14146 != null) {
                                    c14146.f40232.m42911();
                                    ((View) c141410.getParent()).invalidate();
                                    interfaceC3299 = c141410.f40271;
                                    if (interfaceC3299 != null) {
                                        C14146.m32199(c141410, new Runnable() { // from class: l.֫ۨᩳ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC18840 viewOnTouchListenerC18840 = this.f9015;
                                                final InterfaceC3299 interfaceC32911 = interfaceC3299;
                                                C14146.m32199(c14146, new Runnable() { // from class: l.ܽۨᩳ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C14146 c141411 = viewOnTouchListenerC18840.f56283;
                                                        int scrollX = c141411.getScrollX();
                                                        int iM32472 = c141411.m32472();
                                                        interfaceC32911.mo5747(scrollX, iM32472 - 1, scrollX, iM32472);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c141410.f40221) {
                                }
                                c141410.m32226();
                                if (c141410.f40221) {
                                    c141410.m32363(-1);
                                } else if (!c141410.f40284) {
                                    iM32509 = c141410.m32508();
                                    iM32513 = c141410.m32512();
                                    if (iM32509 > iM32513) {
                                        iM32513 = iM32509;
                                        iM32509 = iM32513;
                                    }
                                    if (!c141410.f40325) {
                                        iM32509 = iM32513;
                                    }
                                    c141410.m32363(iM32509);
                                } else {
                                    iM32509 = c141410.m32508();
                                    iM32513 = c141410.m32512();
                                    if (iM32509 > iM32513) {
                                        iM32513 = iM32509;
                                        iM32509 = iM32513;
                                    }
                                    if (!c141410.f40325) {
                                        iM32509 = iM32513;
                                    }
                                    c141410.m32363(iM32509);
                                }
                                c141410.f40324 = false;
                                c141410.f40221 = false;
                                c141410.f40284 = false;
                                c141410.f40280 = SystemClock.uptimeMillis();
                                return true;
                            }
                        } else {
                            if (action != 2) {
                                m42914(motionEvent);
                                if (this.f56290 != 1) {
                                    if (c141410.f40284) {
                                        c141410.f40232.onScroll(null, null, (this.f56285 - motionEvent.getX(1)) - c141410.getPaddingLeft(), (this.f56266 - motionEvent.getY(1)) - c141410.getPaddingTop());
                                        this.f56285 = motionEvent.getX(1);
                                        this.f56266 = motionEvent.getY(1);
                                    } else if (this.f56284) {
                                        m42912(motionEvent);
                                        c14147 = c141410.f40298;
                                        if (c14147 != null) {
                                            c14147.f40232.m42912(motionEvent);
                                            ((View) c141410.getParent()).invalidate();
                                            return true;
                                        }
                                    }
                                    if (!c141410.f40221) {
                                        x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                        y = motionEvent.getY() - c141410.getPaddingTop();
                                        if (!this.f56263) {
                                            i = (int) (x2 - this.f56287);
                                            int i3 = (int) (y - this.f56288);
                                            if (Math.abs(i) <= this.f56267) {
                                            }
                                            this.f56263 = true;
                                        }
                                        y2 = motionEvent.getY();
                                        if (c141410.f40191 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        f = c141410.f40236;
                                        if (y2 < f) {
                                            c141410.f40191 = -C14146.m32248((int) (f - y2));
                                            if (z2) {
                                                c141410.f40241 = SystemClock.uptimeMillis();
                                            }
                                            c141410.postInvalidateOnAnimation();
                                        } else {
                                            f2 = c141410.f40218;
                                            if (y2 > f2) {
                                                c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                                if (z2) {
                                                    c141410.f40241 = SystemClock.uptimeMillis();
                                                }
                                                c141410.postInvalidateOnAnimation();
                                            } else {
                                                c141410.f40191 = 0;
                                            }
                                        }
                                        fM26496 = c23929.m26496() / 2.0f;
                                        paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                        if (c141410.f40324) {
                                            if (y < fM26496) {
                                                y = fM26496;
                                            } else if (y > paddingTop) {
                                                y = paddingTop;
                                            }
                                            c141410.m32489(x2, y);
                                            return true;
                                        }
                                        f3 = y + this.f56281;
                                        if (f3 >= fM26496) {
                                            if (f3 > paddingTop) {
                                                fM26496 = paddingTop;
                                            } else {
                                                fM26496 = f3;
                                            }
                                        }
                                        if (c141410.f40221) {
                                            c141410.m32560(x2 + this.f56282, fM26496);
                                            return true;
                                        }
                                        c141410.m32540(x2 + this.f56282, fM26496);
                                        return true;
                                    }
                                    x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                    y = motionEvent.getY() - c141410.getPaddingTop();
                                    if (!this.f56263) {
                                        i = (int) (x2 - this.f56287);
                                        int i4 = (int) (y - this.f56288);
                                        if (Math.abs(i) <= this.f56267) {
                                        }
                                        this.f56263 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c141410.f40191 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c141410.f40236;
                                    if (y2 < f) {
                                        c141410.f40191 = -C14146.m32248((int) (f - y2));
                                        if (z2) {
                                            c141410.f40241 = SystemClock.uptimeMillis();
                                        }
                                        c141410.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c141410.f40218;
                                        if (y2 > f2) {
                                            c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                            if (z2) {
                                                c141410.f40241 = SystemClock.uptimeMillis();
                                            }
                                            c141410.postInvalidateOnAnimation();
                                        } else {
                                            c141410.f40191 = 0;
                                        }
                                    }
                                    fM26496 = c23929.m26496() / 2.0f;
                                    paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                    if (c141410.f40324) {
                                        if (y < fM26496) {
                                            y = fM26496;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c141410.m32489(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f56281;
                                    if (f3 >= fM26496) {
                                        if (f3 > paddingTop) {
                                            fM26496 = paddingTop;
                                        } else {
                                            fM26496 = f3;
                                        }
                                    }
                                    if (c141410.f40221) {
                                        c141410.m32560(x2 + this.f56282, fM26496);
                                        return true;
                                    }
                                    c141410.m32540(x2 + this.f56282, fM26496);
                                    return true;
                                }
                                if (!c141410.f40221) {
                                    x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                    y = motionEvent.getY() - c141410.getPaddingTop();
                                    if (!this.f56263) {
                                        i = (int) (x2 - this.f56287);
                                        int i5 = (int) (y - this.f56288);
                                        if (Math.abs(i) <= this.f56267) {
                                        }
                                        this.f56263 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c141410.f40191 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c141410.f40236;
                                    if (y2 < f) {
                                        c141410.f40191 = -C14146.m32248((int) (f - y2));
                                        if (z2) {
                                            c141410.f40241 = SystemClock.uptimeMillis();
                                        }
                                        c141410.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c141410.f40218;
                                        if (y2 > f2) {
                                            c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                            if (z2) {
                                                c141410.f40241 = SystemClock.uptimeMillis();
                                            }
                                            c141410.postInvalidateOnAnimation();
                                        } else {
                                            c141410.f40191 = 0;
                                        }
                                    }
                                    fM26496 = c23929.m26496() / 2.0f;
                                    paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                    if (c141410.f40324) {
                                        if (y < fM26496) {
                                            y = fM26496;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c141410.m32489(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f56281;
                                    if (f3 >= fM26496) {
                                        if (f3 > paddingTop) {
                                            fM26496 = paddingTop;
                                        } else {
                                            fM26496 = f3;
                                        }
                                    }
                                    if (c141410.f40221) {
                                        c141410.m32560(x2 + this.f56282, fM26496);
                                        return true;
                                    }
                                    c141410.m32540(x2 + this.f56282, fM26496);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                y = motionEvent.getY() - c141410.getPaddingTop();
                                if (!this.f56263) {
                                    i = (int) (x2 - this.f56287);
                                    int i6 = (int) (y - this.f56288);
                                    if (Math.abs(i) <= this.f56267) {
                                    }
                                    this.f56263 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c141410.f40191 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c141410.f40236;
                                if (y2 < f) {
                                    c141410.f40191 = -C14146.m32248((int) (f - y2));
                                    if (z2) {
                                        c141410.f40241 = SystemClock.uptimeMillis();
                                    }
                                    c141410.postInvalidateOnAnimation();
                                } else {
                                    f2 = c141410.f40218;
                                    if (y2 > f2) {
                                        c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                        if (z2) {
                                            c141410.f40241 = SystemClock.uptimeMillis();
                                        }
                                        c141410.postInvalidateOnAnimation();
                                    } else {
                                        c141410.f40191 = 0;
                                    }
                                }
                                fM26496 = c23929.m26496() / 2.0f;
                                paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                if (c141410.f40324) {
                                    if (y < fM26496) {
                                        y = fM26496;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c141410.m32489(x2, y);
                                    return true;
                                }
                                f3 = y + this.f56281;
                                if (f3 >= fM26496) {
                                    if (f3 > paddingTop) {
                                        fM26496 = paddingTop;
                                    } else {
                                        fM26496 = f3;
                                    }
                                }
                                if (c141410.f40221) {
                                    c141410.m32560(x2 + this.f56282, fM26496);
                                    return true;
                                }
                                c141410.m32540(x2 + this.f56282, fM26496);
                                return true;
                            }
                            if (action != 3) {
                                c141410.setPressed(false);
                                m42910(false);
                                c141410.m32584();
                                if (this.f56284) {
                                    m42911();
                                    c14148 = c141410.f40298;
                                    if (c14148 != null) {
                                        c14148.f40232.m42911();
                                        ((View) c141410.getParent()).invalidate();
                                        interfaceC32910 = c141410.f40271;
                                        if (interfaceC32910 != null) {
                                            C14146.m32199(c141410, new Runnable() { // from class: l.۟ۛᩳ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final ViewOnTouchListenerC18840 viewOnTouchListenerC18840 = this.f25264;
                                                    final InterfaceC3299 interfaceC32911 = interfaceC32910;
                                                    C14146.m32199(c14148, new Runnable() { // from class: l.ᩳۨᩳ
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            C14146 c141411 = viewOnTouchListenerC18840.f56283;
                                                            int scrollX = c141411.getScrollX();
                                                            int iM32472 = c141411.m32472();
                                                            interfaceC32911.mo5747(scrollX, iM32472 - 1, scrollX, iM32472);
                                                        }
                                                    });
                                                }
                                            });
                                            return true;
                                        }
                                    }
                                } else {
                                    if (!c141410.f40312) {
                                    }
                                    C14146.m32290(c141410);
                                    c141410.f40324 = false;
                                    c141410.f40221 = false;
                                    c141410.f40284 = false;
                                    c141410.f40308 = false;
                                    c141410.f40312 = false;
                                    c141410.m32226();
                                    return true;
                                }
                            } else if (action != 5) {
                                this.f56290++;
                                if (c141410.f40284) {
                                    this.f56268 = motionEvent.getPointerId(1);
                                    this.f56285 = motionEvent.getX(1);
                                    this.f56266 = motionEvent.getY(1);
                                    return true;
                                }
                                if (c23929.f75952) {
                                    m42915(motionEvent);
                                    c14149 = c141410.f40298;
                                    if (c14149 != null) {
                                        c14149.f40232.m42915(motionEvent);
                                        ((View) c141410.getParent()).invalidate();
                                    }
                                }
                            } else if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >>> 8;
                                if (c141410.f40284) {
                                    c141410.f40284 = false;
                                }
                                this.f56290--;
                            }
                        }
                        return c141410.f40274.m5650(motionEvent);
                    }
                    viewTreeObserverOnPreDrawListenerC10518Arr = c24047M32607.f76377;
                    if (!viewTreeObserverOnPreDrawListenerC10518Arr[0].m24254()) {
                        if (this.f56280) {
                            actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 1) {
                                m42905();
                            } else {
                                if (actionMasked != 2) {
                                    x3 = motionEvent.getX() - this.f56274;
                                    float y4 = motionEvent.getY() - this.f56289;
                                    if (Math.abs(x3) <= this.f56267) {
                                    }
                                    this.f56280 = false;
                                    this.f56273 = true;
                                    if (!c141410.isFocused()) {
                                        c141410.requestFocus();
                                    }
                                    if (!this.f56262) {
                                        c141410.m32519(c141410.m32508(), this.f56277);
                                        c141410.m32291();
                                        this.f56262 = true;
                                    }
                                    c141410.f40236 = Math.min(c23929.m26496() + c141410.getPaddingTop(), this.f56289);
                                    c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c23929.m26496(), this.f56289);
                                    c141410.f40191 = 0;
                                    c141410.f40280 = 0L;
                                    c24047 = c141410.f40198;
                                    if (c24047 != null) {
                                        c24047.m53294();
                                    }
                                    c141410.invalidate();
                                    m42910(true);
                                    this.f56269 = true;
                                    c141410.f40274.m5650(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    m42907(motionEvent);
                                    return true;
                                }
                                if (actionMasked == 3) {
                                    m42905();
                                }
                            }
                        }
                        action = motionEvent.getAction() & 255;
                        if (action != 0) {
                            c141410.setPressed(true);
                            c141410.m32507();
                            if (!c141410.isFocused()) {
                                c141410.invalidate();
                            }
                            this.f56264 = true;
                            if (c141410.mo27947()) {
                                m42910(true);
                            }
                            this.f56284 = false;
                            this.f56290 = 0;
                            this.f56287 = (c141410.getScrollX() + ((int) motionEvent.getX())) - c141410.getPaddingLeft();
                            this.f56288 = (c141410.m32472() + ((int) motionEvent.getY())) - c141410.getPaddingTop();
                            this.f56263 = false;
                            iM32508 = c141410.m32508();
                            iM32512 = c141410.m32512();
                            if (iM32508 > iM32512) {
                                iM32512 = iM32508;
                                iM32508 = iM32512;
                            }
                            fM11821 = c141410.f40275.m11821(motionEvent.getY());
                            abstractC5390 = c141410.f40275;
                            if (abstractC5390.f12829) {
                                c16428 = abstractC5390.f12799;
                                if (c16428.m37324(this.f56287, fM11821)) {
                                    c141410.f40312 = true;
                                    this.f56281 = c16428.f48280 - fM11821;
                                    if (!c141410.f40302.isFinished()) {
                                        c141410.f40302.abortAnimation();
                                    }
                                    m42910(true);
                                    c141410.invalidate();
                                    return true;
                                }
                            }
                            abstractC5391 = c141410.f40275;
                            if (abstractC5391.f12828) {
                                c16427 = abstractC5391.f12797;
                                if (c16427.m37324(this.f56287, fM11821)) {
                                    c141410.f40308 = true;
                                    this.f56282 = c16427.f48277 - this.f56287;
                                    if (!c141410.f40302.isFinished()) {
                                        c141410.f40302.abortAnimation();
                                    }
                                    m42910(true);
                                    c141410.invalidate();
                                    return true;
                                }
                            }
                            if (iM32508 == iM32512) {
                                rectF3 = c141410.f40275.f12804;
                                if (rectF3.contains(this.f56287, fM11821)) {
                                    c141410.f40221 = true;
                                    this.f56282 = ((rectF3.left + rectF3.right) / 2.0f) - this.f56287;
                                    this.f56281 = (rectF3.top - fM11821) - (c23929.m26496() / 2.0f);
                                    c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                    c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                    c141410.f40191 = 0;
                                    m42910(true);
                                    return true;
                                }
                            } else {
                                rectF = c141410.f40275.f12832;
                                if (rectF.contains(this.f56287, fM11821)) {
                                    rectF2 = c141410.f40275.f12810;
                                    if (rectF2.contains(this.f56287, fM11821)) {
                                        c141410.f40284 = true;
                                        c141410.f40330 = iM32508;
                                        float f6 = rectF2.left;
                                        this.f56282 = (((rectF2.right - f6) / 4.0f) + f6) - this.f56287;
                                        this.f56281 = (rectF2.top - fM11821) - (c23929.m26496() / 2.0f);
                                        c141410.f40325 = false;
                                        c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                        c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                        c141410.f40191 = 0;
                                        m42910(true);
                                        return true;
                                    }
                                } else {
                                    c141410.f40284 = true;
                                    c141410.f40330 = iM32512;
                                    float f7 = rectF.left;
                                    this.f56282 = ((((rectF.right - f7) * 3.0f) / 4.0f) + f7) - this.f56287;
                                    this.f56281 = (rectF.top - fM11821) - (c23929.m26496() / 2.0f);
                                    c141410.f40325 = true;
                                    c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                    c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                    c141410.f40191 = 0;
                                    m42910(true);
                                    return true;
                                }
                            }
                            if (c23929.f76010) {
                                x = motionEvent.getX();
                                if (c141410.m32321(x, motionEvent.getY())) {
                                    z = false;
                                } else {
                                    z = !c141410.m32328((x + c141410.getScrollX()) - c141410.getPaddingLeft());
                                }
                                if (z) {
                                    this.f56280 = true;
                                    this.f56273 = false;
                                    this.f56262 = false;
                                    this.f56277 = c141410.f40275.m11804(this.f56287, this.f56288);
                                    this.f56274 = motionEvent.getX();
                                    this.f56289 = motionEvent.getY();
                                }
                            }
                        } else if (action != 1) {
                            c141410.setPressed(false);
                            m42910(false);
                            c141410.m32584();
                            if (this.f56284) {
                                m42911();
                                c14146 = c141410.f40298;
                                if (c14146 != null) {
                                    c14146.f40232.m42911();
                                    ((View) c141410.getParent()).invalidate();
                                    interfaceC3299 = c141410.f40271;
                                    if (interfaceC3299 != null) {
                                        C14146.m32199(c141410, new Runnable() { // from class: l.֫ۨᩳ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC18840 viewOnTouchListenerC18840 = this.f9015;
                                                final InterfaceC3299 interfaceC32911 = interfaceC3299;
                                                C14146.m32199(c14146, new Runnable() { // from class: l.ܽۨᩳ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C14146 c141411 = viewOnTouchListenerC18840.f56283;
                                                        int scrollX = c141411.getScrollX();
                                                        int iM32472 = c141411.m32472();
                                                        interfaceC32911.mo5747(scrollX, iM32472 - 1, scrollX, iM32472);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c141410.f40221) {
                                }
                                c141410.m32226();
                                if (c141410.f40221) {
                                    c141410.m32363(-1);
                                } else if (!c141410.f40284) {
                                    iM32509 = c141410.m32508();
                                    iM32513 = c141410.m32512();
                                    if (iM32509 > iM32513) {
                                        iM32513 = iM32509;
                                        iM32509 = iM32513;
                                    }
                                    if (!c141410.f40325) {
                                        iM32509 = iM32513;
                                    }
                                    c141410.m32363(iM32509);
                                } else {
                                    iM32509 = c141410.m32508();
                                    iM32513 = c141410.m32512();
                                    if (iM32509 > iM32513) {
                                        iM32513 = iM32509;
                                        iM32509 = iM32513;
                                    }
                                    if (!c141410.f40325) {
                                        iM32509 = iM32513;
                                    }
                                    c141410.m32363(iM32509);
                                }
                                c141410.f40324 = false;
                                c141410.f40221 = false;
                                c141410.f40284 = false;
                                c141410.f40280 = SystemClock.uptimeMillis();
                                return true;
                            }
                        } else {
                            if (action != 2) {
                                m42914(motionEvent);
                                if (this.f56290 != 1) {
                                    if (c141410.f40284) {
                                        c141410.f40232.onScroll(null, null, (this.f56285 - motionEvent.getX(1)) - c141410.getPaddingLeft(), (this.f56266 - motionEvent.getY(1)) - c141410.getPaddingTop());
                                        this.f56285 = motionEvent.getX(1);
                                        this.f56266 = motionEvent.getY(1);
                                    } else if (this.f56284) {
                                        m42912(motionEvent);
                                        c14147 = c141410.f40298;
                                        if (c14147 != null) {
                                            c14147.f40232.m42912(motionEvent);
                                            ((View) c141410.getParent()).invalidate();
                                            return true;
                                        }
                                    }
                                    if (!c141410.f40221) {
                                        x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                        y = motionEvent.getY() - c141410.getPaddingTop();
                                        if (!this.f56263) {
                                            i = (int) (x2 - this.f56287);
                                            int i7 = (int) (y - this.f56288);
                                            if (Math.abs(i) <= this.f56267) {
                                            }
                                            this.f56263 = true;
                                        }
                                        y2 = motionEvent.getY();
                                        if (c141410.f40191 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        f = c141410.f40236;
                                        if (y2 < f) {
                                            c141410.f40191 = -C14146.m32248((int) (f - y2));
                                            if (z2) {
                                                c141410.f40241 = SystemClock.uptimeMillis();
                                            }
                                            c141410.postInvalidateOnAnimation();
                                        } else {
                                            f2 = c141410.f40218;
                                            if (y2 > f2) {
                                                c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                                if (z2) {
                                                    c141410.f40241 = SystemClock.uptimeMillis();
                                                }
                                                c141410.postInvalidateOnAnimation();
                                            } else {
                                                c141410.f40191 = 0;
                                            }
                                        }
                                        fM26496 = c23929.m26496() / 2.0f;
                                        paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                        if (c141410.f40324) {
                                            if (y < fM26496) {
                                                y = fM26496;
                                            } else if (y > paddingTop) {
                                                y = paddingTop;
                                            }
                                            c141410.m32489(x2, y);
                                            return true;
                                        }
                                        f3 = y + this.f56281;
                                        if (f3 >= fM26496) {
                                            if (f3 > paddingTop) {
                                                fM26496 = paddingTop;
                                            } else {
                                                fM26496 = f3;
                                            }
                                        }
                                        if (c141410.f40221) {
                                            c141410.m32560(x2 + this.f56282, fM26496);
                                            return true;
                                        }
                                        c141410.m32540(x2 + this.f56282, fM26496);
                                        return true;
                                    }
                                    x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                    y = motionEvent.getY() - c141410.getPaddingTop();
                                    if (!this.f56263) {
                                        i = (int) (x2 - this.f56287);
                                        int i8 = (int) (y - this.f56288);
                                        if (Math.abs(i) <= this.f56267) {
                                        }
                                        this.f56263 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c141410.f40191 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c141410.f40236;
                                    if (y2 < f) {
                                        c141410.f40191 = -C14146.m32248((int) (f - y2));
                                        if (z2) {
                                            c141410.f40241 = SystemClock.uptimeMillis();
                                        }
                                        c141410.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c141410.f40218;
                                        if (y2 > f2) {
                                            c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                            if (z2) {
                                                c141410.f40241 = SystemClock.uptimeMillis();
                                            }
                                            c141410.postInvalidateOnAnimation();
                                        } else {
                                            c141410.f40191 = 0;
                                        }
                                    }
                                    fM26496 = c23929.m26496() / 2.0f;
                                    paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                    if (c141410.f40324) {
                                        if (y < fM26496) {
                                            y = fM26496;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c141410.m32489(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f56281;
                                    if (f3 >= fM26496) {
                                        if (f3 > paddingTop) {
                                            fM26496 = paddingTop;
                                        } else {
                                            fM26496 = f3;
                                        }
                                    }
                                    if (c141410.f40221) {
                                        c141410.m32560(x2 + this.f56282, fM26496);
                                        return true;
                                    }
                                    c141410.m32540(x2 + this.f56282, fM26496);
                                    return true;
                                }
                                if (!c141410.f40221) {
                                    x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                    y = motionEvent.getY() - c141410.getPaddingTop();
                                    if (!this.f56263) {
                                        i = (int) (x2 - this.f56287);
                                        int i9 = (int) (y - this.f56288);
                                        if (Math.abs(i) <= this.f56267) {
                                        }
                                        this.f56263 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c141410.f40191 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c141410.f40236;
                                    if (y2 < f) {
                                        c141410.f40191 = -C14146.m32248((int) (f - y2));
                                        if (z2) {
                                            c141410.f40241 = SystemClock.uptimeMillis();
                                        }
                                        c141410.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c141410.f40218;
                                        if (y2 > f2) {
                                            c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                            if (z2) {
                                                c141410.f40241 = SystemClock.uptimeMillis();
                                            }
                                            c141410.postInvalidateOnAnimation();
                                        } else {
                                            c141410.f40191 = 0;
                                        }
                                    }
                                    fM26496 = c23929.m26496() / 2.0f;
                                    paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                    if (c141410.f40324) {
                                        if (y < fM26496) {
                                            y = fM26496;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c141410.m32489(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f56281;
                                    if (f3 >= fM26496) {
                                        if (f3 > paddingTop) {
                                            fM26496 = paddingTop;
                                        } else {
                                            fM26496 = f3;
                                        }
                                    }
                                    if (c141410.f40221) {
                                        c141410.m32560(x2 + this.f56282, fM26496);
                                        return true;
                                    }
                                    c141410.m32540(x2 + this.f56282, fM26496);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                y = motionEvent.getY() - c141410.getPaddingTop();
                                if (!this.f56263) {
                                    i = (int) (x2 - this.f56287);
                                    int i10 = (int) (y - this.f56288);
                                    if (Math.abs(i) <= this.f56267) {
                                    }
                                    this.f56263 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c141410.f40191 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c141410.f40236;
                                if (y2 < f) {
                                    c141410.f40191 = -C14146.m32248((int) (f - y2));
                                    if (z2) {
                                        c141410.f40241 = SystemClock.uptimeMillis();
                                    }
                                    c141410.postInvalidateOnAnimation();
                                } else {
                                    f2 = c141410.f40218;
                                    if (y2 > f2) {
                                        c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                        if (z2) {
                                            c141410.f40241 = SystemClock.uptimeMillis();
                                        }
                                        c141410.postInvalidateOnAnimation();
                                    } else {
                                        c141410.f40191 = 0;
                                    }
                                }
                                fM26496 = c23929.m26496() / 2.0f;
                                paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                if (c141410.f40324) {
                                    if (y < fM26496) {
                                        y = fM26496;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c141410.m32489(x2, y);
                                    return true;
                                }
                                f3 = y + this.f56281;
                                if (f3 >= fM26496) {
                                    if (f3 > paddingTop) {
                                        fM26496 = paddingTop;
                                    } else {
                                        fM26496 = f3;
                                    }
                                }
                                if (c141410.f40221) {
                                    c141410.m32560(x2 + this.f56282, fM26496);
                                    return true;
                                }
                                c141410.m32540(x2 + this.f56282, fM26496);
                                return true;
                            }
                            if (action != 3) {
                                c141410.setPressed(false);
                                m42910(false);
                                c141410.m32584();
                                if (this.f56284) {
                                    m42911();
                                    c14148 = c141410.f40298;
                                    if (c14148 != null) {
                                        c14148.f40232.m42911();
                                        ((View) c141410.getParent()).invalidate();
                                        interfaceC32910 = c141410.f40271;
                                        if (interfaceC32910 != null) {
                                            C14146.m32199(c141410, new Runnable() { // from class: l.۟ۛᩳ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final ViewOnTouchListenerC18840 viewOnTouchListenerC18840 = this.f25264;
                                                    final InterfaceC3299 interfaceC32911 = interfaceC32910;
                                                    C14146.m32199(c14148, new Runnable() { // from class: l.ᩳۨᩳ
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            C14146 c141411 = viewOnTouchListenerC18840.f56283;
                                                            int scrollX = c141411.getScrollX();
                                                            int iM32472 = c141411.m32472();
                                                            interfaceC32911.mo5747(scrollX, iM32472 - 1, scrollX, iM32472);
                                                        }
                                                    });
                                                }
                                            });
                                            return true;
                                        }
                                    }
                                } else {
                                    if (!c141410.f40312) {
                                    }
                                    C14146.m32290(c141410);
                                    c141410.f40324 = false;
                                    c141410.f40221 = false;
                                    c141410.f40284 = false;
                                    c141410.f40308 = false;
                                    c141410.f40312 = false;
                                    c141410.m32226();
                                    return true;
                                }
                            } else if (action != 5) {
                                this.f56290++;
                                if (c141410.f40284) {
                                    this.f56268 = motionEvent.getPointerId(1);
                                    this.f56285 = motionEvent.getX(1);
                                    this.f56266 = motionEvent.getY(1);
                                    return true;
                                }
                                if (c23929.f75952) {
                                    m42915(motionEvent);
                                    c14149 = c141410.f40298;
                                    if (c14149 != null) {
                                        c14149.f40232.m42915(motionEvent);
                                        ((View) c141410.getParent()).invalidate();
                                    }
                                }
                            } else if (action == 6) {
                                int action3 = (motionEvent.getAction() & 65280) >>> 8;
                                if (c141410.f40284) {
                                    c141410.f40284 = false;
                                }
                                this.f56290--;
                            }
                        }
                        return c141410.f40274.m5650(motionEvent);
                    }
                }
            } else {
                if (this.f56273) {
                    actionMasked2 = motionEvent.getActionMasked();
                    if (actionMasked2 != 1) {
                        c141410.setPressed(false);
                        c141410.m32584();
                        m42905();
                        return true;
                    }
                    if (actionMasked2 != 2) {
                        m42907(motionEvent);
                        return true;
                    }
                    if (actionMasked2 == 3) {
                        c141410.setPressed(false);
                        c141410.m32584();
                        m42905();
                        return true;
                    }
                }
                c24047M32607 = c141410.m32607();
                if (c24047M32607 != null) {
                    if (this.f56280) {
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 1) {
                            m42905();
                        } else {
                            if (actionMasked != 2) {
                                x3 = motionEvent.getX() - this.f56274;
                                float y5 = motionEvent.getY() - this.f56289;
                                if (Math.abs(x3) <= this.f56267) {
                                }
                                this.f56280 = false;
                                this.f56273 = true;
                                if (!c141410.isFocused()) {
                                    c141410.requestFocus();
                                }
                                if (!this.f56262) {
                                    c141410.m32519(c141410.m32508(), this.f56277);
                                    c141410.m32291();
                                    this.f56262 = true;
                                }
                                c141410.f40236 = Math.min(c23929.m26496() + c141410.getPaddingTop(), this.f56289);
                                c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c23929.m26496(), this.f56289);
                                c141410.f40191 = 0;
                                c141410.f40280 = 0L;
                                c24047 = c141410.f40198;
                                if (c24047 != null) {
                                    c24047.m53294();
                                }
                                c141410.invalidate();
                                m42910(true);
                                this.f56269 = true;
                                c141410.f40274.m5650(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                m42907(motionEvent);
                                return true;
                            }
                            if (actionMasked == 3) {
                                m42905();
                            }
                        }
                    }
                    action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        c141410.setPressed(true);
                        c141410.m32507();
                        if (!c141410.isFocused()) {
                            c141410.invalidate();
                        }
                        this.f56264 = true;
                        if (c141410.mo27947()) {
                            m42910(true);
                        }
                        this.f56284 = false;
                        this.f56290 = 0;
                        this.f56287 = (c141410.getScrollX() + ((int) motionEvent.getX())) - c141410.getPaddingLeft();
                        this.f56288 = (c141410.m32472() + ((int) motionEvent.getY())) - c141410.getPaddingTop();
                        this.f56263 = false;
                        iM32508 = c141410.m32508();
                        iM32512 = c141410.m32512();
                        if (iM32508 > iM32512) {
                            iM32512 = iM32508;
                            iM32508 = iM32512;
                        }
                        fM11821 = c141410.f40275.m11821(motionEvent.getY());
                        abstractC5390 = c141410.f40275;
                        if (abstractC5390.f12829) {
                            c16428 = abstractC5390.f12799;
                            if (c16428.m37324(this.f56287, fM11821)) {
                                c141410.f40312 = true;
                                this.f56281 = c16428.f48280 - fM11821;
                                if (!c141410.f40302.isFinished()) {
                                    c141410.f40302.abortAnimation();
                                }
                                m42910(true);
                                c141410.invalidate();
                                return true;
                            }
                        }
                        abstractC5391 = c141410.f40275;
                        if (abstractC5391.f12828) {
                            c16427 = abstractC5391.f12797;
                            if (c16427.m37324(this.f56287, fM11821)) {
                                c141410.f40308 = true;
                                this.f56282 = c16427.f48277 - this.f56287;
                                if (!c141410.f40302.isFinished()) {
                                    c141410.f40302.abortAnimation();
                                }
                                m42910(true);
                                c141410.invalidate();
                                return true;
                            }
                        }
                        if (iM32508 == iM32512) {
                            rectF3 = c141410.f40275.f12804;
                            if (rectF3.contains(this.f56287, fM11821)) {
                                c141410.f40221 = true;
                                this.f56282 = ((rectF3.left + rectF3.right) / 2.0f) - this.f56287;
                                this.f56281 = (rectF3.top - fM11821) - (c23929.m26496() / 2.0f);
                                c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                c141410.f40191 = 0;
                                m42910(true);
                                return true;
                            }
                        } else {
                            rectF = c141410.f40275.f12832;
                            if (rectF.contains(this.f56287, fM11821)) {
                                rectF2 = c141410.f40275.f12810;
                                if (rectF2.contains(this.f56287, fM11821)) {
                                    c141410.f40284 = true;
                                    c141410.f40330 = iM32508;
                                    float f8 = rectF2.left;
                                    this.f56282 = (((rectF2.right - f8) / 4.0f) + f8) - this.f56287;
                                    this.f56281 = (rectF2.top - fM11821) - (c23929.m26496() / 2.0f);
                                    c141410.f40325 = false;
                                    c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                    c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                    c141410.f40191 = 0;
                                    m42910(true);
                                    return true;
                                }
                            } else {
                                c141410.f40284 = true;
                                c141410.f40330 = iM32512;
                                float f9 = rectF.left;
                                this.f56282 = ((((rectF.right - f9) * 3.0f) / 4.0f) + f9) - this.f56287;
                                this.f56281 = (rectF.top - fM11821) - (c23929.m26496() / 2.0f);
                                c141410.f40325 = true;
                                c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                c141410.f40191 = 0;
                                m42910(true);
                                return true;
                            }
                        }
                        if (c23929.f76010) {
                            x = motionEvent.getX();
                            if (c141410.m32321(x, motionEvent.getY())) {
                                z = false;
                            } else {
                                z = !c141410.m32328((x + c141410.getScrollX()) - c141410.getPaddingLeft());
                            }
                            if (z) {
                                this.f56280 = true;
                                this.f56273 = false;
                                this.f56262 = false;
                                this.f56277 = c141410.f40275.m11804(this.f56287, this.f56288);
                                this.f56274 = motionEvent.getX();
                                this.f56289 = motionEvent.getY();
                            }
                        }
                    } else if (action != 1) {
                        c141410.setPressed(false);
                        m42910(false);
                        c141410.m32584();
                        if (this.f56284) {
                            m42911();
                            c14146 = c141410.f40298;
                            if (c14146 != null) {
                                c14146.f40232.m42911();
                                ((View) c141410.getParent()).invalidate();
                                interfaceC3299 = c141410.f40271;
                                if (interfaceC3299 != null) {
                                    C14146.m32199(c141410, new Runnable() { // from class: l.֫ۨᩳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC18840 viewOnTouchListenerC18840 = this.f9015;
                                            final InterfaceC3299 interfaceC32911 = interfaceC3299;
                                            C14146.m32199(c14146, new Runnable() { // from class: l.ܽۨᩳ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C14146 c141411 = viewOnTouchListenerC18840.f56283;
                                                    int scrollX = c141411.getScrollX();
                                                    int iM32472 = c141411.m32472();
                                                    interfaceC32911.mo5747(scrollX, iM32472 - 1, scrollX, iM32472);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c141410.f40221) {
                            }
                            c141410.m32226();
                            if (c141410.f40221) {
                                c141410.m32363(-1);
                            } else if (!c141410.f40284) {
                                iM32509 = c141410.m32508();
                                iM32513 = c141410.m32512();
                                if (iM32509 > iM32513) {
                                    iM32513 = iM32509;
                                    iM32509 = iM32513;
                                }
                                if (!c141410.f40325) {
                                    iM32509 = iM32513;
                                }
                                c141410.m32363(iM32509);
                            } else {
                                iM32509 = c141410.m32508();
                                iM32513 = c141410.m32512();
                                if (iM32509 > iM32513) {
                                    iM32513 = iM32509;
                                    iM32509 = iM32513;
                                }
                                if (!c141410.f40325) {
                                    iM32509 = iM32513;
                                }
                                c141410.m32363(iM32509);
                            }
                            c141410.f40324 = false;
                            c141410.f40221 = false;
                            c141410.f40284 = false;
                            c141410.f40280 = SystemClock.uptimeMillis();
                            return true;
                        }
                    } else {
                        if (action != 2) {
                            m42914(motionEvent);
                            if (this.f56290 != 1) {
                                if (c141410.f40284) {
                                    c141410.f40232.onScroll(null, null, (this.f56285 - motionEvent.getX(1)) - c141410.getPaddingLeft(), (this.f56266 - motionEvent.getY(1)) - c141410.getPaddingTop());
                                    this.f56285 = motionEvent.getX(1);
                                    this.f56266 = motionEvent.getY(1);
                                } else if (this.f56284) {
                                    m42912(motionEvent);
                                    c14147 = c141410.f40298;
                                    if (c14147 != null) {
                                        c14147.f40232.m42912(motionEvent);
                                        ((View) c141410.getParent()).invalidate();
                                        return true;
                                    }
                                }
                                if (!c141410.f40221) {
                                    x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                    y = motionEvent.getY() - c141410.getPaddingTop();
                                    if (!this.f56263) {
                                        i = (int) (x2 - this.f56287);
                                        int i11 = (int) (y - this.f56288);
                                        if (Math.abs(i) <= this.f56267) {
                                        }
                                        this.f56263 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c141410.f40191 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c141410.f40236;
                                    if (y2 < f) {
                                        c141410.f40191 = -C14146.m32248((int) (f - y2));
                                        if (z2) {
                                            c141410.f40241 = SystemClock.uptimeMillis();
                                        }
                                        c141410.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c141410.f40218;
                                        if (y2 > f2) {
                                            c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                            if (z2) {
                                                c141410.f40241 = SystemClock.uptimeMillis();
                                            }
                                            c141410.postInvalidateOnAnimation();
                                        } else {
                                            c141410.f40191 = 0;
                                        }
                                    }
                                    fM26496 = c23929.m26496() / 2.0f;
                                    paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                    if (c141410.f40324) {
                                        if (y < fM26496) {
                                            y = fM26496;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c141410.m32489(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f56281;
                                    if (f3 >= fM26496) {
                                        if (f3 > paddingTop) {
                                            fM26496 = paddingTop;
                                        } else {
                                            fM26496 = f3;
                                        }
                                    }
                                    if (c141410.f40221) {
                                        c141410.m32560(x2 + this.f56282, fM26496);
                                        return true;
                                    }
                                    c141410.m32540(x2 + this.f56282, fM26496);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                y = motionEvent.getY() - c141410.getPaddingTop();
                                if (!this.f56263) {
                                    i = (int) (x2 - this.f56287);
                                    int i12 = (int) (y - this.f56288);
                                    if (Math.abs(i) <= this.f56267) {
                                    }
                                    this.f56263 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c141410.f40191 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c141410.f40236;
                                if (y2 < f) {
                                    c141410.f40191 = -C14146.m32248((int) (f - y2));
                                    if (z2) {
                                        c141410.f40241 = SystemClock.uptimeMillis();
                                    }
                                    c141410.postInvalidateOnAnimation();
                                } else {
                                    f2 = c141410.f40218;
                                    if (y2 > f2) {
                                        c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                        if (z2) {
                                            c141410.f40241 = SystemClock.uptimeMillis();
                                        }
                                        c141410.postInvalidateOnAnimation();
                                    } else {
                                        c141410.f40191 = 0;
                                    }
                                }
                                fM26496 = c23929.m26496() / 2.0f;
                                paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                if (c141410.f40324) {
                                    if (y < fM26496) {
                                        y = fM26496;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c141410.m32489(x2, y);
                                    return true;
                                }
                                f3 = y + this.f56281;
                                if (f3 >= fM26496) {
                                    if (f3 > paddingTop) {
                                        fM26496 = paddingTop;
                                    } else {
                                        fM26496 = f3;
                                    }
                                }
                                if (c141410.f40221) {
                                    c141410.m32560(x2 + this.f56282, fM26496);
                                    return true;
                                }
                                c141410.m32540(x2 + this.f56282, fM26496);
                                return true;
                            }
                            if (!c141410.f40221) {
                                x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                y = motionEvent.getY() - c141410.getPaddingTop();
                                if (!this.f56263) {
                                    i = (int) (x2 - this.f56287);
                                    int i13 = (int) (y - this.f56288);
                                    if (Math.abs(i) <= this.f56267) {
                                    }
                                    this.f56263 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c141410.f40191 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c141410.f40236;
                                if (y2 < f) {
                                    c141410.f40191 = -C14146.m32248((int) (f - y2));
                                    if (z2) {
                                        c141410.f40241 = SystemClock.uptimeMillis();
                                    }
                                    c141410.postInvalidateOnAnimation();
                                } else {
                                    f2 = c141410.f40218;
                                    if (y2 > f2) {
                                        c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                        if (z2) {
                                            c141410.f40241 = SystemClock.uptimeMillis();
                                        }
                                        c141410.postInvalidateOnAnimation();
                                    } else {
                                        c141410.f40191 = 0;
                                    }
                                }
                                fM26496 = c23929.m26496() / 2.0f;
                                paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                if (c141410.f40324) {
                                    if (y < fM26496) {
                                        y = fM26496;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c141410.m32489(x2, y);
                                    return true;
                                }
                                f3 = y + this.f56281;
                                if (f3 >= fM26496) {
                                    if (f3 > paddingTop) {
                                        fM26496 = paddingTop;
                                    } else {
                                        fM26496 = f3;
                                    }
                                }
                                if (c141410.f40221) {
                                    c141410.m32560(x2 + this.f56282, fM26496);
                                    return true;
                                }
                                c141410.m32540(x2 + this.f56282, fM26496);
                                return true;
                            }
                            x2 = motionEvent.getX() - c141410.getPaddingLeft();
                            y = motionEvent.getY() - c141410.getPaddingTop();
                            if (!this.f56263) {
                                i = (int) (x2 - this.f56287);
                                int i14 = (int) (y - this.f56288);
                                if (Math.abs(i) <= this.f56267) {
                                }
                                this.f56263 = true;
                            }
                            y2 = motionEvent.getY();
                            if (c141410.f40191 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c141410.f40236;
                            if (y2 < f) {
                                c141410.f40191 = -C14146.m32248((int) (f - y2));
                                if (z2) {
                                    c141410.f40241 = SystemClock.uptimeMillis();
                                }
                                c141410.postInvalidateOnAnimation();
                            } else {
                                f2 = c141410.f40218;
                                if (y2 > f2) {
                                    c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                    if (z2) {
                                        c141410.f40241 = SystemClock.uptimeMillis();
                                    }
                                    c141410.postInvalidateOnAnimation();
                                } else {
                                    c141410.f40191 = 0;
                                }
                            }
                            fM26496 = c23929.m26496() / 2.0f;
                            paddingTop = c141410.f40218 - c141410.getPaddingTop();
                            if (c141410.f40324) {
                                if (y < fM26496) {
                                    y = fM26496;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c141410.m32489(x2, y);
                                return true;
                            }
                            f3 = y + this.f56281;
                            if (f3 >= fM26496) {
                                if (f3 > paddingTop) {
                                    fM26496 = paddingTop;
                                } else {
                                    fM26496 = f3;
                                }
                            }
                            if (c141410.f40221) {
                                c141410.m32560(x2 + this.f56282, fM26496);
                                return true;
                            }
                            c141410.m32540(x2 + this.f56282, fM26496);
                            return true;
                        }
                        if (action != 3) {
                            c141410.setPressed(false);
                            m42910(false);
                            c141410.m32584();
                            if (this.f56284) {
                                m42911();
                                c14148 = c141410.f40298;
                                if (c14148 != null) {
                                    c14148.f40232.m42911();
                                    ((View) c141410.getParent()).invalidate();
                                    interfaceC32910 = c141410.f40271;
                                    if (interfaceC32910 != null) {
                                        C14146.m32199(c141410, new Runnable() { // from class: l.۟ۛᩳ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC18840 viewOnTouchListenerC18840 = this.f25264;
                                                final InterfaceC3299 interfaceC32911 = interfaceC32910;
                                                C14146.m32199(c14148, new Runnable() { // from class: l.ᩳۨᩳ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C14146 c141411 = viewOnTouchListenerC18840.f56283;
                                                        int scrollX = c141411.getScrollX();
                                                        int iM32472 = c141411.m32472();
                                                        interfaceC32911.mo5747(scrollX, iM32472 - 1, scrollX, iM32472);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c141410.f40312) {
                                }
                                C14146.m32290(c141410);
                                c141410.f40324 = false;
                                c141410.f40221 = false;
                                c141410.f40284 = false;
                                c141410.f40308 = false;
                                c141410.f40312 = false;
                                c141410.m32226();
                                return true;
                            }
                        } else if (action != 5) {
                            this.f56290++;
                            if (c141410.f40284) {
                                this.f56268 = motionEvent.getPointerId(1);
                                this.f56285 = motionEvent.getX(1);
                                this.f56266 = motionEvent.getY(1);
                                return true;
                            }
                            if (c23929.f75952) {
                                m42915(motionEvent);
                                c14149 = c141410.f40298;
                                if (c14149 != null) {
                                    c14149.f40232.m42915(motionEvent);
                                    ((View) c141410.getParent()).invalidate();
                                }
                            }
                        } else if (action == 6) {
                            int action4 = (motionEvent.getAction() & 65280) >>> 8;
                            if (c141410.f40284) {
                                c141410.f40284 = false;
                            }
                            this.f56290--;
                        }
                    }
                    return c141410.f40274.m5650(motionEvent);
                }
                viewTreeObserverOnPreDrawListenerC10518Arr = c24047M32607.f76377;
                if (!viewTreeObserverOnPreDrawListenerC10518Arr[0].m24254() && !viewTreeObserverOnPreDrawListenerC10518Arr[1].m24254() && !viewTreeObserverOnPreDrawListenerC10518Arr[2].m24254()) {
                    if (this.f56280) {
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 1) {
                            m42905();
                        } else if (actionMasked != 2) {
                            x3 = motionEvent.getX() - this.f56274;
                            float y6 = motionEvent.getY() - this.f56289;
                            if (Math.abs(x3) <= this.f56267 || Math.abs(y6) > this.f56267) {
                                this.f56280 = false;
                                this.f56273 = true;
                                if (!c141410.isFocused()) {
                                    c141410.requestFocus();
                                }
                                if (!this.f56262) {
                                    c141410.m32519(c141410.m32508(), this.f56277);
                                    c141410.m32291();
                                    this.f56262 = true;
                                }
                                c141410.f40236 = Math.min(c23929.m26496() + c141410.getPaddingTop(), this.f56289);
                                c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c23929.m26496(), this.f56289);
                                c141410.f40191 = 0;
                                c141410.f40280 = 0L;
                                c24047 = c141410.f40198;
                                if (c24047 != null) {
                                    c24047.m53294();
                                }
                                c141410.invalidate();
                                m42910(true);
                                this.f56269 = true;
                                c141410.f40274.m5650(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                m42907(motionEvent);
                                return true;
                            }
                        } else if (actionMasked == 3) {
                            m42905();
                        }
                    }
                    action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        c141410.setPressed(true);
                        c141410.m32507();
                        if (!c141410.isFocused()) {
                            c141410.invalidate();
                        }
                        this.f56264 = true;
                        if (c141410.mo27947()) {
                            m42910(true);
                        }
                        this.f56284 = false;
                        this.f56290 = 0;
                        this.f56287 = (c141410.getScrollX() + ((int) motionEvent.getX())) - c141410.getPaddingLeft();
                        this.f56288 = (c141410.m32472() + ((int) motionEvent.getY())) - c141410.getPaddingTop();
                        this.f56263 = false;
                        iM32508 = c141410.m32508();
                        iM32512 = c141410.m32512();
                        if (iM32508 > iM32512) {
                            iM32512 = iM32508;
                            iM32508 = iM32512;
                        }
                        fM11821 = c141410.f40275.m11821(motionEvent.getY());
                        abstractC5390 = c141410.f40275;
                        if (abstractC5390.f12829) {
                            c16428 = abstractC5390.f12799;
                            if (c16428.m37324(this.f56287, fM11821)) {
                                c141410.f40312 = true;
                                this.f56281 = c16428.f48280 - fM11821;
                                if (!c141410.f40302.isFinished()) {
                                    c141410.f40302.abortAnimation();
                                }
                                m42910(true);
                                c141410.invalidate();
                                return true;
                            }
                        }
                        abstractC5391 = c141410.f40275;
                        if (abstractC5391.f12828) {
                            c16427 = abstractC5391.f12797;
                            if (c16427.m37324(this.f56287, fM11821)) {
                                c141410.f40308 = true;
                                this.f56282 = c16427.f48277 - this.f56287;
                                if (!c141410.f40302.isFinished()) {
                                    c141410.f40302.abortAnimation();
                                }
                                m42910(true);
                                c141410.invalidate();
                                return true;
                            }
                        }
                        if (iM32508 == iM32512) {
                            rectF3 = c141410.f40275.f12804;
                            if (rectF3.contains(this.f56287, fM11821)) {
                                c141410.f40221 = true;
                                this.f56282 = ((rectF3.left + rectF3.right) / 2.0f) - this.f56287;
                                this.f56281 = (rectF3.top - fM11821) - (c23929.m26496() / 2.0f);
                                c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                c141410.f40191 = 0;
                                m42910(true);
                                return true;
                            }
                        } else {
                            rectF = c141410.f40275.f12832;
                            if (rectF.contains(this.f56287, fM11821)) {
                                rectF2 = c141410.f40275.f12810;
                                if (rectF2.contains(this.f56287, fM11821)) {
                                    c141410.f40284 = true;
                                    c141410.f40330 = iM32508;
                                    float f10 = rectF2.left;
                                    this.f56282 = (((rectF2.right - f10) / 4.0f) + f10) - this.f56287;
                                    this.f56281 = (rectF2.top - fM11821) - (c23929.m26496() / 2.0f);
                                    c141410.f40325 = false;
                                    c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                    c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                    c141410.f40191 = 0;
                                    m42910(true);
                                    return true;
                                }
                            } else {
                                c141410.f40284 = true;
                                c141410.f40330 = iM32512;
                                float f11 = rectF.left;
                                this.f56282 = ((((rectF.right - f11) * 3.0f) / 4.0f) + f11) - this.f56287;
                                this.f56281 = (rectF.top - fM11821) - (c23929.m26496() / 2.0f);
                                c141410.f40325 = true;
                                c141410.f40236 = Math.min(c23929.m26496() + (c141410.m32523() / 2.0f) + c141410.getPaddingTop(), motionEvent.getY());
                                c141410.f40218 = Math.max((c141410.getHeight() - c141410.getPaddingBottom()) - c141410.m32523(), motionEvent.getY());
                                c141410.f40191 = 0;
                                m42910(true);
                                return true;
                            }
                        }
                        if (c23929.f76010 && C14146.m32278(motionEvent) && (motionEvent.getButtonState() & 1) != 0 && !c141410.f40275.mo11814()) {
                            x = motionEvent.getX();
                            if (c141410.m32321(x, motionEvent.getY())) {
                                z = false;
                            } else {
                                z = !c141410.m32328((x + c141410.getScrollX()) - c141410.getPaddingLeft());
                            }
                            if (z) {
                                this.f56280 = true;
                                this.f56273 = false;
                                this.f56262 = false;
                                this.f56277 = c141410.f40275.m11804(this.f56287, this.f56288);
                                this.f56274 = motionEvent.getX();
                                this.f56289 = motionEvent.getY();
                            }
                        }
                    } else if (action != 1) {
                        c141410.setPressed(false);
                        m42910(false);
                        c141410.m32584();
                        if (this.f56284) {
                            m42911();
                            c14146 = c141410.f40298;
                            if (c14146 != null) {
                                c14146.f40232.m42911();
                                ((View) c141410.getParent()).invalidate();
                                interfaceC3299 = c141410.f40271;
                                if (interfaceC3299 != null) {
                                    C14146.m32199(c141410, new Runnable() { // from class: l.֫ۨᩳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC18840 viewOnTouchListenerC18840 = this.f9015;
                                            final InterfaceC3299 interfaceC32911 = interfaceC3299;
                                            C14146.m32199(c14146, new Runnable() { // from class: l.ܽۨᩳ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C14146 c141411 = viewOnTouchListenerC18840.f56283;
                                                    int scrollX = c141411.getScrollX();
                                                    int iM32472 = c141411.m32472();
                                                    interfaceC32911.mo5747(scrollX, iM32472 - 1, scrollX, iM32472);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c141410.f40221 || c141410.f40284 || c141410.f40324) {
                                c141410.m32226();
                                if (c141410.f40221) {
                                    c141410.m32363(-1);
                                } else if (!c141410.f40284 || c141410.f40324) {
                                    iM32509 = c141410.m32508();
                                    iM32513 = c141410.m32512();
                                    if (iM32509 > iM32513) {
                                        iM32513 = iM32509;
                                        iM32509 = iM32513;
                                    }
                                    if (!c141410.f40325) {
                                        iM32509 = iM32513;
                                    }
                                    c141410.m32363(iM32509);
                                }
                                c141410.f40324 = false;
                                c141410.f40221 = false;
                                c141410.f40284 = false;
                                c141410.f40280 = SystemClock.uptimeMillis();
                                return true;
                            }
                            if (c141410.f40312) {
                                C14146.m32290(c141410);
                                c141410.m32517();
                                if (C14146.m32278(motionEvent)) {
                                    C14146.m32196(c141410, 1, motionEvent);
                                    return true;
                                }
                            } else if (c141410.f40308) {
                                c141410.f40308 = false;
                                c141410.m32506();
                                if (C14146.m32278(motionEvent)) {
                                    C14146.m32196(c141410, 2, motionEvent);
                                }
                            } else {
                                c141410.f40280 = SystemClock.uptimeMillis();
                                c141410.invalidate();
                                C14146.m32352(c141410);
                            }
                        }
                    } else if (action != 2) {
                        m42914(motionEvent);
                        if (this.f56290 != 1) {
                            if (c141410.f40284) {
                                c141410.f40232.onScroll(null, null, (this.f56285 - motionEvent.getX(1)) - c141410.getPaddingLeft(), (this.f56266 - motionEvent.getY(1)) - c141410.getPaddingTop());
                                this.f56285 = motionEvent.getX(1);
                                this.f56266 = motionEvent.getY(1);
                            } else if (this.f56284) {
                                m42912(motionEvent);
                                c14147 = c141410.f40298;
                                if (c14147 != null) {
                                    c14147.f40232.m42912(motionEvent);
                                    ((View) c141410.getParent()).invalidate();
                                    return true;
                                }
                            }
                            if (!c141410.f40221) {
                                x2 = motionEvent.getX() - c141410.getPaddingLeft();
                                y = motionEvent.getY() - c141410.getPaddingTop();
                                if (!this.f56263) {
                                    i = (int) (x2 - this.f56287);
                                    int i15 = (int) (y - this.f56288);
                                    if (Math.abs(i) <= this.f56267) {
                                    }
                                    this.f56263 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c141410.f40191 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c141410.f40236;
                                if (y2 < f) {
                                    c141410.f40191 = -C14146.m32248((int) (f - y2));
                                    if (z2) {
                                        c141410.f40241 = SystemClock.uptimeMillis();
                                    }
                                    c141410.postInvalidateOnAnimation();
                                } else {
                                    f2 = c141410.f40218;
                                    if (y2 > f2) {
                                        c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                        if (z2) {
                                            c141410.f40241 = SystemClock.uptimeMillis();
                                        }
                                        c141410.postInvalidateOnAnimation();
                                    } else {
                                        c141410.f40191 = 0;
                                    }
                                }
                                fM26496 = c23929.m26496() / 2.0f;
                                paddingTop = c141410.f40218 - c141410.getPaddingTop();
                                if (c141410.f40324) {
                                    if (y < fM26496) {
                                        y = fM26496;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c141410.m32489(x2, y);
                                    return true;
                                }
                                f3 = y + this.f56281;
                                if (f3 >= fM26496) {
                                    if (f3 > paddingTop) {
                                        fM26496 = paddingTop;
                                    } else {
                                        fM26496 = f3;
                                    }
                                }
                                if (c141410.f40221) {
                                    c141410.m32560(x2 + this.f56282, fM26496);
                                    return true;
                                }
                                c141410.m32540(x2 + this.f56282, fM26496);
                                return true;
                            }
                            x2 = motionEvent.getX() - c141410.getPaddingLeft();
                            y = motionEvent.getY() - c141410.getPaddingTop();
                            if (!this.f56263) {
                                i = (int) (x2 - this.f56287);
                                int i16 = (int) (y - this.f56288);
                                if (Math.abs(i) <= this.f56267) {
                                }
                                this.f56263 = true;
                            }
                            y2 = motionEvent.getY();
                            if (c141410.f40191 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c141410.f40236;
                            if (y2 < f) {
                                c141410.f40191 = -C14146.m32248((int) (f - y2));
                                if (z2) {
                                    c141410.f40241 = SystemClock.uptimeMillis();
                                }
                                c141410.postInvalidateOnAnimation();
                            } else {
                                f2 = c141410.f40218;
                                if (y2 > f2) {
                                    c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                    if (z2) {
                                        c141410.f40241 = SystemClock.uptimeMillis();
                                    }
                                    c141410.postInvalidateOnAnimation();
                                } else {
                                    c141410.f40191 = 0;
                                }
                            }
                            fM26496 = c23929.m26496() / 2.0f;
                            paddingTop = c141410.f40218 - c141410.getPaddingTop();
                            if (c141410.f40324) {
                                if (y < fM26496) {
                                    y = fM26496;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c141410.m32489(x2, y);
                                return true;
                            }
                            f3 = y + this.f56281;
                            if (f3 >= fM26496) {
                                if (f3 > paddingTop) {
                                    fM26496 = paddingTop;
                                } else {
                                    fM26496 = f3;
                                }
                            }
                            if (c141410.f40221) {
                                c141410.m32560(x2 + this.f56282, fM26496);
                                return true;
                            }
                            c141410.m32540(x2 + this.f56282, fM26496);
                            return true;
                        }
                        if (!c141410.f40221 || c141410.f40284 || c141410.f40324) {
                            x2 = motionEvent.getX() - c141410.getPaddingLeft();
                            y = motionEvent.getY() - c141410.getPaddingTop();
                            if (!this.f56263) {
                                i = (int) (x2 - this.f56287);
                                int i17 = (int) (y - this.f56288);
                                if (Math.abs(i) <= this.f56267 || Math.abs(i17) > this.f56267) {
                                    this.f56263 = true;
                                }
                            }
                            y2 = motionEvent.getY();
                            if (c141410.f40191 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c141410.f40236;
                            if (y2 < f) {
                                c141410.f40191 = -C14146.m32248((int) (f - y2));
                                if (z2) {
                                    c141410.f40241 = SystemClock.uptimeMillis();
                                }
                                c141410.postInvalidateOnAnimation();
                            } else {
                                f2 = c141410.f40218;
                                if (y2 > f2) {
                                    c141410.f40191 = C14146.m32248((int) (y2 - f2));
                                    if (z2) {
                                        c141410.f40241 = SystemClock.uptimeMillis();
                                    }
                                    c141410.postInvalidateOnAnimation();
                                } else {
                                    c141410.f40191 = 0;
                                }
                            }
                            fM26496 = c23929.m26496() / 2.0f;
                            paddingTop = c141410.f40218 - c141410.getPaddingTop();
                            if (c141410.f40324) {
                                if (y < fM26496) {
                                    y = fM26496;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c141410.m32489(x2, y);
                                return true;
                            }
                            f3 = y + this.f56281;
                            if (f3 >= fM26496) {
                                if (f3 > paddingTop) {
                                    fM26496 = paddingTop;
                                } else {
                                    fM26496 = f3;
                                }
                            }
                            if (c141410.f40221) {
                                c141410.m32560(x2 + this.f56282, fM26496);
                                return true;
                            }
                            c141410.m32540(x2 + this.f56282, fM26496);
                            return true;
                        }
                        float f12 = 1.0f;
                        if (c141410.f40312) {
                            float y7 = ((motionEvent.getY() - c141410.getPaddingTop()) + this.f56281) / (c141410.m32606() - c23929.f76013);
                            if (y7 < 0.0f) {
                                f12 = 0.0f;
                            } else if (y7 <= 1.0f) {
                                f12 = y7;
                            }
                            int iM32592 = (int) (c141410.m32592() * f12);
                            if (iM32592 != c141410.m32472()) {
                                c141410.scrollTo(c141410.getScrollX(), iM32592);
                                c141410.f40210 = SystemClock.uptimeMillis();
                                c141410.f40224.removeMessages(6);
                                c141410.f40224.sendEmptyMessageDelayed(6, 100L);
                                return true;
                            }
                        } else if (c141410.f40308) {
                            int i18 = (c23929.f75988 && c23929.f75989) ? c141410.f40275.f12800 : 0;
                            if (i18 != 0 && c23929.f76016) {
                                i2 = i18;
                            }
                            float x5 = (((motionEvent.getX() - i2) - c141410.getPaddingLeft()) + this.f56282) / ((c141410.m32458() - i18) - c23929.f76013);
                            if (x5 < 0.0f) {
                                f12 = 0.0f;
                            } else if (x5 <= 1.0f) {
                                f12 = x5;
                            }
                            int iM32527 = (int) (c141410.m32527() * f12);
                            if (iM32527 != c141410.getScrollX()) {
                                c141410.scrollTo(iM32527, c141410.m32472());
                                return true;
                            }
                        }
                    } else if (action != 3) {
                        c141410.setPressed(false);
                        m42910(false);
                        c141410.m32584();
                        if (this.f56284) {
                            m42911();
                            c14148 = c141410.f40298;
                            if (c14148 != null) {
                                c14148.f40232.m42911();
                                ((View) c141410.getParent()).invalidate();
                                interfaceC32910 = c141410.f40271;
                                if (interfaceC32910 != null) {
                                    C14146.m32199(c141410, new Runnable() { // from class: l.۟ۛᩳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC18840 viewOnTouchListenerC18840 = this.f25264;
                                            final InterfaceC3299 interfaceC32911 = interfaceC32910;
                                            C14146.m32199(c14148, new Runnable() { // from class: l.ᩳۨᩳ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C14146 c141411 = viewOnTouchListenerC18840.f56283;
                                                    int scrollX = c141411.getScrollX();
                                                    int iM32472 = c141411.m32472();
                                                    interfaceC32911.mo5747(scrollX, iM32472 - 1, scrollX, iM32472);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c141410.f40312 || c141410.f40308 || c141410.f40284 || c141410.f40221 || c141410.f40324) {
                                C14146.m32290(c141410);
                                c141410.f40324 = false;
                                c141410.f40221 = false;
                                c141410.f40284 = false;
                                c141410.f40308 = false;
                                c141410.f40312 = false;
                                c141410.m32226();
                                return true;
                            }
                            C14146.m32352(c141410);
                        }
                    } else if (action != 5) {
                        this.f56290++;
                        if (c141410.f40284) {
                            this.f56268 = motionEvent.getPointerId(1);
                            this.f56285 = motionEvent.getX(1);
                            this.f56266 = motionEvent.getY(1);
                            return true;
                        }
                        if (c23929.f75952 && !this.f56284) {
                            m42915(motionEvent);
                            c14149 = c141410.f40298;
                            if (c14149 != null) {
                                c14149.f40232.m42915(motionEvent);
                                ((View) c141410.getParent()).invalidate();
                            }
                        }
                    } else if (action == 6) {
                        int action5 = (motionEvent.getAction() & 65280) >>> 8;
                        if (c141410.f40284 && action5 != this.f56268) {
                            c141410.f40284 = false;
                        }
                        this.f56290--;
                    }
                    return c141410.f40274.m5650(motionEvent);
                }
            }
        } else {
            try {
                c141410.f40245.m13888(motionEvent);
                if (actionMasked3 == i || actionMasked3 == i) {
                    return true;
                }
            } finally {
                if (actionMasked3 == 1 || actionMasked3 == 3) {
                    c141410.f40245 = null;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m42915(MotionEvent motionEvent) {
        this.f56278 = m42913(motionEvent);
        this.f56284 = true;
        this.f56263 = false;
        C14146 c14146 = this.f56283;
        this.f56265 = c14146.f40262.f32005.getTextSize();
        this.f56271 = c14146.getScrollX();
        this.f56270 = c14146.m32472();
        if (c14146.f40312 || c14146.f40308 || c14146.f40221 || c14146.f40324) {
            c14146.m32226();
            C14146.m32290(c14146);
            c14146.f40324 = false;
            c14146.f40221 = false;
            c14146.f40308 = false;
            c14146.f40312 = false;
            return;
        }
        c14146.f40274.m5650(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX INFO: renamed from: ۧ */
    private void m42912(MotionEvent motionEvent) {
        float f;
        C14146 c14146 = this.f56283;
        C23929 c23929 = c14146.f40262;
        float fM42913 = m42913(motionEvent);
        if (!this.f56263) {
            if (Math.abs(fM42913 - this.f56278) <= this.f56267) {
                return;
            } else {
                this.f56263 = true;
            }
        }
        float f2 = fM42913 / this.f56278;
        float textSize = c23929.f32005.getTextSize();
        if (c23929.m53015(this.f56265 * f2)) {
            float textSize2 = c23929.f32005.getTextSize() / this.f56265;
            c14146.f40275.mo10187(textSize);
            float fM32592 = 0.0f;
            if (c14146.f40275.mo10193()) {
                float x = ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f) - c14146.getPaddingLeft();
                f = ((this.f56271 + x) * textSize2) - x;
                if (f < 0.0f) {
                    f = 0.0f;
                } else {
                    float fM32527 = c14146.m32527();
                    if (f > fM32527) {
                        f = fM32527;
                    }
                }
            } else {
                f = 0.0f;
            }
            float y = ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f) - c14146.getPaddingTop();
            float f3 = ((this.f56270 + y) * textSize2) - y;
            if (f3 >= 0.0f) {
                fM32592 = c14146.m32592();
                if (f3 <= fM32592) {
                    fM32592 = f3;
                }
            }
            c14146.m32456((int) f, (int) fM32592);
            c14146.invalidate();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m42911() {
        if (this.f56263) {
            C14146 c14146 = this.f56283;
            c14146.m32440();
            c14146.f40275.mo10206();
            c14146.m32353();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static float m42913(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }
}
