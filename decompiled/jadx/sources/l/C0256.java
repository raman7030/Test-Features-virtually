package l;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plugin.api.ui.PluginEditTextWatcher;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0256 extends C7312 implements PluginEditText {
    @Override // l.C7312, bin.mt.plugin.api.ui.PluginView
    @Deprecated
    public final void setOnClickListener(PluginView.OnClickListener onClickListener) {
    }

    @Override // l.C7312, bin.mt.plugin.api.ui.PluginView
    @Deprecated
    public final void setOnLongClickListener(PluginView.OnLongClickListener onLongClickListener) {
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final Editable getText() {
        return ((C10235) this.f22448).m30436();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int length() {
        return ((C10235) this.f22448).m30526();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1524(CharSequence charSequence) {
        ((C10235) this.f22448).mo25910(charSequence);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final CharSequence getHint() {
        return ((C10235) this.f22448).m30509();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1525(String str) {
        ((C10235) this.f22448).m30477(str);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final float getTextSize() {
        return ((C10235) this.f22448).m30395();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getTextColor() {
        return ((C10235) this.f22448).m30504();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final Typeface getTypeface() {
        Object tag = ((C10235) this.f22448).getTag(R.id.MT_Protector);
        return tag instanceof Typeface ? (Typeface) tag : Typeface.DEFAULT;
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTypeface(Typeface typeface) {
        ((C10235) this.f22448).setTag(R.id.MT_Protector, typeface);
        if (typeface == null) {
            ((C10235) this.f22448).m30381(255);
        } else {
            ((C10235) this.f22448).m30381(2);
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTypeface(Typeface typeface, int i) {
        if (i > 0) {
            if (typeface == null) {
                typeface = Typeface.defaultFromStyle(i);
            } else {
                typeface = Typeface.create(typeface, i);
            }
        }
        setTypeface(typeface);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isSingleLine() {
        return ((C10235) this.f22448).mo25898();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getMinLines() {
        return ((C10235) this.f22448).m25909();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getMaxLines() {
        return ((C10235) this.f22448).m25923();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getInputType() {
        return ((C10235) this.f22448).mo25893();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getSelectionStart() {
        return ((C10235) this.f22448).m30444();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final int getSelectionEnd() {
        return ((C10235) this.f22448).m30448();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isReadOnly() {
        return ((C10235) this.f22448).m30441();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isBoxStyle() {
        return ((C10235) this.f22448).m25907();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean isLineStyle() {
        return ((C10235) this.f22448).m25917();
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void addTextChangedListener(PluginEditTextWatcher pluginEditTextWatcher) {
        if (C10975.m27285()) {
            C11003.requireNonNull(pluginEditTextWatcher);
            ((C10235) this.f22448).m30313(new C19308(this, pluginEditTextWatcher));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final boolean requestFocusAndShowIME() {
        if (C10975.m27285()) {
            if (!((C10235) this.f22448).isFocusable() || !((C10235) this.f22448).isEnabled() || ((C10235) this.f22448).m30441() || ((C10235) this.f22448).getVisibility() != 0) {
                return false;
            }
            if (((C10235) this.f22448).isAttachedToWindow() && ((C10235) this.f22448).isLaidOut()) {
                C4925.m14334(this.f22448);
                return true;
            }
            C4925.m14329(this.f22448);
            return true;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void selectAll() {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25900();
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void selectEnd() {
        if (C10975.m27285()) {
            View view = this.f22448;
            ((C10235) view).mo25919(((C10235) view).m30526());
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setBracketHighlightEnable(boolean z) {
        if (!C10975.m27285()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (z) {
            ((C10235) this.f22448).m25905();
        } else {
            ((C10235) this.f22448).m25927();
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setHint(CharSequence charSequence) {
        if (!C10975.m27285()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (charSequence == null) {
            ((C10235) this.f22448).m30477((String) null);
        } else {
            ((C10235) this.f22448).m30477(m19597(charSequence).toString());
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setHintTextColor(int i) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25915(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setHintTextColor(Integer num) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25895(num);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setInputMultiline() {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25926(131073);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setInputNumber() {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25926(2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setInputType(int i) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25926(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setLines(int i) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25921(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setMaxLength(int i) {
        if (!C10975.m27285()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (i > 0) {
            ((C10235) this.f22448).m25897(new InputFilter[]{new InputFilter.LengthFilter(i)});
        } else {
            ((C10235) this.f22448).m25897(new InputFilter[0]);
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setMaxLines(int i) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25903(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setMinLines(int i) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25901(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setReadOnly(boolean z) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m30407(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSelection(int i) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).mo25919(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSelection(int i, int i2) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).mo25922(i, i2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSingleLine(boolean z) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25894(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSoftWrap(int i) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m30512(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setSyntaxHighlight(String str) {
        if (!C10975.m27285()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        ((C10235) this.f22448).m30317(str, true);
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setText(CharSequence charSequence) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).mo25910(m19597(charSequence));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTextColor(int i) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25912(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTextColor(Integer num) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m25911(num);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.mt.plugin.api.ui.PluginEditText
    public final void setTextSize(float f) {
        if (C10975.m27285()) {
            ((C10235) this.f22448).m30475(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
