.class public final synthetic Ll/᩷֡ܳ;
.super Ljava/lang/Object;
.source "P98B"

# interfaces
.implements Ll/ᩴܺܳ;
.implements Ll/۟ۜܳ;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩷֡ܳ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩷֡ܳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩷֡ܳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۤۢܳ;)V
    .locals 13

    iget-object v0, p0, Ll/᩷֡ܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۤۢܳ;

    iget-object v1, p0, Ll/᩷֡ܳ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ۖۢܳ;

    iget-object v2, p0, Ll/᩷֡ܳ;->᩶:Ljava/lang/Object;

    check-cast v2, Ll/ܽۢܳ;

    .line 49
    invoke-virtual {p1}, Ll/ۤۢܳ;->֫()V

    .line 50
    invoke-virtual {v0}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 51
    invoke-virtual {p1}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 53
    invoke-virtual {v1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܽۢܳ;->᩺()Z

    move-result v5

    .line 54
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const v6, 0x7f1201c0

    if-eqz v5, :cond_0

    const v7, 0x7f1201bf

    goto :goto_0

    :cond_0
    const v7, 0x7f1201c0

    .line 55
    :goto_0
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v3, v9, v10

    invoke-static {v7, v9}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    const v6, 0x7f1201bf

    .line 56
    :goto_1
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    new-array v7, v8, [Ljava/lang/Object;

    aput-object v4, v7, v10

    invoke-static {v6, v7}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 59
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    :goto_2
    move-object v9, v3

    move-object v10, v4

    .line 61
    new-instance v3, Ll/۟ۜᩳ;

    invoke-virtual {v0}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v7

    invoke-virtual {p1}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v8

    invoke-virtual {v1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v11

    invoke-virtual {v2}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v12

    move-object v6, v3

    invoke-direct/range {v6 .. v12}, Ll/۟ۜᩳ;-><init>(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ll/ܽ᩷ܳ;Ll/ܽ᩷ܳ;)V

    if-nez v5, :cond_3

    .line 63
    invoke-virtual {v3}, Ll/۟ۜᩳ;->ܽ()V

    .line 65
    :cond_3
    invoke-virtual {v1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object p1

    invoke-static {p1, v3}, Ll/۟۠ܽ;->֫(Ll/ܽۢܳ;Ll/۟ۜᩳ;)V

    return-void
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 4

    iget-object v0, p0, Ll/᩷֡ܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ᩳۜܳ;

    iget-object v1, p0, Ll/᩷֡ܳ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ۛ֨ܿ;

    iget-object v2, p0, Ll/᩷֡ܳ;->᩶:Ljava/lang/Object;

    check-cast v2, Ll/ۛ֡ܿ;

    const/16 v3, 0x1388

    .line 91
    invoke-static {v0, v3}, Ll/ۢۘܳ;->֫(Ll/ᩳۜܳ;I)V

    const/4 v0, 0x0

    .line 68
    invoke-virtual {v1, v2, p1, v0}, Ll/ۛ֨ܿ;->֫(Ll/ۛ֡ܿ;Ll/ܶ᩵ܿ;Z)V

    return-void
.end method
