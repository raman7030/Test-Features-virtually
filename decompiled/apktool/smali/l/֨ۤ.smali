.class public final Ll/֨ۤ;
.super Ljava/lang/Object;
.source "Z21V"


# static fields
.field public static ܿۖ᩵:I


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Landroid/text/TextPaint;

.field public final ᩳ:Landroid/text/TextDirectionHeuristic;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Landroid/text/PrecomputedText$Params;)V
    .locals 1

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 210
    invoke-virtual {p1}, Landroid/text/PrecomputedText$Params;->getTextPaint()Landroid/text/TextPaint;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۤ;->ܽ:Landroid/text/TextPaint;

    .line 211
    invoke-virtual {p1}, Landroid/text/PrecomputedText$Params;->getTextDirection()Landroid/text/TextDirectionHeuristic;

    move-result-object v0

    iput-object v0, p0, Ll/֨ۤ;->ᩳ:Landroid/text/TextDirectionHeuristic;

    .line 212
    invoke-virtual {p1}, Landroid/text/PrecomputedText$Params;->getBreakStrategy()I

    move-result v0

    iput v0, p0, Ll/֨ۤ;->֫:I

    .line 213
    invoke-virtual {p1}, Landroid/text/PrecomputedText$Params;->getHyphenationFrequency()I

    move-result p1

    iput p1, p0, Ll/֨ۤ;->ۧ:I

    return-void
.end method

.method public constructor <init>(Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;II)V
    .locals 2

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 194
    new-instance v0, Landroid/text/PrecomputedText$Params$Builder;

    invoke-direct {v0, p1}, Landroid/text/PrecomputedText$Params$Builder;-><init>(Landroid/text/TextPaint;)V

    .line 195
    invoke-virtual {v0, p3}, Landroid/text/PrecomputedText$Params$Builder;->setBreakStrategy(I)Landroid/text/PrecomputedText$Params$Builder;

    move-result-object v0

    .line 196
    invoke-virtual {v0, p4}, Landroid/text/PrecomputedText$Params$Builder;->setHyphenationFrequency(I)Landroid/text/PrecomputedText$Params$Builder;

    move-result-object v0

    .line 197
    invoke-virtual {v0, p2}, Landroid/text/PrecomputedText$Params$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/PrecomputedText$Params$Builder;

    move-result-object v0

    .line 198
    invoke-virtual {v0}, Landroid/text/PrecomputedText$Params$Builder;->build()Landroid/text/PrecomputedText$Params;

    .line 202
    :cond_0
    iput-object p1, p0, Ll/֨ۤ;->ܽ:Landroid/text/TextPaint;

    .line 203
    iput-object p2, p0, Ll/֨ۤ;->ᩳ:Landroid/text/TextDirectionHeuristic;

    .line 204
    iput p3, p0, Ll/֨ۤ;->֫:I

    .line 205
    iput p4, p0, Ll/֨ۤ;->ۧ:I

    return-void
.end method

.method public static ֫᩺᩹(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۠֫֡(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll/ܺ۟᩻;->ᩳ(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۠ۗۢ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ll/۬ۜܽ;

    invoke-virtual {p0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p0

    return p0
.end method

.method public static ۡ۟ᩴ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۨ᩸ۡ;

    invoke-virtual {p0}, Ll/ۨ᩸ۡ;->ܿ()V

    return-void
.end method

.method public static ۡ۬ۜ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p0

    return p0
.end method

.method public static ۤܿ֨(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩵᩶ܿ;

    invoke-virtual {p0}, Ll/᩵᩶ܿ;->ᩴ()V

    return-void
.end method

.method public static ۧۘۖ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/֨۠ۢ;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ۧۘۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۨ۫֨(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static ᩶ۖۢ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public static ᩸ۗۤ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ۡᩳܳ;

    invoke-virtual {p0}, Ll/ۡᩳܳ;->֫()Z

    move-result p0

    return p0
.end method

.method public static ᩸ܿۛ()I
    .locals 1

    const v0, -0x53c0b8a9

    return v0
.end method

.method public static ᩹ۡᩴ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result p0

    return p0
.end method

.method public static ᩹᩶ᩳ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Landroid/widget/TextView;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ᩺۬ۙ()Z
    .locals 1

    invoke-static {}, Ll/᩺᩵ۡ;->ܺ()Z

    move-result v0

    return v0
.end method

.method public static ᩻ᩴ᩵([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 328
    :cond_0
    instance-of v1, p1, Ll/֨ۤ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 331
    :cond_1
    check-cast p1, Ll/֨ۤ;

    .line 332
    invoke-virtual {p0, p1}, Ll/֨ۤ;->֫(Ll/֨ۤ;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    .line 335
    :cond_2
    iget-object v1, p0, Ll/֨ۤ;->ᩳ:Landroid/text/TextDirectionHeuristic;

    .line 235
    iget-object p1, p1, Ll/֨ۤ;->ᩳ:Landroid/text/TextDirectionHeuristic;

    if-ne v1, p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 22

    move-object/from16 v0, p0

    .line 340
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/16 v11, 0xb

    iget-object v12, v0, Ll/֨ۤ;->ᩳ:Landroid/text/TextDirectionHeuristic;

    iget v14, v0, Ll/֨ۤ;->ۧ:I

    iget v13, v0, Ll/֨ۤ;->֫:I

    const/16 v16, 0x8

    iget-object v15, v0, Ll/֨ۤ;->ܽ:Landroid/text/TextPaint;

    if-lt v1, v2, :cond_0

    .line 341
    invoke-virtual {v15}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v15}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 342
    invoke-virtual {v15}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    invoke-virtual {v15}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v18

    invoke-virtual {v15}, Landroid/graphics/Paint;->getFlags()I

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    .line 343
    invoke-virtual {v15}, Landroid/text/TextPaint;->getTextLocales()Landroid/os/LocaleList;

    move-result-object v20

    invoke-virtual {v15}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v21

    invoke-virtual {v15}, Landroid/graphics/Paint;->isElegantTextHeight()Z

    move-result v15

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    .line 344
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v1, v11, v10

    aput-object v2, v11, v9

    aput-object v17, v11, v8

    aput-object v18, v11, v7

    aput-object v19, v11, v6

    aput-object v20, v11, v5

    aput-object v21, v11, v4

    aput-object v15, v11, v3

    aput-object v12, v11, v16

    const/16 v1, 0x9

    aput-object v13, v11, v1

    const/16 v1, 0xa

    aput-object v14, v11, v1

    .line 88
    invoke-static {v11}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v1

    return v1

    .line 346
    :cond_0
    invoke-virtual {v15}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v15}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    .line 347
    invoke-virtual {v15}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v17

    invoke-virtual {v15}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v18

    invoke-virtual {v15}, Landroid/graphics/Paint;->getFlags()I

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    .line 348
    invoke-virtual {v15}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    move-result-object v20

    invoke-virtual {v15}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v21

    invoke-virtual {v15}, Landroid/graphics/Paint;->isElegantTextHeight()Z

    move-result v15

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    .line 349
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-array v11, v11, [Ljava/lang/Object;

    aput-object v1, v11, v10

    aput-object v2, v11, v9

    aput-object v17, v11, v8

    aput-object v18, v11, v7

    aput-object v19, v11, v6

    aput-object v20, v11, v5

    aput-object v21, v11, v4

    aput-object v15, v11, v3

    aput-object v12, v11, v16

    const/16 v1, 0x9

    aput-object v13, v11, v1

    const/16 v1, 0xa

    aput-object v14, v11, v1

    .line 88
    invoke-static {v11}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v1

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 359
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 360
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "textSize="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/֨ۤ;->ܽ:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, ", textScaleX="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, ", textSkewX="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 364
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, ", letterSpacing="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, ", elegantTextHeight="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/graphics/Paint;->isElegantTextHeight()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x18

    const-string v4, ", textLocale="

    if-lt v1, v3, :cond_0

    .line 368
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/text/TextPaint;->getTextLocales()Landroid/os/LocaleList;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 370
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, ", typeface="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x1a

    if-lt v1, v3, :cond_1

    .line 374
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, ", variationSettings="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/text/TextPaint;->getFontVariationSettings()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", textDir="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/֨ۤ;->ᩳ:Landroid/text/TextDirectionHeuristic;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", breakStrategy="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/֨ۤ;->֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", hyphenationFrequency="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/֨ۤ;->ۧ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    .line 379
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 247
    iget v0, p0, Ll/֨ۤ;->֫:I

    return v0
.end method

.method public final ֫(Ll/֨ۤ;)Z
    .locals 5

    .line 268
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    .line 269
    iget v1, p0, Ll/֨ۤ;->֫:I

    .line 247
    iget v3, p1, Ll/֨ۤ;->֫:I

    if-eq v1, v3, :cond_0

    return v2

    .line 272
    :cond_0
    iget v1, p0, Ll/֨ۤ;->ۧ:I

    .line 259
    iget v3, p1, Ll/֨ۤ;->ۧ:I

    if-eq v1, v3, :cond_1

    return v2

    .line 277
    :cond_1
    iget-object v1, p0, Ll/֨ۤ;->ܽ:Landroid/text/TextPaint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    .line 223
    iget-object v4, p1, Ll/֨ۤ;->ܽ:Landroid/text/TextPaint;

    iget-object p1, p1, Ll/֨ۤ;->ܽ:Landroid/text/TextPaint;

    .line 277
    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v4

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_2

    return v2

    .line 280
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v4

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_3

    return v2

    .line 283
    :cond_3
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v4

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_4

    return v2

    .line 287
    :cond_4
    invoke-virtual {v1}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v4

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_5

    return v2

    .line 290
    :cond_5
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v3

    .line 291
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v4

    .line 290
    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    return v2

    .line 295
    :cond_6
    invoke-virtual {v1}, Landroid/graphics/Paint;->getFlags()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Paint;->getFlags()I

    move-result v4

    if-eq v3, v4, :cond_7

    return v2

    :cond_7
    const/16 v3, 0x18

    if-lt v0, v3, :cond_8

    .line 299
    invoke-virtual {v1}, Landroid/text/TextPaint;->getTextLocales()Landroid/os/LocaleList;

    move-result-object v0

    invoke-virtual {p1}, Landroid/text/TextPaint;->getTextLocales()Landroid/os/LocaleList;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    return v2

    .line 303
    :cond_8
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    return v2

    .line 307
    :cond_9
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    if-nez v0, :cond_a

    .line 308
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_b

    return v2

    .line 311
    :cond_a
    invoke-virtual {v1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 259
    iget v0, p0, Ll/֨ۤ;->ۧ:I

    return v0
.end method

.method public final ܽ()Landroid/text/TextDirectionHeuristic;
    .locals 1

    .line 235
    iget-object v0, p0, Ll/֨ۤ;->ᩳ:Landroid/text/TextDirectionHeuristic;

    return-object v0
.end method

.method public final ᩳ()Landroid/text/TextPaint;
    .locals 1

    .line 223
    iget-object v0, p0, Ll/֨ۤ;->ܽ:Landroid/text/TextPaint;

    return-object v0
.end method
