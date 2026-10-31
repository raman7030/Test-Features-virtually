.class public abstract Ll/ۙ᩵֫;
.super Ljava/lang/Object;
.source "B8N9"


# static fields
.field public static final ֫:Ll/ۙ᩵֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 966
    new-instance v0, Ll/᩸᩵֫;

    .line 967
    invoke-direct {v0}, Ll/ۙ᩵֫;-><init>()V

    .line 966
    sput-object v0, Ll/ۙ᩵֫;->֫:Ll/ۙ᩵֫;

    const/4 v0, 0x0

    .line 1381
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 1382
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x2

    .line 1383
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1001
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 10

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto/16 :goto_3

    .line 1312
    :cond_0
    instance-of v1, p1, Ll/ۙ᩵֫;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto/16 :goto_4

    .line 1315
    :cond_1
    check-cast p1, Ll/ۙ᩵֫;

    .line 1316
    invoke-virtual {p1}, Ll/ۙ᩵֫;->ۧ()I

    move-result v1

    invoke-virtual {p0}, Ll/ۙ᩵֫;->ۧ()I

    move-result v3

    if-ne v1, v3, :cond_b

    invoke-virtual {p1}, Ll/ۙ᩵֫;->֫()I

    move-result v1

    invoke-virtual {p0}, Ll/ۙ᩵֫;->֫()I

    move-result v3

    if-eq v1, v3, :cond_2

    goto/16 :goto_4

    .line 1319
    :cond_2
    new-instance v1, Ll/᩶᩵֫;

    invoke-direct {v1}, Ll/᩶᩵֫;-><init>()V

    .line 1320
    new-instance v3, Ll/᩹᩵֫;

    invoke-direct {v3}, Ll/᩹᩵֫;-><init>()V

    .line 1321
    new-instance v4, Ll/᩶᩵֫;

    invoke-direct {v4}, Ll/᩶᩵֫;-><init>()V

    .line 1322
    new-instance v5, Ll/᩹᩵֫;

    invoke-direct {v5}, Ll/᩹᩵֫;-><init>()V

    const/4 v6, 0x0

    .line 1323
    :goto_0
    invoke-virtual {p0}, Ll/ۙ᩵֫;->ۧ()I

    move-result v7

    if-ge v6, v7, :cond_4

    const-wide/16 v7, 0x0

    .line 1097
    invoke-virtual {p0, v6, v1, v7, v8}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v9

    invoke-virtual {p1, v6, v4, v7, v8}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v7

    .line 1324
    invoke-virtual {v9, v7}, Ll/᩶᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    .line 1328
    :goto_1
    invoke-virtual {p0}, Ll/ۙ᩵֫;->֫()I

    move-result v4

    if-ge v1, v4, :cond_6

    .line 1329
    invoke-virtual {p0, v1, v3, v0}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object v4

    .line 1330
    invoke-virtual {p1, v1, v5, v0}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object v6

    invoke-virtual {v4, v6}, Ll/᩹᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1336
    :cond_6
    invoke-virtual {p0, v0}, Ll/ۙ᩵֫;->֫(Z)I

    move-result v1

    .line 1337
    invoke-virtual {p1, v0}, Ll/ۙ᩵֫;->֫(Z)I

    move-result v3

    if-eq v1, v3, :cond_7

    goto :goto_4

    .line 1340
    :cond_7
    invoke-virtual {p0, v0}, Ll/ۙ᩵֫;->ۧ(Z)I

    move-result v3

    .line 1341
    invoke-virtual {p1, v0}, Ll/ۙ᩵֫;->ۧ(Z)I

    move-result v4

    if-eq v3, v4, :cond_8

    goto :goto_4

    :cond_8
    :goto_2
    if-eq v1, v3, :cond_a

    .line 1346
    invoke-virtual {p0, v1, v2, v0}, Ll/ۙ᩵֫;->֫(IIZ)I

    move-result v4

    .line 1348
    invoke-virtual {p1, v1, v2, v0}, Ll/ۙ᩵֫;->֫(IIZ)I

    move-result v1

    if-eq v4, v1, :cond_9

    goto :goto_4

    :cond_9
    move v1, v4

    goto :goto_2

    :cond_a
    :goto_3
    return v0

    :cond_b
    :goto_4
    return v2
.end method

.method public hashCode()I
    .locals 7

    .line 1360
    new-instance v0, Ll/᩶᩵֫;

    invoke-direct {v0}, Ll/᩶᩵֫;-><init>()V

    .line 1361
    new-instance v1, Ll/᩹᩵֫;

    invoke-direct {v1}, Ll/᩹᩵֫;-><init>()V

    .line 1363
    invoke-virtual {p0}, Ll/ۙ᩵֫;->ۧ()I

    move-result v2

    add-int/lit16 v2, v2, 0xd9

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1364
    :goto_0
    invoke-virtual {p0}, Ll/ۙ᩵֫;->ۧ()I

    move-result v5

    if-ge v4, v5, :cond_0

    mul-int/lit8 v2, v2, 0x1f

    const-wide/16 v5, 0x0

    .line 1097
    invoke-virtual {p0, v4, v0, v5, v6}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v5

    .line 1365
    invoke-virtual {v5}, Ll/᩶᩵֫;->hashCode()I

    move-result v5

    add-int/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    mul-int/lit8 v2, v2, 0x1f

    .line 1367
    invoke-virtual {p0}, Ll/ۙ᩵֫;->֫()I

    move-result v0

    add-int/2addr v0, v2

    const/4 v2, 0x0

    .line 1368
    :goto_1
    invoke-virtual {p0}, Ll/ۙ᩵֫;->֫()I

    move-result v4

    const/4 v5, 0x1

    if-ge v2, v4, :cond_1

    mul-int/lit8 v0, v0, 0x1f

    .line 1369
    invoke-virtual {p0, v2, v1, v5}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩹᩵֫;->hashCode()I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 1372
    :cond_1
    invoke-virtual {p0, v5}, Ll/ۙ᩵֫;->֫(Z)I

    move-result v1

    :goto_2
    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    .line 1374
    invoke-virtual {p0, v1, v3, v5}, Ll/ۙ᩵֫;->֫(IIZ)I

    move-result v1

    goto :goto_2

    :cond_2
    return v0
.end method

.method public abstract ֫()I
.end method

.method public ֫(IIZ)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    if-eq p2, v0, :cond_2

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    .line 1030
    invoke-virtual {p0, p3}, Ll/ۙ᩵֫;->ۧ(Z)I

    move-result p2

    if-ne p1, p2, :cond_0

    .line 1031
    invoke-virtual {p0, p3}, Ll/ۙ᩵֫;->֫(Z)I

    move-result p1

    return p1

    :cond_0
    add-int/2addr p1, v0

    return p1

    .line 1034
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    return p1

    .line 1024
    :cond_3
    invoke-virtual {p0, p3}, Ll/ۙ᩵֫;->ۧ(Z)I

    move-result p2

    if-ne p1, p2, :cond_4

    const/4 p1, -0x1

    return p1

    :cond_4
    add-int/2addr p1, v0

    return p1
.end method

.method public final ֫(ILl/᩹᩵֫;Ll/᩶᩵֫;IZ)I
    .locals 3

    const/4 v0, 0x0

    .line 1275
    invoke-virtual {p0, p1, p2, v0}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object p2

    .line 1132
    iget p2, p2, Ll/᩹᩵֫;->᩻:I

    const-wide/16 v0, 0x0

    .line 1097
    invoke-virtual {p0, p2, p3, v0, v1}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object v2

    .line 1133
    iget v2, v2, Ll/᩶᩵֫;->ۜ:I

    if-ne v2, p1, :cond_1

    .line 1134
    invoke-virtual {p0, p2, p4, p5}, Ll/ۙ᩵֫;->֫(IIZ)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    .line 1097
    :cond_0
    invoke-virtual {p0, p1, p3, v0, v1}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    move-result-object p1

    .line 1138
    iget p1, p1, Ll/᩶᩵֫;->ᩳ:I

    return p1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public abstract ֫(Ljava/lang/Object;)I
.end method

.method public ֫(Z)I
    .locals 0

    .line 1086
    invoke-virtual {p0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/᩶᩵֫;Ll/᩹᩵֫;IJ)Landroid/util/Pair;
    .locals 8

    const-wide/16 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    .line 1202
    invoke-virtual/range {v0 .. v7}, Ll/ۙ᩵֫;->֫(Ll/᩶᩵֫;Ll/᩹᩵֫;IJJ)Landroid/util/Pair;

    move-result-object p1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public final ֫(Ll/᩶᩵֫;Ll/᩹᩵֫;IJJ)Landroid/util/Pair;
    .locals 5

    .line 1229
    invoke-virtual {p0}, Ll/ۙ᩵֫;->ۧ()I

    move-result v0

    invoke-static {p3, v0}, Ll/᩺֡֫;->֫(II)V

    .line 1230
    invoke-virtual {p0, p3, p1, p6, p7}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    const-wide p6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p4, p6

    if-nez p3, :cond_0

    .line 330
    iget-wide p4, p1, Ll/᩶᩵֫;->֫:J

    cmp-long p3, p4, p6

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1237
    :cond_0
    iget p3, p1, Ll/᩶᩵֫;->ᩳ:I

    const/4 v0, 0x0

    .line 1275
    invoke-virtual {p0, p3, p2, v0}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    .line 1239
    :goto_0
    iget v1, p1, Ll/᩶᩵֫;->ۜ:I

    if-ge p3, v1, :cond_1

    iget-wide v1, p2, Ll/᩹᩵֫;->ܿ:J

    cmp-long v3, v1, p4

    if-eqz v3, :cond_1

    add-int/lit8 v1, p3, 0x1

    .line 1275
    invoke-virtual {p0, v1, p2, v0}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object v2

    .line 1241
    iget-wide v2, v2, Ll/᩹᩵֫;->ܿ:J

    cmp-long v4, v2, p4

    if-gtz v4, :cond_1

    move p3, v1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 1244
    invoke-virtual {p0, p3, p2, p1}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    .line 1245
    iget-wide v0, p2, Ll/᩹᩵֫;->ܿ:J

    sub-long/2addr p4, v0

    .line 1247
    iget-wide v0, p2, Ll/᩹᩵֫;->ۧ:J

    cmp-long p1, v0, p6

    if-eqz p1, :cond_2

    const-wide/16 p6, 0x1

    sub-long/2addr v0, p6

    .line 1248
    invoke-static {p4, p5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p4

    :cond_2
    const-wide/16 p6, 0x0

    .line 1251
    invoke-static {p6, p7, p4, p5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p3

    .line 1252
    iget-object p1, p2, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1252
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public abstract ֫(I)Ljava/lang/Object;
.end method

.method public abstract ֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;
.end method

.method public abstract ֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;
.end method

.method public ֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;
    .locals 1

    .line 1263
    invoke-virtual {p0, p1}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILl/᩶᩵֫;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 1097
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    return-void
.end method

.method public abstract ۧ()I
.end method

.method public ۧ(IIZ)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p2, :cond_3

    if-eq p2, v0, :cond_2

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    .line 1057
    invoke-virtual {p0, p3}, Ll/ۙ᩵֫;->֫(Z)I

    move-result p2

    if-ne p1, p2, :cond_0

    .line 1058
    invoke-virtual {p0, p3}, Ll/ۙ᩵֫;->ۧ(Z)I

    move-result p1

    return p1

    :cond_0
    sub-int/2addr p1, v0

    return p1

    .line 1061
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    return p1

    .line 1051
    :cond_3
    invoke-virtual {p0, p3}, Ll/ۙ᩵֫;->֫(Z)I

    move-result p2

    if-ne p1, p2, :cond_4

    const/4 p1, -0x1

    return p1

    :cond_4
    sub-int/2addr p1, v0

    return p1
.end method

.method public ۧ(Z)I
    .locals 0

    .line 1074
    invoke-virtual {p0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Ll/ۙ᩵֫;->ۧ()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 1005
    invoke-virtual {p0}, Ll/ۙ᩵֫;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
