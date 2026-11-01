package p067l;

import android.text.Spanned;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12766 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f35936;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f35937;

    public /* synthetic */ ViewOnClickListenerC12766(int i, Object obj) {
        this.f35936 = i;
        this.f35937 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f35936) {
            case 0:
                DialogInterfaceOnClickListenerC20813.m46991((DialogInterfaceOnClickListenerC20813) this.f35937, view);
                break;
            case 1:
                AbstractC16864.m38412((AbstractC16864) this.f35937);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f35937;
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(((Spanned) it.next()).toString());
                    sb.append("\n");
                }
                C7050.m16211((CharSequence) sb.toString());
                break;
        }
    }
}
