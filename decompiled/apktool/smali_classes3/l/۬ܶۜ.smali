.class public final Ll/۬ܶۜ;
.super Ljava/lang/Object;
.source "A75O"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public final ۧ:J

.field public ܽ:J


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1160
    new-instance v0, Ljava/util/LinkedHashMap;

    const/high16 v1, 0x3f400000    # 0.75f

    const/4 v2, 0x1

    const/16 v3, 0x10

    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Ll/۬ܶۜ;->֫:Ljava/util/LinkedHashMap;

    const-wide/16 v0, 0x1

    const-wide/32 v2, 0x800000

    .line 1165
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Ll/۬ܶۜ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final ֫(IIJ)Landroid/graphics/Bitmap;
    .locals 17

    move-object/from16 v0, p0

    .line 1193
    iget-object v1, v0, Ll/۬ܶۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    move-object v6, v3

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۫ܶۜ;

    .line 1194
    invoke-static {v7}, Ll/۫ܶۜ;->ܽ(Ll/۫ܶۜ;)I

    move-result v8

    move/from16 v9, p1

    if-ne v8, v9, :cond_3

    invoke-static {v7}, Ll/۫ܶۜ;->ۧ(Ll/۫ܶۜ;)I

    move-result v8

    move/from16 v10, p2

    if-eq v8, v10, :cond_1

    goto :goto_0

    .line 1197
    :cond_1
    invoke-static {v7}, Ll/۫ܶۜ;->֫(Ll/۫ܶۜ;)J

    move-result-wide v11

    sub-long v11, v11, p3

    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    move-result-wide v11

    cmp-long v8, v11, v4

    if-ltz v8, :cond_2

    if-nez v8, :cond_0

    if-eqz v6, :cond_0

    .line 1198
    invoke-static {v7}, Ll/۫ܶۜ;->֫(Ll/۫ܶۜ;)J

    move-result-wide v13

    invoke-static {v6}, Ll/۫ܶۜ;->֫(Ll/۫ܶۜ;)J

    move-result-wide v15

    cmp-long v8, v13, v15

    if-gez v8, :cond_0

    :cond_2
    move-object v6, v7

    move-wide v4, v11

    goto :goto_0

    :cond_3
    move/from16 v10, p2

    goto :goto_0

    :cond_4
    if-nez v6, :cond_5

    return-object v3

    .line 1206
    :cond_5
    invoke-virtual {v1, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    return-object v1
.end method

.method public final ֫(Ll/۫ܶۜ;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1170
    iget-object v0, p0, Ll/۬ܶۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    return-object p1
.end method

.method public final ֫()V
    .locals 2

    .line 1210
    iget-object v0, p0, Ll/۬ܶۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    const-wide/16 v0, 0x0

    .line 1211
    iput-wide v0, p0, Ll/۬ܶۜ;->ܽ:J

    return-void
.end method

.method public final ֫(Ll/۫ܶۜ;Landroid/graphics/Bitmap;)V
    .locals 6

    .line 1175
    iget-object v0, p0, Ll/۬ܶۜ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 1177
    iget-wide v2, p0, Ll/۬ܶۜ;->ܽ:J

    .line 1219
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-long v4, p1

    sub-long/2addr v2, v4

    .line 1177
    iput-wide v2, p0, Ll/۬ܶۜ;->ܽ:J

    .line 1179
    :cond_0
    iget-wide v2, p0, Ll/۬ܶۜ;->ܽ:J

    .line 1219
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-long p1, p1

    add-long/2addr v2, p1

    .line 1179
    iput-wide v2, p0, Ll/۬ܶۜ;->ܽ:J

    .line 1180
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 1181
    :goto_0
    iget-wide v2, p0, Ll/۬ܶۜ;->ܽ:J

    iget-wide v4, p0, Ll/۬ܶۜ;->ۧ:J

    cmp-long p2, v2, v4

    if-lez p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 1182
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 1183
    iget-wide v2, p0, Ll/۬ܶۜ;->ܽ:J

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Bitmap;

    .line 1219
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    int-to-long v4, p2

    sub-long/2addr v2, v4

    .line 1183
    iput-wide v2, p0, Ll/۬ܶۜ;->ܽ:J

    .line 1184
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method
