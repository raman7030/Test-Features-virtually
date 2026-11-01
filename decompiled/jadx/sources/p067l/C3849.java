package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.֫ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3849 extends AbstractC19312 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C17930 f8284;

    /* JADX INFO: renamed from: ᩸ */
    public final Object f8285;

    /* JADX INFO: renamed from: ᩹ */
    public int f8286;

    public C3849(C17930 c17930, int i) {
        this.f8284 = c17930;
        this.f8285 = C17930.m40760(c17930, i);
        this.f8286 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8285;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m7560() {
        int i = this.f8286;
        Object obj = this.f8285;
        C17930 c17930 = this.f8284;
        if (i == -1 || i >= c17930.size() || !C12826.equals(obj, C17930.m40760(c17930, this.f8286))) {
            this.f8286 = c17930.m40758(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C17930 c17930 = this.f8284;
        Map mapM40779 = c17930.m40779();
        if (mapM40779 != null) {
            return mapM40779.get(this.f8285);
        }
        m7560();
        int i = this.f8286;
        if (i == -1) {
            return null;
        }
        return C17930.m40768(c17930, i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C17930 c17930 = this.f8284;
        Map mapM40779 = c17930.m40779();
        Object obj2 = this.f8285;
        if (mapM40779 != null) {
            return mapM40779.put(obj2, obj);
        }
        m7560();
        int i = this.f8286;
        if (i == -1) {
            c17930.put(obj2, obj);
            return null;
        }
        Object objM40768 = C17930.m40768(c17930, i);
        C17930.m40762(c17930, this.f8286, obj);
        return objM40768;
    }
}
