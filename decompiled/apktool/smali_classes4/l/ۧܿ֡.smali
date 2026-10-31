.class public final Ll/ۧܿ֡;
.super Ll/۟ᩳ֡;
.source "C5SA"


# instance fields
.field public ۤ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ll/۟ᩳ֡;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 49
    iget-object v0, p0, Ll/ۧܿ֡;->ۤ:Ljava/lang/Object;

    const-string v1, ")"

    if-eqz v0, :cond_0

    iget-object v2, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    if-eqz v2, :cond_0

    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "MissingTokenException(inserted "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " at "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-interface {v0}, Ll/ۜܿ֡;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 52
    :cond_0
    iget-object v0, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    if-eqz v0, :cond_1

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "MissingTokenException(at "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-interface {v2}, Ll/ۜܿ֡;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "MissingTokenException"

    return-object v0
.end method
