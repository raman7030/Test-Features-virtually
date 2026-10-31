.class public final Ll/᩶ܰۡ;
.super Ljava/io/InputStream;
.source "Q4HB"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩶:[B

.field public ᩸:Ll/ۙܰۡ;

.field public ᩹:Ll/۫ܰۡ;


# direct methods
.method public constructor <init>(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ll/۫ܰۡ;Ljava/lang/String;)V
    .locals 2

    .line 15
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 13
    iput-object v0, p0, Ll/᩶ܰۡ;->᩶:[B

    .line 16
    iput-object p3, p0, Ll/᩶ܰۡ;->᩹:Ll/۫ܰۡ;

    const/16 v0, 0xc

    new-array v1, v0, [B

    .line 123
    invoke-static {p3, v1, v0}, Ll/ۖܰۡ;->ۧ(Ljava/io/InputStream;[BI)V

    .line 19
    new-instance p3, Ll/ۙܰۡ;

    invoke-direct {p3, p1, p2, p4, v1}, Ll/ۙܰۡ;-><init>(Ll/ᩳܰۡ;Ll/ۗ᩺ۡ;Ljava/lang/String;[B)V

    iput-object p3, p0, Ll/᩶ܰۡ;->᩸:Ll/ۙܰۡ;

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 2

    .line 33
    iget-object v0, p0, Ll/᩶ܰۡ;->᩶:[B

    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-gtz v1, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    const/4 v1, 0x0

    .line 36
    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 1

    .line 24
    iget-object v0, p0, Ll/᩶ܰۡ;->᩹:Ll/۫ܰۡ;

    invoke-virtual {v0, p1, p2, p3}, Ll/۫ܰۡ;->read([BII)I

    move-result p3

    if-lez p3, :cond_0

    .line 26
    iget-object v0, p0, Ll/᩶ܰۡ;->᩸:Ll/ۙܰۡ;

    invoke-virtual {v0, p2, p3, p1}, Ll/ۙܰۡ;->֫(II[B)V

    :cond_0
    return p3
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
