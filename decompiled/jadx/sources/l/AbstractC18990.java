package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34R9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18990 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f59869;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f59870;

    public AbstractC18990(final ActivityC21107 activityC21107) {
        View viewM10216 = activityC21107.m10216(R.layout.MT_Protector);
        final C5062 c5062 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        final C5062 c5063 = (C5062) viewM10216.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner1);
        this.f59870 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        spinner.setAdapter((SpinnerAdapter) new C20065(activityC21107, activityC21107.getResources().getStringArray(R.array.MT_Protector)));
        spinner.setSelection(Math.min(1, ApplicationC20075.f65008.getInt("dex_search_type_class", 0)));
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC21107);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۖ᩶ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
                Spinner spinner2 = spinner;
                interfaceC13049Edit.mo25853(spinner2.getSelectedItemPosition(), "dex_search_type_class").apply();
                C5062 c5064 = c5062;
                c5064.m14610();
                C5062 c5065 = c5063;
                c5065.m14610();
                String strTrim = c5064.m14611().toString().trim();
                String strTrim2 = c5065.m14611().toString().trim();
                int selectedItemPosition = spinner2.getSelectedItemPosition();
                if (strTrim.isEmpty()) {
                    return;
                }
                new C4173(this.f8583, activityC21107, strTrim, strTrim2, selectedItemPosition).m20274();
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f59869 = c19258.m44415();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43825(boolean z) {
        this.f59870.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        this.f59869.m1449();
    }
}
