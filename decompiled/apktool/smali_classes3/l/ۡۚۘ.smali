.class public final Ll/ۡۚۘ;
.super Ljava/io/IOException;
.source "H89Z"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 81
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "UnmarshalException: "

    .line 82
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "UnmarshalException"

    return-object v0
.end method
