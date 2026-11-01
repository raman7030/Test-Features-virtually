package p067l;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ܶۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7E3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16583 extends AbstractC15242 {

    /* JADX INFO: renamed from: ܳ */
    public final LinkedHashSet f48718;

    /* JADX INFO: renamed from: ܿ */
    public C9878 f48719;

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m37587() {
        if (!this.f48718.isEmpty()) {
            AbstractC16856 abstractC16856 = this.f43502;
            Iterator it = this.f48718.iterator();
            while (it.hasNext()) {
                abstractC16856.mo23662((String) it.next());
            }
            synchronized (abstractC16856) {
                abstractC16856.flush();
                this.f48718.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m37585(C16583 c16583, String str) {
        if (str != null) {
            c16583.f48718.add(str);
        }
    }

    public C16583(C22893 c22893) {
        super("jdis", c22893);
        this.f48718 = new LinkedHashSet();
        this.f48719 = new C9878(this);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m37588(String str, Object... objArr) {
        this.f48719.accept(EnumC13232.VERBOSE.m30295(EnumC22620.WARNING, m34698(), AbstractC15242.m34697(str, objArr), new Object[0]));
    }

    @Override // p067l.AbstractC15242
    /* JADX INFO: renamed from: ֫ */
    public final void mo34699(String str, Object... objArr) {
        this.f48719.accept(EnumC13232.VERBOSE.m30295(EnumC22620.ERROR, m34698(), AbstractC15242.m34697(str, objArr), new Object[0]));
    }

    @Override // p067l.AbstractC15242
    /* JADX INFO: renamed from: ֫ */
    public final void mo34700(Throwable th) {
        this.f48719.accept(EnumC13232.VERBOSE.m30295(EnumC22620.ERROR, m34698(), th.getMessage(), new Object[0]));
    }

    @Override // p067l.AbstractC15242
    /* JADX INFO: renamed from: ۧ */
    public final String mo16534(String str, Object... objArr) {
        return AbstractC15242.m34697(str, objArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m37586(int i, InterfaceC24904 interfaceC24904) {
        EnumC22620 enumC22620 = EnumC22620.ERROR;
        LinkedHashSet linkedHashSet = this.f48718;
        int i2 = 2;
        int iCount = (int) C7480.stream(linkedHashSet).filter(new C17050(i2, enumC22620)).count();
        int iCount2 = (int) C7480.stream(linkedHashSet).filter(new C17050(i2, EnumC22620.WARNING)).count();
        if (iCount2 <= 0 && iCount <= 0) {
            return 0;
        }
        int iMax = Math.max(i, iCount);
        String strConcat = "";
        if (iCount2 > 0) {
            strConcat = String.format("%d warning(s)", Integer.valueOf(iCount2)).concat(iCount > 0 ? ", " : "");
        }
        this.f48719.accept(EnumC13232.SHORT.m30295(enumC22620, m34698(), AbstractC15242.m34697("{0}{1}in the file: {2}", strConcat, iCount > 0 ? String.format("%d error(s) ", Integer.valueOf(iCount)) : " ", interfaceC24904), new Object[0]));
        return iMax;
    }
}
