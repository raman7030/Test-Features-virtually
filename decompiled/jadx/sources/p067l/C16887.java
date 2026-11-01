package p067l;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܶܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16887 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public AbstractDialogInterfaceOnClickListenerC14580 f49996;

    /* JADX INFO: renamed from: ᩹ */
    public String f49997;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C16887(String str, AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580) {
        this.f49997 = str;
        this.f49996 = abstractDialogInterfaceOnClickListenerC14580;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        String str = this.f49997;
        int length2 = str.length();
        AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580 = this.f49996;
        if (length <= length2) {
            if (TextUtils.equals(editable, str)) {
                return;
            }
            abstractDialogInterfaceOnClickListenerC14580.m33336((CharSequence) str);
            abstractDialogInterfaceOnClickListenerC14580.m33328();
            return;
        }
        if (editable.toString().startsWith(str.concat("-"))) {
            return;
        }
        abstractDialogInterfaceOnClickListenerC14580.m33336((CharSequence) str.concat("-"));
        abstractDialogInterfaceOnClickListenerC14580.m33328();
    }
}
