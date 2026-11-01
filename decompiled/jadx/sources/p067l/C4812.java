package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4812 extends AbstractC3947 {
    public C4812() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        c4697.m9955("local");
        final C18107 c18107M9967 = c4697.m9967();
        final boolean z = false;
        if (!c18107M9967.m41264() && c18107M9967.m41261("local")) {
            z = true;
        }
        View viewM12252 = c4697.m9965().m12252(R.layout.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        RadioButton radioButton2 = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM12252.findViewById(R.id.radioButton3);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("duaw", false));
        checkBox2.setChecked(ApplicationC21448.f67649.getBoolean("duds", false));
        if (!z) {
            checkBox.setVisibility(8);
        }
        checkBox2.setText(C7050.m16235().getQuantityString(R.plurals.MT_Protector, c4697.m9966()));
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩺᩺ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                editText.setVisibility(z2 ? 0 : 8);
            }
        });
        editText.setText(((InterfaceC19370) c4697.m9957().get(0)).mo26445().m38675() + '/');
        if (c4697.m9966() != 1) {
            radioButton3.setVisibility(0);
            radioButton3.setChecked(true);
        }
        C20671 c20671BuildDialog = c4697.m9965().buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        dialogInterfaceC2564M46732.m3849(new DialogInterface.OnDismissListener() { // from class: l.ܰ᩺ܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ApplicationC21448.f67649.edit().putBoolean("duaw", checkBox.isChecked()).putBoolean("duds", checkBox2.isChecked()).apply();
            }
        });
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.۟᩺ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4812.m10155(this.f26970, z, checkBox, checkBox2, c18107M9967, c4697, radioButton, dialogInterfaceC2564M46732, radioButton3, editText);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m10155(C4812 c4812, boolean z, CheckBox checkBox, CheckBox checkBox2, C18107 c18107, C4697 c4697, RadioButton radioButton, DialogInterfaceC2564 dialogInterfaceC2564, RadioButton radioButton2, EditText editText) {
        boolean z2 = z && checkBox.isChecked();
        boolean zIsChecked = checkBox2.isChecked();
        String strM41246 = z2 ? c18107.m41246() : c4697.m9973();
        if (radioButton.isChecked()) {
            m10154(c4697, strM41246, strM41246.length(), false, z2, zIsChecked);
            dialogInterfaceC2564.dismiss();
            return;
        }
        if (radioButton2.isChecked()) {
            m10154(c4697, strM41246, strM41246.length(), true, z2, zIsChecked);
            dialogInterfaceC2564.dismiss();
            return;
        }
        String strTrim = editText.getText().toString().trim();
        if (strTrim.contains("\\") || strTrim.startsWith("/") || strTrim.contains("//")) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            dialogInterfaceC2564.dismiss();
            m10154(c4697, C11419.m26403(strM41246, strTrim), strM41246.length(), false, z2, zIsChecked);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10154(C4697 c4697, String str, int i, boolean z, boolean z2, boolean z3) {
        int i2 = C16723.f49313;
        C3313 c3313 = new C3313(C17551.class);
        c3313.m5781(c4697.m9957());
        c3313.m5777("extractDir", str);
        c3313.m5778("separateFolder", z);
        c3313.m5773(i, "relativeNameSubStart");
        c3313.m5778("extractToAnother", z2);
        c3313.m5778("deleteSources", z3);
        if (z2) {
            c3313.m5782(c4697);
        } else {
            c3313.m5789(c4697);
        }
        c3313.m5772();
    }
}
