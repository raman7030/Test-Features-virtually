package l;

import android.text.Spanned;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC10940 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32959;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32960;

    public /* synthetic */ ViewOnClickListenerC10940(int i, Object obj) {
        this.f32959 = i;
        this.f32960 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f32959) {
            case 0:
                DialogInterfaceOnClickListenerC19407.m44697((DialogInterfaceOnClickListenerC19407) this.f32960, view);
                break;
            case 1:
                AbstractC15252.m36251((AbstractC15252) this.f32960);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f32960;
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(((Spanned) it.next()).toString());
                    sb.append("\n");
                }
                C4925.m14314((CharSequence) sb.toString());
                break;
        }
    }
}
