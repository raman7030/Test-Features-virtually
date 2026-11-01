package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import com.google.android.material.search.SearchView;

/* JADX INFO: renamed from: l.ۧۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12721 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f35736;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f35737;

    public /* synthetic */ ViewOnClickListenerC12721(int i, Object obj) {
        this.f35736 = i;
        this.f35737 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f35736;
        Object obj = this.f35737;
        switch (i) {
            case 0:
                int i2 = C24790.f79226;
                ((C24790) obj).m54461(true);
                break;
            case 1:
                int i3 = ActivityC11800.f32954;
                ((ActivityC11800) obj).finish();
                break;
            case 2:
                C15957.m36247((C15957) obj);
                break;
            case 3:
                int i4 = DialogInterfaceC2564.f4230;
                C20671 c20671 = new C20671((AbstractActivityC5549) obj);
                c20671.m46727(R.string.MT_Protector);
                c20671.m46710(R.string.MT_Protector);
                c20671.m46736(R.string.MT_Protector, null);
                c20671.m46732();
                break;
            case 4:
                int i5 = ActivityC12088.f33683;
                ((ActivityC12088) obj).finish();
                break;
            case 5:
                ((ViewOnLayoutChangeListenerC9723) obj).f26855.setVisibility(8);
                break;
            case 6:
                C6724 c6724 = ActivityC8440.f22630;
                ((ActivityC8440) obj).finish();
                break;
            default:
                ((SearchView) obj).lambda$setUpBackButton$1(view);
                break;
        }
    }
}
