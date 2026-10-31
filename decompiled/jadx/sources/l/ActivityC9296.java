package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC9296 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28175 = 0;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C1556 f28176;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f28177 = C1534.m5244();

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C14233 f28178;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "MyFavoritesRecordActivity";
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
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC3942(3, this));
        C13132 c13132 = (C13132) m10241(R.id.MT_Protector);
        TextView textView = (TextView) m10241(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        C14233 c14233 = new C14233(this);
        this.f28178 = c14233;
        c14233.registerAdapterDataObserver(new C16350(this, textView));
        textView.setVisibility(this.f28177.isEmpty() ? 0 : 8);
        c13132.setAdapter(this.f28178);
        C1556 c1556 = new C1556(new C17762(this));
        this.f28176 = c1556;
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
        m23862(-1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m23862(final int i) {
        View viewM10216 = m10216(R.layout.MT_Protector);
        if (i == -1) {
            ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        }
        final C10235 c10235 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        final C10235 c10236 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        c10236.m30313(new C17056(c10235));
        final C7569 c7569 = i == -1 ? new C7569(null, "") : (C7569) this.f28177.get(i);
        c10235.mo25910((CharSequence) c7569.m20291());
        c10236.mo25910((CharSequence) c7569.m20293());
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        final DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۧۖۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC9296.m23859(this.f32282, c10236, c7569, c10235, i, dialogInterfaceC0206M19253);
            }
        });
        C4925.m14329(c10236);
        c10236.mo25919(c10236.m30526());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23859(ActivityC9296 activityC9296, C10235 c10235, C7569 c7569, C10235 c10236, int i, DialogInterfaceC0206 dialogInterfaceC0206) {
        ArrayList arrayList = activityC9296.f28177;
        if (c10235.m30526() == 0) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        c7569.m20290(c10236.m30436().toString());
        c7569.m20292(c10235.m30436().toString());
        int i2 = 1;
        if (i == -1) {
            arrayList.add(c7569);
            activityC9296.f28178.notifyItemInserted(arrayList.size() - 1);
        } else {
            activityC9296.f28178.notifyItemChanged(i);
        }
        int i3 = C1534.f5415;
        C1802.m5991(new RunnableC18848(i2), C1534.class, 500L);
        dialogInterfaceC0206.dismiss();
    }
}
