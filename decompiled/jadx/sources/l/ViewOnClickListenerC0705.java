package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0705 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2677;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23586 f2678;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2679 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2680;

    public /* synthetic */ ViewOnClickListenerC0705(String str, Main main, String str2) {
        this.f2680 = str;
        this.f2678 = main;
        this.f2677 = str2;
    }

    public /* synthetic */ ViewOnClickListenerC0705(C17458 c17458, C6875 c6875, DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f2680 = c17458;
        this.f2677 = c6875;
        this.f2678 = dialogInterfaceC0206;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        switch (this.f2679) {
            case 0:
                String str = (String) this.f2680;
                Main main = (Main) this.f2678;
                String str2 = (String) this.f2677;
                if (str != null) {
                    main.m10237(str);
                    z = true;
                } else {
                    z = false;
                }
                if (str2 != null) {
                    C4925.m14308(z ? -1 : R.string.MT_Protector, str2);
                }
                break;
            default:
                C6875.m18612((C17458) this.f2680, (C6875) this.f2677, (DialogInterfaceC0206) this.f2678);
                break;
        }
    }
}
