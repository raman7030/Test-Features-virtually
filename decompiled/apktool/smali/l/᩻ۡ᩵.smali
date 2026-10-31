.class public final Ll/᩻ۡ᩵;
.super Ll/᩷ۡ᩵;
.source "U9V0"


# direct methods
.method public constructor <init>(Ll/ۡۢ᩵;)V
    .locals 1

    .line 26
    invoke-static {}, Ll/᩷ۡ᩵;->ۡ()I

    move-result v0

    invoke-direct {p0, p1, v0}, Ll/᩷ۡ᩵;-><init>(Ll/ۡۢ᩵;I)V

    .line 28
    sget-object p1, Ll/۟ۢ᩵;->ۗ:Ll/۟ۢ᩵;

    invoke-virtual {p0, p1}, Ll/᩷ۡ᩵;->ۧ(Ll/۟ۢ᩵;)V

    .line 29
    invoke-virtual {p0, p1}, Ll/᩷ۡ᩵;->֫(Ll/۟ۢ᩵;)V

    return-void
.end method


# virtual methods
.method public final cancel()Z
    .locals 1

    .line 63
    invoke-virtual {p0}, Ll/᩷ۡ᩵;->ۢ()V

    .line 65
    invoke-super {p0}, Ljava/util/TimerTask;->cancel()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    invoke-virtual {p0}, Ll/᩻ۡ᩵;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/᩷ۡ᩵;->ۜ()Ll/۟ۢ᩵;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܳ᩷᩵;)Ll/ܳ᩷᩵;
    .locals 4

    .line 102
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v0

    sget-object v1, Ll/ۛۢ᩵;->ۙ:Ll/ۛۢ᩵;

    const/4 v2, 0x1

    invoke-virtual {p0}, Ll/᩷ۡ᩵;->ܳ()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ll/۟᩷᩵;->֫(Ll/ۛۢ᩵;ZI)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹᩷᩵;

    const/4 v2, 0x0

    .line 103
    invoke-virtual {p0, p1, v2, v1}, Ll/֫ۡ᩵;->֫(Ll/ܳ᩷᩵;Ll/ۧ᩷᩵;Ll/᩹᩷᩵;)Ll/ܳ᩷᩵;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public final ֫(Ll/᩶ۢ᩵;Ll/ܳ᩷᩵;)Ll/ܳ᩷᩵;
    .locals 3

    .line 115
    sget-object v0, Ll/ۛۢ᩵;->ۙ:Ll/ۛۢ᩵;

    invoke-virtual {p0}, Ll/᩷ۡ᩵;->ܳ()I

    move-result v1

    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Ll/᩶ۢ᩵;->֫(Ll/ۛۢ᩵;ILl/۟᩷᩵;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹᩷᩵;

    const/4 v1, 0x0

    .line 116
    invoke-virtual {p0, p2, v1, v0}, Ll/֫ۡ᩵;->֫(Ll/ܳ᩷᩵;Ll/ۧ᩷᩵;Ll/᩹᩷᩵;)Ll/ܳ᩷᩵;

    move-result-object p2

    goto :goto_0

    :cond_0
    return-object p2
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 3

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Announcer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۡۢ᩵;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    const-string v2, ")"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()V
    .locals 1

    .line 136
    invoke-virtual {p0}, Ll/᩷ۡ᩵;->ۜ()Ll/۟ۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ᩵;->֫()Ll/۟ۢ᩵;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩷ۡ᩵;->ۧ(Ll/۟ۢ᩵;)V

    .line 137
    invoke-virtual {p0}, Ll/᩷ۡ᩵;->ۜ()Ll/۟ۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ᩵;->ܿ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 138
    invoke-virtual {p0}, Ll/᩻ۡ᩵;->cancel()Z

    .line 140
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->ܳ()V

    :cond_0
    return-void
.end method

.method public final ܿ()Ll/ܳ᩷᩵;
    .locals 2

    .line 92
    new-instance v0, Ll/ܳ᩷᩵;

    const v1, 0x8400

    invoke-direct {v0, v1}, Ll/ܳ᩷᩵;-><init>(I)V

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 83
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->ۧ֫()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->۟()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()V
    .locals 1

    .line 127
    invoke-virtual {p0}, Ll/֫ۡ᩵;->֫()Ll/ۡۢ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۡۢ᩵;->ܳ֫()V

    return-void
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "announcing"

    return-object v0
.end method
