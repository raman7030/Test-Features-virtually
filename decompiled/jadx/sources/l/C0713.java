package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes3.dex */
public class C0713 extends AbstractC22366 {

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2686 = 0;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f2687;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public long f2688;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public String f2690;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public C21818 f2692;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public Collection f2695;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C18090 f2696;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C1764 f2694 = new C1764();

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f2693 = new ArrayList();

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public HashSet f2689 = new HashSet();

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public HashSet f2691 = new HashSet();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76967;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11517("zipPath"));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws IOException {
        HashMap map;
        HashSet hashSet;
        C15313 c15313;
        String strM50967;
        C1764 c1764;
        C15313 c15314;
        String str;
        C0713 c0713;
        C15313 c15315;
        InputStream inputStreamMo27926;
        String str2;
        C1764 c1765;
        HashSet hashSet2;
        C0713 c0714 = this;
        AbstractC15440 abstractC15440M11515 = c0714.m11515("zipPath");
        String[] strArrM11558 = c0714.m11558("ARG_PATHS");
        c0714.f2690 = c0714.m11556("rename");
        int iM11548 = c0714.m11548("level");
        int iM11549 = c0714.m11548("update");
        boolean zM11552 = c0714.m11552("deleteSources");
        String strM11556 = c0714.m11556("basePath");
        C11667 c11667M11533 = m11533();
        boolean zM11553 = c0714.m11552("keepApkSigBlock");
        C17721.m41504(abstractC15440M11515, EnumC16309.MODIFY_FILE);
        C19059 c19059 = new C19059(c0714);
        C1764 c1766 = c0714.f2694;
        c1766.m5892(strArrM11558, false, c19059);
        if (mo1526()) {
            return C17222.m40521();
        }
        C18090 c18090 = new C18090(abstractC15440M11515);
        c0714.f2696 = c18090;
        c0714.f2695 = c18090.m42210();
        C21818 c21818M50499 = C22523.m50499(abstractC15440M11515, c11667M11533 != null);
        c0714.f2692 = c21818M50499;
        C8918 c8918M49176 = c21818M50499.m49176();
        if (c11667M11533 == null && zM11553 && c0714.f2696.m42201()) {
            c8918M49176.m23016(c0714.f2696);
        }
        if (c0714.f2696.m42212()) {
            c8918M49176.m23025();
        }
        boolean zM9487 = AbstractDialogInterfaceOnClickListenerC3113.m9487(iM11548, c8918M49176);
        C15313 c15316 = new C15313();
        if (zM9487) {
            c15316.m36337(c0714.f2696);
        }
        HashSet hashSet3 = c0714.f2691;
        if (zM11552) {
            hashSet3.add(abstractC15440M11515);
        }
        C8918 c8918M49177 = c0714.f2692.m49176();
        if (iM11549 == 0) {
            map = null;
        } else {
            map = new HashMap();
            for (Iterator it = c0714.f2695.iterator(); it.hasNext(); it = it) {
                C3545 c3545 = (C3545) it.next();
                if (!c3545.isDirectory()) {
                    map.put(c3545.getName(), c3545);
                }
            }
        }
        String str3 = c0714.f2690;
        Iterator it2 = c1766.f6117.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            strArrM11558 = strArrM11558;
            hashSet = c0714.f2689;
            zM11552 = zM11552;
            abstractC15440M11515 = abstractC15440M11515;
            c11667M11533 = c11667M11533;
            if (!zHasNext) {
                break;
            }
            it2 = it2;
            C7469 c7469 = (C7469) it2.next();
            if (mo1526()) {
                break;
            }
            c1766.m5895();
            c8918M49176 = c8918M49176;
            String strM46305 = c7469.f22995;
            AbstractC15440 abstractC15440 = c7469.f22994;
            long j = c7469.f22997;
            C1764 c1767 = c1766;
            HashSet hashSet4 = hashSet3;
            long j2 = c7469.f23003;
            if (str3.isEmpty()) {
                c15313 = c15316;
            } else {
                int iIndexOf = strM46305.indexOf(47);
                c15313 = c15316;
                strM46305 = iIndexOf == -1 ? str3 : C20087.m46305(iIndexOf, strM46305, C5368.m15339(str3));
            }
            if (c7469.f23002) {
                strM50967 = C22870.m50967(strM11556, strM46305, "/");
                C3545 c3546 = new C3545(strM50967);
                c3546.setTime(j);
                c8918M49177.m23013(c3546);
                c1764 = c1767;
                c15314 = c15313;
                str = strM11556;
                c0713 = this;
            } else {
                String strM37867 = C16014.m37867(strM11556, strM46305);
                try {
                    if (iM11549 != 0) {
                        C11003.requireNonNull(map);
                        C3545 c3547 = (C3545) map.get(strM37867);
                        if (c3547 != null) {
                            if (iM11549 != 1) {
                                c1765 = c1767;
                                hashSet2 = hashSet4;
                                c1765.m5890(j2);
                                hashSet2.add(abstractC15440);
                            } else if (c3547.getTime() >= abstractC15440.mo23117()) {
                                c1765 = c1767;
                                c1765.m5890(j2);
                                hashSet2 = hashSet4;
                                hashSet2.add(abstractC15440);
                            }
                            c0714 = this;
                            c1766 = c1765;
                            hashSet3 = hashSet2;
                            c15316 = c15313;
                        }
                    }
                    C3545 c3548 = new C3545(strM37867);
                    c3548.m10805(j2);
                    c3548.setTime(j);
                    c8918M49177.m23013(c3548);
                    byte[] bArr = new byte[4096];
                    long j3 = 0;
                    while (true) {
                        int i = inputStreamMo27926.read(bArr);
                        if (i <= 0) {
                            str2 = strM37867;
                            str = strM11556;
                            c8918M49177.m23023();
                            break;
                        }
                        str2 = strM37867;
                        c8918M49177.write(bArr, 0, i);
                        byte[] bArr2 = bArr;
                        long j4 = j3 + ((long) i);
                        str = strM11556;
                        c0713.m50130(j4, c3548.getSize());
                        c0713.m11541(c1764.m5893() + j4, c1764.m5896());
                        if (mo1526()) {
                            break;
                        }
                        strM37867 = str2;
                        strM11556 = str;
                        bArr = bArr2;
                        j3 = j4;
                    }
                    inputStreamMo27926.close();
                    c1764.m5890(j2);
                    strM50967 = str2;
                } catch (Throwable th) {
                    if (inputStreamMo27926 == null) {
                        throw th;
                    }
                    try {
                        inputStreamMo27926.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                c1764 = c1767;
                if (zM9487) {
                    c15315 = c15313;
                    c8918M49177.m23018(C21665.m48934(strM37867, c15315));
                } else {
                    c15315 = c15313;
                }
                StringBuilder sb = new StringBuilder();
                c15314 = c15315;
                sb.append(C4925.m14327(R.string.MT_Protector));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                sb.append(c1764.m5889());
                sb.append("/");
                sb.append(c1764.m5894());
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                String string = sb.toString();
                c0713 = this;
                c0713.mo11546(string);
                c0713.mo11520(strM37867);
                inputStreamMo27926 = abstractC15440.mo27926();
            }
            hashSet.add(strM50967);
            if (!hashSet4.contains(abstractC15440)) {
                c0713.f2687++;
            }
            if (strM46305.indexOf(47) == -1) {
                c0713.f2693.add(strM46305);
            }
            c0714 = c0713;
            c1766 = c1764;
            hashSet3 = hashSet4;
            zM9487 = zM9487;
            iM11549 = iM11549;
            strM11556 = str;
            c15316 = c15314;
        }
        C0713 c0715 = c0714;
        C8918 c8918 = c8918M49176;
        if (mo1526()) {
            return C17222.m40521();
        }
        C8918 c8918M49178 = c0715.f2692.m49176();
        C19765 c19765 = new C19765(c0715, C22523.m50496(c0715.f2695));
        int i2 = 0;
        for (C3545 c3549 : c0715.f2695) {
            if (mo1526()) {
                break;
            }
            i2++;
            if (!hashSet.contains(c3549.getName())) {
                c0715.mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i2 + "/" + c0715.f2695.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                c0715.mo11520(c3549.getName());
                if (c3549.isDirectory()) {
                    c8918M49178.m23013(c3549);
                } else {
                    C22523.m50503(c3549, c0715.f2696, c8918M49178, c19765);
                    c0715.f2688 = c3549.m10793() + c0715.f2688;
                }
            } else if (!c3549.isDirectory()) {
                c0715.f2688 = c3549.m10793() + c0715.f2688;
            }
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        c8918.close();
        if (c11667M11533 != null) {
            C10025.m25200(c0715.f2692, c11667M11533, c0715);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        C18838.m43524(abstractC15440M11515);
        C17558 c17558 = new C17558();
        c17558.m41050(abstractC15440M11515);
        c0715.f2692.m49175(abstractC15440M11515, new RunnableC11377(c0715, abstractC15440M11515, 1), c0715.f2696);
        c17558.m41052(abstractC15440M11515);
        if (zM11552) {
            boolean z = c0715.f2687 > 1;
            if (z) {
                c0715.m11536(R.string.MT_Protector);
                c0715.mo11538(0);
                c0715.m50129(0);
            }
            for (String str4 : strArrM11558) {
                AbstractC15440 abstractC15440M39866 = C16999.m39866(str4, new String[0]);
                EnumC16580 enumC16580M39083 = EnumC16580.m39083(abstractC15440M39866.mo23113());
                if (z && abstractC15440M39866.mo23113() && !abstractC15440M39866.m36533()) {
                    c0715.mo11520(abstractC15440M39866.getName());
                }
                if (c0715.m2800(abstractC15440M39866, z)) {
                    enumC16580M39083.m39085(str4);
                }
            }
        }
        return C17222.m40520();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m2800(AbstractC15440 abstractC15440, boolean z) {
        if (abstractC15440.mo23113() && !abstractC15440.m36533()) {
            boolean z2 = true;
            Iterator it = abstractC15440.mo23549(true).iterator();
            while (it.hasNext()) {
                if (!m2800((AbstractC15440) it.next(), z)) {
                    z2 = false;
                }
            }
            if (z2) {
                if (z) {
                    mo11520(abstractC15440.getName());
                }
                return abstractC15440.mo27929();
            }
        } else if (!this.f2691.contains(abstractC15440)) {
            if (z) {
                mo11520(abstractC15440.getName());
            }
            return abstractC15440.mo27929();
        }
        return false;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526()) {
            if (m11542(c16560)) {
                c16560.m39041();
            }
            if (m11525(c16561)) {
                c16561.m39000((Collection) this.f2693);
                c16561.m39015();
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C21818 c21818;
        if (!c17222.m40526() && (c21818 = this.f2692) != null) {
            C0349.m1793(c21818.m49176());
            this.f2692.m49174().mo23552();
        }
        C0349.m1793(this.f2696);
        C15528.m36596();
    }
}
