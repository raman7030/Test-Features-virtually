.class public final Ll/᩹ۧ֨;
.super Ll/ۗۧ֨;
.source "K3OA"


# instance fields
.field public final synthetic ܳ:Ll/ۤۧ֨;


# direct methods
.method public constructor <init>(Ll/ۤۧ֨;Ll/۫ۧ֨;I)V
    .locals 0

    .line 794
    iput-object p1, p0, Ll/᩹ۧ֨;->ܳ:Ll/ۤۧ֨;

    .line 795
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Ll/ۗۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֨۬ۚ;I)V
    .locals 1

    .line 805
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->֫(Ll/֨۬ۚ;I)V

    .line 806
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩹ۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(Ll/֨۬ۚ;I)V
    .locals 1

    .line 811
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->ۧ(Ll/֨۬ۚ;I)V

    .line 813
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩹ۧ֨;->ܽ()Ljava/lang/String;

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
    .locals 2

    .line 800
    iget-object v0, p0, Ll/᩹ۧ֨;->ܳ:Ll/ۤۧ֨;

    invoke-static {v0}, Ll/ۤۧ֨;->֫(Ll/ۤۧ֨;)Ll/᩷ۧ֨;

    move-result-object v0

    iget-boolean v0, v0, Ll/ۢܽ֨;->ܽ֫:Z

    iget-object v1, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Ll/᩻ۗۚ;->֫(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
