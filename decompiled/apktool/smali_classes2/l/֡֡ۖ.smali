.class public final Ll/֡֡ۖ;
.super Ljava/lang/Object;
.source "59PG"

# interfaces
.implements Ll/֨֡ۖ;


# instance fields
.field public final ֫:Ll/ۘۘۖ;


# direct methods
.method public constructor <init>(Ll/ۘۘۖ;)V
    .locals 0

    .line 867
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 868
    iput-object p1, p0, Ll/֡֡ۖ;->֫:Ll/ۘۘۖ;

    return-void
.end method


# virtual methods
.method public final addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;
    .locals 1

    .line 911
    iget-object v0, p0, Ll/֡֡ۖ;->֫:Ll/ۘۘۖ;

    invoke-virtual {v0, p1, p2}, Ll/ۘۘۖ;->֫(Ll/֡ۖۖ;Ljava/lang/Object;)V

    return-object p0
.end method

.method public final hasField(Ll/֡ۖۖ;)Z
    .locals 1

    .line 883
    iget-object v0, p0, Ll/֡֡ۖ;->֫:Ll/ۘۘۖ;

    invoke-virtual {v0, p1}, Ll/ۘۘۖ;->ܽ(Ll/֡ۖۖ;)Z

    move-result p1

    return p1
.end method

.method public final setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;
    .locals 1

    .line 889
    iget-object v0, p0, Ll/֡֡ۖ;->֫:Ll/ۘۘۖ;

    invoke-virtual {v0, p1, p2}, Ll/ۘۘۖ;->ۧ(Ll/֡ۖۖ;Ljava/lang/Object;)V

    return-object p0
.end method

.method public final ֫()Ll/ۚ֡ۖ;
    .locals 1

    .line 934
    sget-object v0, Ll/ۚ֡ۖ;->᩹:Ll/ۚ֡ۖ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۘۖ;Ll/ᩳۖۖ;I)Ll/۟ۖۖ;
    .locals 0

    .line 946
    invoke-virtual {p1, p2, p3}, Ll/֫ۘۖ;->֫(Ll/ᩳۖۖ;I)Ll/۟ۖۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֡ۖۖ;)Ll/ܿ۠ۖ;
    .locals 0

    .line 1077
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩺()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1078
    sget-object p1, Ll/ܿ۠ۖ;->ۙ:Ll/ܿ۠ۖ;

    return-object p1

    .line 1081
    :cond_0
    sget-object p1, Ll/ܿ۠ۖ;->᩶:Ll/ܿ۠ۖ;

    return-object p1
.end method

.method public final ֫(Ll/ۛۜۖ;Ll/ᩳۘۖ;Ll/֡ۖۖ;Ll/᩻֡ۖ;)Ll/᩻֡ۖ;
    .locals 1

    .line 1052
    invoke-interface {p4}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object p4

    .line 1053
    invoke-virtual {p3}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 878
    iget-object v0, p0, Ll/֡֡ۖ;->֫:Ll/ۘۘۖ;

    invoke-virtual {v0, p3}, Ll/ۘۘۖ;->ۧ(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object p3

    .line 1054
    check-cast p3, Ll/᩻֡ۖ;

    if-eqz p3, :cond_0

    .line 1056
    invoke-interface {p4, p3}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    .line 1059
    :cond_0
    invoke-interface {p4, p1, p2}, Ll/ܳ֡ۖ;->mergeFrom(Ll/ۛۜۖ;Ll/ᩳۘۖ;)Ll/ܳ֡ۖ;

    .line 1060
    invoke-interface {p4}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۟ۜۖ;Ll/ᩳۘۖ;Ll/֡ۖۖ;Ll/᩻֡ۖ;)V
    .locals 2

    .line 1022
    invoke-virtual {p3}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 883
    iget-object v0, p0, Ll/֡֡ۖ;->֫:Ll/ۘۘۖ;

    invoke-virtual {v0, p3}, Ll/ۘۘۖ;->ܽ(Ll/֡ۖۖ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1024
    invoke-virtual {v0, p3}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object p4

    .line 1026
    instance-of v1, p4, Ll/ۢ֡ۖ;

    if-eqz v1, :cond_0

    .line 1027
    check-cast p4, Ll/ۢ֡ۖ;

    goto :goto_0

    .line 1029
    :cond_0
    check-cast p4, Ll/ۡ֡ۖ;

    invoke-interface {p4}, Ll/ۡ֡ۖ;->toBuilder()Ll/ۢ֡ۖ;

    move-result-object p4

    .line 1030
    invoke-virtual {v0, p3, p4}, Ll/ۘۘۖ;->ۧ(Ll/֡ۖۖ;Ljava/lang/Object;)V

    .line 1032
    :goto_0
    invoke-virtual {p1, p4, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    return-void

    .line 1035
    :cond_1
    invoke-interface {p4}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object p4

    .line 1036
    invoke-virtual {p1, p4, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 1037
    invoke-virtual {p0, p3, p4}, Ll/֡֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return-void

    .line 1039
    :cond_2
    invoke-interface {p4}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object p4

    .line 1040
    invoke-virtual {p1, p4, p2}, Ll/۟ۜۖ;->֫(Ll/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 1041
    invoke-interface {p4}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Ll/֡֡ۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return-void
.end method

.method public final ۧ(Ll/۟ۜۖ;Ll/ᩳۘۖ;Ll/֡ۖۖ;Ll/᩻֡ۖ;)V
    .locals 2

    .line 992
    invoke-virtual {p3}, Ll/֡ۖۖ;->۟֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 883
    iget-object v0, p0, Ll/֡֡ۖ;->֫:Ll/ۘۘۖ;

    invoke-virtual {v0, p3}, Ll/ۘۘۖ;->ܽ(Ll/֡ۖۖ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 994
    invoke-virtual {v0, p3}, Ll/ۘۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object p4

    .line 996
    instance-of v1, p4, Ll/ۢ֡ۖ;

    if-eqz v1, :cond_0

    .line 997
    check-cast p4, Ll/ۢ֡ۖ;

    goto :goto_0

    .line 999
    :cond_0
    check-cast p4, Ll/ۡ֡ۖ;

    invoke-interface {p4}, Ll/ۡ֡ۖ;->toBuilder()Ll/ۢ֡ۖ;

    move-result-object p4

    .line 1000
    invoke-virtual {v0, p3, p4}, Ll/ۘۘۖ;->ۧ(Ll/֡ۖۖ;Ljava/lang/Object;)V

    .line 1002
    :goto_0
    invoke-virtual {p3}, Ll/֡ۖۖ;->getNumber()I

    move-result p3

    invoke-virtual {p1, p3, p4, p2}, Ll/۟ۜۖ;->֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    return-void

    .line 1005
    :cond_1
    invoke-interface {p4}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object p4

    .line 1006
    invoke-virtual {p3}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0, p4, p2}, Ll/۟ۜۖ;->֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 1007
    invoke-virtual {p0, p3, p4}, Ll/֡֡ۖ;->setField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return-void

    .line 1009
    :cond_2
    invoke-interface {p4}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object p4

    .line 1010
    invoke-virtual {p3}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0, p4, p2}, Ll/۟ۜۖ;->֫(ILl/ۢ֡ۖ;Ll/ᩳۘۖ;)V

    .line 1011
    invoke-interface {p4}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Ll/֡֡ۖ;->addRepeatedField(Ll/֡ۖۖ;Ljava/lang/Object;)Ll/֨֡ۖ;

    return-void
.end method
