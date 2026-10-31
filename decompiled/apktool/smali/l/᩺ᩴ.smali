.class public final Ll/᩺ᩴ;
.super Ljava/lang/Object;
.source "N5Q6"

# interfaces
.implements Ljava/util/Map$Entry;


# instance fields
.field public final ۙ:Ljava/lang/Object;

.field public ᩶:Ll/᩺ᩴ;

.field public final ᩸:Ljava/lang/Object;

.field public ᩹:Ll/᩺ᩴ;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 380
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 381
    iput-object p1, p0, Ll/᩺ᩴ;->᩸:Ljava/lang/Object;

    .line 382
    iput-object p2, p0, Ll/᩺ᩴ;->ۙ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 413
    :cond_0
    instance-of v1, p1, Ll/᩺ᩴ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 416
    :cond_1
    check-cast p1, Ll/᩺ᩴ;

    .line 417
    iget-object v1, p0, Ll/᩺ᩴ;->᩸:Ljava/lang/Object;

    iget-object v3, p1, Ll/᩺ᩴ;->᩸:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/᩺ᩴ;->ۙ:Ljava/lang/Object;

    iget-object p1, p1, Ll/᩺ᩴ;->ۙ:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1

    .line 388
    iget-object v0, p0, Ll/᩺ᩴ;->᩸:Ljava/lang/Object;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 394
    iget-object v0, p0, Ll/᩺ᩴ;->ۙ:Ljava/lang/Object;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 422
    iget-object v0, p0, Ll/᩺ᩴ;->᩸:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Ll/᩺ᩴ;->ۙ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 399
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "An entry modification is not supported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 404
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩺ᩴ;->᩸:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩺ᩴ;->ۙ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
