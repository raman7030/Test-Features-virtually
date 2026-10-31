package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.۬᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13427 implements CompoundButton.OnCheckedChangeListener, TextWatcher {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18095 f40119;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextInputLayout f40120;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CheckBox f40121;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f40122;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public CheckBox f40123;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EditText f40124;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C13427(View view, int i, int i2, int i3, int i4, int i5) {
        this.f40122 = (TextView) view.findViewById(i);
        this.f40120 = (TextInputLayout) view.findViewById(i2);
        EditText editText = (EditText) view.findViewById(i3);
        this.f40124 = editText;
        CheckBox checkBox = (CheckBox) view.findViewById(i4);
        this.f40123 = checkBox;
        CheckBox checkBox2 = (CheckBox) view.findViewById(i5);
        this.f40121 = checkBox2;
        checkBox.setOnCheckedChangeListener(this);
        editText.addTextChangedListener(this);
        onCheckedChanged(checkBox, checkBox.isChecked());
        C3698.m11273(editText, checkBox2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32453(C18095 c18095) {
        this.f40119 = c18095;
        this.f40124.setText(c18095.f56348);
        this.f40123.setChecked(c18095.f56345);
        this.f40121.setChecked(c18095.f56347);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32455() {
        this.f40119.f56348 = this.f40124.getText().toString();
        this.f40119.f56345 = this.f40123.isChecked();
        this.f40119.f56347 = this.f40121.isChecked();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32451() {
        if (this.f40123.isChecked() || !this.f40121.isChecked()) {
            return;
        }
        try {
            Pattern.compile(this.f40124.getText().toString());
        } catch (PatternSyntaxException e) {
            m32452(R.string.MT_Protector);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m32454() {
        return this.f40124.length() == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32452(int i) {
        TextInputLayout textInputLayout = this.f40120;
        textInputLayout.setErrorEnabled(true);
        textInputLayout.setError(C4925.m14327(i));
        this.f40124.requestFocus();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        TextInputLayout textInputLayout = this.f40120;
        textInputLayout.setEnabled(!z);
        this.f40124.setEnabled(!z);
        this.f40121.setEnabled(!z);
        textInputLayout.setAlpha(z ? 0.6f : 1.0f);
        this.f40122.setAlpha(z ? 0.6f : 1.0f);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f40120;
        if (textInputLayout.isErrorEnabled()) {
            textInputLayout.setErrorEnabled(false);
            textInputLayout.setError(null);
        }
    }
}
