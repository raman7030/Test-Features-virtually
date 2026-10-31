package l;

import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ᩴܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18806 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f59348;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f59351;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f59352;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f59350 = new ArrayList();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f59349 = 0;

    public C18806(ViewOnClickListenerC21628 viewOnClickListenerC21628, AbstractActivityC3346 abstractActivityC3346, String str) {
        this.f59352 = viewOnClickListenerC21628;
        this.f59348 = abstractActivityC3346;
        this.f59351 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f59348);
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
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        ViewOnClickListenerC21628 viewOnClickListenerC21628 = this.f59352;
        C20608 c20608 = new C20608(this.f59348);
        c20608.m47157();
        try {
            C18090 c18090 = new C18090(this.f59351);
            try {
                viewOnClickListenerC21628.f69432.m44830(false);
                ArrayList<C3545> arrayListM42194 = c18090.m42194();
                for (C3545 c3545 : arrayListM42194) {
                    C16999.m39860(c3545.getName(), c3545.isDirectory());
                }
                for (C3545 c3546 : arrayListM42194) {
                    if (!c3546.isDirectory() && c3546.getName().toLowerCase().endsWith(".xml")) {
                        this.f59349++;
                        String strM39860 = C16999.m39860(c3546.getName(), false);
                        String strSubstring = strM39860.substring(0, strM39860.length() - 4);
                        this.f23322.m31861(viewOnClickListenerC21628.getString(R.string.MT_Protector, strSubstring));
                        String strM49848 = C22194.m49848(c18090.m42189(c3546), StandardCharsets.UTF_8);
                        try {
                            C20631.m47203(strM49848);
                            boolean zM44838 = viewOnClickListenerC21628.f69432.m44838(strSubstring);
                            ArrayList arrayList = this.f59350;
                            if (zM44838) {
                                if (c20608.mo13496()) {
                                    c20608.m47156(strSubstring);
                                    if (c20608.mo1526()) {
                                        break;
                                    }
                                }
                                int iMo13493 = c20608.mo13493();
                                if (iMo13493 == 0) {
                                    viewOnClickListenerC21628.f69432.m44851(strSubstring, strM49848);
                                    arrayList.add(strSubstring);
                                } else if (iMo13493 == 2) {
                                    throw new RuntimeException();
                                }
                            } else {
                                viewOnClickListenerC21628.f69432.m44819(strSubstring, strM49848);
                                arrayList.add(strSubstring);
                            }
                        } catch (Exception e) {
                            throw new Exception("Parse xml failed: " + c3546.getName(), e);
                        }
                    }
                }
                c18090.close();
                viewOnClickListenerC21628.f69432.m44830(true);
            } catch (Throwable th) {
                try {
                    c18090.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            viewOnClickListenerC21628.f69432.m44830(true);
            throw th3;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f59349 == 0) {
            C21374.m48463(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f59352.f69427.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ArrayList arrayList = this.f59350;
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC21628 viewOnClickListenerC21628 = this.f59352;
            viewOnClickListenerC21628.m48890();
            viewOnClickListenerC21628.f69433.m33254((Collection) arrayList);
        }
        m20273();
    }
}
