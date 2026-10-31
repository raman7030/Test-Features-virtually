.class public final Ll/ܳ᩺᩵;
.super Ljava/lang/Object;
.source "QB6R"

# interfaces
.implements Ll/ۚۨۡ;


# virtual methods
.method public final ֫(Ljava/io/OutputStream;I)Ljava/io/OutputStream;
    .locals 1

    .line 247
    new-instance v0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;

    invoke-direct {v0, p1, p2}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;-><init>(Ljava/io/OutputStream;I)V

    return-object v0
.end method

.method public final ֫(I)Z
    .locals 1

    .line 238
    sget v0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۛ:I

    if-ltz p1, :cond_1

    const/16 v0, 0x9

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
