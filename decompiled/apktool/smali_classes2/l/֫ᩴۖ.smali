.class public final Ll/֫ᩴۖ;
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

.field public final ᩷:Ljava/lang/reflect/Method;

.field public final ᩻:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 7

    .line 2507
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "get"

    const-string v1, "List"

    .line 0
    invoke-static {v0, p3, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    .line 2508
    invoke-static {p1, v2, v4}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    iput-object v2, p0, Ll/֫ᩴۖ;->ܿ:Ljava/lang/reflect/Method;

    .line 0
    invoke-static {v0, p3, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Class;

    .line 2509
    invoke-static {p2, v1, v2}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Ll/֫ᩴۖ;->ܳ:Ljava/lang/reflect/Method;

    .line 0
    invoke-static {v0, p3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/Class;

    .line 2510
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v3

    invoke-static {p1, v1, v4}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Ll/֫ᩴۖ;->᩻:Ljava/lang/reflect/Method;

    .line 0
    invoke-static {v0, p3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v6, v2, [Ljava/lang/Class;

    aput-object v5, v6, v3

    .line 2512
    invoke-static {p2, v4, v6}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    iput-object v4, p0, Ll/֫ᩴۖ;->ۜ:Ljava/lang/reflect/Method;

    .line 2513
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    const-string v4, "set"

    .line 0
    invoke-static {v4, p3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Class;

    aput-object v5, v6, v3

    aput-object v1, v6, v2

    .line 2515
    invoke-static {p2, v4, v6}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    iput-object v4, p0, Ll/֫ᩴۖ;->᩷:Ljava/lang/reflect/Method;

    const-string v4, "add"

    .line 0
    invoke-static {v4, p3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v2, v2, [Ljava/lang/Class;

    aput-object v1, v2, v3

    .line 2516
    invoke-static {p2, v4, v2}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Ll/֫ᩴۖ;->֫:Ljava/lang/reflect/Method;

    const-string v1, "Count"

    .line 0
    invoke-static {v0, p3, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v4, v3, [Ljava/lang/Class;

    .line 2517
    invoke-static {p1, v2, v4}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/֫ᩴۖ;->ܽ:Ljava/lang/reflect/Method;

    .line 0
    invoke-static {v0, p3, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Ljava/lang/Class;

    .line 2518
    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/֫ᩴۖ;->ᩳ:Ljava/lang/reflect/Method;

    const-string p1, "clear"

    .line 0
    invoke-static {p1, p3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p3, v3, [Ljava/lang/Class;

    .line 2519
    invoke-static {p2, p1, p3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/֫ᩴۖ;->ۧ:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static synthetic ֫(Ll/֫ᩴۖ;)Ljava/lang/reflect/Method;
    .locals 0

    .line 2492
    iget-object p0, p0, Ll/֫ᩴۖ;->᩻:Ljava/lang/reflect/Method;

    return-object p0
.end method


# virtual methods
.method public final ֫(ILl/ۘᩴۖ;)Ljava/lang/Object;
    .locals 2

    .line 2534
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iget-object p1, p0, Ll/֫ᩴۖ;->᩻:Ljava/lang/reflect/Method;

    invoke-static {p1, p2, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2524
    iget-object v1, p0, Ll/֫ᩴۖ;->ܿ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۘۖ;I)Ljava/lang/Object;
    .locals 2

    .line 2539
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    iget-object p2, p0, Ll/֫ᩴۖ;->ۜ:Ljava/lang/reflect/Method;

    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۘۖ;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2568
    iget-object v1, p0, Ll/֫ᩴۖ;->ۧ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/᩶ۘۖ;ILjava/lang/Object;)V
    .locals 2

    .line 2546
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 p2, 0x1

    aput-object p3, v0, p2

    iget-object p2, p0, Ll/֫ᩴۖ;->᩷:Ljava/lang/reflect/Method;

    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    .line 2552
    iget-object p2, p0, Ll/֫ᩴۖ;->֫:Ljava/lang/reflect/Method;

    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۧ(Ll/ۘᩴۖ;)I
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2557
    iget-object v1, p0, Ll/֫ᩴۖ;->ܽ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2529
    iget-object v1, p0, Ll/֫ᩴۖ;->ܳ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/᩶ۘۖ;)I
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2562
    iget-object v1, p0, Ll/֫ᩴۖ;->ᩳ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method
