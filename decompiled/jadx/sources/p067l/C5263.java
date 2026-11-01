package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5263 implements Iterable {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC20192 f12386;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC20192 f12387;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f12388;

    /* JADX INFO: renamed from: ᩶ */
    public C6091 f12389;

    /* JADX INFO: renamed from: ᩸ */
    public LinkedHashMap f12390;

    /* JADX INFO: renamed from: ᩹ */
    public final C23368 f12391 = new C23368("");

    /* JADX INFO: renamed from: ۗ */
    public final C17450 f12385 = new C17450(-1, null);

    public C5263(C6091 c6091) {
        C17450 c17450 = new C17450(-1, new C21357(EnumC12758.f35897, null));
        ArrayList arrayList = new ArrayList(40);
        this.f12388 = arrayList;
        this.f12390 = new LinkedHashMap(40);
        this.f12386 = new C3922(this);
        this.f12387 = new C12640(this);
        this.f12389 = c6091;
        arrayList.add(c17450);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f12388.iterator();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11369(final C18674 c18674) {
        final C17450 c17450 = (C17450) c18674.f10654;
        if (m11350(c17450)) {
            this.f12389.m48074(new Supplier() { // from class: l.ᩴۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED ConstPool[");
                    sb.append(c17450.f23817);
                    sb.append("](");
                    C18674 c18675 = c18674;
                    sb.append(c18675.f10653.toString());
                    sb.append(") = ");
                    sb.append(c18675.f10654);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11367(final C16661 c16661) {
        final C8537 c8537 = (C8537) c16661.f10654;
        boolean zM11350 = m11350((C17450) c8537.f22916);
        C6091 c6091 = this.f12389;
        if (zM11350) {
            c6091.m48074(new Supplier() { // from class: l.᩵ۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Left:ConstPool[");
                    C8537 c8538 = c8537;
                    sb.append(((C17450) c8538.f22916).f23817);
                    sb.append("](");
                    sb.append(c16661.f10653.toString());
                    sb.append(") = ");
                    sb.append(((C17450) c8538.f22916).f52180);
                    return sb.toString();
                }
            });
        }
        if (m11350((C17450) c8537.f22917)) {
            c6091.m48074(new Supplier() { // from class: l.֡ۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Right:ConstPool[");
                    C8537 c8538 = c8537;
                    sb.append(((C17450) c8538.f22917).f23817);
                    sb.append("](");
                    sb.append(c16661.f10653.toString());
                    sb.append(") = ");
                    sb.append(((C17450) c8538.f22917).f52180);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ */
    public boolean m11350(C17450 c17450) {
        C17450 c17450M11364;
        if (c17450.f52180 != null || (c17450M11364 = m11364(c17450.f23817)) == null) {
            return false;
        }
        AbstractC4711 abstractC4711 = c17450M11364.f52180;
        if (abstractC4711 != null) {
            C12640 c12640 = (C12640) this.f12387;
            c12640.getClass();
            C4769.m10065(c12640, abstractC4711);
        }
        c17450.f52180 = c17450M11364.f52180;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11362(final C18674 c18674) {
        final C17450 c17450 = (C17450) c18674.f10654;
        if (m11351(c17450)) {
            this.f12389.m48074(new Supplier() { // from class: l.᩹ۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of ConstPool[");
                    sb.append(c17450.f23817);
                    sb.append("](");
                    C18674 c18675 = c18674;
                    sb.append(c18675.f10653.toString());
                    sb.append(") = ");
                    sb.append(c18675.f10654);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11361(final C16661 c16661) {
        final C8537 c8537 = (C8537) c16661.f10654;
        boolean zM11351 = m11351((C17450) c8537.f22916);
        C6091 c6091 = this.f12389;
        if (zM11351) {
            c6091.m48074(new Supplier() { // from class: l.ۚۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of Left:ConstPool[");
                    C8537 c8538 = c8537;
                    sb.append(((C17450) c8538.f22916).f23817);
                    sb.append("](");
                    sb.append(c16661.f10653.toString());
                    sb.append(") = ");
                    sb.append(((C17450) c8538.f22916).f52180);
                    return sb.toString();
                }
            });
        }
        if (m11351((C17450) c8537.f22917)) {
            c6091.m48074(new Supplier() { // from class: l.֨ۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of Right:ConstPool[");
                    C8537 c8538 = c8537;
                    sb.append(((C17450) c8538.f22917).f23817);
                    sb.append("](");
                    sb.append(c16661.f10653.toString());
                    sb.append(") = ");
                    sb.append(((C17450) c8538.f22917).f52180);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public boolean m11351(C17450 c17450) {
        if (c17450.f52180 == null || c17450.mo20303()) {
            return false;
        }
        C18189 c18189M11358 = m11358(c17450);
        if (!c18189M11358.isPresent()) {
            return false;
        }
        c17450.f23817 = ((C17450) c18189M11358.get()).f23817;
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m11375() {
        ArrayList arrayList = this.f12388;
        this.f12389.m48090("fixRefsInPool: Fixing CP for %d explicit Constant Entries", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC4711 abstractC4711 = ((C17450) it.next()).f52180;
            if (abstractC4711 != null) {
                C12640 c12640 = (C12640) this.f12387;
                c12640.getClass();
                C4769.m10065(c12640, abstractC4711);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m11372() {
        ArrayList arrayList = this.f12388;
        this.f12389.m48090("fixIndexesInPool: Fixing CP for %d explicit Constant Entries.", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC4711 abstractC4711 = ((C17450) it.next()).f52180;
            if (abstractC4711 != null) {
                C3922 c3922 = (C3922) this.f12386;
                c3922.getClass();
                C4769.m10065(c3922, abstractC4711);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11366() {
        C6091 c6091 = this.f12389;
        c6091.m48090("Checking Globals", new Object[0]);
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f12388;
            if (i >= arrayList.size()) {
                return;
            }
            C17450 c17450 = (C17450) arrayList.get(i);
            if (c17450 == this.f12385) {
                c17450 = new C17450(i, this.f12391);
                arrayList.set(i, c17450);
            }
            if (!c17450.mo20303()) {
                c6091.mo13866("Constant #{0} not declared", Integer.toString(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m11376() {
        Iterator it = this.f12388.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f12389.m48090(String.format(" const #%4d: %s", Integer.valueOf(i), (C17450) it.next()), new Object[0]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final C21949 m11373() {
        return new C21949(1, Integer.valueOf(this.f12388.size() - 1));
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17450 m11364(int i) {
        ArrayList arrayList = this.f12388;
        if (i >= arrayList.size()) {
            return null;
        }
        return (C17450) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11344(final int i, final C17450 c17450, final int i2) {
        Supplier supplier = new Supplier() { // from class: l.ۘۤۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "cpool_set1: " + i + " " + c17450;
            }
        };
        C6091 c6091 = this.f12389;
        c6091.m48074(supplier);
        c6091.m48074(new Supplier() { // from class: l.᩶ۤۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C20778.m46922(i2, "param_size: ");
            }
        });
        c6091.m48074(new Supplier() { // from class: l.۫ۤۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C5263.m11343(this.f39954);
            }
        });
        c17450.f23817 = i;
        int i3 = i + i2;
        ArrayList arrayList = this.f12388;
        if (i3 >= arrayList.size()) {
            c6091.m48074(new Supplier() { // from class: l.ۤۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "calling ensureCapacity( " + (i + i2 + 1) + " )";
                }
            });
            int size = arrayList.size();
            int i4 = i3 - size;
            if (i4 > i2) {
                int i5 = (i3 - i2) - 1;
                c6091.mo4612("Missing Constant Pool entry(ies) {0} might be auto-filled with Utf8[null] ", size == i5 ? String.format("#%d", Integer.valueOf(size)) : String.format("#%d-#%d", Integer.valueOf(size), Integer.valueOf(i5)));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(this.f12385);
            }
        }
        arrayList.set(i, c17450);
        if (i2 == 2) {
            int i7 = i + 1;
            arrayList.set(i7, new C17450(i7, this.f12391));
        }
        c6091.m48074(new Supplier() { // from class: l.ۛۤۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "cpool_set2: " + i + " " + c17450;
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ String m11343(C5263 c5263) {
        return "pool_size : " + c5263.f12388.size();
    }

    /* JADX INFO: renamed from: ܿ */
    private void m11349(final int i) {
        this.f12389.m48074(new Supplier() { // from class: l.۠ۤۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C19768.m44906(i, "delete cell(", MotionUtils.EASING_TYPE_FORMAT_END);
            }
        });
        C16779 c16779 = new C16779(this, i);
        int i2 = 1;
        while (true) {
            ArrayList arrayList = this.f12388;
            if (i2 >= arrayList.size()) {
                arrayList.remove(i);
                C21230.forEach(arrayList, new C22816());
                return;
            } else {
                if (i2 != i) {
                    m11346(m11374(i2), c16779);
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11346(C17450 c17450, C16779 c16779) {
        if (c17450 != null) {
            c16779.m45213n(c17450);
            AbstractC4711 abstractC4711 = c17450.f52180;
            if (abstractC4711 != null) {
                switch (C18003.f53763[abstractC4711.f10653.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        m11346((C17450) abstractC4711.f10654, c16779);
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        C8537 c8537 = (C8537) abstractC4711.f10654;
                        m11346((C17450) c8537.f22916, c16779);
                        m11346((C17450) c8537.f22917, c16779);
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C17450 m11374(int i) {
        return (C17450) this.f12388.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17450 m11353(int i) {
        C17450 c17450M11364 = m11364(i);
        return c17450M11364 != null ? c17450M11364 : new C17450(i, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11359(int i, C17450 c17450) {
        AbstractC4711 abstractC4711 = c17450.f52180;
        C6091 c6091 = this.f12389;
        if (abstractC4711 == null) {
            c6091.m13870("Constant Pool Cell {0} without value", Integer.valueOf(i));
            throw null;
        }
        int iMo9989 = abstractC4711.mo9989();
        if (i == 0) {
            c6091.mo4612("Re-declaration of Constant #0 cannot be written to the class file", new Object[0]);
        } else {
            if (m11364(i) != null || (iMo9989 == 2 && m11364(i + 1) != null)) {
                c6091.mo13866("Constant Pool entry {0} has been redeclared or overlaps with entry {1}", C20778.m46922(i, "#"), "#" + Math.max(i - 1, 0));
                return;
            }
            if (c17450.mo20303() && c17450.f23817 != i) {
                c17450 = new C17450(-1, abstractC4711);
                c6091.m48090("setCell: new ConstCell " + c17450, new Object[0]);
            }
        }
        m11344(i, c17450, iMo9989);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18189 m11358(C17450 c17450) {
        final AbstractC4711 abstractC4711 = c17450.f52180;
        if (abstractC4711 == null) {
            if (m11373().m49472(Integer.valueOf(c17450.f23817))) {
                return C18189.ofNullable(m11364(c17450.f23817));
            }
            boolean zMo20303 = c17450.mo20303();
            C6091 c6091 = this.f12389;
            if (zMo20303) {
                c6091.m13870("Constant Pool Cell {0} without value", Integer.valueOf(c17450.f23817));
                throw null;
            }
            c6091.m13870("Const Cell has undefined Constant pool index and null value", new Object[0]);
            throw null;
        }
        return C7480.stream(this.f12390.values()).filter(new Predicate() { // from class: l.ܰۤۚ
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
            public /* synthetic */ Predicate m35172or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C17450 c17451 = (C17450) obj;
                if (!c17451.mo20303()) {
                    return false;
                }
                EnumC12758 enumC12758M39779 = c17451.m39779();
                AbstractC4711 abstractC4712 = abstractC4711;
                return enumC12758M39779 == abstractC4712.f10653 && c17451.f52180.mo9988(abstractC4712);
            }
        }).findFirst();
    }

    /* JADX INFO: renamed from: ܳ */
    private C17450 m11348(C17450 c17450) {
        C18189 c18189M11358 = m11358(c17450);
        if (c18189M11358.isPresent()) {
            C17450 c17451 = (C17450) c18189M11358.get();
            EnumC6604 enumC6604 = c17451.f52181;
            EnumC6604 enumC6605 = c17450.f52181;
            if (enumC6604 != enumC6605 && enumC6604.f17040 > enumC6605.f17040) {
                c17451.f52181 = enumC6605;
            }
            return c17451;
        }
        int iMo9989 = c17450.f52180.mo9989();
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f12388;
            if (i >= arrayList.size()) {
                break;
            }
            Object obj = arrayList.get(i);
            C17450 c17452 = this.f12385;
            if (obj == c17452 && (iMo9989 == 1 || arrayList.get(i + 1) == c17452)) {
                break;
            }
            i++;
        }
        m11344(i, c17450, iMo9989);
        return m11374(i);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m11370() {
        this.f12389.m48090("itemizePool", new Object[0]);
        for (final EnumC6604 enumC6604 : EnumC6604.values()) {
            Iterator it = C7480.stream(this.f12390.values()).filter(new Predicate() { // from class: l.ۙۤۚ
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
                public /* synthetic */ Predicate m15362or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C17450 c17450 = (C17450) obj;
                    if (c17450.mo20303()) {
                        return false;
                    }
                    return enumC6604.equals(c17450.f52181);
                }
            }).toList().iterator();
            while (it.hasNext()) {
                m11348((C17450) it.next());
            }
        }
        m11364(0).f23817 = 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17450 m11371(C17450 c17450) {
        this.f12389.m48090("itemizeCell", new Object[0]);
        return c17450.mo20303() ? c17450 : m11348(c17450);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public final C17450 m11356(AbstractC4711 abstractC4711) {
        C6091 c6091 = this.f12389;
        if (abstractC4711 == null) {
            c6091.m13870("ConstCell.value can''t be null", new Object[0]);
            throw null;
        }
        LinkedHashMap linkedHashMap = this.f12390;
        C17450 c17450 = (C17450) linkedHashMap.get(abstractC4711);
        if (c17450 == null) {
            C17450 c17451 = new C17450(-1, abstractC4711);
            linkedHashMap.put(abstractC4711, c17451);
            c6091.m48090("ConstantPoolHashByValue.put ('%s','%s')", abstractC4711, c17451);
            return c17451;
        }
        AbstractC4711 abstractC4712 = c17450.f52180;
        if (!abstractC4712.equals(abstractC4711)) {
            c6091.m13870("Seeking value {0} is not equal to found {1}", abstractC4711.toString(), abstractC4712.toString());
            throw null;
        }
        c6091.m48090(String.format("ConstantPoolHashByValue.got ('%s') for '%s'", c17450, abstractC4711), new Object[0]);
        return c17450;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17450 m11365(Integer num) {
        return m11356(new C10628(EnumC12758.f35891, num));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17450 m11354(String str) {
        return m11356(new C23368(str));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17450 m11355(final Function function) {
        return (C17450) C7480.stream(this.f12390.entrySet()).filter(new Predicate() { // from class: l.۟ۤۚ
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
            public /* synthetic */ Predicate m21896or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                if (((AbstractC4711) entry.getKey()).f10653 == EnumC12758.f35904) {
                    return ((Boolean) function.apply((String) ((AbstractC4711) entry.getKey()).f10654)).booleanValue();
                }
                return false;
            }
        }).findFirst().map(new C23868(2)).orElse(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17450 m11357(EnumC12758 enumC12758, C3724 c3724) {
        boolean zM7173 = c3724.m7173();
        C6091 c6091 = this.f12389;
        if (zM7173) {
            c6091.m13870("{0} emptyInfo", "ConstantPool::FindCell");
            throw null;
        }
        if (c3724.m7172() <= 0) {
            return m11356((AbstractC4711) new C18674(enumC12758, m11354((String) c3724.f22917)));
        }
        C17450 c17450M11364 = m11364(c3724.m7172());
        if (c17450M11364 != null && c17450M11364.f52180.f10653 == enumC12758) {
            return c17450M11364;
        }
        c6091.m13870("Constant Pool index {0} is not found", Integer.valueOf(c3724.m7172()));
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11360(InterfaceC2756 interfaceC2756) throws IOException {
        ArrayList arrayList = this.f12388;
        int size = arrayList.size();
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(size);
        C9575 c9575 = new C9575(size, 1);
        C6091 c6091 = this.f12389;
        c6091.m48074(c9575);
        int iMo9989 = 1;
        while (iMo9989 < size) {
            C17450 c17450 = (C17450) arrayList.get(iMo9989);
            AbstractC4711 abstractC4711 = c17450.f52180;
            if (c17450.f23817 != iMo9989) {
                c6091.m13870("Cell[{0}] has #{1}", Integer.toString(iMo9989), Integer.valueOf(c17450.f23817));
                throw null;
            }
            abstractC4711.mo9987((InterfaceC2756) c8121);
            iMo9989 += abstractC4711.mo9989();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m11352(final EnumC12758... enumC12758Arr) {
        return (ArrayList) C7480.stream(this.f12388).filter(new Predicate() { // from class: l.۬ۤۚ
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
            public /* synthetic */ Predicate m33708or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C17450) obj).m39779().m29299(enumC12758Arr);
            }
        }).collect(C24205.toCollection(new C24156()));
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m11363(final EnumC12758... enumC12758Arr) {
        return (ArrayList) C7480.stream(this.f12388).filter(new Predicate() { // from class: l.ۨۤۚ
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
            public /* synthetic */ Predicate m30571or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C17450 c17450 = (C17450) obj;
                return c17450.f52180 != null && c17450.m39779().m29299(enumC12758Arr);
            }
        }).collect(C24205.toCollection(new C24156()));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m11368(C17450 c17450) {
        if (c17450 != null) {
            int i = 0;
            if (c17450.m39779() == EnumC12758.f35925) {
                AbstractC4711 abstractC4711 = c17450.f52180;
                if (abstractC4711 != null) {
                    C17450 c17451 = (C17450) ((C15991) abstractC4711).f10654;
                    Object obj = ((C23368) c17451.f52180).f10654;
                    if (obj != null) {
                        String str = (String) obj;
                        if (str.startsWith("java/") || str.startsWith("javax/")) {
                            return;
                        }
                    }
                    i = c17451.f23817;
                }
                int i2 = c17450.f23817;
                m11349(i2);
                if (i2 <= i) {
                    i--;
                }
                m11349(i);
                return;
            }
            this.f12389.mo4612("Cannot delete Constant Pool entry \"{0}\" because only class cells are accepted", c17450);
        }
    }
}
