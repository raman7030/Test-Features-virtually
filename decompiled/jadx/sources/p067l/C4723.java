package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۖۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4723 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ActivityC18686 f10677;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f10678;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f10679;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean f10680;

    /* JADX INFO: renamed from: ᩻ */
    public C24164 f10681;

    public C4723(ActivityC18686 activityC18686, boolean z, boolean z2) {
        this.f10677 = activityC18686;
        this.f10680 = z;
        this.f10678 = z2;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ActivityC18686 activityC18686 = this.f10677;
        C24164 c24164 = new C24164(activityC18686);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431("...");
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f10681 = c24164;
        c24164.m53438().setEllipsize(TextUtils.TruncateAt.START);
        if (activityC18686.f55787 != null) {
            activityC18686.f55787.m32085();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Throwable {
        ActivityC18686 activityC18686 = this.f10677;
        if (activityC18686.f55787 != null) {
            activityC18686.f55787.m32112();
            activityC18686.f55787.m32096(new C10758(this));
        }
        if (this.f10681.m53444()) {
            return;
        }
        if (activityC18686.f55802 != null) {
            if (this.f10680) {
                this.f10681.m53437("resources.arsc");
                this.f10681.m53429(R.string.MT_Protector);
                this.f10681.m53436(0);
                ArrayList arrayListM47149 = activityC18686.f55802.m47149();
                if (!arrayListM47149.isEmpty()) {
                    this.f10679 = arrayListM47149;
                    return;
                }
            }
            activityC18686.f55802.m47127(true, (InterfaceC7957) new C17462(this));
        }
        if (this.f10681.m53444()) {
            return;
        }
        this.f10681.m53436(100);
        this.f10681.m53440(R.string.MT_Protector);
        if (activityC18686.m42618() && activityC18686.m42591() != null) {
            String strM42591 = activityC18686.m42591();
            if (activityC18686.f55787 != null) {
                this.f10681.m53431("classes.dex");
                activityC18686.f55787.m32097(C18524.m42109(strM42591, new String[0]), C21272.f66912);
            }
            if (activityC18686.f55802 != null) {
                this.f10681.m53431(activityC18686.f55802.m47133());
                activityC18686.f55802.m47123(C18524.m42109(strM42591, new String[0]), C21272.f66912);
                return;
            }
            return;
        }
        if (activityC18686.f55787 != null) {
            this.f10681.m53431("classes.dex");
            activityC18686.f55787.m32138();
        }
        if (activityC18686.f55802 != null) {
            this.f10681.m53431(activityC18686.f55802.m47133());
            activityC18686.f55802.m47132();
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
        if (this.f10681.m53444() || this.f10679 != null) {
            return;
        }
        boolean z = this.f10678;
        ActivityC18686 activityC18686 = this.f10677;
        if (z) {
            activityC18686.finish();
            return;
        }
        if (activityC18686.m42618()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        final String strMo25505 = activityC18686.f55801.m29392("out").mo25505();
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(activityC18686);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46718(activityC18686.getString(R.string.MT_Protector, strMo25505));
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ۤ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C4723 c4723 = this.f70075;
                c4723.getClass();
                Intent intent = new Intent();
                intent.putExtra(MotionUtils.EASING_TYPE_PATH, strMo25505);
                ActivityC18686 activityC18687 = c4723.f10677;
                activityC18687.setResult(-1, intent);
                activityC18687.finish();
            }
        });
        c20671.m46732();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        ActivityC18686.m42522(this.f10677, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        final ActivityC18686 activityC18686 = this.f10677;
        if (activityC18686.f55787 != null) {
            activityC18686.f55787.m32122();
        }
        this.f10681.m53442();
        if (this.f10679 == null || this.f10681.m53444()) {
            return;
        }
        final ArrayList<C6103> arrayList = this.f10679;
        if (arrayList.isEmpty()) {
            return;
        }
        View viewM12252 = activityC18686.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(activityC18686.getString(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        StringBuilder sb = new StringBuilder();
        ?? r8 = 0;
        for (C6103 c6103 : arrayList) {
            ?? r10 = c6103.f15350;
            if (!r10.equals(r8)) {
                if (r8 != 0) {
                    sb.append('\n');
                }
                C21545.m48729(sb, "<!-- ", r10, ".xml -->\n");
                r8 = r10;
            }
            sb.append("<entry id=\"");
            sb.append(String.format(Locale.ENGLISH, "0x%08x", Integer.valueOf(c6103.f15346)));
            sb.append("\" name=\"");
            sb.append(C11905.f33151.m30298(c6103.f15345));
            sb.append("\" />\n");
            r8 = r8;
        }
        C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        c12096.m32471(true);
        c12096.mo27932((CharSequence) sb.toString().trim());
        c12096.m27949();
        final C6103 c6104 = (C6103) arrayList.get(0);
        C20671 c20671BuildDialog = activityC18686.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        final boolean z = this.f10678;
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ActivityC18686.f55776;
                new C8746(activityC18686, arrayList, z).m22250();
            }
        });
        c20671BuildDialog.m46734(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC18686.m42526(activityC18686, c6104);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
