package p067l;

/* JADX INFO: renamed from: l.ۜ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8HG */
/* JADX INFO: loaded from: classes2.dex */
public final class C9034 {
    /* JADX INFO: renamed from: ֫ */
    public static void m20904(long j, C19203 c19203, InterfaceC20790[] interfaceC20790Arr) {
        int i;
        int iM43702;
        while (true) {
            if (c19203.m43703() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (c19203.m43703() == 0) {
                    i = -1;
                    break;
                }
                int iM43703 = c19203.m43702();
                i2 += iM43703;
                if (iM43703 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (c19203.m43703() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iM43702 = c19203.m43702();
                    i3 += iM43702;
                }
            } while (iM43702 == 255);
            int iM43731 = c19203.m43731() + i3;
            if (i3 == -1 || i3 > c19203.m43703()) {
                C21334.m48351("Skipping remainder of malformed SEI NAL unit.");
                iM43731 = c19203.m43729();
            } else if (i == 4 && i3 >= 8) {
                int iM43704 = c19203.m43702();
                int iM43710 = c19203.m43710();
                int iM43739 = iM43710 == 49 ? c19203.m43739() : 0;
                int iM43705 = c19203.m43702();
                if (iM43710 == 47) {
                    c19203.m43724(1);
                }
                boolean z = iM43704 == 181 && (iM43710 == 49 || iM43710 == 47) && iM43705 == 3;
                if (iM43710 == 49) {
                    z &= iM43739 == 1195456820;
                }
                if (z) {
                    m20905(j, c19203, interfaceC20790Arr);
                }
            }
            c19203.m43730(iM43731);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m20905(long j, C19203 c19203, InterfaceC20790[] interfaceC20790Arr) {
        int iM43702 = c19203.m43702();
        if ((iM43702 & 64) != 0) {
            c19203.m43724(1);
            int i = (iM43702 & 31) * 3;
            int iM43731 = c19203.m43731();
            for (InterfaceC20790 interfaceC20790 : interfaceC20790Arr) {
                c19203.m43730(iM43731);
                interfaceC20790.mo10500(i, c19203);
                C23877.m52960(j != -9223372036854775807L);
                interfaceC20790.mo10502(j, 1, i, 0, null);
            }
        }
    }
}
