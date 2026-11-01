package p067l;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16308 extends C21438 {

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ int f47928;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16308(Context context, String[] strArr, int i) {
        super(context, strArr);
        this.f47928 = i;
    }

    @Override // p067l.C21438
    /* JADX INFO: renamed from: ֫ */
    public final void mo9744(TextView textView, boolean z) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = this.f47928;
        textView.setLayoutParams(layoutParams);
    }
}
