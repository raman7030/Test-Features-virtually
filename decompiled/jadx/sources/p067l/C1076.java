package p067l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: l.ۙܶ */
/* JADX INFO: compiled from: B1CI */
/* JADX INFO: loaded from: classes2.dex */
public final class C1076 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1496 f17791;

    public C1076(C1496 c1496) {
        this.f17791 = c1496;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1496 c1496 = this.f17791;
        outline.setRoundRect(0, 0, c1496.getWidth(), c1496.getHeight(), c1496.f42475);
    }
}
