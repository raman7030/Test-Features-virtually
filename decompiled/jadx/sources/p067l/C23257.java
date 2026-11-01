package p067l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩹֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAUK */
/* JADX INFO: loaded from: classes.dex */
public final class C23257 implements InterfaceC18147, InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public static final C23257 f73094 = new C23257();

    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) {
        C8760 c8760 = c7834.f20541;
        if (obj == null) {
            if ((c8760.f23752 & EnumC22172.WriteNullListAsEmpty.f70155) != 0) {
                c8760.write("[]");
                return;
            } else {
                c8760.m20244();
                return;
            }
        }
        int i = c8760.f23752;
        EnumC22172 enumC22172 = EnumC22172.WriteClassName;
        Type typeM47044 = (i & enumC22172.f70155) != 0 ? C20831.m47044(type) : null;
        Collection collection = (Collection) obj;
        C16135 c16135 = c7834.f20549;
        c7834.m18109(c16135, obj, obj2);
        if ((c8760.f23752 & enumC22172.f70155) != 0) {
            if (HashSet.class == collection.getClass()) {
                c8760.append((CharSequence) "Set");
            } else if (TreeSet.class == collection.getClass()) {
                c8760.append((CharSequence) "TreeSet");
            }
        }
        try {
            c8760.write(91);
            int i2 = 0;
            for (Object obj3 : collection) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    c8760.write(44);
                }
                if (obj3 == null) {
                    c8760.m20244();
                } else {
                    Class<?> cls = obj3.getClass();
                    if (cls == Integer.class) {
                        c8760.writeInt(((Integer) obj3).intValue());
                    } else if (cls == Long.class) {
                        c8760.m20249(((Long) obj3).longValue());
                        if ((c8760.f23752 & EnumC22172.WriteClassName.f70155) != 0) {
                            c8760.write(76);
                        }
                    } else {
                        c7834.f20547.m54590(cls).mo5359(c7834, obj3, Integer.valueOf(i2), typeM47044);
                    }
                }
                i2 = i3;
            }
            c8760.write(93);
        } finally {
            c7834.f20549 = c16135;
        }
    }

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        Collection arrayList;
        Type type2;
        C9327 c9327 = c13351.f37485;
        if (c9327.m21614() == 8) {
            c9327.m21609(16);
            return null;
        }
        if (type == C3292.class) {
            C3292 c3292 = new C3292();
            c13351.m30487(c3292, (Object) null);
            return c3292;
        }
        Type rawType = type;
        while (!(rawType instanceof Class)) {
            if (rawType instanceof ParameterizedType) {
                rawType = ((ParameterizedType) rawType).getRawType();
            } else {
                throw new C16702("TODO");
            }
        }
        Class cls = (Class) rawType;
        if (cls == AbstractCollection.class || cls == Collection.class) {
            arrayList = new ArrayList();
        } else if (cls.isAssignableFrom(HashSet.class)) {
            arrayList = new HashSet();
        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
            arrayList = new LinkedHashSet();
        } else if (cls.isAssignableFrom(TreeSet.class)) {
            arrayList = new TreeSet();
        } else if (cls.isAssignableFrom(ArrayList.class)) {
            arrayList = new ArrayList();
        } else if (cls.isAssignableFrom(EnumSet.class)) {
            if (type instanceof ParameterizedType) {
                type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            } else {
                type2 = Object.class;
            }
            arrayList = EnumSet.noneOf((Class) type2);
        } else {
            try {
                arrayList = (Collection) cls.newInstance();
            } catch (Exception unused) {
                throw new C16702("create instane error, class ".concat(cls.getName()));
            }
        }
        c13351.m30485(C20831.m47044(type), arrayList, obj);
        return arrayList;
    }
}
