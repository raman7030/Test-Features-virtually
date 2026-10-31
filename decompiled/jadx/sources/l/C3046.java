package l;

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
public final class C3046 implements Iterable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18754 f9585;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18754 f9586;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f9587;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C3917 f9588;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f9589;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22096 f9590 = new C22096("");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C15869 f9584 = new C15869(-1, null);

    public C3046(C3917 c3917) {
        C15869 c15869 = new C15869(-1, new C19980(EnumC10932.f32919, null));
        ArrayList arrayList = new ArrayList(40);
        this.f9587 = arrayList;
        this.f9589 = new LinkedHashMap(40);
        this.f9585 = new C1635(this);
        this.f9586 = new C10808(this);
        this.f9588 = c3917;
        arrayList.add(c15869);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f9587.iterator();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9327(final C17157 c17157) {
        final C15869 c15869 = (C15869) c17157.f7866;
        if (m9308(c15869)) {
            this.f9588.m45762(new Supplier() { // from class: l.ᩴۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED ConstPool[");
                    sb.append(c15869.f20943);
                    sb.append("](");
                    C17157 c17158 = c17157;
                    sb.append(c17158.f7865.toString());
                    sb.append(") = ");
                    sb.append(c17158.f7866);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9325(final C15039 c15039) {
        final C6491 c6491 = (C6491) c15039.f7866;
        boolean zM9308 = m9308((C15869) c6491.f20042);
        C3917 c3917 = this.f9588;
        if (zM9308) {
            c3917.m45762(new Supplier() { // from class: l.᩵ۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Left:ConstPool[");
                    C6491 c6492 = c6491;
                    sb.append(((C15869) c6492.f20042).f20943);
                    sb.append("](");
                    sb.append(c15039.f7865.toString());
                    sb.append(") = ");
                    sb.append(((C15869) c6492.f20042).f49042);
                    return sb.toString();
                }
            });
        }
        if (m9308((C15869) c6491.f20043)) {
            c3917.m45762(new Supplier() { // from class: l.֡ۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Right:ConstPool[");
                    C6491 c6492 = c6491;
                    sb.append(((C15869) c6492.f20043).f20943);
                    sb.append("](");
                    sb.append(c15039.f7865.toString());
                    sb.append(") = ");
                    sb.append(((C15869) c6492.f20043).f49042);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m9308(C15869 c15869) {
        C15869 c15869M9322;
        if (c15869.f49042 != null || (c15869M9322 = m9322(c15869.f20943)) == null) {
            return false;
        }
        AbstractC2465 abstractC2465 = c15869M9322.f49042;
        if (abstractC2465 != null) {
            C10808 c10808 = (C10808) this.f9586;
            c10808.getClass();
            C2526.m8035(c10808, abstractC2465);
        }
        c15869.f49042 = c15869M9322.f49042;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9320(final C17157 c17157) {
        final C15869 c15869 = (C15869) c17157.f7866;
        if (m9309(c15869)) {
            this.f9588.m45762(new Supplier() { // from class: l.᩹ۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of ConstPool[");
                    sb.append(c15869.f20943);
                    sb.append("](");
                    C17157 c17158 = c17157;
                    sb.append(c17158.f7865.toString());
                    sb.append(") = ");
                    sb.append(c17158.f7866);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9319(final C15039 c15039) {
        final C6491 c6491 = (C6491) c15039.f7866;
        boolean zM9309 = m9309((C15869) c6491.f20042);
        C3917 c3917 = this.f9588;
        if (zM9309) {
            c3917.m45762(new Supplier() { // from class: l.ۚۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of Left:ConstPool[");
                    C6491 c6492 = c6491;
                    sb.append(((C15869) c6492.f20042).f20943);
                    sb.append("](");
                    sb.append(c15039.f7865.toString());
                    sb.append(") = ");
                    sb.append(((C15869) c6492.f20042).f49042);
                    return sb.toString();
                }
            });
        }
        if (m9309((C15869) c6491.f20043)) {
            c3917.m45762(new Supplier() { // from class: l.֨ۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    StringBuilder sb = new StringBuilder("FIXED Index of Right:ConstPool[");
                    C6491 c6492 = c6491;
                    sb.append(((C15869) c6492.f20043).f20943);
                    sb.append("](");
                    sb.append(c15039.f7865.toString());
                    sb.append(") = ");
                    sb.append(((C15869) c6492.f20043).f49042);
                    return sb.toString();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m9309(C15869 c15869) {
        if (c15869.f49042 == null || c15869.mo18355()) {
            return false;
        }
        C16646 c16646M9316 = m9316(c15869);
        if (!c16646M9316.isPresent()) {
            return false;
        }
        c15869.f20943 = ((C15869) c16646M9316.get()).f20943;
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m9333() {
        ArrayList arrayList = this.f9587;
        this.f9588.m45778("fixRefsInPool: Fixing CP for %d explicit Constant Entries", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC2465 abstractC2465 = ((C15869) it.next()).f49042;
            if (abstractC2465 != null) {
                C10808 c10808 = (C10808) this.f9586;
                c10808.getClass();
                C2526.m8035(c10808, abstractC2465);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m9330() {
        ArrayList arrayList = this.f9587;
        this.f9588.m45778("fixIndexesInPool: Fixing CP for %d explicit Constant Entries.", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC2465 abstractC2465 = ((C15869) it.next()).f49042;
            if (abstractC2465 != null) {
                C1635 c1635 = (C1635) this.f9585;
                c1635.getClass();
                C2526.m8035(c1635, abstractC2465);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9324() {
        C3917 c3917 = this.f9588;
        c3917.m45778("Checking Globals", new Object[0]);
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f9587;
            if (i >= arrayList.size()) {
                return;
            }
            C15869 c15869 = (C15869) arrayList.get(i);
            if (c15869 == this.f9584) {
                c15869 = new C15869(i, this.f9590);
                arrayList.set(i, c15869);
            }
            if (!c15869.mo18355()) {
                c3917.mo11946("Constant #{0} not declared", Integer.toString(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m9334() {
        Iterator it = this.f9587.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f9588.m45778(String.format(" const #%4d: %s", Integer.valueOf(i), (C15869) it.next()), new Object[0]);
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20603 m9331() {
        return new C20603(1, Integer.valueOf(this.f9587.size() - 1));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15869 m9322(int i) {
        ArrayList arrayList = this.f9587;
        if (i >= arrayList.size()) {
            return null;
        }
        return (C15869) arrayList.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9302(final int i, final C15869 c15869, final int i2) {
        Supplier supplier = new Supplier() { // from class: l.ۘۤۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "cpool_set1: " + i + " " + c15869;
            }
        };
        C3917 c3917 = this.f9588;
        c3917.m45762(supplier);
        c3917.m45762(new Supplier() { // from class: l.᩶ۤۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C19370.m44628(i2, "param_size: ");
            }
        });
        c3917.m45762(new Supplier() { // from class: l.۫ۤۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C3046.m9301(this.f36941);
            }
        });
        c15869.f20943 = i;
        int i3 = i + i2;
        ArrayList arrayList = this.f9587;
        if (i3 >= arrayList.size()) {
            c3917.m45762(new Supplier() { // from class: l.ۤۤۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "calling ensureCapacity( " + (i + i2 + 1) + " )";
                }
            });
            int size = arrayList.size();
            int i4 = i3 - size;
            if (i4 > i2) {
                int i5 = (i3 - i2) - 1;
                c3917.mo2245("Missing Constant Pool entry(ies) {0} might be auto-filled with Utf8[null] ", size == i5 ? String.format("#%d", Integer.valueOf(size)) : String.format("#%d-#%d", Integer.valueOf(size), Integer.valueOf(i5)));
            }
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(this.f9584);
            }
        }
        arrayList.set(i, c15869);
        if (i2 == 2) {
            int i7 = i + 1;
            arrayList.set(i7, new C15869(i7, this.f9590));
        }
        c3917.m45762(new Supplier() { // from class: l.ۛۤۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "cpool_set2: " + i + " " + c15869;
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m9301(C3046 c3046) {
        return "pool_size : " + c3046.f9587.size();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m9307(final int i) {
        this.f9588.m45762(new Supplier() { // from class: l.۠ۤۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return C18307.m42645(i, "delete cell(", MotionUtils.EASING_TYPE_FORMAT_END);
            }
        });
        C15163 c15163 = new C15163(this, i);
        int i2 = 1;
        while (true) {
            ArrayList arrayList = this.f9587;
            if (i2 >= arrayList.size()) {
                arrayList.remove(i);
                C19846.forEach(arrayList, new C21515());
                return;
            } else {
                if (i2 != i) {
                    m9304(m9332(i2), c15163);
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9304(C15869 c15869, C15163 c15163) {
        if (c15869 != null) {
            c15163.n(c15869);
            AbstractC2465 abstractC2465 = c15869.f49042;
            if (abstractC2465 != null) {
                switch (C16451.f50584[abstractC2465.f7865.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        m9304((C15869) abstractC2465.f7866, c15163);
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        C6491 c6491 = (C6491) abstractC2465.f7866;
                        m9304((C15869) c6491.f20042, c15163);
                        m9304((C15869) c6491.f20043, c15163);
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15869 m9332(int i) {
        return (C15869) this.f9587.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15869 m9311(int i) {
        C15869 c15869M9322 = m9322(i);
        return c15869M9322 != null ? c15869M9322 : new C15869(i, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9317(int i, C15869 c15869) {
        AbstractC2465 abstractC2465 = c15869.f49042;
        C3917 c3917 = this.f9588;
        if (abstractC2465 == null) {
            c3917.m11950("Constant Pool Cell {0} without value", Integer.valueOf(i));
            throw null;
        }
        int iMo7941 = abstractC2465.mo7941();
        if (i == 0) {
            c3917.mo2245("Re-declaration of Constant #0 cannot be written to the class file", new Object[0]);
        } else {
            if (m9322(i) != null || (iMo7941 == 2 && m9322(i + 1) != null)) {
                c3917.mo11946("Constant Pool entry {0} has been redeclared or overlaps with entry {1}", C19370.m44628(i, "#"), "#" + Math.max(i - 1, 0));
                return;
            }
            if (c15869.mo18355() && c15869.f20943 != i) {
                c15869 = new C15869(-1, abstractC2465);
                c3917.m45778("setCell: new ConstCell " + c15869, new Object[0]);
            }
        }
        m9302(i, c15869, iMo7941);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16646 m9316(C15869 c15869) {
        final AbstractC2465 abstractC2465 = c15869.f49042;
        if (abstractC2465 == null) {
            if (m9331().m47146(Integer.valueOf(c15869.f20943))) {
                return C16646.ofNullable(m9322(c15869.f20943));
            }
            boolean zMo18355 = c15869.mo18355();
            C3917 c3917 = this.f9588;
            if (zMo18355) {
                c3917.m11950("Constant Pool Cell {0} without value", Integer.valueOf(c15869.f20943));
                throw null;
            }
            c3917.m11950("Const Cell has undefined Constant pool index and null value", new Object[0]);
            throw null;
        }
        return C5378.stream(this.f9589.values()).filter(new Predicate() { // from class: l.ܰۤۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C15869 c158610 = (C15869) obj;
                if (!c158610.mo18355()) {
                    return false;
                }
                EnumC10932 enumC10932M37607 = c158610.m37607();
                AbstractC2465 abstractC2466 = abstractC2465;
                return enumC10932M37607 == abstractC2466.f7865 && c158610.f49042.mo7940(abstractC2466);
            }
        }).findFirst();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C15869 m9306(C15869 c15869) {
        C16646 c16646M9316 = m9316(c15869);
        if (c16646M9316.isPresent()) {
            C15869 c158610 = (C15869) c16646M9316.get();
            EnumC4457 enumC4457 = c158610.f49043;
            EnumC4457 enumC4458 = c15869.f49043;
            if (enumC4457 != enumC4458 && enumC4457.f14216 > enumC4458.f14216) {
                c158610.f49043 = enumC4458;
            }
            return c158610;
        }
        int iMo7941 = c15869.f49042.mo7941();
        int i = 1;
        while (true) {
            ArrayList arrayList = this.f9587;
            if (i >= arrayList.size()) {
                break;
            }
            Object obj = arrayList.get(i);
            C15869 c158611 = this.f9584;
            if (obj == c158611 && (iMo7941 == 1 || arrayList.get(i + 1) == c158611)) {
                break;
            }
            i++;
        }
        m9302(i, c15869, iMo7941);
        return m9332(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m9328() {
        this.f9588.m45778("itemizePool", new Object[0]);
        for (final EnumC4457 enumC4457 : EnumC4457.values()) {
            Iterator it = C5378.stream(this.f9589.values()).filter(new Predicate() { // from class: l.ۙۤۚ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    C15869 c15869 = (C15869) obj;
                    if (c15869.mo18355()) {
                        return false;
                    }
                    return enumC4457.equals(c15869.f49043);
                }
            }).toList().iterator();
            while (it.hasNext()) {
                m9306((C15869) it.next());
            }
        }
        m9322(0).f20943 = 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15869 m9329(C15869 c15869) {
        this.f9588.m45778("itemizeCell", new Object[0]);
        return c15869.mo18355() ? c15869 : m9306(c15869);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15869 m9314(AbstractC2465 abstractC2465) {
        C3917 c3917 = this.f9588;
        if (abstractC2465 == null) {
            c3917.m11950("ConstCell.value can''t be null", new Object[0]);
            throw null;
        }
        LinkedHashMap linkedHashMap = this.f9589;
        C15869 c15869 = (C15869) linkedHashMap.get(abstractC2465);
        if (c15869 == null) {
            C15869 c158610 = new C15869(-1, abstractC2465);
            linkedHashMap.put(abstractC2465, c158610);
            c3917.m45778("ConstantPoolHashByValue.put ('%s','%s')", abstractC2465, c158610);
            return c158610;
        }
        AbstractC2465 abstractC2466 = c15869.f49042;
        if (!abstractC2466.equals(abstractC2465)) {
            c3917.m11950("Seeking value {0} is not equal to found {1}", abstractC2465.toString(), abstractC2466.toString());
            throw null;
        }
        c3917.m45778(String.format("ConstantPoolHashByValue.got ('%s') for '%s'", c15869, abstractC2465), new Object[0]);
        return c15869;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15869 m9323(Integer num) {
        return m9314(new C8691(EnumC10932.f32913, num));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15869 m9312(String str) {
        return m9314(new C22096(str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15869 m9313(final Function function) {
        return (C15869) C5378.stream(this.f9589.entrySet()).filter(new Predicate() { // from class: l.۟ۤۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                if (((AbstractC2465) entry.getKey()).f7865 == EnumC10932.f32926) {
                    return ((Boolean) function.apply((String) ((AbstractC2465) entry.getKey()).f7866)).booleanValue();
                }
                return false;
            }
        }).findFirst().map(new C22621(2)).orElse(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15869 m9315(EnumC10932 enumC10932, C1426 c1426) {
        boolean zM4930 = c1426.m4930();
        C3917 c3917 = this.f9588;
        if (zM4930) {
            c3917.m11950("{0} emptyInfo", "ConstantPool::FindCell");
            throw null;
        }
        if (c1426.m4929() <= 0) {
            return m9314((AbstractC2465) new C17157(enumC10932, m9312((String) c1426.f20043)));
        }
        C15869 c15869M9322 = m9322(c1426.m4929());
        if (c15869M9322 != null && c15869M9322.f49042.f7865 == enumC10932) {
            return c15869M9322;
        }
        c3917.m11950("Constant Pool index {0} is not found", Integer.valueOf(c1426.m4929()));
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9318(InterfaceC0408 interfaceC0408) throws IOException {
        ArrayList arrayList = this.f9587;
        int size = arrayList.size();
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(size);
        C7583 c7583 = new C7583(size, 1);
        C3917 c3917 = this.f9588;
        c3917.m45762(c7583);
        int iMo7941 = 1;
        while (iMo7941 < size) {
            C15869 c15869 = (C15869) arrayList.get(iMo7941);
            AbstractC2465 abstractC2465 = c15869.f49042;
            if (c15869.f20943 != iMo7941) {
                c3917.m11950("Cell[{0}] has #{1}", Integer.toString(iMo7941), Integer.valueOf(c15869.f20943));
                throw null;
            }
            abstractC2465.mo7939((InterfaceC0408) c6053);
            iMo7941 += abstractC2465.mo7941();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m9310(final EnumC10932... enumC10932Arr) {
        return (ArrayList) C5378.stream(this.f9587).filter(new Predicate() { // from class: l.۬ۤۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C15869) obj).m37607().m27255(enumC10932Arr);
            }
        }).collect(C22976.toCollection(new C22925()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m9321(final EnumC10932... enumC10932Arr) {
        return (ArrayList) C5378.stream(this.f9587).filter(new Predicate() { // from class: l.ۨۤۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C15869 c15869 = (C15869) obj;
                return c15869.f49042 != null && c15869.m37607().m27255(enumC10932Arr);
            }
        }).collect(C22976.toCollection(new C22925()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9326(C15869 c15869) {
        if (c15869 != null) {
            int i = 0;
            if (c15869.m37607() == EnumC10932.f32947) {
                AbstractC2465 abstractC2465 = c15869.f49042;
                if (abstractC2465 != null) {
                    C15869 c158610 = (C15869) ((C14334) abstractC2465).f7866;
                    Object obj = ((C22096) c158610.f49042).f7866;
                    if (obj != null) {
                        String str = (String) obj;
                        if (str.startsWith("java/") || str.startsWith("javax/")) {
                            return;
                        }
                    }
                    i = c158610.f20943;
                }
                int i2 = c15869.f20943;
                m9307(i2);
                if (i2 <= i) {
                    i--;
                }
                m9307(i);
                return;
            }
            this.f9588.mo2245("Cannot delete Constant Pool entry \"{0}\" because only class cells are accepted", c15869);
        }
    }
}
