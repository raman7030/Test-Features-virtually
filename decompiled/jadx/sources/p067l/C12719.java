package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6XW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12719 {
    /* JADX INFO: renamed from: ֫ */
    public static void m29243(C16564 c16564, ArrayList arrayList) throws C5276, IOException {
        boolean z = c16564.f48645;
        AbstractC17043 abstractC17043 = c16564.f48646;
        if (!z) {
            throw C5276.m11407("FILE_NOT_FOUND", "The requested file path does not exist.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, abstractC17043.mo25505()).add("operation", "patch_validate"));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4001 c4001 = (C4001) it.next();
            if (c4001.f8722 > c16564.f48647) {
                throw m29240(c16564, c4001);
            }
        }
        InputStream inputStreamM37544 = c16564.m37544();
        try {
            Iterator it2 = arrayList.iterator();
            long j = 0;
            while (it2.hasNext()) {
                C4001 c4002 = (C4001) it2.next();
                long j2 = c4002.f8721;
                byte[] bArr = c4002.f8723;
                m29241(j2 - j, inputStreamM37544);
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i = 0;
                while (i < length) {
                    int i2 = inputStreamM37544.read(bArr2, i, length - i);
                    if (i2 >= 0) {
                        if (i2 == 0) {
                            int i3 = inputStreamM37544.read();
                            if (i3 >= 0) {
                                bArr2[i] = (byte) i3;
                                i++;
                            }
                        } else {
                            i += i2;
                        }
                    }
                    throw m29240(c16564, c4002);
                }
                if (!Arrays.equals(bArr2, bArr)) {
                    throw C5276.m11407("FILE_PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, abstractC17043.mo25505()).add("operation", "patch_validate").add("backendReason", "expected_bytes_mismatch").add("failedPatchIndex", c4002.f8725).add("byteOffset", c4002.f8721).add("expectedHex", C15268.m34730(bArr)).add("actualHex", C15268.m34730(bArr2)));
                }
                j = c4002.f8722;
            }
            if (inputStreamM37544 != null) {
                inputStreamM37544.close();
            }
        } catch (Throwable th) {
            if (inputStreamM37544 != null) {
                try {
                    inputStreamM37544.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29242(C16564 c16564, BufferedOutputStream bufferedOutputStream, ArrayList arrayList) throws IOException {
        long j;
        InputStream inputStreamM37544 = c16564.m37544();
        try {
            byte[] bArr = new byte[65536];
            Iterator it = arrayList.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                C4001 c4001 = (C4001) it.next();
                long j3 = c4001.f8721 - j2;
                while (j3 > 0) {
                    int i = inputStreamM37544.read(bArr, 0, (int) Math.min(65536, j3));
                    if (i < 0) {
                        throw new IOException("Unexpected end of file before patch window");
                    }
                    if (i == 0) {
                        int i2 = inputStreamM37544.read();
                        if (i2 < 0) {
                            throw new IOException("Unexpected end of file before patch window");
                        }
                        bufferedOutputStream.write(i2);
                        j = 1;
                    } else {
                        bufferedOutputStream.write(bArr, 0, i);
                        j = i;
                    }
                    j3 -= j;
                }
                m29241(c4001.f8723.length, inputStreamM37544);
                bufferedOutputStream.write(c4001.f8724);
                j2 = c4001.f8722;
            }
            while (true) {
                int i3 = inputStreamM37544.read(bArr);
                if (i3 < 0) {
                    break;
                }
                if (i3 == 0) {
                    int i4 = inputStreamM37544.read();
                    if (i4 < 0) {
                        break;
                    } else {
                        bufferedOutputStream.write(i4);
                    }
                } else {
                    bufferedOutputStream.write(bArr, 0, i3);
                }
            }
            inputStreamM37544.close();
        } catch (Throwable th) {
            if (inputStreamM37544 != null) {
                try {
                    inputStreamM37544.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m29240(C16564 c16564, C4001 c4001) {
        return C5276.m11407("FILE_OFFSET_OUT_OF_RANGE", "A byte patch range is outside the file.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, c16564.f48646.mo25505()).add("operation", "patch_validate").add("backendReason", "patch_after_end").add("failedPatchIndex", c4001.f8725).add("byteOffset", c4001.f8721).add("endByteOffset", c4001.f8722).add("totalBytes", c16564.f48647));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29241(long j, InputStream inputStream) throws IOException {
        byte[] bArr = null;
        while (j > 0) {
            long jSkip = inputStream.skip(j);
            if (jSkip > 0) {
                j -= jSkip;
            } else {
                if (bArr == null) {
                    bArr = new byte[65536];
                }
                int i = inputStream.read(bArr, 0, (int) Math.min(bArr.length, j));
                if (i < 0) {
                    throw new IOException("Unexpected end of file while seeking patch window");
                }
                if (i == 0) {
                    if (inputStream.read() < 0) {
                        throw new IOException("Unexpected end of file while seeking patch window");
                    }
                    i = 1;
                }
                j -= (long) i;
            }
        }
    }
}
