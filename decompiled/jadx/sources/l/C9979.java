package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤ֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W77C */
/* JADX INFO: loaded from: classes3.dex */
public final class C9979 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f30091 = m25144("1F2003D5");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30092 = m25144("00F020E3");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30093 = m25144("00BF");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f30094 = m25144("90");

    /* JADX WARN: Code duplicated, block: B:110:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:96:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0183 A[LOOP:0: B:97:0x0180->B:99:0x0183, LOOP_END] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4334 m25143(C14852 c14852, C15799 c15799, C22241 c22241, C7333 c7333, C8039 c8039) throws C3059 {
        C11567 c11567;
        String str;
        String str2;
        int i;
        String str3;
        byte[] bArr;
        byte[] bArrCopyOf;
        int length;
        String str4 = c7333.f22530;
        C11567 c11567M28457 = C11567.m28457(str4);
        String strM44216 = C19151.m44216(c11567M28457, c8039);
        String str5 = c8039.f24784;
        long j = c8039.f24781;
        byte[] bArr2 = c8039.f24786;
        boolean zEquals = "virtual".equals(c8039.f24788);
        if (zEquals && "thumb".equals(strM44216)) {
            j &= -2;
        }
        try {
            c22241.getClass();
            C4043 c4043M37906 = C16036.m37906(str4, j, zEquals, false);
            C12095.m29507(c4043M37906);
            if (!c4043M37906.f12820) {
                throw C3059.m9363("NATIVE_ADDRESS_NOT_MAPPED", "Native address is not mapped in the ELF file.");
            }
            if (!c4043M37906.f12824) {
                throw C3059.m9363("NATIVE_ADDRESS_NOT_EXECUTABLE", "Native address is not executable. Use mt_apk_native_map_address to inspect mapping.isLoaded and mapping.isExecutable.");
            }
            if (!zEquals) {
                j = c4043M37906.f12822;
            }
            long j2 = j;
            long j3 = c4043M37906.f12817;
            long j4 = c7333.f22534;
            int length2 = bArr2.length;
            if (j3 >= 0) {
                long j5 = c4043M37906.f12827;
                if (j5 >= 0) {
                    long j6 = c4043M37906.f12818;
                    if (j6 >= 0 && j5 <= j6 && j3 <= j4) {
                        long j7 = length2;
                        if (C13132.FOREVER_NS - j5 >= j7 && j5 + j7 <= j6 && C13132.FOREVER_NS - j3 >= j7 && j7 + j3 <= j4) {
                            if (j2 < 0 || j3 > 2147483647L) {
                                throw C12095.m29508();
                            }
                            String str6 = c8039.f24785;
                            if ("arm".equals(c11567M28457.m28459())) {
                                if (c11567.f34509 == 40) {
                                    str2 = "thumb";
                                    if (str2.equals(str)) {
                                        c11567 = c11567M28457;
                                        str = strM44216;
                                        i = 2;
                                    }
                                } else {
                                    c11567 = c11567M28457;
                                    str = strM44216;
                                    str2 = "thumb";
                                }
                                c11567 = c11567M28457;
                                str = strM44216;
                                i = 4;
                            } else {
                                str = strM44216;
                                c11567 = c11567M28457;
                                str2 = "thumb";
                                i = 1;
                            }
                            if (((((long) i) - 1) & j2) != 0) {
                                throw C3059.m9364("address must map to an aligned instruction address", "address", JSON.value(str6), JSON.array(i + "-byte aligned effective virtual address"), (JSONObject) null);
                            }
                            byte[] bArr3 = new byte[bArr2.length];
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str4), "r");
                                try {
                                    randomAccessFile.seek(j3);
                                    randomAccessFile.readFully(bArr3);
                                    randomAccessFile.close();
                                    if (!Arrays.equals(bArr3, bArr2)) {
                                        throw m25142(c8039, j3, C4511.m13260(bArr3));
                                    }
                                    String strM28459 = c11567.m28459();
                                    int iM28458 = c11567.m28458(str);
                                    String str7 = c8039.f24783;
                                    String str8 = c7333.f22530;
                                    try {
                                        c22241.getClass();
                                        C18860 c18860M37911 = C16036.m37911(strM28459, iM28458, j2, str7);
                                        try {
                                            byte[] bArrM43561 = c18860M37911.m43561();
                                            if (!strM28459.equals(c18860M37911.f59465) || iM28458 != c18860M37911.f59466 || j2 != c18860M37911.f59464 || bArrM43561.length == 0 || c18860M37911.f59467 != bArrM43561.length) {
                                                throw C12095.m29491();
                                            }
                                            if (bArrM43561.length > 256) {
                                                throw C3059.m9365("NATIVE_PATCH_TOO_LARGE", "Native instruction patch window is too large.", "warning", JSON.array(), JSON.object().add("expectedBytes", bArr2.length).add("assembledBytes", bArrM43561.length).add("paddingMode", str5));
                                            }
                                            int length3 = bArr2.length;
                                            if (bArrM43561.length > length3) {
                                                throw m25140(length3, bArrM43561.length, str5);
                                            }
                                            if ("none".equals(str5)) {
                                                if (bArrM43561.length != length3) {
                                                    throw m25140(length3, bArrM43561.length, str5);
                                                }
                                                bArrCopyOf = (byte[]) bArrM43561.clone();
                                            } else {
                                                int length4 = length3 - bArrM43561.length;
                                                String strM284510 = c11567.m28459();
                                                if ("arm".equals(strM284510)) {
                                                    str3 = "warning";
                                                    if (c11567.f34508 == 64) {
                                                        bArr = f30091;
                                                    }
                                                    if (length4 % bArr.length == 0) {
                                                        throw C3059.m9365("NATIVE_PATCH_NOP_UNAVAILABLE", "Remaining patch window cannot be filled with NOP instructions.", str3, JSON.array(), JSON.object().add("remainingBytes", length4).add("instructionSet", c11567.m28460(str)).add("instructionWidth", c11567.m28461(str)));
                                                    }
                                                    bArrCopyOf = Arrays.copyOf(bArrM43561, length3);
                                                    for (length = bArrM43561.length; length < bArrCopyOf.length; length += bArr.length) {
                                                        System.arraycopy(bArr, 0, bArrCopyOf, length, bArr.length);
                                                    }
                                                } else {
                                                    str3 = "warning";
                                                }
                                                if ("arm".equals(strM284510) && str2.equals(str)) {
                                                    bArr = f30093;
                                                } else if ("arm".equals(strM284510)) {
                                                    bArr = f30092;
                                                } else {
                                                    bArr = f30094;
                                                }
                                                if (length4 % bArr.length == 0) {
                                                    throw C3059.m9365("NATIVE_PATCH_NOP_UNAVAILABLE", "Remaining patch window cannot be filled with NOP instructions.", str3, JSON.array(), JSON.object().add("remainingBytes", length4).add("instructionSet", c11567.m28460(str)).add("instructionWidth", c11567.m28461(str)));
                                                }
                                                bArrCopyOf = Arrays.copyOf(bArrM43561, length3);
                                                while (length < bArrCopyOf.length) {
                                                    System.arraycopy(bArr, 0, bArrCopyOf, length, bArr.length);
                                                }
                                            }
                                            byte[] bArr4 = bArrCopyOf;
                                            ArrayList arrayList = new ArrayList(1);
                                            arrayList.add(new C14146((int) j3, bArr2, bArr4));
                                            try {
                                                c15799.m37417(c14852, new C7797(c8039.f24787, c8039.f24790, c8039.f24789, arrayList));
                                                return new C4334(c8039, str, j2, c4043M37906, strM28459, c11567.f34508, c11567.m28460(str), c11567.m28461(str), j3, bArrM43561, bArr4);
                                            } catch (C3059 e) {
                                                if ("PATCH_EXPECTED_MISMATCH".equals(e.f9610)) {
                                                    throw m25142(c8039, j3, e.f9609.getString("actualHex", ""));
                                                }
                                                throw e;
                                            }
                                        } catch (RuntimeException unused) {
                                            throw C12095.m29491();
                                        }
                                    } catch (C23092 e2) {
                                        throw m25141(strM28459, iM28458, j2, str, e2, str8);
                                    } catch (RuntimeException e3) {
                                        throw m25141(strM28459, iM28458, j2, str, e3, str8);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        randomAccessFile.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (IOException | RuntimeException unused2) {
                                throw C3059.m9368("ENTRY_READ_FAILED", "Failed to read native byte window.");
                            }
                        }
                    }
                }
            }
            throw C12095.m29508();
        } catch (RuntimeException unused3) {
            throw C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m25142(C8039 c8039, long j, String str) {
        return C3059.m9365("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", JSON.array(), JSON.object().add("workspaceId", c8039.f24787).add("editSessionId", c8039.f24790).add("locator", c8039.f24791).add("patchedFileOffset", C4511.m13257(j)).add("byteOffset", j).add("expectedHex", c8039.f24792).add("actualHex", str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m25141(String str, int i, long j, String str2, RuntimeException runtimeException, String str3) {
        String message = runtimeException.getMessage();
        if (message == null) {
            message = runtimeException.getClass().getSimpleName();
        }
        String strReplace = message.replace(str3, "<path>");
        if (strReplace.length() > 512) {
            strReplace = strReplace.substring(0, 512);
        }
        return C3059.m9365("NATIVE_ASSEMBLY_FAILED", "Native instruction assembly failed.", "warning", JSON.array(), JSON.object().add("arch", str).add("bits", i).add("address", C4511.m13257(j)).add("instructionMode", str2).add("message", strReplace));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m25140(int i, int i2, String str) {
        return C3059.m9365("NATIVE_PATCH_LENGTH_MISMATCH", "Assembled bytes do not fit the expected patch window.", "warning", JSON.array(), JSON.object().add("expectedBytes", i).add("assembledBytes", i2).add("paddingMode", str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m25144(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Character.digit(str.charAt(i2 + 1), 16) | (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }
}
