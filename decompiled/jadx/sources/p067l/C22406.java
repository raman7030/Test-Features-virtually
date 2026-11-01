package p067l;

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
public final class C22406 implements InterfaceC11657 {

    /* JADX INFO: renamed from: ܿ */
    public static final Pattern f70679 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f70680 = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: ܽ */
    public final StringBuilder f70683 = new StringBuilder();

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f70682 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f70681 = new C19203();

    @Override // p067l.InterfaceC11657
    public final /* synthetic */ void reset() {
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC15266 mo8743(int i, int i2, byte[] bArr) {
        return C16349.m37149(this, bArr, i2);
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final void mo8744(byte[] bArr, int i, int i2, C22386 c22386, InterfaceC24686 interfaceC24686) {
        InterfaceC24686 interfaceC24687;
        String str;
        C22406 c22406 = this;
        InterfaceC24686 interfaceC24688 = interfaceC24686;
        long j = c22386.f70618;
        C19203 c19203 = c22406.f70681;
        c19203.m43708(i + i2, bArr);
        c19203.m43730(i);
        Charset charsetM43721 = c19203.m43721();
        if (charsetM43721 == null) {
            charsetM43721 = StandardCharsets.UTF_8;
        }
        ArrayList arrayList = (j == -9223372036854775807L || !c22386.f70617) ? null : new ArrayList();
        while (true) {
            String strM43720 = c19203.m43720(charsetM43721);
            if (strM43720 == null) {
                break;
            }
            if (strM43720.isEmpty()) {
                interfaceC24687 = interfaceC24688;
            } else {
                try {
                    Integer.parseInt(strM43720);
                    String strM43721 = c19203.m43720(charsetM43721);
                    if (strM43721 == null) {
                        C21334.m48351("Unexpected end");
                        break;
                    }
                    Matcher matcher = f70679.matcher(strM43721);
                    if (matcher.matches()) {
                        long jM50312 = m50312(matcher, 1);
                        long jM50313 = m50312(matcher, 6);
                        StringBuilder sb = c22406.f70683;
                        sb.setLength(0);
                        ArrayList arrayList2 = c22406.f70682;
                        arrayList2.clear();
                        for (String strM43722 = c19203.m43720(charsetM43721); !TextUtils.isEmpty(strM43722); strM43722 = c19203.m43720(charsetM43721)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strM43722.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f70680.matcher(strTrim);
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
                                jM50312 = jM50312;
                            }
                            sb.append(sb2.toString());
                        }
                        long j2 = jM50312;
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
                        if (j == -9223372036854775807L || jM50313 >= j) {
                            C14596 c14596 = new C14596(j2, jM50313 - j2, AbstractC16192.m36873of((Object) m50313(spannedFromHtml, str)));
                            interfaceC24687 = interfaceC24686;
                            interfaceC24687.accept(c14596);
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new C14596(j2, jM50313 - j2, AbstractC16192.m36873of((Object) m50313(spannedFromHtml, str))));
                            }
                            interfaceC24687 = interfaceC24686;
                        }
                    } else {
                        interfaceC24687 = interfaceC24688;
                        C21334.m48351("Skipping invalid timing: ".concat(strM43721));
                    }
                } catch (NumberFormatException unused) {
                    interfaceC24687 = interfaceC24688;
                    C21334.m48351("Skipping invalid index: ".concat(strM43720));
                }
            }
            interfaceC24688 = interfaceC24687;
            c22406 = this;
        }
        InterfaceC24686 interfaceC24689 = interfaceC24688;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC24689.accept((C14596) it.next());
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
    /* JADX INFO: renamed from: ֫ */
    public static C21196 m50313(Spanned spanned, String str) {
        float f;
        C23207 c23207 = new C23207();
        c23207.m51726(spanned);
        if (str == null) {
            return c23207.m51720();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c23207.m51730(0);
                } else {
                    c23207.m51730(1);
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                c23207.m51730(1);
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c23207.m51730(2);
                } else {
                    c23207.m51730(1);
                }
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c23207.m51730(0);
                } else {
                    c23207.m51730(1);
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                c23207.m51730(1);
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c23207.m51730(2);
                } else {
                    c23207.m51730(1);
                }
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c23207.m51730(0);
                } else {
                    c23207.m51730(1);
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                c23207.m51730(1);
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c23207.m51730(2);
                } else {
                    c23207.m51730(1);
                }
                break;
            default:
                c23207.m51730(1);
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c23207.m51723(2);
                } else {
                    c23207.m51723(1);
                }
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c23207.m51723(2);
                } else {
                    c23207.m51723(1);
                }
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c23207.m51723(2);
                } else {
                    c23207.m51723(1);
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                c23207.m51723(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                c23207.m51723(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                c23207.m51723(1);
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c23207.m51723(0);
                } else {
                    c23207.m51723(1);
                }
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c23207.m51723(0);
                } else {
                    c23207.m51723(1);
                }
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c23207.m51723(0);
                } else {
                    c23207.m51723(1);
                }
                break;
            default:
                c23207.m51723(1);
                break;
        }
        int iM51737 = c23207.m51737();
        float f2 = 0.08f;
        if (iM51737 == 0) {
            f = 0.08f;
        } else if (iM51737 == 1) {
            f = 0.5f;
        } else {
            if (iM51737 != 2) {
                throw new IllegalArgumentException();
            }
            f = 0.92f;
        }
        c23207.m51728(f);
        int iM51732 = c23207.m51732();
        if (iM51732 != 0) {
            if (iM51732 == 1) {
                f2 = 0.5f;
            } else {
                if (iM51732 != 2) {
                    throw new IllegalArgumentException();
                }
                f2 = 0.92f;
            }
        }
        c23207.m51722(f2, 0);
        return c23207.m51720();
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m50312(Matcher matcher, int i) {
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
