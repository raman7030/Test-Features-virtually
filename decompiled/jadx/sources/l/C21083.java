package l;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8TO */
/* JADX INFO: loaded from: classes5.dex */
public final class C21083 implements InterfaceC9773 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f67997 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f67998 = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f68001 = new StringBuilder();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f68000 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f67999 = new C17714();

    @Override // l.InterfaceC9773
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        return C14710.m35002(this, bArr, i2);
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫ */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        InterfaceC23483 interfaceC23484;
        String str;
        C21083 c21083 = this;
        InterfaceC23483 interfaceC23485 = interfaceC23483;
        long j = c21062.f67934;
        C17714 c17714 = c21083.f67999;
        c17714.m41462(i + i2, bArr);
        c17714.m41484(i);
        Charset charsetM41475 = c17714.m41475();
        if (charsetM41475 == null) {
            charsetM41475 = StandardCharsets.UTF_8;
        }
        ArrayList arrayList = (j == -9223372036854775807L || !c21062.f67933) ? null : new ArrayList();
        while (true) {
            String strM41474 = c17714.m41474(charsetM41475);
            if (strM41474 == null) {
                break;
            }
            if (strM41474.isEmpty()) {
                interfaceC23484 = interfaceC23485;
            } else {
                try {
                    Integer.parseInt(strM41474);
                    String strM41475 = c17714.m41474(charsetM41475);
                    if (strM41475 == null) {
                        C19956.m46037("Unexpected end");
                        break;
                    }
                    Matcher matcher = f67997.matcher(strM41475);
                    if (matcher.matches()) {
                        long jM47982 = m47982(matcher, 1);
                        long jM47983 = m47982(matcher, 6);
                        StringBuilder sb = c21083.f68001;
                        sb.setLength(0);
                        ArrayList arrayList2 = c21083.f68000;
                        arrayList2.clear();
                        for (String strM41476 = c17714.m41474(charsetM41475); !TextUtils.isEmpty(strM41476); strM41476 = c17714.m41474(charsetM41475)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strM41476.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f67998.matcher(strTrim);
                            int i3 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                Matcher matcher3 = matcher2;
                                int iStart = matcher2.start() - i3;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i3 += length;
                                matcher2 = matcher3;
                                jM47982 = jM47982;
                            }
                            sb.append(sb2.toString());
                        }
                        long j2 = jM47982;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i4);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (j == -9223372036854775807L || jM47983 >= j) {
                            C12866 c12866 = new C12866(j2, jM47983 - j2, AbstractC14545.of((Object) m47983(spannedFromHtml, str)));
                            interfaceC23484 = interfaceC23483;
                            interfaceC23484.accept(c12866);
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new C12866(j2, jM47983 - j2, AbstractC14545.of((Object) m47983(spannedFromHtml, str))));
                            }
                            interfaceC23484 = interfaceC23483;
                        }
                    } else {
                        interfaceC23484 = interfaceC23485;
                        C19956.m46037("Skipping invalid timing: ".concat(strM41475));
                    }
                } catch (NumberFormatException unused) {
                    interfaceC23484 = interfaceC23485;
                    C19956.m46037("Skipping invalid index: ".concat(strM41474));
                }
            }
            interfaceC23485 = interfaceC23484;
            c21083 = this;
        }
        InterfaceC23483 interfaceC23486 = interfaceC23485;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC23486.accept((C12866) it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19811 m47983(Spanned spanned, String str) {
        float f;
        C21927 c21927 = new C21927();
        c21927.m49389(spanned);
        if (str == null) {
            return c21927.m49383();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c21927.m49393(0);
                } else {
                    c21927.m49393(1);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                c21927.m49393(1);
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c21927.m49393(2);
                } else {
                    c21927.m49393(1);
                }
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c21927.m49393(0);
                } else {
                    c21927.m49393(1);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                c21927.m49393(1);
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c21927.m49393(2);
                } else {
                    c21927.m49393(1);
                }
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c21927.m49393(0);
                } else {
                    c21927.m49393(1);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                c21927.m49393(1);
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c21927.m49393(2);
                } else {
                    c21927.m49393(1);
                }
                break;
            default:
                c21927.m49393(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c21927.m49386(2);
                } else {
                    c21927.m49386(1);
                }
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c21927.m49386(2);
                } else {
                    c21927.m49386(1);
                }
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c21927.m49386(2);
                } else {
                    c21927.m49386(1);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                c21927.m49386(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                c21927.m49386(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                c21927.m49386(1);
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c21927.m49386(0);
                } else {
                    c21927.m49386(1);
                }
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c21927.m49386(0);
                } else {
                    c21927.m49386(1);
                }
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c21927.m49386(0);
                } else {
                    c21927.m49386(1);
                }
                break;
            default:
                c21927.m49386(1);
                break;
        }
        int iM49400 = c21927.m49400();
        float f2 = 0.08f;
        if (iM49400 == 0) {
            f = 0.08f;
        } else if (iM49400 == 1) {
            f = 0.5f;
        } else {
            if (iM49400 != 2) {
                throw new IllegalArgumentException();
            }
            f = 0.92f;
        }
        c21927.m49391(f);
        int iM49395 = c21927.m49395();
        if (iM49395 != 0) {
            if (iM49395 == 1) {
                f2 = 0.5f;
            } else {
                if (iM49395 != 2) {
                    throw new IllegalArgumentException();
                }
                f2 = 0.92f;
            }
        }
        c21927.m49385(f2, 0);
        return c21927.m49383();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m47982(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }
}
