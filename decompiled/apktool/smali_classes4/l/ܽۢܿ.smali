.class public final Ll/ܽۢܿ;
.super Ljava/lang/Object;
.source "N6ZQ"


# instance fields
.field public final ֫:Ll/ܶۘܿ;

.field public ۜ:I

.field public ۡ:Z

.field public ۢ:I

.field public ۧ:Z

.field public final ܳ:I

.field public ܽ:I

.field public final ܿ:I

.field public ᩳ:Z

.field public final ᩷:Z

.field public final ᩻:Ll/ᩳۢܿ;


# direct methods
.method public constructor <init>(Ll/ᩳۢܿ;Ll/ܶۘܿ;IIZ)V
    .locals 3

    .line 1281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 1273
    iput v0, p0, Ll/ܽۢܿ;->ۜ:I

    const/4 v1, -0x1

    .line 1274
    iput v1, p0, Ll/ܽۢܿ;->ۢ:I

    .line 1277
    iput-boolean v0, p0, Ll/ܽۢܿ;->ۡ:Z

    .line 1282
    iput-object p1, p0, Ll/ܽۢܿ;->᩻:Ll/ᩳۢܿ;

    const-string v1, "changes"

    .line 1283
    invoke-static {p2, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ܽۢܿ;->֫:Ll/ܶۘܿ;

    .line 1284
    iput p3, p0, Ll/ܽۢܿ;->ܳ:I

    .line 1285
    iput p4, p0, Ll/ܽۢܿ;->ܿ:I

    .line 1286
    iput-boolean p5, p0, Ll/ܽۢܿ;->᩷:Z

    .line 1287
    invoke-virtual {p2}, Ll/ܶۘܿ;->ܿ()I

    move-result v1

    invoke-static {p1}, Ll/ᩳۢܿ;->ܳ(Ll/ᩳۢܿ;)I

    move-result v2

    if-ne v1, v2, :cond_1

    if-ltz p3, :cond_1

    .line 1288
    invoke-virtual {p2}, Ll/ܶۘܿ;->ܿ()I

    move-result v1

    if-gt p3, v1, :cond_1

    if-ltz p4, :cond_1

    .line 1289
    invoke-virtual {p2}, Ll/ܶۘܿ;->ᩳ()I

    move-result p2

    if-gt p4, p2, :cond_1

    if-eqz p5, :cond_0

    .line 1293
    invoke-static {p1}, Ll/ᩳۢܿ;->ᩳ(Ll/ᩳۢܿ;)I

    move-result p1

    sub-int/2addr p1, v0

    iput p1, p0, Ll/ܽۢܿ;->ܽ:I

    .line 1294
    iput-boolean v0, p0, Ll/ܽۢܿ;->ᩳ:Z

    return-void

    .line 1296
    :cond_0
    iput v0, p0, Ll/ܽۢܿ;->ܽ:I

    return-void

    .line 1290
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Syntax context reuse boundaries differ"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 1380
    iget-boolean v0, p0, Ll/ܽۢܿ;->᩷:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ܽۢܿ;->ۧ:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ܽۢܿ;->ۡ:Z

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ܽۢܿ;->ۢ:I

    if-ltz v0, :cond_1

    iget v0, p0, Ll/ܽۢܿ;->ۜ:I

    if-lt p1, v0, :cond_1

    iget-object v0, p0, Ll/ܽۢܿ;->᩻:Ll/ᩳۢܿ;

    invoke-static {v0}, Ll/ᩳۢܿ;->ᩳ(Ll/ᩳۢܿ;)I

    move-result v0

    if-le p1, v0, :cond_0

    goto :goto_0

    .line 1384
    :cond_0
    iget v0, p0, Ll/ܽۢܿ;->ۢ:I

    add-int/2addr v0, p1

    iget p1, p0, Ll/ܽۢܿ;->ۜ:I

    sub-int/2addr v0, p1

    return v0

    :cond_1
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫()Z
    .locals 1

    .line 1368
    iget-boolean v0, p0, Ll/ܽۢܿ;->ۧ:Z

    return v0
.end method

.method public final ֫(Ll/ܳۢܿ;)Z
    .locals 16

    move-object/from16 v0, p0

    .line 1304
    iget-boolean v1, v0, Ll/ܽۢܿ;->ۧ:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    .line 1305
    :cond_0
    iget-boolean v1, v0, Ll/ܽۢܿ;->ᩳ:Z

    iget v3, v0, Ll/ܽۢܿ;->ܳ:I

    iget-object v4, v0, Ll/ܽۢܿ;->᩻:Ll/ᩳۢܿ;

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    .line 1306
    iget v1, v0, Ll/ܽۢܿ;->ܽ:I

    if-lez v1, :cond_1

    invoke-static {v4}, Ll/ᩳۢܿ;->ܿ(Ll/ᩳۢܿ;)[I

    move-result-object v1

    iget v6, v0, Ll/ܽۢܿ;->ܽ:I

    aget v1, v1, v6

    if-lt v1, v3, :cond_1

    sub-int/2addr v6, v5

    .line 1307
    iput v6, v0, Ll/ܽۢܿ;->ܽ:I

    return v5

    .line 1310
    :cond_1
    iget v1, v0, Ll/ܽۢܿ;->ܽ:I

    add-int/2addr v1, v5

    iput v1, v0, Ll/ܽۢܿ;->ۜ:I

    .line 1311
    iput v1, v0, Ll/ܽۢܿ;->ܽ:I

    .line 1312
    invoke-virtual/range {p1 .. p1}, Ll/ܳۢܿ;->ۧ()I

    move-result v1

    iput v1, v0, Ll/ܽۢܿ;->ۢ:I

    .line 1313
    iput-boolean v2, v0, Ll/ܽۢܿ;->ᩳ:Z

    .line 1314
    iget v1, v0, Ll/ܽۢܿ;->ܽ:I

    invoke-static {v4}, Ll/ᩳۢܿ;->ᩳ(Ll/ᩳۢܿ;)I

    move-result v2

    if-lt v1, v2, :cond_d

    iput-boolean v5, v0, Ll/ܽۢܿ;->ۧ:Z

    return v5

    .line 1317
    :cond_2
    iget-boolean v1, v0, Ll/ܽۢܿ;->᩷:Z

    if-nez v1, :cond_4

    iget v6, v0, Ll/ܽۢܿ;->ܽ:I

    invoke-static {v4}, Ll/ᩳۢܿ;->ᩳ(Ll/ᩳۢܿ;)I

    move-result v7

    if-ge v6, v7, :cond_3

    invoke-static {v4}, Ll/ᩳۢܿ;->֫(Ll/ᩳۢܿ;)[I

    move-result-object v6

    iget v7, v0, Ll/ܽۢܿ;->ܽ:I

    aget v6, v6, v7

    if-le v6, v3, :cond_4

    .line 1318
    :cond_3
    iput-boolean v5, v0, Ll/ܽۢܿ;->ۧ:Z

    return v2

    .line 1321
    :cond_4
    iget v3, v0, Ll/ܽۢܿ;->ܽ:I

    invoke-static {v4}, Ll/ᩳۢܿ;->ᩳ(Ll/ᩳۢܿ;)I

    move-result v6

    if-lt v3, v6, :cond_5

    .line 1322
    iput-boolean v5, v0, Ll/ܽۢܿ;->ۧ:Z

    return v2

    .line 1325
    :cond_5
    iget v3, v0, Ll/ܽۢܿ;->ۢ:I

    if-gez v3, :cond_6

    invoke-virtual/range {p1 .. p1}, Ll/ܳۢܿ;->ۧ()I

    move-result v3

    iput v3, v0, Ll/ܽۢܿ;->ۢ:I

    .line 1334
    :cond_6
    iget v3, v0, Ll/ܽۢܿ;->ܽ:I

    .line 1335
    invoke-static {v4}, Ll/ᩳۢܿ;->ܽ(Ll/ᩳۢܿ;)[I

    move-result-object v6

    aget v6, v6, v3

    if-eqz v6, :cond_7

    .line 1336
    iget v7, v0, Ll/ܽۢܿ;->ۜ:I

    if-ge v6, v7, :cond_7

    .line 1337
    iput-boolean v2, v0, Ll/ܽۢܿ;->ۡ:Z

    .line 1338
    iput-boolean v5, v0, Ll/ܽۢܿ;->ۧ:Z

    goto :goto_3

    :cond_7
    if-eqz v1, :cond_8

    .line 1342
    sget-object v7, Ll/֨ۘܿ;->᩹:Ll/֨ۘܿ;

    goto :goto_0

    :cond_8
    sget-object v7, Ll/֨ۘܿ;->᩶:Ll/֨ۘܿ;

    .line 1343
    :goto_0
    invoke-static {v4}, Ll/ᩳۢܿ;->ܿ(Ll/ᩳۢܿ;)[I

    move-result-object v8

    aget v8, v8, v3

    iget-object v9, v0, Ll/ܽۢܿ;->֫:Ll/ܶۘܿ;

    invoke-virtual {v9, v8, v7}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result v12

    .line 1344
    invoke-static {v4}, Ll/ᩳۢܿ;->֫(Ll/ᩳۢܿ;)[I

    move-result-object v8

    aget v8, v8, v3

    invoke-virtual {v9, v8, v7}, Ll/ܶۘܿ;->ۧ(ILl/֨ۘܿ;)I

    move-result v13

    if-ltz v12, :cond_b

    if-le v13, v12, :cond_b

    sub-int v7, v13, v12

    .line 1345
    invoke-static {v4}, Ll/ᩳۢܿ;->֫(Ll/ᩳۢܿ;)[I

    move-result-object v8

    aget v8, v8, v3

    invoke-static {v4}, Ll/ᩳۢܿ;->ܿ(Ll/ᩳۢܿ;)[I

    move-result-object v9

    aget v9, v9, v3

    sub-int/2addr v8, v9

    if-ne v7, v8, :cond_b

    .line 1364
    iget v7, v0, Ll/ܽۢܿ;->ܿ:I

    if-eqz v1, :cond_9

    if-lt v12, v7, :cond_b

    goto :goto_1

    :cond_9
    if-gt v13, v7, :cond_b

    :goto_1
    if-nez v6, :cond_a

    const/4 v1, 0x0

    const/4 v14, 0x0

    goto :goto_2

    .line 1353
    :cond_a
    iget v1, v0, Ll/ܽۢܿ;->ۢ:I

    add-int/2addr v1, v6

    iget v6, v0, Ll/ܽۢܿ;->ۜ:I

    sub-int/2addr v1, v6

    move v14, v1

    .line 1354
    :goto_2
    iget v1, v0, Ll/ܽۢܿ;->ۢ:I

    add-int/2addr v1, v3

    iget v6, v0, Ll/ܽۢܿ;->ۜ:I

    sub-int v11, v1, v6

    .line 1355
    invoke-static {v4}, Ll/ᩳۢܿ;->ۧ(Ll/ᩳۢܿ;)[Ll/ܶۜܿ;

    move-result-object v1

    aget-object v15, v1, v3

    move-object/from16 v10, p1

    invoke-virtual/range {v10 .. v15}, Ll/ܳۢܿ;->֫(IIIILl/ܶۜܿ;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 1357
    iput-boolean v2, v0, Ll/ܽۢܿ;->ۡ:Z

    .line 1358
    iput-boolean v5, v0, Ll/ܽۢܿ;->ۧ:Z

    goto :goto_3

    .line 1348
    :cond_b
    iput-boolean v2, v0, Ll/ܽۢܿ;->ۡ:Z

    .line 1349
    iput-boolean v5, v0, Ll/ܽۢܿ;->ۧ:Z

    .line 1327
    :cond_c
    :goto_3
    iget v1, v0, Ll/ܽۢܿ;->ܽ:I

    add-int/2addr v1, v5

    iput v1, v0, Ll/ܽۢܿ;->ܽ:I

    .line 1328
    invoke-static {v4}, Ll/ᩳۢܿ;->ᩳ(Ll/ᩳۢܿ;)I

    move-result v2

    if-lt v1, v2, :cond_d

    iput-boolean v5, v0, Ll/ܽۢܿ;->ۧ:Z

    :cond_d
    return v5
.end method

.method public final ۧ()Z
    .locals 1

    .line 1372
    iget-boolean v0, p0, Ll/ܽۢܿ;->ۡ:Z

    return v0
.end method
