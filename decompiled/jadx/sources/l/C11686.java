package l;

import android.content.ClipboardManager;
import android.content.Context;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C11686 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34829;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C16765 f34830;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f34831;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14567 f34832;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6807 f34833;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9711 f34834;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18368 f34835;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Context f34836;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f34837;

    public C11686(C18368 c18368, AbstractActivityC3346 abstractActivityC3346, C14567 c14567, C6807 c6807, int i, Context context) {
        this.f34835 = c18368;
        this.f34831 = abstractActivityC3346;
        this.f34832 = c14567;
        this.f34833 = c6807;
        this.f34829 = i;
        this.f34836 = context;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f34830 = this.f34835.f57063.m42397();
        AbstractActivityC3346 abstractActivityC3346 = this.f34831;
        if (abstractActivityC3346 != null) {
            m20269(abstractActivityC3346, R.string.MT_Protector, 200, new Runnable() { // from class: l.ۛۨܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C11686.m28575(this.f18530);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m28575(C11686 c11686) {
        c11686.f23322.m31860((Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean m28574() {
        if (this.f34832.m34822()) {
            return true;
        }
        C13136 c13136 = this.f23322;
        if (c13136 != null && c13136.m31868()) {
            return true;
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f34831;
        return (abstractActivityC3346 != null && (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed())) || !this.f34835.m42802(this.f34833);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۤۨܿ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ۤۨܿ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        int i = this.f34829;
        C18368 c18368 = this.f34835;
        try {
            C9711 c9711M39443 = this.f34830.m39443(c18368.f57064, c18368.f57066, new InterfaceC17066() { // from class: l.ۤۨܿ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f30945.m28574();
                }
            });
            this.f34834 = c9711M39443;
            String strM25005 = C9902.m25005(c9711M39443, c18368.f57062, i, new InterfaceC17066() { // from class: l.ۤۨܿ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f30945.m28574();
                }
            });
            this.f34837 = strM25005;
            if (strM25005.length() > 524288 && i < 5) {
                throw new C17662();
            }
        } finally {
            C16765 c16765 = this.f34830;
            if (c16765 != null) {
                c16765.close();
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (m28574()) {
            return;
        }
        if (C9902.m25007(this.f34833, this.f34835, this.f34831)) {
            ((ClipboardManager) this.f34836.getSystemService("clipboard")).setText(this.f34837);
            C21374.m48457(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (m28574() || (exc instanceof C16956)) {
            return;
        }
        boolean z = exc instanceof C17662;
        AbstractActivityC3346 abstractActivityC3346 = this.f34831;
        C18368 c18368 = this.f34835;
        C6807 c6807 = this.f34833;
        if (z) {
            if (C9902.m25007(c6807, c18368, abstractActivityC3346)) {
                C21374.m48457(R.string.MT_Protector);
            }
        } else if (exc instanceof IOException) {
            if (C9902.m25007(c6807, c18368, abstractActivityC3346)) {
                c6807.m18479((IOException) exc);
            }
        } else if (C9902.m25007(c6807, c18368, abstractActivityC3346)) {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C16765 c16765 = this.f34830;
        if (c16765 != null) {
            c16765.close();
        }
        C9711 c9711 = this.f34834;
        if (c9711 != null) {
            try {
                c9711.close();
            } catch (IOException unused) {
            }
        }
        this.f34832.close();
        m20273();
    }
}
