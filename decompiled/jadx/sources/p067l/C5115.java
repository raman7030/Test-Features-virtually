package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۗ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7IM */
/* JADX INFO: loaded from: classes2.dex */
public class C5115 extends View {

    /* JADX INFO: renamed from: ۗ */
    public C7797 f12019;

    /* JADX INFO: renamed from: ۙ */
    public MotionEvent f12020;

    /* JADX INFO: renamed from: ۛ */
    public float f12021;

    /* JADX INFO: renamed from: ۤ */
    public float f12022;

    /* JADX INFO: renamed from: ۫ */
    public final float f12023;

    /* JADX INFO: renamed from: ۬ */
    public final int[] f12024;

    /* JADX INFO: renamed from: ᩶ */
    public View f12025;

    /* JADX INFO: renamed from: ᩸ */
    public int f12026;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC18226 f12027;

    public C5115(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5115(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12024 = new int[2];
        this.f12023 = ViewConfiguration.get(context).getScaledTouchSlop();
        setFocusable(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10902(C7797 c7797, InterfaceC18226 interfaceC18226, View view) {
        this.f12019 = c7797;
        this.f12027 = interfaceC18226;
        this.f12025 = view;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[PHI: r0
      0x0073: PHI (r0v18 android.view.MotionEvent) = (r0v17 android.view.MotionEvent), (r0v21 android.view.MotionEvent) binds: [B:33:0x0071, B:30:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7797 c7797;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            MotionEvent motionEvent3 = this.f12020;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
                this.f12020 = null;
            }
            this.f12026 = 0;
            InterfaceC18226 interfaceC18226 = this.f12027;
            if ((interfaceC18226 != null && interfaceC18226.mo22048(motionEvent.getRawX(), motionEvent.getRawY())) || (c7797 = this.f12019) == null || c7797.getVisibility() != 0) {
                return false;
            }
            this.f12022 = motionEvent.getRawX();
            this.f12021 = motionEvent.getRawY();
            this.f12020 = MotionEvent.obtain(motionEvent);
            m10901(this.f12025, motionEvent);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i = this.f12026;
                if (i == 1 || i == 2) {
                    return m10900(motionEvent);
                }
                float fAbs = Math.abs(motionEvent.getRawX() - this.f12022);
                float fAbs2 = Math.abs(motionEvent.getRawY() - this.f12021);
                if (Math.max(fAbs, fAbs2) <= this.f12023) {
                    return true;
                }
                if (fAbs2 > fAbs) {
                    this.f12026 = 1;
                    View view = this.f12025;
                    if (view != null && view.getVisibility() == 0) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                        m10901(this.f12025, motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    MotionEvent motionEvent4 = this.f12020;
                    if (motionEvent4 != null) {
                        m10901(this.f12019, motionEvent4);
                        motionEvent2 = this.f12020;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f12020 = null;
                        }
                    }
                } else {
                    this.f12026 = 2;
                    motionEvent2 = this.f12020;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                        this.f12020 = null;
                    }
                }
                return m10900(motionEvent);
            }
            if (actionMasked != 3) {
                return m10900(motionEvent);
            }
        }
        if (this.f12026 == 0) {
            this.f12026 = 2;
        }
        boolean zM10900 = m10900(motionEvent);
        MotionEvent motionEvent5 = this.f12020;
        if (motionEvent5 != null) {
            motionEvent5.recycle();
            this.f12020 = null;
        }
        this.f12026 = 0;
        return zM10900;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m10900(MotionEvent motionEvent) {
        int i = this.f12026;
        if (i == 1) {
            return m10901(this.f12019, motionEvent);
        }
        if (i == 2) {
            return m10901(this.f12025, motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m10901(View view, MotionEvent motionEvent) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr = this.f12024;
        view.getLocationOnScreen(iArr);
        motionEventObtain.offsetLocation((motionEvent.getRawX() - iArr[0]) - motionEvent.getX(), (motionEvent.getRawY() - iArr[1]) - motionEvent.getY());
        boolean zDispatchTouchEvent = view.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zDispatchTouchEvent;
    }
}
