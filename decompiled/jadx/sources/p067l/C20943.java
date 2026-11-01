package p067l;

import android.util.Base64;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41XE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20943 implements InterfaceC5029 {
    @Override // p067l.InterfaceC5029
    /* JADX INFO: renamed from: ֫ */
    public final void mo10704(IOException iOException) {
    }

    @Override // p067l.InterfaceC5029
    /* JADX INFO: renamed from: ֫ */
    public final void mo10705(byte[] bArr) {
        HashMap mapM14578 = C6370.m14578(new String(bArr, Charset.defaultCharset()));
        if (mapM14578.containsKey("Data")) {
            int i = Integer.parseInt((String) mapM14578.get(AbstractC0213e.f983g));
            byte[] bArrDecode = Base64.decode((String) mapM14578.get("Data"), 0);
            if (C7531.m17435(bArrDecode)) {
                ApplicationC21448.f67649.edit().mo27876(System.currentTimeMillis(), "JIAGU_TIME").mo27875(i, "JIAGU_VERSION").mo27877("JIAGU_DATA", bArrDecode).apply();
            }
        }
    }
}
