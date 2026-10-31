package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۖۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2477 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f7889;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7890;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f7891;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7892;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22933 f7893;

    public C2477(ActivityC17169 activityC17169, boolean z, boolean z2) {
        this.f7889 = activityC17169;
        this.f7892 = z;
        this.f7890 = z2;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        ActivityC17169 activityC17169 = this.f7889;
        C22933 c22933 = new C22933(activityC17169);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040("...");
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f7893 = c22933;
        c22933.m51047().setEllipsize(TextUtils.TruncateAt.START);
        if (activityC17169.f52606 != null) {
            activityC17169.f52606.m30024();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Throwable {
        ActivityC17169 activityC17169 = this.f7889;
        if (activityC17169.f52606 != null) {
            activityC17169.f52606.m30051();
            activityC17169.f52606.m30035(new C8827(this));
        }
        if (this.f7893.m51053()) {
            return;
        }
        if (activityC17169.f52621 != null) {
            if (this.f7892) {
                this.f7893.m51046("resources.arsc");
                this.f7893.m51038(R.string.MT_Protector);
                this.f7893.m51045(0);
                ArrayList arrayListM44853 = activityC17169.f52621.m44853();
                if (!arrayListM44853.isEmpty()) {
                    this.f7891 = arrayListM44853;
                    return;
                }
            }
            activityC17169.f52621.m44831(true, (InterfaceC5880) new C15881(this));
        }
        if (this.f7893.m51053()) {
            return;
        }
        this.f7893.m51045(100);
        this.f7893.m51049(R.string.MT_Protector);
        if (activityC17169.m40373() && activityC17169.m40346() != null) {
            String strM40346 = activityC17169.m40346();
            if (activityC17169.f52606 != null) {
                this.f7893.m51040("classes.dex");
                activityC17169.f52606.m30036(C16999.m39866(strM40346, new String[0]), C19890.f64276);
            }
            if (activityC17169.f52621 != null) {
                this.f7893.m51040(activityC17169.f52621.m44837());
                activityC17169.f52621.m44827(C16999.m39866(strM40346, new String[0]), C19890.f64276);
                return;
            }
            return;
        }
        if (activityC17169.f52606 != null) {
            this.f7893.m51040("classes.dex");
            activityC17169.f52606.m30077();
        }
        if (activityC17169.f52621 != null) {
            this.f7893.m51040(activityC17169.f52621.m44837());
            activityC17169.f52621.m44836();
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
        if (this.f7893.m51053() || this.f7891 != null) {
            return;
        }
        boolean z = this.f7890;
        ActivityC17169 activityC17169 = this.f7889;
        if (z) {
            activityC17169.finish();
            return;
        }
        if (activityC17169.m40373()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        final String strMo23554 = activityC17169.f52620.m27330("out").mo23554();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC17169);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44424(activityC17169.getString(R.string.MT_Protector, strMo23554));
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ۤ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C2477 c2477 = this.f67392;
                c2477.getClass();
                Intent intent = new Intent();
                intent.putExtra(MotionUtils.EASING_TYPE_PATH, strMo23554);
                ActivityC17169 activityC171610 = c2477.f7889;
                activityC171610.setResult(-1, intent);
                activityC171610.finish();
            }
        });
        c19258.m44438();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        ActivityC17169.m40277(this.f7889, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        final ActivityC17169 activityC17169 = this.f7889;
        if (activityC17169.f52606 != null) {
            activityC17169.f52606.m30061();
        }
        this.f7893.m51051();
        if (this.f7891 == null || this.f7893.m51053()) {
            return;
        }
        final ArrayList<C3929> arrayList = this.f7891;
        if (arrayList.isEmpty()) {
            return;
        }
        View viewM10216 = activityC17169.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(activityC17169.getString(R.string.MT_Protector, Integer.valueOf(arrayList.size())));
        StringBuilder sb = new StringBuilder();
        ?? r8 = 0;
        for (C3929 c3929 : arrayList) {
            ?? r10 = c3929.f12542;
            if (!r10.equals(r8)) {
                if (r8 != 0) {
                    sb.append('\n');
                }
                C20177.m46410(sb, "<!-- ", r10, ".xml -->\n");
                r8 = r10;
            }
            sb.append("<entry id=\"");
            sb.append(String.format(Locale.ENGLISH, "0x%08x", Integer.valueOf(c3929.f12538)));
            sb.append("\" name=\"");
            sb.append(C10035.f30193.m28254(c3929.f12537));
            sb.append("\" />\n");
            r8 = r8;
        }
        C10235 c10235 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        c10235.m30407(true);
        c10235.mo25910((CharSequence) sb.toString().trim());
        c10235.m25927();
        final C3929 c39210 = (C3929) arrayList.get(0);
        C19258 c19258BuildDialog = activityC17169.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        final boolean z = this.f7890;
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ActivityC17169.f52595;
                new C6710(activityC17169, arrayList, z).m20274();
            }
        });
        c19258BuildDialog.m44440(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗ۫᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC17169.m40281(activityC17169, c39210);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
