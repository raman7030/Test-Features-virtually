package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۛܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6146 implements InterfaceC14801, Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC18330 f18922;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC14801 f18923;

    public C6146(InterfaceC18330 interfaceC18330, InterfaceC14801 interfaceC14801) {
        C11233.m27805(interfaceC14801, "left");
        C11233.m27805(interfaceC18330, "element");
        this.f18923 = interfaceC14801;
        this.f18922 = interfaceC18330;
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18330 mo9082(InterfaceC17624 interfaceC17624) {
        C11233.m27805(interfaceC17624, "key");
        C6146 c6146 = this;
        while (true) {
            InterfaceC18330 interfaceC18330Mo9082 = c6146.f18922.mo9082(interfaceC17624);
            if (interfaceC18330Mo9082 != null) {
                return interfaceC18330Mo9082;
            }
            InterfaceC14801 interfaceC14801 = c6146.f18923;
            if (interfaceC14801 instanceof C6146) {
                c6146 = (C6146) interfaceC14801;
            } else {
                return interfaceC14801.mo9082(interfaceC17624);
            }
        }
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ InterfaceC14801 mo13851(InterfaceC14801 interfaceC14801) {
        return C11275.m27881(this, interfaceC14801);
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13850(Object obj, InterfaceC19763 interfaceC19763) {
        return interfaceC19763.mo6973(this.f18923.mo13850(obj, interfaceC19763), this.f18922);
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14801 mo9085(InterfaceC17624 interfaceC17624) {
        C11233.m27805(interfaceC17624, "key");
        InterfaceC18330 interfaceC18330 = this.f18922;
        InterfaceC18330 interfaceC18330Mo9082 = interfaceC18330.mo9082(interfaceC17624);
        InterfaceC14801 interfaceC14801 = this.f18923;
        if (interfaceC18330Mo9082 != null) {
            return interfaceC14801;
        }
        InterfaceC14801 interfaceC14801Mo9085 = interfaceC14801.mo9085(interfaceC17624);
        if (interfaceC14801Mo9085 == interfaceC14801) {
            return this;
        }
        return interfaceC14801Mo9085 == C23974.f77731 ? interfaceC18330 : new C6146(interfaceC18330, interfaceC14801Mo9085);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final int m17061() {
        int i = 2;
        C6146 c6146 = this;
        while (true) {
            InterfaceC14801 interfaceC14801 = c6146.f18923;
            c6146 = interfaceC14801 instanceof C6146 ? (C6146) interfaceC14801 : null;
            if (c6146 == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zM27802;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6146) {
            C6146 c6146 = (C6146) obj;
            if (c6146.m17061() == m17061()) {
                C6146 c6147 = this;
                while (true) {
                    InterfaceC18330 interfaceC18330 = c6147.f18922;
                    if (!C11233.m27802(c6146.mo9082(interfaceC18330.getKey()), interfaceC18330)) {
                        zM27802 = false;
                        break;
                    }
                    InterfaceC14801 interfaceC14801 = c6147.f18923;
                    if (interfaceC14801 instanceof C6146) {
                        c6147 = (C6146) interfaceC14801;
                    } else {
                        C11233.m27800((Object) interfaceC14801, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC18330 interfaceC18331 = (InterfaceC18330) interfaceC14801;
                        zM27802 = C11233.m27802(c6146.mo9082(interfaceC18331.getKey()), interfaceC18331);
                        break;
                    }
                }
                if (zM27802) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18922.hashCode() + this.f18923.hashCode();
    }

    public final String toString() {
        return "[" + ((String) mo13850("", new C12496())) + ']';
    }

    private final Object writeReplace() {
        int iM17061 = m17061();
        final InterfaceC14801[] interfaceC14801Arr = new InterfaceC14801[iM17061];
        final C14759 c14759 = new C14759();
        mo13850(C8058.f24861, new InterfaceC19763() { // from class: l.۬ܶ᩵
            @Override // l.InterfaceC19763
            /* JADX INFO: renamed from: ֫ */
            public final Object mo6973(Object obj, Object obj2) {
                InterfaceC18330 interfaceC18330 = (InterfaceC18330) obj2;
                C11233.m27805((C8058) obj, "<unused var>");
                C11233.m27805(interfaceC18330, "element");
                C14759 c147510 = c14759;
                int i = c147510.f45074;
                c147510.f45074 = i + 1;
                interfaceC14801Arr[i] = interfaceC18330;
                return C8058.f24861;
            }
        });
        if (c14759.f45074 != iM17061) {
            throw new IllegalStateException("Check failed.");
        }
        return new C10380(interfaceC14801Arr);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
