package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
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
public final class C1780 {
    /* JADX WARN: Code duplicated, block: B:128:0x0311  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017f, code lost:
    
        if ((r9 + r7) <= r11) goto L60;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2923 m5932(C14852 c14852, C15799 c15799, C22241 c22241, C7333 c7333, C15093 c15093) throws C3059 {
        C13505 c13505;
        C7156 c7156;
        C7156 c7157;
        String str;
        JSONValue jSONValueValue;
        byte[] bArr;
        C4043 c4043;
        long j;
        String str2 = c7333.f22530;
        C11567.m28456(str2);
        String str3 = c15093.f46103;
        String str4 = c15093.f46106;
        byte[] bArr2 = c15093.f46102;
        long j2 = c15093.f46097;
        if ("virtual".equals(str3)) {
            try {
                c22241.getClass();
                C4043 c4043M37906 = C16036.m37906(str2, j2, true, false);
                try {
                    C12095.m29507(c4043M37906);
                    if (!c4043M37906.f12820 || !c4043M37906.f12821) {
                        throw C3059.m9363("NATIVE_ADDRESS_NOT_MAPPED", "Native virtual address is not mapped to file-backed ELF bytes.");
                    }
                    c13505 = new C13505(c4043M37906.f12822, c4043M37906.f12817, c4043M37906);
                } catch (C3059 unused) {
                    throw C12095.m29491();
                }
            } catch (RuntimeException unused2) {
                throw C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        } else {
            C4043 c4043M12140 = C4043.m12140(j2);
            try {
                c22241.getClass();
                C4043 c4043M37907 = C16036.m37906(str2, j2, false, false);
                C12095.m29507(c4043M37907);
                if (c4043M37907.f12820) {
                    j = c4043M37907.f12822;
                    c4043 = c4043M37907;
                } else {
                    c4043 = c4043M12140;
                    j = -1;
                }
            } catch (RuntimeException | C3059 unused3) {
                c4043M12140 = C4043.m12140(j2);
            }
            c13505 = new C13505(j, c15093.f46097, c4043);
        }
        int length = bArr2.length;
        byte[] bArr3 = c15093.f46100;
        int length2 = bArr3.length;
        String str5 = "warning";
        if (!"none".equals(str4)) {
            if ("space_pad".equals(str4)) {
                int iMax = Math.max(length, length2);
                m5934(c15093, iMax);
                byte[] bArr4 = new byte[iMax];
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
                Arrays.fill(bArr4, bArr2.length, iMax, UTF8.S_CS3);
                byte[] bArr5 = new byte[iMax];
                System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
                Arrays.fill(bArr5, bArr3.length, iMax, UTF8.S_CS3);
                c7156 = new C7156(bArr4, bArr5, Math.max(0, length2 - length), false);
            } else {
                int iMax2 = Math.max(length, length2) + 1;
                m5934(c15093, iMax2);
                byte[] bArr6 = new byte[iMax2];
                System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                Arrays.fill(bArr6, bArr2.length, iMax2, (byte) 0);
                byte[] bArr7 = new byte[iMax2];
                System.arraycopy(bArr3, 0, bArr7, 0, bArr3.length);
                Arrays.fill(bArr7, bArr3.length, iMax2, (byte) 0);
                c7156 = new C7156(bArr6, bArr7, Math.max(0, length2 - length), true);
            }
            c7157 = c7156;
        } else {
            if (length != length2) {
                throw C3059.m9365("NATIVE_STRING_LENGTH_MISMATCH", "replacementText does not fit the native string patch window.", "warning", JSON.array(), m5929(c15093).add("expectedTextByteCount", bArr2.length).add("replacementTextByteCount", bArr3.length));
            }
            m5934(c15093, length);
            c7157 = new C7156(bArr2, bArr3, 0, false);
            str4 = str4;
            str5 = "warning";
        }
        long j3 = c7333.f22534;
        byte[] bArr8 = c7157.f21957;
        int length3 = bArr8.length;
        long j4 = c13505.f40316;
        if (j4 < 0 || j4 > 2147483647L || j4 > j3) {
            str = "patchedFileOffset";
        } else {
            long j5 = length3;
            if (C13132.FOREVER_NS - j4 >= j5 && j5 + j4 <= j3) {
                int length4 = bArr8.length;
                boolean zEquals = "virtual".equals(str3);
                C4043 c4044 = c13505.f40317;
                if (zEquals) {
                    long j6 = c4044.f12827;
                    if (j6 >= 0) {
                        long j7 = c4044.f12818;
                        if (j7 >= 0 && j6 <= j7) {
                            long j8 = length4;
                            if (C13132.FOREVER_NS - j6 >= j8) {
                            }
                        }
                    }
                    throw C12095.m29508();
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
                                    throw C3059.m9365("NATIVE_STRING_PADDING_MISMATCH", "Native string padding bytes do not match paddingMode.", str5, JSON.array(), m5929(c15093).add("patchedFileOffset", C4511.m13257(j4)).add("byteOffset", j4).add("expectedText", c15093.f46107).add("actualText", m5930(c15093, bArr9)).add("expectedHex", C4511.m13260(bArr8)).add("actualHex", C4511.m13260(bArr9)).add("requiredPaddingBytes", bArrCopyOfRange.length).add("actualPaddingHex", C4511.m13260(bArrCopyOfRange)).add("terminatorRequired", "null_pad".equals(str6)));
                                }
                            }
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(new C14146((int) j4, bArr8, c7157.f21956));
                            try {
                                c15799.m37417(c14852, new C7797(c15093.f46099, c15093.f46105, c15093.f46104, arrayList));
                                return new C2923(c15093, c13505.f40315, c4044, c13505.f40316, c7157.f21957, c7157.f21956, c7157.f21958, c7157.f21959);
                            } catch (C3059 e) {
                                if (!"PATCH_EXPECTED_MISMATCH".equals(e.f9610)) {
                                    throw e;
                                }
                                String string = e.f9609.getString("actualHex", "");
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
                                throw m5933(c15093, j4, bArr8, bArr);
                            }
                        }
                        throw m5933(c15093, j4, bArr8, bArr9);
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
                    throw C3059.m9368("ENTRY_READ_FAILED", "Failed to read native string byte window.");
                }
            }
            str = "patchedFileOffset";
        }
        JSONArray jSONArrayArray = JSON.array();
        JSONObject jSONObjectAdd = JSON.object().add(str, C4511.m13257(j4));
        if (j4 >= 0) {
            long j9 = length3;
            if (C13132.FOREVER_NS - j4 < j9) {
                jSONValueValue = JSON.NULL;
            } else {
                jSONValueValue = JSON.value(C4511.m13257(j4 + j9));
            }
        } else {
            jSONValueValue = JSON.NULL;
        }
        throw C3059.m9365("NATIVE_STRING_RANGE_OUT_OF_ENTRY", "Native string patch window is outside the ZIP entry.", str5, jSONArrayArray, jSONObjectAdd.add("endByteOffset", jSONValueValue).add("entrySize", j3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m5933(C15093 c15093, long j, byte[] bArr, byte[] bArr2) {
        return C3059.m9365("PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedText.", "warning", JSON.array(), JSON.object().add("workspaceId", c15093.f46099).add("editSessionId", c15093.f46105).add("locator", c15093.f46098).add("patchedFileOffset", C4511.m13257(j)).add("byteOffset", j).add("paddingMode", c15093.f46106).add("expectedText", c15093.f46107).add("actualText", m5930(c15093, bArr2)).add("expectedHex", C4511.m13260(bArr)).add("actualHex", C4511.m13260(bArr2)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5930(C15093 c15093, byte[] bArr) {
        String str = c15093.f46106;
        if ("null_pad".equals(str)) {
            int i = 0;
            while (i < bArr.length && bArr[i] != 0) {
                i++;
            }
            return m5931(bArr, i, false);
        }
        if ("space_pad".equals(str)) {
            int length = bArr.length;
            while (length > 0 && bArr[length - 1] == 32) {
                length--;
            }
            return m5931(bArr, length, false);
        }
        return m5931(bArr, bArr.length, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5931(byte[] bArr, int i, boolean z) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5934(C15093 c15093, int i) throws C3059 {
        if (i > 4096) {
            throw C3059.m9365("NATIVE_STRING_TOO_LARGE", "Native string patch window is too large.", "warning", JSON.array(), m5929(c15093).add("expectedTextByteCount", c15093.f46102.length).add("replacementTextByteCount", c15093.f46100.length).add("bytesPatched", i).add("limitBytes", 4096));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m5929(C15093 c15093) {
        return JSON.object().add("workspaceId", c15093.f46099).add("editSessionId", c15093.f46105).add("locator", c15093.f46098).add("addressKind", c15093.f46103).add("address", c15093.f46101).add("paddingMode", c15093.f46106);
    }
}
