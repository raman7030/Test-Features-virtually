package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097X */
/* JADX INFO: loaded from: classes2.dex */
public final class C7348 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19710(final C16560 c16560, final C7309 c7309) {
        Main mainM39056 = c16560.m39056();
        View viewM10216 = mainM39056.m10216(R.layout.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM10216.findViewById(R.id.editText2);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        checkBox.setVisibility(0);
        checkBox2.setVisibility(0);
        checkBox.setText(R.string.MT_Protector);
        checkBox2.setText(R.string.MT_Protector);
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("aciad", true));
        checkBox2.setChecked(ActivityC16315.m38430());
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C2079.m6836(c7309.f22440, c7309.f22438, editText, editText2);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(mainM39056);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛ۠ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C7309 c73010 = c7309;
                c73010.m19592();
                InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
                CheckBox checkBox3 = checkBox;
                interfaceC13049Edit.putBoolean("aciad", checkBox3.isChecked()).apply();
                CheckBox checkBox4 = checkBox2;
                boolean zIsChecked = checkBox4.isChecked();
                int i3 = ActivityC16315.f50233;
                C22870.m50970(ApplicationC20075.f65008, "axml_id_2_name", zIsChecked);
                AbstractC15440 abstractC15440 = c73010.f22436;
                AbstractC15440 abstractC15441 = c73010.f22437;
                boolean zIsChecked2 = checkBox4.isChecked();
                boolean zIsChecked3 = checkBox3.isChecked();
                AbstractC15440 abstractC15440M51761 = C23346.m51761(c16560, R.string.MT_Protector, "mtcr");
                int i4 = C15104.f46193;
                C0994 c0994 = new C0994(C13697.class);
                c0994.m3474("saveAsPath", abstractC15440M51761.mo23554());
                c0994.m3474("inputPath1", abstractC15440.mo23554());
                c0994.m3474("inputPath2", abstractC15441.mo23554());
                c0994.m3475("id2name", zIsChecked2);
                c0994.m3475("ignoreAddOrDel", zIsChecked3);
                c0994.m3469();
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new ViewOnClickListenerC11582(c7309, editText, editText2, 0));
    }
}
