.class public final Ll/ۛ᩷֨;
.super Ljava/lang/Object;
.source "J1SN"

# interfaces
.implements Ll/ۤ᩷֨;


# static fields
.field public static final ܽ:[Z

.field public static final ᩳ:[I


# instance fields
.field public ֫:I

.field public ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8

    new-array v1, v0, [Z

    .line 12
    fill-array-data v1, :array_0

    sput-object v1, Ll/ۛ᩷֨;->ܽ:[Z

    new-array v0, v0, [I

    .line 15
    fill-array-data v0, :array_1

    sput-object v0, Ll/ۛ᩷֨;->ᩳ:[I

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x0t
        0x1t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x1
        0x2
        0x2
        0x3
        0x3
        0x3
        0x3
    .end array-data
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 19
    iput v0, p0, Ll/ۛ᩷֨;->ۧ:I

    add-int/lit8 p1, p1, 0x5

    .line 28
    iput p1, p0, Ll/ۛ᩷֨;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(II[B)I
    .locals 9

    add-int/lit8 v0, p1, -0x1

    add-int/2addr p2, p1

    add-int/lit8 p2, p2, -0x5

    move v1, p1

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gt v1, p2, :cond_9

    .line 38
    aget-byte v4, p3, v1

    and-int/lit16 v4, v4, 0xfe

    const/16 v5, 0xe8

    if-eq v4, v5, :cond_0

    goto/16 :goto_6

    :cond_0
    sub-int v0, v1, v0

    and-int/lit8 v4, v0, -0x4

    const/16 v5, 0xff

    .line 42
    sget-object v6, Ll/ۛ᩷֨;->ᩳ:[I

    if-eqz v4, :cond_1

    .line 43
    iput v2, p0, Ll/ۛ᩷֨;->ۧ:I

    goto :goto_1

    .line 45
    :cond_1
    iget v2, p0, Ll/ۛ᩷֨;->ۧ:I

    add-int/lit8 v0, v0, -0x1

    shl-int v0, v2, v0

    and-int/lit8 v0, v0, 0x7

    iput v0, p0, Ll/ۛ᩷֨;->ۧ:I

    if-eqz v0, :cond_3

    .line 47
    sget-object v2, Ll/ۛ᩷֨;->ܽ:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_2

    add-int/lit8 v2, v1, 0x4

    aget v4, v6, v0

    sub-int/2addr v2, v4

    aget-byte v2, p3, v2

    and-int/2addr v2, v5

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_3

    :cond_2
    shl-int/lit8 v0, v0, 0x1

    or-int/2addr v0, v3

    .line 50
    iput v0, p0, Ll/ۛ᩷֨;->ۧ:I

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 v4, v1, 0x4

    .line 58
    aget-byte v0, p3, v4

    and-int/2addr v0, v5

    if-eqz v0, :cond_5

    if-ne v0, v5, :cond_4

    goto :goto_3

    .line 84
    :cond_4
    iget v0, p0, Ll/ۛ᩷֨;->ۧ:I

    shl-int/2addr v0, v3

    or-int/2addr v0, v3

    iput v0, p0, Ll/ۛ᩷֨;->ۧ:I

    :goto_2
    move v0, v1

    goto :goto_6

    :cond_5
    :goto_3
    add-int/lit8 v7, v1, 0x1

    .line 59
    invoke-static {v7, p3}, Ll/ᩳ᩸ۡ;->ۧ(I[B)I

    move-result v0

    .line 65
    :goto_4
    iget v2, p0, Ll/ۛ᩷֨;->֫:I

    add-int/2addr v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v0, v2

    .line 67
    iget v2, p0, Ll/ۛ᩷֨;->ۧ:I

    if-nez v2, :cond_6

    goto :goto_5

    .line 70
    :cond_6
    aget v2, v6, v2

    mul-int/lit8 v2, v2, 0x8

    rsub-int/lit8 v8, v2, 0x18

    ushr-int v8, v0, v8

    int-to-byte v8, v8

    and-int/2addr v8, v5

    if-eqz v8, :cond_8

    if-ne v8, v5, :cond_7

    goto :goto_7

    :cond_7
    :goto_5
    shl-int/lit8 v0, v0, 0x7

    shr-int/lit8 v0, v0, 0x7

    .line 81
    invoke-static {v7, v0, p3}, Ll/ᩳ᩸ۡ;->ۧ(II[B)V

    move v0, v1

    move v1, v4

    :goto_6
    add-int/2addr v1, v3

    goto :goto_0

    :cond_8
    :goto_7
    rsub-int/lit8 v2, v2, 0x20

    shl-int v2, v3, v2

    sub-int/2addr v2, v3

    xor-int/2addr v0, v2

    goto :goto_4

    :cond_9
    sub-int p2, v1, v0

    and-int/lit8 p3, p2, -0x4

    if-eqz p3, :cond_a

    goto :goto_8

    .line 89
    :cond_a
    iget p3, p0, Ll/ۛ᩷֨;->ۧ:I

    sub-int/2addr p2, v3

    shl-int v2, p3, p2

    :goto_8
    iput v2, p0, Ll/ۛ᩷֨;->ۧ:I

    sub-int/2addr v1, p1

    .line 92
    iget p1, p0, Ll/ۛ᩷֨;->֫:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ۛ᩷֨;->֫:I

    return v1
.end method
