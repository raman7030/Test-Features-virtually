.class public final Ll/ܳۨ֨;
.super Ll/᩸ۛ֨;
.source "M43N"


# instance fields
.field public final synthetic ܿ:Ll/ۜۨ֨;

.field public ᩳ:Ll/᩵֨֨;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ll/᩵֨֨;)V
    .locals 0

    .line 965
    iput-object p1, p0, Ll/ܳۨ֨;->ܿ:Ll/ۜۨ֨;

    .line 966
    invoke-direct {p0, p1, p2, p3}, Ll/᩸ۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;)V

    .line 967
    iput-object p4, p0, Ll/ܳۨ֨;->ᩳ:Ll/᩵֨֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1012
    const-class v0, Ll/ܳۨ֨;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ۛ֨;->ܽ:Ll/֨֨֨;

    iget-object v1, v1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    iget-object v2, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const/4 v0, 0x3

    iget-object v1, p0, Ll/ܳۨ֨;->ᩳ:Ll/᩵֨֨;

    aput-object v1, v3, v0

    const-string v0, "%s[undet=%s,t=%s,bound=%s]"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨֨֨;)Ll/᩸ۛ֨;
    .locals 4

    .line 972
    new-instance v0, Ll/ܳۨ֨;

    iget-object v1, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    iget-object v2, p0, Ll/ܳۨ֨;->ᩳ:Ll/᩵֨֨;

    iget-object v3, p0, Ll/ܳۨ֨;->ܿ:Ll/ۜۨ֨;

    invoke-direct {v0, v3, p1, v1, v2}, Ll/ܳۨ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ll/᩵֨֨;)V

    return-object v0
.end method

.method public final ֫(Ll/֡ۨ֨;Ll/֨᩸۠;)V
    .locals 10

    .line 976
    iget-object p2, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    invoke-virtual {p1, p2}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 977
    sget-object v0, Ll/ۢ۠֨;->ۡ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ܳۨ֨;->ܿ:Ll/ۜۨ֨;

    iget-object v4, p0, Ll/᩸ۛ֨;->ܽ:Ll/֨֨֨;

    iget-object v5, p0, Ll/ܳۨ֨;->ᩳ:Ll/᩵֨֨;

    if-eqz v0, :cond_2

    check-cast p2, Ll/֨֨֨;

    invoke-virtual {p2}, Ll/֨֨֨;->ۤ֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 980
    invoke-virtual {v5}, Ll/᩵֨֨;->֫()Ll/᩵֨֨;

    move-result-object v0

    iget-object v6, v3, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    invoke-virtual {p2, v0, v4, v6}, Ll/֨֨֨;->֫(Ll/᩵֨֨;Ll/ۙ֨֨;Ll/ۛ᩸֨;)V

    .line 1006
    sget-object v0, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    if-ne v5, v0, :cond_0

    .line 1007
    const-class v0, Ll/᩵֨֨;

    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v5}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    .line 982
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵֨֨;

    new-array v7, v2, [Ll/᩵֨֨;

    aput-object v6, v7, v1

    .line 983
    invoke-virtual {p2, v7}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۙ֨֨;

    .line 984
    iget-object v9, v3, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    invoke-virtual {v4, v6, v8, v9}, Ll/֨֨֨;->֫(Ll/᩵֨֨;Ll/ۙ֨֨;Ll/ۛ᩸֨;)V

    goto :goto_1

    .line 1001
    :cond_2
    sget-object p2, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    if-ne v5, p2, :cond_3

    .line 1002
    invoke-static {p2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p2

    goto :goto_2

    :cond_3
    invoke-static {v5}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p2

    invoke-static {p2}, Ljava/util/EnumSet;->complementOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object p2

    .line 989
    :goto_2
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֨֨;

    new-array v6, v2, [Ll/᩵֨֨;

    aput-object v0, v6, v1

    .line 990
    invoke-virtual {v4, v6}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۙ֨֨;

    .line 991
    invoke-virtual {p1, v6}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v6

    .line 992
    sget-object v7, Ll/ۢ۠֨;->ۡ֫:Ll/ۢ۠֨;

    invoke-virtual {v6, v7}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v7

    if-eqz v7, :cond_5

    check-cast v6, Ll/֨֨֨;

    invoke-virtual {v6}, Ll/֨֨֨;->ۤ֫()Z

    move-result v7

    if-nez v7, :cond_5

    .line 994
    iget-object v7, p0, Ll/᩸ۛ֨;->֫:Ll/ۙ֨֨;

    invoke-virtual {p1, v7}, Ll/֡ۨ֨;->֫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v7

    iget-object v8, v3, Ll/ۜۨ֨;->ۘ:Ll/ۛ᩸֨;

    invoke-virtual {v6, v5, v7, v8}, Ll/֨֨֨;->֫(Ll/᩵֨֨;Ll/ۙ֨֨;Ll/ۛ᩸֨;)V

    goto :goto_3

    :cond_6
    return-void
.end method
