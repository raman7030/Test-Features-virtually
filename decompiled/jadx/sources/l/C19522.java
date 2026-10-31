package l;

import java.util.Collection;
import java.util.Collections;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩵ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19522 extends AbstractC13959 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f63089;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3999 f63090;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19522(C22343 c22343) {
        super(EnumC21101.PATCH_MODULE_PATH, EnumC0121.f1187);
        this.f63089 = c22343;
        this.f63090 = new C3999(c22343);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20401(EnumC0121 enumC0121, String str) {
        if (!this.f41662.contains(enumC0121)) {
            return false;
        }
        this.f41660 = true;
        C3999 c3999 = this.f63090;
        c3999.m12047();
        for (String str2 : str.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            int iIndexOf = str2.indexOf(61);
            C22343 c22343 = this.f63089;
            if (iIndexOf > 0) {
                String strSubstring = str2.substring(0, iIndexOf);
                C1176 c1176 = new C1176(c22343);
                c1176.m3980(str2.substring(iIndexOf + 1));
                c3999.m12048(new C16698(c22343, this, this.f41661.getName() + "[" + strSubstring + "]", strSubstring, c1176, false));
            } else {
                C22364 c22364 = c22343.f72411;
                C12281 c12281 = C6241.f19132;
                c22364.m7276(new C12281("compiler", "locn.invalid.arg.for.xpatch", str));
            }
        }
        return true;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo23053() {
        return !this.f63090.m12053();
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo6225() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final void mo20400(Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC13959, l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final void mo23049(Iterable iterable, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2050 mo23048(String str) {
        return this.f63090.m12046(str);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2050 mo23051(InterfaceC20758 interfaceC20758) {
        return this.f63090.m12051(interfaceC20758);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo23052() {
        return Collections.singleton(this.f63090.m12054());
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20402(InterfaceC20758 interfaceC20758) {
        return this.f63090.m12049(interfaceC20758);
    }
}
