package p067l;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import bin.p000mt.plugin.api.p002ui.PluginEditText;
import bin.p000mt.plugin.api.p002ui.PluginEditTextWatcher;
import bin.p000mt.plugin.api.p002ui.PluginView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֡ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7R7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2612 extends C9318 implements PluginEditText {
    @Override // p067l.C9318, bin.p000mt.plugin.api.p002ui.PluginView
    @Deprecated
    public final void setOnClickListener(PluginView.OnClickListener onClickListener) {
    }

    @Override // p067l.C9318, bin.p000mt.plugin.api.p002ui.PluginView
    @Deprecated
    public final void setOnLongClickListener(PluginView.OnLongClickListener onLongClickListener) {
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final Editable getText() {
        return ((C12096) this.f25339).m32500();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final int length() {
        return ((C12096) this.f25339).m32590();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m3922(CharSequence charSequence) {
        ((C12096) this.f25339).mo27932(charSequence);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final CharSequence getHint() {
        return ((C12096) this.f25339).m32573();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m3923(String str) {
        ((C12096) this.f25339).m32541(str);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final float getTextSize() {
        return ((C12096) this.f25339).m32459();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final int getTextColor() {
        return ((C12096) this.f25339).m32568();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final Typeface getTypeface() {
        Object tag = ((C12096) this.f25339).getTag(R.id.MT_Protector);
        return tag instanceof Typeface ? (Typeface) tag : Typeface.DEFAULT;
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setTypeface(Typeface typeface) {
        ((C12096) this.f25339).setTag(R.id.MT_Protector, typeface);
        if (typeface == null) {
            ((C12096) this.f25339).m32445(255);
        } else {
            ((C12096) this.f25339).m32445(2);
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
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

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final boolean isSingleLine() {
        return ((C12096) this.f25339).mo27920();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final int getMinLines() {
        return ((C12096) this.f25339).m27931();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final int getMaxLines() {
        return ((C12096) this.f25339).m27945();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final int getInputType() {
        return ((C12096) this.f25339).mo27915();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final int getSelectionStart() {
        return ((C12096) this.f25339).m32508();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final int getSelectionEnd() {
        return ((C12096) this.f25339).m32512();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final boolean isReadOnly() {
        return ((C12096) this.f25339).m32505();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final boolean isBoxStyle() {
        return ((C12096) this.f25339).m27929();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final boolean isLineStyle() {
        return ((C12096) this.f25339).m27939();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void addTextChangedListener(PluginEditTextWatcher pluginEditTextWatcher) {
        if (C12799.m29347()) {
            C12826.requireNonNull(pluginEditTextWatcher);
            ((C12096) this.f25339).m32377(new C20719(this, pluginEditTextWatcher));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final boolean requestFocusAndShowIME() {
        if (C12799.m29347()) {
            if (!((C12096) this.f25339).isFocusable() || !((C12096) this.f25339).isEnabled() || ((C12096) this.f25339).m32505() || ((C12096) this.f25339).getVisibility() != 0) {
                return false;
            }
            if (((C12096) this.f25339).isAttachedToWindow() && ((C12096) this.f25339).isLaidOut()) {
                C7050.m16231(this.f25339);
                return true;
            }
            C7050.m16226(this.f25339);
            return true;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void selectAll() {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27922();
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void selectEnd() {
        if (C12799.m29347()) {
            View view = this.f25339;
            ((C12096) view).mo27941(((C12096) view).m32590());
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setBracketHighlightEnable(boolean z) {
        if (!C12799.m29347()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (z) {
            ((C12096) this.f25339).m27927();
        } else {
            ((C12096) this.f25339).m27949();
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setHint(CharSequence charSequence) {
        if (!C12799.m29347()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (charSequence == null) {
            ((C12096) this.f25339).m32541((String) null);
        } else {
            ((C12096) this.f25339).m32541(m21565(charSequence).toString());
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setHintTextColor(int i) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27937(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setHintTextColor(Integer num) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27917(num);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setInputMultiline() {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27948(131073);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setInputNumber() {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27948(2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setInputType(int i) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27948(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setLines(int i) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27943(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setMaxLength(int i) {
        if (!C12799.m29347()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        if (i > 0) {
            ((C12096) this.f25339).m27919(new InputFilter[]{new InputFilter.LengthFilter(i)});
        } else {
            ((C12096) this.f25339).m27919(new InputFilter[0]);
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setMaxLines(int i) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27925(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setMinLines(int i) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27923(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setReadOnly(boolean z) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m32471(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setSelection(int i) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).mo27941(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setSelection(int i, int i2) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).mo27944(i, i2);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setSingleLine(boolean z) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27916(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setSoftWrap(int i) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m32576(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setSyntaxHighlight(String str) {
        if (!C12799.m29347()) {
            throw new IllegalStateException("This method must be called on the UI thread");
        }
        ((C12096) this.f25339).m32381(str, true);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setText(CharSequence charSequence) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).mo27932(m21565(charSequence));
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setTextColor(int i) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27934(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setTextColor(Integer num) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m27933(num);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginEditText
    public final void setTextSize(float f) {
        if (C12799.m29347()) {
            ((C12096) this.f25339).m32539(f);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
