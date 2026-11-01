package p067l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes4.dex */
public class C12338 extends AbstractC15689 {

    /* JADX INFO: renamed from: ۢ */
    public static final C16360 f34429 = new C16360(null, null, null, null);

    /* JADX INFO: renamed from: ۜ */
    public int f34430;

    /* JADX INFO: renamed from: ܳ */
    public C12338 f34431;

    /* JADX INFO: renamed from: ܽ */
    public C16360 f34432;

    /* JADX INFO: renamed from: ܿ */
    public int f34433;

    /* JADX INFO: renamed from: ᩳ */
    public int f34434;

    /* JADX INFO: renamed from: ᩷ */
    public C16360[] f34435;

    /* JADX INFO: renamed from: ᩻ */
    public int f34436;

    public /* synthetic */ C12338(C25078 c25078, AbstractC7783 abstractC7783, C16360[] c16360Arr) {
        this((C12338) c25078, abstractC7783, c16360Arr);
    }

    public C12338(C12338 c12338, AbstractC7783 abstractC7783, C16360[] c16360Arr) {
        super(abstractC7783);
        this.f34433 = 0;
        this.f34436 = 0;
        this.f34431 = c12338;
        C1446.m31704(abstractC7783 != null);
        this.f34435 = c16360Arr;
        this.f34434 = c16360Arr.length - 1;
    }

    public C12338(C12338 c12338, AbstractC7783 abstractC7783, C16360[] c16360Arr, int i) {
        this(c12338, abstractC7783, c16360Arr);
        this.f34433 = i;
    }

    public C12338(AbstractC7783 abstractC7783) {
        this((C12338) null, abstractC7783, new C16360[16]);
    }

    @Override // p067l.AbstractC15689
    /* JADX INFO: renamed from: ܽ */
    public AbstractC15689 mo28413(AbstractC7783 abstractC7783) {
        C12338 c12338 = new C12338(this, abstractC7783, this.f34435, this.f34433);
        this.f34430++;
        return c12338;
    }

    @Override // p067l.AbstractC15689
    /* JADX INFO: renamed from: ᩳ */
    public AbstractC15689 mo28416(AbstractC7783 abstractC7783) {
        if (this.f34430 > 0) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            for (C12338 c12338 = this; c12338 != null; c12338 = c12338.f34431) {
                setNewSetFromMap.add(c12338);
            }
            C16360[] c16360Arr = this.f34435;
            C16360[] c16360Arr2 = new C16360[c16360Arr.length];
            int i = 0;
            for (int i2 = 0; i2 < c16360Arr.length; i2++) {
                C16360 c16360 = c16360Arr[i2];
                while (c16360 != null && c16360 != f34429 && !setNewSetFromMap.contains(c16360.f48075)) {
                    c16360 = c16360.f48077;
                }
                if (c16360 != null) {
                    i++;
                    c16360Arr2[i2] = c16360;
                }
            }
            return new C12338(this, abstractC7783, c16360Arr2, i);
        }
        return new C12338(this, abstractC7783, (C16360[]) this.f34435.clone(), this.f34433);
    }

    @Override // p067l.AbstractC15689
    /* JADX INFO: renamed from: ۧ */
    public AbstractC15689 mo28410() {
        C1446.m31704(this.f34430 == 0);
        C16360[] c16360Arr = this.f34435;
        C12338 c12338 = this.f34431;
        if (c16360Arr != c12338.f34435) {
            return c12338;
        }
        while (true) {
            C16360 c16360 = this.f34432;
            if (c16360 == null) {
                break;
            }
            int iM28409 = m28409(c16360.f48076.f20408);
            C16360 c16361 = this.f34435[iM28409];
            C16360 c16362 = this.f34432;
            C1446.m31701(c16362.f48076, c16361 == c16362);
            this.f34435[iM28409] = this.f34432.f48077;
            this.f34432 = this.f34432.f48073;
        }
        C1446.m31704(c12338.f34430 > 0);
        c12338.f34430--;
        c12338.f34433 = this.f34433;
        return c12338;
    }

    @Override // p067l.AbstractC15689
    /* JADX INFO: renamed from: ܿ */
    public void mo28415(AbstractC7783 abstractC7783) {
        int i = 0;
        C1446.m31704(this.f34430 == 0);
        int i2 = this.f34433 * 3;
        int i3 = this.f34434 * 2;
        C16360 c16360 = f34429;
        if (i2 >= i3) {
            C1446.m31704(this.f34430 == 0);
            C16360[] c16360Arr = this.f34435;
            int length = c16360Arr.length * 2;
            C16360[] c16360Arr2 = new C16360[length];
            C12338 c12338 = this;
            while (c12338 != null) {
                if (c12338.f34435 == c16360Arr) {
                    C1446.m31704(c12338 == this || c12338.f34430 != 0);
                    c12338.f34435 = c16360Arr2;
                    c12338.f34434 = length - 1;
                }
                c12338 = c12338.f34431;
            }
            int length2 = c16360Arr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                C16360 c16361 = c16360Arr[length2];
                if (c16361 != null && c16361 != c16360) {
                    this.f34435[m28409(c16361.f48076.f20408)] = c16361;
                    i++;
                }
            }
            this.f34433 = i;
        }
        int iM28409 = m28409(abstractC7783.f20408);
        C16360 c16362 = this.f34435[iM28409];
        if (c16362 == null) {
            this.f34433++;
        } else {
            c16360 = c16362;
        }
        C16360 c16363 = new C16360(abstractC7783, c16360, this.f34432, this);
        this.f34435[iM28409] = c16363;
        this.f34432 = c16363;
        this.f26586.m31079(this, abstractC7783);
    }

    @Override // p067l.AbstractC15689
    /* JADX INFO: renamed from: ᩻ */
    public void mo28417(final AbstractC7783 abstractC7783) {
        C1446.m31704(this.f34430 == 0);
        C16360 c16360M28411 = m28411(abstractC7783.f20408, new Predicate() { // from class: l.ۗ᩵֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m12524or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC7783) obj) == abstractC7783;
            }
        });
        if (c16360M28411.f48075 == null) {
            return;
        }
        int iM28409 = m28409(abstractC7783.f20408);
        C16360[] c16360Arr = this.f34435;
        C16360 c16360 = c16360Arr[iM28409];
        if (c16360 == c16360M28411) {
            c16360Arr[iM28409] = c16360M28411.f48077;
        } else {
            while (c16360.f48077 != c16360M28411) {
                c16360 = c16360.f48077;
            }
            c16360.f48077 = c16360M28411.f48077;
        }
        if (this.f34432 == c16360M28411) {
            C16360 c16361 = c16360M28411.f48073;
            this.f34432 = c16361;
            if (c16361 != null) {
                c16361.f48074 = null;
            }
        } else {
            C1446.m31701(c16360M28411.f48076, c16360M28411.f48074 != null);
            C16360 c16362 = c16360M28411.f48074;
            c16362.f48073 = c16360M28411.f48073;
            C16360 c16363 = c16360M28411.f48073;
            if (c16363 != null) {
                c16363.f48074 = c16362;
            }
        }
        this.f34436++;
        this.f26586.m31080(this, abstractC7783);
    }

    @Override // p067l.AbstractC15689
    /* JADX INFO: renamed from: ܳ */
    public void mo28412(AbstractC7783 abstractC7783) {
        C12338 c12338;
        C1446.m31704(this.f34430 == 0);
        C16360 c16360Mo28414 = mo28414(abstractC7783.f20408);
        while (true) {
            c12338 = c16360Mo28414.f48075;
            if (c12338 != this || c16360Mo28414.f48076.f20405 == abstractC7783.f20405) {
                break;
            } else {
                c16360Mo28414 = c16360Mo28414.m37175();
            }
        }
        if (c12338 != this) {
            mo28415(abstractC7783);
        }
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ۧ */
    public boolean mo22462(AbstractC7783 abstractC7783) {
        for (C16360 c16360Mo28414 = mo28414(abstractC7783.f20408); c16360Mo28414.f48075 == this; c16360Mo28414 = c16360Mo28414.m37175()) {
            if (c16360Mo28414.f48076 == abstractC7783) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public C16360 mo28414(AbstractC12224 abstractC12224) {
        return m28411(abstractC12224, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C16360 m28411(AbstractC12224 abstractC12224, Predicate predicate) {
        C16360 c16360 = this.f34435[m28409(abstractC12224)];
        C16360 c16361 = f34429;
        if (c16360 == null || c16360 == c16361) {
            return c16361;
        }
        while (c16360.f48075 != null) {
            AbstractC7783 abstractC7783 = c16360.f48076;
            if (abstractC7783.f20408 == abstractC12224 && (predicate == null || predicate.test(abstractC7783))) {
                break;
            }
            c16360 = c16360.f48077;
        }
        return c16360;
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7783 mo22458(AbstractC12224 abstractC12224, Predicate predicate) {
        return m28411(abstractC12224, predicate).f48076;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m28409(AbstractC12224 abstractC12224) {
        int iHashCode = abstractC12224.hashCode();
        int i = this.f34434;
        int i2 = iHashCode & i;
        int i3 = i - ((iHashCode + (iHashCode >> 16)) << 1);
        int i4 = -1;
        while (true) {
            C16360 c16360 = this.f34435[i2];
            if (c16360 != null) {
                if (c16360 == f34429) {
                    if (i4 < 0) {
                        i4 = i2;
                    }
                } else if (c16360.f48076.f20408 == abstractC12224) {
                    break;
                }
                i2 = (i2 + i3) & this.f34434;
            } else if (i4 >= 0) {
                return i4;
            }
        }
        return i2;
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public boolean mo22461(C20149 c20149) {
        return ((C21726) mo22455(c20149, EnumC3620.NON_RECURSIVE)).iterator().hasNext();
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public Iterable mo22455(Predicate predicate, EnumC3620 enumC3620) {
        return new C21726(this, enumC3620, predicate);
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public Iterable mo22457(AbstractC12224 abstractC12224, Predicate predicate, EnumC3620 enumC3620) {
        return new C6973(this, abstractC12224, predicate, enumC3620);
    }

    @Override // p067l.AbstractC9655
    /* JADX INFO: renamed from: ֫ */
    public AbstractC9655 mo22459(AbstractC7783 abstractC7783) {
        for (C16360 c16360Mo28414 = mo28414(abstractC7783.f20408); c16360Mo28414.f48075 != null; c16360Mo28414 = c16360Mo28414.m37175()) {
            if (c16360Mo28414.f48076 == abstractC7783) {
                return this;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Scope[");
        for (C12338 c12338 = this; c12338 != null; c12338 = c12338.f34431) {
            if (c12338 != this) {
                sb.append(" | ");
            }
            for (C16360 c16360 = c12338.f34432; c16360 != null; c16360 = c16360.f48073) {
                if (c16360 != c12338.f34432) {
                    sb.append(", ");
                }
                sb.append(c16360.f48076);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
