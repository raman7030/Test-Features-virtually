.class public final Ll/۫۫ᩳ;
.super Ljava/lang/Object;
.source "28WH"


# instance fields
.field public ֫:Ll/ܺۢᩴ;

.field public ۜ:Ll/᩺֫ܿ;

.field public ۧ:Ljava/util/List;

.field public ܳ:I

.field public ܽ:Z

.field public ܿ:Ll/᩷۟ᩳ;

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:Ll/۟᩺ᩳ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2031
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2043
    new-instance v0, Ll/ܺۢᩴ;

    invoke-direct {v0}, Ll/ܺۢᩴ;-><init>()V

    iput-object v0, p0, Ll/۫۫ᩳ;->֫:Ll/ܺۢᩴ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ܳۘ;Z[FI)Z
    .locals 6

    .line 2107
    invoke-interface {p1, p2}, Ll/֡ܳۘ;->ۧ(Z)I

    move-result v0

    .line 2108
    invoke-interface {p1, p2}, Ll/֡ܳۘ;->ᩳ(Z)I

    move-result p1

    .line 2109
    iget-object p2, p0, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    invoke-virtual {p2, v0}, Ll/᩷۟ᩳ;->֫(I)I

    move-result p2

    const/high16 v1, 0x41800000    # 16.0f

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-ne p2, v3, :cond_0

    .line 2111
    iget-object p1, p0, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    invoke-virtual {p1}, Ll/᩷۟ᩳ;->ᩳ()Ll/ۨܰᩳ;

    move-result-object p1

    iget p1, p1, Ll/ۨܰᩳ;->᩹:I

    add-int/2addr p1, v2

    if-ne v0, p1, :cond_2

    .line 2103
    iget-object p1, p0, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Ll/ۢ۫ۡ;->ۜ()F

    move-result p1

    .line 2095
    iget-object p2, p0, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    invoke-virtual {p2}, Ll/ۢ۫ۡ;->ܳ()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v1

    .line 2114
    iget-object v0, p0, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    invoke-virtual {v0}, Ll/᩷۟ᩳ;->size()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, p1

    sub-float p1, v0, p2

    sub-float/2addr p1, p2

    .line 2116
    aput p1, p3, p4

    add-int/2addr p4, v2

    .line 2117
    aput v0, p3, p4

    return v2

    .line 2103
    :cond_0
    iget-object v4, p0, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    invoke-virtual {v4}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v4

    .line 2123
    iget-object v5, p0, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    invoke-virtual {v5, p2}, Ll/᩷۟ᩳ;->ᩳ(I)I

    move-result v5

    if-ne v0, p1, :cond_1

    .line 2095
    iget-object p1, p0, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    invoke-virtual {p1}, Ll/ۢ۫ۡ;->ܳ()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v1

    int-to-float p2, v5

    mul-float p2, p2, v4

    add-float v0, p2, p1

    sub-float/2addr p2, p1

    .line 2129
    aput p2, p3, p4

    add-int/2addr p4, v2

    .line 2130
    aput v0, p3, p4

    return v2

    :cond_1
    add-int/2addr v0, v2

    if-le p1, v0, :cond_3

    .line 2134
    iget-object p2, p0, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    sub-int/2addr p1, v2

    invoke-virtual {p2, p1}, Ll/᩷۟ᩳ;->֫(I)I

    move-result p2

    if-ne p2, v3, :cond_3

    :cond_2
    const/4 p1, 0x0

    return p1

    .line 2139
    :cond_3
    iget-object p1, p0, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    invoke-virtual {p1, p2}, Ll/᩷۟ᩳ;->ܿ(I)I

    move-result p1

    int-to-float p2, v5

    mul-float p2, p2, v4

    add-int/2addr p1, v2

    int-to-float p1, p1

    mul-float p1, p1, v4

    .line 2142
    aput p2, p3, p4

    add-int/2addr p4, v2

    .line 2143
    aput p1, p3, p4

    return v2
.end method

.method public final ֫(Ll/۫ۨᩳ;Ljava/util/List;)Z
    .locals 2

    .line 2079
    iget-boolean v0, p0, Ll/۫۫ᩳ;->ܽ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۫۫ᩳ;->᩻:Ll/۟᩺ᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/۫۫ᩳ;->᩷:I

    iget-object v1, p0, Ll/۫۫ᩳ;->᩻:Ll/۟᩺ᩳ;

    .line 2080
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/۫۫ᩳ;->ۧ:Ljava/util/List;

    if-ne v0, p2, :cond_0

    iget-object p2, p0, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    iget-object v0, p1, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    iget-object p1, p1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iget-object p1, p1, Ll/ۗۤᩳ;->ۗ:Ll/᩷۟ᩳ;

    if-ne p2, p1, :cond_0

    if-eqz p2, :cond_0

    iget p1, p0, Ll/۫۫ᩳ;->ܳ:I

    if-ltz p1, :cond_0

    iget v0, p0, Ll/۫۫ᩳ;->ᩳ:I

    if-gt p1, v0, :cond_0

    .line 2083
    invoke-virtual {p2}, Ll/᩷۟ᩳ;->size()I

    move-result p1

    if-ge v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
