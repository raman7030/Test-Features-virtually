package l;

import android.content.Context;
import android.view.View;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3504 implements Consumer {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f11123;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f11124;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f11125;

    public /* synthetic */ C3504(boolean[] zArr, View view, AbstractActivityC3346 abstractActivityC3346) {
        this.f11124 = zArr;
        this.f11125 = view;
        this.f11123 = abstractActivityC3346;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean z = C6326.m17597() && C12865.m31302() != null;
        boolean zBooleanValue = bool.booleanValue();
        boolean[] zArr = this.f11124;
        if (zBooleanValue || zArr[0] != z) {
            zArr[0] = z;
            this.f11125.setVisibility((z && C6326.m17598((Context) this.f11123, true)) ? 0 : 8);
        }
    }
}
