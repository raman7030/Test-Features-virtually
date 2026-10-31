package l;

/* JADX INFO: renamed from: l.ۙܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V627 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4741 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7563 f15043;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15323 f15044;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3330 f15045;

    public C4741(C3330 c3330, InterfaceC15323 interfaceC15323, AbstractC7563 abstractC7563) {
        C11233.m27805(c3330, "store");
        C11233.m27805(interfaceC15323, "factory");
        C11233.m27805(abstractC7563, "defaultCreationExtras");
        this.f15045 = c3330;
        this.f15044 = interfaceC15323;
        this.f15043 = abstractC7563;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4741(C3330 c3330, InterfaceC15323 interfaceC15323) {
        this(c3330, interfaceC15323, C23085.f74234);
        C11233.m27805(c3330, "store");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4741(InterfaceC13207 interfaceC13207) {
        InterfaceC15323 defaultViewModelProviderFactory;
        AbstractC7563 defaultViewModelCreationExtras;
        C11233.m27805(interfaceC13207, "owner");
        C3330 viewModelStore = interfaceC13207.getViewModelStore();
        InterfaceC13912 interfaceC13912 = C8269.f25430;
        boolean z = interfaceC13207 instanceof InterfaceC4557;
        if (!z) {
            if (C22380.f72527 == null) {
                C22380.f72527 = new C22380();
            }
            defaultViewModelProviderFactory = C22380.f72527;
            C11233.m27799(defaultViewModelProviderFactory);
        } else {
            defaultViewModelProviderFactory = ((InterfaceC4557) interfaceC13207).getDefaultViewModelProviderFactory();
        }
        if (z) {
            defaultViewModelCreationExtras = ((InterfaceC4557) interfaceC13207).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = C23085.f74234;
        }
        this(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5447 m13885(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return m13886(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5447 m13886(Class cls, String str) {
        AbstractC5447 abstractC5447Mo5213;
        C11233.m27805(str, "key");
        C3330 c3330 = this.f15045;
        AbstractC5447 abstractC5447M10188 = c3330.m10188(str);
        boolean zIsInstance = cls.isInstance(abstractC5447M10188);
        InterfaceC15323 interfaceC15323 = this.f15044;
        if (zIsInstance) {
            C20264 c20264 = interfaceC15323 instanceof C20264 ? (C20264) interfaceC15323 : null;
            if (c20264 != null) {
                C11233.m27799(abstractC5447M10188);
                c20264.mo8257(abstractC5447M10188);
            }
            C11233.m27800((Object) abstractC5447M10188, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return abstractC5447M10188;
        }
        C16344 c16344 = new C16344(this.f15043);
        int i = C22380.f72526;
        c16344.m20277().put(C21675.f69527, str);
        try {
            abstractC5447Mo5213 = interfaceC15323.mo5214(cls, c16344);
        } catch (AbstractMethodError unused) {
            abstractC5447Mo5213 = interfaceC15323.mo5213(cls);
        }
        c3330.m10190(str, abstractC5447Mo5213);
        return abstractC5447Mo5213;
    }
}
