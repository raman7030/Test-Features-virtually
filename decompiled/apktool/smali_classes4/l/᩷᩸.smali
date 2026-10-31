.class public final Ll/᩷᩸;
.super Ljava/lang/Object;
.source "R1K2"


# instance fields
.field public final ֫:Ll/ۢ᩸;

.field public ۧ:Ljava/util/HashMap;

.field public final ܳ:Ll/ۖ᩸;

.field public ܽ:I

.field public final ܿ:Ll/ܺ᩸;

.field public final ᩳ:Ll/ۡ᩸;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1256
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1259
    new-instance v0, Ll/ܺ᩸;

    .line 1139
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 1140
    iput-boolean v1, v0, Ll/ܺ᩸;->ۧ:Z

    .line 1141
    iput v1, v0, Ll/ܺ᩸;->ܿ:I

    .line 1142
    iput v1, v0, Ll/ܺ᩸;->ᩳ:I

    const/high16 v2, 0x3f800000    # 1.0f

    .line 1143
    iput v2, v0, Ll/ܺ᩸;->֫:F

    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 1144
    iput v3, v0, Ll/ܺ᩸;->ܽ:F

    .line 1259
    iput-object v0, p0, Ll/᩷᩸;->ܿ:Ll/ܺ᩸;

    .line 1260
    new-instance v0, Ll/ۡ᩸;

    .line 1179
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1180
    iput-boolean v1, v0, Ll/ۡ᩸;->ۧ:Z

    const/4 v4, -0x1

    .line 1181
    iput v4, v0, Ll/ۡ᩸;->֫:I

    const/4 v5, 0x0

    .line 1182
    iput-object v5, v0, Ll/ۡ᩸;->᩻:Ljava/lang/String;

    .line 1183
    iput v4, v0, Ll/ۡ᩸;->ܿ:I

    .line 1184
    iput v1, v0, Ll/ۡ᩸;->ܽ:I

    .line 1185
    iput v3, v0, Ll/ۡ᩸;->ᩳ:F

    .line 1186
    iput v3, v0, Ll/ۡ᩸;->ܳ:F

    .line 1260
    iput-object v0, p0, Ll/᩷᩸;->ᩳ:Ll/ۡ᩸;

    .line 1261
    new-instance v0, Ll/ۢ᩸;

    .line 517
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 518
    iput-boolean v1, v0, Ll/ۢ᩸;->ۜ֫:Z

    .line 519
    iput-boolean v1, v0, Ll/ۢ᩸;->֫֫:Z

    .line 523
    iput v4, v0, Ll/ۢ᩸;->᩸:I

    .line 524
    iput v4, v0, Ll/ۢ᩸;->᩹:I

    const/high16 v6, -0x40800000    # -1.0f

    .line 525
    iput v6, v0, Ll/ۢ᩸;->᩶:F

    .line 526
    iput v4, v0, Ll/ۢ᩸;->ܰ:I

    .line 527
    iput v4, v0, Ll/ۢ᩸;->۟:I

    .line 528
    iput v4, v0, Ll/ۢ᩸;->ۘ֫:I

    .line 529
    iput v4, v0, Ll/ۢ᩸;->ᩴ֫:I

    .line 530
    iput v4, v0, Ll/ۢ᩸;->ܶ֫:I

    .line 531
    iput v4, v0, Ll/ۢ᩸;->۠֫:I

    .line 532
    iput v4, v0, Ll/ۢ᩸;->ᩳ:I

    .line 533
    iput v4, v0, Ll/ۢ᩸;->ܽ:I

    .line 534
    iput v4, v0, Ll/ۢ᩸;->֫:I

    .line 535
    iput v4, v0, Ll/ۢ᩸;->֡֫:I

    .line 536
    iput v4, v0, Ll/ۢ᩸;->ۚ֫:I

    .line 537
    iput v4, v0, Ll/ۢ᩸;->ᩴ:I

    .line 538
    iput v4, v0, Ll/ۢ᩸;->ۘ:I

    const/high16 v7, 0x3f000000    # 0.5f

    .line 539
    iput v7, v0, Ll/ۢ᩸;->ۤ:F

    .line 540
    iput v7, v0, Ll/ۢ᩸;->᩸֫:F

    .line 541
    iput-object v5, v0, Ll/ۢ᩸;->ۢ:Ljava/lang/String;

    .line 542
    iput v4, v0, Ll/ۢ᩸;->ܳ:I

    .line 543
    iput v1, v0, Ll/ۢ᩸;->᩻:I

    const/4 v5, 0x0

    .line 544
    iput v5, v0, Ll/ۢ᩸;->ܿ:F

    .line 545
    iput v4, v0, Ll/ۢ᩸;->ۡ:I

    .line 546
    iput v4, v0, Ll/ۢ᩸;->ܺ:I

    .line 547
    iput v4, v0, Ll/ۢ᩸;->ܺ֫:I

    .line 548
    iput v4, v0, Ll/ۢ᩸;->᩺:I

    .line 549
    iput v4, v0, Ll/ۢ᩸;->ۖ֫:I

    .line 550
    iput v4, v0, Ll/ۢ᩸;->֨֫:I

    .line 551
    iput v4, v0, Ll/ۢ᩸;->ۧ:I

    .line 552
    iput v4, v0, Ll/ۢ᩸;->ۖ:I

    .line 553
    iput v4, v0, Ll/ۢ᩸;->᩵֫:I

    .line 554
    iput v4, v0, Ll/ۢ᩸;->ۚ:I

    .line 555
    iput v4, v0, Ll/ۢ᩸;->ܶ:I

    .line 556
    iput v4, v0, Ll/ۢ᩸;->֨:I

    .line 557
    iput v4, v0, Ll/ۢ᩸;->᩵:I

    .line 558
    iput v4, v0, Ll/ۢ᩸;->֡:I

    .line 559
    iput v4, v0, Ll/ۢ᩸;->۠:I

    .line 560
    iput v6, v0, Ll/ۢ᩸;->᩶֫:F

    .line 561
    iput v6, v0, Ll/ۢ᩸;->ۨ:F

    .line 562
    iput v1, v0, Ll/ۢ᩸;->ۛ:I

    .line 563
    iput v1, v0, Ll/ۢ᩸;->᩹֫:I

    .line 564
    iput v1, v0, Ll/ۢ᩸;->ۙ֫:I

    .line 565
    iput v1, v0, Ll/ۢ᩸;->ۙ:I

    .line 566
    iput v4, v0, Ll/ۢ᩸;->ۗ֫:I

    .line 567
    iput v4, v0, Ll/ۢ᩸;->ۗ:I

    .line 568
    iput v4, v0, Ll/ۢ᩸;->۬֫:I

    .line 569
    iput v4, v0, Ll/ۢ᩸;->۬:I

    .line 570
    iput v2, v0, Ll/ۢ᩸;->۫֫:F

    .line 571
    iput v2, v0, Ll/ۢ᩸;->۫:F

    .line 572
    iput v4, v0, Ll/ۢ᩸;->ܽ֫:I

    .line 573
    iput v1, v0, Ll/ۢ᩸;->ᩳ֫:I

    .line 574
    iput v4, v0, Ll/ۢ᩸;->᩻֫:I

    .line 578
    iput-boolean v1, v0, Ll/ۢ᩸;->᩷:Z

    .line 579
    iput-boolean v1, v0, Ll/ۢ᩸;->ۜ:Z

    const/4 v4, 0x1

    .line 581
    iput-boolean v4, v0, Ll/ۢ᩸;->ۧ֫:Z

    .line 1261
    iput-object v0, p0, Ll/᩷᩸;->֫:Ll/ۢ᩸;

    .line 1262
    new-instance v0, Ll/ۖ᩸;

    .line 1026
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1027
    iput-boolean v1, v0, Ll/ۖ᩸;->ܽ:Z

    .line 1028
    iput v5, v0, Ll/ۖ᩸;->ᩳ:F

    .line 1029
    iput v5, v0, Ll/ۖ᩸;->ܿ:F

    .line 1030
    iput v5, v0, Ll/ۖ᩸;->ܳ:F

    .line 1031
    iput v2, v0, Ll/ۖ᩸;->᩻:F

    .line 1032
    iput v2, v0, Ll/ۖ᩸;->ۜ:F

    .line 1033
    iput v3, v0, Ll/ۖ᩸;->᩷:F

    .line 1034
    iput v3, v0, Ll/ۖ᩸;->ۢ:F

    .line 1035
    iput v5, v0, Ll/ۖ᩸;->ۡ:F

    .line 1036
    iput v5, v0, Ll/ۖ᩸;->ܺ:F

    .line 1037
    iput v5, v0, Ll/ۖ᩸;->ۖ:F

    .line 1038
    iput-boolean v1, v0, Ll/ۖ᩸;->֫:Z

    .line 1039
    iput v5, v0, Ll/ۖ᩸;->ۧ:F

    .line 1262
    iput-object v0, p0, Ll/᩷᩸;->ܳ:Ll/ۖ᩸;

    .line 1263
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩷᩸;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method private ֫(ILl/ܽ᩸;)V
    .locals 1

    .line 1336
    iput p1, p0, Ll/᩷᩸;->ܽ:I

    .line 1337
    iget p1, p2, Ll/ܽ᩸;->᩺:I

    iget-object v0, p0, Ll/᩷᩸;->֫:Ll/ۢ᩸;

    iput p1, v0, Ll/ۢ᩸;->ܰ:I

    .line 1338
    iget p1, p2, Ll/ܽ᩸;->ܰ:I

    iput p1, v0, Ll/ۢ᩸;->۟:I

    .line 1339
    iget p1, p2, Ll/ܽ᩸;->۠֫:I

    iput p1, v0, Ll/ۢ᩸;->ۘ֫:I

    .line 1340
    iget p1, p2, Ll/ܽ᩸;->ܶ֫:I

    iput p1, v0, Ll/ۢ᩸;->ᩴ֫:I

    .line 1341
    iget p1, p2, Ll/ܽ᩸;->ۙ֫:I

    iput p1, v0, Ll/ۢ᩸;->ܶ֫:I

    .line 1342
    iget p1, p2, Ll/ܽ᩸;->᩶֫:I

    iput p1, v0, Ll/ۢ᩸;->۠֫:I

    .line 1343
    iget p1, p2, Ll/ܽ᩸;->ܽ:I

    iput p1, v0, Ll/ۢ᩸;->ᩳ:I

    .line 1344
    iget p1, p2, Ll/ܽ᩸;->ۧ:I

    iput p1, v0, Ll/ۢ᩸;->ܽ:I

    .line 1345
    iget p1, p2, Ll/ܽ᩸;->֫:I

    iput p1, v0, Ll/ۢ᩸;->֫:I

    .line 1346
    iget p1, p2, Ll/ܽ᩸;->᩸֫:I

    iput p1, v0, Ll/ۢ᩸;->֡֫:I

    .line 1347
    iget p1, p2, Ll/ܽ᩸;->᩹֫:I

    iput p1, v0, Ll/ۢ᩸;->ۚ֫:I

    .line 1348
    iget p1, p2, Ll/ܽ᩸;->ᩴ:I

    iput p1, v0, Ll/ۢ᩸;->ᩴ:I

    .line 1349
    iget p1, p2, Ll/ܽ᩸;->ۘ:I

    iput p1, v0, Ll/ۢ᩸;->ۘ:I

    .line 1351
    iget p1, p2, Ll/ܽ᩸;->ۙ:F

    iput p1, v0, Ll/ۢ᩸;->ۤ:F

    .line 1352
    iget p1, p2, Ll/ܽ᩸;->ۗ֫:F

    iput p1, v0, Ll/ۢ᩸;->᩸֫:F

    .line 1353
    iget-object p1, p2, Ll/ܽ᩸;->ۢ:Ljava/lang/String;

    iput-object p1, v0, Ll/ۢ᩸;->ۢ:Ljava/lang/String;

    .line 1355
    iget p1, p2, Ll/ܽ᩸;->ܿ:I

    iput p1, v0, Ll/ۢ᩸;->ܳ:I

    .line 1356
    iget p1, p2, Ll/ܽ᩸;->ܳ:I

    iput p1, v0, Ll/ۢ᩸;->᩻:I

    .line 1357
    iget p1, p2, Ll/ܽ᩸;->ᩳ:F

    iput p1, v0, Ll/ۢ᩸;->ܿ:F

    .line 1359
    iget p1, p2, Ll/ܽ᩸;->ܺ:I

    iput p1, v0, Ll/ۢ᩸;->ۡ:I

    .line 1360
    iget p1, p2, Ll/ܽ᩸;->ۖ:I

    iput p1, v0, Ll/ۢ᩸;->ܺ:I

    .line 1361
    iget p1, p2, Ll/ܽ᩸;->᩷֫:I

    iput p1, v0, Ll/ۢ᩸;->ܺ֫:I

    .line 1362
    iget p1, p2, Ll/ܽ᩸;->᩶:F

    iput p1, v0, Ll/ۢ᩸;->᩶:F

    .line 1363
    iget p1, p2, Ll/ܽ᩸;->᩸:I

    iput p1, v0, Ll/ۢ᩸;->᩸:I

    .line 1364
    iget p1, p2, Ll/ܽ᩸;->᩹:I

    iput p1, v0, Ll/ۢ᩸;->᩹:I

    .line 1365
    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput p1, v0, Ll/ۢ᩸;->ۡ֫:I

    .line 1366
    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput p1, v0, Ll/ۢ᩸;->ܳ֫:I

    .line 1367
    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput p1, v0, Ll/ۢ᩸;->᩺:I

    .line 1368
    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput p1, v0, Ll/ۢ᩸;->ۖ֫:I

    .line 1369
    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput p1, v0, Ll/ۢ᩸;->֨֫:I

    .line 1370
    iget p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput p1, v0, Ll/ۢ᩸;->ۧ:I

    .line 1371
    iget p1, p2, Ll/ܽ᩸;->ۤ֫:F

    iput p1, v0, Ll/ۢ᩸;->᩶֫:F

    .line 1372
    iget p1, p2, Ll/ܽ᩸;->۫:F

    iput p1, v0, Ll/ۢ᩸;->ۨ:F

    .line 1373
    iget p1, p2, Ll/ܽ᩸;->۬֫:I

    iput p1, v0, Ll/ۢ᩸;->᩹֫:I

    .line 1374
    iget p1, p2, Ll/ܽ᩸;->ۗ:I

    iput p1, v0, Ll/ۢ᩸;->ۛ:I

    .line 1375
    iget-boolean p1, p2, Ll/ܽ᩸;->ۜ:Z

    iput-boolean p1, v0, Ll/ۢ᩸;->᩷:Z

    .line 1376
    iget-boolean p1, p2, Ll/ܽ᩸;->᩻:Z

    iput-boolean p1, v0, Ll/ۢ᩸;->ۜ:Z

    .line 1377
    iget p1, p2, Ll/ܽ᩸;->֫֫:I

    iput p1, v0, Ll/ۢ᩸;->ۙ֫:I

    .line 1378
    iget p1, p2, Ll/ܽ᩸;->۟:I

    iput p1, v0, Ll/ۢ᩸;->ۙ:I

    .line 1379
    iget p1, p2, Ll/ܽ᩸;->ܽ֫:I

    iput p1, v0, Ll/ۢ᩸;->ۗ֫:I

    .line 1380
    iget p1, p2, Ll/ܽ᩸;->ۧ֫:I

    iput p1, v0, Ll/ۢ᩸;->ۗ:I

    .line 1381
    iget p1, p2, Ll/ܽ᩸;->ܿ֫:I

    iput p1, v0, Ll/ۢ᩸;->۬֫:I

    .line 1382
    iget p1, p2, Ll/ܽ᩸;->ᩳ֫:I

    iput p1, v0, Ll/ۢ᩸;->۬:I

    .line 1383
    iget p1, p2, Ll/ܽ᩸;->᩻֫:F

    iput p1, v0, Ll/ۢ᩸;->۫֫:F

    .line 1384
    iget p1, p2, Ll/ܽ᩸;->ܳ֫:F

    iput p1, v0, Ll/ۢ᩸;->۫:F

    .line 1385
    iget-object p1, p2, Ll/ܽ᩸;->᩷:Ljava/lang/String;

    iput-object p1, v0, Ll/ۢ᩸;->ܿ֫:Ljava/lang/String;

    .line 1386
    iget p1, p2, Ll/ܽ᩸;->ܶ:I

    iput p1, v0, Ll/ۢ᩸;->ܶ:I

    .line 1387
    iget p1, p2, Ll/ܽ᩸;->᩵:I

    iput p1, v0, Ll/ۢ᩸;->᩵:I

    .line 1388
    iget p1, p2, Ll/ܽ᩸;->ۚ:I

    iput p1, v0, Ll/ۢ᩸;->ۚ:I

    .line 1389
    iget p1, p2, Ll/ܽ᩸;->֨:I

    iput p1, v0, Ll/ۢ᩸;->֨:I

    .line 1390
    iget p1, p2, Ll/ܽ᩸;->۠:I

    iput p1, v0, Ll/ۢ᩸;->۠:I

    .line 1391
    iget p1, p2, Ll/ܽ᩸;->֡:I

    iput p1, v0, Ll/ۢ᩸;->֡:I

    .line 1395
    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result p1

    iput p1, v0, Ll/ۢ᩸;->ۖ:I

    .line 1396
    invoke-virtual {p2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result p1

    iput p1, v0, Ll/ۢ᩸;->᩵֫:I

    return-void
.end method

.method private ֫(ILl/ᩴ᩸;)V
    .locals 1

    .line 1319
    invoke-direct {p0, p1, p2}, Ll/᩷᩸;->֫(ILl/ܽ᩸;)V

    .line 1320
    iget-object p1, p0, Ll/᩷᩸;->ܿ:Ll/ܺ᩸;

    iget v0, p2, Ll/ᩴ᩸;->ۨ֫:F

    iput v0, p1, Ll/ܺ᩸;->֫:F

    .line 1321
    iget p1, p2, Ll/ᩴ᩸;->۟֫:F

    iget-object v0, p0, Ll/᩷᩸;->ܳ:Ll/ۖ᩸;

    iput p1, v0, Ll/ۖ᩸;->ᩳ:F

    .line 1322
    iget p1, p2, Ll/ᩴ᩸;->֫ۧ:F

    iput p1, v0, Ll/ۖ᩸;->ܿ:F

    .line 1323
    iget p1, p2, Ll/ᩴ᩸;->ۧۧ:F

    iput p1, v0, Ll/ۖ᩸;->ܳ:F

    .line 1324
    iget p1, p2, Ll/ᩴ᩸;->ܽۧ:F

    iput p1, v0, Ll/ۖ᩸;->᩻:F

    .line 1325
    iget p1, p2, Ll/ᩴ᩸;->ᩳۧ:F

    iput p1, v0, Ll/ۖ᩸;->ۜ:F

    .line 1326
    iget p1, p2, Ll/ᩴ᩸;->ܿۧ:F

    iput p1, v0, Ll/ۖ᩸;->᩷:F

    .line 1327
    iget p1, p2, Ll/ᩴ᩸;->ܳۧ:F

    iput p1, v0, Ll/ۖ᩸;->ۢ:F

    .line 1328
    iget p1, p2, Ll/ᩴ᩸;->᩻ۧ:F

    iput p1, v0, Ll/ۖ᩸;->ۡ:F

    .line 1329
    iget p1, p2, Ll/ᩴ᩸;->ۜۧ:F

    iput p1, v0, Ll/ۖ᩸;->ܺ:F

    .line 1330
    iget p1, p2, Ll/ᩴ᩸;->᩷ۧ:F

    iput p1, v0, Ll/ۖ᩸;->ۖ:F

    .line 1331
    iget p1, p2, Ll/ᩴ᩸;->ܰ֫:F

    iput p1, v0, Ll/ۖ᩸;->ۧ:F

    .line 1332
    iget-boolean p1, p2, Ll/ᩴ᩸;->᩺֫:Z

    iput-boolean p1, v0, Ll/ۖ᩸;->֫:Z

    return-void
.end method

.method public static synthetic ֫(Ll/᩷᩸;ILl/ܽ᩸;)V
    .locals 0

    .line 1256
    invoke-direct {p0, p1, p2}, Ll/᩷᩸;->֫(ILl/ܽ᩸;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩷᩸;ILl/ᩴ᩸;)V
    .locals 0

    .line 1256
    invoke-direct {p0, p1, p2}, Ll/᩷᩸;->֫(ILl/ᩴ᩸;)V

    return-void
.end method

.method public static ֫(Ll/᩷᩸;Ll/۟ܶ;ILl/ᩴ᩸;)V
    .locals 1

    .line 1308
    iget-object v0, p0, Ll/᩷᩸;->֫:Ll/ۢ᩸;

    invoke-direct {p0, p2, p3}, Ll/᩷᩸;->֫(ILl/ᩴ᩸;)V

    .line 1309
    instance-of p0, p1, Ll/ۛܶ;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    .line 1310
    iput p0, v0, Ll/ۢ᩸;->᩻֫:I

    .line 1311
    check-cast p1, Ll/ۛܶ;

    .line 1312
    invoke-virtual {p1}, Ll/ۛܶ;->ܳ()I

    move-result p0

    iput p0, v0, Ll/ۢ᩸;->ܽ֫:I

    .line 184
    iget-object p0, p1, Ll/۟ܶ;->᩶:[I

    iget p2, p1, Ll/۟ܶ;->᩸:I

    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    .line 1313
    iput-object p0, v0, Ll/ۢ᩸;->ۢ֫:[I

    .line 1314
    invoke-virtual {p1}, Ll/ۛܶ;->ܿ()I

    move-result p0

    iput p0, v0, Ll/ۢ᩸;->ᩳ֫:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 4

    .line 1297
    new-instance v0, Ll/᩷᩸;

    invoke-direct {v0}, Ll/᩷᩸;-><init>()V

    .line 1298
    iget-object v1, v0, Ll/᩷᩸;->֫:Ll/ۢ᩸;

    iget-object v2, p0, Ll/᩷᩸;->֫:Ll/ۢ᩸;

    invoke-virtual {v1, v2}, Ll/ۢ᩸;->֫(Ll/ۢ᩸;)V

    .line 1299
    iget-object v1, v0, Ll/᩷᩸;->ᩳ:Ll/ۡ᩸;

    iget-object v2, p0, Ll/᩷᩸;->ᩳ:Ll/ۡ᩸;

    invoke-virtual {v1, v2}, Ll/ۡ᩸;->֫(Ll/ۡ᩸;)V

    .line 1147
    iget-object v1, p0, Ll/᩷᩸;->ܿ:Ll/ܺ᩸;

    iget-boolean v2, v1, Ll/ܺ᩸;->ۧ:Z

    iget-object v3, v0, Ll/᩷᩸;->ܿ:Ll/ܺ᩸;

    iput-boolean v2, v3, Ll/ܺ᩸;->ۧ:Z

    .line 1148
    iget v2, v1, Ll/ܺ᩸;->ܿ:I

    iput v2, v3, Ll/ܺ᩸;->ܿ:I

    .line 1149
    iget v2, v1, Ll/ܺ᩸;->֫:F

    iput v2, v3, Ll/ܺ᩸;->֫:F

    .line 1150
    iget v2, v1, Ll/ܺ᩸;->ܽ:F

    iput v2, v3, Ll/ܺ᩸;->ܽ:F

    .line 1151
    iget v1, v1, Ll/ܺ᩸;->ᩳ:I

    iput v1, v3, Ll/ܺ᩸;->ᩳ:I

    .line 1301
    iget-object v1, v0, Ll/᩷᩸;->ܳ:Ll/ۖ᩸;

    iget-object v2, p0, Ll/᩷᩸;->ܳ:Ll/ۖ᩸;

    invoke-virtual {v1, v2}, Ll/ۖ᩸;->֫(Ll/ۖ᩸;)V

    .line 1302
    iget v1, p0, Ll/᩷᩸;->ܽ:I

    iput v1, v0, Ll/᩷᩸;->ܽ:I

    return-object v0
.end method

.method public final ֫(Ll/ܽ᩸;)V
    .locals 2

    .line 1401
    iget-object v0, p0, Ll/᩷᩸;->֫:Ll/ۢ᩸;

    iget v1, v0, Ll/ۢ᩸;->ܰ:I

    iput v1, p1, Ll/ܽ᩸;->᩺:I

    .line 1402
    iget v1, v0, Ll/ۢ᩸;->۟:I

    iput v1, p1, Ll/ܽ᩸;->ܰ:I

    .line 1403
    iget v1, v0, Ll/ۢ᩸;->ۘ֫:I

    iput v1, p1, Ll/ܽ᩸;->۠֫:I

    .line 1404
    iget v1, v0, Ll/ۢ᩸;->ᩴ֫:I

    iput v1, p1, Ll/ܽ᩸;->ܶ֫:I

    .line 1406
    iget v1, v0, Ll/ۢ᩸;->ܶ֫:I

    iput v1, p1, Ll/ܽ᩸;->ۙ֫:I

    .line 1407
    iget v1, v0, Ll/ۢ᩸;->۠֫:I

    iput v1, p1, Ll/ܽ᩸;->᩶֫:I

    .line 1408
    iget v1, v0, Ll/ۢ᩸;->ᩳ:I

    iput v1, p1, Ll/ܽ᩸;->ܽ:I

    .line 1409
    iget v1, v0, Ll/ۢ᩸;->ܽ:I

    iput v1, p1, Ll/ܽ᩸;->ۧ:I

    .line 1411
    iget v1, v0, Ll/ۢ᩸;->֫:I

    iput v1, p1, Ll/ܽ᩸;->֫:I

    .line 1413
    iget v1, v0, Ll/ۢ᩸;->֡֫:I

    iput v1, p1, Ll/ܽ᩸;->᩸֫:I

    .line 1414
    iget v1, v0, Ll/ۢ᩸;->ۚ֫:I

    iput v1, p1, Ll/ܽ᩸;->᩹֫:I

    .line 1415
    iget v1, v0, Ll/ۢ᩸;->ᩴ:I

    iput v1, p1, Ll/ܽ᩸;->ᩴ:I

    .line 1416
    iget v1, v0, Ll/ۢ᩸;->ۘ:I

    iput v1, p1, Ll/ܽ᩸;->ۘ:I

    .line 1418
    iget v1, v0, Ll/ۢ᩸;->᩺:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1419
    iget v1, v0, Ll/ۢ᩸;->ۖ֫:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1420
    iget v1, v0, Ll/ۢ᩸;->֨֫:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1421
    iget v1, v0, Ll/ۢ᩸;->ۧ:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1422
    iget v1, v0, Ll/ۢ᩸;->۠:I

    iput v1, p1, Ll/ܽ᩸;->۠:I

    .line 1423
    iget v1, v0, Ll/ۢ᩸;->֡:I

    iput v1, p1, Ll/ܽ᩸;->֡:I

    .line 1424
    iget v1, v0, Ll/ۢ᩸;->ܶ:I

    iput v1, p1, Ll/ܽ᩸;->ܶ:I

    .line 1425
    iget v1, v0, Ll/ۢ᩸;->᩵:I

    iput v1, p1, Ll/ܽ᩸;->᩵:I

    .line 1427
    iget v1, v0, Ll/ۢ᩸;->ۤ:F

    iput v1, p1, Ll/ܽ᩸;->ۙ:F

    .line 1428
    iget v1, v0, Ll/ۢ᩸;->᩸֫:F

    iput v1, p1, Ll/ܽ᩸;->ۗ֫:F

    .line 1430
    iget v1, v0, Ll/ۢ᩸;->ܳ:I

    iput v1, p1, Ll/ܽ᩸;->ܿ:I

    .line 1431
    iget v1, v0, Ll/ۢ᩸;->᩻:I

    iput v1, p1, Ll/ܽ᩸;->ܳ:I

    .line 1432
    iget v1, v0, Ll/ۢ᩸;->ܿ:F

    iput v1, p1, Ll/ܽ᩸;->ᩳ:F

    .line 1434
    iget-object v1, v0, Ll/ۢ᩸;->ۢ:Ljava/lang/String;

    iput-object v1, p1, Ll/ܽ᩸;->ۢ:Ljava/lang/String;

    .line 1435
    iget v1, v0, Ll/ۢ᩸;->ۡ:I

    iput v1, p1, Ll/ܽ᩸;->ܺ:I

    .line 1436
    iget v1, v0, Ll/ۢ᩸;->ܺ:I

    iput v1, p1, Ll/ܽ᩸;->ۖ:I

    .line 1437
    iget v1, v0, Ll/ۢ᩸;->᩶֫:F

    iput v1, p1, Ll/ܽ᩸;->ۤ֫:F

    .line 1438
    iget v1, v0, Ll/ۢ᩸;->ۨ:F

    iput v1, p1, Ll/ܽ᩸;->۫:F

    .line 1439
    iget v1, v0, Ll/ۢ᩸;->᩹֫:I

    iput v1, p1, Ll/ܽ᩸;->۬֫:I

    .line 1440
    iget v1, v0, Ll/ۢ᩸;->ۛ:I

    iput v1, p1, Ll/ܽ᩸;->ۗ:I

    .line 1441
    iget-boolean v1, v0, Ll/ۢ᩸;->᩷:Z

    iput-boolean v1, p1, Ll/ܽ᩸;->ۜ:Z

    .line 1442
    iget-boolean v1, v0, Ll/ۢ᩸;->ۜ:Z

    iput-boolean v1, p1, Ll/ܽ᩸;->᩻:Z

    .line 1443
    iget v1, v0, Ll/ۢ᩸;->ۙ֫:I

    iput v1, p1, Ll/ܽ᩸;->֫֫:I

    .line 1444
    iget v1, v0, Ll/ۢ᩸;->ۙ:I

    iput v1, p1, Ll/ܽ᩸;->۟:I

    .line 1445
    iget v1, v0, Ll/ۢ᩸;->ۗ֫:I

    iput v1, p1, Ll/ܽ᩸;->ܽ֫:I

    .line 1446
    iget v1, v0, Ll/ۢ᩸;->ۗ:I

    iput v1, p1, Ll/ܽ᩸;->ۧ֫:I

    .line 1447
    iget v1, v0, Ll/ۢ᩸;->۬֫:I

    iput v1, p1, Ll/ܽ᩸;->ܿ֫:I

    .line 1448
    iget v1, v0, Ll/ۢ᩸;->۬:I

    iput v1, p1, Ll/ܽ᩸;->ᩳ֫:I

    .line 1449
    iget v1, v0, Ll/ۢ᩸;->۫֫:F

    iput v1, p1, Ll/ܽ᩸;->᩻֫:F

    .line 1450
    iget v1, v0, Ll/ۢ᩸;->۫:F

    iput v1, p1, Ll/ܽ᩸;->ܳ֫:F

    .line 1451
    iget v1, v0, Ll/ۢ᩸;->ܺ֫:I

    iput v1, p1, Ll/ܽ᩸;->᩷֫:I

    .line 1452
    iget v1, v0, Ll/ۢ᩸;->᩶:F

    iput v1, p1, Ll/ܽ᩸;->᩶:F

    .line 1453
    iget v1, v0, Ll/ۢ᩸;->᩸:I

    iput v1, p1, Ll/ܽ᩸;->᩸:I

    .line 1454
    iget v1, v0, Ll/ۢ᩸;->᩹:I

    iput v1, p1, Ll/ܽ᩸;->᩹:I

    .line 1455
    iget v1, v0, Ll/ۢ᩸;->ۡ֫:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1456
    iget v1, v0, Ll/ۢ᩸;->ܳ֫:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1457
    iget-object v1, v0, Ll/ۢ᩸;->ܿ֫:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 1458
    iput-object v1, p1, Ll/ܽ᩸;->᩷:Ljava/lang/String;

    .line 1462
    :cond_0
    iget v1, v0, Ll/ۢ᩸;->᩵֫:I

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 1463
    iget v0, v0, Ll/ۢ᩸;->ۖ:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1466
    invoke-virtual {p1}, Ll/ܽ᩸;->ۧ()V

    return-void
.end method
