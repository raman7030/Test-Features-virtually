package p067l;

import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: l.ᩴ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G71Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C19905 implements InterfaceC5823 {

    /* JADX INFO: renamed from: ֫ */
    public final WebViewProviderFactoryBoundaryInterface f60449;

    public C19905(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f60449 = webViewProviderFactoryBoundaryInterface;
    }

    @Override // p067l.InterfaceC5823
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C17680.m40207(WebkitToCompatConverterBoundaryInterface.class, this.f60449.getWebkitToCompatConverter());
    }

    @Override // p067l.InterfaceC5823
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C17680.m40207(StaticsBoundaryInterface.class, this.f60449.getStatics());
    }

    @Override // p067l.InterfaceC5823
    /* JADX INFO: renamed from: ֫ */
    public final String[] mo7433() {
        return this.f60449.getSupportedFeatures();
    }

    @Override // p067l.InterfaceC5823
    public final DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) C17680.m40207(DropDataContentProviderBoundaryInterface.class, this.f60449.getDropDataProvider());
    }
}
