.class public final Ll/۫᩷֨;
.super Ljava/lang/Object;
.source "A1SA"

# interfaces
.implements Ll/ۤ᩷֨;


# instance fields
.field public ֫:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput p1, p0, Ll/۫᩷֨;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(II[B)I
    .locals 4

    add-int/2addr p2, p1

    add-int/lit8 p2, p2, -0x4

    move v0, p1

    :goto_0
    if-gt v0, p2, :cond_3

    .line 26
    aget-byte v1, p3, v0

    const/16 v2, 0x40

    const/16 v3, 0xc0

    if-ne v1, v2, :cond_0

    add-int/lit8 v2, v0, 0x1

    aget-byte v2, p3, v2

    and-int/2addr v2, v3

    if-eqz v2, :cond_1

    :cond_0
    const/16 v2, 0x7f

    if-ne v1, v2, :cond_2

    add-int/lit8 v1, v0, 0x1

    aget-byte v1, p3, v1

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    .line 28
    :cond_1
    invoke-static {v0, p3}, Ll/ᩳ᩸ۡ;->֫(I[B)I

    move-result v1

    .line 30
    iget v2, p0, Ll/۫᩷֨;->֫:I

    add-int/2addr v2, v0

    sub-int/2addr v2, p1

    ushr-int/lit8 v2, v2, 0x2

    neg-int v2, v2

    add-int/2addr v1, v2

    shl-int/lit8 v1, v1, 0x9

    shr-int/lit8 v1, v1, 0x9

    const v2, 0x3fffffff    # 1.9999999f

    and-int/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    or-int/2addr v1, v2

    .line 39
    invoke-static {v0, v1, p3}, Ll/ᩳ᩸ۡ;->֫(II[B)V

    :cond_2
    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_3
    sub-int/2addr v0, p1

    .line 44
    iget p1, p0, Ll/۫᩷֨;->֫:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/۫᩷֨;->֫:I

    return v0
.end method
