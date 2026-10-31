.class public final Ll/۠᩷֨;
.super Ll/ۚ᩷֨;
.source "4QY"


# instance fields
.field public final ܽ:Ljava/io/DataInputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ll/ۚ᩷֨;-><init>()V

    .line 17
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ll/۠᩷֨;->ܽ:Ljava/io/DataInputStream;

    .line 19
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result p1

    if-nez p1, :cond_0

    .line 22
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result p1

    iput p1, p0, Ll/ۚ᩷֨;->֫:I

    const/4 p1, -0x1

    .line 23
    iput p1, p0, Ll/ۚ᩷֨;->ۧ:I

    return-void

    .line 20
    :cond_0
    new-instance p1, Ll/᩹᩻֨;

    invoke-direct {p1}, Ll/᩹᩻֨;-><init>()V

    throw p1
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 32
    iget v0, p0, Ll/ۚ᩷֨;->ۧ:I

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    if-nez v0, :cond_0

    .line 33
    iget v0, p0, Ll/ۚ᩷֨;->֫:I

    shl-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Ll/۠᩷֨;->ܽ:Ljava/io/DataInputStream;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v1

    or-int/2addr v0, v1

    iput v0, p0, Ll/ۚ᩷֨;->֫:I

    .line 34
    iget v0, p0, Ll/ۚ᩷֨;->ۧ:I

    shl-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/ۚ᩷֨;->ۧ:I

    :cond_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 27
    iget v0, p0, Ll/ۚ᩷֨;->֫:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
