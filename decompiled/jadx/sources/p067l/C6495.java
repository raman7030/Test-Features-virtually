package p067l;

import android.text.Editable;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۙ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76QP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6495 extends C12412 implements InterfaceC9768 {

    /* JADX INFO: renamed from: ۜ֫ */
    public volatile boolean f16787;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C24913 f16788;

    /* JADX INFO: renamed from: ۢ֫ */
    public volatile long f16789;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f16790;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f16791;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C4068 f16792;

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo3991(InterfaceC9749 interfaceC9749) {
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩸֫ */
    public final /* synthetic */ boolean mo4005() {
        return false;
    }

    @Override // p067l.C12412, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m14912(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // p067l.C12412, android.text.Editable
    public final /* bridge */ /* synthetic */ C12412 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m14912(i, i2, charSequence, i3, i4);
        return this;
    }

    public C6495(C24913 c24913) {
        this(c24913, (Long) null);
    }

    public C6495(C24913 c24913, long j) {
        this(c24913, Long.valueOf(j));
    }

    public C6495(C24913 c24913, Long l2) {
        super(c24913);
        this.f16792 = new C4068(new InterfaceC9177() { // from class: l.᩸֫ܿ
            @Override // p067l.InterfaceC9177
            /* JADX INFO: renamed from: ֫ */
            public final void mo13408(int i, int i2, CharSequence charSequence, int i3, int i4) {
                super/*l.ۤ᩸ᩳ*/.replace(i, i2, charSequence, i3, i4);
            }
        });
        this.f16788 = c24913;
        synchronized (c24913) {
            byte[] bArrM54751 = c24913.m54751();
            if (l2 == null && bArrM54751.length == 0) {
                l2 = Long.valueOf(c24913.m54732());
            }
            C9847 c9847M23108 = C9847.m23108(bArrM54751, l2);
            c9847M23108.m23112(c24913.m54755());
            c24913.m54758(c9847M23108.m23113(c9847M23108.f27323));
            this.f16789 = c9847M23108.f27323;
        }
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public final void mo3992(C11996 c11996) {
        throw new IllegalStateException("Session recovery protocol required");
    }

    @Override // p067l.C12412, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ۬ */
    public final int mo14913() {
        throw new IllegalStateException("Session recovery protocol required");
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ܳۧ */
    public final C24913 mo3999() {
        return this.f16788;
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩹֫ */
    public final void mo4006() {
        mo14910(true);
    }

    @Override // p067l.InterfaceC9768
    public final void setReadOnly(boolean z) {
        this.f16792.m8146(z);
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩵֫ */
    public final boolean mo4003() {
        return this.f16792.m8148() || m28597();
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public final void mo3990(int i) {
        this.f16790 = i;
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֡ۧ */
    public final int mo3989() {
        return this.f16790;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m14911() {
        return this.f16792.m8147();
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4001(long j) {
        synchronized (this.f16788) {
            if (m28585()) {
                return;
            }
            this.f16788.m54758(C9847.m23108(this.f16788.m54751(), Long.valueOf(j)).m23113(j));
            this.f16789 = j;
        }
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩶ */
    public final long mo4004() {
        return this.f16789;
    }

    @Override // p067l.InterfaceC9768
    public final boolean isChanged() {
        if (m28585()) {
            return this.f16791;
        }
        try {
            return this.f16789 != this.f16788.m54732();
        } catch (C4385 e) {
            if (!m28585()) {
                throw e;
            }
            return this.f16791;
        }
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ۧ */
    public final void mo3998(boolean z) {
        synchronized (this.f16788) {
            if (m28585()) {
                return;
            }
            if (this.f16787) {
                throw new IllegalStateException("Editable is closed");
            }
            long jM54732 = z ? -1L : this.f16788.m54732();
            C9847 c9847M23108 = C9847.m23108(this.f16788.m54751(), (Long) null);
            c9847M23108.m23112(this.f16788.m54755());
            this.f16788.m54758(c9847M23108.m23113(jM54732));
            this.f16789 = jM54732;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14912(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f16790 == 0) {
            C4068 c4068 = this.f16792;
            c4068.getClass();
            c4068.m8143(null, new C15211(c4068, i, i2, charSequence, i3, i4));
        }
    }

    @Override // p067l.C12412, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ۤ֫ */
    public final EnumC18207 mo3997() {
        if (this.f16790 != 0) {
            return EnumC18207.UNAVAILABLE;
        }
        C19568 c19568 = new C19568(1, this);
        return (EnumC18207) this.f16792.m8143(EnumC18207.UNAVAILABLE, c19568);
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3994(final Runnable runnable) {
        if (this.f16790 != 0) {
            return false;
        }
        return ((Boolean) this.f16792.m8143(Boolean.FALSE, new Supplier() { // from class: l.᩹֫ܿ
            @Override // java.util.function.Supplier
            public final Object get() {
                this.f73095.m28593(runnable);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    @Override // p067l.C12412, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ۗ֫ */
    public final EnumC18207 mo3995() {
        if (this.f16790 != 0) {
            return EnumC18207.UNAVAILABLE;
        }
        Supplier supplier = new Supplier() { // from class: l.ܶ֫ܿ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۤ᩸ᩳ*/.mo3995();
            }
        };
        return (EnumC18207) this.f16792.m8143(EnumC18207.UNAVAILABLE, supplier);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩶֫ܿ] */
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
    @Override // p067l.C12412
    /* JADX INFO: renamed from: ֫ */
    public final C7245 mo14909(final C19946 c19946) {
        C7245 c7245 = (C7245) this.f16792.m8144((C21248) new Supplier() { // from class: l.᩶֫ܿ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۤ᩸ᩳ*/.mo14909(c19946);
            }
        });
        if (c7245 != null) {
            return c7245;
        }
        throw new IllegalStateException("Text load publication is waiting for internal readers");
    }

    @Override // p067l.C12412, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public final void mo14910(boolean z) {
        if (m28597()) {
            C7050.m16212(new RunnableC8368(2, this));
        } else {
            close();
        }
    }

    @Override // p067l.C12412, java.lang.AutoCloseable
    public final void close() {
        if (this.f16787) {
            return;
        }
        this.f16791 = isChanged();
        super.close();
        this.f16787 = true;
        this.f16792.m8149();
    }

    @Override // p067l.InterfaceC9768
    /* JADX INFO: renamed from: ܺۧ */
    public final void mo4000() {
        this.f16788.m54761();
    }
}
