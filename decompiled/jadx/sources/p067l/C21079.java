package p067l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M903 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21079 extends AbstractC17724 {

    /* JADX INFO: renamed from: ֫ */
    public final TextView.BufferType f66219;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f66220;

    /* JADX INFO: renamed from: ܽ */
    public final C3778 f66221;

    /* JADX INFO: renamed from: ܿ */
    public final C15042 f66222;

    /* JADX INFO: renamed from: ᩳ */
    public final List f66223;

    public C21079(TextView.BufferType bufferType, C3778 c3778, C15042 c15042, List list, boolean z) {
        this.f66219 = bufferType;
        this.f66221 = c3778;
        this.f66222 = c15042;
        this.f66223 = list;
        this.f66220 = z;
    }

    @Override // p067l.AbstractC17724
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC2555 mo40280(String str) {
        Iterator it = this.f66223.iterator();
        while (it.hasNext()) {
            str = ((InterfaceC7667) it.next()).mo17754(str);
        }
        return this.f66221.m7387(str);
    }

    @Override // p067l.AbstractC17724
    /* JADX INFO: renamed from: ֫ */
    public final Spanned mo40279(TextView textView, AbstractC2555 abstractC2555) {
        List list = this.f66223;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC7667) it.next()).mo17758(textView);
        }
        C15042 c15042 = this.f66222;
        InterfaceC5655 interfaceC5655M28449 = ((C12361) c15042.f42964).m28449(c15042.f42965, new C9678());
        abstractC2555.mo3758(interfaceC5655M28449);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC7667) it2.next()).mo17242(interfaceC5655M28449);
        }
        return ((C8337) interfaceC5655M28449).builder().m43997();
    }

    @Override // p067l.AbstractC17724
    /* JADX INFO: renamed from: ֫ */
    public final void mo40282(TextView textView, String str) {
        Spanned spannedMo40279 = mo40279(textView, mo40280(str));
        if (TextUtils.isEmpty(spannedMo40279) && this.f66220 && !TextUtils.isEmpty(str)) {
            spannedMo40279 = new SpannableStringBuilder(str);
        }
        mo40281(textView, (SpannableStringBuilder) spannedMo40279);
    }

    @Override // p067l.AbstractC17724
    /* JADX INFO: renamed from: ֫ */
    public final void mo40281(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        List list = this.f66223;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC7667) it.next()).mo11896(textView, spannableStringBuilder);
        }
        textView.setText(spannableStringBuilder, this.f66219);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((InterfaceC7667) it2.next()).mo11895(textView);
        }
    }
}
