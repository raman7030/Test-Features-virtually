package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11868 extends C6257 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f35387;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f35388;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f35389;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f35390;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f35391;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f35392;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f35393;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f35394;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f35395;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f35396;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f35397;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f35398;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f35399;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f35400;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f35401;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f35402;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f35403;

    public C11868() {
        this.f35388 = new SparseArray();
        this.f35397 = new SparseBooleanArray();
        this.f35392 = true;
        this.f35396 = false;
        this.f35403 = true;
        this.f35399 = false;
        this.f35401 = true;
        this.f35391 = false;
        this.f35387 = false;
        this.f35402 = false;
        this.f35395 = false;
        this.f35394 = true;
        this.f35390 = true;
        this.f35393 = true;
        this.f35389 = false;
        this.f35400 = true;
        this.f35398 = false;
    }

    public C11868(C23156 c23156) {
        super(c23156);
        this.f35392 = c23156.f74425;
        this.f35396 = c23156.f74429;
        this.f35403 = c23156.f74436;
        this.f35399 = c23156.f74432;
        this.f35401 = c23156.f74434;
        this.f35391 = c23156.f74424;
        this.f35387 = c23156.f74420;
        this.f35402 = c23156.f74435;
        this.f35395 = c23156.f74428;
        this.f35394 = c23156.f74427;
        this.f35390 = c23156.f74423;
        this.f35393 = c23156.f74426;
        this.f35389 = c23156.f74422;
        this.f35400 = c23156.f74433;
        this.f35398 = c23156.f74431;
        SparseArray sparseArray = c23156.f74421;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.f35388 = sparseArray2;
        this.f35397 = c23156.f74430.clone();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28994(C11902 c11902) {
        m17267(c11902);
    }

    @Override // l.C6257
    /* JADX INFO: renamed from: ܽ */
    public final C6257 mo17269() {
        super.mo17269();
        return this;
    }

    @Override // l.C6257
    /* JADX INFO: renamed from: ֫ */
    public final C6257 mo17265(String[] strArr) {
        super.mo17265(strArr);
        return this;
    }

    @Override // l.C6257
    /* JADX INFO: renamed from: ᩳ */
    public final C6257 mo17270() {
        super.mo17270();
        return this;
    }

    @Override // l.C6257
    /* JADX INFO: renamed from: ۧ */
    public final C6257 mo17268() {
        super.mo17268();
        return this;
    }

    @Override // l.C6257
    /* JADX INFO: renamed from: ֫ */
    public final C6257 mo17264(C12607 c12607) {
        super.mo17264(c12607);
        return this;
    }

    @Override // l.C6257
    /* JADX INFO: renamed from: ֫ */
    public final C6257 mo17261(int i) {
        super.mo17261(i);
        return this;
    }

    @Override // l.C6257
    /* JADX INFO: renamed from: ֫ */
    public final C6257 mo17263(Set set) {
        super.mo17263(set);
        return this;
    }

    @Override // l.C6257
    /* JADX INFO: renamed from: ֫ */
    public final C6257 mo17262(int i, boolean z) {
        super.mo17262(i, z);
        return this;
    }

    @Override // l.C6257
    /* JADX INFO: renamed from: ֫ */
    public final C11902 mo17266() {
        return new C23156(this, 0);
    }
}
