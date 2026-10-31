.class public final Ll/ᩴۘܽ;
.super Ljava/lang/Object;
.source "81EW"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۜ:I

.field public ۢ:I

.field public ۧ:I

.field public ܳ:Ljava/lang/String;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_d

    .line 512
    const-class v2, Ll/ᩴۘܽ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    .line 514
    :cond_1
    check-cast p1, Ll/ᩴۘܽ;

    .line 516
    iget v2, p0, Ll/ᩴۘܽ;->ᩳ:I

    iget v3, p1, Ll/ᩴۘܽ;->ᩳ:I

    if-eq v2, v3, :cond_2

    return v1

    .line 517
    :cond_2
    iget v2, p0, Ll/ᩴۘܽ;->ۧ:I

    iget v3, p1, Ll/ᩴۘܽ;->ۧ:I

    if-eq v2, v3, :cond_3

    return v1

    .line 518
    :cond_3
    iget v2, p0, Ll/ᩴۘܽ;->ܿ:I

    iget v3, p1, Ll/ᩴۘܽ;->ܿ:I

    if-eq v2, v3, :cond_4

    return v1

    .line 519
    :cond_4
    iget v2, p0, Ll/ᩴۘܽ;->ܽ:I

    iget v3, p1, Ll/ᩴۘܽ;->ܽ:I

    if-eq v2, v3, :cond_5

    return v1

    .line 520
    :cond_5
    iget v2, p0, Ll/ᩴۘܽ;->᩷:I

    iget v3, p1, Ll/ᩴۘܽ;->᩷:I

    if-eq v2, v3, :cond_6

    return v1

    .line 521
    :cond_6
    iget v2, p0, Ll/ᩴۘܽ;->᩻:I

    iget v3, p1, Ll/ᩴۘܽ;->᩻:I

    if-eq v2, v3, :cond_7

    return v1

    .line 522
    :cond_7
    iget v2, p0, Ll/ᩴۘܽ;->ۢ:I

    iget v3, p1, Ll/ᩴۘܽ;->ۢ:I

    if-eq v2, v3, :cond_8

    return v1

    .line 523
    :cond_8
    iget v2, p0, Ll/ᩴۘܽ;->ۜ:I

    iget v3, p1, Ll/ᩴۘܽ;->ۜ:I

    if-eq v2, v3, :cond_9

    return v1

    .line 524
    :cond_9
    iget-object v2, p0, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    if-eqz v2, :cond_a

    iget-object v3, p1, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_0

    :cond_a
    iget-object v2, p1, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_0
    return v1

    .line 525
    :cond_b
    iget-object v2, p0, Ll/ᩴۘܽ;->ܳ:Ljava/lang/String;

    iget-object p1, p1, Ll/ᩴۘܽ;->ܳ:Ljava/lang/String;

    if-eqz v2, :cond_c

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_c
    if-nez p1, :cond_d

    return v0

    :cond_d
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 530
    iget-object v0, p0, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 531
    iget-object v2, p0, Ll/ᩴۘܽ;->ܳ:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 532
    iget v1, p0, Ll/ᩴۘܽ;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 533
    iget v1, p0, Ll/ᩴۘܽ;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 534
    iget v1, p0, Ll/ᩴۘܽ;->ܿ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 535
    iget v1, p0, Ll/ᩴۘܽ;->ܽ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 536
    iget v1, p0, Ll/ᩴۘܽ;->᩷:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 537
    iget v1, p0, Ll/ᩴۘܽ;->᩻:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 538
    iget v1, p0, Ll/ᩴۘܽ;->ۢ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 539
    iget v1, p0, Ll/ᩴۘܽ;->ۜ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 495
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attribute{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', value=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩴۘܽ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', nameLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩴۘܽ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", nameColumn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩴۘܽ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", nameStartPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩴۘܽ;->ܿ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", nameEndPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩴۘܽ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", valueLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩴۘܽ;->᩷:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", valueColumn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩴۘܽ;->᩻:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", valueStartPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩴۘܽ;->ۢ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", valueEndPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩴۘܽ;->ۜ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 453
    iget-object v0, p0, Ll/ᩴۘܽ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 457
    iget-object v0, p0, Ll/ᩴۘܽ;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 481
    iget v0, p0, Ll/ᩴۘܽ;->᩻:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 477
    iget v0, p0, Ll/ᩴۘܽ;->᩷:I

    return v0
.end method
