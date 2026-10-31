package l;

import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۢ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6RT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9240 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23681(InterfaceC20758 interfaceC20758, Bundle bundle) throws IOException {
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
        byte[] bArrM44356 = C19222.m44353(65520, bundle2).m44356(65520);
        C10130 c10130 = new C10130(bArrM44356.length + 16);
        c10130.writeInt(843666245);
        c10130.writeInt(1);
        c10130.m25434(bArrM44356);
        CRC32 crc32 = new CRC32();
        crc32.update(c10130.m25438(), 0, c10130.size());
        c10130.writeInt((int) crc32.getValue());
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758.resolve("app-index.tmp");
        InterfaceC20758 interfaceC20758Resolve2 = interfaceC20758.resolve("app-index");
        if (C17229.exists(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS)) {
            C10050.m25231(interfaceC20758Resolve);
            C17229.delete(interfaceC20758Resolve);
        }
        C2994.m9133(interfaceC20758Resolve, c10130.m25444());
        C17229.move(interfaceC20758Resolve, interfaceC20758Resolve2, EnumC2413.ATOMIC_MOVE, EnumC2413.REPLACE_EXISTING);
        InterfaceC23015.f74090.mo28630(interfaceC20758);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m23680(InterfaceC20758 interfaceC20758) throws IOException {
        int i;
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758.resolve("app-index");
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (!C17229.isRegularFile(interfaceC20758Resolve, enumC14406)) {
            throw new IOException("Session startup index is missing");
        }
        long size = C17229.size(interfaceC20758Resolve);
        if (size < 16 || size > 65536) {
            throw new IOException("Invalid session startup index length");
        }
        int i2 = (int) size;
        byte[] bArr = new byte[i2];
        InputStream inputStreamNewInputStream = C17229.newInputStream(interfaceC20758Resolve, enumC14406);
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
        C12951 c12951 = new C12951(bArr);
        CRC32 crc32 = new CRC32();
        int i5 = i2 - 4;
        crc32.update(bArr, 0, i5);
        c12951.seek(i5);
        if (c12951.readInt() != ((int) crc32.getValue())) {
            throw new IOException("Invalid session startup index checksum");
        }
        c12951.seek(0L);
        if (c12951.readInt() != 843666245 || c12951.readInt() != 1 || c12951.readInt() != (i = i2 - 16)) {
            throw new IOException("Unsupported session startup index");
        }
        return C19222.m44352(65536, i, new ByteArrayInputStream(bArr, 12, i)).m44358();
    }
}
