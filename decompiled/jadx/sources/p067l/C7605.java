package p067l;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: renamed from: l.ۚᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes3.dex */
public final class C7605 implements InterfaceC3581 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC25039 f19906;

    /* JADX INFO: renamed from: ۧ */
    public C16301 f19907;

    public C7605(C16301 c16301, InterfaceC25039 interfaceC25039) {
        this.f19907 = c16301;
        this.f19906 = interfaceC25039;
    }

    @Override // p067l.InterfaceC3581
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6584(CharSequence charSequence, int i, int i2, C4232 c4232) {
        Spannable spannableString;
        if (c4232.m8600()) {
            return true;
        }
        if (this.f19907 == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f19907 = new C16301(spannableString);
        }
        ((C4252) this.f19906).getClass();
        this.f19907.setSpan(new C12950(c4232), i, i2, 33);
        return true;
    }

    @Override // p067l.InterfaceC3581
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6583() {
        return this.f19907;
    }
}
