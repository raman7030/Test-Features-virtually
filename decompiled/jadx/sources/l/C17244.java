package l;

import java.util.Collections;

/* JADX INFO: renamed from: l.ܿۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8QL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17244 extends AbstractC20773 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f52858 = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52859;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52860;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52861;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40528(C17714 c17714) throws C6661 {
        if (!this.f52861) {
            int iM41456 = c17714.m41456();
            int i = (iM41456 >> 4) & 15;
            this.f52859 = i;
            InterfaceC19383 interfaceC19383 = this.f67280;
            if (i == 2) {
                int i2 = f52858[(iM41456 >> 2) & 3];
                C1297 c1297 = new C1297();
                c1297.m4462("video/x-flv");
                c1297.m4465("audio/mpeg");
                c1297.m4472(1);
                c1297.m4456(i2);
                interfaceC19383.mo8456(c1297.m4440());
                this.f52860 = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                C1297 c1298 = new C1297();
                c1298.m4462("video/x-flv");
                c1298.m4465(str);
                c1298.m4472(1);
                c1298.m4456(8000);
                interfaceC19383.mo8456(c1298.m4440());
                this.f52860 = true;
            } else if (i != 10) {
                throw new C6661("Audio format not supported: " + this.f52859);
            }
            this.f52861 = true;
            return true;
        }
        c17714.m41478(1);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40527(long j, C17714 c17714) {
        int i = this.f52859;
        InterfaceC19383 interfaceC19383 = this.f67280;
        if (i == 2) {
            int iM41457 = c17714.m41457();
            interfaceC19383.mo8453(iM41457, c17714);
            this.f67280.mo8455(j, 1, iM41457, 0, null);
            return true;
        }
        int iM41456 = c17714.m41456();
        if (iM41456 == 0 && !this.f52860) {
            int iM41458 = c17714.m41457();
            byte[] bArr = new byte[iM41458];
            c17714.m41461(0, iM41458, bArr);
            C12948 c12948M29741 = C12243.m29741(new C16302(bArr, iM41458), false);
            C1297 c1297 = new C1297();
            c1297.m4462("video/x-flv");
            c1297.m4465("audio/mp4a-latm");
            c1297.m4445(c12948M29741.f38845);
            c1297.m4472(c12948M29741.f38844);
            c1297.m4456(c12948M29741.f38846);
            c1297.m4446(Collections.singletonList(bArr));
            interfaceC19383.mo8456(c1297.m4440());
            this.f52860 = true;
            return false;
        }
        if (this.f52859 == 10 && iM41456 != 1) {
            return false;
        }
        int iM41459 = c17714.m41457();
        interfaceC19383.mo8453(iM41459, c17714);
        this.f67280.mo8455(j, 1, iM41459, 0, null);
        return true;
    }
}
