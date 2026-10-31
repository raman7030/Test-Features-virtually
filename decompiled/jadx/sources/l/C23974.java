package l;

import com.umeng.analytics.pro.d;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩻᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23974 implements InterfaceC14801, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C23974 f77731 = new C23974();

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13850(Object obj, InterfaceC19763 interfaceC19763) {
        return obj;
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14801 mo13851(InterfaceC14801 interfaceC14801) {
        C11233.m27805(interfaceC14801, d.R);
        return interfaceC14801;
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18330 mo9082(InterfaceC17624 interfaceC17624) {
        C11233.m27805(interfaceC17624, "key");
        return null;
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14801 mo9085(InterfaceC17624 interfaceC17624) {
        C11233.m27805(interfaceC17624, "key");
        return this;
    }

    private final Object readResolve() {
        return f77731;
    }
}
