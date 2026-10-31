.class public final Ll/ۗ᩷ܽ;
.super Ljava/lang/Object;
.source "C5C3"


# instance fields
.field public final ֫:[B

.field public ۧ:I


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Ll/ۗ᩷ܽ;->֫:[B

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 4

    .line 13
    iget v0, p0, Ll/ۗ᩷ܽ;->ۧ:I

    add-int/lit8 v1, v0, 0x3

    iget-object v2, p0, Ll/ۗ᩷ܽ;->֫:[B

    aget-byte v1, v2, v1

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, v2, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v1, v3

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, v2, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v1, v3

    aget-byte v2, v2, v0

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x4

    .line 15
    iput v0, p0, Ll/ۗ᩷ܽ;->ۧ:I

    return v1
.end method

.method public final ֫(I)[B
    .locals 4

    .line 49
    new-array v0, p1, [B

    .line 50
    iget v1, p0, Ll/ۗ᩷ܽ;->ۧ:I

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۗ᩷ܽ;->֫:[B

    invoke-static {v3, v1, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    iget v1, p0, Ll/ۗ᩷ܽ;->ۧ:I

    add-int/2addr v1, p1

    iput v1, p0, Ll/ۗ᩷ܽ;->ۧ:I

    return-object v0
.end method

.method public final ۧ()S
    .locals 3

    .line 20
    iget v0, p0, Ll/ۗ᩷ܽ;->ۧ:I

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Ll/ۗ᩷ܽ;->֫:[B

    aget-byte v1, v2, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    aget-byte v2, v2, v0

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v1, v2

    int-to-short v1, v1

    add-int/lit8 v0, v0, 0x2

    .line 21
    iput v0, p0, Ll/ۗ᩷ܽ;->ۧ:I

    return v1
.end method
