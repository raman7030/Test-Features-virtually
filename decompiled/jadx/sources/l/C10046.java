package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ۤۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10046 implements InterfaceC16233 {
    @Override // l.InterfaceC16233
    public final Object invoke(Object obj) {
        AbstractC3577 abstractC3577 = (AbstractC3577) obj;
        C11233.m27805(abstractC3577, "cfg");
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(abstractC3577.getName()).append('\n');
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append((CharSequence) abstractC3577.mo6370());
        int length2 = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(C21943.f70269), length, length2, 17);
        spannableStringBuilderAppend.setSpan(new RelativeSizeSpan(0.66f), length, length2, 17);
        return spannableStringBuilderAppend;
    }
}
