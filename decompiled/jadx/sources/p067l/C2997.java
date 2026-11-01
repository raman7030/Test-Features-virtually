package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2997 implements InterfaceC20853 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8362 f5332;

    public C2997(C8362 c8362) {
        this.f5332 = c8362;
    }

    @Override // p067l.InterfaceC20853
    /* JADX INFO: renamed from: ֫ */
    public final void mo5042(boolean z) {
        String strMo16325;
        C8362 c8362 = this.f5332;
        if (c8362.f46351.getBoolean("changed", false) != z) {
            c8362.f46351.putBoolean("changed", z);
            try {
                c8362.m36372(((ActivityC18686) c8362.requireActivity()).m42601());
            } catch (IOException unused) {
            }
            c8362.m36360(new C15876());
        }
        if (c8362.f22394) {
            c8362.f22372.mo10031(c8362.f22385, c8362.f22377.m32500());
            if (c8362.f22380 != null) {
                c8362.f22380.setEnabled(z);
            }
            if (z) {
                strMo16325 = "*" + c8362.mo16325();
            } else {
                strMo16325 = c8362.mo16325();
            }
            int i = z ? C23223.f72972 : C23223.f72998;
            if (c8362.f22383.getText().toString().equals(strMo16325)) {
                return;
            }
            c8362.f22383.setText(strMo16325);
            c8362.f22383.setTextColor(i);
        }
    }

    @Override // p067l.InterfaceC20853
    /* JADX INFO: renamed from: ֫ */
    public final void mo5043(boolean z, boolean z2) {
        C8362 c8362 = this.f5332;
        if (c8362.f22394) {
            if (c8362.f22393 != null) {
                c8362.f22393.setEnabled(z);
            }
            if (c8362.f22395 != null) {
                c8362.f22395.setEnabled(z2);
            }
        }
    }
}
