package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes4.dex */
public final class C17018 implements InterfaceC12764 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f52182;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f52183;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14195 f52184;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f52185;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f52186;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f52187;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52188;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f52189;

    public C17018(C18430 c18430, C2887 c2887) {
        ArrayList arrayList = new ArrayList();
        this.f52186 = arrayList;
        this.f52184 = null;
        this.f52187 = false;
        this.f52188 = true;
        this.f52183 = -1;
        if (c2887 == null) {
            return;
        }
        c2887.m8827(this);
        if (this.f52182) {
            this.f52184.m33864((C14195) arrayList.get(this.f52183));
            arrayList.set(this.f52183, this.f52184);
            this.f52182 = false;
        }
        C14195 c14195 = this.f52184;
        if (c14195 != null) {
            arrayList.add(c14195);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m39973() {
        return this.f52186;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫ */
    public final void mo8823(float f, float f2) {
        boolean z = this.f52182;
        ArrayList arrayList = this.f52186;
        if (z) {
            this.f52184.m33864((C14195) arrayList.get(this.f52183));
            arrayList.set(this.f52183, this.f52184);
            this.f52182 = false;
        }
        C14195 c14195 = this.f52184;
        if (c14195 != null) {
            arrayList.add(c14195);
        }
        this.f52185 = f;
        this.f52189 = f2;
        this.f52184 = new C14195(f, f2, 0.0f, 0.0f);
        this.f52183 = arrayList.size();
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ۧ */
    public final void mo8828(float f, float f2) {
        this.f52184.m33863(f, f2);
        this.f52186.add(this.f52184);
        C14195 c14195 = this.f52184;
        this.f52184 = new C14195(f, f2, f - c14195.f42851, f2 - c14195.f42850);
        this.f52182 = false;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫ */
    public final void mo8825(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f52188 || this.f52187) {
            this.f52184.m33863(f, f2);
            this.f52186.add(this.f52184);
            this.f52187 = false;
        }
        this.f52184 = new C14195(f5, f6, f5 - f3, f6 - f4);
        this.f52182 = false;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫ */
    public final void mo8824(float f, float f2, float f3, float f4) {
        this.f52184.m33863(f, f2);
        this.f52186.add(this.f52184);
        this.f52184 = new C14195(f3, f4, f3 - f, f4 - f2);
        this.f52182 = false;
    }

    @Override // l.InterfaceC12764
    /* JADX INFO: renamed from: ֫ */
    public final void mo8826(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.f52187 = true;
        this.f52188 = false;
        C14195 c14195 = this.f52184;
        C18430.m42863(c14195.f42851, c14195.f42850, f, f2, f3, z, z2, f4, f5, this);
        this.f52188 = true;
        this.f52182 = false;
    }

    @Override // l.InterfaceC12764
    public final void close() {
        this.f52186.add(this.f52184);
        mo8828(this.f52185, this.f52189);
        this.f52182 = true;
    }
}
