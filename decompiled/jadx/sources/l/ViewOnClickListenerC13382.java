package l;

import android.content.DialogInterface;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC13382 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40007;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f40008;

    public /* synthetic */ ViewOnClickListenerC13382(int i, Object obj) {
        this.f40007 = i;
        this.f40008 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f40007;
        Object obj = this.f40008;
        switch (i) {
            case 0:
                ViewOnLayoutChangeListenerC7738.m20722((ViewOnLayoutChangeListenerC7738) obj);
                break;
            case 1:
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) obj;
                C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44416(R.string.MT_Protector);
                c19258BuildDialog.m44442(R.string.MT_Protector, null);
                c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c19258BuildDialog.m44438().m1448().setOnClickListener(new ViewOnClickListenerC16536(2, abstractActivityC3346));
                break;
            case 2:
                int i2 = ActivityC3339.f10554;
                ((ActivityC3339) obj).finish();
                break;
            case 3:
                ((C14298) obj).m34085(view);
                break;
            default:
                C6273 c6273 = (C6273) obj;
                c6273.getClass();
                C6273.m17283(c6273, R.string.MT_Protector, null, null, 14);
                break;
        }
    }
}
