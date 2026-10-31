.class public final Ll/᩻ܿ֨;
.super Ll/ۨܽ֨;
.source "S7FD"


# instance fields
.field public ᩻ۧ:Ljava/util/ArrayList;


# virtual methods
.method public final ۧ()V
    .locals 6

    .line 65
    iget-object v0, p0, Ll/᩻ܿ֨;->᩻ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 67
    iget-object v1, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    invoke-virtual {v1}, Ll/֨۟ۚ;->ܿ()Z

    move-result v1

    .line 68
    sget-object v2, Ll/ܶۨۚ;->ۚܿ:Ll/ܶۨۚ;

    invoke-virtual {v2}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " {"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 68
    invoke-virtual {p0, v2}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 70
    iget-object v3, p0, Ll/᩻ܿ֨;->᩻ۧ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳܿ֨;

    .line 394
    iget v4, p0, Ll/ۢܽ֨;->᩶:I

    .line 71
    invoke-virtual {p0}, Ll/ۢܽ֨;->ܳ()I

    move-result v5

    add-int/2addr v5, v4

    .line 398
    iput v5, v3, Ll/ۢܽ֨;->᩶:I

    const/4 v4, 0x1

    .line 260
    invoke-virtual {v3, v4}, Ll/ۢܽ֨;->ᩳ(I)V

    if-eqz v1, :cond_0

    .line 72
    invoke-virtual {p0}, Ll/ۢܽ֨;->ۘ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 159
    invoke-virtual {v3, v2, v0}, Ll/ܳܿ֨;->ۧ(II)V

    goto :goto_1

    .line 75
    :cond_0
    invoke-virtual {v3, v2, v0}, Ll/ܳܿ֨;->ۧ(II)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-string v0, "}"

    .line 77
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final ۧ(Ljava/io/DataInputStream;)V
    .locals 5

    .line 51
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    .line 52
    iget-object v1, p0, Ll/ۨܽ֨;->ۛ֫:Ll/᩶ۗۚ;

    const-string v2, "components="

    .line 0
    invoke-static {v0, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    .line 52
    invoke-virtual {v1, v2, v4}, Ll/᩶ۗۚ;->ᩳ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/᩻ܿ֨;->᩻ۧ:Ljava/util/ArrayList;

    :goto_0
    if-ge v3, v0, :cond_0

    .line 55
    iget-object v1, p0, Ll/᩻ܿ֨;->᩻ۧ:Ljava/util/ArrayList;

    new-instance v2, Ll/ܳܿ֨;

    iget-object v4, p0, Ll/ۨܽ֨;->ۤ֫:Ll/ۨܽ֨;

    check-cast v4, Ll/᩷ۧ֨;

    .line 96
    invoke-direct {v2, v4}, Ll/ۨܽ֨;-><init>(Ll/ۨܽ֨;)V

    const-string v4, "RecordData"

    .line 97
    iput-object v4, v2, Ll/ۨܽ֨;->֫ۧ:Ljava/lang/String;

    .line 55
    invoke-virtual {v2, p1}, Ll/ܳܿ֨;->ۧ(Ljava/io/DataInputStream;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
