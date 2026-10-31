package l;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC19932 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f64528 = 0;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f64530;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C7936 f64532;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C1556 f64533;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C6273 f64534;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final List f64531 = C12749.m31048();

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C5242 f64529 = new C5242();

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "JumpHostManager";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f64534 = ViewOnClickListenerC19121.m44072(this, new C17245(1, this));
        m10241(R.layout.MT_Protector);
        m10241(R.string.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC0174(0, this));
        C13132 c13132 = (C13132) m10241(R.id.MT_Protector);
        TextView textView = (TextView) m10241(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C7936 c7936 = new C7936(this);
        this.f64532 = c7936;
        c7936.registerAdapterDataObserver(new C5114(this, textView));
        textView.setVisibility(this.f64531.isEmpty() ? 0 : 8);
        c13132.setAdapter(this.f64532);
        C1556 c1556 = new C1556(new C0880(this));
        this.f64533 = c1556;
        c1556.m5322(c13132);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.MT_Protector, 0, R.string.MT_Protector);
        menuItemAdd.setShowAsAction(2);
        menuItemAdd.setIcon(R.drawable.MT_Protector);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.MT_Protector) {
            return false;
        }
        C2292.m7554(this);
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6273 m45912() {
        return this.f64534;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C5242 m45914() {
        return this.f64529;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45913() {
        this.f64532.notifyItemInserted(this.f64531.size() - 1);
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m45911() {
        this.f64532.notifyItemChanged(this.f64530);
    }
}
