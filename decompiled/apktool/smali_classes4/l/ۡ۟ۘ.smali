.class public final Ll/ۡ۟ۘ;
.super Ll/ܿܰۘ;
.source "5SO"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ۗ:Ll/ۡ۟ۘ;

.field public ۙ:Ll/ۡ۟ۘ;

.field public ᩶:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 677
    invoke-direct {p0, v0, v1}, Ll/ܿܰۘ;-><init>(CLjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(CLjava/lang/Object;)V
    .locals 0

    .line 687
    invoke-direct {p0, p1, p2}, Ll/ܿܰۘ;-><init>(CLjava/lang/Object;)V

    const/high16 p1, -0x40000000    # -2.0f

    .line 688
    iput p1, p0, Ll/ۡ۟ۘ;->᩶:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 661
    invoke-virtual {p0}, Ll/ۡ۟ۘ;->clone()Ll/ۡ۟ۘ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ۡ۟ۘ;
    .locals 2

    .line 850
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡ۟ۘ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 854
    iget-char v1, p0, Ll/ܿܰۘ;->᩸:C

    iput-char v1, v0, Ll/ܿܰۘ;->᩸:C

    .line 855
    iget-object v1, p0, Ll/ܿܰۘ;->᩹:Ljava/lang/Object;

    iput-object v1, v0, Ll/ܿܰۘ;->᩹:Ljava/lang/Object;

    .line 856
    iget v1, p0, Ll/ۡ۟ۘ;->᩶:I

    iput v1, v0, Ll/ۡ۟ۘ;->᩶:I

    return-object v0

    .line 852
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 863
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 864
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 865
    iget-char v0, p0, Ll/ܿܰۘ;->᩸:C

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Character;

    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v2

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Ll/ܿܰۘ;->᩹:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 870
    iget-char v0, p0, Ll/ܿܰۘ;->᩸:C

    iget-object v1, p0, Ll/ܿܰۘ;->᩹:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 840
    iget-object v0, p0, Ll/ܿܰۘ;->᩹:Ljava/lang/Object;

    .line 841
    iput-object p1, p0, Ll/ܿܰۘ;->᩹:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 875
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-char v1, p0, Ll/ܿܰۘ;->᩸:C

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "=>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿܰۘ;->᩹:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 802
    iget v0, p0, Ll/ۡ۟ۘ;->᩶:I

    and-int/lit16 v0, v0, -0x100

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v0

    .line 803
    iput p1, p0, Ll/ۡ۟ۘ;->᩶:I

    return-void
.end method

.method public final ֫(Ll/ۡ۟ۘ;)V
    .locals 2

    .line 753
    iget v0, p0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v1, 0x40000000    # 2.0f

    or-int/2addr v0, v1

    iput v0, p0, Ll/ۡ۟ۘ;->᩶:I

    .line 754
    iput-object p1, p0, Ll/ۡ۟ۘ;->ۙ:Ll/ۡ۟ۘ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 733
    iget p1, p0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v0, 0x40000000    # 2.0f

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۡ۟ۘ;->᩶:I

    return-void

    .line 734
    :cond_0
    iget p1, p0, Ll/ۡ۟ۘ;->᩶:I

    const v0, -0x40000001    # -1.9999999f

    and-int/2addr p1, v0

    iput p1, p0, Ll/ۡ۟ۘ;->᩶:I

    return-void
.end method

.method public final ۖ()Ll/ۡ۟ۘ;
    .locals 2

    .line 706
    iget v0, p0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۡ۟ۘ;->ۗ:Ll/ۡ۟ۘ;

    return-object v0
.end method

.method public final ۘ()Z
    .locals 2

    .line 724
    iget v0, p0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ll/ۡ۟ۘ;
    .locals 3

    .line 833
    iget-object v0, p0, Ll/ۡ۟ۘ;->ۙ:Ll/ۡ۟ۘ;

    .line 834
    iget v1, p0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v2, 0x40000000    # 2.0f

    and-int/2addr v1, v2

    if-nez v1, :cond_0

    :goto_0
    iget v1, v0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-nez v1, :cond_0

    iget-object v0, v0, Ll/ۡ۟ۘ;->ۗ:Ll/ۡ۟ۘ;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۧ(Ll/ۡ۟ۘ;)V
    .locals 2

    .line 763
    iget v0, p0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Ll/ۡ۟ۘ;->᩶:I

    .line 764
    iput-object p1, p0, Ll/ۡ۟ۘ;->ۗ:Ll/ۡ۟ۘ;

    return-void
.end method

.method public final ܳ()Z
    .locals 2

    .line 715
    iget v0, p0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v1, 0x40000000    # 2.0f

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ll/ۡ۟ۘ;
    .locals 2

    .line 697
    iget v0, p0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v1, 0x40000000    # 2.0f

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۡ۟ۘ;->ۙ:Ll/ۡ۟ۘ;

    return-object v0
.end method

.method public final ܽ(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 743
    iget p1, p0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۡ۟ۘ;->᩶:I

    return-void

    .line 744
    :cond_0
    iget p1, p0, Ll/ۡ۟ۘ;->᩶:I

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    iput p1, p0, Ll/ۡ۟ۘ;->᩶:I

    return-void
.end method

.method public final ᩳ()Ll/ۡ۟ۘ;
    .locals 3

    .line 822
    iget-object v0, p0, Ll/ۡ۟ۘ;->ۗ:Ll/ۡ۟ۘ;

    .line 823
    iget v1, p0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-nez v1, :cond_0

    :goto_0
    iget v1, v0, Ll/ۡ۟ۘ;->᩶:I

    const/high16 v2, 0x40000000    # 2.0f

    and-int/2addr v1, v2

    if-nez v1, :cond_0

    iget-object v0, v0, Ll/ۡ۟ۘ;->ۙ:Ll/ۡ۟ۘ;

    goto :goto_0

    :cond_0
    return-object v0
.end method
