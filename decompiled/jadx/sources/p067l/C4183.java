package p067l;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֫ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q151 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4183 implements InterfaceC18935, InterfaceC3299, InterfaceC20295, InterfaceC4595, InterfaceC1233 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f9212;

    public /* synthetic */ C4183(Object obj) {
        this.f9212 = obj;
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        ((C14977) this.f9212).mo13474(i);
    }

    @Override // p067l.InterfaceC3299
    /* JADX INFO: renamed from: ֫ */
    public void mo5747(int i, int i2, int i3, int i4) {
        C9471.m22022((C9471) this.f9212, i2, i3, i4);
    }

    @Override // p067l.InterfaceC1233
    /* JADX INFO: renamed from: ֫ */
    public void mo8467(C1898 c1898) {
        ((C15546) this.f9212).f44421.suppressLayout(false);
    }

    @Override // p067l.InterfaceC18935
    /* JADX INFO: renamed from: ֫ */
    public int mo8465(int i, int i2) {
        return (i < 28 || i > 31) ? i2 : ((InterfaceC18935) this.f9212).mo8465(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m8468(C1415 c1415, int i, Bundle bundle) {
        C1978 c1978 = (C1978) this.f9212;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                c1415.m30477();
                Parcelable parcelable = (Parcelable) c1415.m30476();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        C1553 c1553 = new C1553(new ClipData(c1415.m30474(), new ClipData.Item(c1415.m30473())), 2);
        c1553.m36332(c1415.m30475());
        c1553.m36333(bundle);
        return C1717.m43543(c1978, c1553.m36330()) == null;
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) {
        C20966.m47311((C18107) this.f9212, abstractC17043);
    }
}
