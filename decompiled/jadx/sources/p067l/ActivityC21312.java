package p067l;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7J5 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC21312 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ۢۧ */
    public static final /* synthetic */ int f67165 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public int f67167;

    /* JADX INFO: renamed from: ᩳۧ */
    public C9911 f67169;

    /* JADX INFO: renamed from: ᩷ۧ */
    public C3847 f67170;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C8331 f67171;

    /* JADX INFO: renamed from: ܿۧ */
    public final List f67168 = C14486.m33132();

    /* JADX INFO: renamed from: ۜۧ */
    public C7350 f67166 = new C7350();

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "JumpHostManager";
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f67171 = ViewOnClickListenerC20541.m46366(this, new C18758(1, this));
        m12277(R.layout.MT_Protector);
        m12277(R.string.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC2534(0, this));
        C14849 c14849 = (C14849) m12277(R.id.MT_Protector);
        TextView textView = (TextView) m12277(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C9911 c9911 = new C9911(this);
        this.f67169 = c9911;
        c9911.registerAdapterDataObserver(new C7229(this, textView));
        textView.setVisibility(this.f67168.isEmpty() ? 0 : 8);
        c14849.setAdapter(this.f67169);
        C3847 c3847 = new C3847(new C3205(this));
        this.f67170 = c3847;
        c3847.m7551(c14849);
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
        C4547.m9622(this);
        return true;
    }

    /* JADX INFO: renamed from: ۨ */
    public final C8331 m48225() {
        return this.f67171;
    }

    /* JADX INFO: renamed from: ᩺ */
    public final C7350 m48227() {
        return this.f67166;
    }

    /* JADX INFO: renamed from: ܰ */
    public final void m48226() {
        this.f67169.notifyItemInserted(this.f67168.size() - 1);
    }

    /* JADX INFO: renamed from: ۟ */
    public final void m48224() {
        this.f67169.notifyItemChanged(this.f67167);
    }
}
