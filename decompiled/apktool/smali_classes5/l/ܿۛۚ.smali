.class public Ll/ܿۛۚ;
.super Ll/ۖۤۚ;
.source "K3OA"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 767
    :cond_0
    instance-of v1, p1, Ll/ܿۛۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 768
    :cond_1
    check-cast p1, Ll/ܿۛۚ;

    .line 769
    iget-object v1, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    iget-object v3, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    iget-object p1, p1, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 759
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    check-cast v0, Ll/ܺۤۚ;

    invoke-virtual {v0}, Ll/ܺۤۚ;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 760
    iget-object v1, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 743
    iget-object v0, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    invoke-virtual {v0}, Ll/ۧۤۚ;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    invoke-virtual {v1}, Ll/ܺۤۚ;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, " "

    const-string v3, "]"

    const-string v4, "["

    .line 0
    invoke-static {v4, v0, v2, v1, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 748
    invoke-super {p0, p1}, Ll/ۖۤۚ;->֫(Ll/֡۫ۚ;)V

    .line 749
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    invoke-virtual {v0, p1}, Ll/ܺۤۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method
