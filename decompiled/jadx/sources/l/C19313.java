package l;

import android.os.Build;

/* JADX INFO: renamed from: l.᩵۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19313 implements InterfaceC21429 {
    @Override // l.InterfaceC21429
    /* JADX INFO: renamed from: ֫ */
    public final int mo11447(Object obj) {
        String str = ((C17195) obj).f52721;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
