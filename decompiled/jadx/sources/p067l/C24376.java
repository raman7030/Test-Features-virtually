package p067l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.alipay.sdk.p010m.p033l.C0164d;
import com.alipay.sdk.p010m.p050t0.C0215b;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes.dex */
public final class C24376 extends C13680 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final C24376 f77165 = new C24376(new C13648(), 0);

    /* JADX INFO: renamed from: ֫֫ */
    public final boolean f77166;

    /* JADX INFO: renamed from: ۖ֫ */
    public final SparseArray f77167;

    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean f77168;

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean f77169;

    /* JADX INFO: renamed from: ۟ */
    public final boolean f77170;

    /* JADX INFO: renamed from: ۡ֫ */
    public final boolean f77171;

    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean f77172;

    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean f77173;

    /* JADX INFO: renamed from: ܰ */
    public final boolean f77174;

    /* JADX INFO: renamed from: ܳ֫ */
    public final boolean f77175;

    /* JADX INFO: renamed from: ܺ֫ */
    public final SparseBooleanArray f77176;

    /* JADX INFO: renamed from: ܽ֫ */
    public final boolean f77177;

    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean f77178;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean f77179;

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean f77180;

    /* JADX INFO: renamed from: ᩺ */
    public final boolean f77181;

    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean f77182;

    public /* synthetic */ C24376(C13648 c13648, int i) {
        this(c13648);
    }

    static {
        C7470.m17250(1000, 1001, C0215b.f1000c, C0215b.f1001d, 1004);
        C7470.m17250(1005, 1006, 1007, 1008, 1009);
        C7470.m17250(C0164d.f561a, 1011, 1012, 1013, 1014);
        C5792.m13032(1015);
        C5792.m13032(1016);
        C5792.m13032(1017);
        C5792.m13032(1018);
    }

    public C24376(C13648 c13648) {
        super(c13648);
        this.f77171 = c13648.f38401;
        this.f77175 = c13648.f38405;
        this.f77182 = c13648.f38412;
        this.f77178 = c13648.f38408;
        this.f77180 = c13648.f38410;
        this.f77170 = c13648.f38400;
        this.f77166 = c13648.f38396;
        this.f77181 = c13648.f38411;
        this.f77174 = c13648.f38404;
        this.f77173 = c13648.f38403;
        this.f77169 = c13648.f38399;
        this.f77172 = c13648.f38402;
        this.f77168 = c13648.f38398;
        this.f77179 = c13648.f38409;
        this.f77177 = c13648.f38407;
        this.f77167 = c13648.f38397;
        this.f77176 = c13648.f38406;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53732(int i) {
        return this.f77176.get(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public final boolean m53733(int i, C8243 c8243) {
        Map map = (Map) this.f77167.get(i);
        return map != null && map.containsKey(c8243);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final C15658 m53731(int i, C8243 c8243) {
        Map map = (Map) this.f77167.get(i);
        if (map != null) {
            return (C15658) map.get(c8243);
        }
        return null;
    }

    @Override // p067l.C13680
    /* JADX INFO: renamed from: ֫ */
    public final C8315 mo31081() {
        return new C13648(this);
    }

    @Override // p067l.C13680
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C24376.class == obj.getClass()) {
            C24376 c24376 = (C24376) obj;
            if (super.equals(c24376) && this.f77171 == c24376.f77171 && this.f77175 == c24376.f77175 && this.f77182 == c24376.f77182 && this.f77178 == c24376.f77178 && this.f77180 == c24376.f77180 && this.f77170 == c24376.f77170 && this.f77166 == c24376.f77166 && this.f77181 == c24376.f77181 && this.f77174 == c24376.f77174 && this.f77173 == c24376.f77173 && this.f77169 == c24376.f77169 && this.f77172 == c24376.f77172 && this.f77168 == c24376.f77168 && this.f77179 == c24376.f77179 && this.f77177 == c24376.f77177) {
                SparseBooleanArray sparseBooleanArray = c24376.f77176;
                SparseBooleanArray sparseBooleanArray2 = this.f77176;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = c24376.f77167;
                    SparseArray sparseArray2 = this.f77167;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        C8243 c8243 = (C8243) entry.getKey();
                                        if (!map2.containsKey(c8243) || !C12826.equals(entry.getValue(), map2.get(c8243))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p067l.C13680
    public final int hashCode() {
        return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f77171 ? 1 : 0)) * 31) + (this.f77175 ? 1 : 0)) * 31) + (this.f77182 ? 1 : 0)) * 31) + (this.f77178 ? 1 : 0)) * 31) + (this.f77180 ? 1 : 0)) * 31) + (this.f77170 ? 1 : 0)) * 31) + (this.f77166 ? 1 : 0)) * 31) + (this.f77181 ? 1 : 0)) * 31) + (this.f77174 ? 1 : 0)) * 31) + (this.f77173 ? 1 : 0)) * 31) + (this.f77169 ? 1 : 0)) * 31) + (this.f77172 ? 1 : 0)) * 31) + (this.f77168 ? 1 : 0)) * 31) + (this.f77179 ? 1 : 0)) * 31) + (this.f77177 ? 1 : 0);
    }
}
