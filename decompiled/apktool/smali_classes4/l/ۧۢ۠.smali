.class public final Ll/ۧۢ۠;
.super Ll/۟᩷۠;
.source "O44L"


# instance fields
.field public ܽ:Ll/ۛ֡֨;

.field public final synthetic ܿ:Ll/ܳۢ۠;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ܳۢ۠;Ll/ۛ֡֨;Z)V
    .locals 1

    .line 511
    iput-object p1, p0, Ll/ۧۢ۠;->ܿ:Ll/ܳۢ۠;

    .line 512
    iget-object v0, p1, Ll/ܳۢ۠;->ܳ:Ll/ۛ᩸֨;

    invoke-virtual {p2, v0}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v0

    invoke-static {v0}, Ll/֨᩷۠;->֫(Ll/ۙ֨֨;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Ll/۟᩷۠;-><init>(Ll/ܳۢ۠;I)V

    .line 513
    iput-object p2, p0, Ll/ۧۢ۠;->ܽ:Ll/ۛ֡֨;

    .line 514
    iput-boolean p3, p0, Ll/ۧۢ۠;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 556
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "member("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۧۢ۠;->ܽ:Ll/ۛ֡֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ۧۢ۠;->ᩳ:Z

    if-eqz v1, :cond_0

    const-string v1, " nonvirtual)"

    goto :goto_0

    :cond_0
    const-string v1, ")"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 2

    .line 544
    iget-object v0, p0, Ll/ۧۢ۠;->ܿ:Ll/ܳۢ۠;

    invoke-static {v0}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ll/۟᩷۠;->֫()V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 540
    iget-object v0, p0, Ll/ۧۢ۠;->ܿ:Ll/ܳۢ۠;

    invoke-static {v0}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ll/۟᩷۠;->ۧ()V

    return-void
.end method

.method public final ۧ(I)V
    .locals 2

    .line 548
    iget-object v0, p0, Ll/ۧۢ۠;->ܿ:Ll/ܳۢ۠;

    invoke-static {v0}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Ll/۟᩷۠;->ۧ(I)V

    return-void
.end method

.method public final ܳ()V
    .locals 4

    .line 523
    iget-object v0, p0, Ll/ۧۢ۠;->ܿ:Ll/ܳۢ۠;

    iget-object v0, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    .line 1002
    iget-object v1, v0, Ll/֨᩷۠;->ۙ:Ll/۫ۢ۠;

    .line 125
    iget-object v1, v1, Ll/۫ۢ۠;->ᩳ:Ll/۬ۢ۠;

    iget-object v2, p0, Ll/ۧۢ۠;->ܽ:Ll/ۛ֡֨;

    invoke-static {v1, v2}, Ll/۬ۢ۠;->֫(Ll/۬ۢ۠;Ll/᩸ۢ۠;)I

    move-result v1

    const/16 v3, 0xb5

    .line 1003
    invoke-virtual {v0, v3, v1, v2}, Ll/֨᩷۠;->֫(IILl/᩸ۢ۠;)V

    return-void
.end method

.method public final ܽ()Ll/۟᩷۠;
    .locals 11

    .line 527
    iget-object v0, p0, Ll/ۧۢ۠;->ܿ:Ll/ܳۢ۠;

    iget-object v1, v0, Ll/ܳۢ۠;->ܳ:Ll/ۛ᩸֨;

    iget-object v2, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    iget-object v3, p0, Ll/ۧۢ۠;->ܽ:Ll/ۛ֡֨;

    invoke-virtual {v3, v1}, Ll/ۛ֡֨;->ᩳ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v1

    check-cast v1, Ll/ۧ֨֨;

    .line 528
    iget-object v4, v1, Ll/ۧ֨֨;->ۨ:Ll/ۙ֨֨;

    invoke-static {v4}, Ll/֨᩷۠;->֫(Ll/ۙ֨֨;)I

    move-result v4

    .line 529
    iget-object v5, v3, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v5}, Ll/ۛ֡֨;->۬()J

    move-result-wide v5

    const-wide/16 v7, 0x200

    and-long/2addr v5, v7

    const-wide/16 v7, 0x0

    iget-boolean v9, p0, Ll/ۧۢ۠;->ᩳ:Z

    cmp-long v10, v5, v7

    if-eqz v10, :cond_0

    if-nez v9, :cond_0

    .line 530
    invoke-virtual {v2, v3, v1}, Ll/֨᩷۠;->֫(Ll/ۛ֡֨;Ll/ۧ֨֨;)V

    goto :goto_0

    :cond_0
    if-eqz v9, :cond_1

    .line 532
    invoke-virtual {v2, v3, v1}, Ll/֨᩷۠;->ۧ(Ll/ۛ֡֨;Ll/ۧ֨֨;)V

    goto :goto_0

    .line 534
    :cond_1
    invoke-virtual {v2, v3, v1}, Ll/֨᩷۠;->ᩳ(Ll/ۛ֡֨;Ll/ۧ֨֨;)V

    .line 536
    :goto_0
    invoke-static {v0}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    aget-object v0, v0, v4

    return-object v0
.end method

.method public final ᩳ()Ll/۟᩷۠;
    .locals 5

    .line 518
    iget-object v0, p0, Ll/ۧۢ۠;->ܿ:Ll/ܳۢ۠;

    iget-object v1, v0, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    .line 1002
    iget-object v2, v1, Ll/֨᩷۠;->ۙ:Ll/۫ۢ۠;

    .line 125
    iget-object v2, v2, Ll/۫ۢ۠;->ᩳ:Ll/۬ۢ۠;

    iget-object v3, p0, Ll/ۧۢ۠;->ܽ:Ll/ۛ֡֨;

    invoke-static {v2, v3}, Ll/۬ۢ۠;->֫(Ll/۬ۢ۠;Ll/᩸ۢ۠;)I

    move-result v2

    const/16 v4, 0xb4

    .line 1003
    invoke-virtual {v1, v4, v2, v3}, Ll/֨᩷۠;->֫(IILl/᩸ۢ۠;)V

    .line 519
    invoke-static {v0}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    iget v1, p0, Ll/۟᩷۠;->ۧ:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
