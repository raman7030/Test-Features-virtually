package p067l;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7748 extends C8792 {

    /* JADX INFO: renamed from: ۗ */
    public final C19818 f20314;

    /* JADX INFO: renamed from: ۙ */
    public C15477 f20315;

    /* JADX INFO: renamed from: ۛ */
    public C9443 f20316;

    /* JADX INFO: renamed from: ۤ */
    public final C18476 f20317;

    /* JADX INFO: renamed from: ۨ */
    public C4395 f20318;

    /* JADX INFO: renamed from: ۫ */
    public final C16464 f20319;

    /* JADX INFO: renamed from: ۬ */
    public final C19147 f20320;

    /* JADX INFO: renamed from: ܰ */
    public C13113 f20321;

    /* JADX INFO: renamed from: ᩶ */
    public C21016 f20322;

    /* JADX INFO: renamed from: ᩺ */
    public C24195 f20323;

    /* JADX INFO: renamed from: ۧ */
    public static void m17900(C7748 c7748, C23697 c23697, Set set) {
        C3580 c3580 = (C3580) c23697;
        c7748.f20322.m47370(new C7604(c3580.m7172(), (String) c3580.f22917, c3580.m6582()), set);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17899(C7748 c7748, C23697 c23697, Set set) {
        C3580 c3580 = (C3580) c23697;
        c7748.f20322.m47371(new C16990(c3580.m7172(), (String) c3580.f22917, c3580.m6582()), set);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m17901(C7748 c7748, C23697 c23697, Set set) {
        c7748.f20322.m47373(new C23027(c23697.m7172(), (String) c23697.f22917), set);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17898(C7748 c7748, C23697 c23697) {
        c7748.f20322.m47372(new C21686(c23697.m7172(), (String) c23697.f22917));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.ܳ᩺ۚ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ܰۨۚ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.۟ۨۚ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.֫᩺ۚ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۧ᩺ۚ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ᩳ᩺ۚ] */
    public C7748(final C15496 c15496) {
        super(c15496.f40167, EnumC6799.f17652);
        this.f20323 = new C24195(this);
        this.f20315 = new BiConsumer() { // from class: l.ܰۨۚ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C7748.m17900(this.f44192, (C23697) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C19355.$default$andThen(this, biConsumer);
            }
        };
        this.f20316 = new BiConsumer() { // from class: l.۟ۨۚ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C7748.m17899(this.f25775, (C23697) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C19355.$default$andThen(this, biConsumer);
            }
        };
        this.f20318 = new BiConsumer() { // from class: l.֫᩺ۚ
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C7748.m17901(this.f9879, (C23697) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C19355.$default$andThen(this, biConsumer);
            }
        };
        this.f20321 = new Consumer() { // from class: l.ۧ᩺ۚ
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                C7748.m17898(this.f36840, (C23697) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }
        };
        this.f20322 = new C21016();
        this.f20317 = new C18476(c15496);
        this.f20314 = new Function() { // from class: l.ᩳ᩺ۚ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C5263 c5263 = c15496.f40167;
                c5263.getClass();
                return c5263.m11357(EnumC12758.f35925, (C23697) obj);
            }
        };
        this.f20320 = new C19147(c15496);
        this.f20319 = new Function() { // from class: l.ܳ᩺ۚ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C5263 c5263 = c15496.f40167;
                c5263.getClass();
                return c5263.m11357(EnumC12758.f35894, (C23697) obj);
            }
        };
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m17904() {
        this.f20322.m47374(EnumC8140.f21483.m18907());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17903(String str) {
        this.f20322.m47368(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17902(int i) {
        this.f20322.m47364(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m17905() {
        C5592 c5592M47363 = this.f20322.m47363();
        EnumC9089 enumC9089 = EnumC9089.f24635;
        C10286 c10286 = c5592M47363.f13540;
        C19147 c19147 = this.f20320;
        C18476 c18476 = this.f20317;
        enumC9089.f24642 = new C22501(c10286, c19147, c18476);
        enumC9089.f24637 = new C3053(c5592M47363.f13543, c19147, c18476);
        Map map = c5592M47363.f13541;
        C16464 c16464 = this.f20319;
        enumC9089.f24641 = new C20489(map, c16464, c19147);
        enumC9089.f24640 = new C20489(c5592M47363.f13545, c16464, c19147);
        Set set = c5592M47363.f13542;
        C19818 c19818 = this.f20314;
        enumC9089.f24639 = new C3053(set, c19818, null);
        enumC9089.f24638 = new C20489(c5592M47363.f13544, c19818, c19818);
    }

    @Override // p067l.C8792
    /* JADX INFO: renamed from: ܽ */
    public final int mo7908() {
        return EnumC9089.f24635.getLength();
    }

    @Override // p067l.C8792, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo5157(interfaceC2756);
        EnumC9089.f24635.mo5157(interfaceC2756);
    }
}
