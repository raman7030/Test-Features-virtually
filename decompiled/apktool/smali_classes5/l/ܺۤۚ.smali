.class public final Ll/ܺۤۚ;
.super Ll/ۜۨۚ;
.source "H7CN"

# interfaces
.implements Ll/۫ۛۚ;


# instance fields
.field public ۙ:Ll/ۖۤۚ;

.field public ᩶:Ll/ۙۛۚ;

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(ILl/ۖۤۚ;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ll/ۜۨۚ;-><init>()V

    .line 35
    sget-object v0, Ll/ۙۛۚ;->ۗ:Ll/ۙۛۚ;

    iput-object v0, p0, Ll/ܺۤۚ;->᩶:Ll/ۙۛۚ;

    .line 40
    iput p1, p0, Ll/ۜۨۚ;->᩸:I

    .line 41
    iput-object p2, p0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 97
    :cond_0
    instance-of v1, p1, Ll/ܺۤۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 98
    :cond_1
    check-cast p1, Ll/ܺۤۚ;

    .line 99
    iget-object v1, p0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    iget-object v3, p1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ܺۤۚ;->᩶:Ll/ۙۛۚ;

    iget-object v3, p1, Ll/ܺۤۚ;->᩶:Ll/ۙۛۚ;

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ۜۨۚ;->᩸:I

    iget p1, p1, Ll/ۜۨۚ;->᩸:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final getLength()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 120
    invoke-super {p0}, Ll/ۜۨۚ;->hashCode()I

    move-result v0

    .line 121
    iget-object v1, p0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۖۤۚ;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۜۨۚ;->᩸:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const-string v1, "?"

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;
    .locals 0

    .line 132
    invoke-static {p0, p1}, Ll/۬ۛۚ;->֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)V

    return-object p0
.end method

.method public final ֫(I)V
    .locals 0

    .line 56
    iput p1, p0, Ll/ܺۤۚ;->᩹:I

    return-void
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 83
    iget v0, p0, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 62
    invoke-super {p0}, Ll/ۜۨۚ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-eqz v0, :cond_0

    iget-object v1, v0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    if-nez v1, :cond_1

    :cond_0
    instance-of v0, v0, Ll/᩶ۛۚ;

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 104
    :cond_0
    instance-of v0, p1, Ll/ܺۤۚ;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 105
    :cond_1
    check-cast p1, Ll/ܺۤۚ;

    .line 107
    iget-object v0, p0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    iget-object p1, p1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    if-eqz v0, :cond_4

    if-eqz p1, :cond_3

    .line 110
    invoke-virtual {v0, p1}, Ll/ۖۤۚ;->֫(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    return v1

    .line 114
    :cond_4
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 53
    iget v0, p0, Ll/ܺۤۚ;->᩹:I

    return v0
.end method

.method public final ᩳ()Ll/ۧۤۚ;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    if-nez v0, :cond_0

    sget-object v0, Ll/ۧۤۚ;->۫֫:Ll/ۧۤۚ;

    return-object v0

    :cond_0
    iget-object v0, v0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    return-object v0
.end method
