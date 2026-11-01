package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import bin.p000mt.plugin.api.p002ui.PluginEditTextWatcher;

/* JADX INFO: renamed from: l.᩵ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7R7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20719 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2612 f63952;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ PluginEditTextWatcher f63953;

    public C20719(C2612 c2612, PluginEditTextWatcher pluginEditTextWatcher) {
        this.f63952 = c2612;
        this.f63953 = pluginEditTextWatcher;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f63953.beforeTextChanged(this.f63952, charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f63953.onTextChanged(this.f63952, charSequence, i, i2, i3);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f63953.afterTextChanged(this.f63952, editable);
    }
}
