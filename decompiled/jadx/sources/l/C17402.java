package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܿܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P2S7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17402 extends AbstractC8185 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC20288 f53247;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9642 f53248;

    public C17402(C9642 c9642, InterfaceC20288 interfaceC20288) {
        this.f53248 = c9642;
        this.f53247 = interfaceC20288;
    }

    @Override // l.InterfaceC20288
    public final List getValue() {
        return new C16262(this.f53248.f29217.m39241(), this.f53247.getValue());
    }
}
