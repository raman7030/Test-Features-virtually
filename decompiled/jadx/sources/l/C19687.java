package l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M903 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19687 extends AbstractC16157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TextView.BufferType f63598;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f63599;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1484 f63600;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13335 f63601;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f63602;

    public C19687(TextView.BufferType bufferType, C1484 c1484, C13335 c13335, List list, boolean z) {
        this.f63598 = bufferType;
        this.f63600 = c1484;
        this.f63601 = c13335;
        this.f63602 = list;
        this.f63599 = z;
    }

    @Override // l.AbstractC16157
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC0197 mo38088(String str) {
        Iterator it = this.f63602.iterator();
        while (it.hasNext()) {
            str = ((InterfaceC5575) it.next()).mo15839(str);
        }
        return this.f63600.m5145(str);
    }

    @Override // l.AbstractC16157
    /* JADX INFO: renamed from: ֫ */
    public final Spanned mo38087(TextView textView, AbstractC0197 abstractC0197) {
        List list = this.f63602;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC5575) it.next()).mo15843(textView);
        }
        C13335 c13335 = this.f63601;
        InterfaceC3458 interfaceC3458M26416 = ((C10514) c13335.f39898).m26416(c13335.f39899, new C7691());
        abstractC0197.mo1345(interfaceC3458M26416);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC5575) it2.next()).mo15333(interfaceC3458M26416);
        }
        return ((C6280) interfaceC3458M26416).builder().m41751();
    }

    @Override // l.AbstractC16157
    /* JADX INFO: renamed from: ֫ */
    public final void mo38090(TextView textView, String str) {
        Spanned spannedMo38087 = mo38087(textView, mo38088(str));
        if (TextUtils.isEmpty(spannedMo38087) && this.f63599 && !TextUtils.isEmpty(str)) {
            spannedMo38087 = new SpannableStringBuilder(str);
        }
        mo38089(textView, (SpannableStringBuilder) spannedMo38087);
    }

    @Override // l.AbstractC16157
    /* JADX INFO: renamed from: ֫ */
    public final void mo38089(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        List list = this.f63602;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC5575) it.next()).mo9849(textView, spannableStringBuilder);
        }
        textView.setText(spannableStringBuilder, this.f63598);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC5575) it2.next()).mo9848(textView);
        }
    }
}
