package p067l;

/* JADX INFO: renamed from: l.ۜ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6YU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8505 extends C21400 {
    @Override // p067l.AbstractC7988
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo18499() {
        if (!super.mo18499() || !C15268.m34736("MULTI_PROCESS")) {
            return false;
        }
        int i = C10000.f27681;
        if (C11188.f31066.mo18499()) {
            return C17221.f51260.getStatics().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
