package l;

import com.google.android.material.motion.MotionUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩵᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S16D */
/* JADX INFO: loaded from: classes4.dex */
public final class C19779 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f63855;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f63857;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f63859;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18095 f63854 = new C18095();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18095 f63858 = new C18095();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18095 f63856 = new C18095();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18095 f63860 = new C18095();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45465(C19779 c19779) {
        this.f63854.m42215(c19779.f63854);
        this.f63858.m42215(c19779.f63858);
        this.f63856.m42215(c19779.f63856);
        this.f63860.m42215(c19779.f63860);
        this.f63859 = c19779.f63859;
        this.f63855 = c19779.f63855;
        this.f63857 = c19779.f63857;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m45464() {
        return this.f63854 + "->" + this.f63858 + MotionUtils.EASING_TYPE_FORMAT_START + this.f63856 + MotionUtils.EASING_TYPE_FORMAT_END + this.f63860;
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
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final JSONObject m45466() {
        try {
            JSONObject jSONObject = new JSONObject();
            this.f63854.m42220(jSONObject, 'a');
            this.f63858.m42220(jSONObject, 'd');
            this.f63856.m42220(jSONObject, 'g');
            this.f63860.m42220(jSONObject, 'j');
            jSONObject.put("m", this.f63859 ? 1 : 0);
            jSONObject.put("n", this.f63855 ? 1 : 0);
            jSONObject.put("o", this.f63857 ? 1 : 0);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
