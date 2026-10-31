package l;

import com.alipay.sdk.m.y.q;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۘۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5J2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3643 extends AbstractC16342 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f11496 = Pattern.compile("^total \\d+$");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f11497;

    public C3643(C3328 c3328, boolean z) {
        super("([bcdelfmpSs-])(((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-]))((r|-)(w|-)([xsStTL-])))\\+?\\s*(\\d+)\\s+(?:(\\S+(?:\\s\\S+)*?)\\s+)?(?:(\\S+(?:\\s\\S+)*)\\s+)?(\\d+(?:,\\s*\\d+)?)\\s+((?:\\d+[-/]\\d+[-/]\\d+)|(?:\\S{3}\\s+\\d{1,2})|(?:\\d{1,2}\\s+\\S{3})|(?:\\d{1,2}月\\s+\\d{1,2}日))\\s+((?:\\d+(?::\\d+)?)|(?:\\d{4}年))\\s(.*)");
        mo4051(c3328);
        this.f11497 = z;
    }

    @Override // l.AbstractC16342
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3328 mo11133() {
        return new C3328("UNIX", "MMM d yyyy", "MMM d HH:mm");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a8  */
    @Override // l.InterfaceC6150
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
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
        String strM38493 = m38492(15);
        String strM38494 = m38492(16);
        String strM38495 = m38492(17);
        String strM38496 = m38492(18);
        String str2 = m38492(19) + " " + m38492(20);
        String strM38497 = m38492(21);
        if (this.f11497) {
            strM38497 = strM38497.replaceFirst("^\\s+", "");
        }
        try {
            if (m38492(19).contains("月")) {
                C17048 c17048 = new C17048();
                c17048.mo4051(new C3328("UNIX", "M'月' d'日' yyyy'年'", "M'月' d'日' HH:mm"));
                c10384.m26185(c17048.m40018(str2));
            } else {
                c10384.m26185(m38494(str2));
            }
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
            String strM38498 = m38492(i3 + 2);
            c10384.m26182(i2, 2, (strM38498.equals("-") || Character.isUpperCase(strM38498.charAt(0))) ? false : true);
            i2++;
            i3 += 4;
        }
        if (!z) {
            try {
                Integer.parseInt(strM38493);
            } catch (NumberFormatException unused2) {
            }
        }
        c10384.m26196(strM38494);
        c10384.m26184(strM38495);
        try {
            c10384.m26183(Long.parseLong(strM38496));
        } catch (NumberFormatException unused3) {
        }
        if (i != 2 || (iIndexOf = strM38497.indexOf(" -> ")) == -1) {
            c10384.m26194(strM38497);
        } else {
            c10384.m26194(strM38497.substring(0, iIndexOf));
            c10384.m26191(strM38497.substring(iIndexOf + 4));
        }
        return c10384;
    }

    @Override // l.AbstractC11795, l.InterfaceC6150
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List mo11132(LinkedList linkedList) {
        C5378.removeIf(linkedList, new C23159(1));
        return linkedList;
    }
}
