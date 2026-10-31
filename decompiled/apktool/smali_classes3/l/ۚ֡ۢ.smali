.class public final Ll/ۚ֡ۢ;
.super Ll/᩹֡ۢ;
.source "27BV"


# instance fields
.field public final synthetic ۜ:Ll/ۢۧ᩻;


# direct methods
.method public constructor <init>(Ll/᩶֡ۢ;Ljava/lang/String;Ljava/util/LinkedHashMap;Ll/ۢۧ᩻;)V
    .locals 0

    .line 181
    iput-object p4, p0, Ll/ۚ֡ۢ;->ۜ:Ll/ۢۧ᩻;

    invoke-direct {p0, p1, p2, p3}, Ll/᩹֡ۢ;-><init>(Ll/᩶֡ۢ;Ljava/lang/String;Ljava/util/LinkedHashMap;)V

    return-void
.end method


# virtual methods
.method public final ᩳ()V
    .locals 11

    .line 187
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 188
    iget-object v1, p0, Ll/ۚ֡ۢ;->ۜ:Ll/ۢۧ᩻;

    invoke-virtual {v1}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-wide v4, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 190
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 191
    invoke-virtual {p0}, Ll/᩹֡ۢ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 194
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ᩵ܿ;

    const/4 v6, 0x1

    .line 413
    invoke-virtual {v1, v6}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v1

    .line 195
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v7, v2

    move v8, v3

    move-wide v9, v4

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 196
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v8, v8, 0x1

    .line 198
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v3

    if-nez v3, :cond_1

    .line 199
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 203
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v3

    if-nez v3, :cond_1

    .line 204
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2

    add-long/2addr v9, v2

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    move-object v1, p0

    move v2, v7

    move v3, v8

    move-wide v4, v9

    .line 208
    invoke-virtual/range {v1 .. v6}, Ll/᩹֡ۢ;->֫(IIJZ)V

    goto :goto_0

    :cond_4
    const/4 v6, 0x1

    move-object v1, p0

    .line 210
    invoke-virtual/range {v1 .. v6}, Ll/᩹֡ۢ;->֫(IIJZ)V

    return-void
.end method
