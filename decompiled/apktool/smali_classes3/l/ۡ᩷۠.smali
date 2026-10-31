.class public final Ll/ۡ᩷۠;
.super Ljava/lang/Object;
.source "24FJ"


# instance fields
.field public ֫:C

.field public ۧ:C


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1906
    iget-char v0, p0, Ll/ۡ᩷۠;->ۧ:C

    .line 1907
    iget-char v1, p0, Ll/ۡ᩷۠;->֫:C

    const-string v2, "startpc = "

    const-string v3, " length "

    .line 0
    invoke-static {v2, v0, v1, v3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
