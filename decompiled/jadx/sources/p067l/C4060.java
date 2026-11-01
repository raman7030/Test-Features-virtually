package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֫ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E76K */
/* JADX INFO: loaded from: classes2.dex */
public final class C4060 {
    /* JADX WARN: Code duplicated, block: B:128:0x0311  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017f, code lost:
    
        if ((r9 + r7) <= r11) goto L60;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5146 m8127(C16484 c16484, C17384 c17384, C23506 c23506, C9338 c9338, C16713 c16713) throws C5276 {
        C15203 c15203;
        C9169 c9169;
        C9169 c91610;
        String str;
        JSONValue jSONValueValue;
        byte[] bArr;
        C6211 c6211;
        long j;
        String str2 = c9338.f25443;
        C13362.m30502(str2);
        String str3 = c16713.f49223;
        String str4 = c16713.f49226;
        byte[] bArr2 = c16713.f49222;
        long j2 = c16713.f49217;
        if ("virtual".equals(str3)) {
            try {
                c23506.getClass();
                C6211 c6211M40093 = C17609.m40093(str2, j2, true, false);
                try {
                    C13863.m31570(c6211M40093);
                    if (!c6211M40093.f15635 || !c6211M40093.f15636) {
                        throw C5276.m11405("NATIVE_ADDRESS_NOT_MAPPED", "Native virtual address is not mapped to file-backed ELF bytes.");
                    }
                    c15203 = new C15203(c6211M40093.f15637, c6211M40093.f15632, c6211M40093);
                } catch (C5276 unused) {
                    throw C13863.m31554();
                }
            } catch (RuntimeException unused2) {
                throw C5276.m11410("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        } else {
            C6211 c6211M14061 = C6211.m14061(j2);
            try {
                c23506.getClass();
                C6211 c6211M40094 = C17609.m40093(str2, j2, false, false);
                C13863.m31570(c6211M40094);
                if (c6211M40094.f15635) {
                    j = c6211M40094.f15637;
                    c6211 = c6211M40094;
                } else {
                    c6211 = c6211M14061;
                    j = -1;
                }
            } catch (RuntimeException | C5276 unused3) {
                c6211M14061 = C6211.m14061(j2);
            }
            c15203 = new C15203(j, c16713.f49217, c6211);
        }
        int length = bArr2.length;
        byte[] bArr3 = c16713.f49220;
        int length2 = bArr3.length;
        String str5 = "warning";
        if (!"none".equals(str4)) {
            if ("space_pad".equals(str4)) {
                int iMax = Math.max(length, length2);
                m8129(c16713, iMax);
                byte[] bArr4 = new byte[iMax];
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
                Arrays.fill(bArr4, bArr2.length, iMax, UTF8.S_CS3);
                byte[] bArr5 = new byte[iMax];
                System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
                Arrays.fill(bArr5, bArr3.length, iMax, UTF8.S_CS3);
                c9169 = new C9169(bArr4, bArr5, Math.max(0, length2 - length), false);
            } else {
                int iMax2 = Math.max(length, length2) + 1;
                m8129(c16713, iMax2);
                byte[] bArr6 = new byte[iMax2];
                System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                Arrays.fill(bArr6, bArr2.length, iMax2, (byte) 0);
                byte[] bArr7 = new byte[iMax2];
                System.arraycopy(bArr3, 0, bArr7, 0, bArr3.length);
                Arrays.fill(bArr7, bArr3.length, iMax2, (byte) 0);
                c9169 = new C9169(bArr6, bArr7, Math.max(0, length2 - length), true);
            }
            c91610 = c9169;
        } else {
            if (length != length2) {
                throw C5276.m11407("NATIVE_STRING_LENGTH_MISMATCH", "replacementText does not fit the native string patch window.", "warning", JSON.array(), m8124(c16713).add("expectedTextByteCount", bArr2.length).add("replacementTextByteCount", bArr3.length));
            }
            m8129(c16713, length);
            c91610 = new C9169(bArr2, bArr3, 0, false);
            str4 = str4;
            str5 = "warning";
        }
        long j3 = c9338.f25447;
        byte[] bArr8 = c91610.f24836;
        int length3 = bArr8.length;
        long j4 = c15203.f43386;
        if (j4 < 0 || j4 > 2147483647L || j4 > j3) {
            str = "patchedFileOffset";
        } else {
            long j5 = length3;
            if (C14849.FOREVER_NS - j4 >= j5 && j5 + j4 <= j3) {
                int length4 = bArr8.length;
                boolean zEquals = "virtual".equals(str3);
                C6211 c6212 = c15203.f43387;
                if (zEquals) {
                    long j6 = c6212.f15642;
                    if (j6 >= 0) {
                        long j7 = c6212.f15633;
                        if (j7 >= 0 && j6 <= j7) {
                            long j8 = length4;
                            if (C14849.FOREVER_NS - j6 >= j8) {
                            }
                        }
                    }
                    throw C13863.m31571();
                }
                int length5 = bArr8.length;
                byte[] bArr9 = new byte[length5];
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str2), "r");
                    try {
                        randomAccessFile.seek(j4);
                        randomAccessFile.readFully(bArr9);
                        randomAccessFile.close();
                        if (length5 >= bArr2.length) {
                            for (int i = 0; i < bArr2.length; i++) {
                                if (bArr9[i] == bArr2[i]) {
                                }
                            }
                            String str6 = str4;
                            byte b = "space_pad".equals(str6) ? UTF8.S_CS3 : (byte) 0;
                            for (int length6 = bArr2.length; length6 < length5; length6++) {
                                if (bArr9[length6] != b) {
                                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr9, bArr2.length, length5);
                                    throw C5276.m11407("NATIVE_STRING_PADDING_MISMATCH", "Native string padding bytes do not match paddingMode.", str5, JSON.array(), m8124(c16713).add("patchedFileOffset", C6656.m15140(j4)).add("byteOffset", j4).add("expectedText", c16713.f49227).add("actualText", m8125(c16713, bArr9)).add("expectedHex", C6656.m15143(bArr8)).add("actualHex", C6656.m15143(bArr9)).add("requiredPaddingBytes", bArrCopyOfRange.length).add("actualPaddingHex", C6656.m15143(bArrCopyOfRange)).add("terminatorRequired", "null_pad".equals(str6)));
                                }
                            }
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(new C15813((int) j4, bArr8, c91610.f24835));
                            try {
                                c17384.m39588(c16484, new C9779(c16713.f49219, c16713.f49225, c16713.f49224, arrayList));
                                return new C5146(c16713, c15203.f43385, c6212, c15203.f43386, c91610.f24836, c91610.f24835, c91610.f24837, c91610.f24838);
                            } catch (C5276 e) {
                                if (!"PATCH_EXPECTED_MISMATCH".equals(e.f12413)) {
                                    throw e;
                                }
                                String string = e.f12412.getString("actualHex", "");
                                if (string == null || (string.length() & 1) != 0) {
                                    bArr = new byte[0];
                                } else {
                                    int length7 = string.length() / 2;
                                    bArr = new byte[length7];
                                    for (int i2 = 0; i2 < length7; i2++) {
                                        int i3 = i2 * 2;
                                        int iDigit = Character.digit(string.charAt(i3), 16);
                                        int iDigit2 = Character.digit(string.charAt(i3 + 1), 16);
                                        if (iDigit < 0 || iDigit2 < 0) {
                                            bArr = new byte[0];
                                            break;
                                        }
                                        bArr[i2] = (byte) (iDigit2 | (iDigit << 4));
                                    }
                                }
                                throw m8128(c16713, j4, bArr8, bArr);
                            }
                        }
                        throw m8128(c16713, j4, bArr8, bArr9);
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException | RuntimeException unused4) {
                    throw C5276.m11410("ENTRY_READ_FAILED", "Failed to read native string byte window.");
                }
            }
            str = "patchedFileOffset";
        }
        JSONArray jSONArrayArray = JSON.array();
        JSONObject jSONObjectAdd = JSON.object().add(str, C6656.m15140(j4));
        if (j4 >= 0) {
            long j9 = length3;
            if (C14849.FOREVER_NS - j4 < j9) {
                jSONValueValue = JSON.NULL;
            } else {
                jSONValueValue = JSON.value(C6656.m15140(j4 + j9));
            }
        } else {
            jSONValueValue = JSON.NULL;
        }
        throw C5276.m11407("NATIVE_STRING_RANGE_OUT_OF_ENTRY", "Native string patch window is outside the ZIP entry.", str5, jSONArrayArray, jSONObjectAdd.add("endByteOffset", jSONValueValue).add("entrySize", j3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m8128(C16713 c16713, long j, byte[] bArr, byte[] bArr2) {
        return C5276.m11407("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedText.", "warning", JSON.array(), JSON.object().add("workspaceId", c16713.f49219).add("editSessionId", c16713.f49225).add("locator", c16713.f49218).add("patchedFileOffset", C6656.m15140(j)).add("byteOffset", j).add("paddingMode", c16713.f49226).add("expectedText", c16713.f49227).add("actualText", m8125(c16713, bArr2)).add("expectedHex", C6656.m15143(bArr)).add("actualHex", C6656.m15143(bArr2)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m8125(C16713 c16713, byte[] bArr) {
        String str = c16713.f49226;
        if ("null_pad".equals(str)) {
            int i = 0;
            while (i < bArr.length && bArr[i] != 0) {
                i++;
            }
            return m8126(bArr, i, false);
        }
        if ("space_pad".equals(str)) {
            int length = bArr.length;
            while (length > 0 && bArr[length - 1] == 32) {
                length--;
            }
            return m8126(bArr, length, false);
        }
        return m8126(bArr, bArr.length, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m8126(byte[] bArr, int i, boolean z) {
        for (int i2 = 0; i2 < i; i2++) {
            if (z && bArr[i2] == 0) {
                return "";
            }
        }
        try {
            CharsetDecoder charsetDecoderNewDecoder = StandardCharsets.UTF_8.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, 0, i)).toString();
        } catch (CharacterCodingException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8129(C16713 c16713, int i) throws C5276 {
        if (i > 4096) {
            throw C5276.m11407("NATIVE_STRING_TOO_LARGE", "Native string patch window is too large.", "warning", JSON.array(), m8124(c16713).add("expectedTextByteCount", c16713.f49222.length).add("replacementTextByteCount", c16713.f49220.length).add("bytesPatched", i).add("limitBytes", 4096));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m8124(C16713 c16713) {
        return JSON.object().add("workspaceId", c16713.f49219).add("editSessionId", c16713.f49225).add("locator", c16713.f49218).add("addressKind", c16713.f49223).add("address", c16713.f49221).add("paddingMode", c16713.f49226);
    }
}
