package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.github.luben.zstd.Zstd;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۫ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes3.dex */
public final class C14009 {

    /* JADX INFO: renamed from: ֫ */
    public static volatile byte[] f39522;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31809(AbstractC17043 abstractC17043) {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("format.json.tmp");
        AbstractC17043 abstractC17043M38685 = abstractC17043.m38684("format.json");
        if (!abstractC17043M38684.mo25094() && abstractC17043M38685.mo25094()) {
            try {
                JSONObject jSONObject = new JSONObject(new String(abstractC17043M38685.m38664(), StandardCharsets.UTF_8));
                if (jSONObject.getInt("version", -1) == 1 && "zstd".equals(jSONObject.getString("codec", null)) && jSONObject.getBoolean("checksum", false) && jSONObject.getBoolean("contentSize", false) && jSONObject.getLong("dictionaryId", -1L) == 1773473561 && "38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351".equals(jSONObject.getString("dictionarySha256", null))) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m31812(AbstractC17043 abstractC17043) throws IOException {
        m31813();
        abstractC17043.m38666();
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("format.json.tmp");
        AbstractC17043 abstractC17043M38685 = abstractC17043.m38684("format.json");
        if (abstractC17043M38684.mo25094() && !abstractC17043M38684.mo25503()) {
            throw new IOException("Unable to delete stale smali cache format temp file");
        }
        abstractC17043M38684.m38660(JSON.object().add("version", 1).add("codec", "zstd").add("checksum", true).add("contentSize", true).add("dictionaryId", 1773473561L).add("dictionarySha256", "38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351").toString().getBytes(StandardCharsets.UTF_8));
        if (abstractC17043M38685.mo25094() && !abstractC17043M38685.mo25503()) {
            throw new IOException("Unable to replace smali cache format file");
        }
        if (!abstractC17043M38684.mo25502(abstractC17043M38685)) {
            throw new IOException("Unable to publish smali cache format file");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m31813() {
        byte[] bArr = f39522;
        if (bArr != null) {
            return bArr;
        }
        synchronized (C14009.class) {
            byte[] bArr2 = f39522;
            if (bArr2 != null) {
                return bArr2;
            }
            byte[] bArr3 = new byte[32768];
            try {
                InputStream inputStreamOpen = C7050.m16222().open("9");
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
                if (!"38ad0b3d930d8640ff96107546386f4e11da0ffba3e8bf7b641bd3c99ff02351".equals(C16111.m36665(C16111.m36668().digest(bArr3))) || Zstd.getDictIdFromDict(bArr3) != 1773473561) {
                    throw new IOException("Smali cache dictionary identity is invalid");
                }
                f39522 = bArr3;
                return bArr3;
            } catch (RuntimeException e) {
                throw new IOException("Unable to open smali cache dictionary", e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m31807(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i < 0 || i > 1048576) {
            throw new IOException("Invalid smali record name length");
        }
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31808(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >>> 24) & 255);
        outputStream.write((i >>> 16) & 255);
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m31811(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >>> 8) & 255);
        outputStream.write(i & 255);
    }
}
