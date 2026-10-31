package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 38V8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16109 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        Main mainM7917 = c2450.m7917();
        View viewM10216 = mainM7917.m10216(R.layout.MT_Protector);
        final RadioGroup radioGroup = (RadioGroup) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        radioGroup.check(ApplicationC20075.f65008.getBoolean("eflr", true) ? R.id.MT_Protector : R.id.MT_Protector);
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("efls", false));
        checkBox2.setChecked(ApplicationC20075.f65008.getBoolean("eflfs", true));
        C19258 c19258BuildDialog = mainM7917.buildDialog();
        c19258BuildDialog.m44433(m5610());
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۢᩳ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z = radioGroup.getCheckedRadioButtonId() == R.id.MT_Protector;
                boolean zIsChecked = checkBox.isChecked();
                boolean zIsChecked2 = checkBox2.isChecked();
                ApplicationC20075.f65008.edit().putBoolean("eflr", z).putBoolean("efls", zIsChecked).putBoolean("eflfs", zIsChecked2).apply();
                C2450 c2451 = c2450;
                new C9055(this.f29538, c2451.m7917(), c2451.m7909(), z, zIsChecked2, zIsChecked, c2451.m7922().mo6020()).m20274();
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
