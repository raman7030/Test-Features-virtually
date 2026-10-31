package l;

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
public final class ViewOnTouchListenerC17331 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f53080;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f53081;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f53082;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public float f53083;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f53084;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f53085;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f53087;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f53088;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f53089;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f53090;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f53091;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f53092;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f53094;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public float f53096;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f53097;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f53098;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f53099;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f53100;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f53101;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f53102;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f53103;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53105;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f53106;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f53107;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f53108;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f53104 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ResultReceiverC3986 f53093 = new ResultReceiverC3986();

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f53086 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53095 = -1;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public ViewOnTouchListenerC17331(C12392 c12392, Context context) {
        this.f53101 = c12392;
        this.f53097 = c12392.f37258.m9796();
        this.f53085 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        m40654();
        C12392 c12392 = this.f53101;
        int iM30444 = c12392.m30444();
        if (iM30444 == c12392.m30448()) {
            c12392.m30498(iM30444, true);
            c12392.m30345(true);
            c12392.m30299(-1);
        }
        c12392.f37263 = SystemClock.uptimeMillis();
        c12392.m30400();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C12392 c12392 = this.f53101;
        this.f53094 = c12392.isFocused();
        if (c12392.f37285.isFinished()) {
            return false;
        }
        c12392.f37285.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f);
        C12392 c12392 = this.f53101;
        if (fAbs > fAbs2) {
            f = 0.0f;
        } else {
            if (!c12392.f37258.mo8160()) {
                return false;
            }
            f2 = 0.0f;
        }
        int iM30463 = c12392.m30463();
        int iM30528 = c12392.m30528();
        c12392.f37321 = true;
        c12392.f37285.fling(c12392.getScrollX(), c12392.m30408(), (int) (-f), (int) (-f2), 0, iM30463, 0, iM30528);
        if (f2 != 0.0f) {
            c12392.m30453();
            return true;
        }
        if (f != 0.0f) {
            c12392.m30442();
            return true;
        }
        c12392.postInvalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C12392 c12392 = this.f53101;
        C22686 c22686 = c12392.f37245;
        if (c12392.m30519()) {
            return;
        }
        m40654();
        c12392.performHapticFeedback(0);
        if (!c12392.isFocused()) {
            c12392.requestFocus();
        }
        float x = (motionEvent.getX() + c12392.getScrollX()) - c12392.getPaddingLeft();
        float y = (motionEvent.getY() + c12392.m30408()) - c12392.getPaddingTop();
        int iM30444 = c12392.m30444();
        int iM30448 = c12392.m30448();
        if (iM30444 > iM30448) {
            iM30448 = iM30444;
            iM30444 = iM30448;
        }
        if (c22686.f73263 && c12392.m30264(x)) {
            int iM9759 = c12392.f37258.m9759(y);
            C20736 c20736 = c12392.f37258.f9998;
            int i = c20736.get(c20736.m47366(iM9759)).f35062;
            C20736 c20737 = c12392.f37258.f9998;
            int i2 = c20737.get(c20737.m47365(iM9759)).f35063;
            BaseInputConnection.removeComposingSpans(c12392.f37322);
            if (iM30444 == iM30448) {
                c12392.f37322.setSelection(i, i2);
                c12392.f37298 = i;
                c12392.f37312 = i2;
            } else {
                if (c12392.f37298 == -1) {
                    c12392.f37298 = iM30444;
                    c12392.f37312 = iM30448;
                }
                if (i < c12392.f37298) {
                    iM30444 = i;
                }
                if (i2 >= c12392.f37312) {
                    iM30448 = i2;
                }
                c12392.f37322.setSelection(iM30444, iM30448);
            }
            c12392.m30520();
            c12392.invalidate();
            return;
        }
        int iM9760 = c12392.f37258.m9760(x, y);
        if (!c12392.mo25914()) {
            if (iM30444 == iM30448 || iM30444 > iM9760 || iM9760 > iM30448) {
                c12392.m30498(iM9760, false);
                c12392.m30345(true);
            }
            c12392.m30299(-1);
            c12392.f37263 = SystemClock.uptimeMillis();
            c12392.m30400();
        } else if (iM30444 != iM30448 && iM30444 <= iM9760 && iM9760 <= iM30448) {
            c12392.m30299(-1);
            c12392.f37263 = SystemClock.uptimeMillis();
            c12392.m30400();
        } else {
            int[] iArrM30480 = c12392.m30480(iM9760, false);
            c12392.f37307 = true;
            c12392.f37266 = iM9760;
            c12392.m30455(c12392.m30444(), iArrM30480[0]);
            c12392.mo25922(iArrM30480[0], iArrM30480[1]);
            c12392.f37313 = iArrM30480[0];
            c12392.f37263 = 0L;
            c12392.f37219 = Math.min(c22686.m24484() + (c12392.m30459() / 2.0f) + c12392.getPaddingTop(), motionEvent.getY());
            c12392.f37201 = Math.max((c12392.getHeight() - c12392.getPaddingBottom()) - c12392.m30459(), motionEvent.getY());
            c12392.f37174 = 0;
            c12392.invalidate();
            c12392.m30345(true);
            c12392.m30200((int) motionEvent.getX(), (int) motionEvent.getY(), c22686.f73274);
        }
        c12392.invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40659(boolean z) {
        if (this.f53104 != z) {
            this.f53101.getParent().requestDisallowInterceptTouchEvent(z);
            this.f53104 = z;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C12392 c12392 = this.f53101;
        C22686 c22686 = c12392.f37245;
        if (!c12392.isFocused()) {
            c12392.requestFocus();
        }
        if (c12392.f37258.mo8160() && Math.abs(f) > Math.abs(f2)) {
            int scrollX = c12392.getScrollX() + ((int) f);
            if (scrollX < 0) {
                if (motionEvent2 != null && c22686.f73284) {
                    C23379.m51831(c12392.f37216, (-f) / c12392.getWidth(), 1.0f - (motionEvent2.getY() / c12392.getHeight()));
                    c12392.postInvalidateOnAnimation();
                    if (!c12392.f37275.isFinished()) {
                        c12392.f37275.onRelease();
                    }
                }
                scrollX = 0;
            } else {
                int iM30463 = c12392.m30463();
                if (scrollX > iM30463) {
                    if (motionEvent2 != null && c22686.f73284) {
                        C23379.m51831(c12392.f37275, f / c12392.getWidth(), motionEvent2.getY() / c12392.getHeight());
                        c12392.postInvalidateOnAnimation();
                        if (!c12392.f37216.isFinished()) {
                            c12392.f37216.onRelease();
                        }
                    }
                    scrollX = iM30463;
                }
            }
            c12392.scrollTo(scrollX, c12392.m30408());
            c12392.m30442();
        } else {
            int iM30408 = c12392.m30408() + ((int) f2);
            if (iM30408 < 0) {
                if (this.f53082) {
                    m40659(false);
                }
                if (motionEvent2 != null && c22686.f73284) {
                    C23379.m51831(c12392.f37303, (-f2) / c12392.getHeight(), motionEvent2.getX() / c12392.getWidth());
                    c12392.postInvalidateOnAnimation();
                    if (!c12392.f37189.isFinished()) {
                        c12392.f37189.onRelease();
                    }
                }
                iM30408 = 0;
            } else {
                int iM30528 = c12392.m30528();
                if (iM30408 > iM30528) {
                    if (this.f53082) {
                        m40659(false);
                    }
                    if (motionEvent2 != null && c22686.f73284) {
                        C23379.m51831(c12392.f37189, f2 / c12392.getHeight(), 1.0f - (motionEvent2.getX() / c12392.getWidth()));
                        c12392.postInvalidateOnAnimation();
                        if (!c12392.f37303.isFinished()) {
                            c12392.f37303.onRelease();
                        }
                    }
                    iM30408 = iM30528;
                }
            }
            c12392.scrollTo(c12392.getScrollX(), iM30408);
            c12392.m30453();
        }
        if (!this.f53082) {
            return true;
        }
        this.f53082 = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        final C12392 c12392 = this.f53101;
        int scrollX = c12392.getScrollX();
        C22686 c22686 = c12392.f37245;
        int iM9760 = c12392.f37258.m9760((x + scrollX) - c12392.getPaddingLeft(), (motionEvent.getY() + c12392.m30408()) - c12392.getPaddingTop());
        int iM30444 = c12392.m30444();
        int iM30448 = c12392.m30448();
        if (iM30444 > iM30448) {
            iM30448 = iM30444;
            iM30444 = iM30448;
        }
        boolean zMo9770 = c12392.f37258.mo9770();
        ResultReceiverC3986 resultReceiverC3986 = this.f53093;
        if (zMo9770 || c22686.f73272 || !c12392.isFocused()) {
            z = false;
        } else {
            resultReceiverC3986.m12027();
            c12392.f37274.showSoftInput(c12392, 0, resultReceiverC3986);
            z = true;
        }
        if (c12392.f37258.f10002) {
            if (z && iM30444 != iM30448 && iM30444 <= iM9760 && iM9760 <= iM30448 && resultReceiverC3986.m12026() == 2) {
                c12392.postDelayed(new Runnable() { // from class: l.ۧۨᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        c12392.m30299(-1);
                    }
                }, 100L);
            } else if (iM30444 == iM30448 && iM30444 == iM9760) {
                if (!c12392.f37258.mo9770() && !c22686.f73272) {
                    if (this.f53094 && SystemClock.uptimeMillis() - this.f53090 > 4500) {
                        if (this.f53097 == c12392.f37258.m9796()) {
                            c12392.m30299(-1);
                            this.f53090 = SystemClock.uptimeMillis();
                        }
                    } else {
                        this.f53090 = 0L;
                    }
                }
            } else {
                c12392.m30455(c12392.m30444(), iM9760);
                c12392.f37322.setSelection(iM9760);
                c12392.m30227();
                this.f53090 = 0L;
            }
            if (!c12392.f37258.mo9770() && !c22686.f73272) {
                c12392.m30345(false);
            }
        } else if (iM30444 == iM30448 && iM9760 == iM30444) {
            if (this.f53094 && SystemClock.uptimeMillis() - this.f53090 > 4500) {
                if (this.f53097 == c12392.f37258.m9796()) {
                    c12392.m30299(-1);
                    this.f53090 = SystemClock.uptimeMillis();
                }
            } else {
                this.f53090 = 0L;
            }
        } else if (iM30444 > iM9760 || iM9760 > iM30448 || !c22686.f73256) {
            c12392.m30455(c12392.m30444(), iM9760);
            c12392.f37322.setSelection(iM9760);
            c12392.m30227();
            this.f53090 = 0L;
            if (!c12392.f37258.mo9770() && !c22686.f73272) {
                c12392.m30349(iM9760, false);
            }
        } else if (!z || resultReceiverC3986.m12026() != 2) {
            c12392.m30299(-1);
        } else {
            c12392.postDelayed(new Runnable() { // from class: l.ۧۨᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    c12392.m30299(-1);
                }
            }, 100L);
        }
        this.f53097 = c12392.f37258.m9796();
        c12392.f37263 = SystemClock.uptimeMillis();
        c12392.m30400();
        c12392.invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40654() {
        boolean z = this.f53087;
        this.f53098 = false;
        this.f53091 = false;
        this.f53080 = false;
        this.f53087 = false;
        this.f53095 = -1;
        this.f53092 = 0.0f;
        this.f53107 = 0.0f;
        this.f53101.f37174 = 0;
        if (z) {
            m40659(false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40656(MotionEvent motionEvent) {
        m40663(motionEvent);
        float y = motionEvent.getY();
        C12392 c12392 = this.f53101;
        boolean z = c12392.f37174 == 0;
        float f = c12392.f37219;
        if (y < f) {
            c12392.f37174 = -C12392.m30184((int) (f - y));
            if (z) {
                c12392.f37224 = SystemClock.uptimeMillis();
            }
            c12392.postInvalidateOnAnimation();
        } else {
            float f2 = c12392.f37201;
            if (y > f2) {
                c12392.f37174 = C12392.m30184((int) (y - f2));
                if (z) {
                    c12392.f37224 = SystemClock.uptimeMillis();
                }
                c12392.postInvalidateOnAnimation();
            } else {
                c12392.f37174 = 0;
            }
        }
        float x = motionEvent.getX() - c12392.getPaddingLeft();
        float y2 = motionEvent.getY() - c12392.getPaddingTop();
        c12392.f37289 = x;
        c12392.f37293 = y2;
        m40655(x, y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40655(float f, float f2) {
        C12392 c12392 = this.f53101;
        int iM9760 = c12392.f37258.m9760(c12392.getScrollX() + f, c12392.m30408() + f2);
        if (c12392.m30444() == this.f53095 && c12392.m30448() == iM9760) {
            return;
        }
        c12392.f37322.setSelection(this.f53095, iM9760);
        c12392.m30238(iM9760);
        c12392.invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40657(ViewOnTouchListenerC17331 viewOnTouchListenerC17331) {
        C12392 c12392 = viewOnTouchListenerC17331.f53101;
        c12392.setPressed(false);
        c12392.m30520();
        viewOnTouchListenerC17331.m40654();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m40663(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C12392 c12392 = this.f53101;
        boolean z = x >= 0.0f && x <= ((float) c12392.getWidth()) && y >= 0.0f && y <= ((float) c12392.getHeight());
        if (z != c12392.isPressed()) {
            c12392.setPressed(z);
            c12392.invalidate();
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
        C22810 c22810M30543;
        int action;
        int iM30444;
        int iM30448;
        float fM9777;
        AbstractC3179 abstractC3179;
        AbstractC3179 abstractC31710;
        RectF rectF;
        RectF rectF2;
        float x;
        boolean z;
        RectF rectF3;
        C14792 c14792;
        C14792 c14793;
        int iM30445;
        int iM30449;
        final C12392 c12392;
        final InterfaceC0979 interfaceC0979;
        float x2;
        float y;
        float y2;
        boolean z2;
        float f;
        float f2;
        float fM24484;
        float paddingTop;
        float f3;
        int i;
        C12392 c12393;
        final C12392 c12394;
        final InterfaceC0979 interfaceC09710;
        C12392 c12395;
        int actionMasked;
        float x3;
        C22810 c22810;
        ViewTreeObserverOnPreDrawListenerC8575[] viewTreeObserverOnPreDrawListenerC8575Arr;
        int actionMasked2;
        C12392 c12396 = this.f53101;
        C22686 c22686 = c12396.f37245;
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 0) {
            c12396.m30191();
            c12396.f37228 = null;
        }
        if (c12396.f37228 == null && c12396.m30519()) {
            c12396.f37228 = c12396.f37302;
        }
        if (c12396.f37228 == null) {
            int actionMasked4 = motionEvent.getActionMasked();
            if (actionMasked4 == 0) {
                c12396.m30194();
                if (!C12392.m30214(motionEvent) || (motionEvent.getButtonState() & 1) == 0) {
                    C12392.m30239(c12396);
                } else {
                    float x4 = (motionEvent.getX() + c12396.getScrollX()) - c12396.getPaddingLeft();
                    float fM9778 = c12396.f37258.m9777(motionEvent.getY());
                    AbstractC3179 abstractC31711 = c12396.f37258;
                    if (!abstractC31711.f10029 || !abstractC31711.f9999.m35177(x4, fM9778)) {
                        AbstractC3179 abstractC31712 = c12396.f37258;
                        if (!abstractC31712.f10028 || !abstractC31712.f9997.m35177(x4, fM9778)) {
                            C12392.m30239(c12396);
                        }
                    }
                }
            } else if (actionMasked4 == 3) {
                c12396.m30278();
            }
            if (!c12396.isFocused() && motionEvent.getActionMasked() == 1 && c12396.isPressed()) {
                c12396.requestFocus();
            }
            int i2 = 0;
            if (C12392.m30214(motionEvent)) {
                int actionMasked5 = motionEvent.getActionMasked();
                if (c12396.f37203) {
                    c12396.f37176 = true;
                    if (actionMasked5 == 0) {
                        c12396.setPressed(true);
                        return true;
                    }
                    if (actionMasked5 == 1 || actionMasked5 == 3) {
                        c12396.setPressed(false);
                        m40659(false);
                        c12396.m30520();
                        C12392.m30285(c12396);
                        return true;
                    }
                } else {
                    if (actionMasked5 == 0 && (motionEvent.getButtonState() & 2) != 0) {
                        C12392.m30251(c12396);
                        c12396.f37176 = true;
                        c12396.setPressed(true);
                        c12396.m30246(motionEvent);
                        return true;
                    }
                    if (this.f53091) {
                        actionMasked2 = motionEvent.getActionMasked();
                        if (actionMasked2 != 1) {
                            c12396.setPressed(false);
                            c12396.m30520();
                            m40654();
                            return true;
                        }
                        if (actionMasked2 != 2) {
                            m40656(motionEvent);
                            return true;
                        }
                        if (actionMasked2 == 3) {
                            c12396.setPressed(false);
                            c12396.m30520();
                            m40654();
                            return true;
                        }
                    }
                    c22810M30543 = c12396.m30543();
                    if (c22810M30543 != null) {
                        if (this.f53098) {
                            actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 1) {
                                m40654();
                            } else {
                                if (actionMasked != 2) {
                                    x3 = motionEvent.getX() - this.f53092;
                                    float y3 = motionEvent.getY() - this.f53107;
                                    if (Math.abs(x3) <= this.f53085) {
                                    }
                                    this.f53098 = false;
                                    this.f53091 = true;
                                    if (!c12396.isFocused()) {
                                        c12396.requestFocus();
                                    }
                                    if (!this.f53080) {
                                        c12396.m30455(c12396.m30444(), this.f53095);
                                        c12396.m30227();
                                        this.f53080 = true;
                                    }
                                    c12396.f37219 = Math.min(c22686.m24484() + c12396.getPaddingTop(), this.f53107);
                                    c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c22686.m24484(), this.f53107);
                                    c12396.f37174 = 0;
                                    c12396.f37263 = 0L;
                                    c22810 = c12396.f37181;
                                    if (c22810 != null) {
                                        c22810.m50904();
                                    }
                                    c12396.invalidate();
                                    m40659(true);
                                    this.f53087 = true;
                                    c12396.f37257.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    m40656(motionEvent);
                                    return true;
                                }
                                if (actionMasked == 3) {
                                    m40654();
                                }
                            }
                        }
                        action = motionEvent.getAction() & 255;
                        if (action != 0) {
                            c12396.setPressed(true);
                            c12396.m30443();
                            if (!c12396.isFocused()) {
                                c12396.invalidate();
                            }
                            this.f53082 = true;
                            if (c12396.mo25925()) {
                                m40659(true);
                            }
                            this.f53102 = false;
                            this.f53108 = 0;
                            this.f53105 = (c12396.getScrollX() + ((int) motionEvent.getX())) - c12396.getPaddingLeft();
                            this.f53106 = (c12396.m30408() + ((int) motionEvent.getY())) - c12396.getPaddingTop();
                            this.f53081 = false;
                            iM30444 = c12396.m30444();
                            iM30448 = c12396.m30448();
                            if (iM30444 > iM30448) {
                                iM30448 = iM30444;
                                iM30444 = iM30448;
                            }
                            fM9777 = c12396.f37258.m9777(motionEvent.getY());
                            abstractC3179 = c12396.f37258;
                            if (abstractC3179.f10029) {
                                c14793 = abstractC3179.f9999;
                                if (c14793.m35177(this.f53105, fM9777)) {
                                    c12396.f37295 = true;
                                    this.f53099 = c14793.f45166 - fM9777;
                                    if (!c12396.f37285.isFinished()) {
                                        c12396.f37285.abortAnimation();
                                    }
                                    m40659(true);
                                    c12396.invalidate();
                                    return true;
                                }
                            }
                            abstractC31710 = c12396.f37258;
                            if (abstractC31710.f10028) {
                                c14792 = abstractC31710.f9997;
                                if (c14792.m35177(this.f53105, fM9777)) {
                                    c12396.f37291 = true;
                                    this.f53100 = c14792.f45163 - this.f53105;
                                    if (!c12396.f37285.isFinished()) {
                                        c12396.f37285.abortAnimation();
                                    }
                                    m40659(true);
                                    c12396.invalidate();
                                    return true;
                                }
                            }
                            if (iM30444 == iM30448) {
                                rectF3 = c12396.f37258.f10004;
                                if (rectF3.contains(this.f53105, fM9777)) {
                                    c12396.f37204 = true;
                                    this.f53100 = ((rectF3.left + rectF3.right) / 2.0f) - this.f53105;
                                    this.f53099 = (rectF3.top - fM9777) - (c22686.m24484() / 2.0f);
                                    c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                    c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                    c12396.f37174 = 0;
                                    m40659(true);
                                    return true;
                                }
                            } else {
                                rectF = c12396.f37258.f10032;
                                if (rectF.contains(this.f53105, fM9777)) {
                                    rectF2 = c12396.f37258.f10010;
                                    if (rectF2.contains(this.f53105, fM9777)) {
                                        c12396.f37267 = true;
                                        c12396.f37313 = iM30444;
                                        float f4 = rectF2.left;
                                        this.f53100 = (((rectF2.right - f4) / 4.0f) + f4) - this.f53105;
                                        this.f53099 = (rectF2.top - fM9777) - (c22686.m24484() / 2.0f);
                                        c12396.f37308 = false;
                                        c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                        c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                        c12396.f37174 = 0;
                                        m40659(true);
                                        return true;
                                    }
                                } else {
                                    c12396.f37267 = true;
                                    c12396.f37313 = iM30448;
                                    float f5 = rectF.left;
                                    this.f53100 = ((((rectF.right - f5) * 3.0f) / 4.0f) + f5) - this.f53105;
                                    this.f53099 = (rectF.top - fM9777) - (c22686.m24484() / 2.0f);
                                    c12396.f37308 = true;
                                    c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                    c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                    c12396.f37174 = 0;
                                    m40659(true);
                                    return true;
                                }
                            }
                            if (c22686.f73285) {
                                x = motionEvent.getX();
                                if (c12396.m30257(x, motionEvent.getY())) {
                                    z = !c12396.m30264((x + c12396.getScrollX()) - c12396.getPaddingLeft());
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    this.f53098 = true;
                                    this.f53091 = false;
                                    this.f53080 = false;
                                    this.f53095 = c12396.f37258.m9760(this.f53105, this.f53106);
                                    this.f53092 = motionEvent.getX();
                                    this.f53107 = motionEvent.getY();
                                }
                            }
                        } else if (action != 1) {
                            c12396.setPressed(false);
                            m40659(false);
                            c12396.m30520();
                            if (this.f53102) {
                                m40660();
                                c12392 = c12396.f37281;
                                if (c12392 != null) {
                                    c12392.f37215.m40660();
                                    ((View) c12396.getParent()).invalidate();
                                    interfaceC0979 = c12396.f37254;
                                    if (interfaceC0979 != null) {
                                        C12392.m30135(c12396, new Runnable() { // from class: l.֫ۨᩳ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = this.f6236;
                                                final InterfaceC0979 interfaceC09711 = interfaceC0979;
                                                C12392.m30135(c12392, new Runnable() { // from class: l.ܽۨᩳ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C12392 c12397 = viewOnTouchListenerC17331.f53101;
                                                        int scrollX = c12397.getScrollX();
                                                        int iM30408 = c12397.m30408();
                                                        interfaceC09711.mo3444(scrollX, iM30408 - 1, scrollX, iM30408);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c12396.f37204) {
                                }
                                c12396.m30162();
                                if (c12396.f37204) {
                                    c12396.m30299(-1);
                                } else if (!c12396.f37267) {
                                    iM30445 = c12396.m30444();
                                    iM30449 = c12396.m30448();
                                    if (iM30445 > iM30449) {
                                        iM30449 = iM30445;
                                        iM30445 = iM30449;
                                    }
                                    if (!c12396.f37308) {
                                        iM30445 = iM30449;
                                    }
                                    c12396.m30299(iM30445);
                                } else {
                                    iM30445 = c12396.m30444();
                                    iM30449 = c12396.m30448();
                                    if (iM30445 > iM30449) {
                                        iM30449 = iM30445;
                                        iM30445 = iM30449;
                                    }
                                    if (!c12396.f37308) {
                                        iM30445 = iM30449;
                                    }
                                    c12396.m30299(iM30445);
                                }
                                c12396.f37307 = false;
                                c12396.f37204 = false;
                                c12396.f37267 = false;
                                c12396.f37263 = SystemClock.uptimeMillis();
                                return true;
                            }
                        } else {
                            if (action != 2) {
                                m40663(motionEvent);
                                if (this.f53108 != 1) {
                                    if (c12396.f37267) {
                                        c12396.f37215.onScroll(null, null, (this.f53103 - motionEvent.getX(1)) - c12396.getPaddingLeft(), (this.f53084 - motionEvent.getY(1)) - c12396.getPaddingTop());
                                        this.f53103 = motionEvent.getX(1);
                                        this.f53084 = motionEvent.getY(1);
                                    } else if (this.f53102) {
                                        m40661(motionEvent);
                                        c12393 = c12396.f37281;
                                        if (c12393 != null) {
                                            c12393.f37215.m40661(motionEvent);
                                            ((View) c12396.getParent()).invalidate();
                                            return true;
                                        }
                                    }
                                    if (!c12396.f37204) {
                                        x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                        y = motionEvent.getY() - c12396.getPaddingTop();
                                        if (!this.f53081) {
                                            i = (int) (x2 - this.f53105);
                                            int i3 = (int) (y - this.f53106);
                                            if (Math.abs(i) <= this.f53085) {
                                            }
                                            this.f53081 = true;
                                        }
                                        y2 = motionEvent.getY();
                                        if (c12396.f37174 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        f = c12396.f37219;
                                        if (y2 < f) {
                                            c12396.f37174 = -C12392.m30184((int) (f - y2));
                                            if (z2) {
                                                c12396.f37224 = SystemClock.uptimeMillis();
                                            }
                                            c12396.postInvalidateOnAnimation();
                                        } else {
                                            f2 = c12396.f37201;
                                            if (y2 > f2) {
                                                c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                                if (z2) {
                                                    c12396.f37224 = SystemClock.uptimeMillis();
                                                }
                                                c12396.postInvalidateOnAnimation();
                                            } else {
                                                c12396.f37174 = 0;
                                            }
                                        }
                                        fM24484 = c22686.m24484() / 2.0f;
                                        paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                        if (c12396.f37307) {
                                            if (y < fM24484) {
                                                y = fM24484;
                                            } else if (y > paddingTop) {
                                                y = paddingTop;
                                            }
                                            c12396.m30425(x2, y);
                                            return true;
                                        }
                                        f3 = y + this.f53099;
                                        if (f3 >= fM24484) {
                                            if (f3 > paddingTop) {
                                                fM24484 = paddingTop;
                                            } else {
                                                fM24484 = f3;
                                            }
                                        }
                                        if (c12396.f37204) {
                                            c12396.m30496(x2 + this.f53100, fM24484);
                                            return true;
                                        }
                                        c12396.m30476(x2 + this.f53100, fM24484);
                                        return true;
                                    }
                                    x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                    y = motionEvent.getY() - c12396.getPaddingTop();
                                    if (!this.f53081) {
                                        i = (int) (x2 - this.f53105);
                                        int i4 = (int) (y - this.f53106);
                                        if (Math.abs(i) <= this.f53085) {
                                        }
                                        this.f53081 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c12396.f37174 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c12396.f37219;
                                    if (y2 < f) {
                                        c12396.f37174 = -C12392.m30184((int) (f - y2));
                                        if (z2) {
                                            c12396.f37224 = SystemClock.uptimeMillis();
                                        }
                                        c12396.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c12396.f37201;
                                        if (y2 > f2) {
                                            c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                            if (z2) {
                                                c12396.f37224 = SystemClock.uptimeMillis();
                                            }
                                            c12396.postInvalidateOnAnimation();
                                        } else {
                                            c12396.f37174 = 0;
                                        }
                                    }
                                    fM24484 = c22686.m24484() / 2.0f;
                                    paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                    if (c12396.f37307) {
                                        if (y < fM24484) {
                                            y = fM24484;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c12396.m30425(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f53099;
                                    if (f3 >= fM24484) {
                                        if (f3 > paddingTop) {
                                            fM24484 = paddingTop;
                                        } else {
                                            fM24484 = f3;
                                        }
                                    }
                                    if (c12396.f37204) {
                                        c12396.m30496(x2 + this.f53100, fM24484);
                                        return true;
                                    }
                                    c12396.m30476(x2 + this.f53100, fM24484);
                                    return true;
                                }
                                if (!c12396.f37204) {
                                    x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                    y = motionEvent.getY() - c12396.getPaddingTop();
                                    if (!this.f53081) {
                                        i = (int) (x2 - this.f53105);
                                        int i5 = (int) (y - this.f53106);
                                        if (Math.abs(i) <= this.f53085) {
                                        }
                                        this.f53081 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c12396.f37174 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c12396.f37219;
                                    if (y2 < f) {
                                        c12396.f37174 = -C12392.m30184((int) (f - y2));
                                        if (z2) {
                                            c12396.f37224 = SystemClock.uptimeMillis();
                                        }
                                        c12396.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c12396.f37201;
                                        if (y2 > f2) {
                                            c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                            if (z2) {
                                                c12396.f37224 = SystemClock.uptimeMillis();
                                            }
                                            c12396.postInvalidateOnAnimation();
                                        } else {
                                            c12396.f37174 = 0;
                                        }
                                    }
                                    fM24484 = c22686.m24484() / 2.0f;
                                    paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                    if (c12396.f37307) {
                                        if (y < fM24484) {
                                            y = fM24484;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c12396.m30425(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f53099;
                                    if (f3 >= fM24484) {
                                        if (f3 > paddingTop) {
                                            fM24484 = paddingTop;
                                        } else {
                                            fM24484 = f3;
                                        }
                                    }
                                    if (c12396.f37204) {
                                        c12396.m30496(x2 + this.f53100, fM24484);
                                        return true;
                                    }
                                    c12396.m30476(x2 + this.f53100, fM24484);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                y = motionEvent.getY() - c12396.getPaddingTop();
                                if (!this.f53081) {
                                    i = (int) (x2 - this.f53105);
                                    int i6 = (int) (y - this.f53106);
                                    if (Math.abs(i) <= this.f53085) {
                                    }
                                    this.f53081 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c12396.f37174 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c12396.f37219;
                                if (y2 < f) {
                                    c12396.f37174 = -C12392.m30184((int) (f - y2));
                                    if (z2) {
                                        c12396.f37224 = SystemClock.uptimeMillis();
                                    }
                                    c12396.postInvalidateOnAnimation();
                                } else {
                                    f2 = c12396.f37201;
                                    if (y2 > f2) {
                                        c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                        if (z2) {
                                            c12396.f37224 = SystemClock.uptimeMillis();
                                        }
                                        c12396.postInvalidateOnAnimation();
                                    } else {
                                        c12396.f37174 = 0;
                                    }
                                }
                                fM24484 = c22686.m24484() / 2.0f;
                                paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                if (c12396.f37307) {
                                    if (y < fM24484) {
                                        y = fM24484;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c12396.m30425(x2, y);
                                    return true;
                                }
                                f3 = y + this.f53099;
                                if (f3 >= fM24484) {
                                    if (f3 > paddingTop) {
                                        fM24484 = paddingTop;
                                    } else {
                                        fM24484 = f3;
                                    }
                                }
                                if (c12396.f37204) {
                                    c12396.m30496(x2 + this.f53100, fM24484);
                                    return true;
                                }
                                c12396.m30476(x2 + this.f53100, fM24484);
                                return true;
                            }
                            if (action != 3) {
                                c12396.setPressed(false);
                                m40659(false);
                                c12396.m30520();
                                if (this.f53102) {
                                    m40660();
                                    c12394 = c12396.f37281;
                                    if (c12394 != null) {
                                        c12394.f37215.m40660();
                                        ((View) c12396.getParent()).invalidate();
                                        interfaceC09710 = c12396.f37254;
                                        if (interfaceC09710 != null) {
                                            C12392.m30135(c12396, new Runnable() { // from class: l.۟ۛᩳ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = this.f22373;
                                                    final InterfaceC0979 interfaceC09711 = interfaceC09710;
                                                    C12392.m30135(c12394, new Runnable() { // from class: l.ᩳۨᩳ
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            C12392 c12397 = viewOnTouchListenerC17331.f53101;
                                                            int scrollX = c12397.getScrollX();
                                                            int iM30408 = c12397.m30408();
                                                            interfaceC09711.mo3444(scrollX, iM30408 - 1, scrollX, iM30408);
                                                        }
                                                    });
                                                }
                                            });
                                            return true;
                                        }
                                    }
                                } else {
                                    if (!c12396.f37295) {
                                    }
                                    C12392.m30226(c12396);
                                    c12396.f37307 = false;
                                    c12396.f37204 = false;
                                    c12396.f37267 = false;
                                    c12396.f37291 = false;
                                    c12396.f37295 = false;
                                    c12396.m30162();
                                    return true;
                                }
                            } else if (action != 5) {
                                this.f53108++;
                                if (c12396.f37267) {
                                    this.f53086 = motionEvent.getPointerId(1);
                                    this.f53103 = motionEvent.getX(1);
                                    this.f53084 = motionEvent.getY(1);
                                    return true;
                                }
                                if (c22686.f73227) {
                                    m40664(motionEvent);
                                    c12395 = c12396.f37281;
                                    if (c12395 != null) {
                                        c12395.f37215.m40664(motionEvent);
                                        ((View) c12396.getParent()).invalidate();
                                    }
                                }
                            } else if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >>> 8;
                                if (c12396.f37267) {
                                    c12396.f37267 = false;
                                }
                                this.f53108--;
                            }
                        }
                        return c12396.f37257.m3331(motionEvent);
                    }
                    viewTreeObserverOnPreDrawListenerC8575Arr = c22810M30543.f73647;
                    if (!viewTreeObserverOnPreDrawListenerC8575Arr[0].m22285()) {
                        if (this.f53098) {
                            actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 1) {
                                m40654();
                            } else {
                                if (actionMasked != 2) {
                                    x3 = motionEvent.getX() - this.f53092;
                                    float y4 = motionEvent.getY() - this.f53107;
                                    if (Math.abs(x3) <= this.f53085) {
                                    }
                                    this.f53098 = false;
                                    this.f53091 = true;
                                    if (!c12396.isFocused()) {
                                        c12396.requestFocus();
                                    }
                                    if (!this.f53080) {
                                        c12396.m30455(c12396.m30444(), this.f53095);
                                        c12396.m30227();
                                        this.f53080 = true;
                                    }
                                    c12396.f37219 = Math.min(c22686.m24484() + c12396.getPaddingTop(), this.f53107);
                                    c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c22686.m24484(), this.f53107);
                                    c12396.f37174 = 0;
                                    c12396.f37263 = 0L;
                                    c22810 = c12396.f37181;
                                    if (c22810 != null) {
                                        c22810.m50904();
                                    }
                                    c12396.invalidate();
                                    m40659(true);
                                    this.f53087 = true;
                                    c12396.f37257.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                    m40656(motionEvent);
                                    return true;
                                }
                                if (actionMasked == 3) {
                                    m40654();
                                }
                            }
                        }
                        action = motionEvent.getAction() & 255;
                        if (action != 0) {
                            c12396.setPressed(true);
                            c12396.m30443();
                            if (!c12396.isFocused()) {
                                c12396.invalidate();
                            }
                            this.f53082 = true;
                            if (c12396.mo25925()) {
                                m40659(true);
                            }
                            this.f53102 = false;
                            this.f53108 = 0;
                            this.f53105 = (c12396.getScrollX() + ((int) motionEvent.getX())) - c12396.getPaddingLeft();
                            this.f53106 = (c12396.m30408() + ((int) motionEvent.getY())) - c12396.getPaddingTop();
                            this.f53081 = false;
                            iM30444 = c12396.m30444();
                            iM30448 = c12396.m30448();
                            if (iM30444 > iM30448) {
                                iM30448 = iM30444;
                                iM30444 = iM30448;
                            }
                            fM9777 = c12396.f37258.m9777(motionEvent.getY());
                            abstractC3179 = c12396.f37258;
                            if (abstractC3179.f10029) {
                                c14793 = abstractC3179.f9999;
                                if (c14793.m35177(this.f53105, fM9777)) {
                                    c12396.f37295 = true;
                                    this.f53099 = c14793.f45166 - fM9777;
                                    if (!c12396.f37285.isFinished()) {
                                        c12396.f37285.abortAnimation();
                                    }
                                    m40659(true);
                                    c12396.invalidate();
                                    return true;
                                }
                            }
                            abstractC31710 = c12396.f37258;
                            if (abstractC31710.f10028) {
                                c14792 = abstractC31710.f9997;
                                if (c14792.m35177(this.f53105, fM9777)) {
                                    c12396.f37291 = true;
                                    this.f53100 = c14792.f45163 - this.f53105;
                                    if (!c12396.f37285.isFinished()) {
                                        c12396.f37285.abortAnimation();
                                    }
                                    m40659(true);
                                    c12396.invalidate();
                                    return true;
                                }
                            }
                            if (iM30444 == iM30448) {
                                rectF3 = c12396.f37258.f10004;
                                if (rectF3.contains(this.f53105, fM9777)) {
                                    c12396.f37204 = true;
                                    this.f53100 = ((rectF3.left + rectF3.right) / 2.0f) - this.f53105;
                                    this.f53099 = (rectF3.top - fM9777) - (c22686.m24484() / 2.0f);
                                    c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                    c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                    c12396.f37174 = 0;
                                    m40659(true);
                                    return true;
                                }
                            } else {
                                rectF = c12396.f37258.f10032;
                                if (rectF.contains(this.f53105, fM9777)) {
                                    rectF2 = c12396.f37258.f10010;
                                    if (rectF2.contains(this.f53105, fM9777)) {
                                        c12396.f37267 = true;
                                        c12396.f37313 = iM30444;
                                        float f6 = rectF2.left;
                                        this.f53100 = (((rectF2.right - f6) / 4.0f) + f6) - this.f53105;
                                        this.f53099 = (rectF2.top - fM9777) - (c22686.m24484() / 2.0f);
                                        c12396.f37308 = false;
                                        c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                        c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                        c12396.f37174 = 0;
                                        m40659(true);
                                        return true;
                                    }
                                } else {
                                    c12396.f37267 = true;
                                    c12396.f37313 = iM30448;
                                    float f7 = rectF.left;
                                    this.f53100 = ((((rectF.right - f7) * 3.0f) / 4.0f) + f7) - this.f53105;
                                    this.f53099 = (rectF.top - fM9777) - (c22686.m24484() / 2.0f);
                                    c12396.f37308 = true;
                                    c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                    c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                    c12396.f37174 = 0;
                                    m40659(true);
                                    return true;
                                }
                            }
                            if (c22686.f73285) {
                                x = motionEvent.getX();
                                if (c12396.m30257(x, motionEvent.getY())) {
                                    z = false;
                                } else {
                                    z = !c12396.m30264((x + c12396.getScrollX()) - c12396.getPaddingLeft());
                                }
                                if (z) {
                                    this.f53098 = true;
                                    this.f53091 = false;
                                    this.f53080 = false;
                                    this.f53095 = c12396.f37258.m9760(this.f53105, this.f53106);
                                    this.f53092 = motionEvent.getX();
                                    this.f53107 = motionEvent.getY();
                                }
                            }
                        } else if (action != 1) {
                            c12396.setPressed(false);
                            m40659(false);
                            c12396.m30520();
                            if (this.f53102) {
                                m40660();
                                c12392 = c12396.f37281;
                                if (c12392 != null) {
                                    c12392.f37215.m40660();
                                    ((View) c12396.getParent()).invalidate();
                                    interfaceC0979 = c12396.f37254;
                                    if (interfaceC0979 != null) {
                                        C12392.m30135(c12396, new Runnable() { // from class: l.֫ۨᩳ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = this.f6236;
                                                final InterfaceC0979 interfaceC09711 = interfaceC0979;
                                                C12392.m30135(c12392, new Runnable() { // from class: l.ܽۨᩳ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C12392 c12397 = viewOnTouchListenerC17331.f53101;
                                                        int scrollX = c12397.getScrollX();
                                                        int iM30408 = c12397.m30408();
                                                        interfaceC09711.mo3444(scrollX, iM30408 - 1, scrollX, iM30408);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c12396.f37204) {
                                }
                                c12396.m30162();
                                if (c12396.f37204) {
                                    c12396.m30299(-1);
                                } else if (!c12396.f37267) {
                                    iM30445 = c12396.m30444();
                                    iM30449 = c12396.m30448();
                                    if (iM30445 > iM30449) {
                                        iM30449 = iM30445;
                                        iM30445 = iM30449;
                                    }
                                    if (!c12396.f37308) {
                                        iM30445 = iM30449;
                                    }
                                    c12396.m30299(iM30445);
                                } else {
                                    iM30445 = c12396.m30444();
                                    iM30449 = c12396.m30448();
                                    if (iM30445 > iM30449) {
                                        iM30449 = iM30445;
                                        iM30445 = iM30449;
                                    }
                                    if (!c12396.f37308) {
                                        iM30445 = iM30449;
                                    }
                                    c12396.m30299(iM30445);
                                }
                                c12396.f37307 = false;
                                c12396.f37204 = false;
                                c12396.f37267 = false;
                                c12396.f37263 = SystemClock.uptimeMillis();
                                return true;
                            }
                        } else {
                            if (action != 2) {
                                m40663(motionEvent);
                                if (this.f53108 != 1) {
                                    if (c12396.f37267) {
                                        c12396.f37215.onScroll(null, null, (this.f53103 - motionEvent.getX(1)) - c12396.getPaddingLeft(), (this.f53084 - motionEvent.getY(1)) - c12396.getPaddingTop());
                                        this.f53103 = motionEvent.getX(1);
                                        this.f53084 = motionEvent.getY(1);
                                    } else if (this.f53102) {
                                        m40661(motionEvent);
                                        c12393 = c12396.f37281;
                                        if (c12393 != null) {
                                            c12393.f37215.m40661(motionEvent);
                                            ((View) c12396.getParent()).invalidate();
                                            return true;
                                        }
                                    }
                                    if (!c12396.f37204) {
                                        x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                        y = motionEvent.getY() - c12396.getPaddingTop();
                                        if (!this.f53081) {
                                            i = (int) (x2 - this.f53105);
                                            int i7 = (int) (y - this.f53106);
                                            if (Math.abs(i) <= this.f53085) {
                                            }
                                            this.f53081 = true;
                                        }
                                        y2 = motionEvent.getY();
                                        if (c12396.f37174 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        f = c12396.f37219;
                                        if (y2 < f) {
                                            c12396.f37174 = -C12392.m30184((int) (f - y2));
                                            if (z2) {
                                                c12396.f37224 = SystemClock.uptimeMillis();
                                            }
                                            c12396.postInvalidateOnAnimation();
                                        } else {
                                            f2 = c12396.f37201;
                                            if (y2 > f2) {
                                                c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                                if (z2) {
                                                    c12396.f37224 = SystemClock.uptimeMillis();
                                                }
                                                c12396.postInvalidateOnAnimation();
                                            } else {
                                                c12396.f37174 = 0;
                                            }
                                        }
                                        fM24484 = c22686.m24484() / 2.0f;
                                        paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                        if (c12396.f37307) {
                                            if (y < fM24484) {
                                                y = fM24484;
                                            } else if (y > paddingTop) {
                                                y = paddingTop;
                                            }
                                            c12396.m30425(x2, y);
                                            return true;
                                        }
                                        f3 = y + this.f53099;
                                        if (f3 >= fM24484) {
                                            if (f3 > paddingTop) {
                                                fM24484 = paddingTop;
                                            } else {
                                                fM24484 = f3;
                                            }
                                        }
                                        if (c12396.f37204) {
                                            c12396.m30496(x2 + this.f53100, fM24484);
                                            return true;
                                        }
                                        c12396.m30476(x2 + this.f53100, fM24484);
                                        return true;
                                    }
                                    x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                    y = motionEvent.getY() - c12396.getPaddingTop();
                                    if (!this.f53081) {
                                        i = (int) (x2 - this.f53105);
                                        int i8 = (int) (y - this.f53106);
                                        if (Math.abs(i) <= this.f53085) {
                                        }
                                        this.f53081 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c12396.f37174 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c12396.f37219;
                                    if (y2 < f) {
                                        c12396.f37174 = -C12392.m30184((int) (f - y2));
                                        if (z2) {
                                            c12396.f37224 = SystemClock.uptimeMillis();
                                        }
                                        c12396.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c12396.f37201;
                                        if (y2 > f2) {
                                            c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                            if (z2) {
                                                c12396.f37224 = SystemClock.uptimeMillis();
                                            }
                                            c12396.postInvalidateOnAnimation();
                                        } else {
                                            c12396.f37174 = 0;
                                        }
                                    }
                                    fM24484 = c22686.m24484() / 2.0f;
                                    paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                    if (c12396.f37307) {
                                        if (y < fM24484) {
                                            y = fM24484;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c12396.m30425(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f53099;
                                    if (f3 >= fM24484) {
                                        if (f3 > paddingTop) {
                                            fM24484 = paddingTop;
                                        } else {
                                            fM24484 = f3;
                                        }
                                    }
                                    if (c12396.f37204) {
                                        c12396.m30496(x2 + this.f53100, fM24484);
                                        return true;
                                    }
                                    c12396.m30476(x2 + this.f53100, fM24484);
                                    return true;
                                }
                                if (!c12396.f37204) {
                                    x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                    y = motionEvent.getY() - c12396.getPaddingTop();
                                    if (!this.f53081) {
                                        i = (int) (x2 - this.f53105);
                                        int i9 = (int) (y - this.f53106);
                                        if (Math.abs(i) <= this.f53085) {
                                        }
                                        this.f53081 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c12396.f37174 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c12396.f37219;
                                    if (y2 < f) {
                                        c12396.f37174 = -C12392.m30184((int) (f - y2));
                                        if (z2) {
                                            c12396.f37224 = SystemClock.uptimeMillis();
                                        }
                                        c12396.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c12396.f37201;
                                        if (y2 > f2) {
                                            c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                            if (z2) {
                                                c12396.f37224 = SystemClock.uptimeMillis();
                                            }
                                            c12396.postInvalidateOnAnimation();
                                        } else {
                                            c12396.f37174 = 0;
                                        }
                                    }
                                    fM24484 = c22686.m24484() / 2.0f;
                                    paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                    if (c12396.f37307) {
                                        if (y < fM24484) {
                                            y = fM24484;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c12396.m30425(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f53099;
                                    if (f3 >= fM24484) {
                                        if (f3 > paddingTop) {
                                            fM24484 = paddingTop;
                                        } else {
                                            fM24484 = f3;
                                        }
                                    }
                                    if (c12396.f37204) {
                                        c12396.m30496(x2 + this.f53100, fM24484);
                                        return true;
                                    }
                                    c12396.m30476(x2 + this.f53100, fM24484);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                y = motionEvent.getY() - c12396.getPaddingTop();
                                if (!this.f53081) {
                                    i = (int) (x2 - this.f53105);
                                    int i10 = (int) (y - this.f53106);
                                    if (Math.abs(i) <= this.f53085) {
                                    }
                                    this.f53081 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c12396.f37174 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c12396.f37219;
                                if (y2 < f) {
                                    c12396.f37174 = -C12392.m30184((int) (f - y2));
                                    if (z2) {
                                        c12396.f37224 = SystemClock.uptimeMillis();
                                    }
                                    c12396.postInvalidateOnAnimation();
                                } else {
                                    f2 = c12396.f37201;
                                    if (y2 > f2) {
                                        c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                        if (z2) {
                                            c12396.f37224 = SystemClock.uptimeMillis();
                                        }
                                        c12396.postInvalidateOnAnimation();
                                    } else {
                                        c12396.f37174 = 0;
                                    }
                                }
                                fM24484 = c22686.m24484() / 2.0f;
                                paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                if (c12396.f37307) {
                                    if (y < fM24484) {
                                        y = fM24484;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c12396.m30425(x2, y);
                                    return true;
                                }
                                f3 = y + this.f53099;
                                if (f3 >= fM24484) {
                                    if (f3 > paddingTop) {
                                        fM24484 = paddingTop;
                                    } else {
                                        fM24484 = f3;
                                    }
                                }
                                if (c12396.f37204) {
                                    c12396.m30496(x2 + this.f53100, fM24484);
                                    return true;
                                }
                                c12396.m30476(x2 + this.f53100, fM24484);
                                return true;
                            }
                            if (action != 3) {
                                c12396.setPressed(false);
                                m40659(false);
                                c12396.m30520();
                                if (this.f53102) {
                                    m40660();
                                    c12394 = c12396.f37281;
                                    if (c12394 != null) {
                                        c12394.f37215.m40660();
                                        ((View) c12396.getParent()).invalidate();
                                        interfaceC09710 = c12396.f37254;
                                        if (interfaceC09710 != null) {
                                            C12392.m30135(c12396, new Runnable() { // from class: l.۟ۛᩳ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = this.f22373;
                                                    final InterfaceC0979 interfaceC09711 = interfaceC09710;
                                                    C12392.m30135(c12394, new Runnable() { // from class: l.ᩳۨᩳ
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            C12392 c12397 = viewOnTouchListenerC17331.f53101;
                                                            int scrollX = c12397.getScrollX();
                                                            int iM30408 = c12397.m30408();
                                                            interfaceC09711.mo3444(scrollX, iM30408 - 1, scrollX, iM30408);
                                                        }
                                                    });
                                                }
                                            });
                                            return true;
                                        }
                                    }
                                } else {
                                    if (!c12396.f37295) {
                                    }
                                    C12392.m30226(c12396);
                                    c12396.f37307 = false;
                                    c12396.f37204 = false;
                                    c12396.f37267 = false;
                                    c12396.f37291 = false;
                                    c12396.f37295 = false;
                                    c12396.m30162();
                                    return true;
                                }
                            } else if (action != 5) {
                                this.f53108++;
                                if (c12396.f37267) {
                                    this.f53086 = motionEvent.getPointerId(1);
                                    this.f53103 = motionEvent.getX(1);
                                    this.f53084 = motionEvent.getY(1);
                                    return true;
                                }
                                if (c22686.f73227) {
                                    m40664(motionEvent);
                                    c12395 = c12396.f37281;
                                    if (c12395 != null) {
                                        c12395.f37215.m40664(motionEvent);
                                        ((View) c12396.getParent()).invalidate();
                                    }
                                }
                            } else if (action == 6) {
                                int action3 = (motionEvent.getAction() & 65280) >>> 8;
                                if (c12396.f37267) {
                                    c12396.f37267 = false;
                                }
                                this.f53108--;
                            }
                        }
                        return c12396.f37257.m3331(motionEvent);
                    }
                }
            } else {
                if (this.f53091) {
                    actionMasked2 = motionEvent.getActionMasked();
                    if (actionMasked2 != 1) {
                        c12396.setPressed(false);
                        c12396.m30520();
                        m40654();
                        return true;
                    }
                    if (actionMasked2 != 2) {
                        m40656(motionEvent);
                        return true;
                    }
                    if (actionMasked2 == 3) {
                        c12396.setPressed(false);
                        c12396.m30520();
                        m40654();
                        return true;
                    }
                }
                c22810M30543 = c12396.m30543();
                if (c22810M30543 != null) {
                    if (this.f53098) {
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 1) {
                            m40654();
                        } else {
                            if (actionMasked != 2) {
                                x3 = motionEvent.getX() - this.f53092;
                                float y5 = motionEvent.getY() - this.f53107;
                                if (Math.abs(x3) <= this.f53085) {
                                }
                                this.f53098 = false;
                                this.f53091 = true;
                                if (!c12396.isFocused()) {
                                    c12396.requestFocus();
                                }
                                if (!this.f53080) {
                                    c12396.m30455(c12396.m30444(), this.f53095);
                                    c12396.m30227();
                                    this.f53080 = true;
                                }
                                c12396.f37219 = Math.min(c22686.m24484() + c12396.getPaddingTop(), this.f53107);
                                c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c22686.m24484(), this.f53107);
                                c12396.f37174 = 0;
                                c12396.f37263 = 0L;
                                c22810 = c12396.f37181;
                                if (c22810 != null) {
                                    c22810.m50904();
                                }
                                c12396.invalidate();
                                m40659(true);
                                this.f53087 = true;
                                c12396.f37257.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                m40656(motionEvent);
                                return true;
                            }
                            if (actionMasked == 3) {
                                m40654();
                            }
                        }
                    }
                    action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        c12396.setPressed(true);
                        c12396.m30443();
                        if (!c12396.isFocused()) {
                            c12396.invalidate();
                        }
                        this.f53082 = true;
                        if (c12396.mo25925()) {
                            m40659(true);
                        }
                        this.f53102 = false;
                        this.f53108 = 0;
                        this.f53105 = (c12396.getScrollX() + ((int) motionEvent.getX())) - c12396.getPaddingLeft();
                        this.f53106 = (c12396.m30408() + ((int) motionEvent.getY())) - c12396.getPaddingTop();
                        this.f53081 = false;
                        iM30444 = c12396.m30444();
                        iM30448 = c12396.m30448();
                        if (iM30444 > iM30448) {
                            iM30448 = iM30444;
                            iM30444 = iM30448;
                        }
                        fM9777 = c12396.f37258.m9777(motionEvent.getY());
                        abstractC3179 = c12396.f37258;
                        if (abstractC3179.f10029) {
                            c14793 = abstractC3179.f9999;
                            if (c14793.m35177(this.f53105, fM9777)) {
                                c12396.f37295 = true;
                                this.f53099 = c14793.f45166 - fM9777;
                                if (!c12396.f37285.isFinished()) {
                                    c12396.f37285.abortAnimation();
                                }
                                m40659(true);
                                c12396.invalidate();
                                return true;
                            }
                        }
                        abstractC31710 = c12396.f37258;
                        if (abstractC31710.f10028) {
                            c14792 = abstractC31710.f9997;
                            if (c14792.m35177(this.f53105, fM9777)) {
                                c12396.f37291 = true;
                                this.f53100 = c14792.f45163 - this.f53105;
                                if (!c12396.f37285.isFinished()) {
                                    c12396.f37285.abortAnimation();
                                }
                                m40659(true);
                                c12396.invalidate();
                                return true;
                            }
                        }
                        if (iM30444 == iM30448) {
                            rectF3 = c12396.f37258.f10004;
                            if (rectF3.contains(this.f53105, fM9777)) {
                                c12396.f37204 = true;
                                this.f53100 = ((rectF3.left + rectF3.right) / 2.0f) - this.f53105;
                                this.f53099 = (rectF3.top - fM9777) - (c22686.m24484() / 2.0f);
                                c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                c12396.f37174 = 0;
                                m40659(true);
                                return true;
                            }
                        } else {
                            rectF = c12396.f37258.f10032;
                            if (rectF.contains(this.f53105, fM9777)) {
                                rectF2 = c12396.f37258.f10010;
                                if (rectF2.contains(this.f53105, fM9777)) {
                                    c12396.f37267 = true;
                                    c12396.f37313 = iM30444;
                                    float f8 = rectF2.left;
                                    this.f53100 = (((rectF2.right - f8) / 4.0f) + f8) - this.f53105;
                                    this.f53099 = (rectF2.top - fM9777) - (c22686.m24484() / 2.0f);
                                    c12396.f37308 = false;
                                    c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                    c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                    c12396.f37174 = 0;
                                    m40659(true);
                                    return true;
                                }
                            } else {
                                c12396.f37267 = true;
                                c12396.f37313 = iM30448;
                                float f9 = rectF.left;
                                this.f53100 = ((((rectF.right - f9) * 3.0f) / 4.0f) + f9) - this.f53105;
                                this.f53099 = (rectF.top - fM9777) - (c22686.m24484() / 2.0f);
                                c12396.f37308 = true;
                                c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                c12396.f37174 = 0;
                                m40659(true);
                                return true;
                            }
                        }
                        if (c22686.f73285) {
                            x = motionEvent.getX();
                            if (c12396.m30257(x, motionEvent.getY())) {
                                z = false;
                            } else {
                                z = !c12396.m30264((x + c12396.getScrollX()) - c12396.getPaddingLeft());
                            }
                            if (z) {
                                this.f53098 = true;
                                this.f53091 = false;
                                this.f53080 = false;
                                this.f53095 = c12396.f37258.m9760(this.f53105, this.f53106);
                                this.f53092 = motionEvent.getX();
                                this.f53107 = motionEvent.getY();
                            }
                        }
                    } else if (action != 1) {
                        c12396.setPressed(false);
                        m40659(false);
                        c12396.m30520();
                        if (this.f53102) {
                            m40660();
                            c12392 = c12396.f37281;
                            if (c12392 != null) {
                                c12392.f37215.m40660();
                                ((View) c12396.getParent()).invalidate();
                                interfaceC0979 = c12396.f37254;
                                if (interfaceC0979 != null) {
                                    C12392.m30135(c12396, new Runnable() { // from class: l.֫ۨᩳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = this.f6236;
                                            final InterfaceC0979 interfaceC09711 = interfaceC0979;
                                            C12392.m30135(c12392, new Runnable() { // from class: l.ܽۨᩳ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C12392 c12397 = viewOnTouchListenerC17331.f53101;
                                                    int scrollX = c12397.getScrollX();
                                                    int iM30408 = c12397.m30408();
                                                    interfaceC09711.mo3444(scrollX, iM30408 - 1, scrollX, iM30408);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c12396.f37204) {
                            }
                            c12396.m30162();
                            if (c12396.f37204) {
                                c12396.m30299(-1);
                            } else if (!c12396.f37267) {
                                iM30445 = c12396.m30444();
                                iM30449 = c12396.m30448();
                                if (iM30445 > iM30449) {
                                    iM30449 = iM30445;
                                    iM30445 = iM30449;
                                }
                                if (!c12396.f37308) {
                                    iM30445 = iM30449;
                                }
                                c12396.m30299(iM30445);
                            } else {
                                iM30445 = c12396.m30444();
                                iM30449 = c12396.m30448();
                                if (iM30445 > iM30449) {
                                    iM30449 = iM30445;
                                    iM30445 = iM30449;
                                }
                                if (!c12396.f37308) {
                                    iM30445 = iM30449;
                                }
                                c12396.m30299(iM30445);
                            }
                            c12396.f37307 = false;
                            c12396.f37204 = false;
                            c12396.f37267 = false;
                            c12396.f37263 = SystemClock.uptimeMillis();
                            return true;
                        }
                    } else {
                        if (action != 2) {
                            m40663(motionEvent);
                            if (this.f53108 != 1) {
                                if (c12396.f37267) {
                                    c12396.f37215.onScroll(null, null, (this.f53103 - motionEvent.getX(1)) - c12396.getPaddingLeft(), (this.f53084 - motionEvent.getY(1)) - c12396.getPaddingTop());
                                    this.f53103 = motionEvent.getX(1);
                                    this.f53084 = motionEvent.getY(1);
                                } else if (this.f53102) {
                                    m40661(motionEvent);
                                    c12393 = c12396.f37281;
                                    if (c12393 != null) {
                                        c12393.f37215.m40661(motionEvent);
                                        ((View) c12396.getParent()).invalidate();
                                        return true;
                                    }
                                }
                                if (!c12396.f37204) {
                                    x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                    y = motionEvent.getY() - c12396.getPaddingTop();
                                    if (!this.f53081) {
                                        i = (int) (x2 - this.f53105);
                                        int i11 = (int) (y - this.f53106);
                                        if (Math.abs(i) <= this.f53085) {
                                        }
                                        this.f53081 = true;
                                    }
                                    y2 = motionEvent.getY();
                                    if (c12396.f37174 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    f = c12396.f37219;
                                    if (y2 < f) {
                                        c12396.f37174 = -C12392.m30184((int) (f - y2));
                                        if (z2) {
                                            c12396.f37224 = SystemClock.uptimeMillis();
                                        }
                                        c12396.postInvalidateOnAnimation();
                                    } else {
                                        f2 = c12396.f37201;
                                        if (y2 > f2) {
                                            c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                            if (z2) {
                                                c12396.f37224 = SystemClock.uptimeMillis();
                                            }
                                            c12396.postInvalidateOnAnimation();
                                        } else {
                                            c12396.f37174 = 0;
                                        }
                                    }
                                    fM24484 = c22686.m24484() / 2.0f;
                                    paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                    if (c12396.f37307) {
                                        if (y < fM24484) {
                                            y = fM24484;
                                        } else if (y > paddingTop) {
                                            y = paddingTop;
                                        }
                                        c12396.m30425(x2, y);
                                        return true;
                                    }
                                    f3 = y + this.f53099;
                                    if (f3 >= fM24484) {
                                        if (f3 > paddingTop) {
                                            fM24484 = paddingTop;
                                        } else {
                                            fM24484 = f3;
                                        }
                                    }
                                    if (c12396.f37204) {
                                        c12396.m30496(x2 + this.f53100, fM24484);
                                        return true;
                                    }
                                    c12396.m30476(x2 + this.f53100, fM24484);
                                    return true;
                                }
                                x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                y = motionEvent.getY() - c12396.getPaddingTop();
                                if (!this.f53081) {
                                    i = (int) (x2 - this.f53105);
                                    int i12 = (int) (y - this.f53106);
                                    if (Math.abs(i) <= this.f53085) {
                                    }
                                    this.f53081 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c12396.f37174 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c12396.f37219;
                                if (y2 < f) {
                                    c12396.f37174 = -C12392.m30184((int) (f - y2));
                                    if (z2) {
                                        c12396.f37224 = SystemClock.uptimeMillis();
                                    }
                                    c12396.postInvalidateOnAnimation();
                                } else {
                                    f2 = c12396.f37201;
                                    if (y2 > f2) {
                                        c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                        if (z2) {
                                            c12396.f37224 = SystemClock.uptimeMillis();
                                        }
                                        c12396.postInvalidateOnAnimation();
                                    } else {
                                        c12396.f37174 = 0;
                                    }
                                }
                                fM24484 = c22686.m24484() / 2.0f;
                                paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                if (c12396.f37307) {
                                    if (y < fM24484) {
                                        y = fM24484;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c12396.m30425(x2, y);
                                    return true;
                                }
                                f3 = y + this.f53099;
                                if (f3 >= fM24484) {
                                    if (f3 > paddingTop) {
                                        fM24484 = paddingTop;
                                    } else {
                                        fM24484 = f3;
                                    }
                                }
                                if (c12396.f37204) {
                                    c12396.m30496(x2 + this.f53100, fM24484);
                                    return true;
                                }
                                c12396.m30476(x2 + this.f53100, fM24484);
                                return true;
                            }
                            if (!c12396.f37204) {
                                x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                y = motionEvent.getY() - c12396.getPaddingTop();
                                if (!this.f53081) {
                                    i = (int) (x2 - this.f53105);
                                    int i13 = (int) (y - this.f53106);
                                    if (Math.abs(i) <= this.f53085) {
                                    }
                                    this.f53081 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c12396.f37174 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c12396.f37219;
                                if (y2 < f) {
                                    c12396.f37174 = -C12392.m30184((int) (f - y2));
                                    if (z2) {
                                        c12396.f37224 = SystemClock.uptimeMillis();
                                    }
                                    c12396.postInvalidateOnAnimation();
                                } else {
                                    f2 = c12396.f37201;
                                    if (y2 > f2) {
                                        c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                        if (z2) {
                                            c12396.f37224 = SystemClock.uptimeMillis();
                                        }
                                        c12396.postInvalidateOnAnimation();
                                    } else {
                                        c12396.f37174 = 0;
                                    }
                                }
                                fM24484 = c22686.m24484() / 2.0f;
                                paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                if (c12396.f37307) {
                                    if (y < fM24484) {
                                        y = fM24484;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c12396.m30425(x2, y);
                                    return true;
                                }
                                f3 = y + this.f53099;
                                if (f3 >= fM24484) {
                                    if (f3 > paddingTop) {
                                        fM24484 = paddingTop;
                                    } else {
                                        fM24484 = f3;
                                    }
                                }
                                if (c12396.f37204) {
                                    c12396.m30496(x2 + this.f53100, fM24484);
                                    return true;
                                }
                                c12396.m30476(x2 + this.f53100, fM24484);
                                return true;
                            }
                            x2 = motionEvent.getX() - c12396.getPaddingLeft();
                            y = motionEvent.getY() - c12396.getPaddingTop();
                            if (!this.f53081) {
                                i = (int) (x2 - this.f53105);
                                int i14 = (int) (y - this.f53106);
                                if (Math.abs(i) <= this.f53085) {
                                }
                                this.f53081 = true;
                            }
                            y2 = motionEvent.getY();
                            if (c12396.f37174 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c12396.f37219;
                            if (y2 < f) {
                                c12396.f37174 = -C12392.m30184((int) (f - y2));
                                if (z2) {
                                    c12396.f37224 = SystemClock.uptimeMillis();
                                }
                                c12396.postInvalidateOnAnimation();
                            } else {
                                f2 = c12396.f37201;
                                if (y2 > f2) {
                                    c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                    if (z2) {
                                        c12396.f37224 = SystemClock.uptimeMillis();
                                    }
                                    c12396.postInvalidateOnAnimation();
                                } else {
                                    c12396.f37174 = 0;
                                }
                            }
                            fM24484 = c22686.m24484() / 2.0f;
                            paddingTop = c12396.f37201 - c12396.getPaddingTop();
                            if (c12396.f37307) {
                                if (y < fM24484) {
                                    y = fM24484;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c12396.m30425(x2, y);
                                return true;
                            }
                            f3 = y + this.f53099;
                            if (f3 >= fM24484) {
                                if (f3 > paddingTop) {
                                    fM24484 = paddingTop;
                                } else {
                                    fM24484 = f3;
                                }
                            }
                            if (c12396.f37204) {
                                c12396.m30496(x2 + this.f53100, fM24484);
                                return true;
                            }
                            c12396.m30476(x2 + this.f53100, fM24484);
                            return true;
                        }
                        if (action != 3) {
                            c12396.setPressed(false);
                            m40659(false);
                            c12396.m30520();
                            if (this.f53102) {
                                m40660();
                                c12394 = c12396.f37281;
                                if (c12394 != null) {
                                    c12394.f37215.m40660();
                                    ((View) c12396.getParent()).invalidate();
                                    interfaceC09710 = c12396.f37254;
                                    if (interfaceC09710 != null) {
                                        C12392.m30135(c12396, new Runnable() { // from class: l.۟ۛᩳ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = this.f22373;
                                                final InterfaceC0979 interfaceC09711 = interfaceC09710;
                                                C12392.m30135(c12394, new Runnable() { // from class: l.ᩳۨᩳ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C12392 c12397 = viewOnTouchListenerC17331.f53101;
                                                        int scrollX = c12397.getScrollX();
                                                        int iM30408 = c12397.m30408();
                                                        interfaceC09711.mo3444(scrollX, iM30408 - 1, scrollX, iM30408);
                                                    }
                                                });
                                            }
                                        });
                                        return true;
                                    }
                                }
                            } else {
                                if (!c12396.f37295) {
                                }
                                C12392.m30226(c12396);
                                c12396.f37307 = false;
                                c12396.f37204 = false;
                                c12396.f37267 = false;
                                c12396.f37291 = false;
                                c12396.f37295 = false;
                                c12396.m30162();
                                return true;
                            }
                        } else if (action != 5) {
                            this.f53108++;
                            if (c12396.f37267) {
                                this.f53086 = motionEvent.getPointerId(1);
                                this.f53103 = motionEvent.getX(1);
                                this.f53084 = motionEvent.getY(1);
                                return true;
                            }
                            if (c22686.f73227) {
                                m40664(motionEvent);
                                c12395 = c12396.f37281;
                                if (c12395 != null) {
                                    c12395.f37215.m40664(motionEvent);
                                    ((View) c12396.getParent()).invalidate();
                                }
                            }
                        } else if (action == 6) {
                            int action4 = (motionEvent.getAction() & 65280) >>> 8;
                            if (c12396.f37267) {
                                c12396.f37267 = false;
                            }
                            this.f53108--;
                        }
                    }
                    return c12396.f37257.m3331(motionEvent);
                }
                viewTreeObserverOnPreDrawListenerC8575Arr = c22810M30543.f73647;
                if (!viewTreeObserverOnPreDrawListenerC8575Arr[0].m22285() && !viewTreeObserverOnPreDrawListenerC8575Arr[1].m22285() && !viewTreeObserverOnPreDrawListenerC8575Arr[2].m22285()) {
                    if (this.f53098) {
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 1) {
                            m40654();
                        } else if (actionMasked != 2) {
                            x3 = motionEvent.getX() - this.f53092;
                            float y6 = motionEvent.getY() - this.f53107;
                            if (Math.abs(x3) <= this.f53085 || Math.abs(y6) > this.f53085) {
                                this.f53098 = false;
                                this.f53091 = true;
                                if (!c12396.isFocused()) {
                                    c12396.requestFocus();
                                }
                                if (!this.f53080) {
                                    c12396.m30455(c12396.m30444(), this.f53095);
                                    c12396.m30227();
                                    this.f53080 = true;
                                }
                                c12396.f37219 = Math.min(c22686.m24484() + c12396.getPaddingTop(), this.f53107);
                                c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c22686.m24484(), this.f53107);
                                c12396.f37174 = 0;
                                c12396.f37263 = 0L;
                                c22810 = c12396.f37181;
                                if (c22810 != null) {
                                    c22810.m50904();
                                }
                                c12396.invalidate();
                                m40659(true);
                                this.f53087 = true;
                                c12396.f37257.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                m40656(motionEvent);
                                return true;
                            }
                        } else if (actionMasked == 3) {
                            m40654();
                        }
                    }
                    action = motionEvent.getAction() & 255;
                    if (action != 0) {
                        c12396.setPressed(true);
                        c12396.m30443();
                        if (!c12396.isFocused()) {
                            c12396.invalidate();
                        }
                        this.f53082 = true;
                        if (c12396.mo25925()) {
                            m40659(true);
                        }
                        this.f53102 = false;
                        this.f53108 = 0;
                        this.f53105 = (c12396.getScrollX() + ((int) motionEvent.getX())) - c12396.getPaddingLeft();
                        this.f53106 = (c12396.m30408() + ((int) motionEvent.getY())) - c12396.getPaddingTop();
                        this.f53081 = false;
                        iM30444 = c12396.m30444();
                        iM30448 = c12396.m30448();
                        if (iM30444 > iM30448) {
                            iM30448 = iM30444;
                            iM30444 = iM30448;
                        }
                        fM9777 = c12396.f37258.m9777(motionEvent.getY());
                        abstractC3179 = c12396.f37258;
                        if (abstractC3179.f10029) {
                            c14793 = abstractC3179.f9999;
                            if (c14793.m35177(this.f53105, fM9777)) {
                                c12396.f37295 = true;
                                this.f53099 = c14793.f45166 - fM9777;
                                if (!c12396.f37285.isFinished()) {
                                    c12396.f37285.abortAnimation();
                                }
                                m40659(true);
                                c12396.invalidate();
                                return true;
                            }
                        }
                        abstractC31710 = c12396.f37258;
                        if (abstractC31710.f10028) {
                            c14792 = abstractC31710.f9997;
                            if (c14792.m35177(this.f53105, fM9777)) {
                                c12396.f37291 = true;
                                this.f53100 = c14792.f45163 - this.f53105;
                                if (!c12396.f37285.isFinished()) {
                                    c12396.f37285.abortAnimation();
                                }
                                m40659(true);
                                c12396.invalidate();
                                return true;
                            }
                        }
                        if (iM30444 == iM30448) {
                            rectF3 = c12396.f37258.f10004;
                            if (rectF3.contains(this.f53105, fM9777)) {
                                c12396.f37204 = true;
                                this.f53100 = ((rectF3.left + rectF3.right) / 2.0f) - this.f53105;
                                this.f53099 = (rectF3.top - fM9777) - (c22686.m24484() / 2.0f);
                                c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                c12396.f37174 = 0;
                                m40659(true);
                                return true;
                            }
                        } else {
                            rectF = c12396.f37258.f10032;
                            if (rectF.contains(this.f53105, fM9777)) {
                                rectF2 = c12396.f37258.f10010;
                                if (rectF2.contains(this.f53105, fM9777)) {
                                    c12396.f37267 = true;
                                    c12396.f37313 = iM30444;
                                    float f10 = rectF2.left;
                                    this.f53100 = (((rectF2.right - f10) / 4.0f) + f10) - this.f53105;
                                    this.f53099 = (rectF2.top - fM9777) - (c22686.m24484() / 2.0f);
                                    c12396.f37308 = false;
                                    c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                    c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                    c12396.f37174 = 0;
                                    m40659(true);
                                    return true;
                                }
                            } else {
                                c12396.f37267 = true;
                                c12396.f37313 = iM30448;
                                float f11 = rectF.left;
                                this.f53100 = ((((rectF.right - f11) * 3.0f) / 4.0f) + f11) - this.f53105;
                                this.f53099 = (rectF.top - fM9777) - (c22686.m24484() / 2.0f);
                                c12396.f37308 = true;
                                c12396.f37219 = Math.min(c22686.m24484() + (c12396.m30459() / 2.0f) + c12396.getPaddingTop(), motionEvent.getY());
                                c12396.f37201 = Math.max((c12396.getHeight() - c12396.getPaddingBottom()) - c12396.m30459(), motionEvent.getY());
                                c12396.f37174 = 0;
                                m40659(true);
                                return true;
                            }
                        }
                        if (c22686.f73285 && C12392.m30214(motionEvent) && (motionEvent.getButtonState() & 1) != 0 && !c12396.f37258.mo9770()) {
                            x = motionEvent.getX();
                            if (c12396.m30257(x, motionEvent.getY())) {
                                z = false;
                            } else {
                                z = !c12396.m30264((x + c12396.getScrollX()) - c12396.getPaddingLeft());
                            }
                            if (z) {
                                this.f53098 = true;
                                this.f53091 = false;
                                this.f53080 = false;
                                this.f53095 = c12396.f37258.m9760(this.f53105, this.f53106);
                                this.f53092 = motionEvent.getX();
                                this.f53107 = motionEvent.getY();
                            }
                        }
                    } else if (action != 1) {
                        c12396.setPressed(false);
                        m40659(false);
                        c12396.m30520();
                        if (this.f53102) {
                            m40660();
                            c12392 = c12396.f37281;
                            if (c12392 != null) {
                                c12392.f37215.m40660();
                                ((View) c12396.getParent()).invalidate();
                                interfaceC0979 = c12396.f37254;
                                if (interfaceC0979 != null) {
                                    C12392.m30135(c12396, new Runnable() { // from class: l.֫ۨᩳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = this.f6236;
                                            final InterfaceC0979 interfaceC09711 = interfaceC0979;
                                            C12392.m30135(c12392, new Runnable() { // from class: l.ܽۨᩳ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C12392 c12397 = viewOnTouchListenerC17331.f53101;
                                                    int scrollX = c12397.getScrollX();
                                                    int iM30408 = c12397.m30408();
                                                    interfaceC09711.mo3444(scrollX, iM30408 - 1, scrollX, iM30408);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c12396.f37204 || c12396.f37267 || c12396.f37307) {
                                c12396.m30162();
                                if (c12396.f37204) {
                                    c12396.m30299(-1);
                                } else if (!c12396.f37267 || c12396.f37307) {
                                    iM30445 = c12396.m30444();
                                    iM30449 = c12396.m30448();
                                    if (iM30445 > iM30449) {
                                        iM30449 = iM30445;
                                        iM30445 = iM30449;
                                    }
                                    if (!c12396.f37308) {
                                        iM30445 = iM30449;
                                    }
                                    c12396.m30299(iM30445);
                                }
                                c12396.f37307 = false;
                                c12396.f37204 = false;
                                c12396.f37267 = false;
                                c12396.f37263 = SystemClock.uptimeMillis();
                                return true;
                            }
                            if (c12396.f37295) {
                                C12392.m30226(c12396);
                                c12396.m30453();
                                if (C12392.m30214(motionEvent)) {
                                    C12392.m30132(c12396, 1, motionEvent);
                                    return true;
                                }
                            } else if (c12396.f37291) {
                                c12396.f37291 = false;
                                c12396.m30442();
                                if (C12392.m30214(motionEvent)) {
                                    C12392.m30132(c12396, 2, motionEvent);
                                }
                            } else {
                                c12396.f37263 = SystemClock.uptimeMillis();
                                c12396.invalidate();
                                C12392.m30288(c12396);
                            }
                        }
                    } else if (action != 2) {
                        m40663(motionEvent);
                        if (this.f53108 != 1) {
                            if (c12396.f37267) {
                                c12396.f37215.onScroll(null, null, (this.f53103 - motionEvent.getX(1)) - c12396.getPaddingLeft(), (this.f53084 - motionEvent.getY(1)) - c12396.getPaddingTop());
                                this.f53103 = motionEvent.getX(1);
                                this.f53084 = motionEvent.getY(1);
                            } else if (this.f53102) {
                                m40661(motionEvent);
                                c12393 = c12396.f37281;
                                if (c12393 != null) {
                                    c12393.f37215.m40661(motionEvent);
                                    ((View) c12396.getParent()).invalidate();
                                    return true;
                                }
                            }
                            if (!c12396.f37204) {
                                x2 = motionEvent.getX() - c12396.getPaddingLeft();
                                y = motionEvent.getY() - c12396.getPaddingTop();
                                if (!this.f53081) {
                                    i = (int) (x2 - this.f53105);
                                    int i15 = (int) (y - this.f53106);
                                    if (Math.abs(i) <= this.f53085) {
                                    }
                                    this.f53081 = true;
                                }
                                y2 = motionEvent.getY();
                                if (c12396.f37174 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                f = c12396.f37219;
                                if (y2 < f) {
                                    c12396.f37174 = -C12392.m30184((int) (f - y2));
                                    if (z2) {
                                        c12396.f37224 = SystemClock.uptimeMillis();
                                    }
                                    c12396.postInvalidateOnAnimation();
                                } else {
                                    f2 = c12396.f37201;
                                    if (y2 > f2) {
                                        c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                        if (z2) {
                                            c12396.f37224 = SystemClock.uptimeMillis();
                                        }
                                        c12396.postInvalidateOnAnimation();
                                    } else {
                                        c12396.f37174 = 0;
                                    }
                                }
                                fM24484 = c22686.m24484() / 2.0f;
                                paddingTop = c12396.f37201 - c12396.getPaddingTop();
                                if (c12396.f37307) {
                                    if (y < fM24484) {
                                        y = fM24484;
                                    } else if (y > paddingTop) {
                                        y = paddingTop;
                                    }
                                    c12396.m30425(x2, y);
                                    return true;
                                }
                                f3 = y + this.f53099;
                                if (f3 >= fM24484) {
                                    if (f3 > paddingTop) {
                                        fM24484 = paddingTop;
                                    } else {
                                        fM24484 = f3;
                                    }
                                }
                                if (c12396.f37204) {
                                    c12396.m30496(x2 + this.f53100, fM24484);
                                    return true;
                                }
                                c12396.m30476(x2 + this.f53100, fM24484);
                                return true;
                            }
                            x2 = motionEvent.getX() - c12396.getPaddingLeft();
                            y = motionEvent.getY() - c12396.getPaddingTop();
                            if (!this.f53081) {
                                i = (int) (x2 - this.f53105);
                                int i16 = (int) (y - this.f53106);
                                if (Math.abs(i) <= this.f53085) {
                                }
                                this.f53081 = true;
                            }
                            y2 = motionEvent.getY();
                            if (c12396.f37174 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c12396.f37219;
                            if (y2 < f) {
                                c12396.f37174 = -C12392.m30184((int) (f - y2));
                                if (z2) {
                                    c12396.f37224 = SystemClock.uptimeMillis();
                                }
                                c12396.postInvalidateOnAnimation();
                            } else {
                                f2 = c12396.f37201;
                                if (y2 > f2) {
                                    c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                    if (z2) {
                                        c12396.f37224 = SystemClock.uptimeMillis();
                                    }
                                    c12396.postInvalidateOnAnimation();
                                } else {
                                    c12396.f37174 = 0;
                                }
                            }
                            fM24484 = c22686.m24484() / 2.0f;
                            paddingTop = c12396.f37201 - c12396.getPaddingTop();
                            if (c12396.f37307) {
                                if (y < fM24484) {
                                    y = fM24484;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c12396.m30425(x2, y);
                                return true;
                            }
                            f3 = y + this.f53099;
                            if (f3 >= fM24484) {
                                if (f3 > paddingTop) {
                                    fM24484 = paddingTop;
                                } else {
                                    fM24484 = f3;
                                }
                            }
                            if (c12396.f37204) {
                                c12396.m30496(x2 + this.f53100, fM24484);
                                return true;
                            }
                            c12396.m30476(x2 + this.f53100, fM24484);
                            return true;
                        }
                        if (!c12396.f37204 || c12396.f37267 || c12396.f37307) {
                            x2 = motionEvent.getX() - c12396.getPaddingLeft();
                            y = motionEvent.getY() - c12396.getPaddingTop();
                            if (!this.f53081) {
                                i = (int) (x2 - this.f53105);
                                int i17 = (int) (y - this.f53106);
                                if (Math.abs(i) <= this.f53085 || Math.abs(i17) > this.f53085) {
                                    this.f53081 = true;
                                }
                            }
                            y2 = motionEvent.getY();
                            if (c12396.f37174 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            f = c12396.f37219;
                            if (y2 < f) {
                                c12396.f37174 = -C12392.m30184((int) (f - y2));
                                if (z2) {
                                    c12396.f37224 = SystemClock.uptimeMillis();
                                }
                                c12396.postInvalidateOnAnimation();
                            } else {
                                f2 = c12396.f37201;
                                if (y2 > f2) {
                                    c12396.f37174 = C12392.m30184((int) (y2 - f2));
                                    if (z2) {
                                        c12396.f37224 = SystemClock.uptimeMillis();
                                    }
                                    c12396.postInvalidateOnAnimation();
                                } else {
                                    c12396.f37174 = 0;
                                }
                            }
                            fM24484 = c22686.m24484() / 2.0f;
                            paddingTop = c12396.f37201 - c12396.getPaddingTop();
                            if (c12396.f37307) {
                                if (y < fM24484) {
                                    y = fM24484;
                                } else if (y > paddingTop) {
                                    y = paddingTop;
                                }
                                c12396.m30425(x2, y);
                                return true;
                            }
                            f3 = y + this.f53099;
                            if (f3 >= fM24484) {
                                if (f3 > paddingTop) {
                                    fM24484 = paddingTop;
                                } else {
                                    fM24484 = f3;
                                }
                            }
                            if (c12396.f37204) {
                                c12396.m30496(x2 + this.f53100, fM24484);
                                return true;
                            }
                            c12396.m30476(x2 + this.f53100, fM24484);
                            return true;
                        }
                        float f12 = 1.0f;
                        if (c12396.f37295) {
                            float y7 = ((motionEvent.getY() - c12396.getPaddingTop()) + this.f53099) / (c12396.m30542() - c22686.f73288);
                            if (y7 < 0.0f) {
                                f12 = 0.0f;
                            } else if (y7 <= 1.0f) {
                                f12 = y7;
                            }
                            int iM30528 = (int) (c12396.m30528() * f12);
                            if (iM30528 != c12396.m30408()) {
                                c12396.scrollTo(c12396.getScrollX(), iM30528);
                                c12396.f37193 = SystemClock.uptimeMillis();
                                c12396.f37207.removeMessages(6);
                                c12396.f37207.sendEmptyMessageDelayed(6, 100L);
                                return true;
                            }
                        } else if (c12396.f37291) {
                            int i18 = (c22686.f73263 && c22686.f73264) ? c12396.f37258.f10000 : 0;
                            if (i18 != 0 && c22686.f73291) {
                                i2 = i18;
                            }
                            float x5 = (((motionEvent.getX() - i2) - c12396.getPaddingLeft()) + this.f53100) / ((c12396.m30394() - i18) - c22686.f73288);
                            if (x5 < 0.0f) {
                                f12 = 0.0f;
                            } else if (x5 <= 1.0f) {
                                f12 = x5;
                            }
                            int iM30463 = (int) (c12396.m30463() * f12);
                            if (iM30463 != c12396.getScrollX()) {
                                c12396.scrollTo(iM30463, c12396.m30408());
                                return true;
                            }
                        }
                    } else if (action != 3) {
                        c12396.setPressed(false);
                        m40659(false);
                        c12396.m30520();
                        if (this.f53102) {
                            m40660();
                            c12394 = c12396.f37281;
                            if (c12394 != null) {
                                c12394.f37215.m40660();
                                ((View) c12396.getParent()).invalidate();
                                interfaceC09710 = c12396.f37254;
                                if (interfaceC09710 != null) {
                                    C12392.m30135(c12396, new Runnable() { // from class: l.۟ۛᩳ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = this.f22373;
                                            final InterfaceC0979 interfaceC09711 = interfaceC09710;
                                            C12392.m30135(c12394, new Runnable() { // from class: l.ᩳۨᩳ
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C12392 c12397 = viewOnTouchListenerC17331.f53101;
                                                    int scrollX = c12397.getScrollX();
                                                    int iM30408 = c12397.m30408();
                                                    interfaceC09711.mo3444(scrollX, iM30408 - 1, scrollX, iM30408);
                                                }
                                            });
                                        }
                                    });
                                    return true;
                                }
                            }
                        } else {
                            if (!c12396.f37295 || c12396.f37291 || c12396.f37267 || c12396.f37204 || c12396.f37307) {
                                C12392.m30226(c12396);
                                c12396.f37307 = false;
                                c12396.f37204 = false;
                                c12396.f37267 = false;
                                c12396.f37291 = false;
                                c12396.f37295 = false;
                                c12396.m30162();
                                return true;
                            }
                            C12392.m30288(c12396);
                        }
                    } else if (action != 5) {
                        this.f53108++;
                        if (c12396.f37267) {
                            this.f53086 = motionEvent.getPointerId(1);
                            this.f53103 = motionEvent.getX(1);
                            this.f53084 = motionEvent.getY(1);
                            return true;
                        }
                        if (c22686.f73227 && !this.f53102) {
                            m40664(motionEvent);
                            c12395 = c12396.f37281;
                            if (c12395 != null) {
                                c12395.f37215.m40664(motionEvent);
                                ((View) c12396.getParent()).invalidate();
                            }
                        }
                    } else if (action == 6) {
                        int action5 = (motionEvent.getAction() & 65280) >>> 8;
                        if (c12396.f37267 && action5 != this.f53086) {
                            c12396.f37267 = false;
                        }
                        this.f53108--;
                    }
                    return c12396.f37257.m3331(motionEvent);
                }
            }
        } else {
            try {
                c12396.f37228.m11968(motionEvent);
                if (actionMasked3 == i || actionMasked3 == i) {
                    return true;
                }
            } finally {
                if (actionMasked3 == 1 || actionMasked3 == 3) {
                    c12396.f37228 = null;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m40664(MotionEvent motionEvent) {
        this.f53096 = m40662(motionEvent);
        this.f53102 = true;
        this.f53081 = false;
        C12392 c12392 = this.f53101;
        this.f53083 = c12392.f37245.f29058.getTextSize();
        this.f53089 = c12392.getScrollX();
        this.f53088 = c12392.m30408();
        if (c12392.f37295 || c12392.f37291 || c12392.f37204 || c12392.f37307) {
            c12392.m30162();
            C12392.m30226(c12392);
            c12392.f37307 = false;
            c12392.f37204 = false;
            c12392.f37291 = false;
            c12392.f37295 = false;
            return;
        }
        c12392.f37257.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40661(MotionEvent motionEvent) {
        float f;
        C12392 c12392 = this.f53101;
        C22686 c22686 = c12392.f37245;
        float fM40662 = m40662(motionEvent);
        if (!this.f53081) {
            if (Math.abs(fM40662 - this.f53096) <= this.f53085) {
                return;
            } else {
                this.f53081 = true;
            }
        }
        float f2 = fM40662 / this.f53096;
        float textSize = c22686.f29058.getTextSize();
        if (c22686.m50689(this.f53083 * f2)) {
            float textSize2 = c22686.f29058.getTextSize() / this.f53083;
            c12392.f37258.mo8154(textSize);
            float fM30528 = 0.0f;
            if (c12392.f37258.mo8160()) {
                float x = ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f) - c12392.getPaddingLeft();
                f = ((this.f53089 + x) * textSize2) - x;
                if (f < 0.0f) {
                    f = 0.0f;
                } else {
                    float fM30463 = c12392.m30463();
                    if (f > fM30463) {
                        f = fM30463;
                    }
                }
            } else {
                f = 0.0f;
            }
            float y = ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f) - c12392.getPaddingTop();
            float f3 = ((this.f53088 + y) * textSize2) - y;
            if (f3 >= 0.0f) {
                fM30528 = c12392.m30528();
                if (f3 <= fM30528) {
                    fM30528 = f3;
                }
            }
            c12392.m30392((int) f, (int) fM30528);
            c12392.invalidate();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40660() {
        if (this.f53081) {
            C12392 c12392 = this.f53101;
            c12392.m30376();
            c12392.f37258.mo8173();
            c12392.m30289();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static float m40662(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }
}
