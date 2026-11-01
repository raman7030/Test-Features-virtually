package p067l;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15327 extends C21438 {

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ int f43731;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15327(Context context, ArrayList arrayList, int i) {
        super(context, arrayList);
        this.f43731 = i;
    }

    @Override // p067l.C21438
    /* JADX INFO: renamed from: ֫ */
    public final void mo9744(TextView textView, boolean z) {
        if (z) {
            return;
        }
        textView.getLayoutParams().height = this.f43731;
    }
}
