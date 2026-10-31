.class public final Ll/֫ܳ᩻;
.super Ll/֫ۜܳ;
.source "G7TD"


# instance fields
.field public final ۗ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const v0, 0x7f1205ec

    const v1, 0x7f0801e5

    .line 28
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    .line 29
    iput-object p1, p0, Ll/֫ܳ᩻;->ۗ:Ljava/lang/String;

    .line 31
    invoke-virtual {p0}, Ll/֫ۜܳ;->֫()V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 3

    .line 54
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    .line 55
    iget-object v1, p0, Ll/֫ܳ᩻;->ۗ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    const-string v2, "net"

    .line 56
    invoke-virtual {v0, v2}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v0

    check-cast v0, Ll/ۗۢ᩻;

    .line 59
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v1

    check-cast v1, Ll/ۗۢ᩻;

    .line 579
    iget-object v0, v0, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 60
    iget v0, v0, Ll/ۗ᩻᩻;->᩶:I

    .line 579
    iget-object v1, v1, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    .line 60
    iget v1, v1, Ll/ۗ᩻᩻;->᩶:I

    if-eq v0, v1, :cond_0

    .line 61
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const-string v1, "network_transfer_warn"

    const v2, 0x7f1206bb

    invoke-static {v2, v0, v1}, Ll/ۧۛܿ;->ۧ(ILl/ۗܺ᩷;Ljava/lang/String;)V

    :cond_0
    const v0, 0x7f1205ec

    .line 64
    invoke-static {p1, v0}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 6

    .line 69
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    .line 70
    iget-object v1, p0, Ll/֫ܳ᩻;->ۗ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    const-string v1, "net"

    .line 71
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v1

    .line 73
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v2

    check-cast v2, Ll/ۗۢ᩻;

    .line 450
    iget-object v3, v2, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    invoke-virtual {v3}, Ll/ۗ᩻᩻;->ܿ()Ljava/lang/String;

    move-result-object v3

    .line 74
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 75
    sget v4, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v4, Ll/֨۠ۢ;

    const-class v5, Ll/۟ܿ᩻;

    invoke-direct {v4, v5}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 76
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/֨۠ۢ;->ۧ(Ljava/util/List;)V

    .line 77
    invoke-virtual {v4, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    const-string v5, "ARG_STATELESS_VISITOR"

    .line 340
    invoke-virtual {v1}, Ll/ܰܺܳ;->֫()[B

    move-result-object v1

    invoke-virtual {v4, v5, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[B)V

    const-string v1, "ARG_STATELESS_VISITOR2"

    .line 355
    invoke-virtual {v2}, Ll/ܰܺܳ;->֫()[B

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[B)V

    const-string v1, "ARG_MSG_FROM"

    .line 80
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, v1, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "ARG_MSG_TO"

    .line 81
    invoke-virtual {v0}, Ll/ܽۢܳ;->֡()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, p1, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "targetPath"

    .line 82
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, p1, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "descPath"

    .line 83
    invoke-virtual {v4, p1, v3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    invoke-virtual {v4}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 4

    .line 36
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    .line 37
    iget-object v1, p0, Ll/֫ܳ᩻;->ۗ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "net"

    .line 38
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 39
    invoke-virtual {v0}, Ll/ܽۢܳ;->۫()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object p1

    instance-of v1, p1, Ll/ۚۡ᩻;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    check-cast p1, Ll/ۚۡ᩻;

    .line 44
    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    check-cast v0, Ll/ۚۡ᩻;

    .line 45
    invoke-virtual {p1}, Ll/ۚۡ᩻;->ܳ֫()I

    move-result v1

    invoke-virtual {v0}, Ll/ۚۡ᩻;->ܳ֫()I

    move-result v3

    if-ne v1, v3, :cond_1

    .line 46
    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_1
    return v2

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
