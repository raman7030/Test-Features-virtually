.class public Ljava/nio/file/InvalidPathException;
.super Ljava/lang/IllegalArgumentException;
.source "N673"


# virtual methods
.method public getIndex()I
    .locals 1

    const/4 v0, 0x0

    .line 108
    throw v0
.end method

.method public getInput()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 89
    throw v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 2

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    invoke-virtual {p0}, Ljava/nio/file/InvalidPathException;->getReason()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 124
    throw v0
.end method

.method public getReason()Ljava/lang/String;
    .locals 1

    .line 98
    invoke-super {p0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
