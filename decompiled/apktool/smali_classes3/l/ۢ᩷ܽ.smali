.class public final Ll/ۢ᩷ܽ;
.super Ljava/lang/Object;
.source "D1QK"

# interfaces
.implements Ll/ۘ᩷ܽ;


# static fields
.field public static final ۧ:Ll/ۢ᩷ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Ll/ۢ᩷ܽ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    sput-object v0, Ll/ۢ᩷ܽ;->ۧ:Ll/ۢ᩷ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 72
    sget v0, Ll/ܳ᩷ܽ;->᩻:I

    return v0
.end method

.method public final ֫(I[B)I
    .locals 18

    move/from16 v0, p1

    .line 11
    sget-object v1, Ll/ᩳ᩷ܽ;->ܽ:[[I

    .line 12
    sget-object v2, Ll/ᩳ᩷ܽ;->ۧ:[[I

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x1

    :goto_0
    add-int/lit8 v10, v0, -0x1

    if-ge v3, v10, :cond_9

    .line 19
    aget-byte v10, p2, v3

    const/16 v11, 0x1b

    if-ne v10, v11, :cond_8

    add-int/lit8 v10, v3, 0x3

    if-ge v10, v0, :cond_8

    add-int/lit8 v12, v3, 0x1

    .line 20
    aget-byte v12, p2, v12

    const/16 v13, 0x29

    const/16 v14, 0x24

    const/16 v15, 0x21

    if-ne v12, v14, :cond_3

    add-int/lit8 v14, v3, 0x2

    aget-byte v14, p2, v14

    if-ne v14, v13, :cond_3

    aget-byte v13, p2, v10

    const/16 v14, 0x41

    if-ne v13, v14, :cond_3

    add-int/lit8 v3, v3, 0x4

    .line 22
    :goto_1
    aget-byte v10, p2, v3

    if-eq v10, v11, :cond_7

    add-int/lit8 v9, v9, 0x1

    if-gt v15, v10, :cond_2

    const/16 v12, 0x77

    if-gt v10, v12, :cond_2

    add-int/lit8 v13, v3, 0x1

    .line 24
    aget-byte v14, p2, v13

    if-gt v15, v14, :cond_2

    if-gt v14, v12, :cond_2

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v10, v10, -0x21

    add-int/lit8 v14, v14, -0x21

    const-wide/16 v16, 0x1f4

    add-long v6, v6, v16

    .line 29
    aget-object v3, v1, v10

    aget v3, v3, v14

    if-eqz v3, :cond_0

    int-to-long v11, v3

    goto :goto_2

    :cond_0
    const/16 v3, 0xf

    if-gt v3, v10, :cond_1

    const/16 v3, 0x37

    if-ge v10, v3, :cond_1

    const-wide/16 v11, 0xc8

    :goto_2
    add-long/2addr v4, v11

    :cond_1
    move v3, v13

    :cond_2
    add-int/lit8 v3, v3, 0x1

    const/16 v11, 0x1b

    goto :goto_1

    :cond_3
    if-ge v10, v0, :cond_7

    const/16 v11, 0x24

    if-ne v12, v11, :cond_7

    add-int/lit8 v11, v3, 0x2

    .line 38
    aget-byte v11, p2, v11

    const/16 v12, 0x29

    if-ne v11, v12, :cond_7

    aget-byte v10, p2, v10

    const/16 v11, 0x47

    if-ne v10, v11, :cond_7

    add-int/lit8 v3, v3, 0x4

    .line 41
    :goto_3
    aget-byte v10, p2, v3

    const/16 v11, 0x1b

    if-eq v10, v11, :cond_7

    add-int/lit8 v9, v9, 0x1

    if-gt v15, v10, :cond_6

    const/16 v11, 0x7e

    if-gt v10, v11, :cond_6

    add-int/lit8 v12, v3, 0x1

    .line 43
    aget-byte v13, p2, v12

    if-gt v15, v13, :cond_6

    if-gt v13, v11, :cond_6

    add-int/lit8 v8, v8, 0x1

    const-wide/16 v16, 0x1f4

    add-long v6, v6, v16

    add-int/lit8 v10, v10, -0x21

    add-int/lit8 v13, v13, -0x21

    .line 48
    aget-object v3, v2, v10

    aget v3, v3, v13

    if-eqz v3, :cond_4

    int-to-long v10, v3

    goto :goto_4

    :cond_4
    const/16 v3, 0x23

    if-gt v3, v10, :cond_5

    const/16 v3, 0x5c

    if-gt v10, v3, :cond_5

    const-wide/16 v10, 0x96

    :goto_4
    add-long/2addr v4, v10

    :cond_5
    move v3, v12

    goto :goto_5

    :cond_6
    const-wide/16 v16, 0x1f4

    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 58
    :cond_7
    aget-byte v10, p2, v3

    const/16 v11, 0x1b

    if-ne v10, v11, :cond_8

    add-int/lit8 v10, v3, 0x2

    if-ge v10, v0, :cond_8

    add-int/lit8 v11, v3, 0x1

    aget-byte v11, p2, v11

    const/16 v12, 0x28

    if-ne v11, v12, :cond_8

    aget-byte v11, p2, v10

    const/16 v12, 0x42

    if-ne v11, v12, :cond_8

    move v3, v10

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_9
    int-to-float v0, v8

    int-to-float v1, v9

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    mul-float v0, v0, v1

    long-to-float v2, v4

    long-to-float v3, v6

    div-float/2addr v2, v3

    mul-float v2, v2, v1

    add-float/2addr v2, v0

    float-to-int v0, v2

    return v0
.end method
