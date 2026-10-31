.class public final Ll/۟ۡۡ;
.super Ljava/lang/Object;
.source "53XL"

# interfaces
.implements Ll/ۧܺۡ;


# instance fields
.field public final ֫:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 662
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 663
    iput-object p1, p0, Ll/۟ۡۡ;->֫:[B

    return-void
.end method


# virtual methods
.method public final getInputStream()Ljava/io/InputStream;
    .locals 2

    .line 8
    new-instance v0, Ll/ۢۖܽ;

    .line 12
    iget-object v1, p0, Ll/۟ۡۡ;->֫:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public final length()J
    .locals 2

    .line 673
    iget-object v0, p0, Ll/۟ۡۡ;->֫:[B

    array-length v0, v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final synthetic ֫()Ljava/io/InputStream;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֫ܺۡ;->֫(Ll/ۧܺۡ;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
