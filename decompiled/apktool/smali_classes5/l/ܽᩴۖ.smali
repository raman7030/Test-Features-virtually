.class public final Ll/ܽᩴۖ;
.super Ll/ۧᩴۖ;
.source "X93U"


# instance fields
.field public final ܽ:Ljava/lang/reflect/Method;

.field public final ᩳ:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 3

    .line 3077
    invoke-direct {p0, p1, p2, p3}, Ll/ۧᩴۖ;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)V

    .line 3079
    iget-object p1, p0, Ll/ۧᩴۖ;->ۧ:Ljava/lang/Class;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    const-string v2, "newBuilder"

    invoke-static {p1, v2, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ܽᩴۖ;->ᩳ:Ljava/lang/reflect/Method;

    const-string p1, "get"

    const-string v1, "Builder"

    .line 0
    invoke-static {p1, p3, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Class;

    .line 3080
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v1, p3, v0

    .line 3081
    invoke-static {p2, p1, p3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ܽᩴۖ;->ܽ:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܳ֡ۖ;
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 3113
    iget-object v1, p0, Ll/ܽᩴۖ;->ᩳ:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ֡ۖ;

    return-object v0
.end method

.method public final ֫(Ll/᩶ۘۖ;I)Ll/ܳ֡ۖ;
    .locals 2

    .line 3119
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    iget-object p2, p0, Ll/ܽᩴۖ;->ܽ:Ljava/lang/reflect/Method;

    invoke-static {p2, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ֡ۖ;

    return-object p1
.end method

.method public final ֫(Ll/᩶ۘۖ;ILjava/lang/Object;)V
    .locals 3

    .line 3088
    iget-object v0, p0, Ll/ۧᩴۖ;->ۧ:Ljava/lang/Class;

    invoke-virtual {v0, p3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 3095
    iget-object v1, p0, Ll/ܽᩴۖ;->ᩳ:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ֡ۖ;

    check-cast p3, Ll/᩻֡ۖ;

    .line 3096
    invoke-interface {v0, p3}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p3

    .line 3097
    invoke-interface {p3}, Ll/ܳ֡ۖ;->build()Ll/᩻֡ۖ;

    move-result-object p3

    .line 3103
    :goto_0
    invoke-super {p0, p1, p2, p3}, Ll/ۧᩴۖ;->֫(Ll/᩶ۘۖ;ILjava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 3

    .line 3088
    iget-object v0, p0, Ll/ۧᩴۖ;->ۧ:Ljava/lang/Class;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 3095
    iget-object v1, p0, Ll/ܽᩴۖ;->ᩳ:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ֡ۖ;

    check-cast p2, Ll/᩻֡ۖ;

    .line 3096
    invoke-interface {v0, p2}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p2

    .line 3097
    invoke-interface {p2}, Ll/ܳ֡ۖ;->build()Ll/᩻֡ۖ;

    move-result-object p2

    .line 3108
    :goto_0
    invoke-super {p0, p1, p2}, Ll/ۧᩴۖ;->ۧ(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    return-void
.end method
