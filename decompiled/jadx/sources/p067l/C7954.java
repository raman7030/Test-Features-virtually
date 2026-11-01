package p067l;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: l.ۛۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final class C7954 extends EdgeEffect {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14146 f20880;

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7954(C14146 c14146, Context context) {
        super(context);
        this.f20880 = c14146;
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        canvas.drawColor(this.f20880.f40262.f76000);
        return false;
    }
}
