package l;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: renamed from: l.ۚᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes3.dex */
public final class C5510 implements InterfaceC1276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23854 f17065;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14660 f17066;

    public C5510(C14660 c14660, InterfaceC23854 interfaceC23854) {
        this.f17066 = c14660;
        this.f17065 = interfaceC23854;
    }

    @Override // l.InterfaceC1276
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4338(CharSequence charSequence, int i, int i2, C1961 c1961) {
        Spannable spannableString;
        if (c1961.m6459()) {
            return true;
        }
        if (this.f17066 == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f17066 = new C14660(spannableString);
        }
        ((C1982) this.f17065).getClass();
        this.f17066.setSpan(new C11134(c1961), i, i2, 33);
        return true;
    }

    @Override // l.InterfaceC1276
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4337() {
        return this.f17066;
    }
}
