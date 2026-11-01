package p067l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۚ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVP */
/* JADX INFO: loaded from: classes3.dex */
public final class C7163 implements InterfaceC18147, InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public static final C7163 f18703 = new C7163();

    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) {
        C8760 c8760 = c7834.f20541;
        C24853 c24853 = c7834.f20547;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            if ((c8760.f23752 & EnumC22172.WriteNullListAsEmpty.f70155) != 0) {
                c8760.write("[]");
                return;
            } else {
                c8760.m20244();
                return;
            }
        }
        int length = objArr.length;
        int i = length - 1;
        if (i == -1) {
            c8760.append((CharSequence) "[]");
            return;
        }
        C16135 c16135 = c7834.f20549;
        c7834.m18109(c16135, obj, obj2);
        try {
            c8760.write(91);
            int i2 = 0;
            if ((c8760.f23752 & EnumC22172.PrettyFormat.f70155) != 0) {
                c7834.m18112();
                c7834.m18113();
                while (i2 < length) {
                    if (i2 != 0) {
                        c8760.write(44);
                        c7834.m18113();
                    }
                    c7834.m18107(objArr[i2]);
                    i2++;
                }
                c7834.m18106();
                c7834.m18113();
                c8760.write(93);
                c7834.f20549 = c16135;
                return;
            }
            Class<?> cls = null;
            InterfaceC18147 interfaceC18147M54590 = null;
            while (i2 < i) {
                Object obj3 = objArr[i2];
                if (obj3 == null) {
                    c8760.append((CharSequence) "null,");
                } else {
                    IdentityHashMap identityHashMap = c7834.f20542;
                    if (identityHashMap != null && identityHashMap.containsKey(obj3)) {
                        c7834.m18111(obj3);
                    } else {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            interfaceC18147M54590.mo5359(c7834, obj3, null, null);
                        } else {
                            interfaceC18147M54590 = c24853.m54590(cls2);
                            interfaceC18147M54590.mo5359(c7834, obj3, null, null);
                            cls = cls2;
                        }
                    }
                    c8760.write(44);
                }
                i2++;
            }
            Object obj4 = objArr[i];
            if (obj4 == null) {
                c8760.append((CharSequence) "null]");
            } else {
                IdentityHashMap identityHashMap2 = c7834.f20542;
                if (identityHashMap2 != null && identityHashMap2.containsKey(obj4)) {
                    c7834.m18111(obj4);
                } else {
                    try {
                        c24853.m54590(obj4.getClass()).mo5359(c7834, obj4, Integer.valueOf(i), null);
                    } catch (IOException e) {
                        throw new C16702(e.getMessage(), (Throwable) e);
                    }
                }
                c8760.write(93);
            }
            c7834.f20549 = c16135;
        } catch (Throwable th) {
            c7834.f20549 = c16135;
            throw th;
        }
    }

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        C9327 c9327 = c13351.f37485;
        int iM21614 = c9327.m21614();
        if (iM21614 == 8) {
            c9327.m21609(16);
            return null;
        }
        if (type != char[].class) {
            if (iM21614 == 4) {
                byte[] bArrM21593 = c9327.m21593();
                c9327.m21609(16);
                return bArrM21593;
            }
            Class<?> componentType = ((Class) type).getComponentType();
            C3292 c3292 = new C3292();
            c13351.m30485(componentType, c3292, obj);
            return m16469(c13351, (Class) componentType, c3292);
        }
        if (iM21614 == 4) {
            String strM21602 = c9327.m21602();
            c9327.m21609(16);
            return strM21602.toCharArray();
        }
        if (iM21614 == 2) {
            Number numberM21612 = c9327.m21612();
            c9327.m21609(16);
            return numberM21612.toString().toCharArray();
        }
        return AbstractC7316.m16895(c13351.m30480((Object) null)).toCharArray();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m16469(C13351 c13351, Class cls, C3292 c3292) {
        if (c3292 == null) {
            return null;
        }
        int size = c3292.size();
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Object objM47026 = c3292.get(i);
            if (objM47026 == c3292) {
                Array.set(objNewInstance, i, objNewInstance);
            } else {
                if (cls.isArray()) {
                    if (!cls.isInstance(objM47026)) {
                        objM47026 = m16469(c13351, cls, (C3292) objM47026);
                    }
                } else {
                    objM47026 = C20831.m47026(objM47026, cls, c13351.f37492);
                }
                Array.set(objNewInstance, i, objM47026);
            }
        }
        c3292.m5739(objNewInstance);
        c3292.m5736((Type) cls);
        return objNewInstance;
    }
}
