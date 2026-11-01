package p067l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC22049 {

    /* JADX INFO: renamed from: ֫ */
    public final Set f69373;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12224 f69374;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C21378 f69375;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC18497 f69376;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5187(int i, AbstractC7783 abstractC7783);

    public AbstractC22049(C21378 c21378, AbstractC12224 abstractC12224, EnumC18497 enumC18497, Set set) {
        this.f69375 = c21378;
        this.f69374 = abstractC12224;
        this.f69376 = enumC18497;
        this.f69373 = set;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo12848(EnumC8637 enumC8637) {
        if (this.f69373.contains(enumC8637)) {
            C21378 c21378 = this.f69375;
            int i = c21378.f67400;
            HashSet hashSet = c21378.f67403;
            C23623 c23623 = c21378.f67388;
            EnumC18497 enumC18497 = this.f69376;
            int i2 = enumC18497.f55255;
            if (i > i2 || (i == i2 && c21378.f67413 >= enumC18497.f55256)) {
                return true;
            }
            if (c21378.f67395) {
                AbstractC12224 abstractC12224 = this.f69374;
                if (!hashSet.contains(abstractC12224)) {
                    InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c21378.f67397);
                    try {
                        EnumC21706 enumC21706 = EnumC21706.CLASSFILE;
                        int i3 = enumC18497.f55255;
                        int i4 = enumC18497.f55256;
                        int i5 = c21378.f67400;
                        int i6 = c21378.f67413;
                        C12895 c12895 = C15675.f45417;
                        c23623.m9365(enumC21706, (InterfaceC5323) null, new C12895("compiler", "future.attr", abstractC12224, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                        c23623.m9363(interfaceC19740M9363);
                        hashSet.add(abstractC12224);
                    } catch (Throwable th) {
                        c23623.m9363(interfaceC19740M9363);
                        throw th;
                    }
                }
            }
        }
        return false;
    }
}
