package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9582 extends C6739 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15869 f29043;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f29044;

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C9582(C15869 c15869, List list) {
        this.f29043 = c15869;
        this.f29044 = list;
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        return (this.f29044.size() * 2) + 4;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f29043.f20943);
        List list = this.f29044;
        c6053.m16889(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c6053.m16889(((C15869) it.next()).f20943);
        }
    }

    public final String toString() {
        String str;
        List list = this.f29044;
        C15869 c15869 = this.f29043;
        if (c15869 == null || c15869.f20943 == -1) {
            str = " n/a";
        } else {
            str = " #" + c15869.f20943;
        }
        return C20087.m46306("{MethodHandle:", str, " Arguments:", (list == null || list.isEmpty()) ? "{}" : C9045.m23341(new StringBuilder("{ "), (String) C5378.stream(list).map(new C20871()).collect(C22976.joining(", ")), " }"), l.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9582)) {
            return false;
        }
        C9582 c9582 = (C9582) obj;
        if (C11003.equals(this.f29043, c9582.f29043)) {
            return C11003.equals(this.f29044, c9582.f29044) & (this.f20943 == c9582.f20943);
        }
        return false;
    }

    @Override // l.C6739
    public final int hashCode() {
        C15869 c15869 = this.f29043;
        int iHashCode = (c15869 != null ? c15869.hashCode() : 0) * 961;
        List list = this.f29044;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24460(Object obj) {
        List list = this.f29044;
        if (this == obj) {
            return true;
        }
        if (C12354.m29972(obj)) {
            C9582 c9582 = (C9582) obj;
            List list2 = c9582.f29044;
            if (C11003.equals(this.f29043, c9582.f29043)) {
                if (list == list2) {
                    return true;
                }
                if (list != null && list.size() == list2.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        if (((C15869) list.get(i)).m37605(list2.get(i))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
