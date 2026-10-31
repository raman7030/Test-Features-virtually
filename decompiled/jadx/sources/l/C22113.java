package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 022A */
/* JADX INFO: loaded from: classes.dex */
public final class C22113 extends AbstractC5447 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15323 f71788 = new C21408();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f71792;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashMap f71793 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f71790 = new HashMap();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final HashMap f71791 = new HashMap();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f71789 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f71794 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22113 m49690(C3330 c3330) {
        return (C22113) new C4741(c3330, f71788).m13885(C22113.class);
    }

    public C22113(boolean z) {
        this.f71792 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49694(boolean z) {
        this.f71794 = z;
    }

    @Override // l.AbstractC5447
    /* JADX INFO: renamed from: ܽ */
    public final void mo15547() {
        if (AbstractC5180.m14853(3)) {
            toString();
        }
        this.f71789 = true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m49700() {
        return this.f71789;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49693(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (this.f71794) {
            AbstractC5180.m14853(2);
            return;
        }
        String str = componentCallbacksC9205.mWho;
        HashMap map = this.f71793;
        if (map.containsKey(str)) {
            return;
        }
        map.put(componentCallbacksC9205.mWho, componentCallbacksC9205);
        if (AbstractC5180.m14853(2)) {
            componentCallbacksC9205.toString();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m49695(String str) {
        return (ComponentCallbacksC9205) this.f71793.get(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m49701() {
        return new ArrayList(this.f71793.values());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m49697(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (this.f71793.containsKey(componentCallbacksC9205.mWho) && this.f71792) {
            return this.f71789;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m49699(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (this.f71794) {
            AbstractC5180.m14853(2);
        } else {
            if (this.f71793.remove(componentCallbacksC9205.mWho) == null || !AbstractC5180.m14853(2)) {
                return;
            }
            componentCallbacksC9205.toString();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22113 m49698(ComponentCallbacksC9205 componentCallbacksC9205) {
        String str = componentCallbacksC9205.mWho;
        HashMap map = this.f71790;
        C22113 c22113 = (C22113) map.get(str);
        if (c22113 != null) {
            return c22113;
        }
        C22113 c22114 = new C22113(this.f71792);
        map.put(componentCallbacksC9205.mWho, c22114);
        return c22114;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3330 m49702(ComponentCallbacksC9205 componentCallbacksC9205) {
        String str = componentCallbacksC9205.mWho;
        HashMap map = this.f71791;
        C3330 c3330 = (C3330) map.get(str);
        if (c3330 != null) {
            return c3330;
        }
        C3330 c3331 = new C3330();
        map.put(componentCallbacksC9205.mWho, c3331);
        return c3331;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49696(ComponentCallbacksC9205 componentCallbacksC9205) {
        if (AbstractC5180.m14853(3)) {
            C11003.toString(componentCallbacksC9205);
        }
        m49691(componentCallbacksC9205.mWho);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49692(String str) {
        AbstractC5180.m14853(3);
        m49691(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m49691(String str) {
        HashMap map = this.f71790;
        C22113 c22113 = (C22113) map.get(str);
        if (c22113 != null) {
            c22113.mo15547();
            map.remove(str);
        }
        HashMap map2 = this.f71791;
        C3330 c3330 = (C3330) map2.get(str);
        if (c3330 != null) {
            c3330.m10189();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22113.class == obj.getClass()) {
            C22113 c22113 = (C22113) obj;
            if (this.f71793.equals(c22113.f71793) && this.f71790.equals(c22113.f71790) && this.f71791.equals(c22113.f71791)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f71791.hashCode() + ((this.f71790.hashCode() + (this.f71793.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f71793.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f71790.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f71791.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
