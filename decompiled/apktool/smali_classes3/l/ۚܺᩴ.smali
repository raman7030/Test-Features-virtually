.class public abstract Ll/ۚܺᩴ;
.super Ljava/io/InputStream;
.source "BBSE"

# interfaces
.implements Ll/֨ܺᩴ;
.implements Ll/ܶ֨ᩴ;


# virtual methods
.method public readFully([B)V
    .locals 0

    .line 158
    invoke-virtual {p0, p1}, Ljava/io/InputStream;->read([B)I

    return-void
.end method

.method public readFully([BII)V
    .locals 0

    .line 163
    invoke-virtual {p0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    return-void
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
