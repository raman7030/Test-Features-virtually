package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11475 extends C8773 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ᩶ */
    public C17450 f31990;

    /* JADX INFO: renamed from: ᩹ */
    public List f31991;

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C11475(C17450 c17450, List list) {
        this.f31990 = c17450;
        this.f31991 = list;
    }

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return (this.f31991.size() * 2) + 4;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f31990.f23817);
        List list = this.f31991;
        c8121.m18818(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c8121.m18818(((C17450) it.next()).f23817);
        }
    }

    public final String toString() {
        String str;
        List list = this.f31991;
        C17450 c17450 = this.f31990;
        if (c17450 == null || c17450.f23817 == -1) {
            str = " n/a";
        } else {
            str = " #" + c17450.f23817;
        }
        return C21459.m48622("{MethodHandle:", str, " Arguments:", (list == null || list.isEmpty()) ? "{}" : C10965.m25286(new StringBuilder("{ "), (String) C7480.stream(list).map(new C22204()).collect(C24205.joining(", ")), " }"), C0249l.f1198d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11475)) {
            return false;
        }
        C11475 c11475 = (C11475) obj;
        if (C12826.equals(this.f31990, c11475.f31990)) {
            return C12826.equals(this.f31991, c11475.f31991) & (this.f23817 == c11475.f23817);
        }
        return false;
    }

    @Override // p067l.C8773
    public final int hashCode() {
        C17450 c17450 = this.f31990;
        int iHashCode = (c17450 != null ? c17450.hashCode() : 0) * 961;
        List list = this.f31991;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26472(Object obj) {
        List list = this.f31991;
        if (this == obj) {
            return true;
        }
        if (C14110.m32033(obj)) {
            C11475 c11475 = (C11475) obj;
            List list2 = c11475.f31991;
            if (C12826.equals(this.f31990, c11475.f31990)) {
                if (list == list2) {
                    return true;
                }
                if (list != null && list.size() == list2.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        if (((C17450) list.get(i)).m39777(list2.get(i))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
