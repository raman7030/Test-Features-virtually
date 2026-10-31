package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: renamed from: l.ۗ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3264 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f10236;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f10237;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22314 f10238 = new C22314(this);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2978 f10239;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f10240;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f10241;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f10242;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19379 f10243;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5267 f10244;

    public C3264(AbstractActivityC3346 abstractActivityC3346, C5267 c5267) {
        this.f10236 = abstractActivityC3346;
        this.f10244 = c5267;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3264 m9981(View view, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        C3264 c3264 = new C3264(abstractActivityC3346, C5267.m15182());
        c3264.f10242 = dialogInterfaceC0206;
        C2447 c2447 = (C2447) view.findViewById(R.id.MT_Protector);
        c2447.m7898();
        c3264.m10007();
        c2447.setAdapter(c3264.f10238);
        return c3264;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9983(final C3264 c3264, View view) {
        c3264.f10239 = (C2978) view.findViewById(R.id.MT_Protector);
        c3264.f10241 = view.findViewById(R.id.MT_Protector);
        c3264.m10002();
        c3264.f10239.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩷۬᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C3264.m9998(this.f67603, z);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m9998(final C3264 c3264, final boolean z) {
        if (c3264.f10237) {
            return;
        }
        c3264.m10007();
        if (c3264.f10240) {
            return;
        }
        if (z && c3264.f10244.m15190().f62726.isEmpty()) {
            C21374.m48463(R.string.MT_Protector);
            return;
        }
        AbstractActivityC3346 abstractActivityC3346 = c3264.f10236;
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44416(z ? R.string.MT_Protector : R.string.MT_Protector);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡ۬᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C3264.m9995(this.f27087, z);
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9995(final C3264 c3264, final boolean z) {
        c3264.m9991(new InterfaceC15257() { // from class: l.ܺ۬᩻
            @Override // l.InterfaceC15257
            public final C3856 run() {
                this.f49271.f10244.m15188(z);
                return null;
            }
        }, (Runnable) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10005() {
        if (this.f10240) {
            return;
        }
        C5267 c5267 = this.f10244;
        if (c5267.m15190().f62726.size() >= 32) {
            C21374.m48463(R.string.MT_Protector);
            return;
        }
        if (!c5267.m15190().f62724) {
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(this.f10236);
            c19258.m44433(R.string.MT_Protector);
            c19258.m44416(R.string.MT_Protector);
            c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC6792(0, this));
            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c19258.m44438();
            return;
        }
        m9992((C18673) null, (DialogInterfaceC0206) null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m10006() {
        return this.f10240;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10007() {
        this.f10243 = this.f10244.m15190();
        m10002();
        this.f10238.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m10002() {
        C2978 c2978 = this.f10239;
        if (c2978 == null) {
            return;
        }
        this.f10237 = true;
        c2978.setChecked(this.f10243.f62728);
        this.f10237 = false;
        this.f10241.setVisibility(this.f10243.f62726.isEmpty() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m9992(C18673 c18673, DialogInterfaceC0206 dialogInterfaceC0206) {
        AbstractActivityC3346 abstractActivityC3346 = this.f10236;
        C1147 c1147 = new C1147(this, abstractActivityC3346, c18673, dialogInterfaceC0206);
        c1147.m31258(c18673 == null ? R.string.MT_Protector : R.string.MT_Protector);
        c1147.m31265(abstractActivityC3346.getString(R.string.MT_Protector));
        c1147.m31250((CharSequence) (c18673 == null ? "" : c18673.f59008));
        c1147.m31242();
        c1147.m31244();
        c1147.m31266(true);
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
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m9997(final C3264 c3264, final String str) {
        AbstractActivityC3346 abstractActivityC3346 = c3264.f10236;
        C5267 c5267 = c3264.f10244;
        C18673 c18673M15189 = c5267.m15189(str);
        if (c18673M15189 == null) {
            c3264.m10007();
            return;
        }
        String str2 = c18673M15189.f59012;
        String str3 = c18673M15189.f59011;
        long j = c18673M15189.f59009;
        String str4 = j == 0 ? "—" : DateFormat.getDateTimeInstance().format(new Date(j));
        long j2 = c18673M15189.f59010;
        String str5 = j2 == 0 ? "—" : DateFormat.getDateTimeInstance().format(new Date(j2));
        if (str2.isEmpty()) {
            str2 = "—";
        }
        String string = abstractActivityC3346.getString(R.string.MT_Protector, str3, str4, str5, str2);
        String strM15191 = c5267.m15191(str);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44436(c18673M15189.f59008);
        if (strM15191 == null) {
            StringBuilder sbM19190 = C7166.m19190(string, "\n\n");
            sbM19190.append(abstractActivityC3346.getString(R.string.MT_Protector));
            string = sbM19190.toString();
        }
        c19258.m44424(string);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258.m44438();
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۖ۬᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3264.m9986(this.f8099, str, dialogInterfaceC0206M44438, view);
            }
        });
        dialogInterfaceC0206M44438.m1447().setEnabled(strM15191 != null);
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۘ۬᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3264.m9984(this.f12595, str);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9984(C3264 c3264, String str) {
        String strM15191 = c3264.f10244.m15191(str);
        if (strM15191 != null) {
            C4925.m14314((CharSequence) strM15191);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9986(final C3264 c3264, final String str, final DialogInterfaceC0206 dialogInterfaceC0206, View view) {
        final C18673 c18673M15189 = c3264.f10244.m15189(str);
        if (c18673M15189 != null) {
            C21282 c21282 = new C21282(c3264.f10236, view, 0);
            c21282.m48304().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ᩴ۬᩻
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    this.f59302.m9992(c18673M15189, dialogInterfaceC0206);
                    return true;
                }
            });
            c21282.m48304().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.᩵۬᩻
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C3264.m9988(this.f62992, c18673M15189, str, dialogInterfaceC0206);
                    return true;
                }
            });
            c21282.m48305();
            return;
        }
        c3264.m10007();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9988(C3264 c3264, C18673 c18673, String str, DialogInterfaceC0206 dialogInterfaceC0206) {
        boolean z;
        C19379 c19379M15190 = c3264.f10244.m15190();
        int i = 0;
        if (c19379M15190.f62728) {
            z = c19379M15190.f62726.size() == 1;
        }
        AbstractActivityC3346 abstractActivityC3346 = c3264.f10236;
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44436(c18673.f59008);
        c19258.m44416(z ? R.string.MT_Protector : R.string.MT_Protector);
        c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23725(c3264, str, dialogInterfaceC0206, i));
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m9991(InterfaceC15257 interfaceC15257, Runnable runnable) {
        if (this.f10240) {
            return;
        }
        this.f10240 = true;
        new C8203(this, interfaceC15257, runnable).m20274();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m10003(C3264 c3264, String str) {
        AbstractActivityC3346 abstractActivityC3346 = c3264.f10236;
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44433(R.string.MT_Protector);
        c19258.m44424(abstractActivityC3346.getString(R.string.MT_Protector) + "\n\n" + str);
        c19258.m44442(R.string.MT_Protector, null);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258.m44415();
        dialogInterfaceC0206M44415.m1449();
        dialogInterfaceC0206M44415.m1448().setOnClickListener(new ViewOnClickListenerC9615(0, str));
    }
}
