package p067l;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֫֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3771 {

    /* JADX INFO: renamed from: ֫ */
    public final int f8058;

    /* JADX INFO: renamed from: ۜ */
    public final Map f8059;

    /* JADX INFO: renamed from: ۡ */
    public final C7933 f8060;

    /* JADX INFO: renamed from: ۢ */
    public final C9982 f8061;

    /* JADX INFO: renamed from: ۧ */
    public final int f8062;

    /* JADX INFO: renamed from: ܳ */
    public final BitSet f8063;

    /* JADX INFO: renamed from: ܺ */
    public final C9235 f8064;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f8065;

    /* JADX INFO: renamed from: ܿ */
    public final int f8066;

    /* JADX INFO: renamed from: ᩳ */
    public final int f8067;

    /* JADX INFO: renamed from: ᩷ */
    public volatile C11365 f8068;

    /* JADX INFO: renamed from: ᩻ */
    public final C7933 f8069;

    public C3771(C7933 c7933, C7933 c7934, int i, int i2, int i3, int i4, C9235 c9235, boolean z, BitSet bitSet, Map map, C9982 c9982) {
        this.f8060 = c7933;
        this.f8069 = c7934;
        this.f8062 = i;
        this.f8058 = i2;
        this.f8067 = i3;
        this.f8066 = i4;
        this.f8064 = c9235;
        this.f8065 = z;
        this.f8063 = bitSet == null ? null : (BitSet) bitSet.clone();
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C12826.requireNonNull(key);
            Object value = entry.getValue();
            C12826.requireNonNull(value);
            map2.put(key, value);
        }
        this.f8059 = C21562.unmodifiableMap(map2);
        this.f8061 = c9982;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11365 m7347() {
        C11365 c11365M10507;
        C11365 c11365 = this.f8068;
        if (c11365 != null) {
            return c11365;
        }
        synchronized (this) {
            c11365M10507 = this.f8068;
            if (c11365M10507 == null) {
                this.f8061.getClass();
                c11365M10507 = C4954.m10507(this);
                this.f8068 = c11365M10507;
            }
        }
        return c11365M10507;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m7348(int i) {
        BitSet bitSet = this.f8063;
        return bitSet != null && bitSet.get(i);
    }
}
