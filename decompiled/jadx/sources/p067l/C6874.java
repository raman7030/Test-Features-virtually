package p067l;

/* JADX INFO: renamed from: l.ۙܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V627 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6874 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9556 f17874;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16931 f17875;

    /* JADX INFO: renamed from: ܽ */
    public final C5533 f17876;

    public C6874(C5533 c5533, InterfaceC16931 interfaceC16931, AbstractC9556 abstractC9556) {
        C13045.m29867(c5533, "store");
        C13045.m29867(interfaceC16931, "factory");
        C13045.m29867(abstractC9556, "defaultCreationExtras");
        this.f17876 = c5533;
        this.f17875 = interfaceC16931;
        this.f17874 = abstractC9556;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6874(C5533 c5533, InterfaceC16931 interfaceC16931) {
        this(c5533, interfaceC16931, C24308.f76980);
        C13045.m29867(c5533, "store");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6874(InterfaceC14920 interfaceC14920) {
        InterfaceC16931 defaultViewModelProviderFactory;
        AbstractC9556 defaultViewModelCreationExtras;
        C13045.m29867(interfaceC14920, "owner");
        C5533 viewModelStore = interfaceC14920.getViewModelStore();
        InterfaceC15590 interfaceC15590 = C10227.f28340;
        boolean z = interfaceC14920 instanceof InterfaceC6699;
        if (!z) {
            if (C23638.f75253 == null) {
                C23638.f75253 = new C23638();
            }
            defaultViewModelProviderFactory = C23638.f75253;
            C13045.m29861(defaultViewModelProviderFactory);
        } else {
            defaultViewModelProviderFactory = ((InterfaceC6699) interfaceC14920).getDefaultViewModelProviderFactory();
        }
        if (z) {
            defaultViewModelCreationExtras = ((InterfaceC6699) interfaceC14920).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = C24308.f76980;
        }
        this(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7545 m15765(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return m15766(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final AbstractC7545 m15766(Class cls, String str) {
        AbstractC7545 abstractC7545Mo7441;
        C13045.m29867(str, "key");
        C5533 c5533 = this.f17876;
        AbstractC7545 abstractC7545M12224 = c5533.m12224(str);
        boolean zIsInstance = cls.isInstance(abstractC7545M12224);
        InterfaceC16931 interfaceC16931 = this.f17875;
        if (zIsInstance) {
            C21627 c21627 = interfaceC16931 instanceof C21627 ? (C21627) interfaceC16931 : null;
            if (c21627 != null) {
                C13045.m29861(abstractC7545M12224);
                c21627.mo10301(abstractC7545M12224);
            }
            C13045.m29862((Object) abstractC7545M12224, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return abstractC7545M12224;
        }
        C17901 c17901 = new C17901(this.f17874);
        int i = C23638.f75252;
        c17901.m22254().put(C22968.f72232, str);
        try {
            abstractC7545Mo7441 = interfaceC16931.mo7442(cls, c17901);
        } catch (AbstractMethodError unused) {
            abstractC7545Mo7441 = interfaceC16931.mo7441(cls);
        }
        c5533.m12226(str, abstractC7545Mo7441);
        return abstractC7545Mo7441;
    }
}
