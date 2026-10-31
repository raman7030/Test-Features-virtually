package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2571 extends AbstractC1661 {
    public C2571() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        c2450.m7907("local");
        final C16560 c16560M7919 = c2450.m7919();
        final boolean z = false;
        if (!c16560M7919.m39038() && c16560M7919.m39035("local")) {
            z = true;
        }
        View viewM10216 = c2450.m7917().m10216(R.layout.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        RadioButton radioButton2 = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM10216.findViewById(R.id.radioButton3);
        final EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("duaw", false));
        checkBox2.setChecked(ApplicationC20075.f65008.getBoolean("duds", false));
        if (!z) {
            checkBox.setVisibility(8);
        }
        checkBox2.setText(C4925.m14338().getQuantityString(R.plurals.MT_Protector, c2450.m7918()));
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩺᩺ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                editText.setVisibility(z2 ? 0 : 8);
            }
        });
        editText.setText(((InterfaceC17889) c2450.m7909().get(0)).mo24433().m36517() + '/');
        if (c2450.m7918() != 1) {
            radioButton3.setVisibility(0);
            radioButton3.setChecked(true);
        }
        C19258 c19258BuildDialog = c2450.m7917().buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        dialogInterfaceC0206M44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.ܰ᩺ܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ApplicationC20075.f65008.edit().putBoolean("duaw", checkBox.isChecked()).putBoolean("duds", checkBox2.isChecked()).apply();
            }
        });
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.۟᩺ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2571.m8122(this.f24054, z, checkBox, checkBox2, c16560M7919, c2450, radioButton, dialogInterfaceC0206M44438, radioButton3, editText);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m8122(C2571 c2571, boolean z, CheckBox checkBox, CheckBox checkBox2, C16560 c16560, C2450 c2450, RadioButton radioButton, DialogInterfaceC0206 dialogInterfaceC0206, RadioButton radioButton2, EditText editText) {
        boolean z2 = z && checkBox.isChecked();
        boolean zIsChecked = checkBox2.isChecked();
        String strM39020 = z2 ? c16560.m39020() : c2450.m7925();
        if (radioButton.isChecked()) {
            m8121(c2450, strM39020, strM39020.length(), false, z2, zIsChecked);
            dialogInterfaceC0206.dismiss();
            return;
        }
        if (radioButton2.isChecked()) {
            m8121(c2450, strM39020, strM39020.length(), true, z2, zIsChecked);
            dialogInterfaceC0206.dismiss();
            return;
        }
        String strTrim = editText.getText().toString().trim();
        if (strTrim.contains("\\") || strTrim.startsWith("/") || strTrim.contains("//")) {
            C21374.m48457(R.string.MT_Protector);
        } else {
            dialogInterfaceC0206.dismiss();
            m8121(c2450, C9523.m24393(strM39020, strTrim), strM39020.length(), false, z2, zIsChecked);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8121(C2450 c2450, String str, int i, boolean z, boolean z2, boolean z3) {
        int i2 = C15104.f46193;
        C0994 c0994 = new C0994(C15975.class);
        c0994.m3478(c2450.m7909());
        c0994.m3474("extractDir", str);
        c0994.m3475("separateFolder", z);
        c0994.m3470(i, "relativeNameSubStart");
        c0994.m3475("extractToAnother", z2);
        c0994.m3475("deleteSources", z3);
        if (z2) {
            c0994.m3479(c2450);
        } else {
            c0994.m3486(c2450);
        }
        c0994.m3469();
    }
}
