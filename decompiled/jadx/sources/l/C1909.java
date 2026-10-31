package l;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֫ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q151 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1909 implements InterfaceC17431, InterfaceC0979, InterfaceC18862, InterfaceC2343, InterfaceC7875 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6432;

    public /* synthetic */ C1909(Object obj) {
        this.f6432 = obj;
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo6264(int i) {
        ((C13266) this.f6432).mo11538(i);
    }

    @Override // l.InterfaceC0979
    /* JADX INFO: renamed from: ֫ */
    public void mo3444(int i, int i2, int i3, int i4) {
        C7473.m20047((C7473) this.f6432, i2, i3, i4);
    }

    @Override // l.InterfaceC7875
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo6265(C21282 c21282) {
        ((C13865) this.f6432).f41340.suppressLayout(false);
    }

    @Override // l.InterfaceC17431
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo6263(int i, int i2) {
        return (i < 28 || i > 31) ? i2 : ((InterfaceC17431) this.f6432).mo6263(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m6266(C11548 c11548, int i, Bundle bundle) {
        C22898 c22898 = (C22898) this.f6432;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                c11548.m28431();
                Parcelable parcelable = (Parcelable) c11548.m28430();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        C14328 c14328 = new C14328(new ClipData(c11548.m28428(), new ClipData.Item(c11548.m28427())), 2);
        c14328.m34199(c11548.m28429());
        c14328.m34200(bundle);
        return C17648.m41297(c22898, c14328.m34197()) == null;
    }

    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo6267(AbstractC15440 abstractC15440) {
        C19568.m45016((C16560) this.f6432, abstractC15440);
    }
}
