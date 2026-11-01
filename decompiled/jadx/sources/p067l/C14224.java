package p067l;

import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 246 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14224 extends C22942 implements InterfaceC5507, InterfaceC4108 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ */
    public final C22531 f40510;

    /* JADX INFO: renamed from: ۙ */
    public transient C15409 f40511;

    /* JADX INFO: renamed from: ۬ */
    public transient InterfaceC12984 f40512;

    /* JADX INFO: renamed from: ᩶ */
    public transient C2571 f40513;

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void forEach(BiConsumer biConsumer) {
        C24243.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f72186) {
            C22531 c22531 = this.f40510;
            c22531.getClass();
            f = (Float) C24243.$default$compute(c22531, num, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f72186) {
            C22531 c22531 = this.f40510;
            c22531.getClass();
            f = (Float) C24243.$default$computeIfAbsent(c22531, num, function);
        }
        return f;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f72186) {
            C22531 c22531 = this.f40510;
            c22531.getClass();
            f = (Float) C24243.$default$computeIfPresent(c22531, num, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Float f;
        Float f2 = (Float) obj2;
        synchronized (this.f72186) {
            C22531 c22531 = this.f40510;
            c22531.getClass();
            f = (Float) C24243.$default$getOrDefault(c22531, obj, f2);
        }
        return f;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f72186) {
            C22531 c22531 = this.f40510;
            c22531.getClass();
            f = (Float) C24243.$default$merge(c22531, num, f2, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f72186) {
            C22531 c22531 = this.f40510;
            c22531.getClass();
            f = (Float) C24243.$default$putIfAbsent(c22531, num, f2);
        }
        return f;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f72186) {
            C22531 c22531 = this.f40510;
            c22531.getClass();
            f = (Float) C24243.$default$replace(c22531, num, f2);
        }
        return f;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean z$default$replace;
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        Float f2 = (Float) obj3;
        synchronized (this.f72186) {
            C22531 c22531 = this.f40510;
            c22531.getClass();
            z$default$replace = C24243.$default$replace(c22531, num, f, f2);
        }
        return z$default$replace;
    }

    public C14224(C22531 c22531) {
        super(c22531);
        this.f40510 = c22531;
    }

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f72186) {
            zContainsValue = this.f40510.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f72186) {
            this.f40510.putAll(map);
        }
    }

    @Override // p067l.InterfaceC5507
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC20007 mo12134() {
        C2571 c2571;
        synchronized (this.f72186) {
            if (this.f40513 == null) {
                this.f40513 = C7266.m16619(this.f40510.mo12134(), this.f72186);
            }
            c2571 = this.f40513;
        }
        return c2571;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo12134();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C15409 c15409;
        synchronized (this.f72186) {
            if (this.f40511 == null) {
                InterfaceC13399 interfaceC13399KeySet = this.f40510.keySet();
                C22942 c22942 = this.f72186;
                C24127 c24127 = C9375.f25556;
                this.f40511 = new C15409(interfaceC13399KeySet, c22942);
            }
            c15409 = this.f40511;
        }
        return c15409;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC12984 interfaceC12984;
        synchronized (this.f72186) {
            if (this.f40512 == null) {
                this.f40512 = C19018.m43194(this.f40510.values(), this.f72186);
            }
            interfaceC12984 = this.f40512;
        }
        return interfaceC12984;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f72186) {
            zIsEmpty = this.f40510.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // p067l.C22942, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f72186) {
            iHashCode = this.f40510.hashCode();
        }
        return iHashCode;
    }

    @Override // p067l.C22942, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f72186) {
            zEquals = this.f40510.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f72186) {
            objectOutputStream.defaultWriteObject();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m32699(int i) {
        float f;
        synchronized (this.f72186) {
            C22531 c22531 = this.f40510;
            if (i == 0) {
                if (!c22531.f71036) {
                    f = -1.0f;
                    break;
                }
                f = c22531.f71032[c22531.f71031];
            } else {
                int[] iArr = c22531.f71035;
                int iM34881 = C15322.m34881(i) & c22531.f71028;
                int i2 = iArr[iM34881];
                if (i2 != 0) {
                    if (i == i2) {
                        f = c22531.f71032[iM34881];
                    } else {
                        while (true) {
                            iM34881 = (iM34881 + 1) & c22531.f71028;
                            int i3 = iArr[iM34881];
                            if (i3 != 0) {
                                if (i == i3) {
                                    f = c22531.f71032[iM34881];
                                    break;
                                }
                            }
                        }
                    }
                }
                f = -1.0f;
                break;
            }
        }
        return f;
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f72186) {
            C15525.replaceAll(this.f40510, biFunction);
        }
    }

    @Override // java.util.Map, p067l.InterfaceC4108
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean z$default$remove;
        synchronized (this.f72186) {
            C22531 c22531 = this.f40510;
            c22531.getClass();
            z$default$remove = C24243.$default$remove(c22531, obj, obj2);
        }
        return z$default$remove;
    }
}
