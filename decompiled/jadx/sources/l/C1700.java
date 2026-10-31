package l;

import android.content.DialogInterface;
import java.util.List;

/* JADX INFO: renamed from: l.֫۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1700 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5890;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23586 f5891;

    public /* synthetic */ C1700(InterfaceC23586 interfaceC23586, int i) {
        this.f5890 = i;
        this.f5891 = interfaceC23586;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f5890) {
            case 0:
                DialogInterfaceC0206 dialogInterfaceC0206 = (DialogInterfaceC0206) this.f5891;
                if (((EnumC13610) obj).m32728() && dialogInterfaceC0206.m1442()) {
                    dialogInterfaceC0206.dismiss();
                    break;
                }
                break;
            case 1:
                ((ActivityC16315) this.f5891).m10223((Throwable) obj, (DialogInterface.OnDismissListener) null);
                break;
            default:
                C21912.m49315((C21912) this.f5891, (List) obj);
                break;
        }
    }
}
