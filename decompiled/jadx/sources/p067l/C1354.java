package p067l;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: l.ۤܰ */
/* JADX INFO: compiled from: S207 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1354 extends ClickableSpan {

    /* JADX INFO: renamed from: ᩶ */
    public final int f34029;

    /* JADX INFO: renamed from: ᩸ */
    public final int f34030;

    /* JADX INFO: renamed from: ᩹ */
    public final C1555 f34031;

    public C1354(int i, C1555 c1555, int i2) {
        this.f34029 = i;
        this.f34031 = c1555;
        this.f34030 = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f34029);
        this.f34031.m36409(this.f34030, bundle);
    }
}
