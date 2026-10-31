package l;

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
public final class C12474 extends C21647 implements InterfaceC3302, InterfaceC1830 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C21214 f37490;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C13721 f37491;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11169 f37492;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient C0213 f37493;

    @Override // java.util.Map, l.InterfaceC1830
    public final void forEach(BiConsumer biConsumer) {
        C23016.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object compute(Object obj, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f69483) {
            C21214 c21214 = this.f37490;
            c21214.getClass();
            f = (Float) C23016.$default$compute(c21214, num, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object computeIfAbsent(Object obj, Function function) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f69483) {
            C21214 c21214 = this.f37490;
            c21214.getClass();
            f = (Float) C23016.$default$computeIfAbsent(c21214, num, function);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f69483) {
            C21214 c21214 = this.f37490;
            c21214.getClass();
            f = (Float) C23016.$default$computeIfPresent(c21214, num, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        Float f;
        Float f2 = (Float) obj2;
        synchronized (this.f69483) {
            C21214 c21214 = this.f37490;
            c21214.getClass();
            f = (Float) C23016.$default$getOrDefault(c21214, obj, f2);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f69483) {
            C21214 c21214 = this.f37490;
            c21214.getClass();
            f = (Float) C23016.$default$merge(c21214, num, f2, biFunction);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object putIfAbsent(Object obj, Object obj2) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f69483) {
            C21214 c21214 = this.f37490;
            c21214.getClass();
            f = (Float) C23016.$default$putIfAbsent(c21214, num, f2);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final Object replace(Object obj, Object obj2) {
        Float f;
        Integer num = (Integer) obj;
        Float f2 = (Float) obj2;
        synchronized (this.f69483) {
            C21214 c21214 = this.f37490;
            c21214.getClass();
            f = (Float) C23016.$default$replace(c21214, num, f2);
        }
        return f;
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean z$default$replace;
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        Float f2 = (Float) obj3;
        synchronized (this.f69483) {
            C21214 c21214 = this.f37490;
            c21214.getClass();
            z$default$replace = C23016.$default$replace(c21214, num, f, f2);
        }
        return z$default$replace;
    }

    public C12474(C21214 c21214) {
        super(c21214);
        this.f37490 = c21214;
    }

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f69483) {
            zContainsValue = this.f37490.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f69483) {
            this.f37490.putAll(map);
        }
    }

    @Override // l.InterfaceC3302
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC18559 mo10099() {
        C0213 c0213;
        synchronized (this.f69483) {
            if (this.f37493 == null) {
                this.f37493 = C5153.m14711(this.f37490.mo10099(), this.f69483);
            }
            c0213 = this.f37493;
        }
        return c0213;
    }

    @Override // java.util.Map
    @Deprecated
    public final Set entrySet() {
        return mo10099();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C13721 c13721;
        synchronized (this.f69483) {
            if (this.f37491 == null) {
                InterfaceC11606 interfaceC11606KeySet = this.f37490.keySet();
                C21647 c21647 = this.f69483;
                C22894 c22894 = C7372.f22644;
                this.f37491 = new C13721(interfaceC11606KeySet, c21647);
            }
            c13721 = this.f37491;
        }
        return c13721;
    }

    @Override // java.util.Map
    public final Collection values() {
        InterfaceC11169 interfaceC11169;
        synchronized (this.f69483) {
            if (this.f37492 == null) {
                this.f37492 = C17518.m40935(this.f37490.values(), this.f69483);
            }
            interfaceC11169 = this.f37492;
        }
        return interfaceC11169;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f69483) {
            zIsEmpty = this.f37490.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // l.C21647, java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f69483) {
            iHashCode = this.f37490.hashCode();
        }
        return iHashCode;
    }

    @Override // l.C21647, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f69483) {
            zEquals = this.f37490.equals(obj);
        }
        return zEquals;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f69483) {
            objectOutputStream.defaultWriteObject();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m30634(int i) {
        float f;
        synchronized (this.f69483) {
            C21214 c21214 = this.f37490;
            if (i == 0) {
                if (!c21214.f68353) {
                    f = -1.0f;
                    break;
                }
                f = c21214.f68349[c21214.f68348];
            } else {
                int[] iArr = c21214.f68352;
                int iM32766 = C13630.m32766(i) & c21214.f68345;
                int i2 = iArr[iM32766];
                if (i2 != 0) {
                    if (i == i2) {
                        f = c21214.f68349[iM32766];
                    } else {
                        while (true) {
                            iM32766 = (iM32766 + 1) & c21214.f68345;
                            int i3 = iArr[iM32766];
                            if (i3 != 0) {
                                if (i == i3) {
                                    f = c21214.f68349[iM32766];
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

    @Override // java.util.Map, l.InterfaceC1830
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f69483) {
            C13843.replaceAll(this.f37490, biFunction);
        }
    }

    @Override // java.util.Map, l.InterfaceC1830
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        boolean z$default$remove;
        synchronized (this.f69483) {
            C21214 c21214 = this.f37490;
            c21214.getClass();
            z$default$remove = C23016.$default$remove(c21214, obj, obj2);
        }
        return z$default$remove;
    }
}
