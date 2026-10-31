.class public final Ll/ۜᩴۖ;
.super Ll/ܳᩴۖ;
.source "X93U"


# instance fields
.field public final ܳ:Ljava/lang/reflect/Method;

.field public final ᩻:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2

    .line 2998
    invoke-direct/range {p0 .. p5}, Ll/ܳᩴۖ;-><init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    const-string p1, "get"

    const-string p5, "Bytes"

    .line 0
    invoke-static {p1, p2, p5}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    .line 2999
    invoke-static {p3, p1, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ۜᩴۖ;->ܳ:Ljava/lang/reflect/Method;

    const-string p1, "set"

    .line 0
    invoke-static {p1, p2, p5}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Class;

    .line 3000
    const-class p3, Ll/ۛۜۖ;

    aput-object p3, p2, v0

    .line 3001
    invoke-static {p4, p1, p2}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ۜᩴۖ;->᩻:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 2

    .line 3014
    instance-of v0, p2, Ll/ۛۜۖ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    .line 3016
    iget-object p2, p0, Ll/ۜᩴۖ;->᩻:Ljava/lang/reflect/Method;

    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 3018
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܳᩴۖ;->֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ܽ(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 3009
    iget-object v1, p0, Ll/ۜᩴۖ;->ܳ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
