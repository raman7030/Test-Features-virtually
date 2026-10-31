.class public final Ll/ܰۘۖ;
.super Ljava/lang/Object;
.source "X93U"

# interfaces
.implements Ll/᩺ۘۖ;


# instance fields
.field public final ֫:Ljava/lang/reflect/Method;

.field public final ۧ:Ljava/lang/reflect/Method;

.field public final ܽ:Ljava/lang/reflect/Method;

.field public final ᩳ:Ll/ᩳۖۖ;


# direct methods
.method public constructor <init>(Ll/ᩳۖۖ;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 4

    .line 2154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2155
    iput-object p1, p0, Ll/ܰۘۖ;->ᩳ:Ll/ᩳۖۖ;

    const-string p1, "get"

    const-string v0, "Case"

    .line 0
    invoke-static {p1, p2, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    .line 2156
    invoke-static {p3, v1, v3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p3

    iput-object p3, p0, Ll/ܰۘۖ;->֫:Ljava/lang/reflect/Method;

    .line 0
    invoke-static {p1, p2, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p3, v2, [Ljava/lang/Class;

    .line 2157
    invoke-static {p4, p1, p3}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۘۖ;->ۧ:Ljava/lang/reflect/Method;

    const-string p1, "clear"

    .line 0
    invoke-static {p1, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Class;

    .line 2158
    invoke-static {p4, p1, p2}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۘۖ;->ܽ:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۘᩴۖ;)Ll/֡ۖۖ;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2178
    iget-object v1, p0, Ll/ܰۘۖ;->֫:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗᩴۖ;

    invoke-interface {p1}, Ll/ۗᩴۖ;->getNumber()I

    move-result p1

    if-lez p1, :cond_0

    .line 2180
    iget-object v0, p0, Ll/ܰۘۖ;->ᩳ:Ll/ᩳۖۖ;

    invoke-virtual {v0, p1}, Ll/ᩳۖۖ;->֫(I)Ll/֡ۖۖ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩶ۘۖ;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2197
    iget-object v1, p0, Ll/ܰۘۖ;->ܽ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ۧ(Ll/᩶ۘۖ;)Ll/֡ۖۖ;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2187
    iget-object v1, p0, Ll/ܰۘۖ;->ۧ:Ljava/lang/reflect/Method;

    invoke-static {v1, p1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗᩴۖ;

    invoke-interface {p1}, Ll/ۗᩴۖ;->getNumber()I

    move-result p1

    if-lez p1, :cond_0

    .line 2189
    iget-object v0, p0, Ll/ܰۘۖ;->ᩳ:Ll/ᩳۖۖ;

    invoke-virtual {v0, p1}, Ll/ᩳۖۖ;->֫(I)Ll/֡ۖۖ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ll/ۘᩴۖ;)Z
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    .line 2168
    iget-object v2, p0, Ll/ܰۘۖ;->֫:Ljava/lang/reflect/Method;

    invoke-static {v2, p1, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗᩴۖ;

    invoke-interface {p1}, Ll/ۗᩴۖ;->getNumber()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final ܽ(Ll/᩶ۘۖ;)Z
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    .line 2173
    iget-object v2, p0, Ll/ܰۘۖ;->ۧ:Ljava/lang/reflect/Method;

    invoke-static {v2, p1, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۗᩴۖ;

    invoke-interface {p1}, Ll/ۗᩴۖ;->getNumber()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method
