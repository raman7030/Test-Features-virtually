package l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۧ۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D8R3 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC10846 {
    void flush();

    /* JADX INFO: renamed from: ֫ */
    int mo9416(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: ֫ */
    void mo9417();

    /* JADX INFO: renamed from: ֫ */
    void mo9418(int i);

    /* JADX INFO: renamed from: ֫ */
    void mo9419(int i, int i2, int i3, long j);

    /* JADX INFO: renamed from: ֫ */
    void mo9420(int i, long j);

    /* JADX INFO: renamed from: ֫ */
    void mo9421(int i, C5615 c5615, long j, int i2);

    /* JADX INFO: renamed from: ֫ */
    void mo9422(Bundle bundle);

    /* JADX INFO: renamed from: ֫ */
    void mo9423(Surface surface);

    /* JADX INFO: renamed from: ֫ */
    void mo9424(InterfaceC1673 interfaceC1673, Handler handler);

    /* JADX INFO: renamed from: ֫ */
    boolean mo9425(InterfaceC7501 interfaceC7501);

    /* JADX INFO: renamed from: ۧ */
    MediaFormat mo9426();

    /* JADX INFO: renamed from: ۧ */
    ByteBuffer mo9427(int i);

    /* JADX INFO: renamed from: ܽ */
    void mo9428();

    /* JADX INFO: renamed from: ܽ */
    void mo9429(int i);

    /* JADX INFO: renamed from: ᩳ */
    int mo9430();

    /* JADX INFO: renamed from: ᩳ */
    ByteBuffer mo9431(int i);
}
