package l;

import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: l.ᩴ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G71Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C18452 implements InterfaceC3635 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WebViewProviderFactoryBoundaryInterface f57231;

    public C18452(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f57231 = webViewProviderFactoryBoundaryInterface;
    }

    @Override // l.InterfaceC3635
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C16111.m38016(WebkitToCompatConverterBoundaryInterface.class, this.f57231.getWebkitToCompatConverter());
    }

    @Override // l.InterfaceC3635
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C16111.m38016(StaticsBoundaryInterface.class, this.f57231.getStatics());
    }

    @Override // l.InterfaceC3635
    /* JADX INFO: renamed from: ֫ */
    public final String[] mo5206() {
        return this.f57231.getSupportedFeatures();
    }

    @Override // l.InterfaceC3635
    public final DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) C16111.m38016(DropDataContentProviderBoundaryInterface.class, this.f57231.getDropDataProvider());
    }
}
