.class public final Ll/ܺ۟ۖ;
.super Ljava/lang/Object;
.source "1A0Y"

# interfaces
.implements Ll/ܽ۟ۖ;


# virtual methods
.method public final ֫(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 1

    .line 27
    instance-of v0, p1, Ll/ۖ۟ۖ;

    if-eqz v0, :cond_0

    .line 28
    check-cast p1, Ll/ۖ۟ۖ;

    return-object p1

    .line 30
    :cond_0
    new-instance v0, Ll/ۖ۟ۖ;

    .line 35
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method
