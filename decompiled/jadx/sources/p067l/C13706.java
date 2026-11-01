package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1TU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13706 {
    /* JADX INFO: renamed from: ֫ */
    public static void m31160(C14677 c14677, InterfaceC8341 interfaceC8341) throws IOException {
        C23395.m52060((InterfaceC21384) c14677, 67263238);
        if (c14677.available() < 13) {
            throw new IOException("Bad mapping file");
        }
        c14677.skipBytes((int) (c14677.available() - 8));
        int i = c14677.readInt();
        C23395.m52060((InterfaceC21384) c14677, 67263238);
        c14677.seek(i);
        int i2 = c14677.readInt();
        C13683 c13683 = new C13683(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            c13683.m31085(i3, c14677.m33591());
        }
        c14677.seek(4L);
        while (true) {
            int i4 = c14677.readByte() & 255;
            if (i4 == 0) {
                return;
            }
            if (i4 == 1) {
                interfaceC8341.mo9631((String) c13683.m31084(c14677.readInt()), (String) c13683.m31084(c14677.readInt()));
            } else if (i4 == 2) {
                interfaceC8341.mo9633((String) c13683.m31084(c14677.readInt()), (String) c13683.m31084(c14677.readInt()), (String) c13683.m31084(c14677.readInt()));
            } else if (i4 == 3) {
                interfaceC8341.mo9632((String) c13683.m31084(c14677.readInt()), (String) c13683.m31084(c14677.readInt()), (String) c13683.m31084(c14677.readInt()));
            }
        }
    }
}
