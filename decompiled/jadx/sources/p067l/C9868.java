package p067l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q649 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9868 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final C11084 f27366;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ String f27367;

    /* JADX INFO: renamed from: ܳ */
    public C9729 f27368;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ ActivityC16573 f27369;

    /* JADX INFO: renamed from: ᩻ */
    public String f27370;

    public C9868(ActivityC16573 activityC16573, String str) {
        this.f27369 = activityC16573;
        this.f27367 = str;
        this.f27366 = C11084.m25530(activityC16573);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ActivityC16573 activityC16573 = this.f27369;
        this.f27368 = activityC16573.f48669.m32500().mo28595();
        this.f27370 = activityC16573.f48669.m32595();
        m22243(activityC16573, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C9729 c9729 = this.f27368;
        try {
            C3694.m7122(C18524.m42109(this.f27367, new String[0]), c9729, this.f27370, C16412.f48248);
            if (c9729 != null) {
                c9729.close();
            }
        } catch (Throwable th) {
            if (c9729 != null) {
                try {
                    c9729.close();
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
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ActivityC16573 activityC16573 = this.f27369;
        boolean zIsEmpty = TextUtils.isEmpty(activityC16573.f48671);
        final String str = this.f27367;
        if (!zIsEmpty) {
            activityC16573.f48671 = str;
        } else {
            activityC16573.f48674 = C11419.m26416(str);
            ApplicationC21448.f67649.edit().putString("text_viewer_save_as_path", activityC16573.f48674);
        }
        if (this.f27366.m25532()) {
            String string = activityC16573.getString(R.string.MT_Protector, str);
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(activityC16573);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46718(string);
            c20671.m46736(R.string.MT_Protector, null);
            if (activityC16573.f48668) {
                c20671.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֨ۖᩳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Main.m61(this.f5787.f27369, str);
                    }
                });
            }
            c20671.m46732();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f27366.m25532()) {
            this.f27369.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C9729 c9729 = this.f27368;
        if (c9729 != null) {
            c9729.close();
        }
        m22249();
    }
}
