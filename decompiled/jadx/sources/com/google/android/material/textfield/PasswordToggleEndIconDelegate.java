package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import l.C3820;
import l.C6642;

/* JADX INFO: loaded from: classes.dex */
public class PasswordToggleEndIconDelegate extends EndIconDelegate {
    public EditText editText;
    public int iconResId;
    public final View.OnClickListener onIconClickListener;

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconCheckable() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (hasPasswordTransformation()) {
            this.editText.setTransformationMethod(null);
        } else {
            this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.editText.setSelection(selectionEnd);
        }
        refreshIconState();
    }

    public PasswordToggleEndIconDelegate(EndCompoundLayout endCompoundLayout, int i) {
        super(endCompoundLayout);
        this.iconResId = C6642.f20460;
        this.onIconClickListener = new View.OnClickListener() { // from class: com.google.android.material.textfield.PasswordToggleEndIconDelegate$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        };
        if (i != 0) {
            this.iconResId = i;
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        if (isInputTypePassword(this.editText)) {
            this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void tearDown() {
        EditText editText = this.editText;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public int getIconDrawableResId() {
        return this.iconResId;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public int getIconContentDescriptionResId() {
        return C3820.f12096;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconChecked() {
        return !hasPasswordTransformation();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(EditText editText) {
        this.editText = editText;
        refreshIconState();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void beforeEditTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        refreshIconState();
    }

    private boolean hasPasswordTransformation() {
        EditText editText = this.editText;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    public static boolean isInputTypePassword(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }
}
