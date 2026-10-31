package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 795C */
/* JADX INFO: loaded from: classes3.dex */
public final class C10424 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        if (!c2450.m7916("local")) {
            return false;
        }
        C16560 c16560M7919 = c2450.m7919();
        if (c2450.m7916("local")) {
            return c2450.m7918() == 1 || !(!c16560M7919.m39035("local") || c16560M7919.m39038() || c2450.m7914().equals(c16560M7919.m38991()));
        }
        return false;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907("local");
        if (c2450.m7918() != 1) {
            c16560M7919.m38998("local");
            m5602(c2450, R.string.MT_Protector, AbstractC1661.m5600(c2450, R.string.MT_Protector));
            return;
        }
        AbstractC15440 abstractC15440Mo24433 = c2450.m7913().mo24433();
        View viewM10216 = c2450.m7917().m10216(R.layout.MT_Protector);
        final EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM10216.findViewById(R.id.editText2);
        final EditText editText3 = (EditText) viewM10216.findViewById(R.id.editText3);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM10216.findViewById(R.id.MT_Protector);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewM10216.findViewById(R.id.MT_Protector);
        C10309.m26062(textInputLayout);
        final C16560 c16560M79110 = c2450.m7919();
        if (!c16560M79110.m39035("local") || c16560M79110.m39038() || c2450.m7914().equals(c16560M79110.m38991())) {
            editText.setText(abstractC15440Mo24433.m36517() + "-link" + abstractC15440Mo24433.m36505());
            editText2.setText(c2450.m7926());
        } else {
            editText.setText(abstractC15440Mo24433.getName());
            editText2.setText(c16560M79110.m39058());
            textInputLayout2.setEndIconMode(-1);
            textInputLayout2.setEndIconDrawable(R.drawable.MT_Protector);
            textInputLayout2.setEndIconOnClickListener(new ViewOnClickListenerC2098(c2450, c16560M79110, editText2));
        }
        editText3.setText(abstractC15440Mo24433.mo32031());
        C19258 c19258BuildDialog = c2450.m7917().buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44421(viewM10216);
        final DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۗܽ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceC0206M19253;
                C16560 c16560 = c16560M79110;
                C2450 c2451 = c2450;
                String string = editText.getText().toString();
                String string2 = editText2.getText().toString();
                String string3 = editText3.getText().toString();
                AbstractC15440 abstractC15440M39866 = C16999.m39866(C9523.m24393(string2, string), new String[0]);
                if (abstractC15440M39866.mo23120()) {
                    textInputLayout.setError(C4925.m14327(R.string.MT_Protector));
                    return;
                }
                try {
                    abstractC15440M39866.mo35195();
                    abstractC15440M39866.mo27934(string3);
                    dialogInterfaceC0206.dismiss();
                    if (c16560.m39035("local") && !c16560.m39038() && string2.equals(c16560.m39058())) {
                        c16560.m39053(abstractC15440M39866.getName());
                        c16560.m39015();
                    } else {
                        c2451.m7921().m39053(abstractC15440M39866.getName());
                        c2451.m7921().m39033(string2, true);
                    }
                    C15528.m36596();
                    dialogInterfaceC0206.dismiss();
                } catch (IOException e) {
                    c2451.m7917().m10223(e, (DialogInterface.OnDismissListener) null);
                }
            }
        });
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c16560M7919.m38998("local");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C12540.class);
        c0994.m3478(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3474("targetPath", c16560M7919.m39058());
        c0994.m3469();
    }
}
