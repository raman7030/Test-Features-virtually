package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۗ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7IM */
/* JADX INFO: loaded from: classes2.dex */
public class C2890 extends View {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C5712 f9221;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MotionEvent f9222;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f9223;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f9224;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f9225;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] f9226;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f9227;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9228;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC16685 f9229;

    public C2890(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2890(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9226 = new int[2];
        this.f9225 = ViewConfiguration.get(context).getScaledTouchSlop();
        setFocusable(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8835(C5712 c5712, InterfaceC16685 interfaceC16685, View view) {
        this.f9221 = c5712;
        this.f9229 = interfaceC16685;
        this.f9227 = view;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[PHI: r0
      0x0073: PHI (r0v18 android.view.MotionEvent) = (r0v17 android.view.MotionEvent), (r0v21 android.view.MotionEvent) binds: [B:33:0x0071, B:30:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C5712 c5712;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            MotionEvent motionEvent3 = this.f9222;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
                this.f9222 = null;
            }
            this.f9228 = 0;
            InterfaceC16685 interfaceC16685 = this.f9229;
            if ((interfaceC16685 != null && interfaceC16685.mo20073(motionEvent.getRawX(), motionEvent.getRawY())) || (c5712 = this.f9221) == null || c5712.getVisibility() != 0) {
                return false;
            }
            this.f9224 = motionEvent.getRawX();
            this.f9223 = motionEvent.getRawY();
            this.f9222 = MotionEvent.obtain(motionEvent);
            m8834(this.f9227, motionEvent);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i = this.f9228;
                if (i == 1 || i == 2) {
                    return m8833(motionEvent);
                }
                float fAbs = Math.abs(motionEvent.getRawX() - this.f9224);
                float fAbs2 = Math.abs(motionEvent.getRawY() - this.f9223);
                if (Math.max(fAbs, fAbs2) <= this.f9225) {
                    return true;
                }
                if (fAbs2 > fAbs) {
                    this.f9228 = 1;
                    View view = this.f9227;
                    if (view != null && view.getVisibility() == 0) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                        m8834(this.f9227, motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    MotionEvent motionEvent4 = this.f9222;
                    if (motionEvent4 != null) {
                        m8834(this.f9221, motionEvent4);
                        motionEvent2 = this.f9222;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f9222 = null;
                        }
                    }
                } else {
                    this.f9228 = 2;
                    motionEvent2 = this.f9222;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                        this.f9222 = null;
                    }
                }
                return m8833(motionEvent);
            }
            if (actionMasked != 3) {
                return m8833(motionEvent);
            }
        }
        if (this.f9228 == 0) {
            this.f9228 = 2;
        }
        boolean zM8833 = m8833(motionEvent);
        MotionEvent motionEvent5 = this.f9222;
        if (motionEvent5 != null) {
            motionEvent5.recycle();
            this.f9222 = null;
        }
        this.f9228 = 0;
        return zM8833;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m8833(MotionEvent motionEvent) {
        int i = this.f9228;
        if (i == 1) {
            return m8834(this.f9221, motionEvent);
        }
        if (i == 2) {
            return m8834(this.f9227, motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m8834(View view, MotionEvent motionEvent) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr = this.f9226;
        view.getLocationOnScreen(iArr);
        motionEventObtain.offsetLocation((motionEvent.getRawX() - iArr[0]) - motionEvent.getX(), (motionEvent.getRawY() - iArr[1]) - motionEvent.getY());
        boolean zDispatchTouchEvent = view.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zDispatchTouchEvent;
    }
}
