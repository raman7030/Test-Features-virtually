.class public final Ll/ᩳܶܳ;
.super Ljava/lang/Object;
.source "37CJ"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:Z

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIIII)V
    .locals 0

    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 293
    iput p1, p0, Ll/ᩳܶܳ;->ܿ:I

    .line 294
    iput p2, p0, Ll/ᩳܶܳ;->ܽ:I

    .line 295
    iput p3, p0, Ll/ᩳܶܳ;->ᩳ:I

    .line 296
    iput p4, p0, Ll/ᩳܶܳ;->֫:I

    .line 297
    iput p5, p0, Ll/ᩳܶܳ;->ۧ:I

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eq p5, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 298
    :goto_1
    iput-boolean p1, p0, Ll/ᩳܶܳ;->ܳ:Z

    return-void
.end method

.method public static ֫(IIII)Ll/ᩳܶܳ;
    .locals 7

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    if-ge p1, p0, :cond_0

    add-int/lit8 p0, p0, -0x1

    :cond_0
    move v3, p0

    if-eq p3, v0, :cond_1

    if-ge p3, p2, :cond_1

    add-int/lit8 p2, p2, -0x1

    :cond_1
    move v4, p2

    if-ne v3, v4, :cond_2

    move v5, v3

    goto :goto_0

    :cond_2
    const/4 p0, -0x1

    const/4 v5, -0x1

    .line 319
    :goto_0
    new-instance p0, Ll/ᩳܶܳ;

    move-object v1, p0

    move v2, p1

    move v6, p3

    invoke-direct/range {v1 .. v6}, Ll/ᩳܶܳ;-><init>(IIIII)V

    return-object p0
.end method
