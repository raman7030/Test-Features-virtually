.class public final Ll/ۨ᩺ܳ;
.super Ll/֫ۜܳ;
.source "K8BJ"


# instance fields
.field public final ۗ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const v0, 0x7f1205d6

    const v1, 0x7f080250

    .line 28
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    .line 29
    iput-object p1, p0, Ll/ۨ᩺ܳ;->ۗ:Ljava/lang/String;

    .line 30
    invoke-virtual {p0}, Ll/֫ۜܳ;->֫()V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 2

    .line 43
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    .line 44
    iget-object v1, p0, Ll/ۨ᩺ܳ;->ۗ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    const-string v1, "local"

    .line 45
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    const v0, 0x7f1205d6

    .line 46
    invoke-static {p1, v0}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 4

    .line 51
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "local"

    .line 52
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 53
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 377
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v1

    if-nez v1, :cond_0

    .line 54
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const v0, 0x7f120b8e

    invoke-static {v0, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 516
    invoke-virtual {p1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void

    .line 57
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    .line 58
    sget v2, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v2, Ll/֨۠ۢ;

    const-class v3, Ll/ۛ᩺ܳ;

    invoke-direct {v2, v3}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 59
    invoke-virtual {v2, v1}, Ll/֨۠ۢ;->ۧ(Ljava/util/List;)V

    .line 60
    invoke-virtual {v2, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    .line 330
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/֨۠ۢ;->֫(Ll/ܽ᩷ܳ;)V

    const-string p1, "targetPath"

    .line 62
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    invoke-virtual {v2}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 2

    .line 35
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    .line 36
    iget-object v1, p0, Ll/ۨ᩺ܳ;->ۗ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "local"

    .line 37
    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 38
    invoke-virtual {v0}, Ll/ܽۢܳ;->۫()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
