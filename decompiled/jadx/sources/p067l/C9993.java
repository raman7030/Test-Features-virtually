package p067l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: l.۠۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9993 implements InterfaceC3287 {
    @Override // p067l.InterfaceC3287
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5720(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // p067l.InterfaceC3287
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5722() {
        return false;
    }

    @Override // p067l.InterfaceC3287
    /* JADX INFO: renamed from: ֫ */
    public final int mo5718() {
        return MediaCodecList.getCodecCount();
    }

    @Override // p067l.InterfaceC3287
    /* JADX INFO: renamed from: ֫ */
    public final MediaCodecInfo mo5719(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // p067l.InterfaceC3287
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5721(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
