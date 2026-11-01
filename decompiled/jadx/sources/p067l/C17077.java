package p067l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ܶ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5ZZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17077 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C23114 f50484;

    public C17077(C23114 c23114) {
        this.f50484 = c23114;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = C23114.f72633;
        Rect rect = new Rect();
        this.f50484.f72635.roundOut(rect);
        outline.setRoundRect(rect, rect.width() / 2.0f);
    }
}
