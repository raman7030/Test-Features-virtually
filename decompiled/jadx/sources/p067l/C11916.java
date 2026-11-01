package p067l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ۤۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11916 implements InterfaceC17797 {
    @Override // p067l.InterfaceC17797
    public final Object invoke(Object obj) {
        AbstractC5769 abstractC5769 = (AbstractC5769) obj;
        C13045.m29867(abstractC5769, "cfg");
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(abstractC5769.getName()).append('\n');
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append((CharSequence) abstractC5769.mo8543());
        int length2 = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.setSpan(new ForegroundColorSpan(C23223.f72980), length, length2, 17);
        spannableStringBuilderAppend.setSpan(new RelativeSizeSpan(0.66f), length, length2, 17);
        return spannableStringBuilderAppend;
    }
}
