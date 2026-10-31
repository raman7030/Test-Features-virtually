package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۚۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7EX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5080 extends AbstractC13546 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15962;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f15963;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized int m14628() {
        C6491 c6491;
        if (this.f15963.isEmpty()) {
            return 0;
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(this.f15963.entrySet());
        C6083.sort(arrayList, C7494.comparingByKey());
        InterfaceC1134 interfaceC1134Mo21692 = this.f40432.mo21692();
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : arrayList) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            if (jLongValue == 2147483647L || this.f15962.isEmpty()) {
                c6491 = null;
            } else {
                long j = jLongValue >> 32;
                c6491 = new C6491(Long.valueOf(j), Long.valueOf(m14623(j, jLongValue)));
            }
            for (C22719 c22719 : (Set) entry.getValue()) {
                c22719.getClass();
                EnumC21309 enumC21309 = EnumC21309.WARNING;
                if (c22719.m50754() == EnumC21309.ERROR) {
                    interfaceC1134Mo21692 = this.f40432.mo21691();
                    i2++;
                }
                i += c22719.m50754() == enumC21309 ? 1 : 0;
                if (jLongValue == 2147483647L) {
                    interfaceC1134Mo21692.mo1973(c22719.m50756());
                } else {
                    interfaceC1134Mo21692.mo1973(String.format("%s (%d:%d) %s", m32598(), c6491.f20042, c6491.f20043, c22719.m50756()));
                    m14621(interfaceC1134Mo21692, c6491);
                }
            }
        }
        AbstractC15244 abstractC15244 = this.f40432;
        if (i != 0) {
            abstractC15244.mo21694(String.format("%d warning(s)%s", Integer.valueOf(i), i2 != 0 ? ", " : "\n"));
        }
        if (i2 != 0) {
            abstractC15244.mo21693(String.format("%d error(s)", Integer.valueOf(i2)));
        }
        synchronized (interfaceC1134Mo21692) {
            interfaceC1134Mo21692.flush();
            abstractC15244.flush();
            this.f15963.clear();
        }
        return i2;
    }

    public C5080(C21596 c21596) {
        super("jasm", c21596);
        this.f15963 = new HashMap();
        this.f15962 = new ArrayList();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14627(long j, String str, Object... objArr) {
        EnumC21309 enumC21309 = EnumC21309.WARNING;
        String strM32594 = AbstractC13546.m32594(str, objArr);
        m14622(j, strM32594 == null ? new C22719(EnumC21309.ERROR, null) : new C22719(enumC21309, strM32594));
    }

    @Override // l.AbstractC13546, l.InterfaceC2964
    /* JADX INFO: renamed from: ֫ */
    public final void mo9065(long j, String str, Object... objArr) {
        EnumC21309 enumC21309 = EnumC21309.ERROR;
        String strM32594 = AbstractC13546.m32594(str, objArr);
        m14622(j, strM32594 == null ? new C22719(enumC21309, null) : new C22719(enumC21309, strM32594));
    }

    @Override // l.AbstractC13546
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo14626(String str, Object... objArr) {
        return AbstractC13546.m32594(str, objArr);
    }

    @Override // l.AbstractC13546
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14625(InterfaceC23712 interfaceC23712) {
        super.mo14625(interfaceC23712);
        ArrayList arrayList = this.f15962;
        arrayList.clear();
        arrayList.addAll(interfaceC23712.mo6120());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m14623(long j, long j2) {
        return (j2 & 4294967295L) - ((((long) C5378.stream(this.f15962.subList(0, ((int) j) - 1)).mapToInt(new C15318()).sum()) + j) - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m14624(EnumC21309 enumC21309) {
        HashMap map = this.f15963;
        if (map.isEmpty()) {
            return 0L;
        }
        return C5378.stream(map.values()).flatMap(new C3433(5)).filter(new C0235(1, enumC21309)).count();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m14629() {
        return this.f15963.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14621(InterfaceC1134 interfaceC1134, C6491 c6491) {
        int iLongValue = (int) (((Long) c6491.f20042).longValue() - 1);
        long jLongValue = ((Long) c6491.f20042).longValue();
        ArrayList arrayList = this.f15962;
        boolean z = jLongValue > ((long) arrayList.size());
        String str = (String) arrayList.get(Math.min(arrayList.size() - 1, iLongValue));
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '\t') {
                j++;
            }
        }
        String str2 = InterfaceC2964.f9410;
        String strReplace = str.replace("\t", str2);
        long length = z ? strReplace.length() : ((((long) str2.length()) * j) + ((Long) c6491.f20043).longValue()) - j;
        interfaceC1134.mo1973(strReplace);
        StringBuilder sb = new StringBuilder();
        int i2 = (int) length;
        sb.append(i2 <= 0 ? "" : new String(new char[i2]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, " "));
        sb.append("^");
        interfaceC1134.mo1973(sb.toString());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m14622(long j, C22719 c22719) {
        String strM28250;
        if (j != 2147483647L && this.f15962.isEmpty()) {
            EnumC21309 enumC21309 = EnumC21309.ERROR;
            m14620(2147483647L, new C22719(enumC21309, EnumC11431.LONG.m28251(enumC21309, m32595(), "Content of the file %s not found", m32598())));
            j = 2147483647L;
        }
        EnumC21309 enumC21309M50754 = c22719.m50754();
        if (j == 2147483647L) {
            strM28250 = EnumC11431.VERBOSE.m28250(m32595(), c22719);
        } else {
            strM28250 = EnumC11431.LONG.m28250(m32595(), c22719);
        }
        m14620(j, new C22719(enumC21309M50754, strM28250));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14620(long j, C22719 c22719) {
        Long lValueOf = Long.valueOf(j);
        HashMap map = this.f15963;
        Set set = (Set) map.get(lValueOf);
        if (set != null) {
            set.add(c22719);
            return;
        }
        HashSet hashSet = new HashSet(1);
        hashSet.add(c22719);
        map.put(Long.valueOf(j), hashSet);
    }
}
