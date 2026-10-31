.class public final Ll/۠᩷ܽ;
.super Ljava/lang/Object;
.source "C1QZ"

# interfaces
.implements Ll/ۘ᩷ܽ;


# static fields
.field public static final ۧ:Ll/۠᩷ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Ll/۠᩷ܽ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    sput-object v0, Ll/۠᩷ܽ;->ۧ:Ll/۠᩷ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 52
    sget v0, Ll/ܳ᩷ܽ;->᩵:I

    return v0
.end method

.method public final ֫(I[B)I
    .locals 10

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lt p1, v0, :cond_0

    .line 11
    aget-byte v0, p2, v1

    and-int/lit16 v0, v0, 0xff

    const/16 v3, 0xef

    if-ne v0, v3, :cond_0

    aget-byte v0, p2, v2

    and-int/lit16 v0, v0, 0xff

    const/16 v3, 0xbb

    if-ne v0, v3, :cond_0

    const/4 v0, 0x2

    aget-byte v0, p2, v0

    and-int/lit16 v0, v0, 0xff

    const/16 v3, 0xbf

    if-ne v0, v3, :cond_0

    const/16 p1, 0x63

    return p1

    :cond_0
    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v0, p1, :cond_5

    .line 20
    aget-byte v5, p2, v0

    and-int/lit8 v6, v5, 0x7f

    if-ne v6, v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v0, 0x1

    const/16 v7, -0x41

    if-ge v6, p1, :cond_2

    const/16 v8, -0x40

    if-gt v8, v5, :cond_2

    const/16 v8, -0x21

    if-gt v5, v8, :cond_2

    .line 23
    aget-byte v8, p2, v6

    if-gt v8, v7, :cond_2

    add-int/lit8 v4, v4, 0x2

    move v0, v6

    goto :goto_1

    :cond_2
    add-int/lit8 v8, v0, 0x2

    if-ge v8, p1, :cond_3

    const/16 v9, -0x20

    if-gt v9, v5, :cond_3

    const/16 v9, -0x11

    if-gt v5, v9, :cond_3

    .line 26
    aget-byte v9, p2, v6

    if-gt v9, v7, :cond_3

    aget-byte v9, p2, v8

    if-gt v9, v7, :cond_3

    add-int/lit8 v4, v4, 0x3

    move v0, v8

    goto :goto_1

    :cond_3
    add-int/lit8 v7, v0, 0x3

    if-ge v7, p1, :cond_4

    and-int/lit16 v5, v5, 0xff

    const/16 v9, 0xf0

    if-ne v5, v9, :cond_4

    .line 29
    aget-byte v5, p2, v6

    and-int/lit16 v5, v5, 0xff

    const/16 v6, 0x9f

    if-ne v5, v6, :cond_4

    aget-byte v5, p2, v8

    and-int/lit16 v5, v5, 0xff

    const/16 v6, 0x80

    if-lt v5, v6, :cond_4

    add-int/lit8 v4, v4, 0x4

    move v0, v7

    :cond_4
    :goto_1
    add-int/2addr v0, v2

    goto :goto_0

    :cond_5
    if-ne v3, p1, :cond_6

    const/16 p1, 0x64

    return p1

    :cond_6
    int-to-float p2, v4

    sub-int/2addr p1, v3

    int-to-float p1, p1

    div-float/2addr p2, p1

    const/high16 p1, 0x42c80000    # 100.0f

    mul-float p2, p2, p1

    float-to-int p1, p2

    const/16 p2, 0x62

    if-le p1, p2, :cond_7

    goto :goto_2

    :cond_7
    const/16 p2, 0x5f

    if-le p1, p2, :cond_8

    const/16 p2, 0x1e

    if-le v4, p2, :cond_8

    :goto_2
    return p1

    :cond_8
    return v1
.end method
