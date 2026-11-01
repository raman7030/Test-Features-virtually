package p067l;

import java.util.Collection;
import java.util.Collections;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩵ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20922 extends AbstractC15635 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C23603 f65709;

    /* JADX INFO: renamed from: ᩳ */
    public final C6169 f65710;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20922(C23603 c23603) {
        super(EnumC22423.PATCH_MODULE_PATH, EnumC2483.f3963);
        this.f65709 = c23603;
        this.f65710 = new C6169(c23603);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22380(EnumC2483 enumC2483, String str) {
        if (!this.f44742.contains(enumC2483)) {
            return false;
        }
        this.f44740 = true;
        C6169 c6169 = this.f65710;
        c6169.m13967();
        for (String str2 : str.split(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            int iIndexOf = str2.indexOf(61);
            C23603 c23603 = this.f65709;
            if (iIndexOf > 0) {
                String strSubstring = str2.substring(0, iIndexOf);
                C3486 c3486 = new C3486(c23603);
                c3486.m6222(str2.substring(iIndexOf + 1));
                c6169.m13968(new C18238(c23603, this, this.f44741.getName() + "[" + strSubstring + "]", strSubstring, c3486, false));
            } else {
                C23623 c23623 = c23603.f75137;
                C14040 c14040 = C8300.f21997;
                c23623.m9355(new C14040("compiler", "locn.invalid.arg.for.xpatch", str));
            }
        }
        return true;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo25027() {
        return !this.f65710.m13973();
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo8427() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo22379(Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15635, p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo25023(Iterable iterable, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4317 mo25022(String str) {
        return this.f65710.m13966(str);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4317 mo25025(InterfaceC22097 interfaceC22097) {
        return this.f65710.m13971(interfaceC22097);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo25026() {
        return Collections.singleton(this.f65710.m13974());
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22381(InterfaceC22097 interfaceC22097) {
        return this.f65710.m13969(interfaceC22097);
    }
}
