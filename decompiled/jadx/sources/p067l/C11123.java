package p067l;

import android.text.Spannable;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۡ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11123 extends AbstractC25101 {

    /* JADX INFO: renamed from: ֫ */
    public final C21852 f30843;

    /* JADX INFO: renamed from: ۧ */
    public final C10321 f30844 = new C10321();

    /* JADX INFO: renamed from: ֫ */
    public static C11123 m25651(C21852 c21852) {
        return new C11123(c21852);
    }

    public C11123(C21852 c21852) {
        this.f30843 = c21852;
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11895(TextView textView) {
        C10321 c10321 = this.f30844;
        c10321.clear();
        Spannable spannable = (Spannable) textView.getText();
        C21948[] c21948Arr = (C21948[]) spannable.getSpans(0, spannable.length(), C21948.class);
        if (c21948Arr != null) {
            for (C21948 c21948 : c21948Arr) {
                int spanStart = spannable.getSpanStart(c21948);
                String strReplaceAll = String.valueOf(spannable.subSequence(spanStart, spannable.getSpanEnd(c21948))).toLowerCase().replaceAll("[^\\p{L}\\p{N}]+", "-");
                if (c10321.mo23939(strReplaceAll) == 0 && !c10321.containsKey(strReplaceAll)) {
                    c10321.mo23936(spanStart, (Object) strReplaceAll);
                }
            }
        }
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11898(C6326 c6326) {
        c6326.m14472(new C11794(this));
    }
}
