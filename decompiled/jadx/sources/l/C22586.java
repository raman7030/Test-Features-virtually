package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes2.dex */
public class C22586 extends AbstractC22366 {

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f73005 = 0;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C21818 f73006;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public long f73007 = 0;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C18090 f73008;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C18090 f73009;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76955;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11517("tarZipPath"));
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
        String strM11556 = m11556("srcZipPath");
        String strM11557 = m11556("tarZipPath");
        String strM11558 = m11556("targetPath");
        int iM11548 = m11548("update");
        String[] strArrM11558 = m11558("ARG_PATHS");
        C11667 c11667M11533 = m11533();
        boolean zM11552 = m11552("keepApkSigBlock");
        AbstractC15440 abstractC15440M39866 = C16999.m39866(strM11557, new String[0]);
        C17721.m41504(abstractC15440M39866, EnumC16309.MODIFY_FILE);
        this.f73008 = new C18090(C16999.m39866(strM11556, new String[0]));
        this.f73009 = new C18090(abstractC15440M39866);
        int i = 1;
        C21818 c21818M50499 = C22523.m50499(abstractC15440M39866, c11667M11533 != null);
        this.f73006 = c21818M50499;
        C8918 c8918M49176 = c21818M50499.m49176();
        boolean zM42212 = this.f73009.m42212();
        if (c11667M11533 == null && zM11552 && this.f73009.m42201()) {
            c8918M49176.m23016(this.f73009);
        }
        if (zM42212) {
            c8918M49176.m23025();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Collection<C3545> collectionM42210 = this.f73008.m42210();
        int length = strArrM11558.length;
        int i2 = 0;
        while (i2 < length) {
            String strSubstring = strArrM11558[i2].substring(i);
            if (strSubstring.endsWith("/")) {
                int iLastIndexOf = strSubstring.lastIndexOf(47, strSubstring.length() - 2) + 1;
                for (C3545 c3545 : collectionM42210) {
                    String[] strArr = strArrM11558;
                    Collection collection = collectionM42210;
                    if (c3545.getName().startsWith(strSubstring)) {
                        StringBuilder sbM15339 = C5368.m15339(strM11558);
                        sbM15339.append(c3545.getName().substring(iLastIndexOf));
                        String string = sbM15339.toString();
                        c3545.m10788(string);
                        linkedHashMap.put(string, c3545);
                    }
                    collectionM42210 = collection;
                    strArrM11558 = strArr;
                    strSubstring = strSubstring;
                }
            } else {
                C3545 c3545M42211 = this.f73008.m42211(strSubstring);
                StringBuilder sbM153310 = C5368.m15339(strM11558);
                sbM153310.append(c3545M42211.m10810());
                String string2 = sbM153310.toString();
                c3545M42211.m10788(string2);
                linkedHashMap.put(string2, c3545M42211);
            }
            i2++;
            i = 1;
            collectionM42210 = collectionM42210;
            strArrM11558 = strArrM11558;
        }
        for (C3545 c3546 : this.f73009.m42210()) {
            linkedHashMap2.put(c3546.getName(), c3546);
        }
        if (iM11548 == 0) {
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                linkedHashMap2.remove((String) it.next());
            }
        } else if (iM11548 == 1) {
            for (Map.Entry entry : new ArrayList(linkedHashMap.entrySet())) {
                C3545 c3547 = (C3545) linkedHashMap2.get(entry.getKey());
                if (c3547 != null) {
                    if (((C3545) entry.getValue()).getTime() > c3547.getTime()) {
                        linkedHashMap2.remove(entry.getKey());
                    } else {
                        linkedHashMap.remove(entry.getKey());
                    }
                }
            }
        } else if (iM11548 == 2) {
            Iterator it2 = linkedHashMap2.keySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap.remove((String) it2.next());
            }
        }
        C15313 c15313 = new C15313();
        if (zM42212) {
            C3545 c3548 = (C3545) linkedHashMap.get("AndroidManifest.xml");
            if (c3548 != null) {
                InputStream inputStreamM42189 = this.f73008.m42189(c3548);
                try {
                    try {
                        C15206 c15206M35970 = C15206.m35970(inputStreamM42189);
                        c15313.f46967 = C22263.m49982(c15206M35970);
                        c15313.f46966 = C22263.m49984(c15206M35970);
                    } catch (Exception unused) {
                        c15313.f46967 = false;
                        c15313.f46966 = false;
                    }
                    inputStreamM42189.close();
                } catch (Throwable th) {
                    try {
                        inputStreamM42189.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                c15313.m36337(this.f73009);
            }
        }
        C15529 c15529 = new C15529(this, m50562(linkedHashMap.values(), c15313) + m50562(linkedHashMap2.values(), c15313));
        int i3 = 0;
        for (C3545 c3549 : linkedHashMap.values()) {
            if (mo1526()) {
                return C17222.m40521();
            }
            i3++;
            mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i3 + "/" + linkedHashMap.size() + MotionUtils.EASING_TYPE_FORMAT_END);
            mo11520(c3549.getName());
            if (c3549.isDirectory()) {
                c8918M49176.m23013(c3549);
            } else {
                C21665.m48936(this.f73008, c8918M49176, c3549, c15313, new C21881(c15529));
                this.f73007 += C21665.m48935(c3549, c15313);
            }
        }
        Iterator it3 = linkedHashMap2.values().iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            C3545 c35410 = (C3545) it3.next();
            if (mo1526()) {
                return C17222.m40521();
            }
            int i5 = i4 + 1;
            mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i5 + "/" + linkedHashMap2.size() + MotionUtils.EASING_TYPE_FORMAT_END);
            mo11520(c35410.getName());
            if (c35410.isDirectory()) {
                c8918M49176.m23013(c35410);
            } else {
                C21665.m48936(this.f73009, c8918M49176, c35410, c15313, new C21881(c15529));
                this.f73007 += C21665.m48935(c35410, c15313);
            }
            it3 = it3;
            i4 = i5;
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        C0349.m1793(this.f73008);
        this.f73008 = null;
        C0349.m1793(this.f73009);
        this.f73009 = null;
        c8918M49176.close();
        if (c11667M11533 != null) {
            C10025.m25200(this.f73006, c11667M11533, this);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        C18838.m43524(abstractC15440M39866);
        C17558 c17558 = new C17558();
        c17558.m41050(abstractC15440M39866);
        this.f73006.m49175(abstractC15440M39866, new RunnableC20923(3, this, abstractC15440M39866), new AutoCloseable[0]);
        c17558.m41052(abstractC15440M39866);
        return C17222.m40520();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m50562(Collection collection, C15313 c15313) {
        Iterator it = collection.iterator();
        long jM48935 = 0;
        while (it.hasNext()) {
            C3545 c3545 = (C3545) it.next();
            if (!c3545.isDirectory()) {
                jM48935 += C21665.m48935(c3545, c15313);
            }
        }
        return jM48935;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526()) {
            if (m11542(c16560)) {
                c16560.m39041();
            }
            if (m11525(c16561)) {
                c16561.m39000((Collection) AbstractC3817.m11510(m11558("ARG_PATHS")));
                c16561.m39015();
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C21818 c21818 = this.f73006;
        if (c21818 != null) {
            C0349.m1793(c21818.m49176());
            this.f73006.m49174().mo23552();
        }
        C0349.m1793(this.f73008);
        C0349.m1793(this.f73009);
        C15528.m36596();
    }
}
