package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.ܿ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18528 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ TextView f55339;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C13045.m29867(charSequence, C0655am.f2274aB);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C13045.m29867(charSequence, C0655am.f2274aB);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C13045.m29867(editable, C0655am.f2274aB);
        TextView textView = this.f55339;
        if (textView.getVisibility() == 0) {
            textView.setVisibility(8);
        }
    }

    public C18528(TextView textView) {
        this.f55339 = textView;
    }
}
