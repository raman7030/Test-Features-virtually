package p067l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: l.ܶ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16697 implements InterfaceC3287 {

    /* JADX INFO: renamed from: ֫ */
    public final int f49187;

    /* JADX INFO: renamed from: ۧ */
    public MediaCodecInfo[] f49188;

    @Override // p067l.InterfaceC3287
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5722() {
        return true;
    }

    public C16697(boolean z, boolean z2, boolean z3) {
        this.f49187 = (z || z2 || z3) ? 1 : 0;
    }

    @Override // p067l.InterfaceC3287
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5721(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // p067l.InterfaceC3287
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5720(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // p067l.InterfaceC3287
    /* JADX INFO: renamed from: ֫ */
    public final int mo5718() {
        if (this.f49188 == null) {
            this.f49188 = new MediaCodecList(this.f49187).getCodecInfos();
        }
        return this.f49188.length;
    }

    @Override // p067l.InterfaceC3287
    /* JADX INFO: renamed from: ֫ */
    public final MediaCodecInfo mo5719(int i) {
        if (this.f49188 == null) {
            this.f49188 = new MediaCodecList(this.f49187).getCodecInfos();
        }
        return this.f49188[i];
    }
}
