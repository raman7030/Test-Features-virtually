package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۟۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes2.dex */
public final class C9352 {
    /* JADX INFO: renamed from: ֫ */
    public static void m21683(final C18107 c18107, final C9315 c9315) {
        Main mainM41282 = c18107.m41282();
        View viewM12252 = mainM41282.m12252(R.layout.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText2);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        checkBox.setVisibility(0);
        checkBox2.setVisibility(0);
        checkBox.setText(R.string.MT_Protector);
        checkBox2.setText(R.string.MT_Protector);
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("aciad", true));
        checkBox2.setChecked(ActivityC17874.m40645());
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C4345.m8962(c9315.f25331, c9315.f25329, editText, editText2);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(mainM41282);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛ۠ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C9315 c9316 = c9315;
                c9316.m21560();
                InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
                CheckBox checkBox3 = checkBox;
                interfaceC14770Edit.putBoolean("aciad", checkBox3.isChecked()).apply();
                CheckBox checkBox4 = checkBox2;
                boolean zIsChecked = checkBox4.isChecked();
                int i3 = ActivityC17874.f53400;
                C24104.m53360(ApplicationC21448.f67649, "axml_id_2_name", zIsChecked);
                AbstractC17043 abstractC17043 = c9316.f25327;
                AbstractC17043 abstractC17044 = c9316.f25328;
                boolean zIsChecked2 = checkBox4.isChecked();
                boolean zIsChecked3 = checkBox3.isChecked();
                AbstractC17043 abstractC17043M54158 = C24556.m54158(c18107, R.string.MT_Protector, "mtcr");
                int i4 = C16723.f49313;
                C3313 c3313 = new C3313(C15386.class);
                c3313.m5777("saveAsPath", abstractC17043M54158.mo25505());
                c3313.m5777("inputPath1", abstractC17043.mo25505());
                c3313.m5777("inputPath2", abstractC17044.mo25505());
                c3313.m5778("id2name", zIsChecked2);
                c3313.m5778("ignoreAddOrDel", zIsChecked3);
                c3313.m5772();
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732().m3861().setOnClickListener(new ViewOnClickListenerC13376(c9315, editText, editText2, 0));
    }
}
