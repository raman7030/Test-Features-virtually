package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayoutHelper;

/* JADX INFO: renamed from: l.᩷ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y96B */
/* JADX INFO: loaded from: classes5.dex */
public final class C22375 extends AbstractC3947 {
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
        Main mainM9965 = c4697.m9965();
        View viewM12252 = mainM9965.m12252(R.layout.MT_Protector);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector);
        C12166.m28086(textInputLayout);
        C12166.m28086(textInputLayout2);
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
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        final C16338 c16338 = new C16338();
        c16338.m37137();
        checkBox.setText(mainM9965.getResources().getQuantityString(R.plurals.MT_Protector, c4697.m9966()));
        checkBox.setChecked(c16338.f48007);
        if (c16338.f48008) {
            TextInputLayoutHelper.setPasswordTransformation(textInputLayout, false);
            textInputLayout2.setVisibility(8);
        }
        C20671 c20671BuildDialog = mainM9965.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C7050.m16226(textInputLayout.getEditText());
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܿᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextInputLayout textInputLayout3 = textInputLayout;
                EditText editText = textInputLayout3.getEditText();
                C12826.requireNonNull(editText);
                TextInputLayout textInputLayout4 = textInputLayout2;
                EditText editText2 = textInputLayout4.getEditText();
                C12826.requireNonNull(editText2);
                String string = editText.getText().toString();
                if (string.isEmpty()) {
                    textInputLayout3.setError(C7050.m16224(R.string.MT_Protector));
                    editText.requestFocus();
                    return;
                }
                boolean z = textInputLayout4.getVisibility() == 8;
                if (!z && !string.equals(editText2.getText().toString())) {
                    textInputLayout4.setError(C7050.m16224(R.string.MT_Protector));
                    editText2.selectAll();
                    editText2.requestFocus();
                    return;
                }
                dialogInterfaceC2564M46732.dismiss();
                C16338 c16339 = c16338;
                boolean z2 = c16339.f48007;
                CheckBox checkBox2 = checkBox;
                if (z2 != checkBox2.isChecked() || c16339.f48008 != z) {
                    c16339.f48007 = checkBox2.isChecked();
                    c16339.f48008 = z;
                    c16339.m37138();
                }
                int i = C16723.f49313;
                C3313 c3313 = new C3313(C8963.class);
                C4697 c4698 = c4697;
                c3313.m5789(c4698);
                c3313.m5781(c4698.m9957());
                c3313.m5777("password", string);
                c3313.m5778("removeSource", checkBox2.isChecked());
                c3313.m5772();
            }
        });
    }
}
