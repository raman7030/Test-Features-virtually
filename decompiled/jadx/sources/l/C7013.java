package l;

/* JADX INFO: renamed from: l.ۜ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8HG */
/* JADX INFO: loaded from: classes2.dex */
public final class C7013 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18947(long j, C17714 c17714, InterfaceC19383[] interfaceC19383Arr) {
        int i;
        int iM41456;
        while (true) {
            if (c17714.m41457() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (c17714.m41457() == 0) {
                    i = -1;
                    break;
                }
                int iM41457 = c17714.m41456();
                i2 += iM41457;
                if (iM41457 != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            do {
                if (c17714.m41457() == 0) {
                    i3 = -1;
                    break;
                } else {
                    iM41456 = c17714.m41456();
                    i3 += iM41456;
                }
            } while (iM41456 == 255);
            int iM41485 = c17714.m41485() + i3;
            if (i3 == -1 || i3 > c17714.m41457()) {
                C19956.m46037("Skipping remainder of malformed SEI NAL unit.");
                iM41485 = c17714.m41483();
            } else if (i == 4 && i3 >= 8) {
                int iM41458 = c17714.m41456();
                int iM41464 = c17714.m41464();
                int iM41493 = iM41464 == 49 ? c17714.m41493() : 0;
                int iM41459 = c17714.m41456();
                if (iM41464 == 47) {
                    c17714.m41478(1);
                }
                boolean z = iM41458 == 181 && (iM41464 == 49 || iM41464 == 47) && iM41459 == 3;
                if (iM41464 == 49) {
                    z &= iM41493 == 1195456820;
                }
                if (z) {
                    m18948(j, c17714, interfaceC19383Arr);
                }
            }
            c17714.m41484(iM41485);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18948(long j, C17714 c17714, InterfaceC19383[] interfaceC19383Arr) {
        int iM41456 = c17714.m41456();
        if ((iM41456 & 64) != 0) {
            c17714.m41478(1);
            int i = (iM41456 & 31) * 3;
            int iM41485 = c17714.m41485();
            for (InterfaceC19383 interfaceC19383 : interfaceC19383Arr) {
                c17714.m41484(iM41485);
                interfaceC19383.mo8453(i, c17714);
                C22632.m50634(j != -9223372036854775807L);
                interfaceC19383.mo8455(j, 1, i, 0, null);
            }
        }
    }
}
