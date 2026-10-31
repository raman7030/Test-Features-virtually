package l;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8590 implements AdapterView.OnItemClickListener {
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = C5062.f15913;
        ViewOnClickListenerC19174 viewOnClickListenerC19174 = (ViewOnClickListenerC19174) view.getTag();
        C5062 c5062 = viewOnClickListenerC19174.f60423;
        int i3 = viewOnClickListenerC19174.f60422;
        if (i3 == 0) {
            c5062.f15923.mo25910((CharSequence) viewOnClickListenerC19174.f60425);
            c5062.f15923.mo25919(c5062.f15923.m30526());
            c5062.f15914.dismiss();
            return;
        }
        if (i3 == 1) {
            c5062.f15923.mo25910((CharSequence) viewOnClickListenerC19174.f60428.m20293());
            c5062.f15923.mo25919(c5062.f15923.m30526());
            c5062.f15914.dismiss();
            return;
        }
        if (i3 == 2) {
            c5062.f15921 = true;
            ListView listViewMo8540 = c5062.f15914.mo8540();
            C11003.requireNonNull(listViewMo8540);
            listViewMo8540.setSelector(new ColorDrawable(0));
            c5062.m14613();
            C4925.m14309(500L, new RunnableC1000(3, listViewMo8540));
            return;
        }
        if (i3 == 3) {
            c5062.getContext().startActivity(new Intent(c5062.getContext(), (Class<?>) ActivityC9296.class));
            c5062.f15914.dismiss();
            return;
        }
        if (i3 != 4) {
            if (i3 != 5) {
                throw new IllegalArgumentException();
            }
            C18468 c18468 = new C18468(viewOnClickListenerC19174, (AbstractActivityC3346) C5350.m15313(c5062.getContext()));
            c18468.m31258(R.string.MT_Protector);
            c18468.m31261(R.string.MT_Protector);
            c18468.m31265(C4925.m14327(R.string.MT_Protector));
            c18468.m31276(2);
            c18468.m31268(2);
            c18468.m31244();
            c18468.m31266(true);
        }
    }
}
