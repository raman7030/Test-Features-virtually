.class public final Ll/᩶ۤᩳ;
.super Ljava/lang/Object;
.source "UAZD"

# interfaces
.implements Ll/ۧۧܿ;


# instance fields
.field public ֫:Ll/ۜܺܿ;

.field public ۧ:Z

.field public ܳ:Ljava/lang/CharSequence;

.field public ܽ:I

.field public ܿ:Ll/ۜ۫ۡ;

.field public ᩳ:I

.field public final synthetic ᩻:Ll/ۗۤᩳ;


# direct methods
.method public constructor <init>(Ll/ۗۤᩳ;)V
    .locals 0

    .line 2178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۤᩳ;->᩻:Ll/ۗۤᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(IFI)F
    .locals 10

    .line 2187
    iget-object v0, p0, Ll/᩶ۤᩳ;->᩻:Ll/ۗۤᩳ;

    iget-object v1, v0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    if-ne p1, p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2188
    :cond_0
    iget-boolean v2, p0, Ll/᩶ۤᩳ;->ۧ:Z

    if-nez v2, :cond_4

    .line 2189
    iget-object v2, p0, Ll/᩶ۤᩳ;->ܿ:Ll/ۜ۫ۡ;

    if-eqz v2, :cond_1

    iget v2, p0, Ll/᩶ۤᩳ;->ᩳ:I

    if-lt p1, v2, :cond_1

    iget v2, p0, Ll/᩶ۤᩳ;->ܽ:I

    if-le p3, v2, :cond_3

    .line 2190
    :cond_1
    iget-object v2, v0, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    const/4 v3, 0x1

    invoke-virtual {v0, p1, v3}, Ll/ۗۤᩳ;->֫(IZ)I

    move-result v3

    invoke-virtual {v2, v3}, Ll/᩷۟ᩳ;->get(I)Ll/ۨܰᩳ;

    move-result-object v2

    .line 2191
    iget v3, v2, Ll/ۨܰᩳ;->᩶:I

    iput v3, p0, Ll/᩶ۤᩳ;->ᩳ:I

    .line 2192
    invoke-virtual {v2}, Ll/ۨܰᩳ;->֫()I

    move-result v7

    iput v7, p0, Ll/᩶ۤᩳ;->ܽ:I

    .line 2193
    iget-object v2, p0, Ll/᩶ۤᩳ;->֫:Ll/ۜܺܿ;

    if-nez v2, :cond_2

    .line 2194
    iget-object v4, v0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    iget-object v5, p0, Ll/᩶ۤᩳ;->ܳ:Ljava/lang/CharSequence;

    iget v6, p0, Ll/᩶ۤᩳ;->ᩳ:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 766
    invoke-virtual/range {v4 .. v9}, Ll/ۢ۫ۡ;->֫(Ljava/lang/CharSequence;IIFLl/ᩳܺܿ;)Ll/ۜ۫ۡ;

    move-result-object v2

    goto :goto_0

    .line 2195
    :cond_2
    iget-object v3, p0, Ll/᩶ۤᩳ;->ܳ:Ljava/lang/CharSequence;

    iget v4, p0, Ll/᩶ۤᩳ;->ᩳ:I

    invoke-virtual {v2, v3, v4, v7, v1}, Ll/ۜܺܿ;->֫(Ljava/lang/CharSequence;IILl/ۢ۫ۡ;)Ll/ۜ۫ۡ;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Ll/᩶ۤᩳ;->ܿ:Ll/ۜ۫ۡ;

    .line 2198
    :cond_3
    iget v2, p0, Ll/᩶ۤᩳ;->ᩳ:I

    if-lt p1, v2, :cond_4

    iget v2, p0, Ll/᩶ۤᩳ;->ܽ:I

    if-gt p3, v2, :cond_4

    .line 2199
    iget-object p2, p0, Ll/᩶ۤᩳ;->ܿ:Ll/ۜ۫ۡ;

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 858
    invoke-virtual {p2, v0, p1}, Ll/ۜ۫ۡ;->֫(FI)F

    move-result p1

    .line 2200
    iget-object p2, p0, Ll/᩶ۤᩳ;->ܿ:Ll/ۜ۫ۡ;

    .line 858
    invoke-virtual {p2, v0, p3}, Ll/ۜ۫ۡ;->֫(FI)F

    move-result p2

    sub-float/2addr p2, p1

    return p2

    .line 2203
    :cond_4
    iget-object v2, p0, Ll/᩶ۤᩳ;->֫:Ll/ۜܺܿ;

    if-nez v2, :cond_5

    iget-object v0, p0, Ll/᩶ۤᩳ;->ܳ:Ljava/lang/CharSequence;

    invoke-virtual {v1, v0, p1, p3, p2}, Ll/ۢ۫ۡ;->ۧ(Ljava/lang/CharSequence;IIF)F

    move-result p1

    return p1

    .line 2204
    :cond_5
    iget-object v1, p0, Ll/᩶ۤᩳ;->ܳ:Ljava/lang/CharSequence;

    iget-object v5, v0, Ll/ۗۤᩳ;->᩻֫:Ll/᩺֫ܿ;

    move-object v0, v2

    move v2, p1

    move v3, p3

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Ll/ۜܺܿ;->֫(Ljava/lang/CharSequence;IIFLl/ۢ۫ۡ;)F

    move-result p1

    return p1
.end method
