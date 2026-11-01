package p067l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ۙۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5LW */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC6685 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩺ */
    public static final int f17317 = C13076.m29939(33.0f);

    /* JADX INFO: renamed from: ۗ */
    public float f17318;

    /* JADX INFO: renamed from: ۙ */
    public float f17319;

    /* JADX INFO: renamed from: ۛ */
    public boolean f17320;

    /* JADX INFO: renamed from: ۤ */
    public boolean f17321;

    /* JADX INFO: renamed from: ۨ */
    public boolean f17322 = true;

    /* JADX INFO: renamed from: ۫ */
    public int f17323;

    /* JADX INFO: renamed from: ۬ */
    public ListView f17324;

    /* JADX INFO: renamed from: ᩶ */
    public View f17325;

    /* JADX INFO: renamed from: ᩸ */
    public final C14084 f17326;

    /* JADX INFO: renamed from: ᩹ */
    public int f17327;

    public ViewOnTouchListenerC6685(C14084 c14084, C11400 c11400) {
        if (c11400 != null) {
            this.f17324 = c11400;
            if (this.f17323 == 0) {
                this.f17323 = ViewConfiguration.get(c11400.getContext()).getScaledTouchSlop();
            }
        }
        this.f17326 = c14084;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        if (!this.f17324.isEnabled()) {
            m15237();
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        C14084 c14084 = this.f17326;
        if (actionMasked != 0) {
            int i = f17317;
            if (actionMasked == 1) {
                if (this.f17321 && (view2 = this.f17325) != null) {
                    view2.scrollTo(0, 0);
                    if (Math.abs((int) ((motionEvent.getX() - this.f17319) * 0.75f)) >= i) {
                        c14084.m31978(this.f17327, this.f17325);
                    }
                }
                m15237();
                return false;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.f17321 && (view3 = this.f17325) != null) {
                        view3.scrollTo(0, 0);
                    }
                    m15237();
                    return false;
                }
            } else if (this.f17325 != null) {
                int x = (int) ((motionEvent.getX() - this.f17319) * 0.75f);
                int y = (int) (motionEvent.getY() - this.f17318);
                if (!this.f17320 && Math.abs(x) > this.f17323) {
                    if (Math.abs(y) < this.f17323) {
                        this.f17321 = true;
                        this.f17324.requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        this.f17324.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    } else {
                        this.f17320 = true;
                    }
                }
                if (this.f17321) {
                    int i2 = -i;
                    if (x <= i2) {
                        if (this.f17322) {
                            c14084.m31986();
                            this.f17322 = false;
                        }
                        x = i2;
                    } else if (x >= i) {
                        if (this.f17322) {
                            c14084.m31986();
                            this.f17322 = false;
                        }
                        x = i;
                    } else {
                        this.f17322 = true;
                    }
                    float fAbs = Math.abs(x) / i;
                    if (fAbs < 0.0f) {
                        fAbs = 0.0f;
                    } else if (fAbs > 1.0f) {
                        fAbs = 1.0f;
                    }
                    this.f17325.scrollTo(-((int) (((float) Math.sin(fAbs * 1.5707964f)) * x)), 0);
                    return true;
                }
            }
        } else {
            m15237();
            Rect rect = new Rect();
            int childCount = this.f17324.getChildCount();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f17324.getChildAt(i3);
                rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                if (rect.contains(x2, y2)) {
                    this.f17325 = childAt;
                    break;
                }
            }
            View view4 = this.f17325;
            if (view4 != null) {
                try {
                    int positionForView = this.f17324.getPositionForView(view4);
                    this.f17327 = positionForView;
                    if (c14084.m31982(positionForView)) {
                        this.f17319 = motionEvent.getX();
                        this.f17318 = motionEvent.getY();
                        return false;
                    }
                    this.f17325 = null;
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15237() {
        this.f17319 = 0.0f;
        this.f17318 = 0.0f;
        this.f17327 = -1;
        this.f17325 = null;
        this.f17321 = false;
        this.f17320 = false;
        this.f17322 = true;
    }
}
