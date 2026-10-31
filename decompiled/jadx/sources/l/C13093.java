package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public class C13093 extends AbstractC22366 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public String f39194 = "null";

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f39193 = new ArrayList();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, this.f39194);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws Exception {
        ArrayList arrayList;
        AbstractC15440 abstractC15440M11515 = m11515("outputDir");
        String[] strArrM11558 = m11558("ARG_PATHS");
        String strM11556 = m11556("password");
        int iM11548 = m11548("level");
        boolean zM11552 = m11552("headerEncryption");
        boolean zM11553 = m11552("deleteSources");
        long jM11527 = m11527("splitSize");
        int length = strArrM11558.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f39193;
            if (i < length) {
                StringBuilder sb = new StringBuilder();
                sb.append(C4925.m14327(R.string.MT_Protector));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                int i3 = i + 1;
                sb.append(i3);
                sb.append("/");
                sb.append(length);
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                mo11546(sb.toString());
                m11541(i3, length);
                AbstractC15440 abstractC15440M39866 = C16999.m39866(strArrM11558[i], new String[0]);
                AbstractC15440 abstractC15440M36492 = abstractC15440M11515.m36526((abstractC15440M39866.mo23113() ? abstractC15440M39866.getName() : abstractC15440M39866.m36517()) + ".7z").m36492(true);
                this.f39194 = abstractC15440M36492.getName();
                C1764 c1764M52845 = C24009.m52845((AbstractC3817) this, new String[]{strArrM11558[i]}, false);
                int iM5894 = c1764M52845.m5894() + i2;
                if (mo1526()) {
                    return C17222.m40521();
                }
                C22351 c22351 = new C22351();
                c22351.f72421 = c1764M52845.f6117.size();
                c22351.f72419 = iM11548;
                c22351.f72420 = zM11552;
                ArrayList arrayList3 = new ArrayList();
                try {
                    AbstractC15440 abstractC15440 = abstractC15440M11515;
                    int i4 = iM11548;
                    boolean z = zM11552;
                    int i5 = length;
                    try {
                        C13178.m32002(c22351, new C3216(this, jM11527, abstractC15440M36492, arrayList3, strM11556, c1764M52845));
                        if (mo1526()) {
                            C24009.m52846(arrayList3);
                            return C17222.m40521();
                        }
                        arrayList2.addAll(arrayList3);
                        i = i3;
                        i2 = iM5894;
                        abstractC15440M11515 = abstractC15440;
                        iM11548 = i4;
                        zM11552 = z;
                        length = i5;
                    } catch (Exception e) {
                        e = e;
                        arrayList = arrayList3;
                        C24009.m52846(arrayList);
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    arrayList = arrayList3;
                }
            } else {
                if (!mo1526() && zM11553) {
                    C24009.m52848(this, strArrM11558, arrayList2, i2);
                }
                return m11545();
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        boolean zM11552 = m11552("compressToAnother");
        C24009.m52849(c17222, zM11552, zM11552 ? m11525(c16561) : m11542(c16560), c16560, c16561, C24009.m52844((List) this.f39193));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
