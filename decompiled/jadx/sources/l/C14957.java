package l;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܶۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7E3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14957 extends AbstractC13546 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f45606;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7902 f45607;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m35435() {
        if (!this.f45606.isEmpty()) {
            AbstractC15244 abstractC15244 = this.f40432;
            Iterator it = this.f45606.iterator();
            while (it.hasNext()) {
                abstractC15244.mo21693((String) it.next());
            }
            synchronized (abstractC15244) {
                abstractC15244.flush();
                this.f45606.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35433(C14957 c14957, String str) {
        if (str != null) {
            c14957.f45606.add(str);
        }
    }

    public C14957(C21596 c21596) {
        super("jdis", c21596);
        this.f45606 = new LinkedHashSet();
        this.f45607 = new C7902(this);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m35436(String str, Object... objArr) {
        this.f45607.accept(EnumC11431.VERBOSE.m28251(EnumC21309.WARNING, m32595(), AbstractC13546.m32594(str, objArr), new Object[0]));
    }

    @Override // l.AbstractC13546
    /* JADX INFO: renamed from: ֫ */
    public final void mo32596(String str, Object... objArr) {
        this.f45607.accept(EnumC11431.VERBOSE.m28251(EnumC21309.ERROR, m32595(), AbstractC13546.m32594(str, objArr), new Object[0]));
    }

    @Override // l.AbstractC13546
    /* JADX INFO: renamed from: ֫ */
    public final void mo32597(Throwable th) {
        this.f45607.accept(EnumC11431.VERBOSE.m28251(EnumC21309.ERROR, m32595(), th.getMessage(), new Object[0]));
    }

    @Override // l.AbstractC13546
    /* JADX INFO: renamed from: ۧ */
    public final String mo14626(String str, Object... objArr) {
        return AbstractC13546.m32594(str, objArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35434(int i, InterfaceC23712 interfaceC23712) {
        EnumC21309 enumC21309 = EnumC21309.ERROR;
        LinkedHashSet linkedHashSet = this.f45606;
        int i2 = 2;
        int iCount = (int) C5378.stream(linkedHashSet).filter(new C15448(i2, enumC21309)).count();
        int iCount2 = (int) C5378.stream(linkedHashSet).filter(new C15448(i2, EnumC21309.WARNING)).count();
        if (iCount2 <= 0 && iCount <= 0) {
            return 0;
        }
        int iMax = Math.max(i, iCount);
        String strConcat = "";
        if (iCount2 > 0) {
            strConcat = String.format("%d warning(s)", Integer.valueOf(iCount2)).concat(iCount > 0 ? ", " : "");
        }
        this.f45607.accept(EnumC11431.SHORT.m28251(enumC21309, m32595(), AbstractC13546.m32594("{0}{1}in the file: {2}", strConcat, iCount > 0 ? String.format("%d error(s) ", Integer.valueOf(iCount)) : " ", interfaceC23712), new Object[0]));
        return iMax;
    }
}
