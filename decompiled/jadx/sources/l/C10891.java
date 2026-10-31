package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
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
public final class C10891 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27198(C14937 c14937, ArrayList arrayList) throws C3059, IOException {
        boolean z = c14937.f45530;
        AbstractC15440 abstractC15440 = c14937.f45531;
        if (!z) {
            throw C3059.m9365("FILE_NOT_FOUND", "The requested file path does not exist.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, abstractC15440.mo23554()).add("operation", "patch_validate"));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1718 c1718 = (C1718) it.next();
            if (c1718.f5944 > c14937.f45532) {
                throw m27195(c14937, c1718);
            }
        }
        InputStream inputStreamM35392 = c14937.m35392();
        try {
            Iterator it2 = arrayList.iterator();
            long j = 0;
            while (it2.hasNext()) {
                C1718 c1719 = (C1718) it2.next();
                long j2 = c1719.f5943;
                byte[] bArr = c1719.f5945;
                m27196(j2 - j, inputStreamM35392);
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i = 0;
                while (i < length) {
                    int i2 = inputStreamM35392.read(bArr2, i, length - i);
                    if (i2 >= 0) {
                        if (i2 == 0) {
                            int i3 = inputStreamM35392.read();
                            if (i3 >= 0) {
                                bArr2[i] = (byte) i3;
                                i++;
                            }
                        } else {
                            i += i2;
                        }
                    }
                    throw m27195(c14937, c1719);
                }
                if (!Arrays.equals(bArr2, bArr)) {
                    throw C3059.m9365("FILE_PATCH_EXPECTED_MISMATCH", "Current bytes do not match expectedHex.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, abstractC15440.mo23554()).add("operation", "patch_validate").add("backendReason", "expected_bytes_mismatch").add("failedPatchIndex", c1719.f5947).add("byteOffset", c1719.f5943).add("expectedHex", C13573.m32618(bArr)).add("actualHex", C13573.m32618(bArr2)));
                }
                j = c1719.f5944;
            }
            if (inputStreamM35392 != null) {
                inputStreamM35392.close();
            }
        } catch (Throwable th) {
            if (inputStreamM35392 != null) {
                try {
                    inputStreamM35392.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27197(C14937 c14937, BufferedOutputStream bufferedOutputStream, ArrayList arrayList) throws IOException {
        long j;
        InputStream inputStreamM35392 = c14937.m35392();
        try {
            byte[] bArr = new byte[65536];
            Iterator it = arrayList.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                C1718 c1718 = (C1718) it.next();
                long j3 = c1718.f5943 - j2;
                while (j3 > 0) {
                    int i = inputStreamM35392.read(bArr, 0, (int) Math.min(65536, j3));
                    if (i < 0) {
                        throw new IOException("Unexpected end of file before patch window");
                    }
                    if (i == 0) {
                        int i2 = inputStreamM35392.read();
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
                m27196(c1718.f5945.length, inputStreamM35392);
                bufferedOutputStream.write(c1718.f5946);
                j2 = c1718.f5944;
            }
            while (true) {
                int i3 = inputStreamM35392.read(bArr);
                if (i3 < 0) {
                    break;
                }
                if (i3 == 0) {
                    int i4 = inputStreamM35392.read();
                    if (i4 < 0) {
                        break;
                    } else {
                        bufferedOutputStream.write(i4);
                    }
                } else {
                    bufferedOutputStream.write(bArr, 0, i3);
                }
            }
            inputStreamM35392.close();
        } catch (Throwable th) {
            if (inputStreamM35392 != null) {
                try {
                    inputStreamM35392.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m27195(C14937 c14937, C1718 c1718) {
        return C3059.m9365("FILE_OFFSET_OUT_OF_RANGE", "A byte patch range is outside the file.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, c14937.f45531.mo23554()).add("operation", "patch_validate").add("backendReason", "patch_after_end").add("failedPatchIndex", c1718.f5947).add("byteOffset", c1718.f5943).add("endByteOffset", c1718.f5944).add("totalBytes", c14937.f45532));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27196(long j, InputStream inputStream) throws IOException {
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
