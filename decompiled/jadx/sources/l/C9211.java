package l;

import android.text.Spannable;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۡ᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9211 extends AbstractC23919 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20500 f27897;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8367 f27898 = new C8367();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9211 m23652(C20500 c20500) {
        return new C9211(c20500);
    }

    public C9211(C20500 c20500) {
        this.f27897 = c20500;
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo9848(TextView textView) {
        C8367 c8367 = this.f27898;
        c8367.clear();
        Spannable spannable = (Spannable) textView.getText();
        C20602[] c20602Arr = (C20602[]) spannable.getSpans(0, spannable.length(), C20602.class);
        if (c20602Arr != null) {
            for (C20602 c20602 : c20602Arr) {
                int spanStart = spannable.getSpanStart(c20602);
                String strReplaceAll = String.valueOf(spannable.subSequence(spanStart, spannable.getSpanEnd(c20602))).toLowerCase().replaceAll("[^\\p{L}\\p{N}]+", "-");
                if (c8367.mo21968(strReplaceAll) == 0 && !c8367.containsKey(strReplaceAll)) {
                    c8367.mo21965(spanStart, (Object) strReplaceAll);
                }
            }
        }
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo9851(C4164 c4164) {
        c4164.m12598(new C9917(this));
    }
}
