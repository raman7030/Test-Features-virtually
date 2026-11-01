package p067l;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;

/* JADX INFO: renamed from: l.ۙ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N933 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7020 {

    /* JADX INFO: renamed from: ֫ */
    public int f18288;

    /* JADX INFO: renamed from: ۧ */
    public final Paint f18289 = new Paint();

    /* JADX INFO: renamed from: ܽ */
    public Rect f18290;

    /* JADX INFO: renamed from: ֫ */
    public final void m16151(int i, Rect rect) {
        if (rect.equals(this.f18290) && i == this.f18288) {
            return;
        }
        this.f18290 = rect;
        this.f18288 = i;
        float f = rect.left;
        int i2 = rect.top;
        this.f18289.setShader(new LinearGradient(f, i2, rect.right, i2, i & 16777215, i | (-16777216), Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16152(Canvas canvas) {
        canvas.drawRect(this.f18290, this.f18289);
    }
}
