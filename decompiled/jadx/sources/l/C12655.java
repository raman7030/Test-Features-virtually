package l;

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
public final class C12655 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f38115;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Canvas f38116;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public LinearGradient f38117;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f38118;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Rect f38119;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Paint f38120 = new Paint();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30934(Rect rect, float f) {
        if (!rect.equals(this.f38119)) {
            this.f38119 = rect;
            Bitmap bitmap = this.f38115;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.f38115 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f38116 = new Canvas(this.f38115);
            this.f38117 = new LinearGradient(0.0f, 0.0f, 0.0f, rect.height(), -1, -16777216, Shader.TileMode.CLAMP);
        } else if (f == this.f38118) {
            return;
        }
        this.f38118 = f;
        ComposeShader composeShader = new ComposeShader(this.f38117, new LinearGradient(0.0f, 0.0f, rect.width(), 0.0f, -1, Color.HSVToColor(new float[]{f, 1.0f, 1.0f}), Shader.TileMode.CLAMP), PorterDuff.Mode.MULTIPLY);
        Paint paint = this.f38120;
        paint.setShader(composeShader);
        this.f38116.drawRect(0.0f, 0.0f, rect.width(), rect.height(), paint);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30933(Canvas canvas) {
        canvas.drawBitmap(this.f38115, (Rect) null, this.f38119, (Paint) null);
    }
}
