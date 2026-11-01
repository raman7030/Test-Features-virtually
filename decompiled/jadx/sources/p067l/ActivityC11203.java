package p067l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11203 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final /* synthetic */ int f31124 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public C3847 f31125;

    /* JADX INFO: renamed from: ܿۧ */
    public ArrayList f31126 = C3826.m7473();

    /* JADX INFO: renamed from: ᩳۧ */
    public C15895 f31127;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "MyFavoritesRecordActivity";
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
        this.f13392.setNavigationOnClickListener(new ViewOnClickListenerC6115(3, this));
        C14849 c14849 = (C14849) m12277(R.id.MT_Protector);
        TextView textView = (TextView) m12277(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C15895 c15895 = new C15895(this);
        this.f31127 = c15895;
        c15895.registerAdapterDataObserver(new C17907(this, textView));
        textView.setVisibility(this.f31126.isEmpty() ? 0 : 8);
        c14849.setAdapter(this.f31127);
        C3847 c3847 = new C3847(new C19249(this));
        this.f31125 = c3847;
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
        m25871(-1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m25871(final int i) {
        View viewM12252 = m12252(R.layout.MT_Protector);
        if (i == -1) {
            ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        }
        final C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        final C12096 c12097 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        c12097.m32377(new C18578(c12096));
        final C9562 c9562 = i == -1 ? new C9562(null, "") : (C9562) this.f31126.get(i);
        c12096.mo27932((CharSequence) c9562.m22268());
        c12097.mo27932((CharSequence) c9562.m22270());
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        final DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۧۖۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC11203.m25868(this.f35257, c12097, c9562, c12096, i, dialogInterfaceC2564M21200);
            }
        });
        C7050.m16226(c12097);
        c12097.mo27941(c12097.m32590());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25868(ActivityC11203 activityC11203, C12096 c12096, C9562 c9562, C12096 c12097, int i, DialogInterfaceC2564 dialogInterfaceC2564) {
        ArrayList arrayList = activityC11203.f31126;
        if (c12096.m32590() == 0) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        c9562.m22267(c12097.m32500().toString());
        c9562.m22269(c12096.m32500().toString());
        int i2 = 1;
        if (i == -1) {
            arrayList.add(c9562);
            activityC11203.f31127.notifyItemInserted(arrayList.size() - 1);
        } else {
            activityC11203.f31127.notifyItemChanged(i);
        }
        int i3 = C3826.f8197;
        C4081.m8188(new RunnableC20282(i2), C3826.class, 500L);
        dialogInterfaceC2564.dismiss();
    }
}
