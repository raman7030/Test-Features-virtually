package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1TU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11929 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29107(C12951 c12951, InterfaceC6284 interfaceC6284) throws IOException {
        C22124.m49722((InterfaceC20008) c12951, 67263238);
        if (c12951.available() < 13) {
            throw new IOException("Bad mapping file");
        }
        c12951.skipBytes((int) (c12951.available() - 8));
        int i = c12951.readInt();
        C22124.m49722((InterfaceC20008) c12951, 67263238);
        c12951.seek(i);
        int i2 = c12951.readInt();
        C11905 c11905 = new C11905(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            c11905.m29033(i3, c12951.m31504());
        }
        c12951.seek(4L);
        while (true) {
            int i4 = c12951.readByte() & 255;
            if (i4 == 0) {
                return;
            }
            if (i4 == 1) {
                interfaceC6284.mo7563((String) c11905.m29032(c12951.readInt()), (String) c11905.m29032(c12951.readInt()));
            } else if (i4 == 2) {
                interfaceC6284.mo7565((String) c11905.m29032(c12951.readInt()), (String) c11905.m29032(c12951.readInt()), (String) c11905.m29032(c12951.readInt()));
            } else if (i4 == 3) {
                interfaceC6284.mo7564((String) c11905.m29032(c12951.readInt()), (String) c11905.m29032(c12951.readInt()), (String) c11905.m29032(c12951.readInt()));
            }
        }
    }
}
