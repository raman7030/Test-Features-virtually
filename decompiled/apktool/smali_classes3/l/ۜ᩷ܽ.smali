.class public final Ll/ۜ᩷ܽ;
.super Ljava/lang/Object;
.source "Y1R8"

# interfaces
.implements Ll/ۘ᩷ܽ;


# static fields
.field public static final ۧ:Ll/ۜ᩷ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Ll/ۜ᩷ܽ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    sput-object v0, Ll/ۜ᩷ܽ;->ۧ:Ll/ۜ᩷ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 43
    sget v0, Ll/ܳ᩷ܽ;->ܿ:I

    return v0
.end method

.method public final ֫(I[B)I
    .locals 13

    .line 11
    sget-object v0, Ll/ᩳ᩷ܽ;->ܽ:[[I

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    :goto_0
    add-int/lit8 v8, p1, -0x1

    if-ge v1, v8, :cond_3

    .line 17
    aget-byte v8, p2, v1

    if-ltz v8, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v7, v7, 0x1

    const/16 v9, -0x5f

    if-gt v9, v8, :cond_2

    const/16 v10, -0x9

    if-gt v8, v10, :cond_2

    add-int/lit8 v10, v1, 0x1

    .line 21
    aget-byte v10, p2, v10

    if-gt v9, v10, :cond_2

    const/4 v9, -0x2

    if-gt v10, v9, :cond_2

    add-int/lit8 v6, v6, 0x1

    const-wide/16 v11, 0x1f4

    add-long/2addr v4, v11

    add-int/lit8 v8, v8, 0x5f

    add-int/lit8 v10, v10, 0x5f

    .line 26
    aget-object v9, v0, v8

    aget v9, v9, v10

    if-eqz v9, :cond_1

    int-to-long v8, v9

    goto :goto_1

    :cond_1
    const/16 v9, 0xf

    if-gt v9, v8, :cond_2

    const/16 v9, 0x37

    if-ge v8, v9, :cond_2

    const-wide/16 v8, 0xc8

    :goto_1
    add-long/2addr v2, v8

    :cond_2
    add-int/lit8 v1, v1, 0x1

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    int-to-float p1, v6

    int-to-float p2, v7

    div-float/2addr p1, p2

    const/high16 p2, 0x42480000    # 50.0f

    mul-float p1, p1, p2

    long-to-float v0, v2

    long-to-float v1, v4

    div-float/2addr v0, v1

    mul-float v0, v0, p2

    add-float/2addr v0, p1

    float-to-int p1, v0

    return p1
.end method
