package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܽܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC18224 extends AbstractActivityC5549 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ܳۧ */
    public static final /* synthetic */ int f54394 = 0;

    /* JADX INFO: renamed from: ܿۧ */
    public List f54395 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩳۧ */
    public C12861 f54396;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "SchemeManagerActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.string.MT_Protector);
        m12277(R.layout.MT_Protector);
        this.f13392 = (C1326) m12277(R.id.MT_Protector);
        ListView listView = (ListView) m12277(android.R.id.list);
        m12263(this.f13392);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC5619(this, 1));
        this.f54395 = C17812.m40432();
        C12861 c12861 = new C12861(this);
        this.f54396 = c12861;
        listView.setAdapter((ListAdapter) c12861);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f54395 = C17812.m40432();
        this.f54396.notifyDataSetChanged();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            C15800 c15800 = new C15800(this, this);
            c15800.m33344(R.string.MT_Protector);
            c15800.m33330();
            c15800.m33365(6);
            c15800.m33352(true);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        try {
            C14677 c14677M33572 = C14677.m33572(Base64.decode(C7050.m16227().trim(), 3));
            C23395.m52060((InterfaceC21384) c14677M33572, -2106428910);
            String strM33593 = c14677M33572.m33593();
            String strM33594 = c14677M33572.m33593();
            if (strM33594.hashCode() != c14677M33572.readInt()) {
                throw new Exception();
            }
            C11108 c11108 = new C11108(C17812.m40436(strM33593));
            c11108.m25583(new JSONObject(strM33594));
            C17812.m40431(c11108);
            this.f54395 = C17812.m40432();
            this.f54396.notifyDataSetChanged();
            C22682.m50793(R.string.MT_Protector);
            return true;
        } catch (Exception unused) {
            C22682.m50793(R.string.MT_Protector);
            return true;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.f54395.get(i);
        Intent intent = new Intent(this, (Class<?>) ActivityC8425.class);
        intent.putExtra("schemeName", str);
        startActivity(intent);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C1898 c1898 = new C1898(this, view, 0);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.ۨ᩺ܽ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC18224.m41448(this.f38979, i, menuItem);
                return true;
            }
        });
        C19801.m45029(view, c1898);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41448(final ActivityC18224 activityC18224, int i, MenuItem menuItem) {
        final String str = (String) activityC18224.f54395.get(i);
        int i2 = 3;
        if (menuItem.getItemId() == R.string.MT_Protector) {
            try {
                String string = C17812.m40435(str).m25585().toString();
                C11996 c11996 = new C11996();
                c11996.writeInt(-2106428910);
                c11996.m27459(str);
                c11996.m27459(string);
                c11996.writeInt(string.hashCode());
                C7050.m16211((CharSequence) Base64.encodeToString(c11996.m27449(), 3));
                return;
            } catch (Exception e) {
                activityC18224.m12259(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            C9766 c9766 = new C9766(activityC18224, activityC18224, str);
            c9766.m33344(R.string.MT_Protector);
            c9766.m33336((CharSequence) str);
            c9766.m33330();
            c9766.m33365(6);
            c9766.m33367();
            c9766.m33352(true);
            return;
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            int i3 = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(activityC18224);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46718(activityC18224.getString(R.string.MT_Protector, str));
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺᩺ܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC18224.m41449(this.f77664, str);
                }
            });
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46732();
            return;
        }
        String string2 = str + 2;
        while (C17812.m40433(string2)) {
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(i2);
            string2 = sbM17248.toString();
            i2++;
        }
        C4143 c4143 = new C4143(activityC18224, activityC18224, str);
        c4143.m33344(R.string.MT_Protector);
        c4143.m33336((CharSequence) string2);
        c4143.m33330();
        c4143.m33365(6);
        c4143.m33367();
        c4143.m33352(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m41449(ActivityC18224 activityC18224, String str) {
        C17812.m40429(str);
        activityC18224.f54395 = C17812.m40432();
        activityC18224.f54396.notifyDataSetChanged();
    }
}
