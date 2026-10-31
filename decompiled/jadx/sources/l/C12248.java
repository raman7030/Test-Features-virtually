package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.github.luben.zstd.Zstd;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۫ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12248 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile byte[] f36505;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29747(AbstractC15440 abstractC15440) {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("format.json.tmp");
        AbstractC15440 abstractC15440M36527 = abstractC15440.m36526("format.json");
        if (!abstractC15440M36526.mo23120() && abstractC15440M36527.mo23120()) {
            try {
                JSONObject jSONObject = new JSONObject(new String(abstractC15440M36527.m36506(), StandardCharsets.UTF_8));
                if (jSONObject.getInt("version", -1) == 1 && "zstd".equals(jSONObject.getString("codec", null)) && jSONObject.getBoolean("checksum", false) && jSONObject.getBoolean("contentSize", false) && jSONObject.getLong("dictionaryId", -1L) == 1773473561 && "38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351".equals(jSONObject.getString("dictionarySha256", null))) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29750(AbstractC15440 abstractC15440) throws IOException {
        m29751();
        abstractC15440.m36508();
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("format.json.tmp");
        AbstractC15440 abstractC15440M36527 = abstractC15440.m36526("format.json");
        if (abstractC15440M36526.mo23120() && !abstractC15440M36526.mo23552()) {
            throw new IOException("Unable to delete stale smali cache format temp file");
        }
        abstractC15440M36526.m36502(JSON.object().add("version", 1).add("codec", "zstd").add("checksum", true).add("contentSize", true).add("dictionaryId", 1773473561L).add("dictionarySha256", "38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351").toString().getBytes(StandardCharsets.UTF_8));
        if (abstractC15440M36527.mo23120() && !abstractC15440M36527.mo23552()) {
            throw new IOException("Unable to replace smali cache format file");
        }
        if (!abstractC15440M36526.mo23551(abstractC15440M36527)) {
            throw new IOException("Unable to publish smali cache format file");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m29751() {
        byte[] bArr = f36505;
        if (bArr != null) {
            return bArr;
        }
        synchronized (C12248.class) {
            byte[] bArr2 = f36505;
            if (bArr2 != null) {
                return bArr2;
            }
            byte[] bArr3 = new byte[32768];
            try {
                InputStream inputStreamOpen = C4925.m14325().open("9");
                int i = 0;
                while (i < 32768) {
                    try {
                        int i2 = inputStreamOpen.read(bArr3, i, 32768 - i);
                        if (i2 < 0) {
                            throw new IOException("Smali cache dictionary is truncated");
                        }
                        if (i2 == 0) {
                            int i3 = inputStreamOpen.read();
                            if (i3 < 0) {
                                throw new IOException("Smali cache dictionary is truncated");
                            }
                            bArr3[i] = (byte) i3;
                            i++;
                        } else {
                            i += i2;
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (inputStreamOpen.read() != -1) {
                    throw new IOException("Smali cache dictionary length is invalid");
                }
                inputStreamOpen.close();
                if (!"38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351".equals(C14460.m34531(C14460.m34534().digest(bArr3))) || Zstd.getDictIdFromDict(bArr3) != 1773473561) {
                    throw new IOException("Smali cache dictionary identity is invalid");
                }
                f36505 = bArr3;
                return bArr3;
            } catch (RuntimeException e) {
                throw new IOException("Unable to open smali cache dictionary", e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29745(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i < 0 || i > 1048576) {
            throw new IOException("Invalid smali record name length");
        }
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29746(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >>> 24) & 255);
        outputStream.write((i >>> 16) & 255);
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29749(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }
}
