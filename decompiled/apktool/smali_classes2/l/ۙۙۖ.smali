.class public final Ll/ۙۙۖ;
.super Ljava/lang/Object;
.source "25VK"


# direct methods
.method public static ֫(Ll/ۚ᩹ۖ;)V
    .locals 8

    .line 78
    iget-object v0, p0, Ll/ۚ᩹ۖ;->᩷:Ljava/util/ArrayList;

    .line 79
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ۚ᩹ۖ;->᩷:Ljava/util/ArrayList;

    .line 80
    new-instance v1, Ll/᩶ۙۖ;

    invoke-direct {v1}, Ll/֨᩹ۖ;-><init>()V

    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ᩹ۖ;

    .line 87
    invoke-virtual {v2, v1}, Ll/ۙ᩹ۖ;->֫(Ll/֨᩹ۖ;)Ll/ۙ᩹ۖ;

    move-result-object v3

    .line 89
    iget-object v4, v2, Ll/ۙ᩹ۖ;->ܽ:Ll/۬᩶ۖ;

    invoke-virtual {v4}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v4

    const/4 v5, 0x0

    :goto_1
    iget-object v6, v2, Ll/ۙ᩹ۖ;->֫:Ll/۬᩶ۖ;

    const/4 v7, 0x1

    if-eq v4, v6, :cond_7

    .line 88
    invoke-static {v4}, Ll/ܶۙۖ;->֫(Ll/֫ۙۖ;)Z

    move-result v6

    if-eqz v6, :cond_3

    if-nez v5, :cond_6

    .line 92
    invoke-virtual {v4}, Ll/֫ۙۖ;->ܳ()Ll/֫ۙۖ;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 93
    iget-object v6, v5, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v7, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-eq v6, v7, :cond_2

    .line 44
    :cond_1
    new-instance v5, Ll/۬᩶ۖ;

    invoke-direct {v5}, Ll/۬᩶ۖ;-><init>()V

    .line 95
    iget-object v6, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v6, v4, v5}, Ll/ܽۙۖ;->ۧ(Ll/֫ۙۖ;Ll/֫ۙۖ;)V

    .line 97
    :cond_2
    check-cast v5, Ll/۬᩶ۖ;

    iput-object v5, v3, Ll/ۙ᩹ۖ;->ܽ:Ll/۬᩶ۖ;

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    if-ne v5, v7, :cond_6

    .line 104
    invoke-virtual {v4}, Ll/֫ۙۖ;->ܳ()Ll/֫ۙۖ;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 105
    iget-object v6, v5, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v7, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-eq v6, v7, :cond_5

    .line 44
    :cond_4
    new-instance v5, Ll/۬᩶ۖ;

    invoke-direct {v5}, Ll/۬᩶ۖ;-><init>()V

    .line 107
    iget-object v6, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v6, v4, v5}, Ll/ܽۙۖ;->ۧ(Ll/֫ۙۖ;Ll/֫ۙۖ;)V

    .line 110
    :cond_5
    check-cast v5, Ll/۬᩶ۖ;

    iput-object v5, v3, Ll/ۙ᩹ۖ;->֫:Ll/۬᩶ۖ;

    .line 111
    iget-object v5, p0, Ll/ۚ᩹ۖ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    invoke-virtual {v2, v1}, Ll/ۙ᩹ۖ;->֫(Ll/֨᩹ۖ;)Ll/ۙ᩹ۖ;

    move-result-object v3

    const/4 v5, 0x0

    .line 89
    :cond_6
    :goto_2
    invoke-virtual {v4}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v4

    goto :goto_1

    :cond_7
    if-ne v5, v7, :cond_0

    .line 117
    iput-object v6, v3, Ll/ۙ᩹ۖ;->֫:Ll/۬᩶ۖ;

    .line 118
    iget-object v2, p0, Ll/ۚ᩹ۖ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_8
    return-void
.end method
