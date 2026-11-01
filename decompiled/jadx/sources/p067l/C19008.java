package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܿᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19008 {

    /* JADX INFO: renamed from: ֫ */
    public final int f56666;

    /* JADX INFO: renamed from: ۧ */
    public int f56667;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f56668;

    /* JADX INFO: renamed from: ܿ */
    public final int f56669;

    /* JADX INFO: renamed from: ᩳ */
    public int f56670;

    public C19008(ArrayList arrayList, int i, int i2) {
        this.f56668 = arrayList;
        this.f56669 = i;
        this.f56666 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m43154(C25043 c25043, InterfaceC9116 interfaceC9116, String str) {
        int i = this.f56670;
        this.f56670 = i + 1;
        if (i < this.f56669) {
            return false;
        }
        return m43151(i, new C16325(c25043.m54980(), C4927.m10472(interfaceC9116), "parent_reference", "parent=".concat(str), null, null, null));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m43152(C16232 c16232, C25043 c25043, InterfaceC9116 interfaceC9116, InterfaceC3751 interfaceC3751, String str, HashSet hashSet) {
        int i = this.f56670;
        this.f56670 = i + 1;
        if (i < this.f56669) {
            return false;
        }
        String strM10472 = C4927.m10472(interfaceC9116);
        C2874 c2874M25265 = C10962.m25265(c16232, interfaceC9116, interfaceC3751.mo7249());
        String strM25241 = C10962.m25241(interfaceC3751, C10962.m25255(c16232, interfaceC3751, 300), (Set) hashSet);
        C14944 c14944M54980 = c25043.m54980();
        String str2 = c2874M25265.f4967;
        return m43151(i, new C16325(c14944M54980, strM10472, Name.REFER, (str2 == null || str2.isEmpty() || str2.equals(str)) ? "item key=".concat(str) : C21459.m48622("item key=", str2, " (", str, MotionUtils.EASING_TYPE_FORMAT_END), c2874M25265.f4967, c2874M25265.f4968, strM25241));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m43153(C16232 c16232, C25043 c25043, InterfaceC9116 interfaceC9116, InterfaceC3751 interfaceC3751, boolean z, String str, HashSet hashSet) {
        int i = this.f56670;
        this.f56670 = i + 1;
        if (i < this.f56669) {
            return false;
        }
        String strM10472 = C4927.m10472(interfaceC9116);
        C2874 c2874M25265 = z ? C10962.m25265(c16232, interfaceC9116, interfaceC3751.mo7249()) : new C2874(null, 0);
        C20981 c20981M25255 = C10962.m25255(c16232, interfaceC3751, 300);
        String strM25241 = C10962.m25241(interfaceC3751, c20981M25255, (Set) hashSet);
        C14944 c14944M54980 = c25043.m54980();
        String str2 = c20981M25255.f65889;
        String str3 = c20981M25255.f65893;
        return m43151(i, new C16325(c14944M54980, strM10472, Name.REFER, (str2 != null || str3 == null || str3.isEmpty()) ? str : C10127.m23604(0, str3.length(), 300, str3), z ? c2874M25265.f4967 : null, z ? c2874M25265.f4968 : null, z ? strM25241 : null));
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m43151(int i, C16325 c16325) {
        ArrayList arrayList = this.f56668;
        arrayList.add(c16325);
        if (arrayList.size() < this.f56666) {
            return false;
        }
        this.f56667 = i + 1;
        return true;
    }
}
