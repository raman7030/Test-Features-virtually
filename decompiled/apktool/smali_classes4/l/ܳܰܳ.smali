.class public final Ll/ܳܰܳ;
.super Ljava/io/FilterInputStream;
.source "A1YB"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:Ll/᩵ۛۡ;


# direct methods
.method public constructor <init>(Ll/ܺܰܳ;Ljava/io/BufferedInputStream;Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 488
    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 489
    new-instance p2, Ll/᩵ۛۡ;

    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Ll/᩵ۛۡ;-><init>(J)V

    new-instance p3, Ll/᩵֫᩻;

    invoke-direct {p3, p1}, Ll/᩵֫᩻;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    iput-object p2, p0, Ll/ܳܰܳ;->᩸:Ll/᩵ۛۡ;

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 3

    .line 493
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    .line 494
    iget-object v1, p0, Ll/ܳܰܳ;->᩸:Ll/᩵ۛۡ;

    const/4 v2, 0x1

    .line 41
    invoke-virtual {v1, v2}, Ll/᩵ۛۡ;->֫(I)Z

    return v0
.end method

.method public final read([BII)I
    .locals 0

    .line 500
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    .line 501
    iget-object p2, p0, Ll/ܳܰܳ;->᩸:Ll/᩵ۛۡ;

    invoke-virtual {p2, p1}, Ll/᩵ۛۡ;->֫(I)Z

    return p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
