package p067l;

import java.util.Collections;

/* JADX INFO: renamed from: l.ܿۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8QL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18757 extends AbstractC22111 {

    /* JADX INFO: renamed from: ܿ */
    public static final int[] f56041 = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: ۧ */
    public int f56042;

    /* JADX INFO: renamed from: ܽ */
    public boolean f56043;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f56044;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42777(C19203 c19203) throws C8699 {
        if (!this.f56044) {
            int iM43702 = c19203.m43702();
            int i = (iM43702 >> 4) & 15;
            this.f56042 = i;
            InterfaceC20790 interfaceC20790 = this.f69964;
            if (i == 2) {
                int i2 = f56041[(iM43702 >> 2) & 3];
                C3601 c3601 = new C3601();
                c3601.m6694("video/x-flv");
                c3601.m6697("audio/mpeg");
                c3601.m6704(1);
                c3601.m6688(i2);
                interfaceC20790.mo10503(c3601.m6672());
                this.f56043 = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                C3601 c3602 = new C3601();
                c3602.m6694("video/x-flv");
                c3602.m6697(str);
                c3602.m6704(1);
                c3602.m6688(8000);
                interfaceC20790.mo10503(c3602.m6672());
                this.f56043 = true;
            } else if (i != 10) {
                throw new C8699("Audio format not supported: " + this.f56042);
            }
            this.f56044 = true;
            return true;
        }
        c19203.m43724(1);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42776(long j, C19203 c19203) {
        int i = this.f56042;
        InterfaceC20790 interfaceC20790 = this.f69964;
        if (i == 2) {
            int iM43703 = c19203.m43703();
            interfaceC20790.mo10500(iM43703, c19203);
            this.f69964.mo10502(j, 1, iM43703, 0, null);
            return true;
        }
        int iM43702 = c19203.m43702();
        if (iM43702 == 0 && !this.f56043) {
            int iM43704 = c19203.m43703();
            byte[] bArr = new byte[iM43704];
            c19203.m43707(0, iM43704, bArr);
            C14674 c14674M31803 = C14004.m31803(new C17861(bArr, iM43704), false);
            C3601 c3601 = new C3601();
            c3601.m6694("video/x-flv");
            c3601.m6697("audio/mp4a-latm");
            c3601.m6677(c14674M31803.f41889);
            c3601.m6704(c14674M31803.f41888);
            c3601.m6688(c14674M31803.f41890);
            c3601.m6678(Collections.singletonList(bArr));
            interfaceC20790.mo10503(c3601.m6672());
            this.f56043 = true;
            return false;
        }
        if (this.f56042 == 10 && iM43702 != 1) {
            return false;
        }
        int iM43705 = c19203.m43703();
        interfaceC20790.mo10500(iM43705, c19203);
        this.f69964.mo10502(j, 1, iM43705, 0, null);
        return true;
    }
}
