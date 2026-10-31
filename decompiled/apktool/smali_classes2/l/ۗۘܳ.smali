.class public final synthetic Ll/ۗۘܳ;
.super Ljava/lang/Object;
.source "OAYY"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 9

    .line 184
    invoke-static {}, Ll/ۡᩴܳ;->ۖ()Ll/ۜᩴܳ;

    move-result-object v0

    .line 185
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 186
    invoke-virtual {v0}, Ll/ۜᩴܳ;->ᩳ()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ll/ܽᩴܳ;

    .line 1006
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 186
    check-cast v2, [Ll/ܽᩴܳ;

    array-length v4, v2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v2, v5

    .line 187
    invoke-virtual {v6}, Ll/ܽᩴܳ;->᩻()Ll/ܿᩴܳ;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 189
    invoke-virtual {v7}, Ll/ܿᩴܳ;->ۧ()I

    move-result v7

    invoke-static {v7}, Ll/۫᩻᩻;->ܽ(I)Ll/ۗ᩻᩻;

    move-result-object v7

    if-nez v7, :cond_1

    .line 190
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 193
    :cond_0
    invoke-virtual {v6}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v7

    new-array v8, v3, [Ljava/lang/String;

    invoke-static {v7, v8}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v7

    .line 194
    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v7}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v7

    if-nez v7, :cond_1

    .line 195
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 199
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    .line 200
    new-instance v2, Ll/ۗ۫ܿ;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v0, v1}, Ll/ۗ۫ܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_3
    return-void
.end method
