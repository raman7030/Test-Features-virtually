package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18728 {

    /* JADX INFO: renamed from: ܿ */
    public static final C6468 f55995 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final C15099 f55996;

    /* JADX INFO: renamed from: ۧ */
    public final C11216 f55997;

    /* JADX INFO: renamed from: ܽ */
    public final C23623 f55998;

    /* JADX INFO: renamed from: ᩳ */
    public final C8200 f55999;

    /* JADX INFO: renamed from: ֫ */
    public static C18728 m42754(C5127 c5127) {
        C18728 c18728 = (C18728) c5127.m10905(f55995);
        return c18728 == null ? new C18728(c5127) : c18728;
    }

    public C18728(C5127 c5127) {
        c5127.m10908(f55995, this);
        this.f55999 = C8200.m18988(c5127);
        this.f55998 = C23623.m52439(c5127);
        C22004.m49577(c5127);
        this.f55996 = C15099.m34493(c5127);
        this.f55997 = C11216.m25910(c5127);
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
    /* JADX INFO: renamed from: ֫ */
    public final void m42757(final C4036 c4036, final C7650 c7650) {
        this.f55996.m34511((RunnableC15178) new Runnable() { // from class: l.ܰ֨֨
            @Override // java.lang.Runnable
            public final void run() {
                C7650 c7651 = c7650;
                C18728 c18728 = this.f43330;
                C23623 c23623 = c18728.f55998;
                InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c4036.f8851.f7516);
                try {
                    new C19399(c18728, true).mo12739(c7651);
                } finally {
                    c23623.m9363(interfaceC19740M9363);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42759(final C4036 c4036, final C7650 c7650) {
        this.f55996.m34513(new Runnable() { // from class: l.᩺֨֨
            @Override // java.lang.Runnable
            public final void run() {
                C7650 c7651 = c7650;
                C18728 c18728 = this.f75887;
                C23623 c23623 = c18728.f55998;
                InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c4036.f8851.f7516);
                try {
                    c18728.f55997.m25954((AbstractC7257) c7651, true);
                } finally {
                    c23623.m9363(interfaceC19740M9363);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42758(C7650 c7650) {
        new C19399(this, false).mo12739(c7650);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m42756(AbstractC21195 abstractC21195) {
        C17939 c17939Mo38742 = abstractC21195.mo35948().mo38742();
        if (c17939Mo38742 == null) {
            return null;
        }
        AbstractC10564 abstractC10564M40797 = c17939Mo38742.m40797(this.f55999.f21718);
        if (!(abstractC10564M40797 instanceof C3858)) {
            return null;
        }
        C4848 c4848M10282 = C4848.m10282((Object[]) ((C3858) abstractC10564M40797).f8345);
        if (C7480.stream(c4848M10282).anyMatch(new C23087(1))) {
            return null;
        }
        return c4848M10282;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC3976 m42755(C17939 c17939, final AbstractC7783 abstractC7783) {
        if (!c17939.f29256.f16705.mo35946()) {
            return EnumC3976.NONE;
        }
        C4848 c4848M42756 = m42756(c17939.f29256.f16705);
        if (c4848M42756 == null) {
            return EnumC3976.DECLARATION;
        }
        return (EnumC3976) C7480.stream(c4848M42756).map(new Function() { // from class: l.ۛ֨֨
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                EnumC3600 enumC3600;
                C18728 c18728 = this.f20487;
                c18728.getClass();
                C13818 c13818 = ((C18610) ((AbstractC10564) obj)).f55580;
                AbstractC12224 abstractC12224 = c13818.f20408;
                C8200 c8200 = c18728.f55999;
                AbstractC12224 abstractC12225 = c8200.f21639;
                AbstractC7783 abstractC7784 = abstractC7783;
                if (abstractC12224 == abstractC12225) {
                    if (abstractC7784.f20405 == EnumC3600.f7354) {
                        return EnumC3976.DECLARATION;
                    }
                } else if (abstractC12224 == c8200.f21666 || abstractC12224 == c8200.f21647) {
                    if (abstractC7784.f20405 == EnumC3600.f7339 && abstractC7784.f20407.f20405 != EnumC3600.f7343) {
                        return EnumC3976.DECLARATION;
                    }
                } else if (abstractC12224 == c8200.f21743) {
                    if (abstractC7784.f20405 == EnumC3600.f7343 && !abstractC7784.m17994()) {
                        return EnumC3976.DECLARATION;
                    }
                } else if (abstractC12224 == c8200.f21708) {
                    if (abstractC7784.f20405 == EnumC3600.f7339 && abstractC7784.f20407.f20405 == EnumC3600.f7343 && (abstractC7784.mo18003() & 8589934592L) != 0) {
                        return EnumC3976.DECLARATION;
                    }
                } else if (abstractC12224 == c8200.f21747) {
                    if (abstractC7784.f20405 == EnumC3600.f7343 && abstractC7784.m17994()) {
                        return EnumC3976.DECLARATION;
                    }
                } else if (abstractC12224 == c8200.f21680) {
                    if (abstractC7784.f20405 == EnumC3600.f7339 && abstractC7784.f20407.f20405 == EnumC3600.f7343 && (abstractC7784.mo18003() & 8589934592L) == 0) {
                        return EnumC3976.DECLARATION;
                    }
                } else if (abstractC12224 == c8200.f21646) {
                    if (abstractC7784.f20405 == EnumC3600.f7354 && (abstractC7784.mo18003() & 8192) != 0) {
                        return EnumC3976.DECLARATION;
                    }
                } else if (abstractC12224 == c8200.f21759) {
                    if (abstractC7784.f20405 == EnumC3600.f7351) {
                        return EnumC3976.DECLARATION;
                    }
                } else if (abstractC12224 == c8200.f21643) {
                    EnumC3600 enumC3601 = abstractC7784.f20405;
                    if (enumC3601 == EnumC3600.f7354 || enumC3601 == EnumC3600.f7339 || ((enumC3601 == (enumC3600 = EnumC3600.f7343) && !abstractC7784.m17994() && !abstractC7784.f20406.mo14787().m14777(EnumC11353.VOID)) || (abstractC7784.f20405 == enumC3600 && abstractC7784.m17994()))) {
                        return EnumC3976.TYPE;
                    }
                } else if (abstractC12224 != c8200.f21667) {
                    if (abstractC12224 != c8200.f21662) {
                        C1446.m31702("annotationTargetType(): unrecognized Attribute name " + ((Object) c13818.f20408) + " (" + c13818.f20408.getClass() + MotionUtils.EASING_TYPE_FORMAT_END);
                        throw null;
                    }
                    if (abstractC7784.f20405 == EnumC3600.f7340) {
                        return EnumC3976.DECLARATION;
                    }
                }
                return EnumC3976.NONE;
            }
        }).reduce(EnumC3976.NONE, new BinaryOperator() { // from class: l.ۨ֨֨
            public /* synthetic */ BiFunction andThen(Function function) {
                return C18684.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                EnumC3976 enumC3976 = (EnumC3976) obj;
                EnumC3976 enumC3977 = (EnumC3976) obj2;
                this.f37002.getClass();
                EnumC3976 enumC3978 = EnumC3976.NONE;
                if (enumC3976 == enumC3978) {
                    return enumC3977;
                }
                return (enumC3977 == enumC3978 || enumC3976 == enumC3977) ? enumC3976 : EnumC3976.BOTH;
            }
        });
    }
}
