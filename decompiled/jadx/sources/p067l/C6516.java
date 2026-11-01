package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۙۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBK8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6516 implements TextWatcher {

    /* JADX INFO: renamed from: ۙ */
    public final C9196 f16845 = new C9196();

    /* JADX INFO: renamed from: ᩶ */
    public int f16846 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f16847;

    /* JADX INFO: renamed from: ᩹ */
    public final C17203 f16848;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m14944(C14146 c14146, C17203 c17203) {
        C6516 c6516 = new C6516(c17203, c14146.m32500());
        c14146.m32383(new C2430(1));
        c14146.m32377(c6516);
    }

    public C6516(C17203 c17203, InterfaceC9768 interfaceC9768) {
        this.f16848 = c17203;
        boolean zM14945 = m14945(interfaceC9768);
        this.f16847 = zM14945;
        c17203.m38952(zM14945);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean zM14945;
        int i4 = this.f16846;
        if ((i4 == -1 || i <= i4) && (zM14945 = m14945(charSequence)) != this.f16847) {
            this.f16847 = zM14945;
            this.f16848.m38952(zM14945);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m14945(CharSequence charSequence) {
        C14723 c14723 = new C14723(charSequence);
        C9196 c9196 = this.f16845;
        c9196.m21166(c14723);
        while (true) {
            try {
                int iM21167 = c9196.m21167();
                if (iM21167 == 1) {
                    return false;
                }
                if (iM21167 == 2) {
                    this.f16846 = c9196.m21169().m40847();
                    return c9196.m21173().equals("vector");
                }
                this.f16846 = -1;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
