.class public final synthetic Ll/ۧۚܳ;
.super Ljava/lang/Object;
.source "W1YM"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ܽۢܳ;

.field public final synthetic ᩶:Ll/ۖۢܳ;

.field public final synthetic ᩸:Ljava/util/ArrayList;

.field public final synthetic ᩹:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۢܳ;Ll/ۖۢܳ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll/ۧۚܳ;->᩸:Ljava/util/ArrayList;

    iput-object p4, p0, Ll/ۧۚܳ;->᩹:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/ۧۚܳ;->᩶:Ll/ۖۢܳ;

    iput-object p1, p0, Ll/ۧۚܳ;->ۙ:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 65
    iget-object v0, p0, Ll/ۧۚܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤۢܳ;

    .line 66
    invoke-virtual {v2}, Ll/ۤۢܳ;->֫()V

    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Ll/ۧۚܳ;->᩹:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤۢܳ;

    invoke-virtual {v1}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 69
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۤۢܳ;

    invoke-virtual {v0}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 71
    iget-object v0, p0, Ll/ۧۚܳ;->᩶:Ll/ۖۢܳ;

    invoke-virtual {v0}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->᩺()Z

    move-result v1

    .line 72
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const v3, 0x7f1201c0

    if-eqz v1, :cond_1

    const v6, 0x7f1201bf

    goto :goto_1

    :cond_1
    const v6, 0x7f1201c0

    .line 73
    :goto_1
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    aput-object v7, v9, v2

    invoke-static {v6, v9}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const v3, 0x7f1201bf

    .line 74
    :goto_2
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v7

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v7, v8, v2

    invoke-static {v3, v8}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    goto :goto_3

    .line 76
    :cond_3
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 77
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    move-object v6, v2

    move-object v7, v3

    .line 79
    :goto_3
    new-instance v2, Ll/۟ۜᩳ;

    invoke-virtual {v0}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v8

    iget-object v3, p0, Ll/ۧۚܳ;->ۙ:Ll/ܽۢܳ;

    invoke-virtual {v3}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v9

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Ll/۟ۜᩳ;-><init>(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ll/ܽ᩷ܳ;Ll/ܽ᩷ܳ;)V

    if-nez v1, :cond_4

    .line 81
    invoke-virtual {v2}, Ll/۟ۜᩳ;->ܽ()V

    .line 83
    :cond_4
    invoke-virtual {v0}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-static {v0, v2}, Ll/֫᩷ᩳ;->֫(Lbin/mt/plus/Main;Ll/۟ۜᩳ;)V

    return-void
.end method
