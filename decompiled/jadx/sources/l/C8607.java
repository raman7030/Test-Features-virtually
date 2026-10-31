package l;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: renamed from: l.ۡۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8607 extends URLSpan {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12881 f26307;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f26308;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC21098 f26309;

    public C8607(C12881 c12881, String str, InterfaceC21098 interfaceC21098) {
        super(str);
        this.f26307 = c12881;
        this.f26308 = str;
        this.f26309 = interfaceC21098;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f26309.mo24842(view, this.f26308);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f26307.m31317(textPaint);
    }
}
