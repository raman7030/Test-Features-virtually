package l;

import android.text.Editable;
import android.text.TextWatcher;
import bin.mt.plugin.api.ui.PluginEditTextWatcher;

/* JADX INFO: renamed from: l.᩵ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7R7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19308 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0256 f60722;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ PluginEditTextWatcher f60723;

    public C19308(C0256 c0256, PluginEditTextWatcher pluginEditTextWatcher) {
        this.f60722 = c0256;
        this.f60723 = pluginEditTextWatcher;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f60723.beforeTextChanged(this.f60722, charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f60723.onTextChanged(this.f60722, charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f60723.afterTextChanged(this.f60722, editable);
    }
}
