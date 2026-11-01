package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩵᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H528 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21118 extends C4965 {

    /* JADX INFO: renamed from: ۗ */
    public List[] f66377;

    /* JADX INFO: renamed from: ۙ */
    public C9342 f66378;

    /* JADX INFO: renamed from: ᩶ */
    public C19776 f66379;

    /* JADX INFO: renamed from: ᩸ */
    public int f66380;

    /* JADX INFO: renamed from: ᩹ */
    public ArrayList f66381;

    @Override // p067l.InterfaceC20467
    /* JADX INFO: renamed from: ֫ */
    public final C13071 mo10691(String str, EnumC18254 enumC18254) {
        if (this.f66381 == null) {
            this.f66381 = new ArrayList(5);
        }
        C13071 c13071 = new C13071(str, enumC18254);
        this.f66381.add(c13071);
        return c13071;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20467 m47743(int i) {
        C9342 c9342 = this.f66378;
        if (this.f66377 == null) {
            this.f66377 = new List[c9342.m21677().length];
        }
        if (i >= this.f66377.length) {
            System.err.println("WARN: parameter out-of-range in " + c9342);
            return null;
        }
        return new C20447(this, i);
    }
}
