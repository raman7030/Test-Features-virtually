.class public final Ll/᩵۟ۡ;
.super Ll/ۘۜ֨;
.source "A1S8"


# instance fields
.field public final ۛ:Ll/ۗ᩺ۡ;


# direct methods
.method public constructor <init>(Ll/ۗ᩺ۡ;Ljava/io/InputStream;)V
    .locals 0

    .line 14
    invoke-direct {p0, p2}, Ll/ۘۜ֨;-><init>(Ljava/io/InputStream;)V

    .line 15
    iput-object p1, p0, Ll/᩵۟ۡ;->ۛ:Ll/ۗ᩺ۡ;

    return-void
.end method


# virtual methods
.method public final read([BII)I
    .locals 0

    .line 21
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ll/ۘۜ֨;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 23
    instance-of p2, p1, Ljava/io/EOFException;

    if-eqz p2, :cond_0

    const/4 p1, -0x1

    return p1

    .line 26
    :cond_0
    iget-object p2, p0, Ll/᩵۟ۡ;->ۛ:Ll/ۗ᩺ۡ;

    invoke-static {p1, p2}, Ll/ۖܰۡ;->֫(Ljava/io/IOException;Ll/ۗ᩺ۡ;)V

    const/4 p1, 0x0

    throw p1
.end method
