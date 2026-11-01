package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24594 implements InterfaceC20853 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9842 f77880;

    public C24594(C9842 c9842) {
        this.f77880 = c9842;
    }

    @Override // p067l.InterfaceC20853
    /* JADX INFO: renamed from: ֫ */
    public final void mo5042(boolean z) {
        String strM23084;
        C9842 c9842 = this.f77880;
        if (c9842.f46351.getBoolean("changed", false) != z) {
            c9842.f46351.putBoolean("changed", z);
            try {
                c9842.m36372(((ActivityC18686) c9842.requireActivity()).m42601());
            } catch (IOException unused) {
            }
            c9842.m36360(new C15876());
        }
        if (c9842.f27301) {
            if (c9842.f27303 != null) {
                c9842.f27303.setEnabled(z);
            }
            if (z) {
                strM23084 = "*" + c9842.m23084();
            } else {
                strM23084 = c9842.m23084();
            }
            int i = z ? C23223.f72972 : C23223.f72998;
            if (c9842.f27287.getText().toString().equals(strM23084)) {
                return;
            }
            c9842.f27287.setText(strM23084);
            c9842.f27287.setTextColor(i);
        }
    }

    @Override // p067l.InterfaceC20853
    /* JADX INFO: renamed from: ֫ */
    public final void mo5043(boolean z, boolean z2) {
        C9842 c9842 = this.f77880;
        if (c9842.f27301) {
            if (c9842.f27283 != null) {
                c9842.f27283.setEnabled(z);
            }
            if (c9842.f27305 != null) {
                c9842.f27305.setEnabled(z2);
            }
        }
    }
}
