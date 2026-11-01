package p067l;

import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: l.ᩴ᩷ */
/* JADX INFO: compiled from: L7M3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1784 {
    /* JADX INFO: renamed from: ֫ */
    public static void m46107(C1749 c1749) {
        AbstractC1399 abstractC1399M44898 = c1749.m44898();
        abstractC1399M44898.mo10601(true);
        abstractC1399M44898.show();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46106(Object obj) {
        final ViewOnKeyListenerC0979 viewOnKeyListenerC0979 = (ViewOnKeyListenerC0979) obj;
        C1828.m48008(viewOnKeyListenerC0979.f11400).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۘ᩷
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C1939 c1939;
                ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
                if (listAdapter instanceof HeaderViewListAdapter) {
                    c1939 = (C1939) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
                } else {
                    c1939 = (C1939) listAdapter;
                }
                c1939.f74504.performItemAction((MenuItem) listAdapter.getItem(i), viewOnKeyListenerC0979, 1);
            }
        });
    }
}
