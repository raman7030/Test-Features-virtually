package p067l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* JADX INFO: renamed from: l.᩵ۖ */
/* JADX INFO: compiled from: B61E */
/* JADX INFO: loaded from: classes5.dex */
public class C1793 extends C1462 {

    /* JADX INFO: renamed from: ۛ֫ */
    public C1134 f63621;

    /* JADX INFO: renamed from: ۤ֫ */
    public C0848 f63622;

    /* JADX INFO: renamed from: ۨ֫ */
    public final int f63623;

    /* JADX INFO: renamed from: ۫֫ */
    public final int f63624;

    public C1793(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f63624 = 21;
            this.f63623 = 22;
        } else {
            this.f63624 = 22;
            this.f63623 = 21;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46540(C0848 c0848) {
        this.f63622 = c0848;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C1939 c1939;
        C1239 c1239 = (C1239) getSelectedView();
        if (c1239 != null && i == this.f63624) {
            if (c1239.isEnabled() && c1239.getItemData().hasSubMenu()) {
                performItemClick(c1239, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (c1239 != null && i == this.f63623) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                c1939 = (C1939) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                c1939 = (C1939) adapter;
            }
            c1939.m52027().close(false);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p067l.C1462, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1939 c1939;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f63622 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c1939 = (C1939) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1939 = (C1939) adapter;
                headersCount = 0;
            }
            C1134 item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c1939.getCount()) ? null : c1939.getItem(i);
            C1134 c1134 = this.f63621;
            if (c1134 != item) {
                C0994 c0994M52027 = c1939.m52027();
                if (c1134 != null) {
                    this.f63622.mo3515(c0994M52027, (MenuItem) c1134);
                }
                this.f63621 = item;
                if (item != null) {
                    this.f63622.mo3516(c0994M52027, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
