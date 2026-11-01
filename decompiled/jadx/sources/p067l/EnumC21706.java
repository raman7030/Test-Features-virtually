package p067l;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.statistics.C0795b;
import com.umeng.commonsdk.statistics.idtracking.C0810i;

/* JADX INFO: renamed from: l.᩶ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 041R */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21706 {
    AUXILIARYCLASS("auxiliaryclass"),
    CAST("cast"),
    CLASSFILE("classfile"),
    DEPRECATION("deprecation"),
    DEP_ANN("dep-ann"),
    DIVZERO("divzero"),
    EMPTY(C0795b.f3347f),
    EXPORTS("exports"),
    FALLTHROUGH("fallthrough"),
    FINALLY("finally"),
    MISSING_EXPLICIT_CTOR("missing-explicit-ctor"),
    MODULE(C0655am.f2344e),
    OPENS("opens"),
    OPTIONS("options"),
    OVERLOADS("overloads"),
    OVERRIDES("overrides"),
    PATH(MotionUtils.EASING_TYPE_PATH),
    PROCESSING("processing"),
    RAW("rawtypes"),
    REMOVAL("removal"),
    REQUIRES_AUTOMATIC("requires-automatic"),
    REQUIRES_TRANSITIVE_AUTOMATIC("requires-transitive-automatic"),
    SERIAL(C0810i.f3439a),
    STATIC("static"),
    STRICTFP("strictfp"),
    SYNCHRONIZATION("synchronization"),
    TEXT_BLOCKS("text-blocks"),
    TRY("try"),
    UNCHECKED("unchecked"),
    VARARGS("varargs"),
    PREVIEW("preview");


    /* JADX INFO: renamed from: ᩸ */
    public final boolean f68386;

    /* JADX INFO: renamed from: ᩹ */
    public final String f68387;

    EnumC21706(String str) {
        this(str, false);
    }

    EnumC21706(String str, boolean z) {
        this.f68387 = str;
        this.f68386 = z;
        C6953.f18080.put(str, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC21706 m48993(String str) {
        return (EnumC21706) C6953.f18080.get(str);
    }
}
