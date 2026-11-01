package p067l;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: renamed from: l.ۡۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10548 extends URLSpan {

    /* JADX INFO: renamed from: ᩶ */
    public final C14610 f29223;

    /* JADX INFO: renamed from: ᩸ */
    public final String f29224;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC22420 f29225;

    public C10548(C14610 c14610, String str, InterfaceC22420 interfaceC22420) {
        super(str);
        this.f29223 = c14610;
        this.f29224 = str;
        this.f29225 = interfaceC22420;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f29225.mo26857(view, this.f29224);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f29223.m33403(textPaint);
    }
}
