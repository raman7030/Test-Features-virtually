.class public final Ll/۬᩵ܺ;
.super Ljava/lang/Object;
.source "UB7S"


# instance fields
.field public ֫:Ll/ۤ᩵ܺ;

.field public ۧ:Ll/ۨ᩵ܺ;

.field public ܽ:Ll/᩷ۚܺ;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 313
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۬᩵ܺ;->֫:Ll/ۤ᩵ܺ;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " {...} (src="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۬᩵ܺ;->ۧ:Ll/ۨ᩵ܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
