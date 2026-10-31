package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۙۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBK8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4364 implements TextWatcher {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7184 f14030 = new C7184();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f14031 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f14032;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15609 f14033;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13080(C12392 c12392, C15609 c15609) {
        C4364 c4364 = new C4364(c15609, c12392.m30436());
        c12392.m30319(new C0065(1));
        c12392.m30313(c4364);
    }

    public C4364(C15609 c15609, InterfaceC7785 interfaceC7785) {
        this.f14033 = c15609;
        boolean zM13081 = m13081(interfaceC7785);
        this.f14032 = zM13081;
        c15609.m36791(zM13081);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean zM13081;
        int i4 = this.f14031;
        if ((i4 == -1 || i <= i4) && (zM13081 = m13081(charSequence)) != this.f14032) {
            this.f14032 = zM13081;
            this.f14033.m36791(zM13081);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m13081(CharSequence charSequence) {
        C13000 c13000 = new C13000(charSequence);
        C7184 c7184 = this.f14030;
        c7184.m19219(c13000);
        while (true) {
            try {
                int iM19220 = c7184.m19220();
                if (iM19220 == 1) {
                    return false;
                }
                if (iM19220 == 2) {
                    this.f14031 = c7184.m19222().m38630();
                    return c7184.m19226().equals("vector");
                }
                this.f14031 = -1;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
