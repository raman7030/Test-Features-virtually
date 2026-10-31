package l;

import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫ܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B1E0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1872 implements Consumer {
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        ActivityC17169 activityC17169 = (ActivityC17169) obj;
        activityC17169.setTitle(R.string.MT_Protector);
        activityC17169.m40340((CharSequence) null);
    }
}
