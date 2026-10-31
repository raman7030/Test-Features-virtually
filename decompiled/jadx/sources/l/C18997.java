package l;

import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: l.ᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L7M3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18997 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43839(C18291 c18291) {
        AbstractC11236 abstractC11236M42638 = c18291.m42638();
        abstractC11236M42638.mo8538(true);
        abstractC11236M42638.show();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43838(Object obj) {
        final ViewOnKeyListenerC2769 viewOnKeyListenerC2769 = (ViewOnKeyListenerC2769) obj;
        C19871.m45697(viewOnKeyListenerC2769.f8606).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۘ᩷
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C22110 c22110;
                ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
                if (listAdapter instanceof HeaderViewListAdapter) {
                    c22110 = (C22110) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
                } else {
                    c22110 = (C22110) listAdapter;
                }
                c22110.f71782.performItemAction((MenuItem) listAdapter.getItem(i), viewOnKeyListenerC2769, 1);
            }
        });
    }
}
