.class public final Ll/᩷ۗ᩻;
.super Ljava/lang/Object;
.source "498X"

# interfaces
.implements Ll/ۜۗ᩻;


# instance fields
.field public final ֫:[B

.field public ۧ:I

.field public ܽ:Ll/ۜۗ᩻;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x94

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/᩷ۗ᩻;->֫:[B

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Ll/᩷ۗ᩻;->ۧ:I

    .line 20
    invoke-direct {p0}, Ll/᩷ۗ᩻;->ᩳ()Ll/ۜۗ᩻;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۗ᩻;->ܽ:Ll/ۜۗ᩻;

    return-void
.end method

.method public static native ֫([B)Ll/ۖۗ᩻;
.end method

.method private native ᩳ()Ll/ۜۗ᩻;
.end method


# virtual methods
.method public final read()I
    .locals 2

    .line 26
    :goto_0
    iget-object v0, p0, Ll/᩷ۗ᩻;->ܽ:Ll/ۜۗ᩻;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 29
    :cond_0
    invoke-interface {v0}, Ll/ۜۗ᩻;->read()I

    move-result v0

    if-eq v0, v1, :cond_1

    return v0

    .line 33
    :cond_1
    invoke-direct {p0}, Ll/᩷ۗ᩻;->ᩳ()Ll/ۜۗ᩻;

    move-result-object v0

    iput-object v0, p0, Ll/᩷ۗ᩻;->ܽ:Ll/ۜۗ᩻;

    goto :goto_0
.end method

.method public final ֫()B
    .locals 2

    .line 77
    invoke-virtual {p0}, Ll/᩷ۗ᩻;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    return v0

    .line 79
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public final ۧ()I
    .locals 2

    .line 93
    invoke-virtual {p0}, Ll/᩷ۗ᩻;->֫()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0}, Ll/᩷ۗ᩻;->֫()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/᩷ۗ᩻;->֫()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/᩷ۗ᩻;->֫()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 97
    invoke-virtual {p0}, Ll/᩷ۗ᩻;->֫()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    invoke-virtual {p0}, Ll/᩷ۗ᩻;->֫()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/᩷ۗ᩻;->֫()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/᩷ۗ᩻;->֫()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0
.end method
