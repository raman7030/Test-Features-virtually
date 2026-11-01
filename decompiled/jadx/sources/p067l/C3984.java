package p067l;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: renamed from: l.֫۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3984 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f8669;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC24784 f8670;

    public /* synthetic */ C3984(InterfaceC24784 interfaceC24784, int i) {
        this.f8669 = i;
        this.f8670 = interfaceC24784;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f8669) {
            case 0:
                DialogInterfaceC2564 dialogInterfaceC2564 = (DialogInterfaceC2564) this.f8670;
                if (((EnumC15303) obj).m34840() && dialogInterfaceC2564.m3855()) {
                    dialogInterfaceC2564.dismiss();
                    break;
                }
                break;
            case 1:
                ((ActivityC17874) this.f8670).m12259((Throwable) obj, (DialogInterface.OnDismissListener) null);
                break;
            default:
                C23194.m51668((C23194) this.f8670, (List) obj);
                break;
        }
    }
}
