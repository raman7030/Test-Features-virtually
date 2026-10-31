.class public final Ll/᩷᩷ܽ;
.super Ljava/lang/Object;
.source "41PP"

# interfaces
.implements Ll/ۘ᩷ܽ;


# static fields
.field public static final ۧ:Ll/᩷᩷ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Ll/᩷᩷ܽ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    sput-object v0, Ll/᩷᩷ܽ;->ۧ:Ll/᩷᩷ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 60
    sget v0, Ll/ܳ᩷ܽ;->ܳ:I

    return v0
.end method

.method public final ֫(I[B)I
    .locals 16

    .line 11
    sget-object v0, Ll/ᩳ᩷ܽ;->ܽ:[[I

    .line 12
    sget-object v1, Ll/ᩳ᩷ܽ;->ᩳ:[[I

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    :goto_0
    add-int/lit8 v9, p1, -0x1

    if-ge v2, v9, :cond_6

    .line 18
    aget-byte v9, p2, v2

    if-ltz v9, :cond_0

    goto :goto_3

    :cond_0
    add-int/lit8 v8, v8, 0x1

    const-wide/16 v10, 0x1f4

    const/16 v12, -0x5f

    const/4 v13, -0x2

    if-gt v12, v9, :cond_2

    const/16 v14, -0x9

    if-gt v9, v14, :cond_2

    add-int/lit8 v14, v2, 0x1

    .line 23
    aget-byte v14, p2, v14

    if-gt v12, v14, :cond_2

    if-gt v14, v13, :cond_2

    add-int/lit8 v7, v7, 0x1

    add-long/2addr v5, v10

    add-int/lit8 v9, v9, 0x5f

    add-int/lit8 v14, v14, 0x5f

    .line 30
    aget-object v10, v0, v9

    aget v10, v10, v14

    if-eqz v10, :cond_1

    int-to-long v9, v10

    goto :goto_2

    :cond_1
    const/16 v10, 0xf

    if-gt v10, v9, :cond_5

    const/16 v10, 0x37

    if-ge v9, v10, :cond_5

    const-wide/16 v9, 0xc8

    goto :goto_2

    :cond_2
    const/16 v12, -0x7f

    if-gt v12, v9, :cond_5

    if-gt v9, v13, :cond_5

    add-int/lit8 v12, v2, 0x1

    .line 35
    aget-byte v12, p2, v12

    const/16 v14, 0x7e

    const/16 v15, 0x40

    if-le v12, v13, :cond_3

    if-gt v15, v12, :cond_5

    if-gt v12, v14, :cond_5

    :cond_3
    add-int/lit8 v7, v7, 0x1

    add-long/2addr v5, v10

    add-int/lit8 v9, v9, 0x7f

    if-gt v15, v12, :cond_4

    if-gt v12, v14, :cond_4

    add-int/lit8 v12, v12, -0x40

    goto :goto_1

    :cond_4
    add-int/lit16 v12, v12, 0xc0

    .line 45
    :goto_1
    aget-object v9, v1, v9

    aget v9, v9, v12

    if-eqz v9, :cond_5

    int-to-long v9, v9

    :goto_2
    add-long/2addr v3, v9

    :cond_5
    add-int/lit8 v2, v2, 0x1

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    int-to-float v0, v7

    int-to-float v1, v8

    div-float/2addr v0, v1

    const/high16 v1, 0x42480000    # 50.0f

    mul-float v0, v0, v1

    long-to-float v2, v3

    long-to-float v3, v5

    div-float/2addr v2, v3

    mul-float v2, v2, v1

    add-float/2addr v2, v0

    float-to-int v0, v2

    add-int/lit8 v0, v0, -0x1

    return v0
.end method
