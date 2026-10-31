package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0661 implements InterfaceC19449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f2559;

    public C0661(C6306 c6306) {
        this.f2559 = c6306;
    }

    @Override // l.InterfaceC19449
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2703(boolean z) {
        String strMo14421;
        C6306 c6306 = this.f2559;
        if (c6306.f43260.getBoolean("changed", false) != z) {
            c6306.f43260.putBoolean("changed", z);
            try {
                c6306.m34239(((ActivityC17169) c6306.requireActivity()).m40356());
            } catch (IOException unused) {
            }
            c6306.m34227(new C14213());
        }
        if (c6306.f19523) {
            c6306.f19501.mo7983(c6306.f19514, c6306.f19506.m30436());
            if (c6306.f19509 != null) {
                c6306.f19509.setEnabled(z);
            }
            if (z) {
                strMo14421 = "*" + c6306.mo14421();
            } else {
                strMo14421 = c6306.mo14421();
            }
            int i = z ? C21943.f70260 : C21943.f70287;
            if (c6306.f19512.getText().toString().equals(strMo14421)) {
                return;
            }
            c6306.f19512.setText(strMo14421);
            c6306.f19512.setTextColor(i);
        }
    }

    @Override // l.InterfaceC19449
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2704(boolean z, boolean z2) {
        C6306 c6306 = this.f2559;
        if (c6306.f19523) {
            if (c6306.f19522 != null) {
                c6306.f19522.setEnabled(z);
            }
            if (c6306.f19524 != null) {
                c6306.f19524.setEnabled(z2);
            }
        }
    }
}
