package p067l;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܺۖ */
/* JADX INFO: compiled from: W8UY */
/* JADX INFO: loaded from: classes5.dex */
public class C1618 extends C1303 {

    /* JADX INFO: renamed from: ֡֫ */
    public int f51273;

    public C1618(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1618(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m38997(int i) {
        this.f51273 = i;
    }

    @Override // p067l.C1303
    /* JADX INFO: renamed from: ֫ */
    public final C1462 mo3513(Context context, boolean z) {
        return new C1268(context, this.f51273, z);
    }
}
