.class public final Lorg/bouncycastle/jcajce/provider/keystore/util/JKSKeyStoreSpi$ErasableByteStream;
.super Ljava/io/ByteArrayInputStream;

# interfaces
.implements Ll/ܶ֨ᩴ;
.implements Ll/֡֨ᩴ;


# direct methods
.method public constructor <init>([BII)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    return-void
.end method


# virtual methods
.method public erase()V
    .locals 2

    .line 0
    iget-object v0, p0, Ljava/io/ByteArrayInputStream;->buf:[B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    return-void
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
