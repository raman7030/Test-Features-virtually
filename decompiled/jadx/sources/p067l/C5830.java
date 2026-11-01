package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5J2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5830 extends AbstractC17899 {

    /* JADX INFO: renamed from: ܳ */
    public static final Pattern f14302 = Pattern.compile("^total \\d+$");

    /* JADX INFO: renamed from: ܿ */
    public final boolean f14303;

    public C5830(C5531 c5531, boolean z) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)");
        mo6295(c5531);
        this.f14303 = z;
    }

    @Override // p067l.AbstractC17899
    /* JADX INFO: renamed from: ֫ */
    public final C5531 mo13109() {
        return new C5531("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
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
        String strM40709 = m40708(15);
        String strM407010 = m40708(16);
        String strM407011 = m40708(17);
        String strM407012 = m40708(18);
        String str2 = m40708(19) + " " + m40708(20);
        String strM407013 = m40708(21);
        if (this.f14303) {
            strM407013 = strM407013.replaceFirst("^\\s+", "");
        }
        try {
            if (m40708(19).contains("月")) {
                C18570 c18570 = new C18570();
                c18570.mo6295(new C5531("UNIX", "M'月' d'日' yyyy'年'", "M'月' d'日' HH:mm"));
                c12237.m28214(c18570.m42263(str2));
            } else {
                c12237.m28214(m40710(str2));
            }
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
            String strM407014 = m40708(i3 + 2);
            c12237.m28211(i2, 2, (strM407014.equals("-") || Character.isUpperCase(strM407014.charAt(0))) ? false : true);
            i2++;
            i3 += 4;
        }
        if (!z) {
            try {
                Integer.parseInt(strM40709);
            } catch (NumberFormatException unused2) {
            }
        }
        c12237.m28225(strM407010);
        c12237.m28213(strM407011);
        try {
            c12237.m28212(Long.parseLong(strM407012));
        } catch (NumberFormatException unused3) {
        }
        if (i != 2 || (iIndexOf = strM407013.indexOf(" -> ")) == -1) {
            c12237.m28223(strM407013);
        } else {
            c12237.m28223(strM407013.substring(0, iIndexOf));
            c12237.m28220(strM407013.substring(iIndexOf + 4));
        }
        return c12237;
    }

    @Override // p067l.AbstractC13578, p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final List mo13108(LinkedList linkedList) {
        C7480.removeIf(linkedList, new C24379(1));
        return linkedList;
    }
}
