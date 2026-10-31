.class public final Ll/ۘܶۡ;
.super Ljava/lang/Object;
.source "316P"


# instance fields
.field public final ֫:Landroid/graphics/drawable/Drawable;

.field public final ۜ:I

.field public final ۢ:Ljava/lang/String;

.field public final ۧ:I

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:J

.field public final ᩷:J

.field public final ᩻:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIILandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    const-string v0, "label"

    .line 5
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 349
    iput-object p1, p0, Ll/ۘܶۡ;->ܳ:Ljava/lang/String;

    .line 350
    iput-object p2, p0, Ll/ۘܶۡ;->ܽ:Ljava/lang/String;

    .line 351
    iput-object p3, p0, Ll/ۘܶۡ;->ۢ:Ljava/lang/String;

    .line 352
    iput-wide p4, p0, Ll/ۘܶۡ;->᩷:J

    .line 353
    iput-wide p6, p0, Ll/ۘܶۡ;->ᩳ:J

    .line 354
    iput p8, p0, Ll/ۘܶۡ;->ۜ:I

    .line 355
    iput p9, p0, Ll/ۘܶۡ;->ܿ:I

    .line 356
    iput-object p10, p0, Ll/ۘܶۡ;->֫:Landroid/graphics/drawable/Drawable;

    .line 357
    iput-object p11, p0, Ll/ۘܶۡ;->᩻:Landroid/graphics/drawable/Drawable;

    .line 358
    iput p12, p0, Ll/ۘܶۡ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 0
    :cond_0
    instance-of v1, p1, Ll/ۘܶۡ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll/ۘܶۡ;

    iget-object v1, p0, Ll/ۘܶۡ;->ܳ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۘܶۡ;->ܳ:Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ll/ۘܶۡ;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۘܶۡ;->ܽ:Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ll/ۘܶۡ;->ۢ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۘܶۡ;->ۢ:Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Ll/ۘܶۡ;->᩷:J

    iget-wide v5, p1, Ll/ۘܶۡ;->᩷:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Ll/ۘܶۡ;->ᩳ:J

    iget-wide v5, p1, Ll/ۘܶۡ;->ᩳ:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Ll/ۘܶۡ;->ۜ:I

    iget v3, p1, Ll/ۘܶۡ;->ۜ:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Ll/ۘܶۡ;->ܿ:I

    iget v3, p1, Ll/ۘܶۡ;->ܿ:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ll/ۘܶۡ;->֫:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Ll/ۘܶۡ;->֫:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ll/ۘܶۡ;->᩻:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Ll/ۘܶۡ;->᩻:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Ll/ۘܶۡ;->ۧ:I

    iget p1, p1, Ll/ۘܶۡ;->ۧ:I

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 6

    .line 2
    iget-object v0, p0, Ll/ۘܶۡ;->ܳ:Ljava/lang/String;

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 12
    iget-object v2, p0, Ll/ۘܶۡ;->ܽ:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Ll/ۘܶۡ;->ۢ:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    iget-wide v1, p0, Ll/ۘܶۡ;->᩷:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll/ۘܶۡ;->ᩳ:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۘܶۡ;->ۜ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۘܶۡ;->ܿ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۘܶۡ;->֫:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ۘܶۡ;->᩻:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۘܶۡ;->ۧ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", label="

    const-string v1, ", versionName="

    const-string v2, "ApkInfo(packageName="

    .line 0
    iget-object v3, p0, Ll/ۘܶۡ;->ܳ:Ljava/lang/String;

    iget-object v4, p0, Ll/ۘܶۡ;->ܽ:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ll/ۘܶۡ;->ۢ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", versionCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۘܶۡ;->᩷:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۘܶۡ;->ᩳ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", targetSdk="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", minimumSdk="

    const-string v2, ", icon="

    iget v3, p0, Ll/ۘܶۡ;->ۜ:I

    iget v4, p0, Ll/ۘܶۡ;->ܿ:I

    invoke-static {v0, v3, v1, v4, v2}, Ll/ۛۙܽ;->֫(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    iget-object v1, p0, Ll/ۘܶۡ;->֫:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rawIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۘܶۡ;->᩻:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconRes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    iget v2, p0, Ll/ۘܶۡ;->ۧ:I

    invoke-static {v2, v1, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 356
    iget-object v0, p0, Ll/ۘܶۡ;->֫:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final ۜ()I
    .locals 1

    .line 354
    iget v0, p0, Ll/ۘܶۡ;->ۜ:I

    return v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 351
    iget-object v0, p0, Ll/ۘܶۡ;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 358
    iget v0, p0, Ll/ۘܶۡ;->ۧ:I

    return v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 349
    iget-object v0, p0, Ll/ۘܶۡ;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 350
    iget-object v0, p0, Ll/ۘܶۡ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 355
    iget v0, p0, Ll/ۘܶۡ;->ܿ:I

    return v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 353
    iget-wide v0, p0, Ll/ۘܶۡ;->ᩳ:J

    return-wide v0
.end method

.method public final ᩷()J
    .locals 2

    .line 352
    iget-wide v0, p0, Ll/ۘܶۡ;->᩷:J

    return-wide v0
.end method

.method public final ᩻()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 357
    iget-object v0, p0, Ll/ۘܶۡ;->᩻:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method
