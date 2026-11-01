package p067l;

import android.graphics.Typeface;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۤۡ */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1347 extends AbstractC1584 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C0937 f33540;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f33541;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ int f33542;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ WeakReference f33543;

    @Override // p067l.AbstractC1584
    /* JADX INFO: renamed from: onFontRetrievalFailed */
    public final void m37568(int i) {
    }

    public C1347(C0937 c0937, int i, int i2, WeakReference weakReference) {
        this.f33540 = c0937;
        this.f33541 = i;
        this.f33542 = i2;
        this.f33543 = weakReference;
    }

    @Override // p067l.AbstractC1584
    /* JADX INFO: renamed from: onFontRetrieved */
    public final void m37569(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f33541) != -1) {
            typeface = C1207.m21685(typeface, i, (this.f33542 & 2) != 0);
        }
        this.f33540.m8495(this.f33543, typeface);
    }
}
