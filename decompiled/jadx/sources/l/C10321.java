package l;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: l.ۤܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S207 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10321 extends ClickableSpan {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f31066;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f31067;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14369 f31068;

    public C10321(int i, C14369 c14369, int i2) {
        this.f31066 = i;
        this.f31068 = c14369;
        this.f31067 = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f31066);
        this.f31068.m34276(this.f31067, bundle);
    }
}
