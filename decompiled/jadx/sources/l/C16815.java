package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ܽᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J951 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16815 extends AbstractC1661 {
    public C16815() {
        super(R.string.MT_Protector, -1);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        if (c2450.m7916("local") && !c2450.m7923()) {
            return c2450.m7911();
        }
        return false;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        final Main mainM7917 = c2450.m7917();
        View viewM10216 = mainM7917.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM10216.findViewById(R.id.MT_Protector);
        C10309.m26062(textInputLayout);
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final C14698 c14698 = new C14698();
        c14698.m34990();
        checkBox.setText(mainM7917.getResources().getQuantityString(R.plurals.MT_Protector, c2450.m7918()));
        checkBox.setChecked(c14698.f44892);
        C19258 c19258BuildDialog = mainM7917.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        final DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        C4925.m14329(textInputLayout.getEditText());
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new View.OnClickListener(this) { // from class: l.ۨܽ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextInputLayout textInputLayout2 = textInputLayout;
                EditText editText = textInputLayout2.getEditText();
                C11003.requireNonNull(editText);
                String string = editText.getText().toString();
                if (string.isEmpty()) {
                    textInputLayout2.setError(C4925.m14327(R.string.MT_Protector));
                    editText.requestFocus();
                } else {
                    view.setEnabled(false);
                    new C13950(mainM7917, c2450, string, dialogInterfaceC0206M19253, c14698, checkBox, view, textInputLayout2, editText).m20274();
                }
            }
        });
    }
}
