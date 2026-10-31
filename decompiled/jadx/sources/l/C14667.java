package l;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14667 extends C20065 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44818;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14667(Context context, String[] strArr, int i) {
        super(context, strArr);
        this.f44818 = i;
    }

    @Override // l.C20065
    /* JADX INFO: renamed from: ֫ */
    public final void mo7683(TextView textView, boolean z) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = this.f44818;
        textView.setLayoutParams(layoutParams);
    }
}
