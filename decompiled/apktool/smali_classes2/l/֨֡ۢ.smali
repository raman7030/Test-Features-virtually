.class public final Ll/֨֡ۢ;
.super Ll/᩹֡ۢ;
.source "27BV"


# instance fields
.field public final synthetic ۜ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩶֡ۢ;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/ArrayList;)V
    .locals 0

    .line 220
    iput-object p4, p0, Ll/֨֡ۢ;->ۜ:Ljava/util/ArrayList;

    invoke-direct {p0, p1, p2, p3}, Ll/᩹֡ۢ;-><init>(Ll/᩶֡ۢ;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    return-void
.end method


# virtual methods
.method public final ᩳ()V
    .locals 12

    .line 226
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 227
    iget-object v1, p0, Ll/֨֡ۢ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-wide v7, v2

    const/4 v9, 0x0

    const/4 v10, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢۧ᩻;

    .line 228
    invoke-virtual {p0}, Ll/᩹֡ۢ;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    .line 231
    :cond_1
    invoke-virtual {v2}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v10, v10, 0x1

    .line 233
    invoke-virtual {v2}, Ll/ܺۘܳ;->۬()Z

    move-result v3

    if-nez v3, :cond_0

    .line 234
    invoke-virtual {v2}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 238
    invoke-virtual {v2}, Ll/ܺۘܳ;->۬()Z

    move-result v3

    if-nez v3, :cond_0

    .line 239
    invoke-virtual {v2}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v2

    add-long/2addr v7, v2

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    move-object v1, p0

    move v2, v9

    move v3, v10

    move-wide v4, v7

    .line 243
    invoke-virtual/range {v1 .. v6}, Ll/᩹֡ۢ;->֫(IIJZ)V

    .line 245
    new-instance v11, Ljava/util/LinkedList;

    invoke-direct {v11, v0}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 246
    :goto_1
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 247
    invoke-virtual {p0}, Ll/᩹֡ۢ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_2
    return-void

    .line 250
    :cond_4
    invoke-virtual {v11}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    const/4 v1, 0x1

    .line 413
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 251
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v7, v2

    move v8, v3

    move-wide v9, v4

    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    .line 252
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-eqz v2, :cond_6

    add-int/lit8 v8, v8, 0x1

    .line 254
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v2

    if-nez v2, :cond_5

    .line 255
    invoke-virtual {v11, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 259
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v2

    if-nez v2, :cond_5

    .line 260
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v1

    add-long/2addr v9, v1

    goto :goto_3

    :cond_7
    const/4 v6, 0x0

    move-object v1, p0

    move v2, v7

    move v3, v8

    move-wide v4, v9

    .line 264
    invoke-virtual/range {v1 .. v6}, Ll/᩹֡ۢ;->֫(IIJZ)V

    goto :goto_1

    :cond_8
    const/4 v6, 0x1

    move-object v1, p0

    .line 266
    invoke-virtual/range {v1 .. v6}, Ll/᩹֡ۢ;->֫(IIJZ)V

    return-void
.end method
