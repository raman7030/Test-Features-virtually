package l;

import android.net.Uri;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4027 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f12776 = C16293.f50117.m36526("localStorageMap");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f12778;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Uri f12779;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f12781;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f12782;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f12783;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Map f12780 = C20195.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f12777 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m12122() {
        this.f12777 = true;
        f12776.m36526(this.f12783).mo27929();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m12123() {
        if (this.f12777) {
            return;
        }
        AbstractC15440 abstractC15440 = this.f12782;
        try {
            abstractC15440.mo35195();
            C10130 c10130 = new C10130();
            synchronized (this.f12780) {
                c10130.writeInt(this.f12780.size());
                for (Map.Entry entry : this.f12780.entrySet()) {
                    c10130.m25423((CharSequence) entry.getKey());
                    c10130.m25423((CharSequence) entry.getValue());
                }
            }
            try {
                abstractC15440.m36496(c10130);
            } catch (IOException unused) {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C4027(Uri uri, String str, String str2) {
        this.f12779 = uri;
        this.f12783 = str;
        this.f12781 = str2;
        String strConcat = uri.getPathSegments().get(1);
        if (!strConcat.endsWith("/") && !strConcat.endsWith(":")) {
            strConcat = strConcat.concat("/");
        }
        this.f12778 = strConcat;
        AbstractC15440 abstractC15440M36526 = f12776.m36526(str);
        this.f12782 = abstractC15440M36526;
        if (abstractC15440M36526.mo23120()) {
            try {
                C12951 c12951M36528 = abstractC15440M36526.m36528();
                int i = c12951M36528.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    this.f12780.put(c12951M36528.m31504(), c12951M36528.m31504());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m12121(String str, boolean z) {
        int iLastIndexOf;
        String str2;
        if (str.isEmpty()) {
            return this.f12779.getPathSegments().get(1);
        }
        String strM23341 = C9045.m23341(new StringBuilder(), this.f12778, str);
        Map map = this.f12780;
        String str3 = (String) map.get(strM23341);
        if (str3 != null) {
            return str3;
        }
        return (!z || (iLastIndexOf = strM23341.lastIndexOf(47)) == -1 || (str2 = (String) map.get(strM23341.substring(0, iLastIndexOf))) == null) ? strM23341 : C20087.m46305(iLastIndexOf, strM23341, C5368.m15339(str2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m12120() {
        return "/storage/" + this.f12783;
    }
}
