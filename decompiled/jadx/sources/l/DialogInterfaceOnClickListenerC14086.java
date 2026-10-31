package l;

import android.content.DialogInterface;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: renamed from: l.ܰ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5CP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC14086 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42538;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42539;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42540;

    public /* synthetic */ DialogInterfaceOnClickListenerC14086(int i, Object obj, Object obj2) {
        this.f42539 = i;
        this.f42540 = obj;
        this.f42538 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[PHI: r9
      0x0062: PHI (r9v5 bin.mt.plus.Main) = (r9v4 bin.mt.plus.Main), (r9v7 bin.mt.plus.Main) binds: [B:24:0x0060, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Main mainM39056;
        switch (this.f42539) {
            case 0:
                Main main = (Main) this.f42540;
                InterfaceC2114 interfaceC2114 = (InterfaceC2114) this.f42538;
                if (C0881.m3229(main, UMUtils.SD_PERMISSION) != 0) {
                    interfaceC2114.mo3493();
                } else {
                    interfaceC2114.onSuccess();
                }
                break;
            case 1:
                C16560 c16560 = (C16560) this.f42540;
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) this.f42538;
                dialogInterface.dismiss();
                if (i == 0) {
                    C19568.m45009(c16560, interfaceC17889, new C23674(c16560));
                } else if (i == 1) {
                    C19568.m45009(c16560, interfaceC17889, new C2184(3, c16560));
                } else {
                    int i2 = R.string.MT_Protector;
                    if (i == 2) {
                        if (c16560.m39035("local")) {
                            C19568.m45009(c16560, interfaceC17889, new C23595(c16560));
                        } else {
                            boolean zM39035 = c16560.m39035(b.k);
                            mainM39056 = c16560.m39056();
                            if (zM39035) {
                                i2 = R.string.MT_Protector;
                            }
                        }
                        break;
                    } else if (i == 3) {
                        if (c16560.m39035("local")) {
                            C19568.m45009(c16560, interfaceC17889, new C6290(c16560));
                        } else {
                            boolean zM39036 = c16560.m39035(b.k);
                            mainM39056 = c16560.m39056();
                            if (zM39036) {
                                i2 = R.string.MT_Protector;
                            }
                        }
                        break;
                    }
                    mainM39056.m10217(R.string.MT_Protector, i2, false);
                }
                break;
            default:
                ((EditText) this.f42540).setText(((String[]) this.f42538)[i]);
                dialogInterface.dismiss();
                break;
        }
    }
}
