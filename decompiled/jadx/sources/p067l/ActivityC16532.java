package p067l;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G135 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16532 extends AbstractActivityC5549 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۜۧ */
    public static final /* synthetic */ int f48579 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public TextView f48580;

    /* JADX INFO: renamed from: ᩳۧ */
    public C9827 f48582;

    /* JADX INFO: renamed from: ᩻ۧ */
    public List f48583 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܿۧ */
    public C1502 f48581 = new C1502();

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
    }

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "OpenMethodManager";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.string.MT_Protector);
        m12277(R.layout.MT_Protector);
        this.f13392 = (C1326) m12277(R.id.MT_Protector);
        TextView textView = (TextView) m12277(R.id.MT_Protector);
        this.f48580 = textView;
        textView.setText(R.string.MT_Protector);
        ListView listView = (ListView) m12277(android.R.id.list);
        m12263(this.f13392);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC18257(1, this));
        C9827 c9827 = new C9827(this);
        this.f48582 = c9827;
        listView.setAdapter((ListAdapter) c9827);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
        this.f48582.registerDataSetObserver(new C3121(this));
        this.f48580.setVisibility(this.f48582.getCount() == 0 ? 0 : 8);
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f48583 = C4463.m9388();
        this.f48581.m34386();
        this.f48582.notifyDataSetChanged();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C1898 c1898 = new C1898(this, view, 0);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c1898.m50640();
        c1898.m50636(new InterfaceC1583() { // from class: l.ۚ֨ܿ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC16532.m37513(this.f18654, i);
                return true;
            }
        });
        C19801.m45029(view, c1898);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m37513(ActivityC16532 activityC16532, int i) {
        C4463 c4463 = (C4463) activityC16532.f48583.remove(i);
        activityC16532.f48581.m34389(i);
        C4463.m9387(c4463.m9398());
        activityC16532.f48582.notifyDataSetChanged();
    }
}
