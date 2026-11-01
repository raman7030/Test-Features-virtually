package p067l;

import com.umeng.commonsdk.statistics.C0795b;

/* JADX INFO: renamed from: l.ܽ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7EB */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC17880 {
    TYPEPARAM("TYPEPARAM", "type_parameter"),
    SUPERTYPE("SUPERTYPE", "supertype"),
    TYPEPARAM_BOUND("TYPEPARAM_BOUND", "type_parameter_bound"),
    EMPTY("EMPTY", C0795b.f3347f),
    METHODPARAM("METHODPARAM", "formal_parameter"),
    EXCEPTION("EXCEPTION", "throws"),
    LOCALVAR("LOCALVAR", "localvar"),
    CATCH("CATCH", "catch"),
    OFFSET("OFFSET", "offset"),
    TYPEARG("TYPEARG", "type_argument");


    /* JADX INFO: renamed from: ᩸ */
    public final String f53439;

    /* JADX INFO: renamed from: ᩹ */
    public final String f53440;

    EnumC17880(String str, String str2) {
        this.f53439 = str;
        this.f53440 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m40680() {
        return this.f53439;
    }

    /* JADX INFO: renamed from: ۧ */
    public String m40681() {
        return this.f53440;
    }
}
