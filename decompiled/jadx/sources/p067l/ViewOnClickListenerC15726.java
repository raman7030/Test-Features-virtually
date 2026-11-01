package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ܰ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC15726 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f45563;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f45564;

    public /* synthetic */ ViewOnClickListenerC15726(int i, Object obj) {
        this.f45563 = i;
        this.f45564 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f45563;
        Object obj = this.f45564;
        switch (i) {
            case 0:
                int i2 = AbstractActivityC3895.f8441;
                ((AbstractActivityC3895) obj).getOnBackPressedDispatcher().m30941();
                break;
            case 1:
                C20671 c20671BuildDialog = ((C18107) obj).m41282().buildDialog();
                c20671BuildDialog.m46727(R.string.MT_Protector);
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, null);
                c20671BuildDialog.m46732();
                break;
            case 2:
                C16156.m36774((C16156) obj);
                break;
            default:
                ((SearchView) obj).lambda$setUpClearButton$2(view);
                break;
        }
    }
}
