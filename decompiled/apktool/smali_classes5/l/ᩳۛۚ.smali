.class public Ll/ᩳۛۚ;
.super Ll/ۖۤۚ;
.source "K3OA"


# instance fields
.field public ܽ:Ll/ۢ۫ۚ;


# direct methods
.method public constructor <init>(Ll/ۧۤۚ;Ll/ۢ۫ۚ;Ll/ܺۤۚ;)V
    .locals 0

    .line 988
    invoke-direct {p0, p1, p3}, Ll/ۖۤۚ;-><init>(Ll/ۧۤۚ;Ljava/lang/Object;)V

    .line 989
    iput-object p2, p0, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1008
    :cond_0
    instance-of v0, p1, Ll/ᩳۛۚ;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 1009
    :cond_1
    invoke-super {p0, p1}, Ll/ۖۤۚ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    .line 1010
    :cond_2
    check-cast p1, Ll/ᩳۛۚ;

    .line 1011
    iget-object v0, p0, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    iget-object p1, p1, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    invoke-virtual {v0, p1}, Ll/ۢ۫ۚ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1025
    invoke-super {p0}, Ll/ۖۤۚ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 1026
    iget-object v1, p0, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    invoke-virtual {v1}, Ll/ۢ۫ۚ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1037
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/ۖۤۚ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 1042
    invoke-super {p0, p1}, Ll/ۖۤۚ;->֫(Ll/֡۫ۚ;)V

    .line 1043
    iget-object v0, p0, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 1044
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final ֫(Ll/ۢ۫ۚ;I)V
    .locals 0

    .line 997
    iput-object p1, p0, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    .line 998
    iput p2, p1, Ll/ۜۨۚ;->᩸:I

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1017
    :cond_0
    instance-of v0, p1, Ll/ᩳۛۚ;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 1018
    :cond_1
    invoke-super {p0, p1}, Ll/ۖۤۚ;->֫(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    .line 1019
    :cond_2
    check-cast p1, Ll/ᩳۛۚ;

    .line 1020
    iget-object v0, p0, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    iget-object p1, p1, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    invoke-virtual {v0, p1}, Ll/ۢ۫ۚ;->֫(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ܽ()Ll/ۢ۫ۚ;
    .locals 1

    .line 993
    iget-object v0, p0, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1032
    iget-object v0, p0, Ll/ᩳۛۚ;->ܽ:Ll/ۢ۫ۚ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
