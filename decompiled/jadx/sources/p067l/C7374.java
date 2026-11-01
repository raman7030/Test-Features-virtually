package p067l;

import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۚۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7374 implements InterfaceC8076 {

    /* JADX INFO: renamed from: ۢ */
    public static C7374 f19310;

    /* JADX INFO: renamed from: ֫ */
    public final AtomicBoolean f19312;

    /* JADX INFO: renamed from: ۧ */
    public final ScheduledExecutorService f19313;

    /* JADX INFO: renamed from: ܳ */
    public volatile C20786 f19314;

    /* JADX INFO: renamed from: ܽ */
    public final ConcurrentMapC12768 f19315;

    /* JADX INFO: renamed from: ܿ */
    public final SecureRandom f19316;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC14100 f19317;

    /* JADX INFO: renamed from: ᩻ */
    public final C3350 f19318;

    /* JADX INFO: renamed from: ᩷ */
    public static final byte[] f19311 = new byte[64];

    /* JADX INFO: renamed from: ۜ */
    public static final ScheduledExecutorService f19309 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC17431());

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C6033 m17087(String str) {
        String strEncodeToString;
        String str2;
        m17086(str);
        C20786 c20786 = this.f19314;
        if (c20786.f65337.size() >= 32) {
            throw new IllegalStateException("MCP credential limit reached");
        }
        do {
            byte[] bArr = new byte[12];
            this.f19316.nextBytes(bArr);
            strEncodeToString = Base64.encodeToString(bArr, 11);
        } while (c20786.f65336.containsKey(strEncodeToString));
        byte[] bArr2 = new byte[32];
        this.f19316.nextBytes(bArr2);
        String strEncodeToString2 = Base64.encodeToString(bArr2, 11);
        str2 = "mtmcp_" + strEncodeToString + "_" + strEncodeToString2;
        C20115 c20115 = new C20115(strEncodeToString, str, C16111.m36665(C16111.m36668().digest(Base64.decode(strEncodeToString2, 11))), str2, System.currentTimeMillis(), 0L, "");
        ArrayList arrayList = new ArrayList(c20786.f65337);
        arrayList.add(c20115);
        m17082(arrayList);
        return new C6033(str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m17090(String str, String str2) {
        m17086(str2);
        ArrayList arrayList = new ArrayList(this.f19314.f65337);
        C20115 c20115 = (C20115) this.f19314.f65336.get(str);
        if (c20115 == null) {
            throw new IllegalArgumentException("Unknown MCP credential");
        }
        arrayList.set(arrayList.indexOf(c20115), new C20115(str, str2, c20115.f62236, c20115.f62237, c20115.f62232, c20115.f62233, c20115.f62235));
        m17082(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m17091(boolean z) {
        C20786 c20786 = this.f19314;
        if (z && (!c20786.f65335 || c20786.f65337.isEmpty())) {
            throw new IllegalStateException("MCP authentication requires a credential");
        }
        this.f19317.edit().putBoolean("amae", z).apply();
        this.f19314 = new C20786(z, c20786.f65335, 1 + c20786.f65338, c20786.f65337);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C20115 m17092(String str) {
        C20115 c20115 = (C20115) this.f19314.f65336.get(str);
        if (c20115 == null) {
            return null;
        }
        C2679 c2679 = (C2679) this.f19315.get(str);
        if (c2679 != null) {
            c20115 = new C20115(str, c20115.f62231, c20115.f62236, c20115.f62237, c20115.f62232, c2679.f4494, c2679.f4495);
        }
        return c20115;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized String m17094(String str) {
        C20115 c20115;
        c20115 = (C20115) this.f19314.f65336.get(str);
        return (c20115 == null || c20115.f62237.isEmpty()) ? null : c20115.f62237;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized void m17095(String str) {
        ArrayList arrayList = new ArrayList(this.f19314.f65337);
        C20115 c20115 = (C20115) this.f19314.f65336.get(str);
        if (c20115 == null) {
            throw new IllegalArgumentException("Unknown MCP credential");
        }
        arrayList.remove(c20115);
        m17082(arrayList);
        this.f19315.remove(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static synchronized C7374 m17085() {
        if (f19310 == null) {
            f19310 = new C7374(C7050.f18359, new File(C7050.m16232().getNoBackupFilesDir(), "apk-mcp-credentials.json"));
        }
        return f19310;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m17089() {
        ScheduledExecutorService scheduledExecutorService;
        RunnableC4692 runnableC4692;
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C20115 c20115 : this.f19314.f65337) {
                C2679 c2679 = (C2679) this.f19315.remove(c20115.f62234);
                if (c2679 != null) {
                    c20115 = new C20115(c20115.f62234, c20115.f62231, c20115.f62236, c20115.f62237, c20115.f62232, c2679.f4494, c2679.f4495);
                }
                arrayList.add(c20115);
                z |= c2679 != null;
            }
            this.f19315.keySet().retainAll(this.f19314.f65336.keySet());
            if (z && this.f19314.f65335) {
                m17082(arrayList);
            }
            this.f19312.set(false);
            if (!this.f19315.isEmpty() && this.f19312.compareAndSet(false, true)) {
                scheduledExecutorService = this.f19313;
                runnableC4692 = new RunnableC4692(this);
                scheduledExecutorService.schedule(runnableC4692, 30L, TimeUnit.SECONDS);
            }
        } catch (IOException unused) {
            this.f19312.set(false);
            if (!this.f19315.isEmpty() && this.f19312.compareAndSet(false, true)) {
                scheduledExecutorService = this.f19313;
                runnableC4692 = new RunnableC4692(this);
            }
        } catch (Throwable th) {
            this.f19312.set(false);
            if (!this.f19315.isEmpty() && this.f19312.compareAndSet(false, true)) {
                this.f19313.schedule(new RunnableC4692(this), 30L, TimeUnit.SECONDS);
            }
            throw th;
        }
    }

    public C7374(InterfaceC14100 interfaceC14100, File file) {
        List listM5859;
        boolean z;
        ScheduledExecutorService scheduledExecutorService = f19309;
        this.f19316 = new SecureRandom();
        this.f19315 = new ConcurrentMapC12768();
        this.f19312 = new AtomicBoolean();
        this.f19317 = interfaceC14100;
        this.f19313 = scheduledExecutorService;
        C3350 c3350 = new C3350(file);
        this.f19318 = c3350;
        boolean z2 = interfaceC14100.getBoolean("amae", false);
        try {
            listM5859 = c3350.m5859();
            z = true;
        } catch (IOException unused) {
            listM5859 = Collections.EMPTY_LIST;
            z = false;
        }
        this.f19314 = new C20786(z2, z, 0L, listM5859);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C20786 m17093() {
        return this.f19314;
    }

    @Override // p067l.InterfaceC8076
    /* JADX INFO: renamed from: ֫ */
    public final C14111 mo17088(C17571 c17571) {
        String str;
        C20786 c20786 = this.f19314;
        if (!c20786.f65339) {
            return C14111.m32035();
        }
        List listM39992 = c17571.m39992();
        C20115 c20115 = null;
        if (listM39992.size() == 1 && c20786.f65335 && (str = (String) listM39992.get(0)) != null && str.length() <= 512) {
            int i = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt < ' ' || cCharAt > '~') {
                        break;
                    }
                    i++;
                } else {
                    String strTrim = str.trim();
                    int iIndexOf = strTrim.indexOf(32);
                    if (iIndexOf != 6 || !strTrim.regionMatches(true, 0, "Bearer", 0, 6)) {
                        break;
                        break;
                    }
                    String strTrim2 = strTrim.substring(iIndexOf + 1).trim();
                    if (strTrim2.length() != 66 || !strTrim2.startsWith("mtmcp_") || strTrim2.charAt(22) != '_') {
                        break;
                        break;
                        break;
                    }
                    String strSubstring = strTrim2.substring(6, 22);
                    String strSubstring2 = strTrim2.substring(23);
                    if (!m17083(16, strSubstring) || !m17083(43, strSubstring2)) {
                        break;
                        break;
                    }
                    byte[] bArrDecode = Base64.decode(strSubstring2, 11);
                    if (bArrDecode.length != 32 || !Base64.encodeToString(bArrDecode, 11).equals(strSubstring2)) {
                        break;
                        break;
                    }
                    C20115 c20116 = (C20115) c20786.f65336.get(strSubstring);
                    if (!MessageDigest.isEqual(c20116 == null ? f19311 : c20116.f62236.getBytes(StandardCharsets.US_ASCII), C16111.m36665(C16111.m36668().digest(bArrDecode)).getBytes(StandardCharsets.US_ASCII))) {
                        break;
                    }
                    c20115 = c20116;
                    break;
                }
            }
        }
        if (c20115 == null) {
            C10196 c10196M15660 = AbstractC6843.m15660(EnumC3490.UNAUTHORIZED, "text/plain", "Unauthorized");
            c10196M15660.m23774("WWW-Authenticate", "Bearer realm=\"MT MCP\"");
            return C14111.m32036(c10196M15660);
        }
        String strM39991 = c17571.m39991();
        ConcurrentMapC12768 concurrentMapC12768 = this.f19315;
        String str2 = c20115.f62234;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (strM39991 == null || strM39991.length() > 128) {
            strM39991 = "";
        }
        concurrentMapC12768.put(str2, new C2679(jCurrentTimeMillis, strM39991));
        if (this.f19312.compareAndSet(false, true)) {
            this.f19313.schedule(new RunnableC4692(this), 30L, TimeUnit.SECONDS);
        }
        return C14111.m32035();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17082(ArrayList arrayList) throws IOException {
        C20786 c20786 = this.f19314;
        try {
            this.f19318.m5860(arrayList);
            this.f19314 = new C20786(c20786.f65339, true, c20786.f65338 + 1, arrayList);
        } catch (IOException unused) {
            this.f19314 = new C20786(c20786.f65339, false, c20786.f65338 + 1, Collections.EMPTY_LIST);
            throw new IOException("Cannot save MCP credentials");
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m17086(String str) {
        if (str != null && !str.trim().isEmpty()) {
            int i = 0;
            if (str.codePointCount(0, str.length()) <= 64) {
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (Character.isHighSurrogate(cCharAt)) {
                        i++;
                        if (i >= str.length() || !Character.isLowSurrogate(str.charAt(i))) {
                            throw new IllegalArgumentException("Invalid MCP client name");
                        }
                    } else if (Character.isLowSurrogate(cCharAt) || Character.isISOControl(cCharAt)) {
                        throw new IllegalArgumentException("Invalid MCP client name");
                    }
                    i++;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid MCP client name");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17084(String str, String str2, String str3) {
        if (str.length() != 66) {
            return false;
        }
        if (!str.startsWith("mtmcp_" + str2 + "_")) {
            return false;
        }
        String strSubstring = str.substring(23);
        if (!m17083(43, strSubstring)) {
            return false;
        }
        byte[] bArrDecode = Base64.decode(strSubstring, 11);
        return bArrDecode.length == 32 && Base64.encodeToString(bArrDecode, 11).equals(strSubstring) && C16111.m36665(C16111.m36668().digest(bArrDecode)).equals(str3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17083(int i, String str) {
        if (str.length() == i) {
            for (int i2 = 0; i2 < i; i2++) {
                char cCharAt = str.charAt(i2);
                if ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-' || cCharAt == '_'))) {
                }
            }
            return true;
        }
        return false;
    }
}
