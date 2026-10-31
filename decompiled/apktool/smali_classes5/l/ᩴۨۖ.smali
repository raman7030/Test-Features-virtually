.class public final Ll/ᩴۨۖ;
.super Ll/۠֫ۘ;
.source "79E3"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Encrypted for session id << "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v1

    check-cast v1, Ll/ۡۨۖ;

    invoke-virtual {v1}, Ll/ۡۨۖ;->᩻()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " >>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
