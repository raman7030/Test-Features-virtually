package p067l;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10532 implements AdapterView.OnItemClickListener {
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = C7179.f18749;
        ViewOnClickListenerC20591 viewOnClickListenerC20591 = (ViewOnClickListenerC20591) view.getTag();
        C7179 c7179 = viewOnClickListenerC20591.f63654;
        int i3 = viewOnClickListenerC20591.f63653;
        if (i3 == 0) {
            c7179.f18759.mo27932((CharSequence) viewOnClickListenerC20591.f63656);
            c7179.f18759.mo27941(c7179.f18759.m32590());
            c7179.f18750.dismiss();
            return;
        }
        if (i3 == 1) {
            c7179.f18759.mo27932((CharSequence) viewOnClickListenerC20591.f63659.m22270());
            c7179.f18759.mo27941(c7179.f18759.m32590());
            c7179.f18750.dismiss();
            return;
        }
        if (i3 == 2) {
            c7179.f18757 = true;
            ListView listViewMo10603 = c7179.f18750.mo10603();
            C12826.requireNonNull(listViewMo10603);
            listViewMo10603.setSelector(new ColorDrawable(0));
            c7179.m16520();
            C7050.m16206(500L, new RunnableC3319(3, listViewMo10603));
            return;
        }
        if (i3 == 3) {
            c7179.getContext().startActivity(new Intent(c7179.getContext(), (Class<?>) ActivityC11203.class));
            c7179.f18750.dismiss();
            return;
        }
        if (i3 != 4) {
            if (i3 != 5) {
                throw new IllegalArgumentException();
            }
            C19920 c19920 = new C19920(viewOnClickListenerC20591, (AbstractActivityC5549) C7453.m17221(c7179.getContext()));
            c19920.m33344(R.string.MT_Protector);
            c19920.m33347(R.string.MT_Protector);
            c19920.m33351(C7050.m16224(R.string.MT_Protector));
            c19920.m33362(2);
            c19920.m33354(2);
            c19920.m33330();
            c19920.m33352(true);
        }
    }
}
