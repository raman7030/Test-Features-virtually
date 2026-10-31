package l;

import android.graphics.Typeface;
import android.os.Build;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S566 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10178 extends AbstractC14951 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1916 f30578;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30579;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30580;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ WeakReference f30581;

    @Override // l.AbstractC14951
    /* JADX INFO: renamed from: onFontRetrievalFailed */
    public final void m35416(int i) {
    }

    public C10178(C1916 c1916, int i, int i2, WeakReference weakReference) {
        this.f30578 = c1916;
        this.f30579 = i;
        this.f30580 = i2;
        this.f30581 = weakReference;
    }

    @Override // l.AbstractC14951
    /* JADX INFO: renamed from: onFontRetrieved */
    public final void m35417(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f30579) != -1) {
            typeface = C7355.m19712(typeface, i, (this.f30580 & 2) != 0);
        }
        this.f30578.m6322(this.f30581, typeface);
    }
}
