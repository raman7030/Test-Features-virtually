package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC15062 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final C4583 f45985 = new C4583();

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public List f45986 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C13132 f45987;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public AbstractC16157 f45988;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public TextView f45989;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C12346 f45990;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "TutorialListActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC11108(2, this));
        this.f45988 = C20500.m46962((Context) this, true);
        this.f45990 = (C12346) m10241(R.id.MT_Protector);
        this.f45987 = (C13132) m10241(R.id.MT_Protector);
        TextView textView = (TextView) m10241(R.id.MT_Protector);
        this.f45989 = textView;
        textView.setText(R.string.MT_Protector);
        this.f45989.setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۜۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4583 c4583 = ActivityC15062.f45985;
                new C0952(this.f60702, true).m20274();
            }
        });
        this.f45987.setAdapter(new C8008(this));
        new C0952(this, false).m20274();
        this.f45990.m29957(new InterfaceC4585() { // from class: l.֡ۜۡ
            @Override // l.InterfaceC4585
            /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
            public final void mo1502() {
                C4583 c4583 = ActivityC15062.f45985;
                new C0952(this.f1531, true).m20274();
            }
        });
        f45985.m13483(this, new InterfaceC20106() { // from class: l.ۚۜۡ
            @Override // l.InterfaceC20106
            /* JADX INFO: renamed from: ֫ */
            public final void mo13218(Object obj) {
                C4583 c4583 = ActivityC15062.f45985;
                new C0952(this.f16261, true).m20274();
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
            if (!C23196.m51460()) {
                C21374.m48457(R.string.MT_Protector);
                new ViewOnClickListenerC0059(this);
                return true;
            }
            startActivity(new Intent(this, (Class<?>) ActivityC6388.class));
            return true;
        }
        if (itemId != R.string.MT_Protector) {
            return false;
        }
        if (!C23196.m51460()) {
            C21374.m48457(R.string.MT_Protector);
            new ViewOnClickListenerC0059(this);
            return true;
        }
        startActivity(new Intent(this, (Class<?>) ActivityC11536.class));
        return true;
    }
}
