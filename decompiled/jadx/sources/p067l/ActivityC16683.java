package p067l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16683 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final C6724 f49103 = new C6724();

    /* JADX INFO: renamed from: ۜۧ */
    public List f49104 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܳۧ */
    public C14849 f49105;

    /* JADX INFO: renamed from: ܿۧ */
    public AbstractC17724 f49106;

    /* JADX INFO: renamed from: ᩳۧ */
    public TextView f49107;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C14102 f49108;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "TutorialListActivity";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC12926(2, this));
        this.f49106 = C21852.m49285((Context) this, true);
        this.f49108 = (C14102) m12277(R.id.MT_Protector);
        this.f49105 = (C14849) m12277(R.id.MT_Protector);
        TextView textView = (TextView) m12277(R.id.MT_Protector);
        this.f49107 = textView;
        textView.setText(R.string.MT_Protector);
        this.f49107.setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۜۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6724 c6724 = ActivityC16683.f49103;
                new C3273(this.f63932, true).m22250();
            }
        });
        this.f49105.setAdapter(new C9979(this));
        new C3273(this, false).m22250();
        this.f49108.m32017(new InterfaceC6726() { // from class: l.֡ۜۡ
            @Override // p067l.InterfaceC6726
            /* JADX INFO: renamed from: ᩳ */
            public final void mo3900() {
                C6724 c6724 = ActivityC16683.f49103;
                new C3273(this.f4309, true).m22250();
            }
        });
        f49103.m15372(this, new InterfaceC21477() { // from class: l.ۚۜۡ
            @Override // p067l.InterfaceC21477
            /* JADX INFO: renamed from: ֫ */
            public final void mo15100(Object obj) {
                C6724 c6724 = ActivityC16683.f49103;
                new C3273(this.f19102, true).m22250();
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        MenuItem menuItemAdd2 = menu.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd2.setIcon(R.drawable.MT_Protector);
        menuItemAdd2.setShowAsAction(2);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector) {
            if (!C24414.m53856()) {
                C22682.m50793(R.string.MT_Protector);
                new ViewOnClickListenerC2424(this);
                return true;
            }
            startActivity(new Intent(this, (Class<?>) ActivityC8440.class));
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            return false;
        }
        if (!C24414.m53856()) {
            C22682.m50793(R.string.MT_Protector);
            new ViewOnClickListenerC2424(this);
            return true;
        }
        startActivity(new Intent(this, (Class<?>) ActivityC13332.class));
        return true;
    }
}
