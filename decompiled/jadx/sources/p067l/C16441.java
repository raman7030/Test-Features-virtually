package p067l;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: renamed from: l.ܳ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08E1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16441 extends AbstractC15493 {

    /* JADX INFO: renamed from: ۟֫ */
    public final Context f48316;

    @Override // p067l.InterfaceC4114, p067l.InterfaceC19537
    public final String getName() {
        return "MidiRenderer";
    }

    @Override // p067l.AbstractC15493
    /* JADX INFO: renamed from: ֫ */
    public final C10307 mo19507(InterfaceC3681 interfaceC3681) {
        int i = C13090.f36797;
        return C5792.m13025(4, 2, 44100);
    }

    public C16441(Context context, Handler handler, InterfaceC7448 interfaceC7448, InterfaceC6777 interfaceC6777) {
        super(handler, interfaceC7448, interfaceC6777);
        this.f48316 = context.getApplicationContext();
    }

    @Override // p067l.AbstractC15493
    /* JADX INFO: renamed from: ܿ */
    public final int mo19509(C10307 c10307) {
        if (!"audio/x-exoplayer-midi".equals(c10307.f28528)) {
            return 0;
        }
        int i = C13090.f36797;
        return !m35259(C5792.m13025(4, 2, 44100)) ? 1 : 4;
    }

    @Override // p067l.AbstractC15493
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3681 mo19508(C10307 c10307) {
        return new C13090(this.f48316);
    }
}
