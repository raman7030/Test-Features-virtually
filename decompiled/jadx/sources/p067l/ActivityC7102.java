package p067l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙ᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC7102 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final /* synthetic */ int f18521 = 0;

    /* JADX INFO: renamed from: ܳۧ */
    public ArrayList f18522;

    /* JADX INFO: renamed from: ܿۧ */
    public InterfaceC7773 f18523;

    /* JADX INFO: renamed from: ᩳۧ */
    public C3078 f18524;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "CustomSortingMethodActivity";
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
        this.f13392.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ܺ᩻ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC7102.f18521;
                this.f53206.finish();
            }
        });
        C14849 c14849 = (C14849) m12277(R.id.MT_Protector);
        TextView textView = (TextView) m12277(R.id.MT_Protector);
        textView.setText(R.string.MT_Protector);
        int intExtra = getIntent().getIntExtra("NetworkConfigId", -1);
        if (intExtra == -1) {
            this.f18523 = new C10455();
        } else {
            AbstractC5769 abstractC5769M33131 = C14486.m33131(intExtra);
            if (abstractC5769M33131 == null) {
                C22682.m50795((CharSequence) ("Network config not found: id-" + intExtra));
                finish();
                return;
            }
            this.f18523 = new C17159(abstractC5769M33131);
        }
        ArrayList arrayListMo17935 = this.f18523.mo17935();
        this.f18522 = arrayListMo17935;
        C8150.sort(arrayListMo17935, C10162.comparing(new C5091()));
        C3078 c3078 = new C3078(this);
        this.f18524 = c3078;
        c3078.registerAdapterDataObserver(new C21185(this, textView));
        textView.setVisibility(this.f18522.isEmpty() ? 0 : 8);
        c14849.setAdapter(this.f18524);
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
        m16361(-1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m16361(final int i) {
        View viewM12252 = m12252(R.layout.MT_Protector);
        if (i == -1) {
            ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        }
        final C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton[] radioButtonArr = {(RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector)};
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۘ᩻ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ActivityC7102.f18521;
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
            C3749 c3749 = (C3749) this.f18522.get(i);
            int iM22088 = C9486.m22088(c3749.m7237());
            boolean zM22098 = C9486.m22098(c3749.m7237());
            c12096.mo27932((CharSequence) c3749.f7960);
            if (iM22088 >= 0 && iM22088 < 4) {
                radioButtonArr[iM22088].setChecked(true);
            } else {
                radioButtonArr[0].setChecked(true);
            }
            checkBox.setChecked(zM22098);
        }
        C20671 c20671BuildDialog = buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴ᩻ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC7102.m16358(this.f63367, c12096, radioButtonArr, checkBox, i, dialogInterfaceC2564M46732);
            }
        });
        if (i == -1) {
            C7050.m16226(c12096);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16358(ActivityC7102 activityC7102, C12096 c12096, RadioButton[] radioButtonArr, CheckBox checkBox, int i, DialogInterfaceC2564 dialogInterfaceC2564) {
        if (c12096.m32590() == 0) {
            c12096.requestFocus();
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        int i2 = 0;
        while (i2 < 4 && !radioButtonArr[i2].isChecked()) {
            i2++;
        }
        C3749 c3749 = new C3749(AbstractC18422.m41972(c12096.m32500().toString()), C9486.m22089(i2, checkBox.isChecked()));
        if (i == -1) {
            activityC7102.f18522.add(c3749);
            activityC7102.f18524.notifyItemInserted(activityC7102.f18522.size() - 1);
        } else {
            activityC7102.f18522.set(i, c3749);
            activityC7102.f18524.notifyItemChanged(i);
        }
        activityC7102.f18523.mo17936(c3749);
        dialogInterfaceC2564.dismiss();
    }
}
