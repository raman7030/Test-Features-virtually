package p067l;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܿۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8HZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18828 implements InterfaceC24863 {

    /* JADX INFO: renamed from: ֫ */
    public final C12024 f56216;

    /* JADX INFO: renamed from: ۧ */
    public final String f56217;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f56218;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f56219;

    public C18828(String str, boolean z, C12024 c12024) {
        C23877.m52957((z && TextUtils.isEmpty(str)) ? false : true);
        this.f56216 = c12024;
        this.f56217 = str;
        this.f56218 = z;
        this.f56219 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m42888(C15317 c15317) {
        return C14647.m33513(this.f56216.mo8449(), c15317.m34870() + "&signedRequest=" + C5792.m12997(c15317.m34869()), null, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m42887(UUID uuid, C7942 c7942) throws C8770 {
        String str;
        String strM18352 = c7942.m18352();
        if (this.f56218 || TextUtils.isEmpty(strM18352)) {
            strM18352 = this.f56217;
        }
        String str2 = strM18352;
        if (TextUtils.isEmpty(str2)) {
            C6659 c6659 = new C6659();
            Uri uri = Uri.EMPTY;
            c6659.m15164(uri);
            throw new C8770(c6659.m15161(), uri, AbstractC11500.m26548of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C25059.f79954;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C25059.f79952.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f56219) {
            map.putAll(this.f56219);
        }
        return C14647.m33513(this.f56216.mo8449(), str2, c7942.m18351(), map);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42886(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.f56219) {
            this.f56219.put(str, str2);
        }
    }
}
