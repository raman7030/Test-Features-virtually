package p067l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Properties;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۗ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5695 {

    /* JADX INFO: renamed from: ֫ */
    public static final C16443 f13903 = new C16443();

    /* JADX INFO: renamed from: ֫ */
    public static String m12679(File file) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArrM12681 = m12681(randomAccessFile2);
                if (bArrM12681 != null) {
                    C7036 c7036 = new C7036();
                    Properties properties = new Properties();
                    c7036.f18335 = properties;
                    c7036.m16178(bArrM12681);
                    String property = properties.getProperty("channelNo");
                    randomAccessFile2.close();
                    return property;
                }
                randomAccessFile2.close();
                return null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m12681(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] bArr = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
        int i = randomAccessFile.read();
        while (i != -1) {
            if (i != bArr[0] || randomAccessFile.read() != bArr[1] || randomAccessFile.read() != bArr[2] || randomAccessFile.read() != bArr[3]) {
                length--;
                randomAccessFile.seek(length);
                i = randomAccessFile.read();
            } else {
                randomAccessFile.seek(length + 20);
                byte[] bArr2 = new byte[2];
                randomAccessFile.readFully(bArr2);
                int iM37361 = new C16443(bArr2).m37361();
                if (iM37361 == 0) {
                    return null;
                }
                byte[] bArr3 = new byte[iM37361];
                randomAccessFile.read(bArr3);
                return bArr3;
            }
        }
        throw new ZipException("archive is not a ZIP archive");
    }
}
