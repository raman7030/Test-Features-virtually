package l;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5660 extends C6759 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18360 f17467;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13793 f17468;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C7444 f17469;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16948 f17470;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2132 f17471;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14831 f17472;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17654 f17473;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11305 f17474;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19621 f17475;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22966 f17476;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m15971(C5660 c5660, C22442 c22442, Set set) {
        C1275 c1275 = (C1275) c22442;
        c5660.f17475.m45074(new C5509(c1275.m4929(), (String) c1275.f20043, c1275.m4336()), set);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15970(C5660 c5660, C22442 c22442, Set set) {
        C1275 c1275 = (C1275) c22442;
        c5660.f17475.m45075(new C15385(c1275.m4929(), (String) c1275.f20043, c1275.m4336()), set);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m15972(C5660 c5660, C22442 c22442, Set set) {
        c5660.f17475.m45077(new C21737(c22442.m4929(), (String) c22442.f20043), set);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15969(C5660 c5660, C22442 c22442) {
        c5660.f17475.m45076(new C20326(c22442.m4929(), (String) c22442.f20043));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.ܳ᩺ۚ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ܰۨۚ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.۟ۨۚ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.֫᩺ۚ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۧ᩺ۚ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ᩳ᩺ۚ] */
    public C5660(final C13813 c13813) {
        super(c13813.f37150, EnumC4662.f14822);
        this.f17476 = new C22966(this);
        this.f17468 = new BiConsumer() { // from class: l.ܰۨۚ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C5660.m15971(this.f41114, (C22442) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C17873.$default$andThen(this, biConsumer);
            }
        };
        this.f17469 = new BiConsumer() { // from class: l.۟ۨۚ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C5660.m15970(this.f22863, (C22442) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C17873.$default$andThen(this, biConsumer);
            }
        };
        this.f17471 = new BiConsumer() { // from class: l.֫᩺ۚ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C5660.m15972(this.f7093, (C22442) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C17873.$default$andThen(this, biConsumer);
            }
        };
        this.f17474 = new Consumer() { // from class: l.ۧ᩺ۚ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C5660.m15969(this.f33840, (C22442) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        };
        this.f17475 = new C19621();
        this.f17470 = new C16948(c13813);
        this.f17467 = new Function() { // from class: l.ᩳ᩺ۚ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C3046 c3046 = c13813.f37150;
                c3046.getClass();
                return c3046.m9315(EnumC10932.f32947, (C22442) obj);
            }
        };
        this.f17473 = new C17654(c13813);
        this.f17472 = new Function() { // from class: l.ܳ᩺ۚ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C3046 c3046 = c13813.f37150;
                c3046.getClass();
                return c3046.m9315(EnumC10932.f32916, (C22442) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m15975() {
        this.f17475.m45078(EnumC6073.f18627.m16978());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15974(String str) {
        this.f17475.m45072(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15973(int i) {
        this.f17475.m45068(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m15976() {
        C3392 c3392M45067 = this.f17475.m45067();
        EnumC7071 enumC7071 = EnumC7071.f21754;
        C8331 c8331 = c3392M45067.f10733;
        C17654 c17654 = this.f17473;
        C16948 c16948 = this.f17470;
        enumC7071.f21761 = new C21183(c8331, c17654, c16948);
        enumC7071.f21756 = new C0720(c3392M45067.f10736, c17654, c16948);
        Map map = c3392M45067.f10734;
        C14831 c14831 = this.f17472;
        enumC7071.f21760 = new C19066(map, c14831, c17654);
        enumC7071.f21759 = new C19066(c3392M45067.f10738, c14831, c17654);
        Set set = c3392M45067.f10735;
        C18360 c18360 = this.f17467;
        enumC7071.f21758 = new C0720(set, c18360, null);
        enumC7071.f21757 = new C19066(c3392M45067.f10737, c18360, c18360);
    }

    @Override // l.C6759
    /* JADX INFO: renamed from: ܽ */
    public final int mo5678() {
        return EnumC7071.f21754.getLength();
    }

    @Override // l.C6759, l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo2828(interfaceC0408);
        EnumC7071.f21754.mo2828(interfaceC0408);
    }
}
