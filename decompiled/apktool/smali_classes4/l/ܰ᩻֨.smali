.class public final Ll/ܰ᩻֨;
.super Ll/᩺᩻֨;
.source "R1SI"

# interfaces
.implements Ll/ۤ᩻֨;


# instance fields
.field public ֫:I


# direct methods
.method public constructor <init>([B)V
    .locals 3

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    array-length v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    aget-byte p1, p1, v0

    and-int/lit16 v0, p1, 0xff

    const/16 v2, 0x25

    if-gt v0, v2, :cond_0

    and-int/lit8 v0, p1, 0x1

    or-int/lit8 v0, v0, 0x2

    .line 19
    iput v0, p0, Ll/ܰ᩻֨;->֫:I

    ushr-int/2addr p1, v1

    add-int/lit8 p1, p1, 0xb

    shl-int p1, v0, p1

    .line 20
    iput p1, p0, Ll/ܰ᩻֨;->֫:I

    return-void

    .line 16
    :cond_0
    new-instance p1, Ll/ۢۜ֨;

    const-string v0, "Unsupported LZMA2 properties"

    .line 20
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 16
    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 25
    iget v0, p0, Ll/ܰ᩻֨;->֫:I

    invoke-static {v0}, Ll/֫ۜ֨;->ۧ(I)I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/io/InputStream;Ll/ۘ᩻֨;)Ljava/io/InputStream;
    .locals 2

    .line 30
    new-instance v0, Ll/֫ۜ֨;

    iget v1, p0, Ll/ܰ᩻֨;->֫:I

    invoke-direct {v0, p1, v1, p2}, Ll/֫ۜ֨;-><init>(Ljava/io/InputStream;ILl/ۘ᩻֨;)V

    return-object v0
.end method
