package l;

import java.io.EOFException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۤ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5LJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10619 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26650(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        inputStream.mark(44);
        byte[] bArr = new byte[44];
        try {
            try {
                C18366.m42795(inputStream, bArr, 0, 44);
                inputStream.reset();
                return m26651(new C22920(bArr, 0));
            } catch (EOFException unused) {
                throw new C3041("File is too short");
            }
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26651(AbstractC3912 abstractC3912) {
        int iM15353 = C5383.m15353(abstractC3912);
        if (iM15353 == -1) {
            StringBuilder sb = new StringBuilder("Not a valid dex magic value:");
            for (int i = 0; i < 8; i++) {
                sb.append(String.format(" %02x", Byte.valueOf(abstractC3912.mo11933(i))));
            }
            throw new C3041(sb.toString());
        }
        if (C19893.m45747(iM15353) == -1) {
            throw new C12735(String.format("Dex version %03d is not supported", Integer.valueOf(iM15353)));
        }
        int iMo11937 = abstractC3912.mo11937(40);
        if (iMo11937 == 2018915346) {
            throw new C12735("Big endian dex files are not supported");
        }
        if (iMo11937 == 305419896) {
            return iM15353;
        }
        throw new C13440(String.format("Invalid endian tag: 0x%x", Integer.valueOf(iMo11937)));
    }
}
