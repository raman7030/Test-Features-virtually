package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ۜۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U14P */
/* JADX INFO: loaded from: classes3.dex */
public class C6659 extends C0452 {

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f20676;

    public C6659(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20676 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18195(boolean z) {
        this.f20676 = z;
    }

    @Override // l.C0452, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f20676) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // l.C0452, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f20676) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
