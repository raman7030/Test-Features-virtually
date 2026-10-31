.class public abstract Ll/۟۬᩵;
.super Ll/֡ۗ᩵;
.source "HAYQ"

# interfaces
.implements Ll/ۡ۬᩵;
.implements Ll/᩶۬᩵;


# instance fields
.field public ۙ:Ll/ᩳ۫᩵;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ll/᩷ۛ᩵;-><init>()V

    return-void
.end method


# virtual methods
.method public getParent()Ll/ۤ۬᩵;
    .locals 1

    .line 1465
    invoke-virtual {p0}, Ll/۟۬᩵;->ۘ()Ll/ᩳ۫᩵;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1359
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    .line 1359
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/ۧ۬᩵;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[job@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/۟۬᩵;->ۘ()Ll/ᩳ۫᩵;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۬᩵;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ll/ᩳ۫᩵;
    .locals 1

    .line 1355
    iget-object v0, p0, Ll/۟۬᩵;->ۙ:Ll/ᩳ۫᩵;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "job"

    invoke-static {v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ()V
    .locals 1

    .line 1358
    invoke-virtual {p0}, Ll/۟۬᩵;->ۘ()Ll/ᩳ۫᩵;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ᩳ۫᩵;->֫(Ll/۟۬᩵;)V

    return-void
.end method

.method public final ᩳ()Ll/᩻۫᩵;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
