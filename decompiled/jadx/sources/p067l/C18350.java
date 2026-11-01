package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ܽᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18350 extends AbstractC3947 {
    public C18350() {
        super(R.string.MT_Protector, -1);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        if (c4697.m9964("local") && !c4697.m9971()) {
            return c4697.m9959();
        }
        return false;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        final Main mainM9965 = c4697.m9965();
        View viewM12252 = mainM9965.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector);
        C12166.m28086(textInputLayout);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final C16338 c16338 = new C16338();
        c16338.m37137();
        checkBox.setText(mainM9965.getResources().getQuantityString(R.plurals.MT_Protector, c4697.m9966()));
        checkBox.setChecked(c16338.f48006);
        C20671 c20671BuildDialog = mainM9965.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        final DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C7050.m16226(textInputLayout.getEditText());
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new View.OnClickListener(this) { // from class: l.ۨܽ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextInputLayout textInputLayout2 = textInputLayout;
                EditText editText = textInputLayout2.getEditText();
                C12826.requireNonNull(editText);
                String string = editText.getText().toString();
                if (string.isEmpty()) {
                    textInputLayout2.setError(C7050.m16224(R.string.MT_Protector));
                    editText.requestFocus();
                } else {
                    view.setEnabled(false);
                    new C15627(mainM9965, c4697, string, dialogInterfaceC2564M21200, c16338, checkBox, view, textInputLayout2, editText).m22250();
                }
            }
        });
    }
}
