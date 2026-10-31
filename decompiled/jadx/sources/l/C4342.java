package l;

import android.text.Editable;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۙ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76QP */
/* JADX INFO: loaded from: classes3.dex */
public final class C4342 extends C10567 implements InterfaceC7785 {

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f13973;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C23721 f13974;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public volatile long f13975;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f13976;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f13977;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C1788 f13978;

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo1593(InterfaceC7765 interfaceC7765) {
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ᩸֫ */
    public final /* synthetic */ boolean mo1607() {
        return false;
    }

    @Override // l.C10567, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m13048(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // l.C10567, android.text.Editable
    public final /* bridge */ /* synthetic */ C10567 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m13048(i, i2, charSequence, i3, i4);
        return this;
    }

    public C4342(C23721 c23721) {
        this(c23721, (Long) null);
    }

    public C4342(C23721 c23721, long j) {
        this(c23721, Long.valueOf(j));
    }

    public C4342(C23721 c23721, Long l2) {
        super(c23721);
        this.f13978 = new C1788(new InterfaceC7164() { // from class: l.᩸֫ܿ
            @Override // l.InterfaceC7164
            /* JADX INFO: renamed from: ֫ */
            public final void mo11472(int i, int i2, CharSequence charSequence, int i3, int i4) {
                super/*l.ۤ᩸ᩳ*/.replace(i, i2, charSequence, i3, i4);
            }
        });
        this.f13974 = c23721;
        synchronized (c23721) {
            byte[] bArrM52348 = c23721.m52348();
            if (l2 == null && bArrM52348.length == 0) {
                l2 = Long.valueOf(c23721.m52329());
            }
            C7869 c7869M21143 = C7869.m21143(bArrM52348, l2);
            c7869M21143.m21147(c23721.m52352());
            c23721.m52355(c7869M21143.m21148(c7869M21143.f24407));
            this.f13975 = c7869M21143.f24407;
        }
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ֫ */
    public final void mo1594(C10130 c10130) {
        throw new IllegalStateException("Session recovery protocol required");
    }

    @Override // l.C10567, l.InterfaceC7785
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int mo13049() {
        throw new IllegalStateException("Session recovery protocol required");
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ܳۧ */
    public final C23721 mo1601() {
        return this.f13974;
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ᩹֫ */
    public final void mo1608() {
        mo13046(true);
    }

    @Override // l.InterfaceC7785
    public final void setReadOnly(boolean z) {
        this.f13978.m5951(z);
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ᩵֫ */
    public final boolean mo1605() {
        return this.f13978.m5953() || m26564();
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ֫ */
    public final void mo1592(int i) {
        this.f13976 = i;
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ֡ۧ */
    public final int mo1591() {
        return this.f13976;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m13047() {
        return this.f13978.m5952();
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1603(long j) {
        synchronized (this.f13974) {
            if (m26552()) {
                return;
            }
            this.f13974.m52355(C7869.m21143(this.f13974.m52348(), Long.valueOf(j)).m21148(j));
            this.f13975 = j;
        }
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ᩶ */
    public final long mo1606() {
        return this.f13975;
    }

    @Override // l.InterfaceC7785
    public final boolean isChanged() {
        if (m26552()) {
            return this.f13977;
        }
        try {
            return this.f13975 != this.f13974.m52329();
        } catch (C2121 e) {
            if (!m26552()) {
                throw e;
            }
            return this.f13977;
        }
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ۧ */
    public final void mo1600(boolean z) {
        synchronized (this.f13974) {
            if (m26552()) {
                return;
            }
            if (this.f13973) {
                throw new IllegalStateException("Editable is closed");
            }
            long jM52329 = z ? -1L : this.f13974.m52329();
            C7869 c7869M21143 = C7869.m21143(this.f13974.m52348(), (Long) null);
            c7869M21143.m21147(this.f13974.m52352());
            this.f13974.m52355(c7869M21143.m21148(jM52329));
            this.f13975 = jM52329;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13048(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.f13976 == 0) {
            C1788 c1788 = this.f13978;
            c1788.getClass();
            c1788.m5948(null, new C13513(c1788, i, i2, charSequence, i3, i4));
        }
    }

    @Override // l.C10567, l.InterfaceC7785
    /* JADX INFO: renamed from: ۤ֫ */
    public final EnumC16665 mo1599() {
        if (this.f13976 != 0) {
            return EnumC16665.UNAVAILABLE;
        }
        C18097 c18097 = new C18097(1, this);
        return (EnumC16665) this.f13978.m5948(EnumC16665.UNAVAILABLE, c18097);
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1596(final Runnable runnable) {
        if (this.f13976 != 0) {
            return false;
        }
        return ((Boolean) this.f13978.m5948(Boolean.FALSE, new Supplier() { // from class: l.᩹֫ܿ
            @Override // java.util.function.Supplier
            public final Object get() {
                this.f70384.m26560(runnable);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    @Override // l.C10567, l.InterfaceC7785
    /* JADX INFO: renamed from: ۗ֫ */
    public final EnumC16665 mo1597() {
        if (this.f13976 != 0) {
            return EnumC16665.UNAVAILABLE;
        }
        Supplier supplier = new Supplier() { // from class: l.ܶ֫ܿ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۤ᩸ᩳ*/.mo1597();
            }
        };
        return (EnumC16665) this.f13978.m5948(EnumC16665.UNAVAILABLE, supplier);
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
    @Override // l.C10567
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5131 mo13045(final C18495 c18495) {
        C5131 c5131 = (C5131) this.f13978.m5949((C19865) new Supplier() { // from class: l.᩶֫ܿ
            @Override // java.util.function.Supplier
            public final Object get() {
                return super/*l.ۤ᩸ᩳ*/.mo13045(c18495);
            }
        });
        if (c5131 != null) {
            return c5131;
        }
        throw new IllegalStateException("Text load publication is waiting for internal readers");
    }

    @Override // l.C10567, l.InterfaceC7785
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13046(boolean z) {
        if (m26564()) {
            C4925.m14315(new RunnableC6312(2, this));
        } else {
            close();
        }
    }

    @Override // l.C10567, java.lang.AutoCloseable
    public final void close() {
        if (this.f13973) {
            return;
        }
        this.f13977 = isChanged();
        super.close();
        this.f13973 = true;
        this.f13978.m5954();
    }

    @Override // l.InterfaceC7785
    /* JADX INFO: renamed from: ܺۧ */
    public final void mo1602() {
        this.f13974.m52358();
    }
}
