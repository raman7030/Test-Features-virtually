package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
import l.C14615;
import l.C20077;
import l.C20762;
import l.C21488;
import l.C4554;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C20077 createButton(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C4554 createCheckBox(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C20762 createRadioButton(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C14615 createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public C21488 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }
}
