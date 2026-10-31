.class public final Ll/ۗ᩷֨;
.super Ljava/lang/Object;
.source "R1SU"

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
    iput p1, p0, Ll/ۗ᩷֨;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(II[B)I
    .locals 3

    add-int/2addr p2, p1

    add-int/lit8 p2, p2, -0x4

    move v0, p1

    :goto_0
    if-gt v0, p2, :cond_1

    .line 26
    aget-byte v1, p3, v0

    and-int/lit16 v1, v1, 0xfc

    const/16 v2, 0x48

    if-ne v1, v2, :cond_0

    add-int/lit8 v1, v0, 0x3

    aget-byte v1, p3, v1

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 27
    invoke-static {v0, p3}, Ll/ᩳ᩸ۡ;->֫(I[B)I

    move-result v1

    .line 29
    iget v2, p0, Ll/ۗ᩷֨;->֫:I

    add-int/2addr v2, v0

    sub-int/2addr v2, p1

    neg-int v2, v2

    add-int/2addr v1, v2

    const v2, 0x3fffffc

    and-int/2addr v1, v2

    const v2, 0x48000001

    or-int/2addr v1, v2

    .line 34
    invoke-static {v0, v1, p3}, Ll/ᩳ᩸ۡ;->֫(II[B)V

    :cond_0
    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_1
    sub-int/2addr v0, p1

    .line 39
    iget p1, p0, Ll/ۗ᩷֨;->֫:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۗ᩷֨;->֫:I

    return v0
.end method
