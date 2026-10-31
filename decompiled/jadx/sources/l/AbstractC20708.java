package l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20708 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set f66692;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 f66693;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f66694;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC16970 f66695;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2858(int i, AbstractC5698 abstractC5698);

    public AbstractC20708(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, Set set) {
        this.f66694 = c20002;
        this.f66693 = abstractC10370;
        this.f66695 = enumC16970;
        this.f66692 = set;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo10868(EnumC6596 enumC6596) {
        if (this.f66692.contains(enumC6596)) {
            C20002 c20002 = this.f66694;
            int i = c20002.f64758;
            HashSet hashSet = c20002.f64761;
            C22364 c22364 = c20002.f64746;
            EnumC16970 enumC16970 = this.f66695;
            int i2 = enumC16970.f52075;
            if (i > i2 || (i == i2 && c20002.f64771 >= enumC16970.f52076)) {
                return true;
            }
            if (c20002.f64753) {
                AbstractC10370 abstractC10370 = this.f66693;
                if (!hashSet.contains(abstractC10370)) {
                    InterfaceC18278 interfaceC18278M7284 = c22364.m7284(c20002.f64755);
                    try {
                        EnumC20347 enumC20347 = EnumC20347.CLASSFILE;
                        int i3 = enumC16970.f52075;
                        int i4 = enumC16970.f52076;
                        int i5 = c20002.f64758;
                        int i6 = c20002.f64771;
                        C11076 c11076 = C14001.f42334;
                        c22364.m7286(enumC20347, (InterfaceC3109) null, new C11076("compiler", "future.attr", abstractC10370, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                        c22364.m7284(interfaceC18278M7284);
                        hashSet.add(abstractC10370);
                    } catch (Throwable th) {
                        c22364.m7284(interfaceC18278M7284);
                        throw th;
                    }
                }
            }
        }
        return false;
    }
}
