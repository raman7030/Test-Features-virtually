.class public final Ll/ܶᩴ᩻;
.super Ljava/io/FilterInputStream;
.source "Y89V"

# interfaces
.implements Ll/ܶ֨ᩴ;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 163
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final read([BII)I
    .locals 1

    const/16 v0, 0x2000

    .line 166
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
