package p067l;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13521 {

    /* JADX INFO: renamed from: ֫ */
    public LoudnessCodecController f38002;

    /* JADX INFO: renamed from: ۧ */
    public final HashSet f38003 = new HashSet();

    /* JADX INFO: renamed from: ܽ */
    public final C21545 f38004 = InterfaceC8156.f21526;

    /* JADX INFO: renamed from: ֫ */
    public final void m30684(int i) {
        LoudnessCodecController loudnessCodecController = this.f38002;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f38002 = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, C14200.m32670(), new C12180(this));
        this.f38002 = loudnessCodecControllerCreate;
        Iterator it = this.f38003.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30685(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f38002;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            C23877.m52960(this.f38003.add(mediaCodec));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30686(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f38003.remove(mediaCodec) || (loudnessCodecController = this.f38002) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30683() {
        this.f38003.clear();
        LoudnessCodecController loudnessCodecController = this.f38002;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }
}
