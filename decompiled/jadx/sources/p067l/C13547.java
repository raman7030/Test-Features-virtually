package p067l;

import android.content.DialogInterface;
import android.widget.Spinner;
import bin.p000mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۨܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13547 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ String f38103;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f38104;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ ArrayList f38105;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ Spinner f38106;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f38107 = new ArrayList();

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ String f38108;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean f38109;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ViewOnClickListenerC9523 f38110;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
    }

    public C13547(ViewOnClickListenerC9523 viewOnClickListenerC9523, AbstractActivityC5549 abstractActivityC5549, Spinner spinner, String str, ArrayList arrayList, String str2, boolean z) {
        this.f38110 = viewOnClickListenerC9523;
        this.f38104 = abstractActivityC5549;
        this.f38106 = spinner;
        this.f38103 = str;
        this.f38105 = arrayList;
        this.f38108 = str2;
        this.f38109 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f38104, R.string.MT_Protector);
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
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        String string;
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = this.f38110;
        C21954 c21954 = new C21954((AbstractActivityC5549) viewOnClickListenerC9523.requireActivity());
        String str = (String) viewOnClickListenerC9523.f26081.m32128().get(Math.max(0, this.f38106.getSelectedItemPosition()));
        try {
            C19561 c19561M44427 = C19561.m44427(C18524.m42109(this.f38103, new String[0]), (byte[]) null);
            try {
                viewOnClickListenerC9523.f26081.m32103(false);
                for (C5738 c5738 : this.f38105) {
                    String strM42103 = C18524.m42103(c5738.getName(), false);
                    String strSubstring = strM42103.substring(0, strM42103.length() - 6);
                    this.f26234.m33953(viewOnClickListenerC9523.getString(R.string.MT_Protector, strSubstring));
                    String str2 = this.f38108 + strSubstring;
                    String strM52175 = C23461.m52175(c19561M44427.m44448(c5738), StandardCharsets.UTF_8);
                    boolean zM32119 = viewOnClickListenerC9523.f26081.m32119(str2);
                    ArrayList arrayList = this.f38107;
                    if (zM32119) {
                        if (c21954.mo15385()) {
                            c21954.m49482(str2);
                            if (c21954.mo3924()) {
                                break;
                            }
                        }
                        int iMo15382 = c21954.mo15382();
                        if (iMo15382 == 0) {
                            viewOnClickListenerC9523.f26081.m32088(str2, strM52175);
                            arrayList.add(str2);
                        } else if (iMo15382 == 2) {
                            int i = 1;
                            do {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                i++;
                                sb.append(i);
                                string = sb.toString();
                            } while (viewOnClickListenerC9523.f26081.m32119(string));
                            viewOnClickListenerC9523.f26081.m32089(str, string, strM52175);
                            arrayList.add(string);
                        }
                    } else {
                        viewOnClickListenerC9523.f26081.m32089(str, str2, strM52175);
                        arrayList.add(str2);
                    }
                }
                c19561M44427.close();
                viewOnClickListenerC9523.f26081.m32103(true);
            } catch (Throwable th) {
                try {
                    c19561M44427.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            viewOnClickListenerC9523.f26081.m32103(true);
            throw th3;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f38104.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ArrayList arrayList = this.f38107;
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC9523 viewOnClickListenerC9523 = this.f38110;
            viewOnClickListenerC9523.m22191();
            viewOnClickListenerC9523.f26082.m35373((Collection) arrayList);
        }
        this.f26234.m33949();
        if (this.f38109) {
            C18524.m42109(this.f38103, new String[0]).mo25503();
        }
    }
}
