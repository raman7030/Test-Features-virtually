package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܺᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17679 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        Main mainM9965 = c4697.m9965();
        View viewM12252 = mainM9965.m12252(R.layout.MT_Protector);
        final RadioGroup radioGroup = (RadioGroup) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        radioGroup.check(ApplicationC21448.f67649.getBoolean("eflr", true) ? R.id.MT_Protector : R.id.MT_Protector);
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("efls", false));
        checkBox2.setChecked(ApplicationC21448.f67649.getBoolean("eflfs", true));
        C20671 c20671BuildDialog = mainM9965.buildDialog();
        c20671BuildDialog.m46727(m7840());
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢᩳ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z = radioGroup.getCheckedRadioButtonId() == R.id.MT_Protector;
                boolean zIsChecked = checkBox.isChecked();
                boolean zIsChecked2 = checkBox2.isChecked();
                ApplicationC21448.f67649.edit().putBoolean("eflr", z).putBoolean("efls", zIsChecked).putBoolean("eflfs", zIsChecked2).apply();
                C4697 c4698 = c4697;
                new C10975(this.f32491, c4698.m9965(), c4698.m9957(), z, zIsChecked2, zIsChecked, c4698.m9970().mo8217()).m22250();
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
