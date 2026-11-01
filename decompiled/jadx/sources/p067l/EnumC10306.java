package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۠ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10306 implements InterfaceC11867 {
    ANNOTATION("kindname.annotation"),
    CONSTRUCTOR("kindname.constructor"),
    INTERFACE("kindname.interface"),
    ENUM("kindname.enum"),
    STATIC("kindname.static"),
    TYPEVAR("kindname.type.variable"),
    BOUND("kindname.type.variable.bound"),
    VAR("kindname.variable"),
    VAL("kindname.value"),
    METHOD("kindname.method"),
    CLASS("kindname.class"),
    STATIC_INIT("kindname.static.init"),
    INSTANCE_INIT("kindname.instance.init"),
    PACKAGE("kindname.package"),
    MODULE("kindname.module"),
    RECORD_COMPONENT("kindname.record.component"),
    RECORD("kindname.record");


    /* JADX INFO: renamed from: ᩸ */
    public final String f28509;

    /* JADX INFO: renamed from: ֫ */
    public String m23915() {
        return "Kindname";
    }

    EnumC10306(String str) {
        this.f28509 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f28509;
    }

    @Override // p067l.InterfaceC11867
    /* JADX INFO: renamed from: ֫ */
    public String mo23916(Locale locale, InterfaceC13208 interfaceC13208) {
        return ((C16246) interfaceC13208).m37005(locale, C21466.m48631("compiler.misc.", toString()), new Object[0]);
    }
}
