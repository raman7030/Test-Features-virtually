package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 022A */
/* JADX INFO: loaded from: classes.dex */
public final class C23384 extends AbstractC7545 {

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC16931 f74510 = new C22714();

    /* JADX INFO: renamed from: ۤ */
    public final boolean f74514;

    /* JADX INFO: renamed from: ۫ */
    public final HashMap f74515 = new HashMap();

    /* JADX INFO: renamed from: ۙ */
    public final HashMap f74512 = new HashMap();

    /* JADX INFO: renamed from: ۛ */
    public final HashMap f74513 = new HashMap();

    /* JADX INFO: renamed from: ۗ */
    public boolean f74511 = false;

    /* JADX INFO: renamed from: ۬ */
    public boolean f74516 = false;

    /* JADX INFO: renamed from: ֫ */
    public static C23384 m52028(C5533 c5533) {
        return (C23384) new C6874(c5533, f74510).m15765(C23384.class);
    }

    public C23384(boolean z) {
        this.f74514 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52032(boolean z) {
        this.f74516 = z;
    }

    @Override // p067l.AbstractC7545
    /* JADX INFO: renamed from: ܽ */
    public final void mo17458() {
        if (AbstractC7291.m16763(3)) {
            toString();
        }
        this.f74511 = true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m52038() {
        return this.f74511;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52031(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (this.f74516) {
            AbstractC7291.m16763(2);
            return;
        }
        String str = componentCallbacksC11117.mWho;
        HashMap map = this.f74515;
        if (map.containsKey(str)) {
            return;
        }
        map.put(componentCallbacksC11117.mWho, componentCallbacksC11117);
        if (AbstractC7291.m16763(2)) {
            componentCallbacksC11117.toString();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final ComponentCallbacksC11117 m52033(String str) {
        return (ComponentCallbacksC11117) this.f74515.get(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList m52039() {
        return new ArrayList(this.f74515.values());
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m52035(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (this.f74515.containsKey(componentCallbacksC11117.mWho) && this.f74514) {
            return this.f74511;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m52037(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (this.f74516) {
            AbstractC7291.m16763(2);
        } else {
            if (this.f74515.remove(componentCallbacksC11117.mWho) == null || !AbstractC7291.m16763(2)) {
                return;
            }
            componentCallbacksC11117.toString();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C23384 m52036(ComponentCallbacksC11117 componentCallbacksC11117) {
        String str = componentCallbacksC11117.mWho;
        HashMap map = this.f74512;
        C23384 c23384 = (C23384) map.get(str);
        if (c23384 != null) {
            return c23384;
        }
        C23384 c23385 = new C23384(this.f74514);
        map.put(componentCallbacksC11117.mWho, c23385);
        return c23385;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C5533 m52040(ComponentCallbacksC11117 componentCallbacksC11117) {
        String str = componentCallbacksC11117.mWho;
        HashMap map = this.f74513;
        C5533 c5533 = (C5533) map.get(str);
        if (c5533 != null) {
            return c5533;
        }
        C5533 c5534 = new C5533();
        map.put(componentCallbacksC11117.mWho, c5534);
        return c5534;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52034(ComponentCallbacksC11117 componentCallbacksC11117) {
        if (AbstractC7291.m16763(3)) {
            C12826.toString(componentCallbacksC11117);
        }
        m52029(componentCallbacksC11117.mWho);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52030(String str) {
        AbstractC7291.m16763(3);
        m52029(str);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m52029(String str) {
        HashMap map = this.f74512;
        C23384 c23384 = (C23384) map.get(str);
        if (c23384 != null) {
            c23384.mo17458();
            map.remove(str);
        }
        HashMap map2 = this.f74513;
        C5533 c5533 = (C5533) map2.get(str);
        if (c5533 != null) {
            c5533.m12225();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23384.class == obj.getClass()) {
            C23384 c23384 = (C23384) obj;
            if (this.f74515.equals(c23384.f74515) && this.f74512.equals(c23384.f74512) && this.f74513.equals(c23384.f74513)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f74513.hashCode() + ((this.f74512.hashCode() + (this.f74515.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f74515.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f74512.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f74513.keySet().iterator();
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
