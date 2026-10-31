.class public final Ll/ۗᩳ᩻;
.super Ljava/io/FilterInputStream;
.source "195F"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ᩸:Ll/᩵ۛۡ;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ll/᩵ۛۡ;)V
    .locals 0

    .line 1786
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 1787
    iput-object p2, p0, Ll/ۗᩳ᩻;->᩸:Ll/᩵ۛۡ;

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 3

    .line 1792
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1793
    iget-object v1, p0, Ll/ۗᩳ᩻;->᩸:Ll/᩵ۛۡ;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    .line 41
    invoke-virtual {v1, v2}, Ll/᩵ۛۡ;->֫(I)Z

    :cond_0
    return v0
.end method

.method public final read([BII)I
    .locals 0

    .line 1801
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_0

    .line 1802
    iget-object p2, p0, Ll/ۗᩳ᩻;->᩸:Ll/᩵ۛۡ;

    if-eqz p2, :cond_0

    .line 1803
    invoke-virtual {p2, p1}, Ll/᩵ۛۡ;->֫(I)Z

    :cond_0
    return p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
