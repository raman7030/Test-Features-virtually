package p067l;

import android.os.Build;

/* JADX INFO: renamed from: l.᩵۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8RW */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20723 implements InterfaceC22734 {
    @Override // p067l.InterfaceC22734
    /* JADX INFO: renamed from: ֫ */
    public final int mo13383(Object obj) {
        String str = ((C18710) obj).f55902;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
