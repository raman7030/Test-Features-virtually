package l;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J84Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C9640 extends AbstractC8333 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f29213 = new C6817(EnumC0571.f2252);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12524 f29214;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5511 f29215;

    public C9640(C12524 c12524, InterfaceC5511 interfaceC5511) {
        this.f29214 = c12524;
        this.f29215 = interfaceC5511;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC15387 m24576(InterfaceC5511 interfaceC5511) {
        if (interfaceC5511 != EnumC0571.f2252) {
            return new C6817(interfaceC5511);
        }
        return f29213;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Serializable m24577(C17175 c17175, EnumC14352 enumC14352) throws IOException {
        int i = C20929.f67688[enumC14352.ordinal()];
        if (i == 1) {
            c17175.m40391();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        c17175.m40402();
        return new C23834();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Serializable m24575(C17175 c17175, EnumC14352 enumC14352) {
        int i = C20929.f67688[enumC14352.ordinal()];
        if (i == 3) {
            return c17175.m40399();
        }
        if (i == 4) {
            return this.f29215.mo2340(c17175);
        }
        if (i == 5) {
            return Boolean.valueOf(c17175.m40401());
        }
        if (i == 6) {
            c17175.m40394();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + enumC14352);
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        EnumC14352 enumC14352M40398 = c17175.m40398();
        Object objM24577 = m24577(c17175, enumC14352M40398);
        if (objM24577 == null) {
            return m24575(c17175, enumC14352M40398);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c17175.m40404()) {
                String strM40396 = objM24577 instanceof Map ? c17175.m40396() : null;
                EnumC14352 enumC14352M40399 = c17175.m40398();
                Serializable serializableM24577 = m24577(c17175, enumC14352M40399);
                boolean z = serializableM24577 != null;
                Serializable serializableM24575 = serializableM24577 == null ? m24575(c17175, enumC14352M40399) : serializableM24577;
                if (objM24577 instanceof List) {
                    ((List) objM24577).add(serializableM24575);
                } else {
                    ((Map) objM24577).put(strM40396, serializableM24575);
                }
                if (z) {
                    arrayDeque.addLast(objM24577);
                    objM24577 = serializableM24575;
                }
            } else {
                if (objM24577 instanceof List) {
                    c17175.m40400();
                } else {
                    c17175.m40410();
                }
                if (arrayDeque.isEmpty()) {
                    return objM24577;
                }
                objM24577 = arrayDeque.removeLast();
            }
        }
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        if (obj == null) {
            c23525.m51981();
            return;
        }
        Class<?> cls = obj.getClass();
        C12524 c12524 = this.f29214;
        c12524.getClass();
        AbstractC8333 abstractC8333M30728 = c12524.m30728(C16469.m38775((Class) cls));
        if (abstractC8333M30728 instanceof C9640) {
            c23525.m51987();
            c23525.m51986();
        } else {
            abstractC8333M30728.mo2845(c23525, obj);
        }
    }
}
