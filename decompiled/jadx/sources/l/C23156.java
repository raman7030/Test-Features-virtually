package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.alipay.sdk.m.l.d;
import com.alipay.sdk.m.t0.b;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes.dex */
public final class C23156 extends C11902 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final C23156 f74419 = new C23156(new C11868(), 0);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f74420;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f74421;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74422;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74423;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f74424;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74425;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74426;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74427;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f74428;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74429;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f74430;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74431;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74432;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74433;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean f74434;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f74435;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean f74436;

    public /* synthetic */ C23156(C11868 c11868, int i) {
        this(c11868);
    }

    static {
        C5368.m15341(1000, 1001, b.c, b.d, 1004);
        C5368.m15341(1005, 1006, 1007, 1008, 1009);
        C5368.m15341(d.a, 1011, 1012, 1013, 1014);
        C3603.m11056(1015);
        C3603.m11056(1016);
        C3603.m11056(1017);
        C3603.m11056(1018);
    }

    public C23156(C11868 c11868) {
        super(c11868);
        this.f74425 = c11868.f35392;
        this.f74429 = c11868.f35396;
        this.f74436 = c11868.f35403;
        this.f74432 = c11868.f35399;
        this.f74434 = c11868.f35401;
        this.f74424 = c11868.f35391;
        this.f74420 = c11868.f35387;
        this.f74435 = c11868.f35402;
        this.f74428 = c11868.f35395;
        this.f74427 = c11868.f35394;
        this.f74423 = c11868.f35390;
        this.f74426 = c11868.f35393;
        this.f74422 = c11868.f35389;
        this.f74433 = c11868.f35400;
        this.f74431 = c11868.f35398;
        this.f74421 = c11868.f35388;
        this.f74430 = c11868.f35397;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51337(int i) {
        return this.f74430.get(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51338(int i, C6181 c6181) {
        Map map = (Map) this.f74421.get(i);
        return map != null && map.containsKey(c6181);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13983 m51336(int i, C6181 c6181) {
        Map map = (Map) this.f74421.get(i);
        if (map != null) {
            return (C13983) map.get(c6181);
        }
        return null;
    }

    @Override // l.C11902
    /* JADX INFO: renamed from: ֫ */
    public final C6257 mo29029() {
        return new C11868(this);
    }

    @Override // l.C11902
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23156.class == obj.getClass()) {
            C23156 c23156 = (C23156) obj;
            if (super.equals(c23156) && this.f74425 == c23156.f74425 && this.f74429 == c23156.f74429 && this.f74436 == c23156.f74436 && this.f74432 == c23156.f74432 && this.f74434 == c23156.f74434 && this.f74424 == c23156.f74424 && this.f74420 == c23156.f74420 && this.f74435 == c23156.f74435 && this.f74428 == c23156.f74428 && this.f74427 == c23156.f74427 && this.f74423 == c23156.f74423 && this.f74426 == c23156.f74426 && this.f74422 == c23156.f74422 && this.f74433 == c23156.f74433 && this.f74431 == c23156.f74431) {
                SparseBooleanArray sparseBooleanArray = c23156.f74430;
                SparseBooleanArray sparseBooleanArray2 = this.f74430;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = c23156.f74421;
                    SparseArray sparseArray2 = this.f74421;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i2);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        C6181 c6181 = (C6181) entry.getKey();
                                        if (!map2.containsKey(c6181) || !C11003.equals(entry.getValue(), map2.get(c6181))) {
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

    @Override // l.C11902
    public final int hashCode() {
        return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f74425 ? 1 : 0)) * 31) + (this.f74429 ? 1 : 0)) * 31) + (this.f74436 ? 1 : 0)) * 31) + (this.f74432 ? 1 : 0)) * 31) + (this.f74434 ? 1 : 0)) * 31) + (this.f74424 ? 1 : 0)) * 31) + (this.f74420 ? 1 : 0)) * 31) + (this.f74435 ? 1 : 0)) * 31) + (this.f74428 ? 1 : 0)) * 31) + (this.f74427 ? 1 : 0)) * 31) + (this.f74423 ? 1 : 0)) * 31) + (this.f74426 ? 1 : 0)) * 31) + (this.f74422 ? 1 : 0)) * 31) + (this.f74433 ? 1 : 0)) * 31) + (this.f74431 ? 1 : 0);
    }
}
