.class public final Ll/᩹᩷֨;
.super Ljava/lang/Object;
.source "C1TK"

# interfaces
.implements Ll/ۤ᩷֨;


# instance fields
.field public ֫:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    add-int/lit8 p1, p1, 0x8

    .line 15
    iput p1, p0, Ll/᩹᩷֨;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(II[B)I
    .locals 6

    add-int/2addr p2, p1

    add-int/lit8 p2, p2, -0x4

    move v0, p1

    :goto_0
    if-gt v0, p2, :cond_1

    add-int/lit8 v1, v0, 0x3

    .line 24
    aget-byte v1, p3, v1

    and-int/lit16 v1, v1, 0xff

    const/16 v2, 0xeb

    if-ne v1, v2, :cond_0

    add-int/lit8 v1, v0, 0x2

    .line 25
    aget-byte v2, p3, v1

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    add-int/lit8 v3, v0, 0x1

    aget-byte v4, p3, v3

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v2, v4

    aget-byte v4, p3, v0

    and-int/lit16 v4, v4, 0xff

    or-int/2addr v2, v4

    shl-int/lit8 v2, v2, 0x2

    .line 34
    iget v4, p0, Ll/᩹᩷֨;->֫:I

    add-int/2addr v4, v0

    sub-int/2addr v4, p1

    sub-int/2addr v2, v4

    ushr-int/lit8 v4, v2, 0x2

    ushr-int/lit8 v5, v2, 0x12

    int-to-byte v5, v5

    .line 37
    aput-byte v5, p3, v1

    ushr-int/lit8 v1, v2, 0xa

    int-to-byte v1, v1

    .line 38
    aput-byte v1, p3, v3

    int-to-byte v1, v4

    .line 39
    aput-byte v1, p3, v0

    :cond_0
    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_1
    sub-int/2addr v0, p1

    .line 44
    iget p1, p0, Ll/᩹᩷֨;->֫:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/᩹᩷֨;->֫:I

    return v0
.end method
