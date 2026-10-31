.class public final Ll/᩸᩷֨;
.super Ljava/lang/Object;
.source "G8EM"

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
    iput p1, p0, Ll/᩸᩷֨;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(II[B)I
    .locals 6

    add-int/2addr p2, p1

    add-int/lit8 p2, p2, -0x4

    move v0, p1

    :goto_0
    if-gt v0, p2, :cond_3

    add-int/lit8 v1, v0, 0x3

    .line 28
    aget-byte v1, p3, v1

    and-int/lit16 v2, v1, 0xfc

    const/16 v3, 0x94

    if-ne v2, v3, :cond_0

    .line 41
    invoke-static {v0, p3}, Ll/ᩳ᩸ۡ;->ۧ(I[B)I

    move-result v1

    .line 43
    iget v2, p0, Ll/᩸᩷֨;->֫:I

    add-int/2addr v2, v0

    sub-int/2addr v2, p1

    ushr-int/lit8 v2, v2, 0x2

    neg-int v2, v2

    add-int/2addr v1, v2

    const v2, 0x3ffffff

    and-int/2addr v1, v2

    const/high16 v2, -0x6c000000

    or-int/2addr v1, v2

    .line 48
    invoke-static {v0, v1, p3}, Ll/ᩳ᩸ۡ;->ۧ(II[B)V

    goto :goto_1

    :cond_0
    and-int/lit16 v1, v1, 0x9f

    const/16 v2, 0x90

    if-ne v1, v2, :cond_2

    .line 62
    invoke-static {v0, p3}, Ll/ᩳ᩸ۡ;->ۧ(I[B)I

    move-result v1

    ushr-int/lit8 v2, v1, 0x1d

    and-int/lit8 v2, v2, 0x3

    ushr-int/lit8 v3, v1, 0x3

    const v4, 0x1ffffc

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    const/high16 v3, 0x20000

    add-int v4, v2, v3

    const/high16 v5, 0x1c0000

    and-int/2addr v4, v5

    if-eqz v4, :cond_1

    goto :goto_1

    .line 75
    :cond_1
    iget v4, p0, Ll/᩸᩷֨;->֫:I

    add-int/2addr v4, v0

    sub-int/2addr v4, p1

    ushr-int/lit8 v4, v4, 0xc

    neg-int v4, v4

    add-int/2addr v2, v4

    const v4, -0x6fffffe1

    and-int/2addr v1, v4

    and-int/lit8 v4, v2, 0x3

    shl-int/lit8 v4, v4, 0x1d

    or-int/2addr v1, v4

    const v4, 0x3fffc

    and-int/2addr v4, v2

    shl-int/lit8 v4, v4, 0x3

    or-int/2addr v1, v4

    and-int/2addr v2, v3

    neg-int v2, v2

    const/high16 v3, 0xe00000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    .line 85
    invoke-static {v0, v1, p3}, Ll/ᩳ᩸ۡ;->ۧ(II[B)V

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_3
    sub-int/2addr v0, p1

    .line 90
    iget p1, p0, Ll/᩸᩷֨;->֫:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/᩸᩷֨;->֫:I

    return v0
.end method
