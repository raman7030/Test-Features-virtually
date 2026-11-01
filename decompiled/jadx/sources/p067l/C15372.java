package p067l;

import bin.p000mt.json.JSONObject;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.commonsdk.UMConfigure;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܰ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I75V */
/* JADX INFO: loaded from: classes3.dex */
public final class C15372 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f43917 = {ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 69, 76, 70};

    /* JADX INFO: renamed from: ֫ */
    public static Object m35036(C16484 c16484, C17384 c17384, String str, String str2, InterfaceC24090 interfaceC24090) throws C5276 {
        C9338 c9338M35038;
        if (!str.isEmpty()) {
            C5490 c5490M39605 = c17384.m39605(c16484, str, str2);
            if (c5490M39605 != null) {
                AbstractC17043 abstractC17043 = c5490M39605.f13135;
                if (!abstractC17043.mo25093() || !m35043(abstractC17043)) {
                    throw C5276.m11410("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                }
                c9338M35038 = new C9338(abstractC17043, abstractC17043.mo25101(), 0L, false, false);
            } else {
                C6831 c6831M39602 = c17384.m39602(c16484, str, str2);
                if (c6831M39602 != null) {
                    byte[] bArr = c6831M39602.f17747;
                    if (!m35042(bArr)) {
                        throw C5276.m11410("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                    }
                    AbstractC17043 abstractC17043M38684 = C17853.f53277.m38684("apk_mcp_native");
                    try {
                        m35040(abstractC17043M38684);
                        abstractC17043M38684.m38666();
                        AbstractC17043 abstractC17043M38685 = abstractC17043M38684.m38684("apk-native-" + UUID.randomUUID() + ".bin");
                        abstractC17043M38685.m38660(bArr);
                        c9338M35038 = new C9338(abstractC17043M38685, bArr.length, 0L, true, false);
                    } catch (IOException | RuntimeException unused) {
                        throw C5276.m11410("NATIVE_CACHE_UNAVAILABLE", "Failed to prepare native entry cache.");
                    }
                } else {
                    if ("resources.arsc".equals(str2)) {
                        throw C5276.m11410("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
                    }
                    c9338M35038 = m35038(c16484, str2, false);
                }
            }
        } else {
            c9338M35038 = m35038(c16484, str2, false);
        }
        try {
            try {
                Object objMo16462 = interfaceC24090.mo16462(c9338M35038);
                c9338M35038.close();
                return objMo16462;
            } catch (Throwable th) {
                try {
                    c9338M35038.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C5276 e) {
            if (!c9338M35038.f25444 && c9338M35038.f25442) {
                String str3 = e.f12413;
                if ("NATIVE_ANALYZER_FAILED".equals(str3) || "NATIVE_ENTRY_NOT_ELF".equals(str3) || "ENTRY_READ_FAILED".equals(str3) || "PATCH_EXPECTED_MISMATCH".equals(str3)) {
                    c9338M35038.close();
                    C9338 c9338M35039 = m35038(c16484, str2, true);
                    try {
                        Object objMo16463 = interfaceC24090.mo16462(c9338M35039);
                        c9338M35039.close();
                        return objMo16463;
                    } catch (Throwable th3) {
                        try {
                            c9338M35039.close();
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

    /* JADX INFO: renamed from: ֫ */
    public static C9338 m35038(C16484 c16484, String str, boolean z) throws C5276 {
        int i;
        try {
            try {
                C19561 c19561 = new C19561(c16484.m37409());
                try {
                    C5738 c5738M35037 = m35037(c19561, str);
                    long size = c5738M35037.getSize();
                    long jM12772 = c5738M35037.m12772();
                    C10371 c10371 = c16484.f48410;
                    AbstractC17043 abstractC17043 = c16484.f48414;
                    c10371.getClass();
                    AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("cache").m38684(UMConfigure.WRAPER_TYPE_NATIVE);
                    String strM36665 = C16111.m36665(C16111.m36668().digest(str.getBytes(StandardCharsets.UTF_8)));
                    AbstractC17043 abstractC17043M38685 = abstractC17043M38684.m38684(strM36665.concat(".bin"));
                    AbstractC17043 abstractC17043M38686 = abstractC17043M38684.m38684(strM36665.concat(".json"));
                    if (z) {
                        i = 2;
                    } else {
                        i = 2;
                        if (m35041(abstractC17043M38686, abstractC17043M38685, str, size, jM12772)) {
                            if (m35043(abstractC17043M38685)) {
                                C9338 c9338 = new C9338(abstractC17043M38685, size, jM12772, false, true);
                                c19561.close();
                                return c9338;
                            }
                            AbstractC17043[] abstractC17043Arr = {abstractC17043M38686, abstractC17043M38685};
                            for (int i2 = 0; i2 < 2; i2++) {
                                abstractC17043Arr[i2].mo25503();
                            }
                        }
                    }
                    AbstractC17043[] abstractC17043Arr2 = new AbstractC17043[i];
                    abstractC17043Arr2[0] = abstractC17043M38686;
                    abstractC17043Arr2[1] = abstractC17043M38685;
                    for (int i3 = 0; i3 < i; i3++) {
                        abstractC17043Arr2[i3].mo25503();
                    }
                    C9338 c9338M35039 = m35039(c19561, c5738M35037, str, size, jM12772, abstractC17043M38684, abstractC17043M38685, abstractC17043M38686);
                    c19561.close();
                    return c9338M35039;
                } catch (Throwable th) {
                    try {
                        c19561.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (C5276 e) {
                throw e;
            }
        } catch (IOException | RuntimeException unused) {
            throw C5276.m11410("ENTRY_READ_FAILED", "Failed to read ZIP entry.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35041(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, String str, long j, long j2) {
        if (!abstractC17043.mo25093() || !abstractC17044.mo25093() || abstractC17044.mo25101() != j) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(abstractC17043.m38664(), StandardCharsets.UTF_8));
            return jSONObject.getInt("version", -1) == 1 && str.equals(jSONObject.getString("entryName", null)) && jSONObject.getLong("size", -1L) == j && jSONObject.getLong("unsignedCrc", -1L) == j2;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5738 m35037(C19561 c19561, String str) throws C5276 {
        C5738 entry = c19561.getEntry(str);
        if (entry == null) {
            throw C5276.m11405("ENTRY_NOT_FOUND", "ZIP entry not found");
        }
        if (entry.isDirectory()) {
            throw C5276.m11410("ENTRY_IS_DIRECTORY", "ZIP entry is a directory");
        }
        if (entry.getSize() >= 0) {
            return entry;
        }
        throw C5276.m11410("ENTRY_READ_FAILED", "ZIP entry size is unavailable.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35042(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            byte b = bArr[0];
            byte[] bArr2 = f43917;
            if (b == bArr2[0] && bArr[1] == bArr2[1] && bArr[2] == bArr2[2] && bArr[3] == bArr2[3]) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9338 m35039(C19561 c19561, C5738 c5738, String str, long j, long j2, AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, AbstractC17043 abstractC17045) throws Throwable {
        boolean z;
        InputStream inputStreamM44448 = c19561.m44448(c5738);
        try {
            byte[] bArr = new byte[4];
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i < 4) {
                    int i2 = inputStreamM44448.read(bArr, i, 4 - i);
                    if (i2 < 0) {
                        inputStreamM44448.close();
                        z = false;
                        break;
                    }
                    i += i2;
                } else {
                    boolean zM35042 = m35042(bArr);
                    inputStreamM44448.close();
                    z = zM35042;
                    break;
                }
            }
            if (!z) {
                throw C5276.m11410("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an ELF file.");
            }
            abstractC17043.m38666();
            AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(abstractC17044.getName() + ".tmp");
            AbstractC17043 abstractC17043M38685 = abstractC17043.m38684(abstractC17045.getName() + ".tmp");
            abstractC17043M38684.mo25503();
            abstractC17043M38685.mo25503();
            try {
                InputStream inputStreamM44449 = c19561.m44448(c5738);
                try {
                    abstractC17043M38684.m38652(inputStreamM44449, j, (InterfaceC7717) null);
                    inputStreamM44449.close();
                    if (abstractC17043M38684.mo25101() != j) {
                        throw new IOException("Unexpected native entry size");
                    }
                    abstractC17043M38685.m38660(new JSONObject().add("version", 1).add("entryName", str).add("size", j).add("unsignedCrc", j2).toString().getBytes(StandardCharsets.UTF_8));
                    abstractC17044.mo25503();
                    if (!abstractC17043M38684.mo25502(abstractC17044)) {
                        throw new IOException("Failed to publish native cache data");
                    }
                    abstractC17045.mo25503();
                    if (!abstractC17043M38685.mo25502(abstractC17045)) {
                        abstractC17044.mo25503();
                        throw new IOException("Failed to publish native cache metadata");
                    }
                    try {
                        return new C9338(abstractC17044, j, j2, false, false);
                    } catch (Throwable th) {
                        th = th;
                        z2 = true;
                        if (!z2) {
                            abstractC17043M38684.mo25503();
                            abstractC17043M38685.mo25503();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        inputStreamM44449.close();
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
                inputStreamM44448.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m35043(AbstractC17043 abstractC17043) {
        try {
            InputStream inputStreamMo29987 = abstractC17043.mo29987();
            try {
                byte[] bArr = f43917;
                for (int i = 0; i < 4; i++) {
                    if (inputStreamMo29987.read() != (bArr[i] & 255)) {
                        inputStreamMo29987.close();
                        return false;
                    }
                }
                if (inputStreamMo29987 != null) {
                    inputStreamMo29987.close();
                }
                return true;
            } catch (Throwable th) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
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

    /* JADX INFO: renamed from: ֫ */
    public static void m35040(AbstractC17043 abstractC17043) {
        if (abstractC17043.mo25087()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
            for (AbstractC17043 abstractC17044 : abstractC17043.mo25500(true)) {
                if (abstractC17044.getName().startsWith("apk-native-") && abstractC17044.mo25091() < jCurrentTimeMillis) {
                    abstractC17044.mo25503();
                }
            }
        }
    }
}
