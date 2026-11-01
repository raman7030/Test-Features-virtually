package p067l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13648 extends C8315 {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f38396;

    /* JADX INFO: renamed from: ۖ֫ */
    public final SparseArray f38397;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f38398;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f38399;

    /* JADX INFO: renamed from: ۟ */
    public boolean f38400;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f38401;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f38402;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f38403;

    /* JADX INFO: renamed from: ܰ */
    public boolean f38404;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f38405;

    /* JADX INFO: renamed from: ܺ֫ */
    public final SparseBooleanArray f38406;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f38407;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f38408;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f38409;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f38410;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f38411;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f38412;

    public C13648() {
        this.f38397 = new SparseArray();
        this.f38406 = new SparseBooleanArray();
        this.f38401 = true;
        this.f38405 = false;
        this.f38412 = true;
        this.f38408 = false;
        this.f38410 = true;
        this.f38400 = false;
        this.f38396 = false;
        this.f38411 = false;
        this.f38404 = false;
        this.f38403 = true;
        this.f38399 = true;
        this.f38402 = true;
        this.f38398 = false;
        this.f38409 = true;
        this.f38407 = false;
    }

    public C13648(C24376 c24376) {
        super(c24376);
        this.f38401 = c24376.f77171;
        this.f38405 = c24376.f77175;
        this.f38412 = c24376.f77182;
        this.f38408 = c24376.f77178;
        this.f38410 = c24376.f77180;
        this.f38400 = c24376.f77170;
        this.f38396 = c24376.f77166;
        this.f38411 = c24376.f77181;
        this.f38404 = c24376.f77174;
        this.f38403 = c24376.f77173;
        this.f38399 = c24376.f77169;
        this.f38402 = c24376.f77172;
        this.f38398 = c24376.f77168;
        this.f38409 = c24376.f77179;
        this.f38407 = c24376.f77177;
        SparseArray sparseArray = c24376.f77167;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f38397 = sparseArray2;
        this.f38406 = c24376.f77176.clone();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31045(C13680 c13680) {
        m19205(c13680);
    }

    @Override // p067l.C8315
    /* JADX INFO: renamed from: ܽ */
    public final C8315 mo19207() {
        super.mo19207();
        return this;
    }

    @Override // p067l.C8315
    /* JADX INFO: renamed from: ֫ */
    public final C8315 mo19203(String[] strArr) {
        super.mo19203(strArr);
        return this;
    }

    @Override // p067l.C8315
    /* JADX INFO: renamed from: ᩳ */
    public final C8315 mo19208() {
        super.mo19208();
        return this;
    }

    @Override // p067l.C8315
    /* JADX INFO: renamed from: ۧ */
    public final C8315 mo19206() {
        super.mo19206();
        return this;
    }

    @Override // p067l.C8315
    /* JADX INFO: renamed from: ֫ */
    public final C8315 mo19202(C14350 c14350) {
        super.mo19202(c14350);
        return this;
    }

    @Override // p067l.C8315
    /* JADX INFO: renamed from: ֫ */
    public final C8315 mo19199(int i) {
        super.mo19199(i);
        return this;
    }

    @Override // p067l.C8315
    /* JADX INFO: renamed from: ֫ */
    public final C8315 mo19201(Set set) {
        super.mo19201(set);
        return this;
    }

    @Override // p067l.C8315
    /* JADX INFO: renamed from: ֫ */
    public final C8315 mo19200(int i, boolean z) {
        super.mo19200(i, z);
        return this;
    }

    @Override // p067l.C8315
    /* JADX INFO: renamed from: ֫ */
    public final C13680 mo19204() {
        return new C24376(this, 0);
    }
}
