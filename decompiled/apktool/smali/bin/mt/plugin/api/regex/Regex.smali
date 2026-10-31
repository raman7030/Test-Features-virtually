.class public final Lbin/mt/plugin/api/regex/Regex;
.super Ljava/lang/Object;
.source "Regex.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkReplacementTemplate(Lbin/mt/plugin/api/regex/Pattern;Ljava/lang/String;)V
    .locals 1

    .line 53
    const-class v0, Ll/۫ܳ᩷;

    invoke-static {v0}, Lbin/mt/plugin/api/util/ServiceLoader;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ܳ᩷;

    invoke-interface {v0, p0, p1}, Ll/۫ܳ᩷;->checkReplacementTemplateImpl(Lbin/mt/plugin/api/regex/Pattern;Ljava/lang/String;)V

    return-void
.end method

.method public static compile(Ljava/lang/String;)Lbin/mt/plugin/api/regex/Pattern;
    .locals 1

    .line 28
    const-class v0, Ll/۫ܳ᩷;

    invoke-static {v0}, Lbin/mt/plugin/api/util/ServiceLoader;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ܳ᩷;

    invoke-interface {v0, p0}, Ll/۫ܳ᩷;->compileImpl(Ljava/lang/String;)Lbin/mt/plugin/api/regex/Pattern;

    move-result-object p0

    return-object p0
.end method

.method public static compile(Ljava/lang/String;I)Lbin/mt/plugin/api/regex/Pattern;
    .locals 1

    .line 40
    const-class v0, Ll/۫ܳ᩷;

    invoke-static {v0}, Lbin/mt/plugin/api/util/ServiceLoader;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ܳ᩷;

    invoke-interface {v0, p0, p1}, Ll/۫ܳ᩷;->compileImpl(Ljava/lang/String;I)Lbin/mt/plugin/api/regex/Pattern;

    move-result-object p0

    return-object p0
.end method
