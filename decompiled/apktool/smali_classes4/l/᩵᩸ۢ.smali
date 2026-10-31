.class public final Ll/᩵᩸ۢ;
.super Ljava/lang/Object;
.source "W1SD"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/lang/String;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SuCommand{exec=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩵᩸ۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', arguments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵᩸ۢ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
