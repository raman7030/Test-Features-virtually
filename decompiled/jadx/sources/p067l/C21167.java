package p067l;

import com.google.android.material.motion.MotionUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩵᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S16D */
/* JADX INFO: loaded from: classes4.dex */
public final class C21167 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f66493;

    /* JADX INFO: renamed from: ܽ */
    public boolean f66495;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f66497;

    /* JADX INFO: renamed from: ֫ */
    public final C19566 f66492 = new C19566();

    /* JADX INFO: renamed from: ܿ */
    public final C19566 f66496 = new C19566();

    /* JADX INFO: renamed from: ܳ */
    public final C19566 f66494 = new C19566();

    /* JADX INFO: renamed from: ᩻ */
    public final C19566 f66498 = new C19566();

    /* JADX INFO: renamed from: ֫ */
    public final void m47776(C21167 c21167) {
        this.f66492.m44474(c21167.f66492);
        this.f66496.m44474(c21167.f66496);
        this.f66494.m44474(c21167.f66494);
        this.f66498.m44474(c21167.f66498);
        this.f66497 = c21167.f66497;
        this.f66493 = c21167.f66493;
        this.f66495 = c21167.f66495;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m47775() {
        return this.f66492 + "->" + this.f66496 + MotionUtils.EASING_TYPE_FORMAT_START + this.f66494 + MotionUtils.EASING_TYPE_FORMAT_END + this.f66498;
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
    public final JSONObject m47777() {
        try {
            JSONObject jSONObject = new JSONObject();
            this.f66492.m44479(jSONObject, 'a');
            this.f66496.m44479(jSONObject, 'd');
            this.f66494.m44479(jSONObject, 'g');
            this.f66498.m44479(jSONObject, 'j');
            jSONObject.put("m", this.f66497 ? 1 : 0);
            jSONObject.put("n", this.f66493 ? 1 : 0);
            jSONObject.put("o", this.f66495 ? 1 : 0);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
