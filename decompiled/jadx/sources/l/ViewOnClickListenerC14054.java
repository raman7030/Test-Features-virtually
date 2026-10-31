package l;

import android.view.View;
import bin.mt.plus.R;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ܰ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC14054 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42477;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42478;

    public /* synthetic */ ViewOnClickListenerC14054(int i, Object obj) {
        this.f42477 = i;
        this.f42478 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f42477;
        Object obj = this.f42478;
        switch (i) {
            case 0:
                int i2 = AbstractActivityC1606.f5661;
                ((AbstractActivityC1606) obj).getOnBackPressedDispatcher().m28892();
                break;
            case 1:
                C19258 c19258BuildDialog = ((C16560) obj).m39056().buildDialog();
                c19258BuildDialog.m44433(R.string.MT_Protector);
                c19258BuildDialog.m44416(R.string.MT_Protector);
                c19258BuildDialog.m44442(R.string.MT_Protector, null);
                c19258BuildDialog.m44438();
                break;
            case 2:
                C14507.m34633((C14507) obj);
                break;
            default:
                ((SearchView) obj).lambda$setUpClearButton$2(view);
                break;
        }
    }
}
