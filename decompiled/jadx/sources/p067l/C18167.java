package p067l;

import android.content.Context;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes5.dex */
public final class C18167 extends C21438 {

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ int f54242;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18167(int i, Context context, List list) {
        super(context, list);
        this.f54242 = i;
    }

    @Override // p067l.C21438
    /* JADX INFO: renamed from: ֫ */
    public final void mo9744(TextView textView, boolean z) {
        if (z) {
            return;
        }
        textView.getLayoutParams().height = this.f54242;
    }
}
