package l;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: l.ۛۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5877 extends EdgeEffect {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f18027;

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5877(C12392 c12392, Context context) {
        super(context);
        this.f18027 = c12392;
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        canvas.drawColor(this.f18027.f37245.f73275);
        return false;
    }
}
