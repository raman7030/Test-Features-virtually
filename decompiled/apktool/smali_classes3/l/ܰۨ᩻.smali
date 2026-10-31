.class public final Ll/ܰۨ᩻;
.super Ljava/lang/Object;
.source "N78B"


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public final ܽ:Ljava/lang/String;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/ܰۨ᩻;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;[B)Ll/ܰۨ᩻;
    .locals 3

    .line 38
    array-length v0, p1

    const/16 v1, 0x70

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    aget-byte v0, p1, v0

    const/16 v1, 0x64

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    aget-byte v1, p1, v0

    const/16 v2, 0x65

    if-ne v1, v2, :cond_0

    const/4 v1, 0x2

    aget-byte v1, p1, v1

    const/16 v2, 0x78

    if-ne v1, v2, :cond_0

    const/4 v1, 0x3

    aget-byte v1, p1, v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    const/4 v1, 0x7

    aget-byte v1, p1, v1

    if-nez v1, :cond_0

    .line 42
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 43
    new-instance v1, Ll/ܰۨ᩻;

    invoke-direct {v1, p0}, Ll/ܰۨ᩻;-><init>(Ljava/lang/String;)V

    .line 44
    iput-boolean v0, v1, Ll/ܰۨ᩻;->֫:Z

    const/16 p0, 0x38

    .line 45
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p0

    iput p0, v1, Ll/ܰۨ᩻;->ᩳ:I

    const/16 p0, 0x40

    .line 46
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    const/16 p0, 0x48

    .line 47
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    const/16 p0, 0x50

    .line 48
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    const/16 p0, 0x58

    .line 49
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    const/16 p0, 0x60

    .line 50
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p0

    iput p0, v1, Ll/ܰۨ᩻;->ۧ:I

    return-object v1

    .line 40
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid dex header"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
