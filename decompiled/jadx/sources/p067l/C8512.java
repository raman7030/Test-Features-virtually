package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.text.ParseException;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۜۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I52W */
/* JADX INFO: loaded from: classes3.dex */
public final class C8512 extends AbstractC17899 {
    @Override // p067l.AbstractC17899
    /* JADX INFO: renamed from: ֫ */
    public final C5531 mo13109() {
        return new C5531("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    @Override // p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final C12237 mo13110(String str) {
        int i;
        boolean z;
        int iIndexOf;
        C12237 c12237 = new C12237();
        c12237.m28227(str);
        if (!m40709(str)) {
            return null;
        }
        String strM40708 = m40708(1);
        String strM40709 = m40708(20);
        String str2 = m40708(21) + " " + m40708(22);
        String strM407010 = m40708(23);
        String strM407011 = m40708(24);
        try {
            c12237.m28214(m40710(str2));
        } catch (ParseException unused) {
        }
        char cCharAt = strM40708.charAt(0);
        if (cCharAt == '-') {
            i = 0;
            z = false;
        } else if (cCharAt != 'l') {
            switch (cCharAt) {
                case 'b':
                case C0254q.f1216f /* 99 */:
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
        c12237.m28210(i);
        int i2 = 0;
        int i3 = 4;
        for (int i4 = 3; i2 < i4; i4 = 3) {
            c12237.m28211(i2, 0, !m40708(i3).equals("-"));
            c12237.m28211(i2, 1, !m40708(i3 + 1).equals("-"));
            String strM407012 = m40708(i3 + 2);
            c12237.m28211(i2, 2, (strM407012.equals("-") || Character.isUpperCase(strM407012.charAt(0))) ? false : true);
            i2++;
            i3 += 4;
        }
        if (!z) {
            try {
                Integer.parseInt("0");
            } catch (NumberFormatException unused2) {
            }
        }
        c12237.m28225(null);
        c12237.m28213((String) null);
        try {
            c12237.m28212(Long.parseLong(strM40709));
        } catch (NumberFormatException unused3) {
        }
        if (strM407011 == null) {
            c12237.m28223(strM407010);
        } else {
            String strM40053 = C17588.m40053(strM407010, strM407011);
            if (i != 2 || (iIndexOf = strM40053.indexOf(" -> ")) == -1) {
                c12237.m28223(strM40053);
            } else {
                c12237.m28223(strM40053.substring(0, iIndexOf));
                c12237.m28220(strM40053.substring(iIndexOf + 4));
            }
        }
        return c12237;
    }
}
