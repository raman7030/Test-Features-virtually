.class public final Ll/ܳܿۖ;
.super Ljava/lang/Object;
.source "1AZL"

# interfaces
.implements Ljava/util/Map$Entry;


# instance fields
.field public ۗ:Ll/ܳܿۖ;

.field public ۙ:Ll/ܳܿۖ;

.field public ۛ:Ljava/lang/Object;

.field public ۤ:Ll/ܳܿۖ;

.field public ۫:Ll/ܳܿۖ;

.field public ۬:Ll/ܳܿۖ;

.field public final ᩶:Ljava/lang/Object;

.field public final ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 481
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 482
    iput-object v0, p0, Ll/ܳܿۖ;->᩶:Ljava/lang/Object;

    .line 483
    iput-boolean p1, p0, Ll/ܳܿۖ;->᩸:Z

    .line 484
    iput-object p0, p0, Ll/ܳܿۖ;->۫:Ll/ܳܿۖ;

    iput-object p0, p0, Ll/ܳܿۖ;->ۗ:Ll/ܳܿۖ;

    return-void
.end method

.method public constructor <init>(ZLl/ܳܿۖ;Ljava/lang/Object;Ll/ܳܿۖ;Ll/ܳܿۖ;)V
    .locals 0

    .line 488
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 489
    iput-object p2, p0, Ll/ܳܿۖ;->۬:Ll/ܳܿۖ;

    .line 490
    iput-object p3, p0, Ll/ܳܿۖ;->᩶:Ljava/lang/Object;

    .line 491
    iput-boolean p1, p0, Ll/ܳܿۖ;->᩸:Z

    const/4 p1, 0x1

    .line 492
    iput p1, p0, Ll/ܳܿۖ;->᩹:I

    .line 493
    iput-object p4, p0, Ll/ܳܿۖ;->ۗ:Ll/ܳܿۖ;

    .line 494
    iput-object p5, p0, Ll/ܳܿۖ;->۫:Ll/ܳܿۖ;

    .line 495
    iput-object p0, p5, Ll/ܳܿۖ;->ۗ:Ll/ܳܿۖ;

    .line 496
    iput-object p0, p4, Ll/ܳܿۖ;->۫:Ll/ܳܿۖ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 521
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 522
    check-cast p1, Ljava/util/Map$Entry;

    .line 523
    iget-object v0, p0, Ll/ܳܿۖ;->᩶:Ljava/lang/Object;

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    iget-object v0, p0, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    if-nez v0, :cond_1

    .line 524
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 501
    iget-object v0, p0, Ll/ܳܿۖ;->᩶:Ljava/lang/Object;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 506
    iget-object v0, p0, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 531
    iget-object v1, p0, Ll/ܳܿۖ;->᩶:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    iget-object v2, p0, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_1

    .line 511
    iget-boolean v0, p0, Ll/ܳܿۖ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 512
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "value == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 514
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    .line 515
    iput-object p1, p0, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 536
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܳܿۖ;->᩶:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳܿۖ;->ۛ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
