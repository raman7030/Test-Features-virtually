package p067l;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۢܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J84Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C11530 extends AbstractC10288 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC16992 f32162 = new C8847(EnumC2911.f5027);

    /* JADX INFO: renamed from: ֫ */
    public final C14271 f32163;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7606 f32164;

    public C11530(C14271 c14271, InterfaceC7606 interfaceC7606) {
        this.f32163 = c14271;
        this.f32164 = interfaceC7606;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC16992 m26590(InterfaceC7606 interfaceC7606) {
        if (interfaceC7606 != EnumC2911.f5027) {
            return new C8847(interfaceC7606);
        }
        return f32162;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Serializable m26591(C18691 c18691, EnumC16008 enumC16008) throws IOException {
        int i = C22259.f70373[enumC16008.ordinal()];
        if (i == 1) {
            c18691.m42636();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        c18691.m42647();
        return new C25020();
    }

    /* JADX INFO: renamed from: ֫ */
    private Serializable m26589(C18691 c18691, EnumC16008 enumC16008) {
        int i = C22259.f70373[enumC16008.ordinal()];
        if (i == 3) {
            return c18691.m42644();
        }
        if (i == 4) {
            return this.f32164.mo4711(c18691);
        }
        if (i == 5) {
            return Boolean.valueOf(c18691.m42646());
        }
        if (i == 6) {
            c18691.m42639();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + enumC16008);
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        EnumC16008 enumC16008M42643 = c18691.m42643();
        Object objM26591 = m26591(c18691, enumC16008M42643);
        if (objM26591 == null) {
            return m26589(c18691, enumC16008M42643);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c18691.m42649()) {
                String strM42641 = objM26591 instanceof Map ? c18691.m42641() : null;
                EnumC16008 enumC16008M42644 = c18691.m42643();
                Serializable serializableM26591 = m26591(c18691, enumC16008M42644);
                boolean z = serializableM26591 != null;
                Serializable serializableM26589 = serializableM26591 == null ? m26589(c18691, enumC16008M42644) : serializableM26591;
                if (objM26591 instanceof List) {
                    ((List) objM26591).add(serializableM26589);
                } else {
                    ((Map) objM26591).put(strM42641, serializableM26589);
                }
                if (z) {
                    arrayDeque.addLast(objM26591);
                    objM26591 = serializableM26589;
                }
            } else {
                if (objM26591 instanceof List) {
                    c18691.m42645();
                } else {
                    c18691.m42655();
                }
                if (arrayDeque.isEmpty()) {
                    return objM26591;
                }
                objM26591 = arrayDeque.removeLast();
            }
        }
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        if (obj == null) {
            c24726.m54383();
            return;
        }
        Class<?> cls = obj.getClass();
        C14271 c14271 = this.f32163;
        c14271.getClass();
        AbstractC10288 abstractC10288M32800 = c14271.m32800(C18020.m41001((Class) cls));
        if (abstractC10288M32800 instanceof C11530) {
            c24726.m54389();
            c24726.m54388();
        } else {
            abstractC10288M32800.mo5174(c24726, obj);
        }
    }
}
