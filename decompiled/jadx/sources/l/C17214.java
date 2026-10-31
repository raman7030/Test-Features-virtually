package l;

import com.google.android.material.motion.MotionUtils;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17214 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C4314 f52813 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13395 f52814;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9310 f52815;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22364 f52816;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6136 f52817;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17214 m40507(C2903 c2903) {
        C17214 c17214 = (C17214) c2903.m8838(f52813);
        return c17214 == null ? new C17214(c2903) : c17214;
    }

    public C17214(C2903 c2903) {
        c2903.m8841(f52813, this);
        this.f52817 = C6136.m17057(c2903);
        this.f52816 = C22364.m50099(c2903);
        C20661.m47250(c2903);
        this.f52814 = C13395.m32391(c2903);
        this.f52815 = C9310.m23901(c2903);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ܰ֨֨] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40510(final C1755 c1755, final C5557 c5557) {
        this.f52814.m32409((RunnableC13479) new Runnable() { // from class: l.ܰ֨֨
            @Override // java.lang.Runnable
            public final void run() {
                C5557 c5558 = c5557;
                C17214 c17214 = this.f40260;
                C22364 c22364 = c17214.f52816;
                InterfaceC18278 interfaceC18278M7284 = c22364.m7284(c1755.f6075.f4745);
                try {
                    new C17920(c17214, true).mo10758(c5558);
                } finally {
                    c22364.m7284(interfaceC18278M7284);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40512(final C1755 c1755, final C5557 c5557) {
        this.f52814.m32411(new Runnable() { // from class: l.᩺֨֨
            @Override // java.lang.Runnable
            public final void run() {
                C5557 c5558 = c5557;
                C17214 c17214 = this.f73161;
                C22364 c22364 = c17214.f52816;
                InterfaceC18278 interfaceC18278M7284 = c22364.m7284(c1755.f6075.f4745);
                try {
                    c17214.f52815.m23945((AbstractC5144) c5558, true);
                } finally {
                    c22364.m7284(interfaceC18278M7284);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40511(C5557 c5557) {
        new C17920(this, false).mo10758(c5557);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m40509(AbstractC19810 abstractC19810) {
        C16384 c16384Mo36583 = abstractC19810.mo33816().mo36583();
        if (c16384Mo36583 == null) {
            return null;
        }
        AbstractC8624 abstractC8624M38580 = c16384Mo36583.m38580(this.f52817.f18860);
        if (!(abstractC8624M38580 instanceof C1568)) {
            return null;
        }
        C2609 c2609M8238 = C2609.m8238((Object[]) ((C1568) abstractC8624M38580).f5564);
        if (C5378.stream(c2609M8238).anyMatch(new C21800(1))) {
            return null;
        }
        return c2609M8238;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC1692 m40508(C16384 c16384, final AbstractC5698 abstractC5698) {
        if (!c16384.f26338.f13890.mo33814()) {
            return EnumC1692.NONE;
        }
        C2609 c2609M40509 = m40509(c16384.f26338.f13890);
        if (c2609M40509 == null) {
            return EnumC1692.DECLARATION;
        }
        return (EnumC1692) C5378.stream(c2609M40509).map(new Function() { // from class: l.ۛ֨֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                EnumC1296 enumC1296;
                C17214 c17214 = this.f17642;
                c17214.getClass();
                C12048 c12048 = ((C17090) ((AbstractC8624) obj)).f52397;
                AbstractC10370 abstractC10370 = c12048.f17562;
                C6136 c6136 = c17214.f52817;
                AbstractC10370 abstractC10371 = c6136.f18781;
                AbstractC5698 abstractC5699 = abstractC5698;
                if (abstractC10370 == abstractC10371) {
                    if (abstractC5699.f17559 == EnumC1296.f4582) {
                        return EnumC1692.DECLARATION;
                    }
                } else if (abstractC10370 == c6136.f18808 || abstractC10370 == c6136.f18789) {
                    if (abstractC5699.f17559 == EnumC1296.f4567 && abstractC5699.f17561.f17559 != EnumC1296.f4571) {
                        return EnumC1692.DECLARATION;
                    }
                } else if (abstractC10370 == c6136.f18885) {
                    if (abstractC5699.f17559 == EnumC1296.f4571 && !abstractC5699.m16075()) {
                        return EnumC1692.DECLARATION;
                    }
                } else if (abstractC10370 == c6136.f18850) {
                    if (abstractC5699.f17559 == EnumC1296.f4567 && abstractC5699.f17561.f17559 == EnumC1296.f4571 && (abstractC5699.mo16084() & 8589934592L) != 0) {
                        return EnumC1692.DECLARATION;
                    }
                } else if (abstractC10370 == c6136.f18889) {
                    if (abstractC5699.f17559 == EnumC1296.f4571 && abstractC5699.m16075()) {
                        return EnumC1692.DECLARATION;
                    }
                } else if (abstractC10370 == c6136.f18822) {
                    if (abstractC5699.f17559 == EnumC1296.f4567 && abstractC5699.f17561.f17559 == EnumC1296.f4571 && (abstractC5699.mo16084() & 8589934592L) == 0) {
                        return EnumC1692.DECLARATION;
                    }
                } else if (abstractC10370 == c6136.f18788) {
                    if (abstractC5699.f17559 == EnumC1296.f4582 && (abstractC5699.mo16084() & 8192) != 0) {
                        return EnumC1692.DECLARATION;
                    }
                } else if (abstractC10370 == c6136.f18901) {
                    if (abstractC5699.f17559 == EnumC1296.f4579) {
                        return EnumC1692.DECLARATION;
                    }
                } else if (abstractC10370 == c6136.f18785) {
                    EnumC1296 enumC1297 = abstractC5699.f17559;
                    if (enumC1297 == EnumC1296.f4582 || enumC1297 == EnumC1296.f4567 || ((enumC1297 == (enumC1296 = EnumC1296.f4571) && !abstractC5699.m16075() && !abstractC5699.f17560.mo12923().m12913(EnumC9454.VOID)) || (abstractC5699.f17559 == enumC1296 && abstractC5699.m16075()))) {
                        return EnumC1692.TYPE;
                    }
                } else if (abstractC10370 != c6136.f18809) {
                    if (abstractC10370 != c6136.f18804) {
                        C12171.m29640("annotationTargetType(): unrecognized Attribute name " + ((Object) c12048.f17562) + " (" + c12048.f17562.getClass() + MotionUtils.EASING_TYPE_FORMAT_END);
                        throw null;
                    }
                    if (abstractC5699.f17559 == EnumC1296.f4568) {
                        return EnumC1692.DECLARATION;
                    }
                }
                return EnumC1692.NONE;
            }
        }).reduce(EnumC1692.NONE, new BinaryOperator() { // from class: l.ۨ֨֨
            public /* synthetic */ BiFunction andThen(Function function) {
                return C17167.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                EnumC1692 enumC1692 = (EnumC1692) obj;
                EnumC1692 enumC1693 = (EnumC1692) obj2;
                this.f34005.getClass();
                EnumC1692 enumC1694 = EnumC1692.NONE;
                if (enumC1692 == enumC1694) {
                    return enumC1693;
                }
                return (enumC1693 == enumC1694 || enumC1692 == enumC1693) ? enumC1692 : EnumC1692.BOTH;
            }
        });
    }
}
