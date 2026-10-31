package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4HK */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6289 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19452;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19453;

    public /* synthetic */ ViewOnClickListenerC6289(int i, Object obj) {
        this.f19452 = i;
        this.f19453 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19452) {
            case 0:
                AbstractC23222.m51529((AbstractC23222) this.f19453);
                break;
            case 1:
                DialogInterfaceOnDismissListenerC5317.m15248((DialogInterfaceOnDismissListenerC5317) this.f19453);
                break;
            case 2:
                C9340.m24038((C9340) this.f19453, view);
                break;
            default:
                C19258 c19258BuildDialog = ((AbstractActivityC3346) this.f19453).buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44416(R.string.MT_Protector);
                c19258BuildDialog.m44442(R.string.MT_Protector, null);
                C8960.m23095(c19258BuildDialog.m44438());
                break;
        }
    }
}
