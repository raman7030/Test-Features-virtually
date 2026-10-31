package l;

import java.util.EnumSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18009 extends AbstractC1075 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f56164;

    /* JADX INFO: renamed from: ۧ */
    public abstract AbstractC5698 mo17829(C1755 c1755, EnumC16761 enumC16761);

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC18009(C22406 c22406, AbstractC10370 abstractC10370, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26010) {
        EnumC16761 enumC16761 = EnumC16761.f51455;
        this.f56164 = c22406;
        super(abstractC10370, abstractC4308, c2609, c26010, enumC16761);
    }

    @Override // l.AbstractC1075
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5698 mo3659(C1755 c1755, EnumC16761 enumC16761) {
        AbstractC5698 abstractC5698Mo17829 = mo17829(c1755, enumC16761);
        if (abstractC5698Mo17829.f17559 != EnumC1296.f4566) {
            return abstractC5698Mo17829;
        }
        C11391 c11391 = (C11391) abstractC5698Mo17829.mo7048();
        AbstractC4308 abstractC4308 = this.f3940;
        return (AbstractC5698) c11391.f34080.f72597.m17497(c11391.f34081.m8250(), abstractC4308, true).orElse(c11391);
    }

    @Override // l.AbstractC1075
    /* JADX INFO: renamed from: ֫ */
    public AbstractC5698 mo3658(C1755 c1755, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC5698 abstractC5699) {
        if (!abstractC5699.f17559.m4393()) {
            return abstractC5699;
        }
        AbstractC4308 abstractC4308 = this.f3940;
        C2609 c2609 = this.f3939;
        C22406 c22406 = this.f56164;
        return c22406.m50317(abstractC5699, interfaceC3109, abstractC5698, abstractC4308, this.f3938, true, this.f3936, c2609, (InterfaceC0369) c22406.f72610);
    }

    @Override // l.AbstractC1075
    /* JADX INFO: renamed from: ֫ */
    public final void mo3660(InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698) {
        C16719 c16719M16617;
        C16719 c16719M16618;
        AbstractC4308 abstractC4308 = this.f3940;
        C22406 c22406 = this.f56164;
        C22364 c22364 = c22406.f72598;
        C20661 c20661 = c22406.f72605;
        C5931 c5931 = c22406.f72607;
        EnumSet enumSet = c22406.f72584;
        boolean zM4393 = abstractC5698.f17559.m4393();
        if (zM4393 || enumSet.contains(EnumC21701.SUCCESS)) {
            if (!zM4393 || enumSet.contains(EnumC21701.FAILURE)) {
                if (abstractC5698.f17562 == c22406.f72594.f18879 && abstractC5698.f17561 == c20661.f66526.f13890 && !enumSet.contains(EnumC21701.OBJECT_INIT)) {
                    return;
                }
                if (abstractC4308 != c20661.f66458.f17560 || enumSet.contains(EnumC21701.PREDEF)) {
                    if (!c22406.f72579.f37060 || enumSet.contains(EnumC21701.INTERNAL)) {
                        C18837 c18837 = new C18837();
                        int i = -1;
                        int i2 = 0;
                        for (C13069 c13069 : c22406.f72579.f37058) {
                            EnumC16761 enumC16761 = c22406.f72579.f37061;
                            EnumC16761 enumC16762 = c13069.f39141;
                            AbstractC5698 abstractC5699 = c13069.f39142;
                            if (enumC16761 != enumC16762 || ((c13069.m31667() && !enumSet.contains(EnumC21701.APPLICABLE)) || !(c13069.m31667() || enumSet.contains(EnumC21701.INAPPLICABLE)))) {
                                enumSet = enumSet;
                            } else {
                                if (c13069.m31667()) {
                                    AbstractC4308 abstractC4309 = c13069.f39140;
                                    if (abstractC5699.f17560.m12913(EnumC9454.FORALL)) {
                                        C11576 c11576 = C11886.f35440;
                                        c16719M16618 = c5931.m16617(new C11576("compiler", "partial.inst.sig", abstractC4309));
                                    } else {
                                        c16719M16618 = null;
                                    }
                                    c16719M16617 = c5931.m16622(c16719M16618 == null ? "applicable.method.found" : "applicable.method.found.1", Integer.valueOf(i2), abstractC5699, c16719M16618);
                                } else {
                                    C16719 c16719 = c13069.f39139;
                                    C11576 c11577 = C11886.f35440;
                                    c16719M16617 = c5931.m16617(new C11576("compiler", "not.applicable.method.found", Integer.valueOf(i2), abstractC5699, c16719));
                                }
                                c18837.m43511(c16719M16617);
                                if (abstractC5699 == abstractC5698) {
                                    i = i2;
                                }
                                i2++;
                            }
                            enumSet = enumSet;
                        }
                        String str = !zM4393 ? "verbose.resolve.multi" : "verbose.resolve.multi.1";
                        C12399 c12399 = c22406.f72606;
                        C11003.requireNonNull(c12399);
                        c22364.mo7277(new C22864(c5931.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c22364.m7266(), interfaceC3109, c5931.m16623(str, this.f3938, abstractC4308.f13890, Integer.valueOf(i), c22406.f72579.f37061, c22406.m50298(this.f3936.m8243((Function) new C3227(c12399, EnumC13829.SPECULATIVE, abstractC5698, c22406.f72579.f37061))), c22406.m50298(this.f3939))), c18837.m43517()));
                    }
                }
            }
        }
    }
}
