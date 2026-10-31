.class public final Ll/ۡ۫ۡ;
.super Ljava/lang/Object;
.source "28V5"


# instance fields
.field public final ֫:Landroid/graphics/Paint;

.field public final ۧ:[C

.field public final ܽ:Landroid/graphics/Typeface;

.field public final ᩳ:[F


# direct methods
.method public constructor <init>(Landroid/graphics/Typeface;)V
    .locals 3

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    invoke-static {}, Ll/ۖ۫ۡ;->ۧ()I

    move-result v0

    new-array v0, v0, [F

    iput-object v0, p0, Ll/ۡ۫ۡ;->ᩳ:[F

    const/16 v1, 0x28

    new-array v1, v1, [C

    .line 140
    iput-object v1, p0, Ll/ۡ۫ۡ;->ۧ:[C

    .line 143
    iput-object p1, p0, Ll/ۡ۫ۡ;->ܽ:Landroid/graphics/Typeface;

    .line 144
    new-instance v1, Landroid/graphics/Paint;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Ll/ۡ۫ۡ;->֫:Landroid/graphics/Paint;

    .line 145
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 p1, 0x41700000    # 15.0f

    .line 146
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 147
    invoke-static {v0, p1}, Ljava/util/Arrays;->fill([FF)V

    return-void
.end method

.method private ֫(I)F
    .locals 5

    .line 171
    iget-object v0, p0, Ll/ۡ۫ۡ;->ᩳ:[F

    aget v1, v0, p1

    .line 172
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 173
    invoke-static {}, Ll/ۖ۫ۡ;->֫()[C

    move-result-object v1

    aget-char v1, v1, p1

    iget-object v2, p0, Ll/ۡ۫ۡ;->ۧ:[C

    const/4 v3, 0x0

    aput-char v1, v2, v3

    .line 174
    iget-object v1, p0, Ll/ۡ۫ۡ;->֫:Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4}, Landroid/graphics/Paint;->measureText([CII)F

    move-result v1

    .line 175
    aput v1, v0, p1

    :cond_0
    return v1
.end method

.method public static bridge synthetic ֫(Ll/ۡ۫ۡ;)Landroid/graphics/Typeface;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ۫ۡ;->ܽ:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public static ֫(Ll/ۡ۫ۡ;CC)Z
    .locals 6

    .line 154
    iget-object v0, p0, Ll/ۡ۫ۡ;->ۧ:[C

    invoke-static {p1}, Ll/ۖ۫ۡ;->֫(C)I

    move-result v1

    .line 155
    invoke-static {p2}, Ll/ۖ۫ۡ;->֫(C)I

    move-result v2

    .line 156
    invoke-direct {p0, v1}, Ll/ۡ۫ۡ;->֫(I)F

    move-result v1

    .line 157
    invoke-direct {p0, v2}, Ll/ۡ۫ۡ;->֫(I)F

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0x28

    if-ge v4, v5, :cond_0

    .line 159
    aput-char p1, v0, v4

    add-int/lit8 v5, v4, 0x1

    .line 160
    aput-char p2, v0, v5

    add-int/lit8 v4, v4, 0x2

    goto :goto_0

    .line 162
    :cond_0
    iget-object p0, p0, Ll/ۡ۫ۡ;->֫:Landroid/graphics/Paint;

    invoke-virtual {p0, v0, v3, v5}, Landroid/graphics/Paint;->measureText([CII)F

    move-result p0

    add-float/2addr v1, v2

    const/high16 p1, 0x41a00000    # 20.0f

    mul-float v1, v1, p1

    sub-float/2addr v1, p0

    .line 164
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p0

    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p0, p0, p1

    if-gez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v3
.end method
