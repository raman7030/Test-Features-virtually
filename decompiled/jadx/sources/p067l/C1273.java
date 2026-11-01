package p067l;

import android.content.ClipData;
import android.view.ContentInfo;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۡۛ */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1273 implements InterfaceC1623 {

    /* JADX INFO: renamed from: ֫ */
    public final ContentInfo f29390;

    public C1273(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f29390 = contentInfo;
    }

    @Override // p067l.InterfaceC1623
    /* JADX INFO: renamed from: ֫ */
    public final ContentInfo mo9668() {
        return this.f29390;
    }

    @Override // p067l.InterfaceC1623
    /* JADX INFO: renamed from: ۧ */
    public final ClipData mo9669() {
        return this.f29390.getClip();
    }

    @Override // p067l.InterfaceC1623
    public final int getSource() {
        return this.f29390.getSource();
    }

    @Override // p067l.InterfaceC1623
    /* JADX INFO: renamed from: ᩻ */
    public final int mo9670() {
        return this.f29390.getFlags();
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.f29390 + C0249l.f1198d;
    }
}
