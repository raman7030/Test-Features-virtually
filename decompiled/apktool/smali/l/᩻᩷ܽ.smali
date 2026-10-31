.class public final Ll/᩻᩷ܽ;
.super Ljava/lang/Object;
.source "21QI"

# interfaces
.implements Ll/ۘ᩷ܽ;


# static fields
.field public static final ۧ:Ll/᩻᩷ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Ll/᩻᩷ܽ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    sput-object v0, Ll/᩻᩷ܽ;->ۧ:Ll/᩻᩷ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 70
    sget v0, Ll/ܳ᩷ܽ;->ᩳ:I

    return v0
.end method

.method public final ֫(I[B)I
    .locals 18

    move/from16 v0, p1

    .line 11
    sget-object v1, Ll/ᩳ᩷ܽ;->ܽ:[[I

    .line 12
    sget-object v2, Ll/ᩳ᩷ܽ;->ᩳ:[[I

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x1

    :goto_0
    add-int/lit8 v10, v0, -0x1

    if-ge v3, v10, :cond_7

    .line 18
    aget-byte v10, p2, v3

    if-ltz v10, :cond_0

    goto/16 :goto_5

    :cond_0
    add-int/lit8 v9, v9, 0x1

    const-wide/16 v11, 0x1f4

    const/16 v13, -0x5f

    const/4 v14, -0x2

    if-gt v13, v10, :cond_2

    const/16 v15, -0x9

    if-gt v10, v15, :cond_2

    add-int/lit8 v15, v3, 0x1

    if-ge v15, v0, :cond_2

    .line 23
    aget-byte v15, p2, v15

    if-gt v13, v15, :cond_2

    if-gt v15, v14, :cond_2

    add-int/lit8 v8, v8, 0x1

    add-long/2addr v6, v11

    add-int/lit8 v10, v10, 0x5f

    add-int/lit8 v15, v15, 0x5f

    .line 30
    aget-object v11, v1, v10

    aget v11, v11, v15

    if-eqz v11, :cond_1

    goto :goto_2

    :cond_1
    const/16 v11, 0xf

    if-gt v11, v10, :cond_6

    const/16 v11, 0x37

    if-ge v10, v11, :cond_6

    const-wide/16 v10, 0xc8

    goto :goto_3

    :cond_2
    const/16 v13, -0x7f

    if-gt v13, v10, :cond_5

    if-gt v10, v14, :cond_5

    add-int/lit8 v15, v3, 0x1

    if-ge v15, v0, :cond_5

    .line 35
    aget-byte v15, p2, v15

    const/16 v13, 0x7e

    const/16 v11, 0x40

    if-le v15, v14, :cond_3

    if-gt v11, v15, :cond_5

    if-gt v15, v13, :cond_5

    :cond_3
    add-int/lit8 v8, v8, 0x1

    const-wide/16 v16, 0x1f4

    add-long v6, v6, v16

    add-int/lit8 v10, v10, 0x7f

    if-gt v11, v15, :cond_4

    if-gt v15, v13, :cond_4

    add-int/lit8 v15, v15, -0x40

    goto :goto_1

    :cond_4
    add-int/lit16 v15, v15, 0xc0

    .line 45
    :goto_1
    aget-object v10, v2, v10

    aget v11, v10, v15

    if-eqz v11, :cond_6

    :goto_2
    int-to-long v10, v11

    :goto_3
    add-long/2addr v4, v10

    goto :goto_4

    :cond_5
    const/16 v11, -0x7f

    if-gt v11, v10, :cond_6

    if-gt v10, v14, :cond_6

    add-int/lit8 v10, v3, 0x3

    if-ge v10, v0, :cond_6

    add-int/lit8 v11, v3, 0x1

    .line 48
    aget-byte v11, p2, v11

    const/16 v12, 0x30

    if-gt v12, v11, :cond_6

    const/16 v13, 0x39

    if-gt v11, v13, :cond_6

    add-int/lit8 v11, v3, 0x2

    aget-byte v11, p2, v11

    const/16 v15, -0x7f

    if-gt v15, v11, :cond_6

    if-gt v11, v14, :cond_6

    aget-byte v10, p2, v10

    if-gt v12, v10, :cond_6

    if-gt v10, v13, :cond_6

    add-int/lit8 v8, v8, 0x1

    :cond_6
    :goto_4
    add-int/lit8 v3, v3, 0x1

    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_7
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

    add-int/lit8 v0, v0, -0x1

    return v0
.end method
