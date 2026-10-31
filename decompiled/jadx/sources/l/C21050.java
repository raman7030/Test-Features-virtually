package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayoutHelper;

/* JADX INFO: renamed from: l.᩷ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes5.dex */
public final class C21050 extends AbstractC1661 {
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
        Main mainM7917 = c2450.m7917();
        View viewM10216 = mainM7917.m10216(R.layout.MT_Protector);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM10216.findViewById(R.id.MT_Protector);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewM10216.findViewById(R.id.MT_Protector);
        C10309.m26062(textInputLayout);
        C10309.m26062(textInputLayout2);
        final View.OnClickListener endIconDelegateOnClickListener = TextInputLayoutHelper.getEndIconDelegateOnClickListener(textInputLayout);
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ᩳᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                endIconDelegateOnClickListener.onClick(view);
                boolean zHasPasswordTransformation = TextInputLayoutHelper.hasPasswordTransformation(textInputLayout);
                TextInputLayout textInputLayout3 = textInputLayout2;
                if (zHasPasswordTransformation) {
                    textInputLayout3.setVisibility(0);
                } else {
                    textInputLayout3.setVisibility(8);
                }
            }
        });
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        final C14698 c14698 = new C14698();
        c14698.m34990();
        checkBox.setText(mainM7917.getResources().getQuantityString(R.plurals.MT_Protector, c2450.m7918()));
        checkBox.setChecked(c14698.f44893);
        if (c14698.f44894) {
            TextInputLayoutHelper.setPasswordTransformation(textInputLayout, false);
            textInputLayout2.setVisibility(8);
        }
        C19258 c19258BuildDialog = mainM7917.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        C4925.m14329(textInputLayout.getEditText());
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܿᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextInputLayout textInputLayout3 = textInputLayout;
                EditText editText = textInputLayout3.getEditText();
                C11003.requireNonNull(editText);
                TextInputLayout textInputLayout4 = textInputLayout2;
                EditText editText2 = textInputLayout4.getEditText();
                C11003.requireNonNull(editText2);
                String string = editText.getText().toString();
                if (string.isEmpty()) {
                    textInputLayout3.setError(C4925.m14327(R.string.MT_Protector));
                    editText.requestFocus();
                    return;
                }
                boolean z = textInputLayout4.getVisibility() == 8;
                if (!z && !string.equals(editText2.getText().toString())) {
                    textInputLayout4.setError(C4925.m14327(R.string.MT_Protector));
                    editText2.selectAll();
                    editText2.requestFocus();
                    return;
                }
                dialogInterfaceC0206M44438.dismiss();
                C14698 c14699 = c14698;
                boolean z2 = c14699.f44893;
                CheckBox checkBox2 = checkBox;
                if (z2 != checkBox2.isChecked() || c14699.f44894 != z) {
                    c14699.f44893 = checkBox2.isChecked();
                    c14699.f44894 = z;
                    c14699.m34991();
                }
                int i = C15104.f46193;
                C0994 c0994 = new C0994(C6938.class);
                C2450 c2451 = c2450;
                c0994.m3486(c2451);
                c0994.m3478(c2451.m7909());
                c0994.m3474("password", string);
                c0994.m3475("removeSource", checkBox2.isChecked());
                c0994.m3469();
            }
        });
    }
}
