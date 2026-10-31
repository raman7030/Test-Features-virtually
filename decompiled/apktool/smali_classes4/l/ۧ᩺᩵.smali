.class public final Ll/ۧ᩺᩵;
.super Ll/֫᩺᩵;
.source "C8CP"


# static fields
.field public static final ۧ:Ll/֫᩺᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 22
    new-instance v0, Ll/ۧ᩺᩵;

    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, v1}, Ll/֫᩺᩵;-><init>(I)V

    .line 22
    sput-object v0, Ll/ۧ᩺᩵;->ۧ:Ll/֫᩺᩵;

    return-void
.end method


# virtual methods
.method public final ֫([BII)I
    .locals 12

    .line 28
    invoke-static {p2, p3, p1}, Ll/ۛ᩸ۘ;->֫(II[B)V

    add-int v0, p2, p3

    const v1, 0x165667b1

    const v2, -0x61c8864f

    const v3, -0x7a143589

    const/16 v4, 0x10

    if-lt p3, v4, :cond_1

    add-int/lit8 v5, v0, -0x10

    const/4 v6, 0x0

    const v7, 0x24234428

    const v8, 0x61c8864f

    const v9, -0x7a143589

    .line 40
    :goto_0
    invoke-static {p2, p1}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v10

    mul-int v10, v10, v3

    add-int/2addr v10, v7

    const/16 v7, 0xd

    .line 41
    invoke-static {v10, v7}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v10

    mul-int v10, v10, v2

    add-int/lit8 v11, p2, 0x4

    .line 45
    invoke-static {v11, p1}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v11

    mul-int v11, v11, v3

    add-int/2addr v11, v9

    .line 46
    invoke-static {v11, v7}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v9

    mul-int v9, v9, v2

    add-int/lit8 v11, p2, 0x8

    .line 50
    invoke-static {v11, p1}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v11

    mul-int v11, v11, v3

    add-int/2addr v11, v6

    .line 51
    invoke-static {v11, v7}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v6

    mul-int v6, v6, v2

    add-int/lit8 v11, p2, 0xc

    .line 55
    invoke-static {v11, p1}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result v11

    mul-int v11, v11, v3

    add-int/2addr v11, v8

    .line 56
    invoke-static {v11, v7}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v7

    mul-int v8, v7, v2

    add-int/2addr p2, v4

    if-le p2, v5, :cond_0

    const/4 v4, 0x1

    .line 61
    invoke-static {v10, v4}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v4

    const/4 v5, 0x7

    invoke-static {v9, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v5

    add-int/2addr v5, v4

    const/16 v4, 0xc

    invoke-static {v6, v4}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v4

    add-int/2addr v4, v5

    const/16 v5, 0x12

    invoke-static {v8, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v5

    add-int/2addr v5, v4

    goto :goto_1

    :cond_0
    move v7, v10

    goto :goto_0

    :cond_1
    const v5, 0x165667b1

    :goto_1
    add-int/2addr v5, p3

    :goto_2
    add-int/lit8 p3, v0, -0x4

    const v4, -0x3d4d51c3

    if-gt p2, p3, :cond_2

    .line 69
    invoke-static {p2, p1}, Ll/ۛ᩸ۘ;->ܽ(I[B)I

    move-result p3

    mul-int p3, p3, v4

    add-int/2addr p3, v5

    const/16 v4, 0x11

    .line 70
    invoke-static {p3, v4}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result p3

    const v4, 0x27d4eb2f

    mul-int v5, p3, v4

    add-int/lit8 p2, p2, 0x4

    goto :goto_2

    :cond_2
    :goto_3
    if-ge p2, v0, :cond_3

    .line 44
    aget-byte p3, p1, p2

    and-int/lit16 p3, p3, 0xff

    mul-int p3, p3, v1

    add-int/2addr p3, v5

    const/16 v5, 0xb

    .line 76
    invoke-static {p3, v5}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result p3

    mul-int v5, p3, v2

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_3
    ushr-int/lit8 p1, v5, 0xf

    xor-int/2addr p1, v5

    mul-int p1, p1, v3

    ushr-int/lit8 p2, p1, 0xd

    xor-int/2addr p1, p2

    mul-int p1, p1, v4

    ushr-int/lit8 p2, p1, 0x10

    xor-int/2addr p1, p2

    return p1
.end method
