package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23386 implements InterfaceC19449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f75134;

    public C23386(C7864 c7864) {
        this.f75134 = c7864;
    }

    @Override // l.InterfaceC19449
    /* JADX INFO: renamed from: ֫ */
    public final void mo2703(boolean z) {
        String strM21119;
        C7864 c7864 = this.f75134;
        if (c7864.f43260.getBoolean("changed", false) != z) {
            c7864.f43260.putBoolean("changed", z);
            try {
                c7864.m34239(((ActivityC17169) c7864.requireActivity()).m40356());
            } catch (IOException unused) {
            }
            c7864.m34227(new C14213());
        }
        if (c7864.f24385) {
            if (c7864.f24387 != null) {
                c7864.f24387.setEnabled(z);
            }
            if (z) {
                strM21119 = "*" + c7864.m21119();
            } else {
                strM21119 = c7864.m21119();
            }
            int i = z ? C21943.f70260 : C21943.f70287;
            if (c7864.f24371.getText().toString().equals(strM21119)) {
                return;
            }
            c7864.f24371.setText(strM21119);
            c7864.f24371.setTextColor(i);
        }
    }

    @Override // l.InterfaceC19449
    /* JADX INFO: renamed from: ֫ */
    public final void mo2704(boolean z, boolean z2) {
        C7864 c7864 = this.f75134;
        if (c7864.f24385) {
            if (c7864.f24367 != null) {
                c7864.f24367.setEnabled(z);
            }
            if (c7864.f24389 != null) {
                c7864.f24389.setEnabled(z2);
            }
        }
    }
}
