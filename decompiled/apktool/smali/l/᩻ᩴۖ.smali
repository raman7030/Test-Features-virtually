.class public final Ll/᩻ᩴۖ;
.super Ll/ܳᩴۖ;
.source "X93U"


# instance fields
.field public final ܳ:Ljava/lang/reflect/Method;

.field public final ᩻:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1

    .line 3032
    invoke-direct/range {p0 .. p5}, Ll/ܳᩴۖ;-><init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 3034
    iget-object p1, p0, Ll/ܳᩴۖ;->ܿ:Ljava/lang/Class;

    const/4 p3, 0x0

    new-array p5, p3, [Ljava/lang/Class;

    const-string v0, "newBuilder"

    invoke-static {p1, v0, p5}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ᩴۖ;->᩻:Ljava/lang/reflect/Method;

    const-string p1, "get"

    const-string p5, "Builder"

    .line 0
    invoke-static {p1, p2, p5}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, p3, [Ljava/lang/Class;

    .line 3035
    invoke-static {p4, p1, p2}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ᩴۖ;->ܳ:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܳ֡ۖ;
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 3062
    iget-object v1, p0, Ll/᩻ᩴۖ;->᩻:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ֡ۖ;

    return-object v0
.end method

.method public final ֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 3

    .line 3042
    iget-object v0, p0, Ll/ܳᩴۖ;->ܿ:Ljava/lang/Class;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 3049
    iget-object v1, p0, Ll/᩻ᩴۖ;->᩻:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ֡ۖ;

    check-cast p2, Ll/᩻֡ۖ;

    .line 3050
    invoke-interface {v0, p2}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p2

    .line 3051
    invoke-interface {p2}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object p2

    .line 3057
    :goto_0
    invoke-super {p0, p1, p2}, Ll/ܳᩴۖ;->֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩳ(Ll/᩶ۘۖ;)Ll/ܳ֡ۖ;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 3067
    iget-object v1, p0, Ll/᩻ᩴۖ;->ܳ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ֡ۖ;

    return-object p1
.end method
