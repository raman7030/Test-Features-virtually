package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.۬᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y184 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15130 implements CompoundButton.OnCheckedChangeListener, TextWatcher {

    /* JADX INFO: renamed from: ۗ */
    public C19566 f43188;

    /* JADX INFO: renamed from: ۙ */
    public TextInputLayout f43189;

    /* JADX INFO: renamed from: ۬ */
    public CheckBox f43190;

    /* JADX INFO: renamed from: ᩶ */
    public TextView f43191;

    /* JADX INFO: renamed from: ᩸ */
    public CheckBox f43192;

    /* JADX INFO: renamed from: ᩹ */
    public EditText f43193;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C15130(View view, int i, int i2, int i3, int i4, int i5) {
        this.f43191 = (TextView) view.findViewById(i);
        this.f43189 = (TextInputLayout) view.findViewById(i2);
        EditText editText = (EditText) view.findViewById(i3);
        this.f43193 = editText;
        CheckBox checkBox = (CheckBox) view.findViewById(i4);
        this.f43192 = checkBox;
        CheckBox checkBox2 = (CheckBox) view.findViewById(i5);
        this.f43190 = checkBox2;
        checkBox.setOnCheckedChangeListener(this);
        editText.addTextChangedListener(this);
        onCheckedChanged(checkBox, checkBox.isChecked());
        C5883.m13220(editText, checkBox2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34555(C19566 c19566) {
        this.f43188 = c19566;
        this.f43193.setText(c19566.f59560);
        this.f43192.setChecked(c19566.f59557);
        this.f43190.setChecked(c19566.f59559);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m34557() {
        this.f43188.f59560 = this.f43193.getText().toString();
        this.f43188.f59557 = this.f43192.isChecked();
        this.f43188.f59559 = this.f43190.isChecked();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34553() {
        if (this.f43192.isChecked() || !this.f43190.isChecked()) {
            return;
        }
        try {
            Pattern.compile(this.f43193.getText().toString());
        } catch (PatternSyntaxException e) {
            m34554(R.string.MT_Protector);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m34556() {
        return this.f43193.length() == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34554(int i) {
        TextInputLayout textInputLayout = this.f43189;
        textInputLayout.setErrorEnabled(true);
        textInputLayout.setError(C7050.m16224(i));
        this.f43193.requestFocus();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        TextInputLayout textInputLayout = this.f43189;
        textInputLayout.setEnabled(!z);
        this.f43193.setEnabled(!z);
        this.f43190.setEnabled(!z);
        textInputLayout.setAlpha(z ? 0.6f : 1.0f);
        this.f43191.setAlpha(z ? 0.6f : 1.0f);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f43189;
        if (textInputLayout.isErrorEnabled()) {
            textInputLayout.setErrorEnabled(false);
            textInputLayout.setError(null);
        }
    }
}
