package l;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11735 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LoudnessCodecController f35002;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f35003 = new HashSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20177 f35004 = InterfaceC6090.f18670;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28636(int i) {
        LoudnessCodecController loudnessCodecController = this.f35002;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f35002 = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, C12449.m30605(), new C10324(this));
        this.f35002 = loudnessCodecControllerCreate;
        Iterator it = this.f35003.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28637(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f35002;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            C22632.m50634(this.f35003.add(mediaCodec));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28638(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f35003.remove(mediaCodec) || (loudnessCodecController = this.f35002) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28635() {
        this.f35003.clear();
        LoudnessCodecController loudnessCodecController = this.f35002;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
