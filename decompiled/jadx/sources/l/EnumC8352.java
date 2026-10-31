package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۠ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8352 implements InterfaceC9995 {
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


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f25595;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m21945() {
        return "Kindname";
    }

    EnumC8352(String str) {
        this.f25595 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f25595;
    }

    @Override // l.InterfaceC9995
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo21946(Locale locale, InterfaceC11406 interfaceC11406) {
        return ((C14602) interfaceC11406).m34854(locale, C20094.m46315("compiler.misc.", toString()), new Object[0]);
    }
}
