package p067l;

import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֡᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3039 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f5450;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC24784 f5451;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f5452 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f5453;

    public /* synthetic */ ViewOnClickListenerC3039(String str, Main main, String str2) {
        this.f5453 = str;
        this.f5451 = main;
        this.f5450 = str2;
    }

    public /* synthetic */ ViewOnClickListenerC3039(C18961 c18961, C8903 c8903, DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f5453 = c18961;
        this.f5450 = c8903;
        this.f5451 = dialogInterfaceC2564;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        switch (this.f5452) {
            case 0:
                String str = (String) this.f5453;
                Main main = (Main) this.f5451;
                String str2 = (String) this.f5450;
                if (str != null) {
                    main.m12273(str);
                    z = true;
                } else {
                    z = false;
                }
                if (str2 != null) {
                    C7050.m16205(z ? -1 : R.string.MT_Protector, str2);
                }
                break;
            default:
                C8903.m20561((C18961) this.f5453, (C8903) this.f5450, (DialogInterfaceC2564) this.f5451);
                break;
        }
    }
}
