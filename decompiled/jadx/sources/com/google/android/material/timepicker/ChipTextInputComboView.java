package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import l.C15813;
import l.C16445;
import l.C17648;
import l.C20754;

/* JADX INFO: loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip chip;
    public final EditText editText;
    public TextView label;
    public final TextInputLayout textInputLayout;
    public TextWatcher watcher;

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(C15813.f48843, (ViewGroup) this, false);
        this.chip = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(C15813.f48840, (ViewGroup) this, false);
        this.textInputLayout = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.editText = editText;
        editText.setVisibility(4);
        TextFormatter textFormatter = new TextFormatter();
        this.watcher = textFormatter;
        editText.addTextChangedListener(textFormatter);
        updateHintLocales();
        addView(chip);
        addView(textInputLayout);
        this.label = (TextView) findViewById(C20754.f67172);
        int i2 = C17648.f53953;
        editText.setId(View.generateViewId());
        this.label.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    private void updateHintLocales() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.chip.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.chip.setChecked(z);
        this.editText.setVisibility(z ? 0 : 4);
        this.chip.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            ViewUtils.requestFocusAndShowKeyboard(this.editText, false);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.chip.toggle();
    }

    public void setText(CharSequence charSequence) {
        String text = formatText(charSequence);
        this.chip.setText(text);
        if (TextUtils.isEmpty(text)) {
            return;
        }
        this.editText.removeTextChangedListener(this.watcher);
        this.editText.setText(text);
        this.editText.addTextChangedListener(this.watcher);
    }

    public CharSequence getChipText() {
        return this.chip.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String formatText(CharSequence charSequence) {
        return TimeModel.formatText(getResources(), charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.chip.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.chip.setTag(i, obj);
    }

    public void setHelperText(CharSequence charSequence) {
        this.label.setText(charSequence);
    }

    public void setCursorVisible(boolean z) {
        this.editText.setCursorVisible(z);
    }

    public void addInputFilter(InputFilter inputFilter) {
        InputFilter[] filters = this.editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.editText.setFilters(inputFilterArr);
    }

    public TextInputLayout getTextInput() {
        return this.textInputLayout;
    }

    public void setChipDelegate(C16445 c16445) {
        C17648.m41309(this.chip, c16445);
    }

    public class TextFormatter extends TextWatcherAdapter {
        public static final String DEFAULT_TEXT = "00";

        public TextFormatter() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.chip.setText(ChipTextInputComboView.this.formatText(DEFAULT_TEXT));
                return;
            }
            String text = ChipTextInputComboView.this.formatText(editable);
            Chip chip = ChipTextInputComboView.this.chip;
            if (TextUtils.isEmpty(text)) {
                text = ChipTextInputComboView.this.formatText(DEFAULT_TEXT);
            }
            chip.setText(text);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateHintLocales();
    }
}
