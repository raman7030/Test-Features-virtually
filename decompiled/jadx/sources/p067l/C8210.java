package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۛܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8210 implements InterfaceC16436, Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC19790 f21781;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC16436 f21782;

    public C8210(InterfaceC19790 interfaceC19790, InterfaceC16436 interfaceC16436) {
        C13045.m29867(interfaceC16436, "left");
        C13045.m29867(interfaceC19790, "element");
        this.f21782 = interfaceC16436;
        this.f21781 = interfaceC19790;
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19790 mo11134(InterfaceC19119 interfaceC19119) {
        C13045.m29867(interfaceC19119, "key");
        C8210 c8210 = this;
        while (true) {
            InterfaceC19790 interfaceC19790Mo11134 = c8210.f21781.mo11134(interfaceC19119);
            if (interfaceC19790Mo11134 != null) {
                return interfaceC19790Mo11134;
            }
            InterfaceC16436 interfaceC16436 = c8210.f21782;
            if (interfaceC16436 instanceof C8210) {
                c8210 = (C8210) interfaceC16436;
            } else {
                return interfaceC16436.mo11134(interfaceC19119);
            }
        }
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ InterfaceC16436 mo15731(InterfaceC16436 interfaceC16436) {
        return C13085.m29942(this, interfaceC16436);
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15730(Object obj, InterfaceC21152 interfaceC21152) {
        return interfaceC21152.mo9100(this.f21782.mo15730(obj, interfaceC21152), this.f21781);
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16436 mo11137(InterfaceC19119 interfaceC19119) {
        C13045.m29867(interfaceC19119, "key");
        InterfaceC19790 interfaceC19790 = this.f21781;
        InterfaceC19790 interfaceC19790Mo11134 = interfaceC19790.mo11134(interfaceC19119);
        InterfaceC16436 interfaceC16436 = this.f21782;
        if (interfaceC19790Mo11134 != null) {
            return interfaceC16436;
        }
        InterfaceC16436 interfaceC16436Mo11137 = interfaceC16436.mo11137(interfaceC19119);
        if (interfaceC16436Mo11137 == interfaceC16436) {
            return this;
        }
        return interfaceC16436Mo11137 == C25154.f80484 ? interfaceC19790 : new C8210(interfaceC19790, interfaceC16436Mo11137);
    }

    /* JADX INFO: renamed from: ֫ */
    private final int m18993() {
        int i = 2;
        C8210 c8210 = this;
        while (true) {
            InterfaceC16436 interfaceC16436 = c8210.f21782;
            c8210 = interfaceC16436 instanceof C8210 ? (C8210) interfaceC16436 : null;
            if (c8210 == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zM29864;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8210) {
            C8210 c8210 = (C8210) obj;
            if (c8210.m18993() == m18993()) {
                C8210 c8211 = this;
                while (true) {
                    InterfaceC19790 interfaceC19790 = c8211.f21781;
                    if (!C13045.m29864(c8210.mo11134(interfaceC19790.getKey()), interfaceC19790)) {
                        zM29864 = false;
                        break;
                    }
                    InterfaceC16436 interfaceC16436 = c8211.f21782;
                    if (interfaceC16436 instanceof C8210) {
                        c8211 = (C8210) interfaceC16436;
                    } else {
                        C13045.m29862((Object) interfaceC16436, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC19790 interfaceC19791 = (InterfaceC19790) interfaceC16436;
                        zM29864 = C13045.m29864(c8210.mo11134(interfaceC19791.getKey()), interfaceC19791);
                        break;
                    }
                }
                if (zM29864) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21781.hashCode() + this.f21782.hashCode();
    }

    public final String toString() {
        return "[" + ((String) mo15730("", new C14245())) + ']';
    }

    private final Object writeReplace() {
        int iM18993 = m18993();
        final InterfaceC16436[] interfaceC16436Arr = new InterfaceC16436[iM18993];
        final C16396 c16396 = new C16396();
        mo15730(C10027.f27775, new InterfaceC21152() { // from class: l.۬ܶ᩵
            @Override // p067l.InterfaceC21152
            /* JADX INFO: renamed from: ֫ */
            public final Object mo9100(Object obj, Object obj2) {
                InterfaceC19790 interfaceC19790 = (InterfaceC19790) obj2;
                C13045.m29867((C10027) obj, "<unused var>");
                C13045.m29867(interfaceC19790, "element");
                C16396 c16397 = c16396;
                int i = c16397.f48188;
                c16397.f48188 = i + 1;
                interfaceC16436Arr[i] = interfaceC19790;
                return C10027.f27775;
            }
        });
        if (c16396.f48188 != iM18993) {
            throw new IllegalStateException("Check failed.");
        }
        return new C12234(interfaceC16436Arr);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
