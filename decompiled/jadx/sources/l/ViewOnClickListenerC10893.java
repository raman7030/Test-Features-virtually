package l;

import android.view.View;
import bin.mt.plus.R;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۧۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10893 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32758;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32759;

    public /* synthetic */ ViewOnClickListenerC10893(int i, Object obj) {
        this.f32758 = i;
        this.f32759 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f32758;
        Object obj = this.f32759;
        switch (i) {
            case 0:
                int i2 = C23592.f76481;
                ((C23592) obj).m52058(true);
                break;
            case 1:
                int i3 = ActivityC9923.f29996;
                ((ActivityC9923) obj).finish();
                break;
            case 2:
                C14298.m34114((C14298) obj);
                break;
            case 3:
                int i4 = DialogInterfaceC0206.f1451;
                C19258 c19258 = new C19258((AbstractActivityC3346) obj);
                c19258.m44433(R.string.MT_Protector);
                c19258.m44416(R.string.MT_Protector);
                c19258.m44442(R.string.MT_Protector, null);
                c19258.m44438();
                break;
            case 4:
                int i5 = ActivityC10227.f30722;
                ((ActivityC10227) obj).finish();
                break;
            case 5:
                ((ViewOnLayoutChangeListenerC7738) obj).f23942.setVisibility(8);
                break;
            case 6:
                C4583 c4583 = ActivityC6388.f19757;
                ((ActivityC6388) obj).finish();
                break;
            default:
                ((SearchView) obj).lambda$setUpBackButton$1(view);
                break;
        }
    }
}
