package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes5.dex */
public class C14761 extends AbstractC22366 {

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45075 = 0;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C18090 f45076;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f45077 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public long f45078;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C21818 f45079;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76957;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11517("zipPath"), C4925.m14327(R.string.MT_Protector));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() {
        char c;
        String strM11556 = m11556("zipPath");
        C12951 c12951M31485 = C12951.m31485(m11560(e.m));
        String strM31506 = c12951M31485.m31506();
        int i = c12951M31485.readInt();
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        while (true) {
            boolean z = true;
            c = 1;
            if (i2 >= i) {
                break;
            }
            String strM31507 = c12951M31485.m31506();
            String strM31508 = c12951M31485.m31506();
            byte b = c12951M31485.readByte();
            String strConcat = strM31506.concat(strM31507);
            String strConcat2 = strM31506.concat(strM31508);
            boolean z2 = (b & 1) != 0;
            if ((b & 2) == 0) {
                z = false;
            }
            arrayList.add(new C18290(strConcat, strConcat2, z2, z));
            i2++;
        }
        int i3 = c12951M31485.readInt();
        HashSet hashSet = new HashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            hashSet.add(c12951M31485.m31506());
        }
        C11667 c11667M11533 = m11533();
        boolean zM11552 = m11552("keepApkSigBlock");
        AbstractC15440 abstractC15440M39866 = C16999.m39866(strM11556, new String[0]);
        this.f45076 = new C18090(abstractC15440M39866);
        C21818 c21818M50499 = C22523.m50499(abstractC15440M39866, c11667M11533 != null);
        this.f45079 = c21818M50499;
        C8918 c8918M49176 = c21818M50499.m49176();
        if (c11667M11533 == null && zM11552 && this.f45076.m42201()) {
            c8918M49176.m23016(this.f45076);
        }
        if (this.f45076.m42212()) {
            c8918M49176.m23025();
        }
        Collection<C3545> collectionM42210 = this.f45076.m42210();
        C17584 c17584 = new C17584(this, C22523.m50496(collectionM42210));
        int i5 = 0;
        for (C3545 c3545 : collectionM42210) {
            if (mo1526()) {
                return C17222.m40521();
            }
            if (!hashSet.contains(c3545.getName())) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && !((C18290) it.next()).m42627(c3545)) {
                }
                i5++;
                mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i5 + "/" + collectionM42210.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                mo11520(c3545.getName());
                if (c3545.isDirectory()) {
                    c8918M49176.m23013(c3545);
                } else {
                    C22523.m50503(c3545, this.f45076, c8918M49176, c17584);
                    this.f45078 += c3545.m10793();
                }
            }
        }
        m50129(100);
        mo11538(100);
        c8918M49176.close();
        if (c11667M11533 != null) {
            C10025.m25200(this.f45079, c11667M11533, this);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        C18838.m43524(abstractC15440M39866);
        C17558 c17558 = new C17558();
        c17558.m41050(abstractC15440M39866);
        this.f45079.m49175(abstractC15440M39866, new RunnableC16460(c == true ? 1 : 0, this, abstractC15440M39866), this.f45076);
        c17558.m41052(abstractC15440M39866);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strM42626 = ((C18290) it2.next()).m42626();
            if (strM42626 != null) {
                this.f45077.add(strM42626);
            }
        }
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
            c16560.m39000((Collection) this.f45077);
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C21818 c21818;
        if (!c17222.m40526() && (c21818 = this.f45079) != null) {
            C0349.m1793(c21818.m49176());
            this.f45079.m49174().mo23552();
        }
        C0349.m1793(this.f45076);
        C15528.m36596();
    }
}
