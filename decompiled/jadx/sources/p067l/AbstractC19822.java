package p067l;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ᩳ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3PE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19822 {
    public Animatable2.AnimationCallback mPlatformCallback;

    public void onAnimationEnd(Drawable drawable) {
    }

    public void onAnimationStart(Drawable drawable) {
    }

    public Animatable2.AnimationCallback getPlatformCallback() {
        if (this.mPlatformCallback == null) {
            this.mPlatformCallback = new C18480(this);
        }
        return this.mPlatformCallback;
    }
}
