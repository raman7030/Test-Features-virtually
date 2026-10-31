package l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8827 */
/* JADX INFO: loaded from: classes.dex */
public final class C22423 extends AbstractC8333 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f72655 = new C21718();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class f72656;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 f72657;

    public C22423(C12524 c12524, AbstractC8333 abstractC8333, Class cls) {
        this.f72657 = new C21634(c12524, abstractC8333, cls);
        this.f72656 = cls;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c17175.m40391();
        while (c17175.m40404()) {
            arrayList.add(this.f72657.mo2844(c17175));
        }
        c17175.m40400();
        int size = arrayList.size();
        Class cls = this.f72656;
        if (cls.isPrimitive()) {
            Object objNewInstance = Array.newInstance((Class<?>) cls, size);
            for (int i = 0; i < size; i++) {
                Array.set(objNewInstance, i, arrayList.get(i));
            }
            return objNewInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        if (obj == null) {
            c23525.m51981();
            return;
        }
        c23525.m51972();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f72657.mo2845(c23525, Array.get(obj, i));
        }
        c23525.m51989();
    }
}
