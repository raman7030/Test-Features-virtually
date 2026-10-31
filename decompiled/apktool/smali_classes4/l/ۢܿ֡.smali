.class public final Ll/ۢܿ֡;
.super Ll/۟ᩳ֡;
.source "L64G"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ll/۟ᩳ֡;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ", expected "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/۟ᩳ֡;->۫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v1, :cond_0

    const-string v0, ""

    .line 49
    :cond_0
    iget-object v1, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    const-string v2, ")"

    if-nez v1, :cond_1

    const-string v1, "UnwantedTokenException(found=null"

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 52
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "UnwantedTokenException(found="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-interface {v3}, Ll/ۜܿ֡;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
