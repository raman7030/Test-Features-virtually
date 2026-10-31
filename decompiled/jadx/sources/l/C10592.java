package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E1YX */
/* JADX INFO: loaded from: classes4.dex */
public class C10592 extends AbstractC22366 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f31794 = 0;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public long f31795;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C21818 f31796;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C18090 f31797;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76971;
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
    public final C17222 mo2780() {
        String[] strArrM11558 = m11558("ARG_PATHS");
        String strM11556 = m11556("zipPath");
        C11667 c11667M11533 = m11533();
        boolean zM11552 = m11552("keepApkSigBlock");
        final AbstractC15440 abstractC15440M39866 = C16999.m39866(strM11556, new String[0]);
        C17721.m41504(abstractC15440M39866, EnumC16309.MODIFY_FILE);
        this.f31797 = new C18090(abstractC15440M39866);
        C21818 c21818M50499 = C22523.m50499(abstractC15440M39866, c11667M11533 != null);
        this.f31796 = c21818M50499;
        C8918 c8918M49176 = c21818M50499.m49176();
        if (c11667M11533 == null && zM11552 && this.f31797.m42201()) {
            c8918M49176.m23016(this.f31797);
        }
        if (this.f31797.m42212()) {
            c8918M49176.m23025();
        }
        Collection<C3545> collectionM42210 = this.f31797.m42210();
        C12708 c12708 = new C12708(this, C22523.m50496(collectionM42210));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (String str : strArrM11558) {
            if (str.endsWith("/")) {
                arrayList.add(str.substring(1));
            } else {
                hashSet.add(str.substring(1));
            }
        }
        int i = 0;
        for (C3545 c3545 : collectionM42210) {
            if (mo1526()) {
                return C17222.m40521();
            }
            if (!hashSet.contains(c3545.getName())) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (c3545.getName().startsWith((String) it.next())) {
                        }
                    } else {
                        i++;
                        mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i + "/" + collectionM42210.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                        mo11520(c3545.getName());
                        if (c3545.isDirectory()) {
                            c8918M49176.m23013(c3545);
                        } else {
                            C22523.m50503(c3545, this.f31797, c8918M49176, c12708);
                            this.f31795 += c3545.m10793();
                        }
                    }
                }
            }
            if (!c3545.isDirectory()) {
                this.f31795 += c3545.m10793();
            }
        }
        m50129(100);
        mo11538(100);
        c8918M49176.close();
        if (c11667M11533 != null) {
            C10025.m25200(this.f31796, c11667M11533, this);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        C18838.m43524(abstractC15440M39866);
        C17558 c17558 = new C17558();
        c17558.m41050(abstractC15440M39866);
        this.f31796.m49175(abstractC15440M39866, new Runnable() { // from class: l.۬᩹᩻
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = C10592.f31794;
                C10592 c10592 = this.f40098;
                c10592.m11536(R.string.MT_Protector);
                c10592.mo11520(abstractC15440M39866.getName());
            }
        }, this.f31797);
        c17558.m41052(abstractC15440M39866);
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C21818 c21818;
        if (!c17222.m40526() && (c21818 = this.f31796) != null) {
            C0349.m1793(c21818.m49176());
            this.f31796.m49174().mo23552();
        }
        C0349.m1793(this.f31797);
        C15528.m36596();
    }
}
