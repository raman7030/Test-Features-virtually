package p067l;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAVA */
/* JADX INFO: loaded from: classes3.dex */
public final class C8504 extends AbstractC19904 {

    /* JADX INFO: renamed from: ۜ */
    public final List f22821;

    /* JADX INFO: renamed from: ۢ */
    public final C13351 f22822;

    /* JADX INFO: renamed from: ܳ */
    public final int f22823;

    /* JADX INFO: renamed from: ܿ */
    public final Collection f22824;

    /* JADX INFO: renamed from: ᩷ */
    public final Map f22825;

    /* JADX INFO: renamed from: ᩻ */
    public final Object f22826;

    @Override // p067l.AbstractC19904
    /* JADX INFO: renamed from: ֫ */
    public final void mo19780(C13351 c13351, Object obj, Type type, Map map) {
    }

    public C8504(C13351 c13351, List list, int i) {
        super(null, null);
        this.f22822 = c13351;
        this.f22823 = i;
        this.f22821 = list;
        this.f22826 = null;
        this.f22825 = null;
        this.f22824 = null;
    }

    public C8504(Map map, Object obj) {
        super(null, null);
        this.f22822 = null;
        this.f22823 = -1;
        this.f22821 = null;
        this.f22826 = obj;
        this.f22825 = map;
        this.f22824 = null;
    }

    public C8504(Collection collection) {
        super(null, null);
        this.f22822 = null;
        this.f22823 = -1;
        this.f22821 = null;
        this.f22826 = null;
        this.f22825 = null;
        this.f22824 = collection;
    }

    @Override // p067l.AbstractC19904
    /* JADX INFO: renamed from: ֫ */
    public final void mo19779(Object obj, Object obj2) {
        C3292 c3292;
        Object objM5742;
        Map map = this.f22825;
        if (map != null) {
            map.put(this.f22826, obj2);
            return;
        }
        Collection collection = this.f22824;
        if (collection != null) {
            collection.add(obj2);
            return;
        }
        List list = this.f22821;
        int i = this.f22823;
        list.set(i, obj2);
        if (!(list instanceof C3292) || (objM5742 = (c3292 = (C3292) list).m5742()) == null || Array.getLength(objM5742) <= i) {
            return;
        }
        if (c3292.m5741() != null) {
            obj2 = C20831.m47028(obj2, c3292.m5741(), this.f22822.f37492);
        }
        Array.set(objM5742, i, obj2);
    }
}
