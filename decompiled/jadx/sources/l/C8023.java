package l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: renamed from: l.۠۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8023 implements InterfaceC0967 {
    @Override // l.InterfaceC0967
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3417(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // l.InterfaceC0967
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3419() {
        return false;
    }

    @Override // l.InterfaceC0967
    /* JADX INFO: renamed from: ֫ */
    public final int mo3415() {
        return MediaCodecList.getCodecCount();
    }

    @Override // l.InterfaceC0967
    /* JADX INFO: renamed from: ֫ */
    public final MediaCodecInfo mo3416(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // l.InterfaceC0967
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3418(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
