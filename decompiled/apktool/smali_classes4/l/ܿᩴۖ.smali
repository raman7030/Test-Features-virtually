.class public final Ll/ܿᩴۖ;
.super Ljava/lang/Object;
.source "X93U"


# instance fields
.field public final ֫:Ljava/lang/reflect/Method;

.field public final ۜ:Ljava/lang/reflect/Method;

.field public final ۧ:Ljava/lang/reflect/Method;

.field public final ܳ:Ljava/lang/reflect/Method;

.field public final ܽ:Ljava/lang/reflect/Method;

.field public final ܿ:Ljava/lang/reflect/Method;

.field public final ᩳ:Ljava/lang/reflect/Method;

.field public final ᩻:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;ZZ)V
    .locals 6

    .line 2274
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "get"

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    .line 2275
    invoke-static {p2, v1, v3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Ll/ܿᩴۖ;->ᩳ:Ljava/lang/reflect/Method;

    .line 0
    invoke-static {v0, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Class;

    .line 2276
    invoke-static {p3, v3, v4}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    iput-object v3, p0, Ll/ܿᩴۖ;->ܿ:Ljava/lang/reflect/Method;

    .line 2277
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    const-string v3, "set"

    .line 0
    invoke-static {v3, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    aput-object v1, v4, v2

    .line 2278
    invoke-static {p3, v3, v4}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Ll/ܿᩴۖ;->ۜ:Ljava/lang/reflect/Method;

    const-string v1, "has"

    const/4 v3, 0x0

    if-eqz p6, :cond_0

    .line 0
    invoke-static {v1, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Class;

    .line 2279
    invoke-static {p2, v4, v5}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    iput-object v4, p0, Ll/ܿᩴۖ;->ܳ:Ljava/lang/reflect/Method;

    if-eqz p6, :cond_1

    .line 0
    invoke-static {v1, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p6

    new-array v1, v2, [Ljava/lang/Class;

    .line 2281
    invoke-static {p3, p6, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p6

    goto :goto_1

    :cond_1
    move-object p6, v3

    :goto_1
    iput-object p6, p0, Ll/ܿᩴۖ;->᩻:Ljava/lang/reflect/Method;

    const-string p6, "clear"

    .line 0
    invoke-static {p6, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p6, v2, [Ljava/lang/Class;

    .line 2282
    invoke-static {p3, p1, p6}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ܿᩴۖ;->ܽ:Ljava/lang/reflect/Method;

    const-string p1, "Case"

    if-eqz p5, :cond_2

    .line 0
    invoke-static {v0, p4, p1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p6

    new-array v1, v2, [Ljava/lang/Class;

    .line 2285
    invoke-static {p2, p6, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    goto :goto_2

    :cond_2
    move-object p2, v3

    .line 2286
    :goto_2
    iput-object p2, p0, Ll/ܿᩴۖ;->֫:Ljava/lang/reflect/Method;

    if-eqz p5, :cond_3

    .line 0
    invoke-static {v0, p4, p1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Class;

    .line 2289
    invoke-static {p3, p1, p2}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 2290
    :cond_3
    iput-object v3, p0, Ll/ܿᩴۖ;->ۧ:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static synthetic ֫(Ll/ܿᩴۖ;)Ljava/lang/reflect/Method;
    .locals 0

    .line 2257
    iget-object p0, p0, Ll/ܿᩴۖ;->ᩳ:Ljava/lang/reflect/Method;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2295
    iget-object v1, p0, Ll/ܿᩴۖ;->ᩳ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۘۖ;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2332
    iget-object v1, p0, Ll/ܿᩴۖ;->ܽ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    .line 2316
    iget-object p2, p0, Ll/ܿᩴۖ;->ۜ:Ljava/lang/reflect/Method;

    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۧ(Ll/ۘᩴۖ;)I
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2305
    iget-object v1, p0, Ll/ܿᩴۖ;->֫:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗᩴۖ;

    invoke-interface {p1}, Ll/ۗᩴۖ;->getNumber()I

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2300
    iget-object v1, p0, Ll/ܿᩴۖ;->ܿ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/᩶ۘۖ;)I
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2310
    iget-object v1, p0, Ll/ܿᩴۖ;->ۧ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗᩴۖ;

    invoke-interface {p1}, Ll/ۗᩴۖ;->getNumber()I

    move-result p1

    return p1
.end method

.method public final ܽ(Ll/ۘᩴۖ;)Z
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2321
    iget-object v1, p0, Ll/ܿᩴۖ;->ܳ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final ᩳ(Ll/᩶ۘۖ;)Z
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2326
    iget-object v1, p0, Ll/ܿᩴۖ;->᩻:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
