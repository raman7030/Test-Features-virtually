package l;

/* JADX INFO: renamed from: l.᩺᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Q44I */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23258 {
    PACKAGE,
    ENUM,
    CLASS,
    ANNOTATION_TYPE,
    INTERFACE,
    ENUM_CONSTANT,
    FIELD,
    PARAMETER,
    LOCAL_VARIABLE,
    EXCEPTION_PARAMETER,
    METHOD,
    CONSTRUCTOR,
    STATIC_INIT,
    INSTANCE_INIT,
    TYPE_PARAMETER,
    OTHER,
    RESOURCE_VARIABLE,
    MODULE,
    RECORD,
    RECORD_COMPONENT,
    BINDING_VARIABLE;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m51578() {
        return this == CLASS || this == ENUM || this == RECORD;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m51580() {
        return this == INTERFACE || this == ANNOTATION_TYPE;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m51579() {
        return this == FIELD || this == ENUM_CONSTANT;
    }
}
