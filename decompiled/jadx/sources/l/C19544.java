package l;

import android.util.Base64;
import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41XE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19544 implements InterfaceC2799 {
    @Override // l.InterfaceC2799
    /* JADX INFO: renamed from: ֫ */
    public final void mo8644(IOException iOException) {
    }

    @Override // l.InterfaceC2799
    /* JADX INFO: renamed from: ֫ */
    public final void mo8645(byte[] bArr) {
        HashMap mapM12702 = C4210.m12702(new String(bArr, Charset.defaultCharset()));
        if (mapM12702.containsKey("Data")) {
            int i = Integer.parseInt((String) mapM12702.get(e.g));
            byte[] bArrDecode = Base64.decode((String) mapM12702.get("Data"), 0);
            if (C5432.m15524(bArrDecode)) {
                ApplicationC20075.f65008.edit().mo25854(System.currentTimeMillis(), "JIAGU_TIME").mo25853(i, "JIAGU_VERSION").mo25855("JIAGU_DATA", bArrDecode).apply();
            }
        }
    }
}
