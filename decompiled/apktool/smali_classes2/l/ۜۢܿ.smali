.class public final Ll/ۜۢܿ;
.super Ljava/lang/Object;
.source "7704"


# instance fields
.field public final ֫:Ll/ᩳۢܿ;

.field public final ۜ:Ll/᩶᩸ᩳ;

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:Ll/ۢۖܿ;

.field public final ᩳ:Ll/᩺ܺܿ;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/᩶᩸ᩳ;Ll/᩺ܺܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;II)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "textOwner"

    .line 27
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۜۢܿ;->ۜ:Ll/᩶᩸ᩳ;

    .line 28
    iput-object p2, p0, Ll/ۜۢܿ;->ᩳ:Ll/᩺ܺܿ;

    const-string v0, "store"

    .line 29
    invoke-static {p3, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p3, p0, Ll/ۜۢܿ;->ܿ:Ll/ۢۖܿ;

    const-string v0, "contexts"

    .line 30
    invoke-static {p4, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p4, p0, Ll/ۜۢܿ;->֫:Ll/ᩳۢܿ;

    .line 31
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    iput v0, p0, Ll/ۜۢܿ;->᩻:I

    .line 32
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Ll/ۜۢܿ;->ܳ:I

    .line 33
    invoke-static {p5, p6, p1}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    .line 34
    invoke-virtual {p3}, Ll/ۢۖܿ;->֫()I

    move-result p3

    if-ne p3, p1, :cond_0

    .line 35
    invoke-virtual {p4}, Ll/ᩳۢܿ;->ۧ()I

    move-result p1

    sub-int p3, p6, p5

    if-ne p1, p3, :cond_0

    .line 36
    invoke-virtual {p4}, Ll/ᩳۢܿ;->ۧ()I

    move-result p1

    iget-object p2, p2, Ll/᩺ܺܿ;->ۡ:Ll/ܶۜܿ;

    invoke-virtual {p4, p1, p2}, Ll/ᩳۢܿ;->֫(ILl/ܶۜܿ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 39
    iput p5, p0, Ll/ۜۢܿ;->ܽ:I

    .line 40
    iput p6, p0, Ll/ۜۢܿ;->ۧ:I

    return-void

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Syntax consumer context differs from display"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;)Ll/ۜۢܿ;
    .locals 8

    .line 46
    new-instance v7, Ll/ۜۢܿ;

    const/4 v5, 0x0

    .line 47
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Ll/ۜۢܿ;-><init>(Ll/᩶᩸ᩳ;Ll/᩺ܺܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;II)V

    return-object v7
.end method

.method public static ֫(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;II)Ll/ۜۢܿ;
    .locals 8

    .line 54
    new-instance v7, Ll/ۜۢܿ;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Ll/ۜۢܿ;-><init>(Ll/᩶᩸ᩳ;Ll/᩺ܺܿ;Ll/ۢۖܿ;Ll/ᩳۢܿ;II)V

    return-object v7
.end method

.method public static bridge synthetic ֫(Ll/ۜۢܿ;)Ll/ᩳۢܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۢܿ;->֫:Ll/ᩳۢܿ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۜۢܿ;II)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۜۢܿ;->ᩳ(II)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۜۢܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۜۢܿ;->ܽ:I

    return p0
.end method

.method private ᩳ(II)V
    .locals 0

    .line 149
    invoke-virtual {p0, p1, p2}, Ll/ۜۢܿ;->ۧ(II)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 150
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Syntax context is unknown outside coverage"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 89
    iget v0, p0, Ll/ۜۢܿ;->ܳ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    add-int/lit8 v0, p1, 0x1

    .line 90
    invoke-direct {p0, p1, v0}, Ll/ۜۢܿ;->ᩳ(II)V

    .line 91
    iget v0, p0, Ll/ۜۢܿ;->ܽ:I

    sub-int/2addr p1, v0

    iget-object v0, p0, Ll/ۜۢܿ;->֫:Ll/ᩳۢܿ;

    invoke-virtual {v0, p1}, Ll/ᩳۢܿ;->֫(I)I

    move-result p1

    return p1
.end method

.method public final ֫(II)I
    .locals 2

    .line 96
    invoke-direct {p0, p1, p2}, Ll/ۜۢܿ;->ᩳ(II)V

    .line 97
    iget v0, p0, Ll/ۜۢܿ;->ܽ:I

    iget-object v1, p0, Ll/ۜۢܿ;->֫:Ll/ᩳۢܿ;

    if-ne p1, p2, :cond_2

    .line 98
    iget p2, p0, Ll/ۜۢܿ;->ܳ:I

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-ge p1, p2, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 p1, p1, -0x1

    :goto_0
    sub-int/2addr p1, v0

    .line 102
    invoke-virtual {v1, p1}, Ll/ᩳۢܿ;->֫(I)I

    move-result p1

    return p1

    :cond_2
    sub-int/2addr p1, v0

    sub-int/2addr p2, v0

    .line 104
    invoke-virtual {v1, p1, p2}, Ll/ᩳۢܿ;->֫(II)I

    move-result p1

    return p1
.end method

.method public final ֫()Ll/ۢۖܿ;
    .locals 1

    .line 144
    iget-object v0, p0, Ll/ۜۢܿ;->ܿ:Ll/ۢۖܿ;

    return-object v0
.end method

.method public final ֫(Ll/۟᩺ᩳ;Ll/᩺ܺܿ;)Z
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۜۢܿ;->ۜ:Ll/᩶᩸ᩳ;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Ll/ۜۢܿ;->ᩳ:Ll/᩺ܺܿ;

    if-ne v0, p2, :cond_0

    iget p2, p0, Ll/ۜۢܿ;->᩻:I

    .line 61
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    if-ne p2, v0, :cond_0

    iget p2, p0, Ll/ۜۢܿ;->ܳ:I

    .line 62
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 67
    iget v0, p0, Ll/ۜۢܿ;->ܳ:I

    return v0
.end method

.method public final ۧ(I)I
    .locals 1

    .line 132
    iget-object v0, p0, Ll/ۜۢܿ;->֫:Ll/ᩳۢܿ;

    invoke-virtual {v0, p1}, Ll/ᩳۢܿ;->ۧ(I)I

    move-result p1

    return p1
.end method

.method public final ۧ(II)Z
    .locals 5

    .line 74
    iget v0, p0, Ll/ۜۢܿ;->ܳ:I

    invoke-static {p1, p2, v0}, Ll/ۧ۫ᩴ;->checkFromToIndex(III)I

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 75
    iget v3, p0, Ll/ۜۢܿ;->ۧ:I

    iget v4, p0, Ll/ۜۢܿ;->ܽ:I

    if-ge p1, p2, :cond_1

    if-gt v4, p1, :cond_0

    if-gt p2, v3, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    if-nez v0, :cond_3

    if-nez v4, :cond_2

    if-nez v3, :cond_2

    return v2

    :cond_2
    return v1

    :cond_3
    if-ge p1, v0, :cond_5

    if-gt v4, p1, :cond_4

    if-ge p1, v3, :cond_4

    return v2

    :cond_4
    return v1

    :cond_5
    if-ne v3, v0, :cond_6

    if-ge v4, v3, :cond_6

    return v2

    :cond_6
    return v1
.end method

.method public final ܳ(I)I
    .locals 1

    .line 137
    iget v0, p0, Ll/ۜۢܿ;->ܳ:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    add-int/lit8 v0, p1, 0x1

    .line 138
    invoke-direct {p0, p1, v0}, Ll/ۜۢܿ;->ᩳ(II)V

    .line 139
    iget-object v0, p0, Ll/ۜۢܿ;->ܿ:Ll/ۢۖܿ;

    invoke-virtual {v0, p1}, Ll/ۢۖܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸᩷ܿ;->ۖ()I

    move-result p1

    return p1
.end method

.method public final ܽ(I)Ll/ܶۜܿ;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ۜۢܿ;->֫:Ll/ᩳۢܿ;

    invoke-virtual {v0, p1}, Ll/ᩳۢܿ;->ᩳ(I)Ll/ܶۜܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(II)Ll/ܶۜܿ;
    .locals 0

    .line 111
    invoke-virtual {p0, p1, p2}, Ll/ۜۢܿ;->֫(II)I

    move-result p1

    .line 117
    iget-object p2, p0, Ll/ۜۢܿ;->֫:Ll/ᩳۢܿ;

    invoke-virtual {p2, p1}, Ll/ᩳۢܿ;->ᩳ(I)Ll/ܶۜܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ(I)I
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ۜۢܿ;->֫:Ll/ᩳۢܿ;

    invoke-virtual {v0, p1}, Ll/ᩳۢܿ;->ܳ(I)I

    move-result p1

    iget v0, p0, Ll/ۜۢܿ;->ܽ:I

    add-int/2addr p1, v0

    return p1
.end method

.method public final ᩳ(I)I
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ۜۢܿ;->֫:Ll/ᩳۢܿ;

    invoke-virtual {v0, p1}, Ll/ᩳۢܿ;->ܽ(I)I

    move-result p1

    iget v0, p0, Ll/ۜۢܿ;->ܽ:I

    add-int/2addr p1, v0

    return p1
.end method
