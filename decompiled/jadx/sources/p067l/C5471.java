package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import bin.p000mt.plus.R;
import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: renamed from: l.ۗ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5471 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f13044;

    /* JADX INFO: renamed from: ۜ */
    public boolean f13045;

    /* JADX INFO: renamed from: ۧ */
    public final C23576 f13046 = new C23576(this);

    /* JADX INFO: renamed from: ܳ */
    public C0990 f13047;

    /* JADX INFO: renamed from: ܽ */
    public boolean f13048;

    /* JADX INFO: renamed from: ܿ */
    public View f13049;

    /* JADX INFO: renamed from: ᩳ */
    public DialogInterfaceC2564 f13050;

    /* JADX INFO: renamed from: ᩷ */
    public C20786 f13051;

    /* JADX INFO: renamed from: ᩻ */
    public final C7374 f13052;

    public C5471(AbstractActivityC5549 abstractActivityC5549, C7374 c7374) {
        this.f13044 = abstractActivityC5549;
        this.f13052 = c7374;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5471 m12014(View view, AbstractActivityC5549 abstractActivityC5549, DialogInterfaceC2564 dialogInterfaceC2564) {
        C5471 c5471 = new C5471(abstractActivityC5549, C7374.m17085());
        c5471.f13050 = dialogInterfaceC2564;
        C4694 c4694 = (C4694) view.findViewById(R.id.MT_Protector);
        c4694.m9946();
        c5471.m12040();
        c4694.setAdapter(c5471.f13046);
        return c5471;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12016(final C5471 c5471, View view) {
        c5471.f13047 = (C0990) view.findViewById(R.id.MT_Protector);
        c5471.f13049 = view.findViewById(R.id.MT_Protector);
        c5471.m12035();
        c5471.f13047.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩷۬᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C5471.m12031(this.f70288, z);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m12031(final C5471 c5471, final boolean z) {
        if (c5471.f13045) {
            return;
        }
        c5471.m12040();
        if (c5471.f13048) {
            return;
        }
        if (z && c5471.f13052.m17093().f65337.isEmpty()) {
            C22682.m50799(R.string.MT_Protector);
            return;
        }
        AbstractActivityC5549 abstractActivityC5549 = c5471.f13044;
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46710(z ? R.string.MT_Protector : R.string.MT_Protector);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۡ۬᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C5471.m12028(this.f30019, z);
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m12028(final C5471 c5471, final boolean z) {
        c5471.m12024(new InterfaceC16869() { // from class: l.ܺ۬᩻
            @Override // p067l.InterfaceC16869
            public final C6033 run() {
                this.f52429.f13052.m17091(z);
                return null;
            }
        }, (Runnable) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12038() {
        if (this.f13048) {
            return;
        }
        C7374 c7374 = this.f13052;
        if (c7374.m17093().f65337.size() >= 32) {
            C22682.m50799(R.string.MT_Protector);
            return;
        }
        if (!c7374.m17093().f65335) {
            int i = DialogInterfaceC2564.f4230;
            C20671 c20671 = new C20671(this.f13044);
            c20671.m46727(R.string.MT_Protector);
            c20671.m46710(R.string.MT_Protector);
            c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC8824(0, this));
            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c20671.m46732();
            return;
        }
        m12025((C20115) null, (DialogInterfaceC2564) null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m12039() {
        return this.f13048;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12040() {
        this.f13051 = this.f13052.m17093();
        m12035();
        this.f13046.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m12035() {
        C0990 c0990 = this.f13047;
        if (c0990 == null) {
            return;
        }
        this.f13045 = true;
        c0990.setChecked(this.f13051.f65339);
        this.f13045 = false;
        this.f13049.setVisibility(this.f13051.f65337.isEmpty() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m12025(C20115 c20115, DialogInterfaceC2564 dialogInterfaceC2564) {
        AbstractActivityC5549 abstractActivityC5549 = this.f13044;
        C3459 c3459 = new C3459(this, abstractActivityC5549, c20115, dialogInterfaceC2564);
        c3459.m33344(c20115 == null ? R.string.MT_Protector : R.string.MT_Protector);
        c3459.m33351(abstractActivityC5549.getString(R.string.MT_Protector));
        c3459.m33336((CharSequence) (c20115 == null ? "" : c20115.f62231));
        c3459.m33328();
        c3459.m33330();
        c3459.m33352(true);
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
    /* JADX INFO: renamed from: ܽ */
    public static void m12030(final C5471 c5471, final String str) {
        AbstractActivityC5549 abstractActivityC5549 = c5471.f13044;
        C7374 c7374 = c5471.f13052;
        C20115 c20115M17092 = c7374.m17092(str);
        if (c20115M17092 == null) {
            c5471.m12040();
            return;
        }
        String str2 = c20115M17092.f62235;
        String str3 = c20115M17092.f62234;
        long j = c20115M17092.f62232;
        String str4 = j == 0 ? "—" : DateFormat.getDateTimeInstance().format(new Date(j));
        long j2 = c20115M17092.f62233;
        String str5 = j2 == 0 ? "—" : DateFormat.getDateTimeInstance().format(new Date(j2));
        if (str2.isEmpty()) {
            str2 = "—";
        }
        String string = abstractActivityC5549.getString(R.string.MT_Protector, str3, str4, str5, str2);
        String strM17094 = c7374.m17094(str);
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46730(c20115M17092.f62231);
        if (strM17094 == null) {
            StringBuilder sbM21133 = C9179.m21133(string, "\n\n");
            sbM21133.append(abstractActivityC5549.getString(R.string.MT_Protector));
            string = sbM21133.toString();
        }
        c20671.m46718(string);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671.m46732();
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ۖ۬᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5471.m12019(this.f10889, str, dialogInterfaceC2564M46732, view);
            }
        });
        dialogInterfaceC2564M46732.m3860().setEnabled(strM17094 != null);
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۘ۬᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5471.m12017(this.f15406, str);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m12017(C5471 c5471, String str) {
        String strM17094 = c5471.f13052.m17094(str);
        if (strM17094 != null) {
            C7050.m16211((CharSequence) strM17094);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12019(final C5471 c5471, final String str, final DialogInterfaceC2564 dialogInterfaceC2564, View view) {
        final C20115 c20115M17092 = c5471.f13052.m17092(str);
        if (c20115M17092 != null) {
            C1898 c1898 = new C1898(c5471.f13044, view, 0);
            c1898.m50638().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ᩴ۬᩻
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    this.f62525.m12025(c20115M17092, dialogInterfaceC2564);
                    return true;
                }
            });
            c1898.m50638().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.᩵۬᩻
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    C5471.m12021(this.f65609, c20115M17092, str, dialogInterfaceC2564);
                    return true;
                }
            });
            c1898.m50639();
            return;
        }
        c5471.m12040();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: ֫ */
    public static void m12021(C5471 c5471, C20115 c20115, String str, DialogInterfaceC2564 dialogInterfaceC2564) {
        boolean z;
        C20786 c20786M17093 = c5471.f13052.m17093();
        int i = 0;
        if (c20786M17093.f65339) {
            z = c20786M17093.f65337.size() == 1;
        }
        AbstractActivityC5549 abstractActivityC5549 = c5471.f13044;
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46730(c20115.f62231);
        c20671.m46710(z ? R.string.MT_Protector : R.string.MT_Protector);
        c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24917(c5471, str, dialogInterfaceC2564, i));
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m12024(InterfaceC16869 interfaceC16869, Runnable runnable) {
        if (this.f13048) {
            return;
        }
        this.f13048 = true;
        new C10165(this, interfaceC16869, runnable).m22250();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m12036(C5471 c5471, String str) {
        AbstractActivityC5549 abstractActivityC5549 = c5471.f13044;
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46727(R.string.MT_Protector);
        c20671.m46718(abstractActivityC5549.getString(R.string.MT_Protector) + "\n\n" + str);
        c20671.m46736(R.string.MT_Protector, null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671.m46709();
        dialogInterfaceC2564M46709.m3862();
        dialogInterfaceC2564M46709.m3861().setOnClickListener(new ViewOnClickListenerC11507(0, str));
    }
}
