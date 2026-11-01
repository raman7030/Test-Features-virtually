package p067l;

import android.content.ClipboardManager;
import android.content.Context;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C13475 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ int f37828;

    /* JADX INFO: renamed from: ۘ */
    public C18302 f37829;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f37830;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C16213 f37831;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C8838 f37832;

    /* JADX INFO: renamed from: ܳ */
    public C11598 f37833;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C19826 f37834;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ Context f37835;

    /* JADX INFO: renamed from: ᩻ */
    public String f37836;

    public C13475(C19826 c19826, AbstractActivityC5549 abstractActivityC5549, C16213 c16213, C8838 c8838, int i, Context context) {
        this.f37834 = c19826;
        this.f37830 = abstractActivityC5549;
        this.f37831 = c16213;
        this.f37832 = c8838;
        this.f37828 = i;
        this.f37835 = context;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f37829 = this.f37834.f60282.m44658();
        AbstractActivityC5549 abstractActivityC5549 = this.f37830;
        if (abstractActivityC5549 != null) {
            m22245(abstractActivityC5549, R.string.MT_Protector, 200, new Runnable() { // from class: l.ۛۨܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C13475.m30623(this.f21385);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m30623(C13475 c13475) {
        c13475.f26234.m33952((Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public boolean m30622() {
        if (this.f37831.m36971()) {
            return true;
        }
        C14853 c14853 = this.f26234;
        if (c14853 != null && c14853.m33960()) {
            return true;
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f37830;
        return (abstractActivityC5549 != null && (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed())) || !this.f37834.m45074(this.f37832);
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        int i = this.f37828;
        C19826 c19826 = this.f37834;
        try {
            C11598 c11598M41679 = this.f37829.m41679(c19826.f60283, c19826.f60285, new InterfaceC18588() { // from class: l.ۤۨܿ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f33908.m30622();
                }
            });
            this.f37833 = c11598M41679;
            String strM27020 = C11780.m27020(c11598M41679, c19826.f60281, i, new InterfaceC18588() { // from class: l.ۤۨܿ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f33908.m30622();
                }
            });
            this.f37836 = strM27020;
            if (strM27020.length() > 524288 && i < 5) {
                throw new C19155();
            }
        } finally {
            C18302 c18302 = this.f37829;
            if (c18302 != null) {
                c18302.close();
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (m30622()) {
            return;
        }
        if (C11780.m27022(this.f37832, this.f37834, this.f37830)) {
            ((ClipboardManager) this.f37835.getSystemService("clipboard")).setText(this.f37836);
            C22682.m50793(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (m30622() || (exc instanceof C18484)) {
            return;
        }
        boolean z = exc instanceof C19155;
        AbstractActivityC5549 abstractActivityC5549 = this.f37830;
        C19826 c19826 = this.f37834;
        C8838 c8838 = this.f37832;
        if (z) {
            if (C11780.m27022(c8838, c19826, abstractActivityC5549)) {
                C22682.m50793(R.string.MT_Protector);
            }
        } else if (exc instanceof IOException) {
            if (C11780.m27022(c8838, c19826, abstractActivityC5549)) {
                c8838.m20428((IOException) exc);
            }
        } else if (C11780.m27022(c8838, c19826, abstractActivityC5549)) {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C18302 c18302 = this.f37829;
        if (c18302 != null) {
            c18302.close();
        }
        C11598 c11598 = this.f37833;
        if (c11598 != null) {
            try {
                c11598.close();
            } catch (IOException unused) {
            }
        }
        this.f37831.close();
        m22249();
    }
}
