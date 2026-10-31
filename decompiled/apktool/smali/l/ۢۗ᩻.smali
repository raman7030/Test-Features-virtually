.class public Ll/ۢۗ᩻;
.super Ljava/lang/Object;
.source "098W"


# instance fields
.field public final ֫:Ljava/io/ByteArrayOutputStream;

.field public final ۧ:[B

.field public final ܽ:Z

.field public ᩳ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x55

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public native constructor <init>(Z)V
.end method

.method private native ۧ()V
.end method


# virtual methods
.method public final ֫(I)V
    .locals 3

    .line 27
    iget-boolean v0, p0, Ll/ۢۗ᩻;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    iget v0, p0, Ll/ۢۗ᩻;->ᩳ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۢۗ᩻;->ᩳ:I

    int-to-byte p1, p1

    iget-object v2, p0, Ll/ۢۗ᩻;->ۧ:[B

    aput-byte p1, v2, v0

    .line 31
    array-length p1, v2

    if-ne v1, p1, :cond_1

    .line 32
    invoke-direct {p0}, Ll/ۢۗ᩻;->ۧ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫()[B
    .locals 1

    .line 115
    iget-boolean v0, p0, Ll/ۢۗ᩻;->ܽ:Z

    if-nez v0, :cond_0

    .line 118
    invoke-direct {p0}, Ll/ۢۗ᩻;->ۧ()V

    .line 119
    iget-object v0, p0, Ll/ۢۗ᩻;->֫:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    .line 116
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final ۧ(I)V
    .locals 1

    and-int/lit16 v0, p1, 0xff

    int-to-byte v0, v0

    .line 58
    invoke-virtual {p0, v0}, Ll/ۢۗ᩻;->֫(I)V

    ushr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 59
    invoke-virtual {p0, v0}, Ll/ۢۗ᩻;->֫(I)V

    ushr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 60
    invoke-virtual {p0, v0}, Ll/ۢۗ᩻;->֫(I)V

    ushr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 61
    invoke-virtual {p0, p1}, Ll/ۢۗ᩻;->֫(I)V

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 65
    invoke-virtual {p0, v0}, Ll/ۢۗ᩻;->֫(I)V

    ushr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 66
    invoke-virtual {p0, v0}, Ll/ۢۗ᩻;->֫(I)V

    ushr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 67
    invoke-virtual {p0, v0}, Ll/ۢۗ᩻;->֫(I)V

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    .line 68
    invoke-virtual {p0, p1}, Ll/ۢۗ᩻;->֫(I)V

    return-void
.end method
