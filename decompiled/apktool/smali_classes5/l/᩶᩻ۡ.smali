.class public Ll/᩶᩻ۡ;
.super Ll/᩻᩶ۘ;
.source "A924"

# interfaces
.implements Ll/᩷᩻ۡ;


# static fields
.field public static final ܽ:Ll/ۧܰ᩵;

.field public static final ᩳ:Ll/ܿ۟᩵;


# instance fields
.field public ֫:I

.field public final ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 91
    new-instance v0, Ll/۟᩺᩵;

    new-instance v1, Ljava/io/File;

    invoke-static {}, Ll/ۙ᩸᩷;->ܽ()Ljava/io/File;

    move-result-object v2

    const-string v3, "markwon"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ll/۟᩺᩵;-><init>(Ljava/io/File;)V

    .line 92
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿ۟᩵;->ۖ()Ll/ᩳ۟᩵;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ᩳ۟᩵;->֫(Ll/۟᩺᩵;)V

    invoke-virtual {v1}, Ll/ᩳ۟᩵;->֫()Ll/ܿ۟᩵;

    move-result-object v0

    sput-object v0, Ll/᩶᩻ۡ;->ᩳ:Ll/ܿ۟᩵;

    .line 93
    new-instance v0, Ll/֫ܰ᩵;

    invoke-direct {v0}, Ll/֫ܰ᩵;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 94
    invoke-virtual {v0}, Ll/֫ܰ᩵;->ۧ()V

    .line 95
    invoke-virtual {v0}, Ll/֫ܰ᩵;->ܽ()V

    .line 96
    invoke-virtual {v0}, Ll/֫ܰ᩵;->֫()Ll/ۧܰ᩵;

    move-result-object v0

    sput-object v0, Ll/᩶᩻ۡ;->ܽ:Ll/ۧܰ᩵;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-boolean p1, p0, Ll/᩶᩻ۡ;->ۧ:Z

    return-void
.end method

.method public static ֫(Landroid/content/Context;Z)Ll/ܺ᩶ۘ;
    .locals 1

    .line 106
    invoke-static {p0}, Ll/ܺ᩶ۘ;->֫(Landroid/content/Context;)Ll/ۡ᩶ۘ;

    move-result-object p0

    .line 112
    new-instance v0, Ll/᩶᩻ۡ;

    invoke-direct {v0, p1}, Ll/᩶᩻ۡ;-><init>(Z)V

    invoke-virtual {v0}, Ll/᩶᩻ۡ;->֫()Ljava/util/List;

    move-result-object p1

    .line 107
    invoke-interface {p0, p1}, Ll/ۡ᩶ۘ;->֫(Ljava/util/List;)Ll/ۡ᩶ۘ;

    .line 108
    invoke-interface {p0}, Ll/ۡ᩶ۘ;->build()Ll/ܺ᩶ۘ;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/ۗ᩶ۘ;Ljava/lang/String;Ljava/lang/String;Ll/ۨ֡֡;)V
    .locals 9

    .line 190
    invoke-interface {p1, p4}, Ll/ۗ᩶ۘ;->ᩳ(Ll/֡ۚ֡;)V

    .line 191
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object v0

    .line 193
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v1

    .line 195
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->ܽ()Ll/ᩴ᩶ۘ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ᩴ᩶ۘ;->᩻()Ll/۬ۙۘ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۬ۙۘ;->ᩳ()I

    move-result v2

    const/16 v3, 0xa

    .line 197
    invoke-virtual {v0, v3}, Ll/ᩳۙۘ;->append(C)V

    .line 198
    new-instance v4, Landroid/text/style/AbsoluteSizeSpan;

    iget v5, p0, Ll/᩶᩻ۡ;->֫:I

    sub-int v5, v2, v5

    const/4 v6, 0x0

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-direct {v4, v5}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v0}, Ll/ᩳۙۘ;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v0}, Ll/ᩳۙۘ;->length()I

    move-result v7

    const/16 v8, 0x21

    invoke-virtual {v0, v4, v5, v7, v8}, Ll/ᩳۙۘ;->setSpan(Ljava/lang/Object;III)V

    .line 200
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->ܽ()Ll/ᩴ᩶ۘ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ᩴ᩶ۘ;->ܳ()Ll/֡ܰ᩵;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, p3}, Ll/ᩳۙۘ;->append(Ljava/lang/CharSequence;)V

    .line 202
    invoke-virtual {v0, v3}, Ll/ᩳۙۘ;->append(C)V

    .line 203
    new-instance p3, Landroid/text/style/AbsoluteSizeSpan;

    iget v3, p0, Ll/᩶᩻ۡ;->֫:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-direct {p3, v2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v0}, Ll/ᩳۙۘ;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0}, Ll/ᩳۙۘ;->length()I

    move-result v3

    invoke-virtual {v0, p3, v2, v3, v8}, Ll/ᩳۙۘ;->setSpan(Ljava/lang/Object;III)V

    .line 206
    sget-object p3, Ll/ۙۙۘ;->ۧ:Ll/ۨ᩶ۘ;

    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v0

    invoke-virtual {p3, v0, p2}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 208
    invoke-interface {p1, p4, v1}, Ll/ۗ᩶ۘ;->֫(Ll/֡ۚ֡;I)V

    .line 210
    invoke-interface {p1, p4}, Ll/ۗ᩶ۘ;->ܿ(Ll/֡ۚ֡;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩶᩻ۡ;Ll/ۗ᩶ۘ;Ll/ܳۚ֡;)V
    .locals 2

    .line 180
    invoke-virtual {p2}, Ll/ܳۚ֡;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ll/ܳۚ֡;->ۡ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1, p2}, Ll/᩶᩻ۡ;->֫(Ll/ۗ᩶ۘ;Ljava/lang/String;Ljava/lang/String;Ll/ۨ֡֡;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩶᩻ۡ;Ll/ۗ᩶ۘ;Ll/ܺۚ֡;)V
    .locals 2

    const/4 v0, 0x0

    .line 181
    invoke-virtual {p2}, Ll/ܺۚ֡;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1, p2}, Ll/᩶᩻ۡ;->֫(Ll/ۗ᩶ۘ;Ljava/lang/String;Ljava/lang/String;Ll/ۨ֡֡;)V

    return-void
.end method

.method public static bridge synthetic ۧ()Ll/ۧܰ᩵;
    .locals 1

    .line 0
    sget-object v0, Ll/᩶᩻ۡ;->ܽ:Ll/ۧܰ᩵;

    return-object v0
.end method

.method public static bridge synthetic ܽ()Ll/ܿ۟᩵;
    .locals 1

    .line 0
    sget-object v0, Ll/᩶᩻ۡ;->ᩳ:Ll/ܿ۟᩵;

    return-object v0
.end method


# virtual methods
.method public ֫(Ll/֡ۚ֡;)F
    .locals 1

    .line 150
    instance-of v0, p1, Ll/ۜۚ֡;

    if-eqz v0, :cond_3

    check-cast p1, Ll/ۜۚ֡;

    .line 151
    invoke-virtual {p1}, Ll/ۜۚ֡;->᩷()I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f400000    # 0.75f

    return p1

    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    return p1

    :cond_2
    const/high16 p1, 0x40000000    # 2.0f

    return p1

    :cond_3
    :goto_0
    const p1, 0x3ecccccd    # 0.4f

    return p1
.end method

.method public final ֫()Ljava/util/List;
    .locals 8

    .line 32
    new-instance v0, Ll/۠ۗۘ;

    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 329
    new-instance v1, Ll/ܺ᩻ۡ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 330
    invoke-static {v1}, Ll/ۚ۬ۘ;->֫(Ll/ܺ᩻ۡ;)Ll/ۚ۬ۘ;

    move-result-object v1

    new-instance v2, Ll/᩶۫᩷;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 331
    invoke-static {v2}, Ll/ۤۗۘ;->֫(Ll/᩶۫᩷;)Ll/ۤۗۘ;

    move-result-object v2

    new-instance v3, Ll/ۖ᩻ۡ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 345
    invoke-static {v3}, Ll/ۗۨۘ;->֫(Ll/ۖ᩻ۡ;)Ll/ۗۨۘ;

    move-result-object v3

    .line 349
    invoke-static {p0}, Ll/ۡ᩻ۡ;->֫(Ll/᩶᩻ۡ;)Ll/ۡ᩻ۡ;

    move-result-object v4

    .line 30
    new-instance v5, Ll/ܶۗۘ;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v6

    invoke-direct {v5, v6}, Ll/ܶۗۘ;-><init>(Landroid/text/method/MovementMethod;)V

    .line 350
    invoke-static {v5}, Ll/᩻᩺ۘ;->֫(Ll/ܶۗۘ;)Ll/᩻᩺ۘ;

    move-result-object v5

    const/4 v6, 0x7

    new-array v6, v6, [Ll/ۚ᩶ۘ;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v2, v6, v0

    const/4 v0, 0x3

    aput-object v3, v6, v0

    const/4 v0, 0x4

    aput-object v4, v6, v0

    const/4 v0, 0x5

    aput-object v5, v6, v0

    const/4 v0, 0x6

    aput-object p0, v6, v0

    .line 328
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;)V
    .locals 1

    .line 138
    invoke-virtual {p1}, Landroid/widget/TextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object p2

    .line 139
    new-instance v0, Ll/᩵᩻ۡ;

    invoke-direct {v0, p1, p2}, Ll/᩵᩻ۡ;-><init>(Landroid/widget/TextView;Landroid/text/method/MovementMethod;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public ֫(Ll/ۗۙۘ;)V
    .locals 12

    const/high16 v0, 0x40a00000    # 5.0f

    .line 117
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۗۙۘ;->ᩳ(I)V

    .line 118
    invoke-virtual {p1}, Ll/ۗۙۘ;->ܽ()V

    sget v0, Ll/᩹֡᩷;->ܳ:I

    .line 119
    invoke-virtual {p1, v0}, Ll/ۗۙۘ;->ܳ(I)V

    .line 120
    iget-boolean v0, p0, Ll/᩶᩻ۡ;->ۧ:Z

    xor-int/lit8 v1, v0, 0x1

    invoke-virtual {p1, v1}, Ll/ۗۙۘ;->᩻(I)V

    sget v1, Ll/᩹֡᩷;->ܳ:I

    .line 121
    invoke-virtual {p1, v1}, Ll/ۗۙۘ;->ۜ(I)V

    const/4 v1, 0x1

    .line 122
    invoke-virtual {p1, v1}, Ll/ۗۙۘ;->᩷(I)V

    const v2, 0x3f666666    # 0.9f

    const/4 v3, 0x5

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x4

    const v6, 0x3f8ccccd    # 1.1f

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/high16 v9, 0x3fc00000    # 1.5f

    const/4 v10, 0x6

    const/4 v11, 0x0

    if-nez v0, :cond_0

    new-array v0, v10, [F

    const v10, 0x3fe66666    # 1.8f

    aput v10, v0, v11

    aput v9, v0, v1

    const/high16 v1, 0x3fa00000    # 1.25f

    aput v1, v0, v8

    aput v6, v0, v7

    aput v4, v0, v5

    aput v2, v0, v3

    goto :goto_0

    :cond_0
    new-array v0, v10, [F

    aput v9, v0, v11

    const v9, 0x3faccccd    # 1.35f

    aput v9, v0, v1

    const v1, 0x3f99999a    # 1.2f

    aput v1, v0, v8

    aput v6, v0, v7

    aput v4, v0, v5

    aput v2, v0, v3

    .line 123
    :goto_0
    invoke-virtual {p1, v0}, Ll/ۗۙۘ;->֫([F)V

    return-void
.end method

.method public final ֫(Ll/ۘ᩶ۘ;)V
    .locals 2

    .line 215
    new-instance v0, Ll/ۚ᩻ۡ;

    const/4 v1, 0x4

    .line 12
    invoke-direct {v0, v1}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 215
    invoke-virtual {p1, v0}, Ll/ۘ᩶ۘ;->֫(Ll/ۖ᩹ۢ;)V

    return-void
.end method

.method public final ֫(Ll/᩶᩶ۘ;)V
    .locals 2

    .line 168
    new-instance v0, Ll/֡᩻ۡ;

    invoke-direct {v0, p0}, Ll/֡᩻ۡ;-><init>(Ll/᩶᩻ۡ;)V

    invoke-interface {p1, v0}, Ll/᩶᩶ۘ;->֫(Ll/᩹᩶ۘ;)Ll/᩶᩶ۘ;

    .line 180
    new-instance v0, Ll/ۘ᩻ۡ;

    invoke-direct {v0, p0}, Ll/ۘ᩻ۡ;-><init>(Ll/᩶᩻ۡ;)V

    const-class v1, Ll/ܳۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    .line 181
    new-instance v0, Ll/ᩴ᩻ۡ;

    invoke-direct {v0, p0}, Ll/ᩴ᩻ۡ;-><init>(Ll/᩶᩻ۡ;)V

    const-class v1, Ll/ܺۚ֡;

    invoke-interface {p1, v1, v0}, Ll/᩶᩶ۘ;->֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;

    return-void
.end method

.method public ֫(Landroid/view/View;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "open://"

    .line 228
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 229
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    instance-of v0, p1, Ll/ۗܺ᩷;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۗܺ᩷;

    .line 230
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "https"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x4

    .line 0
    invoke-static {v2, p2, v0}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 250
    new-instance v0, Ll/ܶ᩻ۡ;

    invoke-direct {v0, p1, p2}, Ll/ܶ᩻ۡ;-><init>(Ll/ۗܺ᩷;Ljava/lang/String;)V

    .line 324
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    :cond_0
    return v1

    :cond_1
    const-string p1, "copy://"

    .line 234
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x7

    .line 235
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    return v1

    :cond_2
    const-string p1, "toast://"

    .line 238
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/16 p1, 0x8

    .line 239
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return v1

    :cond_3
    const-string p1, "toastl://"

    .line 242
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/16 p1, 0x9

    .line 243
    invoke-virtual {p2, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return v1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Landroid/widget/TextView;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 131
    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getLineHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result p1

    sub-int p1, v0, p1

    :goto_0
    iput p1, p0, Ll/᩶᩻ۡ;->֫:I

    return-void
.end method
