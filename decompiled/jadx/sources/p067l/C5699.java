package p067l;

import android.content.Context;
import android.view.View;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5699 implements Consumer {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractActivityC5549 f13928;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean[] f13929;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ View f13930;

    public /* synthetic */ C5699(boolean[] zArr, View view, AbstractActivityC5549 abstractActivityC5549) {
        this.f13929 = zArr;
        this.f13930 = view;
        this.f13928 = abstractActivityC5549;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean z = C8381.m19537() && C14595.m33388() != null;
        boolean zBooleanValue = bool.booleanValue();
        boolean[] zArr = this.f13929;
        if (zBooleanValue || zArr[0] != z) {
            zArr[0] = z;
            this.f13930.setVisibility((z && C8381.m19538((Context) this.f13928, true)) ? 0 : 8);
        }
    }
}
