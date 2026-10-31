package l;

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
public final class C5267 implements InterfaceC6005 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C5267 f16473;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f16475;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ScheduledExecutorService f16476;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C19379 f16477;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f16478;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SecureRandom f16479;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f16480;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1033 f16481;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f16474 = new byte[64];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f16472 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC15849());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C3856 m15184(String str) {
        String strEncodeToString;
        String str2;
        m15183(str);
        C19379 c19379 = this.f16477;
        if (c19379.f62726.size() >= 32) {
            throw new IllegalStateException("MCP credential limit reached");
        }
        do {
            byte[] bArr = new byte[12];
            this.f16479.nextBytes(bArr);
            strEncodeToString = Base64.encodeToString(bArr, 11);
        } while (c19379.f62725.containsKey(strEncodeToString));
        byte[] bArr2 = new byte[32];
        this.f16479.nextBytes(bArr2);
        String strEncodeToString2 = Base64.encodeToString(bArr2, 11);
        str2 = "mtmcp_" + strEncodeToString + "_" + strEncodeToString2;
        C18673 c18673 = new C18673(strEncodeToString, str, C14460.m34531(C14460.m34534().digest(Base64.decode(strEncodeToString2, 11))), str2, System.currentTimeMillis(), 0L, "");
        ArrayList arrayList = new ArrayList(c19379.f62726);
        arrayList.add(c18673);
        m15179(arrayList);
        return new C3856(str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m15187(String str, String str2) {
        m15183(str2);
        ArrayList arrayList = new ArrayList(this.f16477.f62726);
        C18673 c18673 = (C18673) this.f16477.f62725.get(str);
        if (c18673 == null) {
            throw new IllegalArgumentException("Unknown MCP credential");
        }
        arrayList.set(arrayList.indexOf(c18673), new C18673(str, str2, c18673.f59013, c18673.f59014, c18673.f59009, c18673.f59010, c18673.f59012));
        m15179(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m15188(boolean z) {
        C19379 c19379 = this.f16477;
        if (z && (!c19379.f62724 || c19379.f62726.isEmpty())) {
            throw new IllegalStateException("MCP authentication requires a credential");
        }
        this.f16480.edit().putBoolean("amae", z).apply();
        this.f16477 = new C19379(z, c19379.f62724, 1 + c19379.f62727, c19379.f62726);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C18673 m15189(String str) {
        C18673 c18673 = (C18673) this.f16477.f62725.get(str);
        if (c18673 == null) {
            return null;
        }
        C0327 c0327 = (C0327) this.f16478.get(str);
        if (c0327 != null) {
            c18673 = new C18673(str, c18673.f59008, c18673.f59013, c18673.f59014, c18673.f59009, c0327.f1718, c0327.f1719);
        }
        return c18673;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized String m15191(String str) {
        C18673 c18673;
        c18673 = (C18673) this.f16477.f62725.get(str);
        return (c18673 == null || c18673.f59014.isEmpty()) ? null : c18673.f59014;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m15192(String str) {
        ArrayList arrayList = new ArrayList(this.f16477.f62726);
        C18673 c18673 = (C18673) this.f16477.f62725.get(str);
        if (c18673 == null) {
            throw new IllegalArgumentException("Unknown MCP credential");
        }
        arrayList.remove(c18673);
        m15179(arrayList);
        this.f16478.remove(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized C5267 m15182() {
        if (f16473 == null) {
            f16473 = new C5267(C4925.f15527, new File(C4925.m14335().getNoBackupFilesDir(), "apk-mcp-credentials.json"));
        }
        return f16473;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m15186() {
        ScheduledExecutorService scheduledExecutorService;
        RunnableC2445 runnableC2445;
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C18673 c18673 : this.f16477.f62726) {
                C0327 c0327 = (C0327) this.f16478.remove(c18673.f59011);
                if (c0327 != null) {
                    c18673 = new C18673(c18673.f59011, c18673.f59008, c18673.f59013, c18673.f59014, c18673.f59009, c0327.f1718, c0327.f1719);
                }
                arrayList.add(c18673);
                z |= c0327 != null;
            }
            this.f16478.keySet().retainAll(this.f16477.f62725.keySet());
            if (z && this.f16477.f62724) {
                m15179(arrayList);
            }
            this.f16475.set(false);
            if (!this.f16478.isEmpty() && this.f16475.compareAndSet(false, true)) {
                scheduledExecutorService = this.f16476;
                runnableC2445 = new RunnableC2445(this);
                scheduledExecutorService.schedule(runnableC2445, 30L, TimeUnit.SECONDS);
            }
        } catch (IOException unused) {
            this.f16475.set(false);
            if (!this.f16478.isEmpty() && this.f16475.compareAndSet(false, true)) {
                scheduledExecutorService = this.f16476;
                runnableC2445 = new RunnableC2445(this);
            }
        } catch (Throwable th) {
            this.f16475.set(false);
            if (!this.f16478.isEmpty() && this.f16475.compareAndSet(false, true)) {
                this.f16476.schedule(new RunnableC2445(this), 30L, TimeUnit.SECONDS);
            }
            throw th;
        }
    }

    public C5267(InterfaceC12344 interfaceC12344, File file) {
        List listM3572;
        boolean z;
        ScheduledExecutorService scheduledExecutorService = f16472;
        this.f16479 = new SecureRandom();
        this.f16478 = new ConcurrentMapC10942();
        this.f16475 = new AtomicBoolean();
        this.f16480 = interfaceC12344;
        this.f16476 = scheduledExecutorService;
        C1033 c1033 = new C1033(file);
        this.f16481 = c1033;
        boolean z2 = interfaceC12344.getBoolean("amae", false);
        try {
            listM3572 = c1033.m3572();
            z = true;
        } catch (IOException unused) {
            listM3572 = Collections.EMPTY_LIST;
            z = false;
        }
        this.f16477 = new C19379(z2, z, 0L, listM3572);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19379 m15190() {
        return this.f16477;
    }

    @Override // l.InterfaceC6005
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12355 mo15185(C15996 c15996) {
        String str;
        C19379 c19379 = this.f16477;
        if (!c19379.f62728) {
            return C12355.m29974();
        }
        List listM37806 = c15996.m37806();
        C18673 c18673 = null;
        if (listM37806.size() == 1 && c19379.f62724 && (str = (String) listM37806.get(0)) != null && str.length() <= 512) {
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
                    if (!m15180(16, strSubstring) || !m15180(43, strSubstring2)) {
                        break;
                        break;
                    }
                    byte[] bArrDecode = Base64.decode(strSubstring2, 11);
                    if (bArrDecode.length != 32 || !Base64.encodeToString(bArrDecode, 11).equals(strSubstring2)) {
                        break;
                        break;
                    }
                    C18673 c18674 = (C18673) c19379.f62725.get(strSubstring);
                    if (!MessageDigest.isEqual(c18674 == null ? f16474 : c18674.f59013.getBytes(StandardCharsets.US_ASCII), C14460.m34531(C14460.m34534().digest(bArrDecode)).getBytes(StandardCharsets.US_ASCII))) {
                        break;
                    }
                    c18673 = c18674;
                    break;
                }
            }
        }
        if (c18673 == null) {
            C8236 c8236M13784 = AbstractC4708.m13784(EnumC1180.UNAUTHORIZED, "text/plain", "Unauthorized");
            c8236M13784.m21805("WWW-Authenticate", "Bearer realm=\"MT MCP\"");
            return C12355.m29975(c8236M13784);
        }
        String strM37805 = c15996.m37805();
        ConcurrentMapC10942 concurrentMapC10942 = this.f16478;
        String str2 = c18673.f59011;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (strM37805 == null || strM37805.length() > 128) {
            strM37805 = "";
        }
        concurrentMapC10942.put(str2, new C0327(jCurrentTimeMillis, strM37805));
        if (this.f16475.compareAndSet(false, true)) {
            this.f16476.schedule(new RunnableC2445(this), 30L, TimeUnit.SECONDS);
        }
        return C12355.m29974();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15179(ArrayList arrayList) throws IOException {
        C19379 c19379 = this.f16477;
        try {
            this.f16481.m3573(arrayList);
            this.f16477 = new C19379(c19379.f62728, true, c19379.f62727 + 1, arrayList);
        } catch (IOException unused) {
            this.f16477 = new C19379(c19379.f62728, false, c19379.f62727 + 1, Collections.EMPTY_LIST);
            throw new IOException("Cannot save MCP credentials");
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m15183(String str) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15181(String str, String str2, String str3) {
        if (str.length() != 66) {
            return false;
        }
        if (!str.startsWith("mtmcp_" + str2 + "_")) {
            return false;
        }
        String strSubstring = str.substring(23);
        if (!m15180(43, strSubstring)) {
            return false;
        }
        byte[] bArrDecode = Base64.decode(strSubstring, 11);
        return bArrDecode.length == 32 && Base64.encodeToString(bArrDecode, 11).equals(strSubstring) && C14460.m34531(C14460.m34534().digest(bArrDecode)).equals(str3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15180(int i, String str) {
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
