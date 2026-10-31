package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13358 implements InterfaceC10968 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3481 f39929;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f39930;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10537 f39931;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16611 f39932;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f39933;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f39934;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC8795 f39935;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9418 f39936;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C12653 f39937;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f39938;

    public C13358(C10537 c10537) {
        this.f39931 = c10537;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32326(C9418 c9418, InterfaceC8795 interfaceC8795, ArrayList arrayList, C16611 c16611, boolean z, C3481 c3481, C12653 c12653) {
        this.f39936 = c9418;
        this.f39935 = interfaceC8795;
        this.f39934 = arrayList;
        this.f39932 = c16611;
        this.f39930 = z;
        this.f39929 = c3481;
        this.f39937 = c12653;
        this.f39933 = null;
        this.f39938 = null;
    }

    @Override // l.InterfaceC10968
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27280(int i, int i2, int i3, EnumC0841 enumC0841) {
        boolean zM26460;
        C3481 c3481;
        String strM31401;
        C12918 c12918 = this.f39932.f51035;
        if ("dex_field".equals(this.f39936.f28572)) {
            C9418 c9418 = this.f39936;
            c3481 = this.f39929;
            C12653 c12653 = this.f39937;
            if (i2 == 2) {
                AbstractC3912 abstractC3912M31418 = c12918.m31418();
                int iM31404 = c12918.m31404(i3);
                int iM11936 = abstractC3912M31418.m11936(iM31404);
                String str = c9418.f28565;
                String str2 = c9418.f28571;
                if (c12918.m31407(iM11936, 0, str.length(), str)) {
                    int iMo11935 = abstractC3912M31418.mo11935(iM31404 + 4);
                    int i4 = c12653.f38109;
                    int i5 = c12653.f38110;
                    if (c12918.m31392(iMo11935, 0, i4, str2) && c12918.m31407(abstractC3912M31418.m11936(iM31404 + 2), i5, str2.length() - i5, str2)) {
                        strM31401 = C22870.m50967(c12918.m31401(iM11936), "->", str2);
                        c3481.f11031 = strM31401;
                        c3481.f11030 = "exact_reference";
                        c3481.f11029 = "not_applicable";
                        zM26460 = true;
                    }
                }
            }
            zM26460 = false;
        } else if ("dex_class".equals(this.f39936.f28572)) {
            C9418 c9419 = this.f39936;
            c3481 = this.f39929;
            if (i2 == 1 && c12918.m31393(i3, c9419.f28565)) {
                strM31401 = c12918.m31401(i3);
                c3481.f11031 = strM31401;
                c3481.f11030 = "exact_reference";
                c3481.f11029 = "not_applicable";
                zM26460 = true;
            } else {
                zM26460 = false;
            }
        } else {
            zM26460 = C10537.m26460(this.f39931, this.f39936, this.f39935, this.f39932, c12918, i3, enumC0841, i2, this.f39930, this.f39929, this.f39937);
        }
        if (zM26460) {
            if (this.f39938 == null) {
                this.f39933 = this.f39932.f51043.getType();
                C16611 c16611 = this.f39932;
                StringBuilder sb = new StringBuilder();
                Iterator it = c16611.mo3565().iterator();
                while (it.hasNext()) {
                    sb.append((CharSequence) it.next());
                }
                this.f39938 = c16611.getName() + MotionUtils.EASING_TYPE_FORMAT_START + ((Object) sb) + MotionUtils.EASING_TYPE_FORMAT_END + c16611.mo3568();
            }
            ArrayList arrayList = this.f39934;
            String str3 = this.f39933;
            String str4 = this.f39938;
            C3481 c3482 = this.f39929;
            arrayList.add(new C16180(str3, str4, c3482.f11031, c3482.f11030, c3482.f11029, enumC0841.f3315, i));
            if (this.f39934.size() >= this.f39936.f28569) {
                return false;
            }
        }
        return true;
    }
}
