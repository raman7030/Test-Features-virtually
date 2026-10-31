.class public final Ll/ᩳۘ֨;
.super Ll/ۡۘ֨;
.source "G67D"


# instance fields
.field public final ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ll/ۙ֨֨;)V
    .locals 0

    .line 77
    invoke-direct {p0, p2}, Ll/ۡۘ֨;-><init>(Ll/ۙ֨֨;)V

    .line 78
    iput-object p1, p0, Ll/ᩳۘ֨;->ۧ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 82
    iget-object v0, p0, Ll/ᩳۘ֨;->ۧ:Ljava/lang/Object;

    iget-object v1, p0, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    invoke-static {v0, v1}, Ll/᩹֨۠;->ۧ(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۛ᩸۠;)Ljava/lang/Object;
    .locals 3

    .line 90
    iget-object p1, p0, Ll/ᩳۘ֨;->ۧ:Ljava/lang/Object;

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 91
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 92
    :cond_0
    instance-of v0, p1, Ljava/lang/Integer;

    iget-object v1, p0, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    if-eqz v0, :cond_6

    .line 94
    sget-object v0, Ll/۟ۖ֨;->֫:[I

    invoke-virtual {v1}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_5

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 v2, 0x3

    if-eq v0, v2, :cond_3

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    goto :goto_0

    .line 99
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 98
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 97
    :cond_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 96
    :cond_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 95
    :cond_5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 102
    :cond_6
    :goto_0
    sget-object v0, Ll/۟ۖ֨;->֫:[I

    invoke-virtual {v1}, Ll/ۙ֨֨;->֫֫()Ll/ۢ۠֨;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_9

    const/4 v1, 0x7

    if-eq v0, v1, :cond_8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_7

    .line 105
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 107
    :cond_7
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Bad annotation element value: "

    .line 0
    invoke-static {p1, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 107
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 104
    :cond_8
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 103
    :cond_9
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final ֫(Ll/ۢۘ֨;)V
    .locals 0

    .line 75
    invoke-interface {p1, p0}, Ll/ۢۘ֨;->֫(Ll/ᩳۘ֨;)V

    return-void
.end method
