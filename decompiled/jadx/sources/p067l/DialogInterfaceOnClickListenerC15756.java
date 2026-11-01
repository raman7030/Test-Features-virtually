package p067l;

import android.content.DialogInterface;
import android.widget.EditText;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: renamed from: l.ܰ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5CP */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC15756 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f45624;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f45625;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f45626;

    public /* synthetic */ DialogInterfaceOnClickListenerC15756(int i, Object obj, Object obj2) {
        this.f45625 = i;
        this.f45626 = obj;
        this.f45624 = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[PHI: r9
      0x0062: PHI (r9v5 bin.mt.plus.Main) = (r9v4 bin.mt.plus.Main), (r9v7 bin.mt.plus.Main) binds: [B:24:0x0060, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Main mainM41282;
        switch (this.f45625) {
            case 0:
                Main main = (Main) this.f45626;
                InterfaceC4378 interfaceC4378 = (InterfaceC4378) this.f45624;
                if (C0886.m5543(main, UMUtils.SD_PERMISSION) != 0) {
                    interfaceC4378.mo5796();
                } else {
                    interfaceC4378.onSuccess();
                }
                break;
            case 1:
                C18107 c18107 = (C18107) this.f45626;
                InterfaceC19370 interfaceC19370 = (InterfaceC19370) this.f45624;
                dialogInterface.dismiss();
                if (i == 0) {
                    C20966.m47304(c18107, interfaceC19370, new C24868(c18107));
                } else if (i == 1) {
                    C20966.m47304(c18107, interfaceC19370, new C4444(3, c18107));
                } else {
                    int i2 = R.string.MT_Protector;
                    if (i == 2) {
                        if (c18107.m41261("local")) {
                            C20966.m47304(c18107, interfaceC19370, new C24793(c18107));
                        } else {
                            boolean zM41261 = c18107.m41261(C0168b.f616k);
                            mainM41282 = c18107.m41282();
                            if (zM41261) {
                                i2 = R.string.MT_Protector;
                            }
                        }
                        break;
                    } else if (i == 3) {
                        if (c18107.m41261("local")) {
                            C20966.m47304(c18107, interfaceC19370, new C8347(c18107));
                        } else {
                            boolean zM41262 = c18107.m41261(C0168b.f616k);
                            mainM41282 = c18107.m41282();
                            if (zM41262) {
                                i2 = R.string.MT_Protector;
                            }
                        }
                        break;
                    }
                    mainM41282.m12253(R.string.MT_Protector, i2, false);
                }
                break;
            default:
                ((EditText) this.f45626).setText(((String[]) this.f45624)[i]);
                dialogInterface.dismiss();
                break;
        }
    }
}
