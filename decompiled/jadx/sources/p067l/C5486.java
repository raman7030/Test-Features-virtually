package p067l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6SW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5486 {

    /* JADX INFO: renamed from: ֫ */
    public final Byte f13126;

    /* JADX INFO: renamed from: ۧ */
    public final String f13127;

    /* JADX INFO: renamed from: ܽ */
    public final String f13128;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f13129;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f13130;

    public C5486(boolean z, boolean z2, String str, String str2, Byte b) {
        this.f13129 = z;
        this.f13130 = z2;
        this.f13128 = str;
        this.f13127 = str2;
        this.f13126 = b;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5486 m12122(ByteArrayInputStream byteArrayInputStream, long j, int i) throws IOException {
        Byte bValueOf;
        C25112 c25112M55102 = C25112.m55102(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy search exceeds app state limit");
            }
            boolean zM55109 = c25112M55102.m55109();
            boolean zM551010 = c25112M55102.m55109();
            String strM55114 = c25112M55102.m55114(i);
            String strM55115 = c25112M55102.m55114(i);
            if (c25112M55102.m55113() == 0) {
                bValueOf = null;
            } else {
                if (c25112M55102.m55113() != 3 || c25112M55102.m55110() != 29298) {
                    throw new IOException("Invalid legacy search parameter trailer");
                }
                bValueOf = Byte.valueOf((byte) c25112M55102.readByte());
            }
            c25112M55102.m55115();
            C5486 c5486 = new C5486(zM55109, zM551010, strM55114, strM55115, bValueOf);
            c25112M55102.close();
            return c5486;
        } catch (Throwable th) {
            try {
                c25112M55102.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5486 m12123(C14677 c14677) {
        Byte bValueOf;
        boolean zM33585 = c14677.m33585();
        boolean zM33586 = c14677.m33585();
        String strM33591 = c14677.m33591();
        String strM33592 = c14677.m33591();
        if (c14677.available() < 3 || c14677.m33588() != 29298) {
            bValueOf = null;
        } else {
            c14677.skipBytes(2);
            bValueOf = Byte.valueOf(c14677.readByte());
        }
        return new C5486(zM33585, zM33586, strM33591, strM33592, bValueOf);
    }
}
