.class public final Ll/ᩳᩴۖ;
.super Ll/ܳᩴۖ;
.source "X93U"


# instance fields
.field public ۜ:Ljava/lang/reflect/Method;

.field public final ۡ:Z

.field public ۢ:Ljava/lang/reflect/Method;

.field public final ܳ:Ll/ۢۖۖ;

.field public final ܺ:Ljava/lang/reflect/Method;

.field public ᩷:Ljava/lang/reflect/Method;

.field public final ᩻:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 4

    .line 2820
    invoke-direct/range {p0 .. p5}, Ll/ܳᩴۖ;-><init>(Ll/֡ۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 2822
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۚ()Ll/ۢۖۖ;

    move-result-object p5

    iput-object p5, p0, Ll/ᩳᩴۖ;->ܳ:Ll/ۢۖۖ;

    .line 2824
    iget-object p5, p0, Ll/ܳᩴۖ;->ܿ:Ljava/lang/Class;

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Ll/ۖۖۖ;

    aput-object v3, v1, v2

    const-string v3, "valueOf"

    invoke-static {p5, v3, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p5

    iput-object p5, p0, Ll/ᩳᩴۖ;->ܺ:Ljava/lang/reflect/Method;

    .line 2825
    iget-object p5, p0, Ll/ܳᩴۖ;->ܿ:Ljava/lang/Class;

    const-string v1, "getValueDescriptor"

    new-array v3, v2, [Ljava/lang/Class;

    invoke-static {p5, v1, v3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p5

    iput-object p5, p0, Ll/ᩳᩴۖ;->᩻:Ljava/lang/reflect/Method;

    .line 2827
    invoke-virtual {p1}, Ll/֡ۖۖ;->ۨ()Z

    move-result p1

    xor-int/lit8 p5, p1, 0x1

    iput-boolean p5, p0, Ll/ᩳᩴۖ;->ۡ:Z

    if-nez p1, :cond_0

    const-string p1, "get"

    const-string p5, "Value"

    .line 0
    invoke-static {p1, p2, p5}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/Class;

    .line 2829
    invoke-static {p3, v1, v3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    iput-object p3, p0, Ll/ᩳᩴۖ;->ۜ:Ljava/lang/reflect/Method;

    .line 0
    invoke-static {p1, p2, p5}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p3, v2, [Ljava/lang/Class;

    .line 2830
    invoke-static {p4, p1, p3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳᩴۖ;->᩷:Ljava/lang/reflect/Method;

    const-string p1, "set"

    .line 0
    invoke-static {p1, p2, p5}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Class;

    .line 2831
    sget-object p3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object p3, p2, v2

    invoke-static {p4, p1, p2}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳᩴۖ;->ۢ:Ljava/lang/reflect/Method;

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 2

    .line 2847
    iget-boolean v0, p0, Ll/ᩳᩴۖ;->ۡ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2848
    iget-object v0, p0, Ll/ᩳᩴۖ;->ۜ:Ljava/lang/reflect/Method;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 2849
    iget-object v0, p0, Ll/ᩳᩴۖ;->ܳ:Ll/ۢۖۖ;

    invoke-virtual {v0, p1}, Ll/ۢۖۖ;->ۧ(I)Ll/ۖۖۖ;

    move-result-object p1

    return-object p1

    .line 2374
    :cond_0
    iget-object v0, p0, Ll/ܳᩴۖ;->ܽ:Ll/ܿᩴۖ;

    invoke-virtual {v0, p1}, Ll/ܿᩴۖ;->֫(Ll/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    .line 2851
    iget-object v1, p0, Ll/ᩳᩴۖ;->᩻:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 3

    .line 2865
    iget-boolean v0, p0, Ll/ᩳᩴۖ;->ۡ:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 2867
    check-cast p2, Ll/ۖۖۖ;

    .line 2868
    invoke-virtual {p2}, Ll/ۖۖۖ;->getNumber()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p2, v0, v1

    iget-object p2, p0, Ll/ᩳᩴۖ;->ۢ:Ljava/lang/reflect/Method;

    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-array v0, v2, [Ljava/lang/Object;

    aput-object p2, v0, v1

    .line 2871
    iget-object p2, p0, Ll/ᩳᩴۖ;->ܺ:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    invoke-static {p2, v1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-super {p0, p1, p2}, Ll/ܳᩴۖ;->֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;
    .locals 2

    .line 2856
    iget-boolean v0, p0, Ll/ᩳᩴۖ;->ۡ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2857
    iget-object v0, p0, Ll/ᩳᩴۖ;->᩷:Ljava/lang/reflect/Method;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 2858
    iget-object v0, p0, Ll/ᩳᩴۖ;->ܳ:Ll/ۢۖۖ;

    invoke-virtual {v0, p1}, Ll/ۢۖۖ;->ۧ(I)Ll/ۖۖۖ;

    move-result-object p1

    return-object p1

    .line 2379
    :cond_0
    iget-object v0, p0, Ll/ܳᩴۖ;->ܽ:Ll/ܿᩴۖ;

    invoke-virtual {v0, p1}, Ll/ܿᩴۖ;->ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    .line 2860
    iget-object v1, p0, Ll/ᩳᩴۖ;->᩻:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
