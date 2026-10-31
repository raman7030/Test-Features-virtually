package l;

import bin.mt.json.JSONObject;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.commonsdk.UMConfigure;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܰ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I75V */
/* JADX INFO: loaded from: classes3.dex */
public final class C13682 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f40835 = {ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 69, 76, 70};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m32921(C14852 c14852, C15799 c15799, String str, String str2, InterfaceC22855 interfaceC22855) throws C3059 {
        C7333 c7333M32923;
        if (!str.isEmpty()) {
            C3284 c3284M37434 = c15799.m37434(c14852, str, str2);
            if (c3284M37434 != null) {
                AbstractC15440 abstractC15440 = c3284M37434.f10327;
                if (!abstractC15440.mo23119() || !m32928(abstractC15440)) {
                    throw C3059.m9368("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                }
                c7333M32923 = new C7333(abstractC15440, abstractC15440.mo23127(), 0L, false, false);
            } else {
                C4695 c4695M37431 = c15799.m37431(c14852, str, str2);
                if (c4695M37431 != null) {
                    byte[] bArr = c4695M37431.f14917;
                    if (!m32927(bArr)) {
                        throw C3059.m9368("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                    }
                    AbstractC15440 abstractC15440M36526 = C16293.f50110.m36526("apk_mcp_native");
                    try {
                        m32925(abstractC15440M36526);
                        abstractC15440M36526.m36508();
                        AbstractC15440 abstractC15440M36527 = abstractC15440M36526.m36526("apk-native-" + UUID.randomUUID() + ".bin");
                        abstractC15440M36527.m36502(bArr);
                        c7333M32923 = new C7333(abstractC15440M36527, bArr.length, 0L, true, false);
                    } catch (IOException | RuntimeException unused) {
                        throw C3059.m9368("NATIVE_CACHE_UNAVAILABLE", "Failed to prepare native entry cache.");
                    }
                } else {
                    if ("resources.arsc".equals(str2)) {
                        throw C3059.m9368("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                    }
                    c7333M32923 = m32923(c14852, str2, false);
                }
            }
        } else {
            c7333M32923 = m32923(c14852, str2, false);
        }
        try {
            try {
                Object objMo14558 = interfaceC22855.mo14558(c7333M32923);
                c7333M32923.close();
                return objMo14558;
            } catch (Throwable th) {
                try {
                    c7333M32923.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3059 e) {
            if (!c7333M32923.f22531 && c7333M32923.f22529) {
                String str3 = e.f9610;
                if ("NATIVE_ANALYZER_FAILED".equals(str3) || "NATIVE_ENTRY_NOT_ELF".equals(str3) || "ENTRY_READ_FAILED".equals(str3) || "PATCH_EXPECTED_MISMATCH".equals(str3)) {
                    c7333M32923.close();
                    C7333 c7333M32924 = m32923(c14852, str2, true);
                    try {
                        Object objMo14559 = interfaceC22855.mo14558(c7333M32924);
                        c7333M32924.close();
                        return objMo14559;
                    } catch (Throwable th3) {
                        try {
                            c7333M32924.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7333 m32923(C14852 c14852, String str, boolean z) throws C3059 {
        int i;
        try {
            try {
                C18090 c18090 = new C18090(c14852.m35253());
                try {
                    C3545 c3545M32922 = m32922(c18090, str);
                    long size = c3545M32922.getSize();
                    long jM10791 = c3545M32922.m10791();
                    C8420 c8420 = c14852.f45294;
                    AbstractC15440 abstractC15440 = c14852.f45298;
                    c8420.getClass();
                    AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("cache").m36526(UMConfigure.WRAPER_TYPE_NATIVE);
                    String strM34531 = C14460.m34531(C14460.m34534().digest(str.getBytes(StandardCharsets.UTF_8)));
                    AbstractC15440 abstractC15440M36527 = abstractC15440M36526.m36526(strM34531.concat(".bin"));
                    AbstractC15440 abstractC15440M36528 = abstractC15440M36526.m36526(strM34531.concat(".json"));
                    if (z) {
                        i = 2;
                    } else {
                        i = 2;
                        if (m32926(abstractC15440M36528, abstractC15440M36527, str, size, jM10791)) {
                            if (m32928(abstractC15440M36527)) {
                                C7333 c7333 = new C7333(abstractC15440M36527, size, jM10791, false, true);
                                c18090.close();
                                return c7333;
                            }
                            AbstractC15440[] abstractC15440Arr = {abstractC15440M36528, abstractC15440M36527};
                            for (int i2 = 0; i2 < 2; i2++) {
                                abstractC15440Arr[i2].mo23552();
                            }
                        }
                    }
                    AbstractC15440[] abstractC15440Arr2 = new AbstractC15440[i];
                    abstractC15440Arr2[0] = abstractC15440M36528;
                    abstractC15440Arr2[1] = abstractC15440M36527;
                    for (int i3 = 0; i3 < i; i3++) {
                        abstractC15440Arr2[i3].mo23552();
                    }
                    C7333 c7333M32924 = m32924(c18090, c3545M32922, str, size, jM10791, abstractC15440M36526, abstractC15440M36527, abstractC15440M36528);
                    c18090.close();
                    return c7333M32924;
                } catch (Throwable th) {
                    try {
                        c18090.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (C3059 e) {
                throw e;
            }
        } catch (IOException | RuntimeException unused) {
            throw C3059.m9368("ENTRY_READ_FAILED", "Failed to read ZIP entry.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32926(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, String str, long j, long j2) {
        if (!abstractC15440.mo23119() || !abstractC15441.mo23119() || abstractC15441.mo23127() != j) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(abstractC15440.m36506(), StandardCharsets.UTF_8));
            return jSONObject.getInt("version", -1) == 1 && str.equals(jSONObject.getString("entryName", null)) && jSONObject.getLong("size", -1L) == j && jSONObject.getLong("unsignedCrc", -1L) == j2;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3545 m32922(C18090 c18090, String str) throws C3059 {
        C3545 entry = c18090.getEntry(str);
        if (entry == null) {
            throw C3059.m9363("ENTRY_NOT_FOUND", "ZIP entry not found");
        }
        if (entry.isDirectory()) {
            throw C3059.m9368("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
        }
        if (entry.getSize() >= 0) {
            return entry;
        }
        throw C3059.m9368("ENTRY_READ_FAILED", "ZIP entry size is unavailable.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32927(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            byte b = bArr[0];
            byte[] bArr2 = f40835;
            if (b == bArr2[0] && bArr[1] == bArr2[1] && bArr[2] == bArr2[2] && bArr[3] == bArr2[3]) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7333 m32924(C18090 c18090, C3545 c3545, String str, long j, long j2, AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, AbstractC15440 abstractC15442) throws Throwable {
        boolean z;
        InputStream inputStreamM42189 = c18090.m42189(c3545);
        try {
            byte[] bArr = new byte[4];
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i < 4) {
                    int i2 = inputStreamM42189.read(bArr, i, 4 - i);
                    if (i2 < 0) {
                        inputStreamM42189.close();
                        z = false;
                        break;
                    }
                    i += i2;
                } else {
                    boolean zM32927 = m32927(bArr);
                    inputStreamM42189.close();
                    z = zM32927;
                    break;
                }
            }
            if (!z) {
                throw C3059.m9368("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
            }
            abstractC15440.m36508();
            AbstractC15440 abstractC15440M36526 = abstractC15440.m36526(abstractC15441.getName() + ".tmp");
            AbstractC15440 abstractC15440M36527 = abstractC15440.m36526(abstractC15442.getName() + ".tmp");
            abstractC15440M36526.mo23552();
            abstractC15440M36527.mo23552();
            try {
                InputStream inputStreamM421810 = c18090.m42189(c3545);
                try {
                    abstractC15440M36526.m36494(inputStreamM421810, j, (InterfaceC5627) null);
                    inputStreamM421810.close();
                    if (abstractC15440M36526.mo23127() != j) {
                        throw new IOException("Unexpected native entry size");
                    }
                    abstractC15440M36527.m36502(new JSONObject().add("version", 1).add("entryName", str).add("size", j).add("unsignedCrc", j2).toString().getBytes(StandardCharsets.UTF_8));
                    abstractC15441.mo23552();
                    if (!abstractC15440M36526.mo23551(abstractC15441)) {
                        throw new IOException("Failed to publish native cache data");
                    }
                    abstractC15442.mo23552();
                    if (!abstractC15440M36527.mo23551(abstractC15442)) {
                        abstractC15441.mo23552();
                        throw new IOException("Failed to publish native cache metadata");
                    }
                    try {
                        return new C7333(abstractC15441, j, j2, false, false);
                    } catch (Throwable th) {
                        th = th;
                        z2 = true;
                        if (!z2) {
                            abstractC15440M36526.mo23552();
                            abstractC15440M36527.mo23552();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        inputStreamM421810.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            try {
                inputStreamM42189.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m32928(AbstractC15440 abstractC15440) {
        try {
            InputStream inputStreamMo27926 = abstractC15440.mo27926();
            try {
                byte[] bArr = f40835;
                for (int i = 0; i < 4; i++) {
                    if (inputStreamMo27926.read() != (bArr[i] & 255)) {
                        inputStreamMo27926.close();
                        return false;
                    }
                }
                if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                }
                return true;
            } catch (Throwable th) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32925(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo23113()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
            for (AbstractC15440 abstractC15441 : abstractC15440.mo23549(true)) {
                if (abstractC15441.getName().startsWith("apk-native-") && abstractC15441.mo23117() < jCurrentTimeMillis) {
                    abstractC15441.mo23552();
                }
            }
        }
    }
}
