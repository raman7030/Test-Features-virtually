package bin.mt.plugin.api.ui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public interface PluginEditText extends PluginView {
    public static final int SOFT_WRAP_COMPLETELY_FILLED = 2;
    public static final int SOFT_WRAP_DISABLE = 0;
    public static final int SOFT_WRAP_KEEP_WORD = 1;
    public static final String SYNTAX_REGEX = "INTERNAL:Regex";
    public static final String SYNTAX_REGEX_REPLACEMENT = "INTERNAL:RegexReplacement";

    void addTextChangedListener(PluginEditTextWatcher pluginEditTextWatcher);

    @Override // bin.mt.plugin.api.ui.PluginView
    Drawable getBackground();

    CharSequence getHint();

    int getInputType();

    int getMaxLines();

    int getMinLines();

    int getSelectionEnd();

    int getSelectionStart();

    Editable getText();

    int getTextColor();

    float getTextSize();

    Typeface getTypeface();

    boolean isBoxStyle();

    boolean isLineStyle();

    boolean isReadOnly();

    boolean isSingleLine();

    int length();

    boolean requestFocusAndShowIME();

    void selectAll();

    void selectEnd();

    @Override // bin.mt.plugin.api.ui.PluginView
    void setBackground(Drawable drawable);

    @Override // bin.mt.plugin.api.ui.PluginView
    void setBackgroundColor(int i);

    void setBracketHighlightEnable(boolean z);

    void setHint(CharSequence charSequence);

    void setHintTextColor(int i);

    void setHintTextColor(Integer num);

    void setInputMultiline();

    void setInputNumber();

    void setInputType(int i);

    void setLines(int i);

    void setMaxLength(int i);

    void setMaxLines(int i);

    void setMinLines(int i);

    @Override // bin.mt.plugin.api.ui.PluginView
    @Deprecated
    void setOnClickListener(PluginView.OnClickListener onClickListener);

    @Override // bin.mt.plugin.api.ui.PluginView
    @Deprecated
    void setOnLongClickListener(PluginView.OnLongClickListener onLongClickListener);

    void setReadOnly(boolean z);

    void setSelection(int i);

    void setSelection(int i, int i2);

    void setSingleLine(boolean z);

    void setSoftWrap(int i);

    void setSyntaxHighlight(String str);

    void setText(CharSequence charSequence);

    void setTextColor(int i);

    void setTextColor(Integer num);

    void setTextSize(float f);

    void setTypeface(Typeface typeface);

    void setTypeface(Typeface typeface, int i);
}
