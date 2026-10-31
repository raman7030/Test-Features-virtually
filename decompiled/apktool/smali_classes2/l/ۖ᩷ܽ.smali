.class public final Ll/ۖ᩷ܽ;
.super Ljava/lang/Object;
.source "H1Q4"

# interfaces
.implements Ll/ۘ᩷ܽ;


# static fields
.field public static final ۧ:Ll/ۖ᩷ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Ll/ۖ᩷ܽ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    sput-object v0, Ll/ۖ᩷ܽ;->ۧ:Ll/ۖ᩷ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 63
    sget v0, Ll/ܳ᩷ܽ;->ۢ:I

    return v0
.end method

.method public final ֫(I[B)I
    .locals 15

    move/from16 v0, p1

    .line 11
    sget-object v1, Ll/ᩳ᩷ܽ;->ܿ:[[I

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x1

    :goto_0
    add-int/lit8 v9, v0, -0x1

    if-ge v6, v9, :cond_a

    .line 18
    aget-byte v9, p2, v6

    if-ltz v9, :cond_0

    goto :goto_4

    :cond_0
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v10, v6, 0x1

    if-ge v10, v0, :cond_9

    const/16 v11, -0x7f

    const/16 v12, -0x20

    if-gt v11, v9, :cond_1

    const/16 v11, -0x61

    if-le v9, v11, :cond_2

    :cond_1
    if-gt v12, v9, :cond_9

    const/16 v11, -0x11

    if-gt v9, v11, :cond_9

    .line 22
    :cond_2
    aget-byte v11, p2, v10

    const/16 v13, 0x40

    if-gt v13, v11, :cond_3

    const/16 v13, 0x7e

    if-le v11, v13, :cond_4

    :cond_3
    const/4 v13, -0x4

    if-gt v11, v13, :cond_9

    :cond_4
    add-int/lit8 v7, v7, 0x1

    const-wide/16 v13, 0x1f4

    add-long/2addr v4, v13

    add-int/lit16 v6, v9, 0x100

    add-int/lit16 v13, v11, 0x100

    const/16 v14, 0x9f

    if-ge v13, v14, :cond_6

    const/16 v14, 0x7f

    if-le v13, v14, :cond_5

    add-int/lit16 v11, v11, 0xe0

    goto :goto_1

    :cond_5
    add-int/lit16 v11, v11, 0xe7

    :goto_1
    const/4 v13, 0x1

    goto :goto_2

    :cond_6
    add-int/lit16 v11, v11, 0x82

    const/4 v13, 0x0

    :goto_2
    const/16 v14, 0xa0

    if-ge v6, v14, :cond_7

    add-int/lit16 v9, v9, 0x90

    goto :goto_3

    :cond_7
    add-int/lit8 v9, v9, 0x50

    :goto_3
    shl-int/lit8 v6, v9, 0x1

    sub-int/2addr v6, v13

    add-int/2addr v6, v12

    add-int/2addr v11, v12

    .line 46
    array-length v9, v1

    if-ge v6, v9, :cond_8

    aget-object v6, v1, v6

    array-length v9, v6

    if-ge v11, v9, :cond_8

    aget v6, v6, v11

    if-eqz v6, :cond_8

    int-to-long v11, v6

    add-long/2addr v2, v11

    :cond_8
    move v6, v10

    :cond_9
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_a
    int-to-float v0, v7

    int-to-float v1, v8

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    mul-float v0, v0, v1

    long-to-float v2, v2

    long-to-float v3, v4

    div-float/2addr v2, v3

    mul-float v2, v2, v1

    add-float/2addr v2, v0

    float-to-int v0, v2

    add-int/lit8 v0, v0, -0x1

    return v0
.end method
