package p067l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩻᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 492R */
/* JADX INFO: loaded from: classes.dex */
public final class C25189 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f80566;

    /* JADX INFO: renamed from: ܽ */
    public boolean f80568;

    /* JADX INFO: renamed from: ܿ */
    public boolean f80569;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f80570;

    /* JADX INFO: renamed from: ֫ */
    public C19566 f80565 = new C19566();

    /* JADX INFO: renamed from: ܳ */
    public C19566 f80567 = new C19566();

    /* JADX INFO: renamed from: ᩻ */
    public C19566 f80571 = new C19566();

    /* JADX INFO: renamed from: ֫ */
    public final void m55259(C25189 c25189) {
        this.f80565.m44474(c25189.f80565);
        this.f80567.m44474(c25189.f80567);
        this.f80571.m44474(c25189.f80571);
        this.f80566 = c25189.f80566;
        this.f80570 = c25189.f80570;
        this.f80568 = c25189.f80568;
        this.f80569 = c25189.f80569;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m55258() {
        return this.f80565 + "->" + this.f80567 + ":" + this.f80571;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۧ */
    public final JSONObject m55260() {
        try {
            JSONObject jSONObject = new JSONObject();
            this.f80565.m44479(jSONObject, 'a');
            this.f80571.m44479(jSONObject, 'd');
            this.f80567.m44479(jSONObject, 'g');
            jSONObject.put("j", this.f80566 ? 1 : 0);
            jSONObject.put("k", this.f80570 ? 1 : 0);
            jSONObject.put("l", this.f80568 ? 1 : 0);
            jSONObject.put("m", this.f80569 ? 1 : 0);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
