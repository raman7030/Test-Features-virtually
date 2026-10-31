package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88A4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4435 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f14172 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3024 f14173;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C10080 mo13158(Long l2);

    public AbstractC4435(C3024 c3024) {
        this.f14173 = c3024;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m13160() {
        return this.f14172;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13159() {
        C17010 c17010M5149;
        C17716[] c17716ArrM33846;
        C16027 c16027 = new C16027();
        while (true) {
            C11491 c11491M47030 = this.f14173.m47030(mo13158(c16027.getValue()), EnumC22074.ERROR_MORE_DATA, EnumC22074.ERROR_SUCCESS);
            AbstractC1488 abstractC1488M50851 = c11491M47030.m50851();
            if (abstractC1488M50851 != null && (c17010M5149 = abstractC1488M50851.m5149()) != null && (c17716ArrM33846 = c17010M5149.m33846()) != null) {
                for (C17716 c17716 : c17716ArrM33846) {
                    C16304 c16304 = (C16304) c17716;
                    C12901 c12901 = null;
                    if (c16304 != null) {
                        C23360 c23360M41495 = c16304.m41495();
                        String strM17788 = c23360M41495 == null ? null : c23360M41495.m17788();
                        int iM38356 = c16304.m38356();
                        C23360 c23360M38355 = c16304.m38355();
                        c12901 = new C12901(strM17788, iM38356, c23360M38355 != null ? c23360M38355.m17788() : null);
                    }
                    this.f14172.add(c12901);
                }
            }
            if (EnumC22074.ERROR_SUCCESS.m49668(c11491M47030.m35552())) {
                return;
            }
            Long lM50850 = c11491M47030.m50850();
            if (lM50850 == null) {
                throw new C2380("NetrShareEnum resume handle null.");
            }
            if (lM50850.longValue() == c16027.getValue().longValue()) {
                throw new C2380("NetrShareEnum resume handle not updated.");
            }
            c16027.m37894(lM50850);
        }
    }
}
