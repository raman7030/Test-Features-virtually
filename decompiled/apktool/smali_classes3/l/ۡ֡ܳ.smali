.class public final synthetic Ll/ۡ֡ܳ;
.super Ljava/lang/Object;
.source "PB7U"

# interfaces
.implements Ll/۟ۜܳ;


# instance fields
.field public final synthetic ᩶:Ll/ܽۢܳ;

.field public final synthetic ᩸:Ll/ۤۢܳ;

.field public final synthetic ᩹:Ll/ۖۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۢܳ;Ll/ۖۢܳ;Ll/ܽۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ֡ܳ;->᩸:Ll/ۤۢܳ;

    iput-object p2, p0, Ll/ۡ֡ܳ;->᩹:Ll/ۖۢܳ;

    iput-object p3, p0, Ll/ۡ֡ܳ;->᩶:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤۢܳ;)V
    .locals 12

    .line 49
    invoke-virtual {p1}, Ll/ۤۢܳ;->֫()V

    .line 50
    iget-object v0, p0, Ll/ۡ֡ܳ;->᩸:Ll/ۤۢܳ;

    invoke-virtual {v0}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 51
    invoke-virtual {p1}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 53
    iget-object v3, p0, Ll/ۡ֡ܳ;->᩹:Ll/ۖۢܳ;

    invoke-virtual {v3}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܽۢܳ;->᩺()Z

    move-result v4

    .line 54
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const v5, 0x7f1201c0

    if-eqz v4, :cond_0

    const v6, 0x7f1201bf

    goto :goto_0

    :cond_0
    const v6, 0x7f1201c0

    .line 55
    :goto_0
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x1

    new-array v8, v7, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v1, v8, v9

    invoke-static {v6, v8}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const v5, 0x7f1201bf

    .line 56
    :goto_1
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    new-array v6, v7, [Ljava/lang/Object;

    aput-object v2, v6, v9

    invoke-static {v5, v6}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 59
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    :goto_2
    move-object v8, v1

    move-object v9, v2

    .line 61
    new-instance v1, Ll/۟ۜᩳ;

    invoke-virtual {v0}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v6

    invoke-virtual {p1}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v7

    invoke-virtual {v3}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v10

    iget-object p1, p0, Ll/ۡ֡ܳ;->᩶:Ll/ܽۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v11

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, Ll/۟ۜᩳ;-><init>(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ll/ܽ᩷ܳ;Ll/ܽ᩷ܳ;)V

    if-nez v4, :cond_3

    .line 63
    invoke-virtual {v1}, Ll/۟ۜᩳ;->ܽ()V

    .line 65
    :cond_3
    invoke-virtual {v3}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object p1

    invoke-static {p1, v1}, Ll/۫ܶܽ;->֫(Ll/ܽۢܳ;Ll/۟ۜᩳ;)V

    return-void
.end method
