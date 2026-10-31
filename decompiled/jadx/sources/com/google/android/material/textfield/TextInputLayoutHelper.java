package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayoutHelper {
    public static final Field endCompoundLayoutField;

    static {
        try {
            Field declaredField = TextInputLayout.class.getDeclaredField("endLayout");
            endCompoundLayoutField = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static EndCompoundLayout getEndCompoundLayout(TextInputLayout textInputLayout) {
        try {
            return (EndCompoundLayout) endCompoundLayoutField.get(textInputLayout);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static View.OnClickListener getEndIconDelegateOnClickListener(TextInputLayout textInputLayout) {
        return getEndCompoundLayout(textInputLayout).getEndIconDelegate().getOnIconClickListener();
    }

    public static boolean hasPasswordTransformation(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    public static void setPasswordTransformation(TextInputLayout textInputLayout, boolean z) {
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editText.setTransformationMethod(z ? PasswordTransformationMethod.getInstance() : null);
            getEndCompoundLayout(textInputLayout).getEndIconDelegate().refreshIconState();
        }
    }
}
