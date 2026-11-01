package p067l;

import bin.p000mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.ᩴܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20242 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f62575;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f62578;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ViewOnClickListenerC22924 f62579;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f62577 = new ArrayList();

    /* JADX INFO: renamed from: ۢ */
    public int f62576 = 0;

    public C20242(ViewOnClickListenerC22924 viewOnClickListenerC22924, AbstractActivityC5549 abstractActivityC5549, String str) {
        this.f62579 = viewOnClickListenerC22924;
        this.f62575 = abstractActivityC5549;
        this.f62578 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f62575);
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
        ViewOnClickListenerC22924 viewOnClickListenerC22924 = this.f62579;
        C21954 c21954 = new C21954(this.f62575);
        c21954.m49483();
        try {
            C19561 c19561 = new C19561(this.f62578);
            try {
                viewOnClickListenerC22924.f72135.m47126(false);
                ArrayList<C5738> arrayListM44453 = c19561.m44453();
                for (C5738 c5738 : arrayListM44453) {
                    C18524.m42103(c5738.getName(), c5738.isDirectory());
                }
                for (C5738 c5739 : arrayListM44453) {
                    if (!c5739.isDirectory() && c5739.getName().toLowerCase().endsWith(".xml")) {
                        this.f62576++;
                        String strM42103 = C18524.m42103(c5739.getName(), false);
                        String strSubstring = strM42103.substring(0, strM42103.length() - 4);
                        this.f26234.m33953(viewOnClickListenerC22924.getString(R.string.MT_Protector, strSubstring));
                        String strM52175 = C23461.m52175(c19561.m44448(c5739), StandardCharsets.UTF_8);
                        try {
                            C21976.m49530(strM52175);
                            boolean zM47134 = viewOnClickListenerC22924.f72135.m47134(strSubstring);
                            ArrayList arrayList = this.f62577;
                            if (zM47134) {
                                if (c21954.mo15385()) {
                                    c21954.m49482(strSubstring);
                                    if (c21954.mo3924()) {
                                        break;
                                    }
                                }
                                int iMo15382 = c21954.mo15382();
                                if (iMo15382 == 0) {
                                    viewOnClickListenerC22924.f72135.m47147(strSubstring, strM52175);
                                    arrayList.add(strSubstring);
                                } else if (iMo15382 == 2) {
                                    throw new RuntimeException();
                                }
                            } else {
                                viewOnClickListenerC22924.f72135.m47115(strSubstring, strM52175);
                                arrayList.add(strSubstring);
                            }
                        } catch (Exception e) {
                            throw new Exception("Parse xml failed: " + c5739.getName(), e);
                        }
                    }
                }
                c19561.close();
                viewOnClickListenerC22924.f72135.m47126(true);
            } catch (Throwable th) {
                try {
                    c19561.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            viewOnClickListenerC22924.f72135.m47126(true);
            throw th3;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f62576 == 0) {
            C22682.m50799(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f62579.f72130.m13320((Throwable) exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ArrayList arrayList = this.f62577;
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC22924 viewOnClickListenerC22924 = this.f62579;
            viewOnClickListenerC22924.m51238();
            viewOnClickListenerC22924.f72136.m35373((Collection) arrayList);
        }
        m22249();
    }
}
