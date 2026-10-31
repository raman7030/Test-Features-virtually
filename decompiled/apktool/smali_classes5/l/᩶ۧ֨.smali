.class public final Ll/᩶ۧ֨;
.super Ll/ۗۧ֨;
.source "K3OA"


# instance fields
.field public final synthetic ܳ:Ll/ۤۧ֨;


# direct methods
.method public constructor <init>(Ll/ۤۧ֨;Ll/۫ۧ֨;J)V
    .locals 0

    .line 823
    iput-object p1, p0, Ll/᩶ۧ֨;->ܳ:Ll/ۤۧ֨;

    .line 824
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Ll/ۗۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֨۬ۚ;I)V
    .locals 1

    .line 835
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->֫(Ll/֨۬ۚ;I)V

    .line 836
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩶ۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ۧ(Ll/֨۬ۚ;I)V
    .locals 1

    .line 841
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->ۧ(Ll/֨۬ۚ;I)V

    .line 843
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩶ۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 10

    .line 829
    iget-object v0, p0, Ll/᩶ۧ֨;->ܳ:Ll/ۤۧ֨;

    invoke-static {v0}, Ll/ۤۧ֨;->֫(Ll/ۤۧ֨;)Ll/᩷ۧ֨;

    move-result-object v0

    iget-boolean v0, v0, Ll/ۢܽ֨;->ܽ֫:Z

    const/16 v1, 0x6c

    iget-object v2, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sget v4, Ll/᩻ۗۚ;->֫:I

    const/16 v4, 0x10

    :goto_0
    if-lez v4, :cond_1

    add-int/lit8 v5, v4, -0x1

    mul-int/lit8 v5, v5, 0x4

    shr-long v5, v2, v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    invoke-static {v4, v2, v3}, Ll/᩻ۗۚ;->֫(IJ)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 829
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
