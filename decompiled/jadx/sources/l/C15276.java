package l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܶܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15276 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC12849 f46869;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f46870;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C15276(String str, AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849) {
        this.f46870 = str;
        this.f46869 = abstractDialogInterfaceOnClickListenerC12849;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        String str = this.f46870;
        int length2 = str.length();
        AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849 = this.f46869;
        if (length <= length2) {
            if (TextUtils.equals(editable, str)) {
                return;
            }
            abstractDialogInterfaceOnClickListenerC12849.m31250((CharSequence) str);
            abstractDialogInterfaceOnClickListenerC12849.m31242();
            return;
        }
        if (editable.toString().startsWith(str.concat("-"))) {
            return;
        }
        abstractDialogInterfaceOnClickListenerC12849.m31250((CharSequence) str.concat("-"));
        abstractDialogInterfaceOnClickListenerC12849.m31242();
    }
}
