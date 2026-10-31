.class public final Ll/ۛᩴ֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public final ֫:J

.field public final ۧ:F

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1420
    new-instance v0, Ll/ۤᩴ֫;

    invoke-direct {v0}, Ll/ۤᩴ֫;-><init>()V

    invoke-virtual {v0}, Ll/ۤᩴ֫;->֫()Ll/ۛᩴ֫;

    const/4 v0, 0x0

    .line 1512
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x1

    .line 1513
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x2

    .line 1514
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x3

    .line 1515
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x4

    .line 1516
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ll/ۤᩴ֫;)V
    .locals 7

    .line 1454
    invoke-static {p1}, Ll/ۤᩴ֫;->ܿ(Ll/ۤᩴ֫;)J

    move-result-wide v0

    invoke-static {p1}, Ll/ۤᩴ֫;->ܽ(Ll/ۤᩴ֫;)J

    move-result-wide v2

    invoke-static {p1}, Ll/ۤᩴ֫;->֫(Ll/ۤᩴ֫;)J

    move-result-wide v4

    invoke-static {p1}, Ll/ۤᩴ֫;->ᩳ(Ll/ۤᩴ֫;)F

    move-result v6

    invoke-static {p1}, Ll/ۤᩴ֫;->ۧ(Ll/ۤᩴ֫;)F

    move-result p1

    .line 1472
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1473
    iput-wide v0, p0, Ll/ۛᩴ֫;->ܿ:J

    .line 1474
    iput-wide v2, p0, Ll/ۛᩴ֫;->ܽ:J

    .line 1475
    iput-wide v4, p0, Ll/ۛᩴ֫;->֫:J

    .line 1476
    iput v6, p0, Ll/ۛᩴ֫;->ᩳ:F

    .line 1477
    iput p1, p0, Ll/ۛᩴ֫;->ۧ:F

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1490
    :cond_0
    instance-of v1, p1, Ll/ۛᩴ֫;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 1493
    :cond_1
    check-cast p1, Ll/ۛᩴ֫;

    .line 1495
    iget-wide v3, p0, Ll/ۛᩴ֫;->ܿ:J

    iget-wide v5, p1, Ll/ۛᩴ֫;->ܿ:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Ll/ۛᩴ֫;->ܽ:J

    iget-wide v5, p1, Ll/ۛᩴ֫;->ܽ:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Ll/ۛᩴ֫;->֫:J

    iget-wide v5, p1, Ll/ۛᩴ֫;->֫:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget v1, p0, Ll/ۛᩴ֫;->ᩳ:F

    iget v3, p1, Ll/ۛᩴ֫;->ᩳ:F

    cmpl-float v1, v1, v3

    if-nez v1, :cond_2

    iget v1, p0, Ll/ۛᩴ֫;->ۧ:F

    iget p1, p1, Ll/ۛᩴ֫;->ۧ:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 7

    .line 1504
    iget-wide v0, p0, Ll/ۛᩴ֫;->ܿ:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 1505
    iget-wide v3, p0, Ll/ۛᩴ֫;->ܽ:J

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v0, v3

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 1506
    iget-wide v3, p0, Ll/ۛᩴ֫;->֫:J

    ushr-long v5, v3, v2

    xor-long v2, v3, v5

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    const/4 v0, 0x0

    .line 1507
    iget v2, p0, Ll/ۛᩴ֫;->ᩳ:F

    const/4 v3, 0x0

    cmpl-float v4, v2, v3

    if-eqz v4, :cond_0

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    .line 1508
    iget v2, p0, Ll/ۛᩴ֫;->ۧ:F

    cmpl-float v3, v2, v3

    if-eqz v3, :cond_1

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()Ll/ۤᩴ֫;
    .locals 1

    .line 1482
    new-instance v0, Ll/ۤᩴ֫;

    invoke-direct {v0, p0}, Ll/ۤᩴ֫;-><init>(Ll/ۛᩴ֫;)V

    return-object v0
.end method
