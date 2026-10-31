package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC8259 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25414 = 0;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C1203 f25415;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ListView f25416;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C12609 f25417;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "AXmlStringsEditor";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f25415 = (C1203) new C4741(this).m13885(C1203.class);
        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
        C20960 c20960 = new C20960(this);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28891(c20960);
        m10214();
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        this.f10584 = (C9762) m10241(R.id.MT_Protector);
        ListView listView = (ListView) m10241(android.R.id.list);
        this.f25416 = listView;
        listView.setFastScrollEnabled(true);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC18869(this, 1));
        if (C16999.m39873((AbstractActivityC3346) this)) {
            return;
        }
        if (!this.f25415.f4349) {
            new C8965(this).m20274();
            return;
        }
        ListView listView2 = this.f25416;
        C12609 c12609 = new C12609(new C5437(this));
        this.f25417 = c12609;
        listView2.setAdapter((ListAdapter) c12609);
        this.f25416.setOnScrollListener(new C16019(this));
        this.f25417.m14112(this.f25416);
        this.f25417.m10504(true);
        this.f25417.m10506();
        this.f25416.setOnItemClickListener(this);
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
            new C19549(this, false).m20274();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            m21856();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C2615(this, this, this.f25415.f4345).m40707();
            return true;
        }
        if (itemId == R.id.MT_Protector) {
            new C4026(this, this);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        String str = this.f25415.f4348;
        if (str == null) {
            new C18843(this).m20274();
            return true;
        }
        if (str.equals("Error")) {
            String strM35991 = this.f25415.f4340.m35991();
            if (!strM35991.contains(getString(R.string.MT_Protector)) && !strM35991.contains(getString(R.string.MT_Protector))) {
                C21374.m48459((CharSequence) strM35991);
                return true;
            }
            m10221(strM35991, false);
            return true;
        }
        C1203 c1203 = this.f25415;
        ActivityC14946.m35399(this, c1203.f4348, c1203.f4346, null, null);
        return true;
    }

    @Override // l.ActivityC2124
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2954() {
        m21856();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m21856() {
        if (this.f25415.f4341) {
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻ܶܽ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = ActivityC8259.f25414;
                    new C19549(this.f76976, true).m20274();
                }
            });
            c19258.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6848(0, this));
            c19258.m44438();
            return;
        }
        finish();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0497 c0497 = new C0497(this, this);
        c0497.m31258(R.string.MT_Protector);
        c0497.m31270();
        C1203 c1203 = this.f25415;
        C13260 c13260 = c1203.f4340.f46672;
        if (c1203.f4345) {
            i = c1203.f4344[i];
        }
        c1203.f4343 = i;
        c0497.m31250((CharSequence) c13260.m47858(i));
        c0497.m31266(true);
    }
}
