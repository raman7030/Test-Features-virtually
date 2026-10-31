package l;

import android.content.DialogInterface;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۨܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11762 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f35104;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f35105;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f35106;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f35107;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f35108 = new ArrayList();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f35109;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35110;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f35111;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
    }

    public C11762(ViewOnClickListenerC7528 viewOnClickListenerC7528, AbstractActivityC3346 abstractActivityC3346, Spinner spinner, String str, ArrayList arrayList, String str2, boolean z) {
        this.f35111 = viewOnClickListenerC7528;
        this.f35105 = abstractActivityC3346;
        this.f35107 = spinner;
        this.f35104 = str;
        this.f35106 = arrayList;
        this.f35109 = str2;
        this.f35110 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f35105, R.string.MT_Protector);
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
        String string;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f35111;
        C20608 c20608 = new C20608((AbstractActivityC3346) viewOnClickListenerC7528.requireActivity());
        String str = (String) viewOnClickListenerC7528.f23168.m30067().get(Math.max(0, this.f35107.getSelectedItemPosition()));
        try {
            C18090 c18090M42168 = C18090.m42168(C16999.m39866(this.f35104, new String[0]), (byte[]) null);
            try {
                viewOnClickListenerC7528.f23168.m30042(false);
                for (C3545 c3545 : this.f35106) {
                    String strM39860 = C16999.m39860(c3545.getName(), false);
                    String strSubstring = strM39860.substring(0, strM39860.length() - 6);
                    this.f23322.m31861(viewOnClickListenerC7528.getString(R.string.MT_Protector, strSubstring));
                    String str2 = this.f35109 + strSubstring;
                    String strM49848 = C22194.m49848(c18090M42168.m42189(c3545), StandardCharsets.UTF_8);
                    boolean zM30058 = viewOnClickListenerC7528.f23168.m30058(str2);
                    ArrayList arrayList = this.f35108;
                    if (zM30058) {
                        if (c20608.mo13496()) {
                            c20608.m47156(str2);
                            if (c20608.mo1526()) {
                                break;
                            }
                        }
                        int iMo13493 = c20608.mo13493();
                        if (iMo13493 == 0) {
                            viewOnClickListenerC7528.f23168.m30027(str2, strM49848);
                            arrayList.add(str2);
                        } else if (iMo13493 == 2) {
                            int i = 1;
                            do {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                i++;
                                sb.append(i);
                                string = sb.toString();
                            } while (viewOnClickListenerC7528.f23168.m30058(string));
                            viewOnClickListenerC7528.f23168.m30028(str, string, strM49848);
                            arrayList.add(string);
                        }
                    } else {
                        viewOnClickListenerC7528.f23168.m30028(str, str2, strM49848);
                        arrayList.add(str2);
                    }
                }
                c18090M42168.close();
                viewOnClickListenerC7528.f23168.m30042(true);
            } catch (Throwable th) {
                try {
                    c18090M42168.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            viewOnClickListenerC7528.f23168.m30042(true);
            throw th3;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f35105.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ArrayList arrayList = this.f35108;
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f35111;
            viewOnClickListenerC7528.m20215();
            viewOnClickListenerC7528.f23169.m33254((Collection) arrayList);
        }
        this.f23322.m31857();
        if (this.f35110) {
            C16999.m39866(this.f35104, new String[0]).mo23552();
        }
    }
}
