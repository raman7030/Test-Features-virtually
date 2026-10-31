package l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: l.ܶ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15077 implements InterfaceC0967 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f46069;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public MediaCodecInfo[] f46070;

    @Override // l.InterfaceC0967
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3419() {
        return true;
    }

    public C15077(boolean z, boolean z2, boolean z3) {
        this.f46069 = (z || z2 || z3) ? 1 : 0;
    }

    @Override // l.InterfaceC0967
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3418(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // l.InterfaceC0967
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3417(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // l.InterfaceC0967
    /* JADX INFO: renamed from: ֫ */
    public final int mo3415() {
        if (this.f46070 == null) {
            this.f46070 = new MediaCodecList(this.f46069).getCodecInfos();
        }
        return this.f46070.length;
    }

    @Override // l.InterfaceC0967
    /* JADX INFO: renamed from: ֫ */
    public final MediaCodecInfo mo3416(int i) {
        if (this.f46070 == null) {
            this.f46070 = new MediaCodecList(this.f46069).getCodecInfos();
        }
        return this.f46070[i];
    }
}
