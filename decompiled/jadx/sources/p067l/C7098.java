package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۙ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7098 extends AbstractC22049 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21378 f18503;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7098(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, EnumSet enumSet) {
        super(c21378, abstractC12224, enumC18497, enumSet);
        this.f18503 = c21378;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12848(EnumC8637 enumC8637) {
        return super.mo12848(enumC8637) && this.f18503.f67389;
    }

    @Override // p067l.AbstractC22049
    /* JADX INFO: renamed from: ֫ */
    public final void mo5187(int i, AbstractC7783 abstractC7783) {
        C4848 c4848M45783;
        C4848 c4848M45784;
        if (abstractC7783.f20405 == EnumC3600.f7354) {
            AbstractC7783 abstractC7784 = abstractC7783.f20407;
            if (abstractC7784.f20405 == EnumC3600.f7340) {
                C2417 c2417 = (C2417) abstractC7784;
                EnumSet enumSet = c2417.f3692;
                C20271 c20271 = new C20271();
                C21378 c21378 = this.f18503;
                C21457 c21457 = c21378.f67409;
                char cM48439 = c21378.m48439();
                C8200 c8200 = c21378.f67427;
                C12826.requireNonNull(c8200);
                AbstractC12224 abstractC12224 = (AbstractC12224) c21457.m48598(cM48439, new C24868(c8200));
                AbstractC12224 abstractC12225 = c21378.f67424.f20408;
                if (abstractC12225 != abstractC12224) {
                    throw c21378.m48431("module.name.mismatch", abstractC12224, abstractC12225);
                }
                char cM484310 = c21378.m48439();
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC19853.class);
                for (EnumC19853 enumC19853 : EnumC19853.values()) {
                    if ((enumC19853.f60349 & cM484310) != 0) {
                        enumSetNoneOf.add(enumC19853);
                    }
                }
                enumSet.addAll(enumSetNoneOf);
                char cM484311 = c21378.m48439();
                C21457 c21458 = c21378.f67409;
                C12826.requireNonNull(c21458);
                c2417.f3688 = (AbstractC12224) C21378.m48418(cM484311, new C16485(c21458), (Object) null);
                C20271 c20272 = new C20271();
                char cM484312 = c21378.m48439();
                for (int i2 = 0; i2 < cM484312; i2++) {
                    C2417 c2417M48601 = c21378.f67409.m48601(c21378.m48439());
                    char cM484313 = c21378.m48439();
                    EnumSet enumSetNoneOf2 = EnumSet.noneOf(EnumC10977.class);
                    for (EnumC10977 enumC10977 : EnumC10977.values()) {
                        if ((enumC10977.f30413 & cM484313) != 0) {
                            enumSetNoneOf2.add(enumC10977);
                        }
                    }
                    if (c2417M48601 == c21378.f67412.f69191 && c21378.f67400 >= EnumC18497.V54.f55255) {
                        EnumC10977 enumC10978 = EnumC10977.TRANSITIVE;
                        if (enumSetNoneOf2.contains(enumC10978)) {
                            throw c21378.m48431("bad.requires.flag", enumC10978);
                        }
                        EnumC10977 enumC10979 = EnumC10977.STATIC_PHASE;
                        if (enumSetNoneOf2.contains(enumC10979)) {
                            throw c21378.m48431("bad.requires.flag", enumC10979);
                        }
                    }
                    c21378.m48439();
                    c20272.m45777(new C11648(c2417M48601, enumSetNoneOf2));
                }
                C4848 c4848M45785 = c20272.m45783();
                c2417.f3705 = c4848M45785;
                c20271.addAll(c4848M45785);
                C20271 c20273 = new C20271();
                char cM484314 = c21378.m48439();
                for (int i3 = 0; i3 < cM484314; i3++) {
                    C9794 c9794M48599 = c21378.f67409.m48599(c21378.m48439());
                    char cM484315 = c21378.m48439();
                    EnumSet enumSetNoneOf3 = EnumSet.noneOf(EnumC16340.class);
                    for (EnumC16340 enumC16340 : EnumC16340.values()) {
                        if ((enumC16340.f48017 & cM484315) != 0) {
                            enumSetNoneOf3.add(enumC16340);
                        }
                    }
                    char cM484316 = c21378.m48439();
                    if (cM484316 == 0) {
                        c4848M45784 = null;
                    } else {
                        C20271 c20274 = new C20271();
                        for (int i4 = 0; i4 < cM484316; i4++) {
                            c20274.m45777(c21378.f67409.m48601(c21378.m48439()));
                        }
                        c4848M45784 = c20274.m45783();
                    }
                    c20273.m45777(new C19023(c9794M48599, c4848M45784, enumSetNoneOf3));
                }
                C4848 c4848M45786 = c20273.m45783();
                c2417.f3697 = c4848M45786;
                c20271.addAll(c4848M45786);
                C20271 c20275 = new C20271();
                char cM484317 = c21378.m48439();
                if (cM484317 != 0 && enumSet.contains(EnumC19853.OPEN)) {
                    throw c21378.m48431("module.non.zero.opens", c21378.f67424.f20408);
                }
                for (int i5 = 0; i5 < cM484317; i5++) {
                    C9794 c9794M485910 = c21378.f67409.m48599(c21378.m48439());
                    char cM484318 = c21378.m48439();
                    EnumSet enumSetNoneOf4 = EnumSet.noneOf(EnumC8965.class);
                    for (EnumC8965 enumC8965 : EnumC8965.values()) {
                        if ((enumC8965.f24288 & cM484318) != 0) {
                            enumSetNoneOf4.add(enumC8965);
                        }
                    }
                    char cM484319 = c21378.m48439();
                    if (cM484319 == 0) {
                        c4848M45783 = null;
                    } else {
                        C20271 c20276 = new C20271();
                        for (int i6 = 0; i6 < cM484319; i6++) {
                            c20276.m45777(c21378.f67409.m48601(c21378.m48439()));
                        }
                        c4848M45783 = c20276.m45783();
                    }
                    c20275.m45777(new C25058(c9794M485910, c4848M45783, enumSetNoneOf4));
                }
                C4848 c4848M45787 = c20275.m45783();
                c2417.f3695 = c4848M45787;
                c20271.addAll(c4848M45787);
                c2417.f3696 = c20271.m45783();
                C20271 c20277 = new C20271();
                char cM484320 = c21378.m48439();
                for (int i7 = 0; i7 < cM484320; i7++) {
                    c20277.m45777(new C20708((AbstractC12224) c21378.f67409.m48595(c21378.m48439(), new InterfaceC14905() { // from class: l.᩶᩻۠
                        @Override // p067l.InterfaceC14905
                        /* JADX INFO: renamed from: ֫ */
                        public final Object mo25191(int i8, int i9, byte[] bArr) {
                            return this.f68751.f18503.f67427.m18989(C19839.m45083(i8, i9, bArr));
                        }
                    })));
                }
                c21378.f67387 = c20277.m45783();
                C20271 c20278 = new C20271();
                char cM484321 = c21378.m48439();
                for (int i8 = 0; i8 < cM484321; i8++) {
                    AbstractC12224 abstractC12226 = (AbstractC12224) c21378.f67409.m48595(c21378.m48439(), new InterfaceC14905() { // from class: l.᩶᩻۠
                        @Override // p067l.InterfaceC14905
                        /* JADX INFO: renamed from: ֫ */
                        public final Object mo25191(int i9, int i10, byte[] bArr) {
                            return this.f68751.f18503.f67427.m18989(C19839.m45083(i9, i10, bArr));
                        }
                    });
                    char cM484322 = c21378.m48439();
                    C20271 c20279 = new C20271();
                    for (int i9 = 0; i9 < cM484322; i9++) {
                        c20279.m45777((AbstractC12224) c21378.f67409.m48595(c21378.m48439(), new InterfaceC14905() { // from class: l.᩶᩻۠
                            @Override // p067l.InterfaceC14905
                            /* JADX INFO: renamed from: ֫ */
                            public final Object mo25191(int i10, int i11, byte[] bArr) {
                                return this.f68751.f18503.f67427.m18989(C19839.m45083(i10, i11, bArr));
                            }
                        }));
                        c20278.m45777(new C20037(abstractC12226, c20279.m45783()));
                    }
                }
                c21378.f67422 = c20278.m45783();
            }
        }
    }
}
