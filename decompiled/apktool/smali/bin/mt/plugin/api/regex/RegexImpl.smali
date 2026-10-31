.class public Lbin/mt/plugin/api/regex/RegexImpl;
.super Ljava/lang/Object;
.source "RegexImpl.java"

# interfaces
.implements Ll/۫ܳ᩷;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static register()V
    .locals 2

    .line 10
    new-instance v0, Lbin/mt/plugin/api/regex/RegexImpl;

    invoke-direct {v0}, Lbin/mt/plugin/api/regex/RegexImpl;-><init>()V

    const-class v1, Ll/۫ܳ᩷;

    invoke-static {v1, v0}, Lbin/mt/plugin/api/util/ServiceLoader;->register(Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public checkReplacementTemplateImpl(Lbin/mt/plugin/api/regex/Pattern;Ljava/lang/String;)V
    .locals 0

    .line 25
    check-cast p1, Ll/ۨۘܽ;

    invoke-static {p1, p2}, Ll/ܰۘܽ;->֫(Ll/ۨۘܽ;Ljava/lang/String;)V

    return-void
.end method

.method public compileImpl(Ljava/lang/String;)Lbin/mt/plugin/api/regex/Pattern;
    .locals 0

    .line 15
    invoke-static {p1}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object p1

    return-object p1
.end method

.method public compileImpl(Ljava/lang/String;I)Lbin/mt/plugin/api/regex/Pattern;
    .locals 0

    .line 20
    invoke-static {p2, p1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object p1

    return-object p1
.end method
