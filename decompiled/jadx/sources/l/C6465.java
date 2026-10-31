package l;

import com.alipay.sdk.m.y.q;
import java.text.ParseException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۜۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I52W */
/* JADX INFO: loaded from: classes3.dex */
public final class C6465 extends AbstractC16342 {
    @Override // l.AbstractC16342
    /* JADX INFO: renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    @Override // l.InterfaceC6150
    /* JADX INFO: renamed from: ֫ */
    public final C10384 mo11134(String str) {
        int i;
        boolean z;
        int iIndexOf;
        C10384 c10384 = new C10384();
        c10384.m26198(str);
        if (!m38493(str)) {
            return null;
        }
        String strM38492 = m38492(1);
        String strM38493 = m38492(20);
        String str2 = m38492(21) + " " + m38492(22);
        String strM38494 = m38492(23);
        String strM38495 = m38492(24);
        try {
            c10384.m26185(m38494(str2));
        } catch (ParseException unused) {
        }
        char cCharAt = strM38492.charAt(0);
        if (cCharAt == '-') {
            i = 0;
            z = false;
        } else if (cCharAt != 'l') {
            switch (cCharAt) {
                case 'b':
                case q.f /* 99 */:
                    i = 0;
                    z = true;
                    break;
                case 'd':
                    i = 1;
                    z = false;
                    break;
                case 'e':
                    i = 2;
                    z = false;
                    break;
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                    i = 0;
                    z = false;
                    break;
                default:
                    i = 3;
                    z = false;
                    break;
            }
        } else {
            i = 2;
            z = false;
        }
        c10384.m26181(i);
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 3; i2 < i4; i4 = 3) {
            c10384.m26182(i2, 0, !m38492(i3).equals("-"));
            c10384.m26182(i2, 1, !m38492(i3 + 1).equals("-"));
            String strM38496 = m38492(i3 + 2);
            c10384.m26182(i2, 2, (strM38496.equals("-") || Character.isUpperCase(strM38496.charAt(0))) ? false : true);
            i2++;
            i3 += 4;
        }
        if (!z) {
            try {
                Integer.parseInt("0");
            } catch (NumberFormatException unused2) {
            }
        }
        c10384.m26196(null);
        c10384.m26184((String) null);
        try {
            c10384.m26183(Long.parseLong(strM38493));
        } catch (NumberFormatException unused3) {
        }
        if (strM38495 == null) {
            c10384.m26194(strM38494);
        } else {
            String strM37867 = C16014.m37867(strM38494, strM38495);
            if (i != 2 || (iIndexOf = strM37867.indexOf(" -> ")) == -1) {
                c10384.m26194(strM37867);
            } else {
                c10384.m26194(strM37867.substring(0, iIndexOf));
                c10384.m26191(strM37867.substring(iIndexOf + 4));
            }
        }
        return c10384;
    }
}
