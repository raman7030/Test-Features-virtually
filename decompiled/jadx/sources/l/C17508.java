package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܿᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17508 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f53476;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53477;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53478;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f53479;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f53480;

    public C17508(ArrayList arrayList, int i, int i2) {
        this.f53478 = arrayList;
        this.f53479 = i;
        this.f53476 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40896(C23858 c23858, InterfaceC7099 interfaceC7099, String str) {
        int i = this.f53480;
        this.f53480 = i + 1;
        if (i < this.f53479) {
            return false;
        }
        return m40893(i, new C14685(c23858.m52571(), C2692.m8426(interfaceC7099), "parent_reference", "parent=".concat(str), null, null, null));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40894(C14587 c14587, C23858 c23858, InterfaceC7099 interfaceC7099, InterfaceC1454 interfaceC1454, String str, HashSet hashSet) {
        int i = this.f53480;
        this.f53480 = i + 1;
        if (i < this.f53479) {
            return false;
        }
        String strM8426 = C2692.m8426(interfaceC7099);
        C0532 c0532M23320 = C9042.m23320(c14587, interfaceC7099, interfaceC1454.mo5006());
        String strM23296 = C9042.m23296(interfaceC1454, C9042.m23310(c14587, interfaceC1454, 300), (Set) hashSet);
        C13232 c13232M52571 = c23858.m52571();
        String str2 = c0532M23320.f2194;
        return m40893(i, new C14685(c13232M52571, strM8426, Name.REFER, (str2 == null || str2.isEmpty() || str2.equals(str)) ? "item key=".concat(str) : C20087.m46306("item key=", str2, " (", str, MotionUtils.EASING_TYPE_FORMAT_END), c0532M23320.f2194, c0532M23320.f2195, strM23296));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40895(C14587 c14587, C23858 c23858, InterfaceC7099 interfaceC7099, InterfaceC1454 interfaceC1454, boolean z, String str, HashSet hashSet) {
        int i = this.f53480;
        this.f53480 = i + 1;
        if (i < this.f53479) {
            return false;
        }
        String strM8426 = C2692.m8426(interfaceC7099);
        C0532 c0532M23320 = z ? C9042.m23320(c14587, interfaceC7099, interfaceC1454.mo5006()) : new C0532(null, 0);
        C19584 c19584M23310 = C9042.m23310(c14587, interfaceC1454, 300);
        String strM23296 = C9042.m23296(interfaceC1454, c19584M23310, (Set) hashSet);
        C13232 c13232M52571 = c23858.m52571();
        String str2 = c19584M23310.f63272;
        String str3 = c19584M23310.f63276;
        return m40893(i, new C14685(c13232M52571, strM8426, Name.REFER, (str2 != null || str3 == null || str3.isEmpty()) ? str : C8163.m21635(0, str3.length(), 300, str3), z ? c0532M23320.f2194 : null, z ? c0532M23320.f2195 : null, z ? strM23296 : null));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40893(int i, C14685 c14685) {
        ArrayList arrayList = this.f53478;
        arrayList.add(c14685);
        if (arrayList.size() < this.f53476) {
            return false;
        }
        this.f53477 = i + 1;
        return true;
    }
}
