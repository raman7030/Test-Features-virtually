package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC22837 {
    ARITY_MISMATCH("arg.length.mismatch", "infer.arg.length.mismatch"),
    ARG_MISMATCH("no.conforming.assignment.exists", "infer.no.conforming.assignment.exists"),
    VARARG_MISMATCH("varargs.argument.mismatch", "infer.varargs.argument.mismatch"),
    INACCESSIBLE_VARARGS("inaccessible.varargs.type", "inaccessible.varargs.type");


    /* JADX INFO: renamed from: ᩸ */
    public final String f71922;

    /* JADX INFO: renamed from: ᩹ */
    public final String f71923;

    EnumC22837(String str, String str2) {
        this.f71922 = str;
        this.f71923 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m51041() {
        return C21459.m48622("([a-z]*\\.)*(", this.f71922, "|", this.f71923, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
