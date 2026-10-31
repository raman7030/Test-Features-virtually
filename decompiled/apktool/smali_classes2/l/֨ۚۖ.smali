.class public final Ll/֨ۚۖ;
.super Ljava/lang/Object;
.source "V9PU"

# interfaces
.implements Ljava/util/Map$Entry;
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩶:Ljava/lang/Object;

.field public final ᩸:Ljava/lang/Comparable;

.field public final synthetic ᩹:Ll/᩸ۚۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/᩸ۚۖ;Ljava/lang/Comparable;Ljava/lang/Object;)V
    .locals 0

    .line 384
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۚۖ;->᩹:Ll/᩸ۚۖ;

    .line 385
    iput-object p2, p0, Ll/֨ۚۖ;->᩸:Ljava/lang/Comparable;

    .line 386
    iput-object p3, p0, Ll/֨ۚۖ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 375
    check-cast p1, Ll/֨ۚۖ;

    .line 391
    iget-object v0, p0, Ll/֨ۚۖ;->᩸:Ljava/lang/Comparable;

    iget-object p1, p1, Ll/֨ۚۖ;->᩸:Ljava/lang/Comparable;

    .line 401
    invoke-interface {v0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    goto :goto_2

    .line 417
    :cond_0
    instance-of v1, p1, Ljava/util/Map$Entry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto :goto_3

    .line 420
    :cond_1
    check-cast p1, Ljava/util/Map$Entry;

    .line 421
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 436
    iget-object v3, p0, Ll/֨ۚۖ;->᩸:Ljava/lang/Comparable;

    if-nez v3, :cond_3

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    goto :goto_0

    :cond_3
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_6

    .line 421
    iget-object v1, p0, Ll/֨ۚۖ;->᩶:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-nez v1, :cond_5

    if-nez p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    goto :goto_1

    .line 436
    :cond_5
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_6

    :goto_2
    return v0

    :cond_6
    :goto_3
    return v2
.end method

.method public final getKey()Ljava/lang/Comparable;
    .locals 1

    .line 391
    iget-object v0, p0, Ll/֨ۚۖ;->᩸:Ljava/lang/Comparable;

    return-object v0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 391
    iget-object v0, p0, Ll/֨ۚۖ;->᩸:Ljava/lang/Comparable;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 396
    iget-object v0, p0, Ll/֨ۚۖ;->᩶:Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    .line 426
    iget-object v1, p0, Ll/֨ۚۖ;->᩸:Ljava/lang/Comparable;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    iget-object v2, p0, Ll/֨ۚۖ;->᩶:Ljava/lang/Object;

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

    .line 406
    iget-object v0, p0, Ll/֨ۚۖ;->᩹:Ll/᩸ۚۖ;

    invoke-static {v0}, Ll/᩸ۚۖ;->֫(Ll/᩸ۚۖ;)V

    .line 407
    iget-object v0, p0, Ll/֨ۚۖ;->᩶:Ljava/lang/Object;

    .line 408
    iput-object p1, p0, Ll/֨ۚۖ;->᩶:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 431
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/֨ۚۖ;->᩸:Ljava/lang/Comparable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۚۖ;->᩶:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
