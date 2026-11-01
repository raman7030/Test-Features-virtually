package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩷ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2623 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22361 extends AbstractC16181 {

    /* JADX INFO: renamed from: ۙ */
    public static final AbstractC21730 f70563 = new C8949();

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC18987 f70564;

    /* JADX INFO: renamed from: ᩹ */
    public final String f70565;

    public C22361(String str, InterfaceC12262 interfaceC12262) {
        this.f70565 = str;
        this.f70564 = C25022.m54943(interfaceC12262);
    }

    public C22361(String str, InterfaceC18987 interfaceC18987) {
        this.f70565 = str;
        this.f70564 = interfaceC18987;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC8146 m50193(Collection collection) {
        return f70563.m49012((Iterable) collection);
    }

    @Override // p067l.InterfaceC11180
    public final String getName() {
        return this.f70565;
    }

    @Override // p067l.InterfaceC11180
    public final InterfaceC12262 getValue() {
        return this.f70564;
    }
}
