package l;

/* JADX INFO: renamed from: l.ۜ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6YU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6457 extends C20025 {
    @Override // l.AbstractC5913
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo16573() {
        if (!super.mo16573() || !C13573.m32624("MULTI_PROCESS")) {
            return false;
        }
        int i = C8030.f24767;
        if (C9280.f28118.mo16573()) {
            return C15628.f48121.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
