package p067l;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۨۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8YQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13309 extends AbstractC9480 {
    @Override // p067l.AbstractC9480
    /* JADX INFO: renamed from: ֫ */
    public final void mo22082(InterfaceC5655 interfaceC5655, AbstractC4406 abstractC4406, InterfaceC16855 interfaceC16855) {
        if (interfaceC16855.mo38365()) {
            InterfaceC3445 interfaceC3445Mo38364 = interfaceC16855.mo38364();
            boolean zEquals = "ol".equals(interfaceC3445Mo38364.name());
            boolean zEquals2 = "ul".equals(interfaceC3445Mo38364.name());
            if (zEquals || zEquals2) {
                C20408 c20408Mo12595 = interfaceC5655.mo12595();
                InterfaceC15712 interfaceC15712Mo12591 = interfaceC5655.mo12591();
                InterfaceC3881 interfaceC3881Mo23970 = c20408Mo12595.m46079().mo23970(C20662.class);
                int i = 0;
                InterfaceC3445 interfaceC3445Mo6112 = interfaceC3445Mo38364;
                while (true) {
                    interfaceC3445Mo6112 = interfaceC3445Mo6112.mo6112();
                    if (interfaceC3445Mo6112 == null) {
                        break;
                    } else if ("ul".equals(interfaceC3445Mo6112.name()) || "ol".equals(interfaceC3445Mo6112.name())) {
                        i++;
                    }
                }
                int i2 = 1;
                for (InterfaceC3445 interfaceC3445 : interfaceC3445Mo38364.mo6113()) {
                    AbstractC9480.m22081(interfaceC5655, abstractC4406, interfaceC3445);
                    final int[] iArr = {0};
                    if (zEquals) {
                        AbstractC6564.f16940.m31139(interfaceC5655.mo12591(), new InterfaceC21317() { // from class: l.ۛۛۘ
                            @Override // p067l.InterfaceC21317
                            /* JADX INFO: renamed from: ֫ */
                            public final int mo5550() {
                                return iArr[0];
                            }
                        });
                    }
                    if (interfaceC3881Mo23970 != null && "li".equals(interfaceC3445.name())) {
                        if (zEquals) {
                            AbstractC6564.f16938.m31139(interfaceC15712Mo12591, EnumC23328.ORDERED);
                            C13702 c13702 = AbstractC6564.f16936;
                            iArr[0] = i2;
                            c13702.m31139(interfaceC15712Mo12591, Integer.valueOf(i2));
                            i2++;
                        } else {
                            AbstractC6564.f16938.m31139(interfaceC15712Mo12591, EnumC23328.BULLET);
                            AbstractC6564.f16933.m31139(interfaceC15712Mo12591, Integer.valueOf(i));
                        }
                        C19304.m43993(interfaceC5655.builder(), interfaceC3881Mo23970.mo7539(c20408Mo12595, interfaceC15712Mo12591), interfaceC3445.start(), interfaceC3445.end());
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC9480
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8183() {
        return Arrays.asList("ol", "ul");
    }
}
