.class public abstract Ll/ۨ֨ۘ;
.super Ljava/lang/Object;
.source "K7K1"


# instance fields
.field public ֫:I

.field public ۧ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Ll/ۨ֨ۘ;->֫:I

    .line 5
    iput v0, p0, Ll/ۨ֨ۘ;->ۧ:I

    return-void
.end method


# virtual methods
.method public abstract ֫()I
.end method

.method public final ֫(FI)V
    .locals 4

    int-to-float p2, p2

    add-float/2addr p2, p1

    .line 11
    invoke-virtual {p0}, Ll/ۨ֨ۘ;->֫()I

    move-result p1

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    int-to-float p1, p1

    cmpg-float v1, p2, p1

    if-nez v1, :cond_0

    const p2, 0x38d1b717    # 1.0E-4f

    sub-float p2, p1, p2

    :cond_0
    float-to-int v1, p2

    add-int/lit8 v2, v1, 0x1

    int-to-float v3, v2

    cmpl-float p1, v3, p1

    if-gtz p1, :cond_5

    if-gez v1, :cond_1

    goto :goto_3

    :cond_1
    int-to-float p1, v0

    rem-float/2addr p2, p1

    .line 22
    invoke-virtual {p0, v1, p2, v2}, Ll/ۨ֨ۘ;->֫(IFI)V

    .line 24
    iget p1, p0, Ll/ۨ֨ۘ;->֫:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_4

    if-le v1, p1, :cond_3

    const/high16 p2, -0x80000000

    if-gt v1, p2, :cond_2

    .line 86
    invoke-static {}, Ll/ۙ᩶᩵;->ܽ()Ll/ۙ᩶᩵;

    move-result-object p1

    goto :goto_0

    .line 1131
    :cond_2
    new-instance p2, Ll/ۙ᩶᩵;

    add-int/lit8 v3, v1, -0x1

    .line 54
    invoke-direct {p2, p1, v3, v0}, Ll/᩹᩶᩵;-><init>(III)V

    move-object p1, p2

    .line 1915
    :goto_0
    invoke-virtual {p1}, Ll/᩹᩶᩵;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    move-object p2, p1

    check-cast p2, Ll/᩶᩶᩵;

    invoke-virtual {p2}, Ll/᩶᩶᩵;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    move-object p2, p1

    check-cast p2, Ll/᩶᩶᩵;

    invoke-virtual {p2}, Ll/᩶᩶᩵;->nextInt()I

    move-result p2

    .line 27
    invoke-virtual {p0, p2}, Ll/ۨ֨ۘ;->֫(I)V

    goto :goto_1

    .line 31
    :cond_3
    iget p1, p0, Ll/ۨ֨ۘ;->ۧ:I

    if-ge v2, p1, :cond_4

    .line 32
    invoke-virtual {p0, p1}, Ll/ۨ֨ۘ;->֫(I)V

    .line 33
    new-instance p1, Ll/ۙ᩶᩵;

    add-int/lit8 p2, v1, 0x2

    iget v3, p0, Ll/ۨ֨ۘ;->ۧ:I

    .line 54
    invoke-direct {p1, p2, v3, v0}, Ll/᩹᩶᩵;-><init>(III)V

    .line 1915
    invoke-virtual {p1}, Ll/᩹᩶᩵;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    move-object p2, p1

    check-cast p2, Ll/᩶᩶᩵;

    invoke-virtual {p2}, Ll/᩶᩶᩵;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    move-object p2, p1

    check-cast p2, Ll/᩶᩶᩵;

    invoke-virtual {p2}, Ll/᩶᩶᩵;->nextInt()I

    move-result p2

    .line 34
    invoke-virtual {p0, p2}, Ll/ۨ֨ۘ;->֫(I)V

    goto :goto_2

    .line 39
    :cond_4
    iput v1, p0, Ll/ۨ֨ۘ;->֫:I

    .line 40
    iput v2, p0, Ll/ۨ֨ۘ;->ۧ:I

    :cond_5
    :goto_3
    return-void
.end method

.method public abstract ֫(I)V
.end method

.method public abstract ֫(IFI)V
.end method
