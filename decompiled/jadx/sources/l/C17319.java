package l;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܿۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M8HZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17319 implements InterfaceC23669 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10160 f53034;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f53035;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f53036;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f53037;

    public C17319(String str, boolean z, C10160 c10160) {
        C22632.m50631((z && TextUtils.isEmpty(str)) ? false : true);
        this.f53034 = c10160;
        this.f53035 = str;
        this.f53036 = z;
        this.f53037 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m40637(C13625 c13625) {
        return C12920.m31427(this.f53034.mo6247(), c13625.m32756() + "&signedRequest=" + C3603.m11021(c13625.m32755()), null, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m40636(UUID uuid, C5865 c5865) throws C6736 {
        String str;
        String strM16426 = c5865.m16426();
        if (this.f53036 || TextUtils.isEmpty(strM16426)) {
            strM16426 = this.f53035;
        }
        String str2 = strM16426;
        if (TextUtils.isEmpty(str2)) {
            C4515 c4515 = new C4515();
            Uri uri = Uri.EMPTY;
            c4515.m13281(uri);
            throw new C6736(c4515.m13278(), uri, AbstractC9608.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = C23875.f77202;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C23875.f77200.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f53037) {
            map.putAll(this.f53037);
        }
        return C12920.m31427(this.f53034.mo6247(), str2, c5865.m16425(), map);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40635(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.f53037) {
            this.f53037.put(str, str2);
        }
    }
}
