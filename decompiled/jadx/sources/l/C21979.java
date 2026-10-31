package l;

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
public final class C21979 implements InterfaceC16602, InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C21979 f70383 = new C21979();

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        if (obj == null) {
            if ((c6725.f20878 & EnumC20837.WriteNullListAsEmpty.f67472) != 0) {
                c6725.write("[]");
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        int i = c6725.f20878;
        EnumC20837 enumC20837 = EnumC20837.WriteClassName;
        Type typeM44750 = (i & enumC20837.f67472) != 0 ? C19426.m44750(type) : null;
        Collection collection = (Collection) obj;
        C14485 c14485 = c5751.f17704;
        c5751.m16190(c14485, obj, obj2);
        if ((c6725.f20878 & enumC20837.f67472) != 0) {
            if (HashSet.class == collection.getClass()) {
                c6725.append((CharSequence) "Set");
            } else if (TreeSet.class == collection.getClass()) {
                c6725.append((CharSequence) "TreeSet");
            }
        }
        try {
            c6725.write(91);
            int i2 = 0;
            for (Object obj3 : collection) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    c6725.write(44);
                }
                if (obj3 == null) {
                    c6725.m18296();
                } else {
                    Class<?> cls = obj3.getClass();
                    if (cls == Integer.class) {
                        c6725.writeInt(((Integer) obj3).intValue());
                    } else if (cls == Long.class) {
                        c6725.m18301(((Long) obj3).longValue());
                        if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0) {
                            c6725.write(76);
                        }
                    } else {
                        c5751.f17702.m52187(cls).mo3046(c5751, obj3, Integer.valueOf(i2), typeM44750);
                    }
                }
                i2 = i3;
            }
            c6725.write(93);
        } finally {
            c5751.f17704 = c14485;
        }
    }

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        Collection arrayList;
        Type type2;
        C7322 c7322 = c11556.f34488;
        if (c7322.m19646() == 8) {
            c7322.m19641(16);
            return null;
        }
        if (type == C0972.class) {
            C0972 c0972 = new C0972();
            c11556.m28441(c0972, (Object) null);
            return c0972;
        }
        Type rawType = type;
        while (!(rawType instanceof Class)) {
            if (rawType instanceof ParameterizedType) {
                rawType = ((ParameterizedType) rawType).getRawType();
            } else {
                throw new C15082("TODO");
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
                throw new C15082("create instane error, class ".concat(cls.getName()));
            }
        }
        c11556.m28439(C19426.m44750(type), arrayList, obj);
        return arrayList;
    }
}
