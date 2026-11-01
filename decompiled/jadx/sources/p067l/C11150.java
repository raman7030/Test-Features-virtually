package p067l;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۢ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6RT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11150 {
    /* JADX INFO: renamed from: ֫ */
    public static void m25681(InterfaceC22097 interfaceC22097, Bundle bundle) throws IOException {
        Bundle bundle2 = new Bundle();
        bundle2.putString("filePath", bundle.getString("filePath"));
        bundle2.putBoolean("changed", bundle.getBoolean("changed"));
        bundle2.putBoolean("temp", bundle.getBoolean("temp"));
        bundle2.putInt("sideIconType", bundle.getInt("sideIconType"));
        String string = bundle.getString("remark");
        if (string != null) {
            int iMin = Math.min(string.length(), 512);
            if (iMin > 0 && iMin < string.length() && Character.isHighSurrogate(string.charAt(iMin - 1))) {
                iMin--;
            }
            bundle2.putString("remark", string.substring(0, iMin));
        }
        byte[] bArrM46650 = C20637.m46647(65520, bundle2).m46650(65520);
        C11996 c11996 = new C11996(bArrM46650.length + 16);
        c11996.writeInt(843666245);
        c11996.writeInt(1);
        c11996.m27454(bArrM46650);
        CRC32 crc32 = new CRC32();
        crc32.update(c11996.m27458(), 0, c11996.size());
        c11996.writeInt((int) crc32.getValue());
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097.resolve("app-index.tmp");
        InterfaceC22097 interfaceC22097Resolve2 = interfaceC22097.resolve("app-index");
        if (C18743.exists(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS)) {
            C11920.m27248(interfaceC22097Resolve);
            C18743.delete(interfaceC22097Resolve);
        }
        C5214.m11184(interfaceC22097Resolve, c11996.m27464());
        C18743.move(interfaceC22097Resolve, interfaceC22097Resolve2, EnumC4662.ATOMIC_MOVE, EnumC4662.REPLACE_EXISTING);
        InterfaceC24242.f76829.mo30678(interfaceC22097);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bundle m25680(InterfaceC22097 interfaceC22097) throws IOException {
        int i;
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097.resolve("app-index");
        EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
        if (!C18743.isRegularFile(interfaceC22097Resolve, enumC16060)) {
            throw new IOException("Session startup index is missing");
        }
        long size = C18743.size(interfaceC22097Resolve);
        if (size < 16 || size > 65536) {
            throw new IOException("Invalid session startup index length");
        }
        int i2 = (int) size;
        byte[] bArr = new byte[i2];
        InputStream inputStreamNewInputStream = C18743.newInputStream(interfaceC22097Resolve, enumC16060);
        int i3 = 0;
        while (i3 < i2) {
            try {
                int i4 = inputStreamNewInputStream.read(bArr, i3, i2 - i3);
                if (i4 <= 0) {
                    throw new IOException("Truncated session startup index");
                }
                i3 += i4;
            } catch (Throwable th) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (inputStreamNewInputStream.read() != -1) {
            throw new IOException("Trailing session startup index bytes");
        }
        inputStreamNewInputStream.close();
        C14677 c14677 = new C14677(bArr);
        CRC32 crc32 = new CRC32();
        int i5 = i2 - 4;
        crc32.update(bArr, 0, i5);
        c14677.seek(i5);
        if (c14677.readInt() != ((int) crc32.getValue())) {
            throw new IOException("Invalid session startup index checksum");
        }
        c14677.seek(0L);
        if (c14677.readInt() != 843666245 || c14677.readInt() != 1 || c14677.readInt() != (i = i2 - 16)) {
            throw new IOException("Unsupported session startup index");
        }
        return C20637.m46646(65536, i, new ByteArrayInputStream(bArr, 12, i)).m46652();
    }
}
