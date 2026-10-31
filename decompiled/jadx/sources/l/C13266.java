package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes4.dex */
public class C13266 extends AbstractC20250 {

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39727 = 0;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f39728;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C21818 f39729;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public C11339 f39730 = new C11339();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo23259("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws Exception {
        ArrayList arrayList;
        C18090 c18090;
        Throwable th;
        C18090 c18091;
        byte[] bArr;
        C18090 c18092;
        C19277 c19277;
        String[] strArrM11558 = m11558("ARG_PATHS");
        AbstractC15440 abstractC15440M36535 = C16293.f50111.m36535("");
        this.f39728 = abstractC15440M36535;
        abstractC15440M36535.m36508();
        String strSubstring = m11556("targetPath").substring(1);
        int iM11548 = m11548("level");
        int iM11549 = m11548("update");
        C11667 c11667M11533 = m11533();
        boolean zM11552 = m11552("keepApkSigBlock");
        AbstractC3163 abstractC3163 = (AbstractC3163) m11526();
        C19247 c19247 = (C19247) m11553();
        c19247.mo7646(false);
        C11339 c11339 = this.f39730;
        if (iM11549 != 0) {
            c11339.m28012(new C20323(strSubstring, c19247, iM11549));
        }
        this.f39730.m28011(abstractC3163, null, null, strArrM11558, this.f39728.mo23554(), new C4800(this));
        if (mo1526()) {
            return C17222.m40521();
        }
        m11536(R.string.MT_Protector);
        m46500(true);
        mo11520("...");
        AbstractC15440 abstractC15440M44380 = c19247.m44380();
        C21818 c21818M50499 = C22523.m50499(abstractC15440M44380, c11667M11533 != null);
        this.f39729 = c21818M50499;
        C8918 c8918M49176 = c21818M50499.m49176();
        ArrayList arrayList2 = new ArrayList();
        try {
            C18090 c18093 = new C18090(abstractC15440M44380);
            try {
                if (c11667M11533 == null && zM11552) {
                    try {
                        if (c18093.m42201()) {
                            c8918M49176.m23016(c18093);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        arrayList = arrayList2;
                        c18090 = c18093;
                    }
                }
                try {
                    if (c18093.m42212()) {
                        c8918M49176.m23025();
                    }
                    boolean zM9487 = AbstractDialogInterfaceOnClickListenerC3113.m9487(iM11548, c8918M49176);
                    C15313 c15313 = new C15313();
                    if (zM9487) {
                        c15313.m36337(c18093);
                    }
                    Iterator it = c11339.m28010().iterator();
                    long jM42207 = 0;
                    long size = 0;
                    while (it.hasNext()) {
                        C18090 c18094 = new C18090((AbstractC15440) it.next());
                        arrayList2.add(c18094);
                        for (C3545 c3545 : c18094.m42210()) {
                            if (!c3545.isDirectory()) {
                                size += c3545.getSize();
                            }
                        }
                        jM42207 += (long) c18094.m42207();
                    }
                    C19277 c19278 = new C19277(size);
                    c19278.m44459(new C1909(this));
                    HashSet hashSet = new HashSet();
                    byte[] bArr2 = new byte[1024];
                    Iterator it2 = arrayList2.iterator();
                    long j = 0;
                    while (true) {
                        long j2 = j;
                        AbstractC15440 abstractC15440 = abstractC15440M44380;
                        C11667 c11667 = c11667M11533;
                        if (it2.hasNext()) {
                            try {
                                Iterator it3 = it2;
                                C18090 c18095 = (C18090) it2.next();
                                for (C3545 c3546 : c18095.m42210()) {
                                    arrayList = arrayList2;
                                    try {
                                        byte[] bArr3 = bArr2;
                                        C18090 c18096 = c18095;
                                        long j3 = j2 + 1;
                                        c18091 = c18093;
                                        try {
                                            StringBuilder sb = new StringBuilder();
                                            C19277 c19279 = c19278;
                                            sb.append(C4925.m14327(R.string.MT_Protector));
                                            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                                            sb.append(j3);
                                            sb.append("/");
                                            sb.append(jM42207);
                                            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                                            mo11546(sb.toString());
                                            mo11520(c3546.getName());
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(strSubstring);
                                            String str = strSubstring;
                                            sb2.append(c3546.getName());
                                            C3545 c3547 = new C3545(sb2.toString());
                                            long j4 = jM42207;
                                            c3547.setTime(c3546.getTime());
                                            if (zM9487) {
                                                c8918M49176.m23018(C21665.m48934(c3547.getName(), c15313));
                                            }
                                            c8918M49176.m23013(c3547);
                                            hashSet.add(c3547.getName());
                                            if (!c3547.isDirectory()) {
                                                c18092 = c18096;
                                                InputStream inputStreamM42189 = c18092.m42189(c3546);
                                                bArr = bArr3;
                                                while (true) {
                                                    try {
                                                        int i = inputStreamM42189.read(bArr);
                                                        if (i == -1) {
                                                            c19277 = c19279;
                                                            inputStreamM42189.close();
                                                            break;
                                                        }
                                                        c8918M49176.write(bArr, 0, i);
                                                        C19277 c192710 = c19279;
                                                        c192710.m44460(i);
                                                        if (mo1526()) {
                                                            C17222 c17222M40521 = C17222.m40521();
                                                            inputStreamM42189.close();
                                                            c18091.close();
                                                            Iterator it4 = arrayList.iterator();
                                                            while (it4.hasNext()) {
                                                                C0349.m1793((C18090) it4.next());
                                                            }
                                                            return c17222M40521;
                                                        }
                                                        c19279 = c192710;
                                                    } catch (Throwable th3) {
                                                        try {
                                                            inputStreamM42189.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                    th = th;
                                                    th = th;
                                                    c18090 = c18091;
                                                    try {
                                                        c18090.close();
                                                        throw th;
                                                    } catch (Throwable th5) {
                                                        th.addSuppressed(th5);
                                                        throw th;
                                                    }
                                                }
                                            }
                                            bArr = bArr3;
                                            c18092 = c18096;
                                            c19277 = c19279;
                                            c8918M49176.m23023();
                                            if (mo1526()) {
                                                C17222 c17222M40522 = C17222.m40521();
                                                c18091.close();
                                                Iterator it5 = arrayList.iterator();
                                                while (it5.hasNext()) {
                                                    C0349.m1793((C18090) it5.next());
                                                }
                                                return c17222M40522;
                                            }
                                            c19278 = c19277;
                                            j2 = j3;
                                            arrayList2 = arrayList;
                                            jM42207 = j4;
                                            c18095 = c18092;
                                            bArr2 = bArr;
                                            c18093 = c18091;
                                            strSubstring = str;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c18091 = c18093;
                                    }
                                }
                                abstractC15440M44380 = abstractC15440;
                                j = j2;
                                c11667M11533 = c11667;
                                it2 = it3;
                            } catch (Throwable th8) {
                                th = th8;
                                arrayList = arrayList2;
                            }
                        } else {
                            arrayList = arrayList2;
                            C18090 c18097 = c18093;
                            try {
                                long jM42208 = c18097.m42207();
                                long jM48935 = 0;
                                for (C3545 c3548 : c18097.m42210()) {
                                    if (!c3548.isDirectory()) {
                                        jM48935 += zM9487 ? C21665.m48935(c3548, c15313) : c3548.m10793();
                                    }
                                }
                                C19277 c192711 = new C19277(jM48935);
                                c192711.m44459(new C1909(this));
                                long j5 = 0;
                                for (C3545 c3549 : c18097.m42210()) {
                                    j5++;
                                    if (hashSet.contains(c3549.getName())) {
                                        if (!c3549.isDirectory()) {
                                            c192711.m44458(zM9487 ? C21665.m48935(c3549, c15313) : c3549.m10793());
                                        }
                                        c18090 = c18097;
                                    } else {
                                        mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + j5 + "/" + jM42208 + MotionUtils.EASING_TYPE_FORMAT_END);
                                        mo11520(c3549.getName());
                                        c18090 = c18097;
                                        try {
                                            C21665.m48936(c18090, c8918M49176, c3549, c15313, new C3389(this, c192711));
                                            if (mo1526()) {
                                                C17222 c17222M40523 = C17222.m40521();
                                                c18090.close();
                                                Iterator it6 = arrayList.iterator();
                                                while (it6.hasNext()) {
                                                    C0349.m1793((C18090) it6.next());
                                                }
                                                return c17222M40523;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            th = th;
                                            c18090.close();
                                            throw th;
                                        }
                                    }
                                    c18097 = c18090;
                                    zM9487 = zM9487;
                                }
                                C18090 c18098 = c18097;
                                c8918M49176.close();
                                if (c11667 != null) {
                                    C10025.m25200(this.f39729, c11667, this);
                                }
                                if (mo1526()) {
                                    C17222 c17222M40524 = C17222.m40521();
                                    c18098.close();
                                    Iterator it7 = arrayList.iterator();
                                    while (it7.hasNext()) {
                                        C0349.m1793((C18090) it7.next());
                                    }
                                    return c17222M40524;
                                }
                                C18838.m43524(abstractC15440);
                                C17558 c17558 = new C17558();
                                c17558.m41050(abstractC15440);
                                this.f39729.m49175(abstractC15440, new RunnableC15602(3, this, abstractC15440), c18098);
                                c17558.m41052(abstractC15440);
                                c18098.close();
                                Iterator it8 = arrayList.iterator();
                                while (it8.hasNext()) {
                                    C0349.m1793((C18090) it8.next());
                                }
                                return m11545();
                            } catch (Throwable th10) {
                                th = th10;
                                c18090 = c18097;
                            }
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    arrayList = arrayList2;
                    c18090 = c18093;
                }
            } catch (Throwable th12) {
                th = th12;
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    C0349.m1793((C18090) it9.next());
                }
                throw th;
            }
        } catch (Throwable th13) {
            th = th13;
            arrayList = arrayList2;
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526()) {
            if (m11542(c16560)) {
                c16560.m39041();
            }
            if (m11525(c16561)) {
                c16561.m39000((Collection) this.f39730.m28013());
                c16561.m39015();
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C21818 c21818;
        AbstractC15440 abstractC15440 = this.f39728;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
        if (!c17222.m40526() && (c21818 = this.f39729) != null) {
            C0349.m1793(c21818.m49176());
            this.f39729.m49174().mo23552();
        }
        C15528.m36596();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, C4925.m14327(R.string.MT_Protector).toLowerCase());
    }
}
