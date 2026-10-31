package l;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۜ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAVA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6456 extends AbstractC18451 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f19948;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11556 f19949;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f19950;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Collection f19951;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map f19952;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object f19953;

    @Override // l.AbstractC18451
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17833(C11556 c11556, Object obj, Type type, Map map) {
    }

    public C6456(C11556 c11556, List list, int i) {
        super(null, null);
        this.f19949 = c11556;
        this.f19950 = i;
        this.f19948 = list;
        this.f19953 = null;
        this.f19952 = null;
        this.f19951 = null;
    }

    public C6456(Map map, Object obj) {
        super(null, null);
        this.f19949 = null;
        this.f19950 = -1;
        this.f19948 = null;
        this.f19953 = obj;
        this.f19952 = map;
        this.f19951 = null;
    }

    public C6456(Collection collection) {
        super(null, null);
        this.f19949 = null;
        this.f19950 = -1;
        this.f19948 = null;
        this.f19953 = null;
        this.f19952 = null;
        this.f19951 = collection;
    }

    @Override // l.AbstractC18451
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17832(Object obj, Object obj2) {
        C0972 c0972;
        Object objM3439;
        Map map = this.f19952;
        if (map != null) {
            map.put(this.f19953, obj2);
            return;
        }
        Collection collection = this.f19951;
        if (collection != null) {
            collection.add(obj2);
            return;
        }
        List list = this.f19948;
        int i = this.f19950;
        list.set(i, obj2);
        if (!(list instanceof C0972) || (objM3439 = (c0972 = (C0972) list).m3439()) == null || Array.getLength(objM3439) <= i) {
            return;
        }
        if (c0972.m3438() != null) {
            obj2 = C19426.m44734(obj2, c0972.m3438(), this.f19949.f34495);
        }
        Array.set(objM3439, i, obj2);
    }
}
