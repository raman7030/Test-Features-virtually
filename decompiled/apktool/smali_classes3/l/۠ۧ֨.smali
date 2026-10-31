.class public final Ll/۠ۧ֨;
.super Ll/ۗۧ֨;
.source "K3OA"


# instance fields
.field public final synthetic ܳ:Ll/ۤۧ֨;


# direct methods
.method public constructor <init>(Ll/ۤۧ֨;Ll/۫ۧ֨;I)V
    .locals 0

    .line 936
    iput-object p1, p0, Ll/۠ۧ֨;->ܳ:Ll/ۤۧ֨;

    .line 937
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Ll/ۗۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;Ljava/lang/Object;)V

    return-void
.end method

.method private ᩳ()V
    .locals 5

    .line 967
    iget-object v0, p0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    const/16 v1, 0x11

    if-eq v0, v1, :cond_0

    return-void

    .line 969
    :cond_0
    iget-object v0, p0, Ll/۠ۧ֨;->ܳ:Ll/ۤۧ֨;

    iget-boolean v1, v0, Ll/ۢܽ֨;->ܺ֫:Z

    const-string v2, ";"

    iget-object v3, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    const-string v4, "#"

    if-eqz v1, :cond_1

    .line 970
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void

    .line 972
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Ll/ۗۧ֨;->֫:I

    invoke-virtual {v0, v2, v1}, Ll/ۢܽ֨;->ܿ(ILjava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " // "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/۠ۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢܽ֨;->ܿ(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֨۬ۚ;I)V
    .locals 0

    .line 955
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->֫(Ll/֨۬ۚ;I)V

    .line 956
    invoke-direct {p0}, Ll/۠ۧ֨;->ᩳ()V

    return-void
.end method

.method public final ۧ(Ll/֨۬ۚ;I)V
    .locals 0

    .line 961
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->ۧ(Ll/֨۬ۚ;I)V

    .line 962
    invoke-direct {p0}, Ll/۠ۧ֨;->ᩳ()V

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 4

    .line 943
    iget-object v0, p0, Ll/ۗۧ֨;->ܽ:Ll/۫ۧ֨;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x6

    iget-object v2, p0, Ll/۠ۧ֨;->ܳ:Ll/ۤۧ֨;

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    iget-object v3, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    if-eq v0, v1, :cond_1

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    const/16 v1, 0x11

    if-eq v0, v1, :cond_0

    const-string v0, "UnknownTag"

    return-object v0

    .line 945
    :cond_0
    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    new-instance v1, Ll/ۨᩳ֨;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Ll/ۨᩳ֨;-><init>(I)V

    invoke-virtual {v2, v0, v1}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 946
    :cond_1
    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Ll/ۤۧ֨;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 944
    :cond_2
    invoke-virtual {v2, p0}, Ll/ۤۧ֨;->֫(Ll/۠ۧ֨;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2}, Ll/ۤۧ֨;->֫(Ll/ۤۧ֨;)Ll/᩷ۧ֨;

    move-result-object v1

    iget-object v1, v1, Ll/᩷ۧ֨;->᩸ۧ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۤۧ֨;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
