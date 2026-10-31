package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21537 {
    ARITY_MISMATCH("arg.length.mismatch", "infer.arg.length.mismatch"),
    ARG_MISMATCH("no.conforming.assignment.exists", "infer.no.conforming.assignment.exists"),
    VARARG_MISMATCH("varargs.argument.mismatch", "infer.varargs.argument.mismatch"),
    INACCESSIBLE_VARARGS("inaccessible.varargs.type", "inaccessible.varargs.type");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f69222;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f69223;

    EnumC21537(String str, String str2) {
        this.f69222 = str;
        this.f69223 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m48696() {
        return C20087.m46306("([a-z]*\\.)*(", this.f69222, "|", this.f69223, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
