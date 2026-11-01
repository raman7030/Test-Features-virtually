package p067l;

import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۤ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5LJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12461 {
    /* JADX INFO: renamed from: ֫ */
    public static int m28690(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        inputStream.mark(44);
        byte[] bArr = new byte[44];
        try {
            try {
                C19824.m45067(inputStream, bArr, 0, 44);
                inputStream.reset();
                return m28691(new C24151(bArr, 0));
            } catch (EOFException unused) {
                throw new C5258("File is too short");
            }
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m28691(AbstractC6086 abstractC6086) {
        int iM17264 = C7484.m17264(abstractC6086);
        if (iM17264 == -1) {
            StringBuilder sb = new StringBuilder("Not a valid dex magic value:");
            for (int i = 0; i < 8; i++) {
                sb.append(String.format(" %02x", Byte.valueOf(abstractC6086.mo13853(i))));
            }
            throw new C5258(sb.toString());
        }
        if (C21274.m48058(iM17264) == -1) {
            throw new C14472(String.format("Dex version %03d is not supported", Integer.valueOf(iM17264)));
        }
        int iMo13857 = abstractC6086.mo13857(40);
        if (iMo13857 == 2018915346) {
            throw new C14472("Big endian dex files are not supported");
        }
        if (iMo13857 == 305419896) {
            return iM17264;
        }
        throw new C15142(String.format("Invalid endian tag: 0x%x", Integer.valueOf(iMo13857)));
    }
}
