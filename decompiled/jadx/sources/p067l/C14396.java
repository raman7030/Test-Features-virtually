package p067l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;

/* JADX INFO: renamed from: l.۫᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14396 {

    /* JADX INFO: renamed from: ֫ */
    public Bitmap f41143;

    /* JADX INFO: renamed from: ۧ */
    public Canvas f41144;

    /* JADX INFO: renamed from: ܳ */
    public LinearGradient f41145;

    /* JADX INFO: renamed from: ܽ */
    public float f41146;

    /* JADX INFO: renamed from: ܿ */
    public Rect f41147;

    /* JADX INFO: renamed from: ᩳ */
    public final Paint f41148 = new Paint();

    /* JADX INFO: renamed from: ֫ */
    public final void m33012(Rect rect, float f) {
        if (!rect.equals(this.f41147)) {
            this.f41147 = rect;
            Bitmap bitmap = this.f41143;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f41143 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f41144 = new Canvas(this.f41143);
            this.f41145 = new LinearGradient(0.0f, 0.0f, 0.0f, rect.height(), -1, -16777216, Shader.TileMode.CLAMP);
        } else if (f == this.f41146) {
            return;
        }
        this.f41146 = f;
        ComposeShader composeShader = new ComposeShader(this.f41145, new LinearGradient(0.0f, 0.0f, rect.width(), 0.0f, -1, Color.HSVToColor(new float[]{f, 1.0f, 1.0f}), Shader.TileMode.CLAMP), PorterDuff.Mode.MULTIPLY);
        Paint paint = this.f41148;
        paint.setShader(composeShader);
        this.f41144.drawRect(0.0f, 0.0f, rect.width(), rect.height(), paint);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33011(Canvas canvas) {
        canvas.drawBitmap(this.f41143, (Rect) null, this.f41147, (Paint) null);
    }
}
