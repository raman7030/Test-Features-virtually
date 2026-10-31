.class public final Ll/᩻᩵ۧ;
.super Ljava/lang/Object;
.source "C8PP"


# static fields
.field public static final ܳ:Ljava/util/regex/Pattern;

.field public static final ܽ:Ljava/util/regex/Pattern;

.field public static final ܿ:Ljava/util/regex/Pattern;

.field public static final ᩳ:Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:I

.field public final ۧ:Landroid/graphics/PointF;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v0, "\\{([^}]*)\\}"

    .line 437
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩻᩵ۧ;->ᩳ:Ljava/util/regex/Pattern;

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "\\s*\\d+(?:\\.\\d+)?\\s*"

    aput-object v3, v1, v2

    .line 443
    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1126
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "\\\\pos\\((%1$s),(%1$s)\\)"

    invoke-static {v4, v5, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 443
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    sput-object v1, Ll/᩻᩵ۧ;->ܳ:Ljava/util/regex/Pattern;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v3, v0, v2

    const-string v1, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)"

    .line 1126
    invoke-static {v4, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 447
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩻᩵ۧ;->ܿ:Ljava/util/regex/Pattern;

    const-string v0, "\\\\an(\\d+)"

    .line 452
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩻᩵ۧ;->ܽ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(ILandroid/graphics/PointF;)V
    .locals 0

    .line 457
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 458
    iput p1, p0, Ll/᩻᩵ۧ;->֫:I

    .line 459
    iput-object p2, p0, Ll/᩻᩵ۧ;->ۧ:Landroid/graphics/PointF;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩻᩵ۧ;
    .locals 6

    .line 465
    sget-object v0, Ll/᩻᩵ۧ;->ᩳ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 466
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x1

    .line 467
    invoke-virtual {p0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    :try_start_0
    invoke-static {v4}, Ll/᩻᩵ۧ;->ۧ(Ljava/lang/String;)Landroid/graphics/PointF;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v5, :cond_1

    move-object v1, v5

    .line 533
    :catch_0
    :cond_1
    :try_start_1
    sget-object v5, Ll/᩻᩵ۧ;->ܽ:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 534
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 535
    invoke-virtual {v4, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    invoke-static {v3}, Ll/ۜ᩵ۧ;->֫(Ljava/lang/String;)I

    move-result v3
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :cond_2
    const/4 v3, -0x1

    :goto_1
    if-eq v3, v0, :cond_0

    move v2, v3

    goto :goto_0

    :catch_1
    nop

    goto :goto_0

    .line 485
    :cond_3
    new-instance p0, Ll/᩻᩵ۧ;

    invoke-direct {p0, v2, v1}, Ll/᩻᩵ۧ;-><init>(ILandroid/graphics/PointF;)V

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Landroid/graphics/PointF;
    .locals 6

    .line 504
    sget-object v0, Ll/᩻᩵ۧ;->ܳ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 505
    sget-object v1, Ll/᩻᩵ۧ;->ܿ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 506
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    .line 507
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    if-eqz v3, :cond_0

    .line 513
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override=\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 519
    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 520
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_2

    .line 522
    invoke-virtual {v1, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 523
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 527
    :goto_0
    new-instance v1, Landroid/graphics/PointF;

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-direct {v1, p0, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v1

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 489
    sget-object v0, Ll/᩻᩵ۧ;->ᩳ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
