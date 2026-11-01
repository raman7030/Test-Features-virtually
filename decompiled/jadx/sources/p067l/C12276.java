package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۤܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 795C */
/* JADX INFO: loaded from: classes3.dex */
public final class C12276 extends AbstractC3947 {
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        if (!c4697.m9964("local")) {
            return false;
        }
        C18107 c18107M9967 = c4697.m9967();
        if (c4697.m9964("local")) {
            return c4697.m9966() == 1 || !(!c18107M9967.m41261("local") || c18107M9967.m41264() || c4697.m9962().equals(c18107M9967.m41217()));
        }
        return false;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955("local");
        if (c4697.m9966() != 1) {
            c18107M9967.m41224("local");
            m7832(c4697, R.string.MT_Protector, AbstractC3947.m7830(c4697, R.string.MT_Protector));
            return;
        }
        AbstractC17043 abstractC17043Mo26445 = c4697.m9961().mo26445();
        View viewM12252 = c4697.m9965().m12252(R.layout.MT_Protector);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText2);
        final EditText editText3 = (EditText) viewM12252.findViewById(R.id.editText3);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector);
        C12166.m28086(textInputLayout);
        final C18107 c18107M9968 = c4697.m9967();
        if (!c18107M9968.m41261("local") || c18107M9968.m41264() || c4697.m9962().equals(c18107M9968.m41217())) {
            editText.setText(abstractC17043Mo26445.m38675() + "-link" + abstractC17043Mo26445.m38663());
            editText2.setText(c4697.m9974());
        } else {
            editText.setText(abstractC17043Mo26445.getName());
            editText2.setText(c18107M9968.m41284());
            textInputLayout2.setEndIconMode(-1);
            textInputLayout2.setEndIconDrawable(R.drawable.MT_Protector);
            textInputLayout2.setEndIconOnClickListener(new ViewOnClickListenerC4363(c4697, c18107M9968, editText2));
        }
        editText3.setText(abstractC17043Mo26445.mo34129());
        C20671 c20671BuildDialog = c4697.m9965().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46715(viewM12252);
        final DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۗܽ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceC2564M21200;
                C18107 c18107 = c18107M9968;
                C4697 c4698 = c4697;
                String string = editText.getText().toString();
                String string2 = editText2.getText().toString();
                String string3 = editText3.getText().toString();
                AbstractC17043 abstractC17043M42109 = C18524.m42109(C11419.m26403(string2, string), new String[0]);
                if (abstractC17043M42109.mo25094()) {
                    textInputLayout.setError(C7050.m16224(R.string.MT_Protector));
                    return;
                }
                try {
                    abstractC17043M42109.mo37342();
                    abstractC17043M42109.mo29995(string3);
                    dialogInterfaceC2564.dismiss();
                    if (c18107.m41261("local") && !c18107.m41264() && string2.equals(c18107.m41284())) {
                        c18107.m41279(abstractC17043M42109.getName());
                        c18107.m41241();
                    } else {
                        c4698.m9969().m41279(abstractC17043M42109.getName());
                        c4698.m9969().m41259(string2, true);
                    }
                    C17127.m38756();
                    dialogInterfaceC2564.dismiss();
                } catch (IOException e) {
                    c4698.m9965().m12259(e, (DialogInterface.OnDismissListener) null);
                }
            }
        });
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c18107M9967.m41224("local");
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C14287.class);
        c3313.m5781(c4697.m9957());
        c3313.m5787(c4697);
        c3313.m5777("targetPath", c18107M9967.m41284());
        c3313.m5772();
    }
}
