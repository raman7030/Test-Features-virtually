.class public final Ll/֨֡ܺ;
.super Ljava/lang/Object;
.source "SB7W"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ᩸:Ll/۟ۚܺ;

.field public ᩹:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1416
    iput p1, p0, Ll/֨֡ܺ;->᩹:F

    .line 1417
    sget-object p1, Ll/۟ۚܺ;->ۨ:Ll/۟ۚܺ;

    iput-object p1, p0, Ll/֨֡ܺ;->᩸:Ll/۟ۚܺ;

    return-void
.end method

.method public constructor <init>(FLl/۟ۚܺ;)V
    .locals 0

    .line 1409
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1410
    iput p1, p0, Ll/֨֡ܺ;->᩹:F

    .line 1411
    iput-object p2, p0, Ll/֨֡ܺ;->᩸:Ll/۟ۚܺ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1537
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/֨֡ܺ;->᩹:F

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨֡ܺ;->᩸:Ll/۟ۚܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(F)F
    .locals 3

    .line 1502
    iget-object v0, p0, Ll/֨֡ܺ;->᩸:Ll/۟ۚܺ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v1, p0, Ll/֨֡ܺ;->᩹:F

    if-eqz v0, :cond_5

    const/4 v2, 0x3

    if-eq v0, v2, :cond_4

    const/4 v2, 0x4

    if-eq v0, v2, :cond_3

    const/4 v2, 0x5

    if-eq v0, v2, :cond_2

    const/4 v2, 0x6

    if-eq v0, v2, :cond_1

    const/4 v2, 0x7

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    mul-float v1, v1, p1

    const/high16 p1, 0x40c00000    # 6.0f

    goto :goto_0

    :cond_1
    mul-float v1, v1, p1

    const/high16 p1, 0x42900000    # 72.0f

    goto :goto_0

    :cond_2
    mul-float v1, v1, p1

    const p1, 0x41cb3333    # 25.4f

    goto :goto_0

    :cond_3
    mul-float v1, v1, p1

    const p1, 0x40228f5c    # 2.54f

    :goto_0
    div-float/2addr v1, p1

    return v1

    :cond_4
    mul-float v1, v1, p1

    :cond_5
    return v1
.end method

.method public final ֫(Ll/ᩴ֨ܺ;)F
    .locals 7

    .line 1472
    iget-object v0, p0, Ll/֨֡ܺ;->᩸:Ll/۟ۚܺ;

    sget-object v1, Ll/۟ۚܺ;->ۤ:Ll/۟ۚܺ;

    if-ne v0, v1, :cond_2

    .line 1474
    invoke-virtual {p1}, Ll/ᩴ֨ܺ;->ܽ()Ll/ܿ֡ܺ;

    move-result-object p1

    .line 1475
    iget v0, p0, Ll/֨֡ܺ;->᩹:F

    if-nez p1, :cond_0

    return v0

    .line 1477
    :cond_0
    iget v1, p1, Ll/ܿ֡ܺ;->ᩳ:F

    .line 1478
    iget p1, p1, Ll/ܿ֡ܺ;->֫:F

    const/high16 v2, 0x42c80000    # 100.0f

    cmpl-float v3, v1, p1

    if-nez v3, :cond_1

    mul-float v0, v0, v1

    goto :goto_0

    :cond_1
    mul-float v1, v1, v1

    mul-float p1, p1, p1

    add-float/2addr p1, v1

    float-to-double v3, p1

    .line 1481
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    const-wide v5, 0x3ff6a09e667f3bccL    # 1.414213562373095

    div-double/2addr v3, v5

    double-to-float p1, v3

    mul-float v0, v0, p1

    :goto_0
    div-float/2addr v0, v2

    return v0

    .line 1484
    :cond_2
    invoke-virtual {p0, p1}, Ll/֨֡ܺ;->ۧ(Ll/ᩴ֨ܺ;)F

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ᩴ֨ܺ;F)F
    .locals 2

    .line 1491
    iget-object v0, p0, Ll/֨֡ܺ;->᩸:Ll/۟ۚܺ;

    sget-object v1, Ll/۟ۚܺ;->ۤ:Ll/۟ۚܺ;

    if-ne v0, v1, :cond_0

    .line 1493
    iget p1, p0, Ll/֨֡ܺ;->᩹:F

    mul-float p1, p1, p2

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    return p1

    .line 1495
    :cond_0
    invoke-virtual {p0, p1}, Ll/֨֡ܺ;->ۧ(Ll/ᩴ֨ܺ;)F

    move-result p1

    return p1
.end method

.method public final ֫()Z
    .locals 2

    .line 1531
    iget v0, p0, Ll/֨֡ܺ;->᩹:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Ll/ᩴ֨ܺ;)F
    .locals 2

    .line 1428
    iget-object v0, p0, Ll/֨֡ܺ;->᩸:Ll/۟ۚܺ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget v1, p0, Ll/֨֡ܺ;->᩹:F

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1447
    :pswitch_0
    invoke-virtual {p1}, Ll/ᩴ֨ܺ;->ܽ()Ll/ܿ֡ܺ;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 1450
    :cond_0
    iget p1, p1, Ll/ܿ֡ܺ;->ᩳ:F

    mul-float v1, v1, p1

    const/high16 p1, 0x42c80000    # 100.0f

    div-float/2addr v1, p1

    return v1

    .line 1445
    :pswitch_1
    invoke-virtual {p1}, Ll/ᩴ֨ܺ;->ᩳ()F

    move-result p1

    mul-float v1, v1, p1

    const/high16 p1, 0x40c00000    # 6.0f

    div-float/2addr v1, p1

    return v1

    .line 1443
    :pswitch_2
    invoke-virtual {p1}, Ll/ᩴ֨ܺ;->ᩳ()F

    move-result p1

    mul-float v1, v1, p1

    const/high16 p1, 0x42900000    # 72.0f

    div-float/2addr v1, p1

    return v1

    .line 1441
    :pswitch_3
    invoke-virtual {p1}, Ll/ᩴ֨ܺ;->ᩳ()F

    move-result p1

    mul-float v1, v1, p1

    const p1, 0x41cb3333    # 25.4f

    div-float/2addr v1, p1

    return v1

    .line 1439
    :pswitch_4
    invoke-virtual {p1}, Ll/ᩴ֨ܺ;->ᩳ()F

    move-result p1

    mul-float v1, v1, p1

    const p1, 0x40228f5c    # 2.54f

    div-float/2addr v1, p1

    return v1

    .line 1437
    :pswitch_5
    invoke-virtual {p1}, Ll/ᩴ֨ܺ;->ᩳ()F

    move-result p1

    mul-float v1, v1, p1

    return v1

    .line 1435
    :pswitch_6
    invoke-virtual {p1}, Ll/ᩴ֨ܺ;->ۧ()F

    move-result p1

    mul-float v1, v1, p1

    return v1

    .line 1433
    :pswitch_7
    invoke-virtual {p1}, Ll/ᩴ֨ܺ;->֫()F

    move-result p1

    mul-float v1, v1, p1

    :goto_0
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ܽ(Ll/ᩴ֨ܺ;)F
    .locals 2

    .line 1459
    iget-object v0, p0, Ll/֨֡ܺ;->᩸:Ll/۟ۚܺ;

    sget-object v1, Ll/۟ۚܺ;->ۤ:Ll/۟ۚܺ;

    if-ne v0, v1, :cond_1

    .line 1460
    invoke-virtual {p1}, Ll/ᩴ֨ܺ;->ܽ()Ll/ܿ֡ܺ;

    move-result-object p1

    .line 1461
    iget v0, p0, Ll/֨֡ܺ;->᩹:F

    if-nez p1, :cond_0

    return v0

    .line 1463
    :cond_0
    iget p1, p1, Ll/ܿ֡ܺ;->֫:F

    mul-float v0, v0, p1

    const/high16 p1, 0x42c80000    # 100.0f

    div-float/2addr v0, p1

    return v0

    .line 1465
    :cond_1
    invoke-virtual {p0, p1}, Ll/֨֡ܺ;->ۧ(Ll/ᩴ֨ܺ;)F

    move-result p1

    return p1
.end method

.method public final ܽ()Z
    .locals 2

    .line 1526
    iget v0, p0, Ll/֨֡ܺ;->᩹:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
