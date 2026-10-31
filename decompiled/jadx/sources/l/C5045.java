package l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۚ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5045 implements InterfaceC16602, InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C5045 f15871 = new C5045();

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        C23658 c23658 = c5751.f17702;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            if ((c6725.f20878 & EnumC20837.WriteNullListAsEmpty.f67472) != 0) {
                c6725.write("[]");
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        int length = objArr.length;
        int i = length - 1;
        if (i == -1) {
            c6725.append((CharSequence) "[]");
            return;
        }
        C14485 c14485 = c5751.f17704;
        c5751.m16190(c14485, obj, obj2);
        try {
            c6725.write(91);
            int i2 = 0;
            if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                c5751.m16193();
                c5751.m16194();
                while (i2 < length) {
                    if (i2 != 0) {
                        c6725.write(44);
                        c5751.m16194();
                    }
                    c5751.m16188(objArr[i2]);
                    i2++;
                }
                c5751.m16187();
                c5751.m16194();
                c6725.write(93);
                c5751.f17704 = c14485;
                return;
            }
            Class<?> cls = null;
            InterfaceC16602 interfaceC16602M52187 = null;
            while (i2 < i) {
                Object obj3 = objArr[i2];
                if (obj3 == null) {
                    c6725.append((CharSequence) "null,");
                } else {
                    IdentityHashMap identityHashMap = c5751.f17697;
                    if (identityHashMap != null && identityHashMap.containsKey(obj3)) {
                        c5751.m16192(obj3);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            interfaceC16602M52187.mo3046(c5751, obj3, null, null);
                        } else {
                            interfaceC16602M52187 = c23658.m52187(cls2);
                            interfaceC16602M52187.mo3046(c5751, obj3, null, null);
                            cls = cls2;
                        }
                    }
                    c6725.write(44);
                }
                i2++;
            }
            Object obj4 = objArr[i];
            if (obj4 == null) {
                c6725.append((CharSequence) "null]");
            } else {
                IdentityHashMap identityHashMap2 = c5751.f17697;
                if (identityHashMap2 != null && identityHashMap2.containsKey(obj4)) {
                    c5751.m16192(obj4);
                } else {
                    try {
                        c23658.m52187(obj4.getClass()).mo3046(c5751, obj4, Integer.valueOf(i), null);
                    } catch (IOException e) {
                        throw new C15082(e.getMessage(), (Throwable) e);
                    }
                }
                c6725.write(93);
            }
            c5751.f17704 = c14485;
        } catch (Throwable th) {
            c5751.f17704 = c14485;
            throw th;
        }
    }

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        C7322 c7322 = c11556.f34488;
        int iM19646 = c7322.m19646();
        if (iM19646 == 8) {
            c7322.m19641(16);
            return null;
        }
        if (type != char[].class) {
            if (iM19646 == 4) {
                byte[] bArrM19625 = c7322.m19625();
                c7322.m19641(16);
                return bArrM19625;
            }
            Class<?> componentType = ((Class) type).getComponentType();
            C0972 c0972 = new C0972();
            c11556.m28439(componentType, c0972, obj);
            return m14565(c11556, (Class) componentType, c0972);
        }
        if (iM19646 == 4) {
            String strM19634 = c7322.m19634();
            c7322.m19641(16);
            return strM19634.toCharArray();
        }
        if (iM19646 == 2) {
            Number numberM19644 = c7322.m19644();
            c7322.m19641(16);
            return numberM19644.toString().toCharArray();
        }
        return AbstractC5206.m14985(c11556.m28434((Object) null)).toCharArray();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m14565(C11556 c11556, Class cls, C0972 c0972) {
        if (c0972 == null) {
            return null;
        }
        int size = c0972.size();
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Object objM44732 = c0972.get(i);
            if (objM44732 == c0972) {
                Array.set(objNewInstance, i, objNewInstance);
            } else {
                if (cls.isArray()) {
                    if (!cls.isInstance(objM44732)) {
                        objM44732 = m14565(c11556, cls, (C0972) objM44732);
                    }
                } else {
                    objM44732 = C19426.m44732(objM44732, cls, c11556.f34495);
                }
                Array.set(objNewInstance, i, objM44732);
            }
        }
        c0972.m3436(objNewInstance);
        c0972.m3433((Type) cls);
        return objNewInstance;
    }
}
