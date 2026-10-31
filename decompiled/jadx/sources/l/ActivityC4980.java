package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC4980 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15687 = 0;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f15688;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC5686 f15689;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C0746 f15690;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "CustomSortingMethodActivity";
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
        this.f10584.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ܺ᩻ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC4980.f15687;
                this.f50038.finish();
            }
        });
        C13132 c13132 = (C13132) m10241(R.id.MT_Protector);
        TextView textView = (TextView) m10241(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        int intExtra = getIntent().getIntExtra("NetworkConfigId", -1);
        if (intExtra == -1) {
            this.f15689 = new C8508();
        } else {
            AbstractC3577 abstractC3577M31047 = C12749.m31047(intExtra);
            if (abstractC3577M31047 == null) {
                C21374.m48459((CharSequence) ("Network config not found: id-" + intExtra));
                finish();
                return;
            }
            this.f15689 = new C15562(abstractC3577M31047);
        }
        ArrayList arrayListMo16000 = this.f15689.mo16000();
        this.f15688 = arrayListMo16000;
        C6083.sort(arrayListMo16000, C8200.comparing(new C2864()));
        C0746 c0746 = new C0746(this);
        this.f15690 = c0746;
        c0746.registerAdapterDataObserver(new C19798(this, textView));
        textView.setVisibility(this.f15688.isEmpty() ? 0 : 8);
        c13132.setAdapter(this.f15690);
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
        m14457(-1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m14457(final int i) {
        View viewM10216 = m10216(R.layout.MT_Protector);
        if (i == -1) {
            ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        }
        final C10235 c10235 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector)};
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۘ᩻ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ActivityC4980.f15687;
                RadioButton[] radioButtonArr2 = radioButtonArr;
                int length = radioButtonArr2.length;
                for (int i3 = 0; i3 < length; i3++) {
                    RadioButton radioButton = radioButtonArr2[i3];
                    radioButton.setChecked(radioButton == view);
                }
            }
        };
        for (int i2 = 0; i2 < 4; i2++) {
            radioButtonArr[i2].setOnClickListener(onClickListener);
        }
        if (i == -1) {
            radioButtonArr[0].setChecked(true);
        } else {
            C1452 c1452 = (C1452) this.f15688.get(i);
            int iM20112 = C7489.m20112(c1452.m4994());
            boolean zM20122 = C7489.m20122(c1452.m4994());
            c10235.mo25910((CharSequence) c1452.f5187);
            if (iM20112 >= 0 && iM20112 < 4) {
                radioButtonArr[iM20112].setChecked(true);
            } else {
                radioButtonArr[0].setChecked(true);
            }
            checkBox.setChecked(zM20122);
        }
        C19258 c19258BuildDialog = buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴ᩻ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC4980.m14454(this.f60133, c10235, radioButtonArr, checkBox, i, dialogInterfaceC0206M44438);
            }
        });
        if (i == -1) {
            C4925.m14329(c10235);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14454(ActivityC4980 activityC4980, C10235 c10235, RadioButton[] radioButtonArr, CheckBox checkBox, int i, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (c10235.m30526() == 0) {
            c10235.requestFocus();
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        int i2 = 0;
        while (i2 < 4 && !radioButtonArr[i2].isChecked()) {
            i2++;
        }
        C1452 c1452 = new C1452(AbstractC16891.m39731(c10235.m30436().toString()), C7489.m20113(i2, checkBox.isChecked()));
        if (i == -1) {
            activityC4980.f15688.add(c1452);
            activityC4980.f15690.notifyItemInserted(activityC4980.f15688.size() - 1);
        } else {
            activityC4980.f15688.set(i, c1452);
            activityC4980.f15690.notifyItemChanged(i);
        }
        activityC4980.f15689.mo16001(c1452);
        dialogInterfaceC0206.dismiss();
    }
}
