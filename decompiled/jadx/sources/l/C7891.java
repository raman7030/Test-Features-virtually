package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7891 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f24450;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24451;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7744 f24452;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14946 f24453;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f24454;

    public C7891(ActivityC14946 activityC14946, String str) {
        this.f24453 = activityC14946;
        this.f24451 = str;
        this.f24450 = C9170.m23579(activityC14946);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        ActivityC14946 activityC14946 = this.f24453;
        this.f24452 = activityC14946.f45556.m30436().mo26562();
        this.f24454 = activityC14946.f45556.m30531();
        m20267(activityC14946, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C7744 c7744 = this.f24452;
        try {
            C1394.m4884(C16999.m39866(this.f24451, new String[0]), c7744, this.f24454, C14776.f45134);
            if (c7744 != null) {
                c7744.close();
            }
        } catch (Throwable th) {
            if (c7744 != null) {
                try {
                    c7744.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
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
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ActivityC14946 activityC14946 = this.f24453;
        boolean zIsEmpty = TextUtils.isEmpty(activityC14946.f45558);
        final String str = this.f24451;
        if (!zIsEmpty) {
            activityC14946.f45558 = str;
        } else {
            activityC14946.f45561 = C9523.m24406(str);
            ApplicationC20075.f65008.edit().putString("text_viewer_save_as_path", activityC14946.f45561);
        }
        if (this.f24450.m23581()) {
            String string = activityC14946.getString(R.string.MT_Protector, str);
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(activityC14946);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44424(string);
            c19258.m44442(R.string.MT_Protector, null);
            if (activityC14946.f45555) {
                c19258.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨ۖᩳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Main.m63(this.f3013.f24453, str);
                    }
                });
            }
            c19258.m44438();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f24450.m23581()) {
            this.f24453.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C7744 c7744 = this.f24452;
        if (c7744 != null) {
            c7744.close();
        }
        m20273();
    }
}
