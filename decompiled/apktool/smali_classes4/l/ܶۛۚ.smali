.class public Ll/ܶۛۚ;
.super Ll/ۖۤۚ;
.source "K3OA"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ۧۤۚ;Ll/ܺۤۚ;Ll/ܺۤۚ;)V
    .locals 1

    .line 829
    new-instance v0, Ll/ۜۗۚ;

    invoke-direct {v0, p2, p3}, Ll/ۜۗۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 825
    invoke-direct {p0, p1, v0}, Ll/ۖۤۚ;-><init>(Ll/ۧۤۚ;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 842
    :cond_0
    instance-of v1, p1, Ll/ܶۛۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 843
    :cond_1
    check-cast p1, Ll/ܶۛۚ;

    .line 844
    iget-object v1, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    iget-object v3, p1, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    if-ne v1, v3, :cond_2

    .line 845
    iget-object v1, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/ۜۗۚ;

    iget-object v1, v1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    iget-object v3, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v3, Ll/ۜۗۚ;

    iget-object v3, v3, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ll/ܺۤۚ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/ۜۗۚ;

    iget-object v1, v1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    iget-object p1, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ll/ۜۗۚ;

    iget-object p1, p1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    .line 846
    invoke-virtual {v1, p1}, Ll/ܺۤۚ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 869
    iget-object v0, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    invoke-virtual {v0}, Ll/ۧۤۚ;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/ۜۗۚ;

    iget-object v1, v1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    invoke-virtual {v1}, Ll/ܺۤۚ;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v2, Ll/ۜۗۚ;

    iget-object v2, v2, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v2, Ll/ܺۤۚ;

    invoke-virtual {v2}, Ll/ܺۤۚ;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/֡۫ۚ;)V
    .locals 2

    .line 874
    invoke-super {p0, p1}, Ll/ۖۤۚ;->֫(Ll/֡۫ۚ;)V

    .line 875
    iget-object v0, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    sget-object v1, Ll/ۧۤۚ;->۠֫:Ll/ۧۤۚ;

    if-ne v0, v1, :cond_0

    .line 876
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۜۗۚ;

    iget-object v0, v0, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    move-object v1, p1

    check-cast v1, Ll/ۛ۫ۚ;

    invoke-virtual {v1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    goto :goto_0

    .line 878
    :cond_0
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۜۗۚ;

    iget-object v0, v0, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    move-object v1, p1

    check-cast v1, Ll/ۛ۫ۚ;

    invoke-virtual {v1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 880
    :goto_0
    iget-object v0, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۜۗۚ;

    iget-object v0, v0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public ֫(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 856
    :cond_0
    instance-of v1, p1, Ll/ܶۛۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 857
    :cond_1
    check-cast p1, Ll/ܶۛۚ;

    .line 858
    iget-object v1, p0, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    iget-object v3, p1, Ll/ۖۤۚ;->֫:Ll/ۧۤۚ;

    if-ne v1, v3, :cond_2

    .line 859
    iget-object v1, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/ۜۗۚ;

    iget-object v1, v1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    iget-object v3, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v3, Ll/ۜۗۚ;

    iget-object v3, v3, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ll/ܺۤۚ;->֫(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/ۜۗۚ;

    iget-object v1, v1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    iget-object p1, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ll/ۜۗۚ;

    iget-object p1, p1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    .line 860
    invoke-virtual {v1, p1}, Ll/ܺۤۚ;->֫(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method
