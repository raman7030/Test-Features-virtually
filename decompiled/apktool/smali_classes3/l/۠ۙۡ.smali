.class public final Ll/۠ۙۡ;
.super Ll/ۖ᩹ۢ;
.source "S1VF"

# interfaces
.implements Ll/ۡ۬ۡ;
.implements Ll/ۖ۬ۡ;


# instance fields
.field public final ۧ:Ll/ۚۗۡ;


# direct methods
.method public constructor <init>(Ll/ۚۗۡ;)V
    .locals 1

    const/4 v0, 0x2

    .line 14
    invoke-direct {p0, v0}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 22
    iput-object p1, p0, Ll/۠ۙۡ;->ۧ:Ll/ۚۗۡ;

    return-void
.end method

.method public static ۧ(Ll/۫ۗۡ;)V
    .locals 2

    .line 66
    invoke-virtual {p0}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 68
    invoke-static {v0}, Ll/᩺ۤۡ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 96
    invoke-static {p0}, Ll/ܺۙۡ;->ۧ(Ll/۫ۗۡ;)Ll/ᩴ۬ۡ;

    move-result-object p0

    .line 98
    instance-of v1, p0, Ll/᩷ۙۡ;

    if-nez v1, :cond_0

    .line 100
    new-instance v1, Ll/᩷ۙۡ;

    invoke-direct {v1, v0}, Ll/᩷ۙۡ;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v1}, Ll/ᩴ۬ۡ;->֫(Ljava/lang/Object;)V

    return-void

    .line 102
    :cond_0
    check-cast p0, Ll/᩷ۙۡ;

    invoke-virtual {p0, v0}, Ll/᩷ۙۡ;->֫(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;)V
    .locals 2

    .line 26
    iget-object v0, p0, Ll/۠ۙۡ;->ۧ:Ll/ۚۗۡ;

    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۚۗۡ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܳ()Ljava/lang/String;

    move-result-object v0

    .line 113
    invoke-virtual {p1, v0}, Ll/᩶ۗۡ;->֫(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗۗۡ;Ll/ۤۗۡ;)V
    .locals 2

    .line 40
    sget-object v0, Ll/ܺۗ֡;->ۧ֫:Ll/ܺۗ֡;

    invoke-virtual {p2}, Ll/ۙۗۡ;->ۧ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ܺۗ֡;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܳ()Ljava/lang/String;

    move-result-object v0

    .line 113
    invoke-virtual {p1, v0}, Ll/᩶ۗۡ;->֫(Ljava/lang/Object;)V

    .line 42
    invoke-static {p2}, Ll/۠ۙۡ;->ۧ(Ll/۫ۗۡ;)V

    return-void

    .line 43
    :cond_0
    iget-object p1, p0, Ll/۠ۙۡ;->ۧ:Ll/ۚۗۡ;

    invoke-virtual {p2}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۚۗۡ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 44
    invoke-static {p2}, Ll/۠ۙۡ;->ۧ(Ll/۫ۗۡ;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۗۗۡ;Ll/۬ۗۡ;)V
    .locals 1

    .line 35
    iget-object p1, p0, Ll/۠ۙۡ;->ۧ:Ll/ۚۗۡ;

    invoke-virtual {p2}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۚۗۡ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 62
    invoke-virtual {p2}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    .line 96
    invoke-static {p2}, Ll/ܺۙۡ;->ۧ(Ll/۫ۗۡ;)Ll/ᩴ۬ۡ;

    move-result-object p2

    .line 98
    instance-of v0, p2, Ll/᩷ۙۡ;

    if-nez v0, :cond_0

    .line 100
    new-instance v0, Ll/᩷ۙۡ;

    invoke-direct {v0, p1}, Ll/᩷ۙۡ;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v0}, Ll/ᩴ۬ۡ;->֫(Ljava/lang/Object;)V

    return-void

    .line 102
    :cond_0
    check-cast p2, Ll/᩷ۙۡ;

    invoke-virtual {p2, p1}, Ll/᩷ۙۡ;->֫(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
