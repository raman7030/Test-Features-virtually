.class public final Ll/ۧܶܳ;
.super Ljava/lang/Object;
.source "37CJ"


# instance fields
.field public final ֫:Z

.field public final ۧ:I


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 339
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 340
    iput p1, p0, Ll/ۧܶܳ;->ۧ:I

    .line 341
    iput-boolean p2, p0, Ll/ۧܶܳ;->֫:Z

    return-void
.end method

.method public static ֫(ILjava/util/ArrayList;FF)Ll/ۧܶܳ;
    .locals 3

    const/4 v0, 0x1

    cmpl-float p2, p2, p3

    if-ltz p2, :cond_0

    .line 354
    new-instance p1, Ll/ۧܶܳ;

    invoke-direct {p1, p0, v0}, Ll/ۧܶܳ;-><init>(IZ)V

    return-object p1

    .line 357
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 p3, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_3

    .line 358
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰܶܳ;

    iget v2, v2, Ll/ܰܶܳ;->֫:I

    if-ne v2, p0, :cond_2

    if-nez v1, :cond_1

    const/4 p0, -0x1

    goto :goto_1

    :cond_1
    sub-int/2addr v1, v0

    .line 359
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܰܶܳ;

    iget p0, p0, Ll/ܰܶܳ;->֫:I

    .line 360
    :goto_1
    new-instance p1, Ll/ۧܶܳ;

    invoke-direct {p1, p0, p3}, Ll/ۧܶܳ;-><init>(IZ)V

    return-object p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 363
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unknown target group "

    .line 0
    invoke-static {p0, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 363
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
