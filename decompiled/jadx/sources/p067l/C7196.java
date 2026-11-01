package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۚۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7EX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7196 extends AbstractC15242 {

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f18798;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f18799;

    /* JADX INFO: renamed from: ܽ */
    public final synchronized int m16536() {
        C8537 c8537;
        if (this.f18799.isEmpty()) {
            return 0;
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(this.f18799.entrySet());
        C8150.sort(arrayList, C9491.comparingByKey());
        InterfaceC3446 interfaceC3446Mo23661 = this.f43502.mo23661();
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : arrayList) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            if (jLongValue == 2147483647L || this.f18798.isEmpty()) {
                c8537 = null;
            } else {
                long j = jLongValue >> 32;
                c8537 = new C8537(Long.valueOf(j), Long.valueOf(m16531(j, jLongValue)));
            }
            for (C23960 c23960 : (Set) entry.getValue()) {
                c23960.getClass();
                EnumC22620 enumC22620 = EnumC22620.WARNING;
                if (c23960.m53080() == EnumC22620.ERROR) {
                    interfaceC3446Mo23661 = this.f43502.mo23660();
                    i2++;
                }
                i += c23960.m53080() == enumC22620 ? 1 : 0;
                if (jLongValue == 2147483647L) {
                    interfaceC3446Mo23661.mo4349(c23960.m53082());
                } else {
                    interfaceC3446Mo23661.mo4349(String.format("%s (%d:%d) %s", m34701(), c8537.f22916, c8537.f22917, c23960.m53082()));
                    m16529(interfaceC3446Mo23661, c8537);
                }
            }
        }
        AbstractC16856 abstractC16856 = this.f43502;
        if (i != 0) {
            abstractC16856.mo23663(String.format("%d warning(s)%s", Integer.valueOf(i), i2 != 0 ? ", " : "\n"));
        }
        if (i2 != 0) {
            abstractC16856.mo23662(String.format("%d error(s)", Integer.valueOf(i2)));
        }
        synchronized (interfaceC3446Mo23661) {
            interfaceC3446Mo23661.flush();
            abstractC16856.flush();
            this.f18799.clear();
        }
        return i2;
    }

    public C7196(C22893 c22893) {
        super("jasm", c22893);
        this.f18799 = new HashMap();
        this.f18798 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16535(long j, String str, Object... objArr) {
        EnumC22620 enumC22620 = EnumC22620.WARNING;
        String strM34697 = AbstractC15242.m34697(str, objArr);
        m16530(j, strM34697 == null ? new C23960(EnumC22620.ERROR, null) : new C23960(enumC22620, strM34697));
    }

    @Override // p067l.AbstractC15242, p067l.InterfaceC5185
    /* JADX INFO: renamed from: ֫ */
    public final void mo11117(long j, String str, Object... objArr) {
        EnumC22620 enumC22620 = EnumC22620.ERROR;
        String strM34697 = AbstractC15242.m34697(str, objArr);
        m16530(j, strM34697 == null ? new C23960(enumC22620, null) : new C23960(enumC22620, strM34697));
    }

    @Override // p067l.AbstractC15242
    /* JADX INFO: renamed from: ۧ */
    public final String mo16534(String str, Object... objArr) {
        return AbstractC15242.m34697(str, objArr);
    }

    @Override // p067l.AbstractC15242
    /* JADX INFO: renamed from: ֫ */
    public final void mo16533(InterfaceC24904 interfaceC24904) {
        super.mo16533(interfaceC24904);
        ArrayList arrayList = this.f18798;
        arrayList.clear();
        arrayList.addAll(interfaceC24904.mo8318());
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m16531(long j, long j2) {
        return (j2 & 4294967295L) - ((((long) C7480.stream(this.f18798.subList(0, ((int) j) - 1)).mapToInt(new C16927()).sum()) + j) - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m16532(EnumC22620 enumC22620) {
        HashMap map = this.f18799;
        if (map.isEmpty()) {
            return 0L;
        }
        return C7480.stream(map.values()).flatMap(new C5631(5)).filter(new C2592(1, enumC22620)).count();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m16537() {
        return this.f18799.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16529(InterfaceC3446 interfaceC3446, C8537 c8537) {
        int iLongValue = (int) (((Long) c8537.f22916).longValue() - 1);
        long jLongValue = ((Long) c8537.f22916).longValue();
        ArrayList arrayList = this.f18798;
        boolean z = jLongValue > ((long) arrayList.size());
        String str = (String) arrayList.get(Math.min(arrayList.size() - 1, iLongValue));
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\t') {
                j++;
            }
        }
        String str2 = InterfaceC5185.f12209;
        String strReplace = str.replace("\t", str2);
        long length = z ? strReplace.length() : ((((long) str2.length()) * j) + ((Long) c8537.f22917).longValue()) - j;
        interfaceC3446.mo4349(strReplace);
        StringBuilder sb = new StringBuilder();
        int i2 = (int) length;
        sb.append(i2 <= 0 ? "" : new String(new char[i2]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, " "));
        sb.append("^");
        interfaceC3446.mo4349(sb.toString());
    }

    /* JADX INFO: renamed from: ۧ */
    private void m16530(long j, C23960 c23960) {
        String strM30294;
        if (j != 2147483647L && this.f18798.isEmpty()) {
            EnumC22620 enumC22620 = EnumC22620.ERROR;
            m16528(2147483647L, new C23960(enumC22620, EnumC13232.LONG.m30295(enumC22620, m34698(), "Content of the file %s not found", m34701())));
            j = 2147483647L;
        }
        EnumC22620 enumC22620M53080 = c23960.m53080();
        if (j == 2147483647L) {
            strM30294 = EnumC13232.VERBOSE.m30294(m34698(), c23960);
        } else {
            strM30294 = EnumC13232.LONG.m30294(m34698(), c23960);
        }
        m16528(j, new C23960(enumC22620M53080, strM30294));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16528(long j, C23960 c23960) {
        Long lValueOf = Long.valueOf(j);
        HashMap map = this.f18799;
        Set set = (Set) map.get(lValueOf);
        if (set != null) {
            set.add(c23960);
            return;
        }
        HashSet hashSet = new HashSet(1);
        hashSet.add(c23960);
        map.put(Long.valueOf(j), hashSet);
    }
}
