package l;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۨۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8YQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11512 extends AbstractC7483 {
    @Override // l.AbstractC7483
    /* JADX INFO: renamed from: ֫ */
    public final void mo20106(InterfaceC3458 interfaceC3458, AbstractC2143 abstractC2143, InterfaceC15243 interfaceC15243) {
        if (interfaceC15243.mo36204()) {
            InterfaceC1133 interfaceC1133Mo36203 = interfaceC15243.mo36203();
            boolean zEquals = "ol".equals(interfaceC1133Mo36203.name());
            boolean zEquals2 = "ul".equals(interfaceC1133Mo36203.name());
            if (zEquals || zEquals2) {
                C18981 c18981Mo10587 = interfaceC3458.mo10587();
                InterfaceC14040 interfaceC14040Mo10583 = interfaceC3458.mo10583();
                InterfaceC1592 interfaceC1592Mo22000 = c18981Mo10587.m43812().mo22000(C19249.class);
                int i = 0;
                InterfaceC1133 interfaceC1133Mo3871 = interfaceC1133Mo36203;
                while (true) {
                    interfaceC1133Mo3871 = interfaceC1133Mo3871.mo3871();
                    if (interfaceC1133Mo3871 == null) {
                        break;
                    } else if ("ul".equals(interfaceC1133Mo3871.name()) || "ol".equals(interfaceC1133Mo3871.name())) {
                        i++;
                    }
                }
                int i2 = 1;
                for (InterfaceC1133 interfaceC1133 : interfaceC1133Mo36203.mo3872()) {
                    AbstractC7483.m20105(interfaceC3458, abstractC2143, interfaceC1133);
                    final int[] iArr = {0};
                    if (zEquals) {
                        AbstractC4415.f14124.m29086(interfaceC3458.mo10583(), new InterfaceC19938() { // from class: l.ۛۛۘ
                            @Override // l.InterfaceC19938
                            /* JADX INFO: renamed from: ֫ */
                            public final int mo3236() {
                                return iArr[0];
                            }
                        });
                    }
                    if (interfaceC1592Mo22000 != null && "li".equals(interfaceC1133.name())) {
                        if (zEquals) {
                            AbstractC4415.f14122.m29086(interfaceC14040Mo10583, EnumC22054.ORDERED);
                            C11925 c11925 = AbstractC4415.f14120;
                            iArr[0] = i2;
                            c11925.m29086(interfaceC14040Mo10583, Integer.valueOf(i2));
                            i2++;
                        } else {
                            AbstractC4415.f14122.m29086(interfaceC14040Mo10583, EnumC22054.BULLET);
                            AbstractC4415.f14117.m29086(interfaceC14040Mo10583, Integer.valueOf(i));
                        }
                        C17820.m41747(interfaceC3458.builder(), interfaceC1592Mo22000.mo5310(c18981Mo10587, interfaceC14040Mo10583), interfaceC1133.start(), interfaceC1133.end());
                    }
                }
            }
        }
    }

    @Override // l.AbstractC7483
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo5986() {
        return Arrays.asList("ol", "ul");
    }
}
