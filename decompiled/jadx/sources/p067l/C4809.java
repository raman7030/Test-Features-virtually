package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۖܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5EC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4809 {

    /* JADX INFO: renamed from: ۧ */
    public static final Calendar f10912 = Calendar.getInstance();

    /* JADX INFO: renamed from: ֫ */
    public static boolean f10911 = false;

    /* JADX INFO: renamed from: ֫ */
    public static long m10148(long j) {
        long time;
        Calendar calendar = f10912;
        synchronized (calendar) {
            calendar.set(1, ((int) ((j >> 25) & 127)) + 1980);
            calendar.set(2, ((int) ((j >> 21) & 15)) - 1);
            calendar.set(5, ((int) (j >> 16)) & 31);
            calendar.set(11, ((int) (j >> 11)) & 31);
            calendar.set(12, ((int) (j >> 5)) & 63);
            calendar.set(13, ((int) (j << 1)) & 62);
            time = calendar.getTime().getTime();
        }
        return time;
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m10151(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        if (i < 1980) {
            return 2162688L;
        }
        return ((long) ((calendar.get(2) + 1) << 21)) | ((((long) i) - 1980) << 25) | ((long) (calendar.get(5) << 16)) | ((long) (calendar.get(11) << 11)) | ((long) (calendar.get(12) << 5)) | ((long) (calendar.get(13) >> 1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10149(long j, int i, byte[] bArr) {
        if (i + 8 > bArr.length) {
            throw new EOFException();
        }
        C17548.m39932(j, i, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m10147(InputStream inputStream, byte[] bArr, int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "Length must not be negative: "));
        }
        int i2 = i;
        while (i2 > 0) {
            int i3 = inputStream.read(bArr, i - i2, i2);
            if (i3 == -1) {
                break;
            }
            i2 -= i3;
        }
        return i - i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m10152(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iM10147 = m10147(inputStream, bArr, i);
        if (iM10147 != i) {
            throw new EOFException(C19768.m44907("Length to read: ", i, iM10147, " actual: "));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m10146(int i) throws IOException {
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 12;
        }
        if (i == 3) {
            return 16;
        }
        throw new IOException("unable to determine salt length: invalid aes key strength");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10150(IOException iOException, C5738 c5738) throws ZipException {
        ZipException zipException = new ZipException("Error: " + iOException.getMessage() + " (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        zipException.initCause(iOException);
        throw zipException;
    }
}
