package p067l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۜۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U14P */
/* JADX INFO: loaded from: classes3.dex */
public class C8697 extends C2798 {

    /* JADX INFO: renamed from: ۟֫ */
    public boolean f23552;

    public C8697(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23552 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20143(boolean z) {
        this.f23552 = z;
    }

    @Override // p067l.C2798, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23552) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // p067l.C2798, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f23552) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
