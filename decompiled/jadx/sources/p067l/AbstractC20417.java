package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34R9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20417 {

    /* JADX INFO: renamed from: ֫ */
    public final DialogInterfaceC2564 f63097;

    /* JADX INFO: renamed from: ۧ */
    public final TextView f63098;

    public AbstractC20417(final ActivityC22429 activityC22429) {
        View viewM12252 = activityC22429.m12252(R.layout.MT_Protector);
        final C7179 c7179 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        final C7179 c71710 = (C7179) viewM12252.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner1);
        this.f63098 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C21438(activityC22429, activityC22429.getResources().getStringArray(R.array.MT_Protector)));
        spinner.setSelection(Math.min(1, ApplicationC21448.f67649.getInt("dex_search_type_class", 0)));
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC22429);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖ᩶ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
                Spinner spinner2 = spinner;
                interfaceC14770Edit.mo27875(spinner2.getSelectedItemPosition(), "dex_search_type_class").apply();
                C7179 c71711 = c7179;
                c71711.m16517();
                C7179 c71712 = c71710;
                c71712.m16517();
                String strTrim = c71711.m16518().toString().trim();
                String strTrim2 = c71712.m16518().toString().trim();
                int selectedItemPosition = spinner2.getSelectedItemPosition();
                if (strTrim.isEmpty()) {
                    return;
                }
                new C6335(this.f11377, activityC22429, strTrim, strTrim2, selectedItemPosition).m22250();
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f63097 = c20671.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46093(boolean z) {
        this.f63098.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        this.f63097.m3862();
    }
}
