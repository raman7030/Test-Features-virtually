package p067l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8827 */
/* JADX INFO: loaded from: classes.dex */
public final class C23679 extends AbstractC10288 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC16992 f75382 = new C23009();

    /* JADX INFO: renamed from: ֫ */
    public final Class f75383;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10288 f75384;

    public C23679(C14271 c14271, AbstractC10288 abstractC10288, Class cls) {
        this.f75384 = new C22929(c14271, abstractC10288, cls);
        this.f75383 = cls;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c18691.m42636();
        while (c18691.m42649()) {
            arrayList.add(this.f75384.mo5173(c18691));
        }
        c18691.m42645();
        int size = arrayList.size();
        Class cls = this.f75383;
        if (cls.isPrimitive()) {
            Object objNewInstance = Array.newInstance((Class<?>) cls, size);
            for (int i = 0; i < size; i++) {
                Array.set(objNewInstance, i, arrayList.get(i));
            }
            return objNewInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        if (obj == null) {
            c24726.m54383();
            return;
        }
        c24726.m54374();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f75384.mo5174(c24726, Array.get(obj, i));
        }
        c24726.m54391();
    }
}
