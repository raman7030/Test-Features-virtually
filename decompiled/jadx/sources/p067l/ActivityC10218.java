package p067l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10218 extends AbstractActivityC5549 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final /* synthetic */ int f28324 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public C3512 f28325;

    /* JADX INFO: renamed from: ܿۧ */
    public ListView f28326;

    /* JADX INFO: renamed from: ᩳۧ */
    public C14352 f28327;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "AXmlStringsEditor";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28325 = (C3512) new C6874(this).m15765(C3512.class);
        C1428 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C22289 c22289 = new C22289(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m30940(c22289);
        m12250();
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        this.f13392 = (C1326) m12277(R.id.MT_Protector);
        ListView listView = (ListView) m12277(android.R.id.list);
        this.f28326 = listView;
        listView.setFastScrollEnabled(true);
        m12263(this.f13392);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC20302(this, 1));
        if (C18524.m42116((AbstractActivityC5549) this)) {
            return;
        }
        if (!this.f28325.f7118) {
            new C10889(this).m22250();
            return;
        }
        ListView listView2 = this.f28326;
        C14352 c14352 = new C14352(new C7536(this));
        this.f28327 = c14352;
        listView2.setAdapter((ListAdapter) c14352);
        this.f28326.setOnScrollListener(new C17593(this));
        this.f28327.m15992(this.f28326);
        this.f28327.m12528(true);
        this.f28327.m12530();
        this.f28326.setOnItemClickListener(this);
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
            new C20948(this, false).m22250();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m23826();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C4854(this, this, this.f28325.f7114).m42958();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C6195(this, this);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        String str = this.f28325.f7117;
        if (str == null) {
            new C20277(this).m22250();
            return true;
        }
        if (str.equals("Error")) {
            String strM38151 = this.f28325.f7109.m38151();
            if (!strM38151.contains(getString(R.string.MT_Protector)) && !strM38151.contains(getString(R.string.MT_Protector))) {
                C22682.m50795((CharSequence) strM38151);
                return true;
            }
            m12257(strM38151, false);
            return true;
        }
        C3512 c3512 = this.f28325;
        ActivityC16573.m37551(this, c3512.f7117, c3512.f7115, null, null);
        return true;
    }

    @Override // p067l.ActivityC4388
    /* JADX INFO: renamed from: ᩴ */
    public final void mo5283() {
        m23826();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ */
    public void m23826() {
        if (this.f28325.f7110) {
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(this);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻ܶܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC10218.f28324;
                    new C20948(this.f79728, true).m22250();
                }
            });
            c20671.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8877(0, this));
            c20671.m46732();
            return;
        }
        finish();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C2841 c2841 = new C2841(this, this);
        c2841.m33344(R.string.MT_Protector);
        c2841.m33356();
        C3512 c3512 = this.f28325;
        C14971 c14971 = c3512.f7109.f49796;
        if (c3512.f7114) {
            i = c3512.f7113[i];
        }
        c3512.f7112 = i;
        c2841.m33336((CharSequence) c14971.m50188(i));
        c2841.m33352(true);
    }
}
