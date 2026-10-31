.class public final Ll/۫ܽܽ;
.super Ljava/lang/Object;
.source "45G7"


# static fields
.field public static final ܳ:[Ljava/lang/String;

.field public static final ᩻:[Ljava/lang/String;


# instance fields
.field public final ֫:Z

.field public final ۧ:Ll/ۢ᩻ܽ;

.field public volatile ܽ:Ll/ܿᩳܽ;

.field public final ܿ:Z

.field public ᩳ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v4, "in"

    const-string v5, "mm"

    const-string v0, "px"

    const-string v1, "dp"

    const-string v2, "sp"

    const-string v3, "pt"

    .line 56
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۫ܽܽ;->ܳ:[Ljava/lang/String;

    const-string v0, "%"

    const-string v1, "%p"

    .line 59
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۫ܽܽ;->᩻:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫ܽܽ;->ᩳ:Ljava/util/HashMap;

    const/4 v0, 0x0

    .line 76
    iput-object v0, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p0, Ll/۫ܽܽ;->֫:Z

    .line 78
    iput-boolean v0, p0, Ll/۫ܽܽ;->ܿ:Z

    return-void
.end method

.method public constructor <init>(ILl/ۢ᩻ܽ;)V
    .locals 5

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/۫ܽܽ;->ᩳ:Ljava/util/HashMap;

    .line 94
    iput-object p2, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    if-nez p2, :cond_0

    goto :goto_2

    .line 324
    :cond_0
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 325
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 326
    invoke-interface {p2}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘ᩻ܽ;

    .line 327
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "bin.mt.plus.TranslationData"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 329
    :cond_2
    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 330
    invoke-interface {v2}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡᩻ܽ;

    .line 331
    invoke-interface {v3}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_1

    .line 334
    :cond_4
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 335
    new-instance v4, Ll/᩶ܽܽ;

    invoke-direct {v4, v0}, Ll/᩶ܽܽ;-><init>(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ll/֡᩻ܽ;->֫(Ll/᩶ܽܽ;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    :goto_1
    const/4 p1, 0x1

    goto :goto_3

    :cond_5
    :goto_2
    const/4 p1, 0x0

    .line 95
    :goto_3
    iput-boolean p1, p0, Ll/۫ܽܽ;->֫:Z

    .line 96
    instance-of p1, p2, Ll/᩺᩻ܽ;

    if-eqz p1, :cond_6

    .line 97
    move-object p1, p2

    check-cast p1, Ll/᩺᩻ܽ;

    invoke-virtual {p1}, Ll/᩺᩻ܽ;->ۜ()V

    goto :goto_4

    .line 98
    :cond_6
    instance-of p1, p2, Ll/ۚۜܽ;

    if-eqz p1, :cond_7

    .line 99
    move-object p1, p2

    check-cast p1, Ll/ۚۜܽ;

    invoke-virtual {p1}, Ll/ۚۜܽ;->ܳ()V

    .line 100
    :cond_7
    :goto_4
    invoke-static {p2}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;)Z

    move-result p1

    iput-boolean p1, p0, Ll/۫ܽܽ;->ܿ:Z

    return-void
.end method

.method public constructor <init>(Ll/ۢ᩻ܽ;Ll/ܿᩳܽ;)V
    .locals 1

    const/4 v0, 0x0

    .line 107
    invoke-direct {p0, v0, p1}, Ll/۫ܽܽ;-><init>(ILl/ۢ᩻ܽ;)V

    .line 108
    iput-object p2, p0, Ll/۫ܽܽ;->ܽ:Ll/ܿᩳܽ;

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 86
    new-instance v0, Ll/᩺᩻ܽ;

    invoke-direct {v0, p1}, Ll/᩺᩻ܽ;-><init>(Ll/ܶ᩵ܿ;)V

    const/4 p1, 0x0

    .line 90
    invoke-direct {p0, p1, v0}, Ll/۫ܽܽ;-><init>(ILl/ۢ᩻ܽ;)V

    return-void
.end method

.method public constructor <init>(Ll/ᩳܰۡ;)V
    .locals 2

    :try_start_0
    const-string v0, "resources.arsc"

    .line 114
    invoke-virtual {p1, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 116
    new-instance v1, Ll/᩺᩻ܽ;

    invoke-virtual {p1, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/᩺᩻ܽ;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 p1, 0x0

    .line 90
    invoke-direct {p0, p1, v1}, Ll/۫ܽܽ;-><init>(ILl/ۢ᩻ܽ;)V

    return-void
.end method

.method public static ֫(Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 375
    invoke-interface {p0}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    if-eq p1, v1, :cond_1

    .line 376
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v2

    if-ne v2, p1, :cond_0

    .line 377
    :cond_1
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡᩻ܽ;

    .line 378
    invoke-interface {v3}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 379
    new-instance v2, Ll/ۗܽܽ;

    const/4 v4, 0x0

    invoke-direct {v2, v4, p3}, Ll/ۗܽܽ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v3, v2}, Ll/֡᩻ܽ;->֫(Ll/ܶ᩻ܽ;)I

    move-result v2

    if-eq v2, v1, :cond_0

    .line 381
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result p0

    shl-int/lit8 p0, p0, 0x18

    invoke-interface {v3}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result p1

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p0, p1

    or-int/2addr p0, v2

    return p0

    :cond_3
    return v1
.end method

.method public static ֫(ILl/ۢ᩻ܽ;)Ljava/lang/String;
    .locals 3

    const v0, 0xffff

    and-int/2addr v0, p0

    shr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    .line 514
    invoke-static {p1, p0, v1, v0}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;III)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    .line 517
    :cond_0
    invoke-static {p1}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 519
    :cond_1
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object p1

    invoke-static {p1, p0, v1, v0}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;III)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۢ᩻ܽ;III)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    goto/16 :goto_1

    .line 537
    :cond_0
    invoke-interface {p0}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    .line 538
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    if-ne v1, p1, :cond_1

    .line 539
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩻ܽ;

    .line 540
    invoke-interface {v1}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v2

    if-ne v2, p2, :cond_2

    .line 541
    invoke-interface {v1}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ᩻ܽ;

    .line 542
    invoke-interface {v2, p3}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 544
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 p2, 0x1

    if-ne p1, p2, :cond_4

    const-string p1, "android:"

    goto :goto_0

    :cond_4
    const/16 p3, 0x7f

    if-eq p1, p3, :cond_5

    .line 605
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    aput-object p1, p2, p3

    const-string p1, "app%02x:"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_5
    const-string p1, ""

    .line 544
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۢ᩻ܽ;IIIZ)Ljava/lang/String;
    .locals 5

    if-nez p0, :cond_0

    goto/16 :goto_1

    .line 557
    :cond_0
    invoke-interface {p0}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    .line 558
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    if-ne v1, p1, :cond_1

    .line 559
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩻ܽ;

    .line 560
    invoke-interface {v1}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v2

    if-ne v2, p2, :cond_2

    .line 561
    invoke-interface {v1}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜ᩻ܽ;

    .line 562
    invoke-interface {v3, p3}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v3

    if-eqz v3, :cond_3

    if-nez p4, :cond_4

    .line 563
    invoke-interface {v3}, Ll/᩷᩻ܽ;->ۛ֫()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 564
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 p2, 0x1

    if-ne p1, p2, :cond_5

    const-string p1, "android:"

    goto :goto_0

    :cond_5
    const/16 p3, 0x7f

    if-eq p1, p3, :cond_6

    .line 605
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    aput-object p1, p2, p3

    const-string p1, "app%02x:"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_6
    const-string p1, ""

    .line 564
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    invoke-interface {v1}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    invoke-interface {v3}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;Ll/ۢ᩻ܽ;IIIZ)V
    .locals 2

    .line 199
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    .line 200
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    if-ne v1, p2, :cond_0

    .line 201
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֡᩻ܽ;

    .line 202
    invoke-interface {p2}, Ll/֡᩻ܽ;->ۘ֫()I

    move-result v0

    if-ne v0, p3, :cond_1

    if-eqz p5, :cond_2

    .line 203
    invoke-interface {p2}, Ll/֡᩻ܽ;->ܽۧ()Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-interface {p2}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۜ᩻ܽ;

    .line 204
    invoke-interface {p2, p4}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 205
    invoke-interface {p2, p4}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 207
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 164
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    .line 165
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    if-ne v1, p2, :cond_0

    .line 166
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֡᩻ܽ;

    .line 167
    invoke-interface {p2}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    new-instance p1, Ll/ۙܽܽ;

    invoke-direct {p1, p4}, Ll/ۙܽܽ;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1}, Ll/֡᩻ܽ;->֫(Ll/ܶ᩻ܽ;)I

    move-result p1

    const/4 p3, -0x1

    if-eq p1, p3, :cond_3

    .line 170
    invoke-interface {p2}, Ll/֡᩻ܽ;->ܽۧ()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۜ᩻ܽ;

    .line 171
    invoke-interface {p3, p1}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 172
    invoke-interface {p3, p1}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object p3

    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static ֫(Ll/ۢ᩻ܽ;)Z
    .locals 3

    if-nez p0, :cond_0

    goto :goto_0

    .line 580
    :cond_0
    invoke-interface {p0}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    .line 581
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const-string p0, "attr"

    .line 582
    invoke-interface {v0, p0}, Ll/ۘ᩻ܽ;->getType(Ljava/lang/String;)Ll/֡᩻ܽ;

    move-result-object p0

    const-string v1, "id"

    .line 583
    invoke-interface {v0, v1}, Ll/ۘ᩻ܽ;->getType(Ljava/lang/String;)Ll/֡᩻ܽ;

    move-result-object v0

    if-eqz p0, :cond_2

    .line 584
    invoke-interface {p0}, Ll/֡᩻ܽ;->᩷()I

    move-result p0

    const/16 v1, 0x32

    if-le p0, v1, :cond_2

    if-eqz v0, :cond_2

    .line 585
    invoke-interface {v0}, Ll/֡᩻ܽ;->᩷()I

    move-result p0

    if-le p0, v1, :cond_2

    return v2

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۜ(I)Ljava/lang/String;
    .locals 3

    .line 597
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v1

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    and-int/lit8 p0, p0, 0xf

    sget-object v1, Ll/۫ܽܽ;->᩻:[Ljava/lang/String;

    aget-object p0, v1, p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܳ(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    .line 425
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "unknown-type-%02x"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "dynamic-attribute"

    return-object p0

    :pswitch_1
    const-string p0, "dynamic-reference"

    return-object p0

    :pswitch_2
    const-string p0, "fraction"

    return-object p0

    :pswitch_3
    const-string p0, "dimension"

    return-object p0

    :pswitch_4
    const-string p0, "float"

    return-object p0

    :pswitch_5
    const-string p0, "string"

    return-object p0

    :pswitch_6
    const-string p0, "attribute"

    return-object p0

    :pswitch_7
    const-string p0, "reference"

    return-object p0

    :pswitch_8
    const-string p0, "null"

    return-object p0

    :pswitch_9
    const-string p0, "boolean"

    return-object p0

    :pswitch_a
    const-string p0, "int-hex"

    return-object p0

    :pswitch_b
    const-string p0, "int-dec"

    return-object p0

    :pswitch_c
    const-string p0, "color-rgb4"

    return-object p0

    :pswitch_d
    const-string p0, "color-argb4"

    return-object p0

    :pswitch_e
    const-string p0, "color-rgb8"

    return-object p0

    :pswitch_f
    const-string p0, "color-argb8"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x10
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1c
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch
.end method

.method public static ܽ(Ljava/lang/String;)Ll/۬ܽܽ;
    .locals 5

    const-string v0, ":"

    const/4 v1, 0x2

    .line 610
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 611
    array-length v2, v0

    if-ne v2, v1, :cond_1

    const/4 v1, 0x0

    .line 612
    aget-object v2, v0, v1

    const-string v3, "android"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 613
    new-instance p0, Ll/۬ܽܽ;

    aget-object v0, v0, v3

    invoke-direct {p0, v3, v0}, Ll/۬ܽܽ;-><init>(ILjava/lang/String;)V

    return-object p0

    .line 615
    :cond_0
    aget-object v2, v0, v1

    const-string v4, "app"

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x5

    if-ne v2, v4, :cond_1

    .line 616
    aget-object v1, v0, v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 617
    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 618
    new-instance p0, Ll/۬ܽܽ;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    aget-object v0, v0, v3

    invoke-direct {p0, v1, v0}, Ll/۬ܽܽ;-><init>(ILjava/lang/String;)V

    return-object p0

    .line 622
    :cond_1
    new-instance v0, Ll/۬ܽܽ;

    const/16 v1, 0x7f

    invoke-direct {v0, v1, p0}, Ll/۬ܽܽ;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static ᩻(I)Ljava/lang/String;
    .locals 2

    .line 592
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    and-int/lit8 p0, p0, 0xf

    sget-object v1, Ll/۫ܽܽ;->ܳ:[Ljava/lang/String;

    aget-object p0, v1, p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/֨᩻ܽ;)Ljava/lang/String;
    .locals 4

    .line 431
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۖ()I

    move-result v0

    .line 432
    invoke-interface {p1}, Ll/֨᩻ܽ;->getValue()I

    move-result v1

    const/16 v2, 0x11

    if-eq v0, v2, :cond_5

    const/16 v2, 0x12

    if-eq v0, v2, :cond_3

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    const/16 p1, 0x1c

    const/16 v3, 0x1f

    if-lt v0, p1, :cond_1

    if-gt v0, v3, :cond_1

    .line 459
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string p1, "#%08x"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 451
    :pswitch_0
    invoke-static {v1}, Ll/۫ܽܽ;->ۜ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 449
    :pswitch_1
    invoke-static {v1}, Ll/۫ܽܽ;->᩻(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 447
    :pswitch_2
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 441
    :pswitch_3
    invoke-interface {p1}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object p1

    .line 442
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x64

    if-le v0, v1, :cond_0

    const/16 v0, 0x61

    .line 443
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "[\\s]{0,6}$"

    const-string v1, "..."

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1

    .line 439
    :pswitch_4
    invoke-virtual {p0, v1}, Ll/۫ܽܽ;->ܿ(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "?"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 437
    :pswitch_5
    invoke-virtual {p0, v1}, Ll/۫ܽܽ;->ܿ(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "@"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_6
    const-string p1, "null"

    return-object p1

    :cond_1
    const/16 p1, 0x10

    if-lt v0, p1, :cond_2

    if-gt v0, v3, :cond_2

    .line 461
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const-string p1, "error"

    return-object p1

    :cond_3
    if-eqz v1, :cond_4

    const-string p1, "true"

    return-object p1

    :cond_4
    const-string p1, "false"

    return-object p1

    .line 453
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "0x"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(I)Ljava/util/ArrayList;
    .locals 11

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v3, v0, 0xff

    ushr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    const v1, 0xffff

    and-int/2addr p1, v1

    .line 187
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 188
    iget-boolean v1, p0, Ll/۫ܽܽ;->ܿ:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    if-ne v3, v1, :cond_0

    .line 190
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v5

    const/4 v6, 0x1

    const/4 v9, 0x1

    move-object v4, v10

    move v7, v0

    move v8, p1

    invoke-static/range {v4 .. v9}, Ll/۫ܽܽ;->֫(Ljava/util/ArrayList;Ll/ۢ᩻ܽ;IIIZ)V

    .line 192
    :cond_0
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    if-eqz v2, :cond_1

    const/4 v6, 0x1

    move-object v1, v10

    move v4, v0

    move v5, p1

    .line 193
    invoke-static/range {v1 .. v6}, Ll/۫ܽܽ;->֫(Ljava/util/ArrayList;Ll/ۢ᩻ܽ;IIIZ)V

    :cond_1
    return-object v10
.end method

.method public final ֫(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7

    .line 145
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 146
    invoke-static {p1}, Ll/۫ܽܽ;->ܽ(Ljava/lang/String;)Ll/۬ܽܽ;

    move-result-object p1

    iget v1, p1, Ll/۬ܽܽ;->ۧ:I

    .line 147
    iget-object p1, p1, Ll/۬ܽܽ;->֫:Ljava/lang/String;

    const/16 v2, 0x2f

    .line 148
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 151
    invoke-virtual {p1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    add-int/2addr v3, v6

    .line 152
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 153
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-eq v2, v4, :cond_1

    goto :goto_0

    .line 155
    :cond_1
    iget-boolean v2, p0, Ll/۫ܽܽ;->ܿ:Z

    if-nez v2, :cond_2

    if-ne v1, v6, :cond_2

    .line 156
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v2

    invoke-static {v0, v2, v6, v5, p1}, Ll/۫ܽܽ;->֫(Ljava/util/ArrayList;Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)V

    .line 157
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    if-eqz v2, :cond_3

    .line 158
    invoke-static {v0, v2, v1, v5, p1}, Ll/۫ܽܽ;->֫(Ljava/util/ArrayList;Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-object v0
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 141
    iget-object v0, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    return-object v0
.end method

.method public final ֫(ILandroid/util/TypedValue;Z)V
    .locals 10

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v3, v0, 0xff

    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    .line 261
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    return-void

    .line 264
    :cond_0
    iget-object v1, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    const/4 v7, 0x0

    const-string v8, "id: %08x"

    if-eqz v1, :cond_a

    ushr-int/lit8 v1, p1, 0x10

    and-int/lit16 v4, v1, 0xff

    const v1, 0xffff

    and-int v5, p1, v1

    .line 268
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 269
    iget-object v2, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    const/4 v6, 0x0

    move-object v1, v9

    invoke-static/range {v1 .. v6}, Ll/۫ܽܽ;->֫(Ljava/util/ArrayList;Ll/ۢ᩻ܽ;IIIZ)V

    .line 270
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 273
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1}, Ll/᩸ܽܽ;->֫(Landroid/content/res/Resources;)Ll/᩸ܽܽ;

    move-result-object v1

    .line 274
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move-object v4, v3

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷᩻ܽ;

    .line 275
    invoke-interface {v5}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_0

    .line 278
    :cond_2
    invoke-interface {v5}, Ll/᩷᩻ܽ;->ܿ()Ll/ۜ᩻ܽ;

    move-result-object v6

    invoke-interface {v6}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v6

    invoke-virtual {v6, v1}, Ll/᩸ܽܽ;->ܽ(Ll/᩸ܽܽ;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_0

    :cond_3
    if-nez v4, :cond_4

    goto :goto_1

    .line 285
    :cond_4
    invoke-interface {v5}, Ll/᩷᩻ܽ;->ܿ()Ll/ۜ᩻ܽ;

    move-result-object v6

    invoke-interface {v6}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v6

    invoke-interface {v4}, Ll/᩷᩻ܽ;->ܿ()Ll/ۜ᩻ܽ;

    move-result-object v9

    invoke-interface {v9}, Ll/ۜ᩻ܽ;->۟()Ll/᩸ܽܽ;

    move-result-object v9

    invoke-virtual {v6, v9, v1}, Ll/᩸ܽܽ;->֫(Ll/᩸ܽܽ;Ll/᩸ܽܽ;)Z

    move-result v6

    if-eqz v6, :cond_1

    :goto_1
    move-object v4, v5

    goto :goto_0

    :cond_5
    if-eqz v4, :cond_8

    .line 291
    invoke-interface {v4}, Ll/᩷᩻ܽ;->getValue()Ll/֨᩻ܽ;

    move-result-object p1

    .line 307
    invoke-interface {p1}, Ll/֨᩻ܽ;->getValue()I

    move-result v1

    iput v1, p2, Landroid/util/TypedValue;->data:I

    .line 308
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۖ()I

    move-result v1

    iput v1, p2, Landroid/util/TypedValue;->type:I

    .line 309
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v1

    iput v1, p2, Landroid/util/TypedValue;->resourceId:I

    .line 310
    iget v1, p2, Landroid/util/TypedValue;->type:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_6

    .line 311
    invoke-interface {p1}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    goto :goto_2

    .line 313
    :cond_6
    iput-object v3, p2, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    :goto_2
    if-eqz p3, :cond_7

    const/4 p1, 0x0

    :goto_3
    const/16 p3, 0x14

    if-ge p1, p3, :cond_7

    .line 299
    iget p3, p2, Landroid/util/TypedValue;->type:I

    if-ne p3, v0, :cond_7

    .line 300
    iget p3, p2, Landroid/util/TypedValue;->data:I

    invoke-virtual {p0, p3, p2, v7}, Ll/۫ܽܽ;->֫(ILandroid/util/TypedValue;Z)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_7
    return-void

    .line 290
    :cond_8
    new-instance p2, Landroid/content/res/Resources$NotFoundException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p3, v0, [Ljava/lang/Object;

    aput-object p1, p3, v7

    invoke-static {v8, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 271
    :cond_9
    new-instance p2, Landroid/content/res/Resources$NotFoundException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p3, v0, [Ljava/lang/Object;

    aput-object p1, p3, v7

    invoke-static {v8, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 265
    :cond_a
    new-instance p2, Landroid/content/res/Resources$NotFoundException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p3, v0, [Ljava/lang/Object;

    aput-object p1, p3, v7

    invoke-static {v8, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ۧ(Ljava/lang/String;)I
    .locals 7

    .line 352
    invoke-static {p1}, Ll/۫ܽܽ;->ܽ(Ljava/lang/String;)Ll/۬ܽܽ;

    move-result-object v0

    iget v1, v0, Ll/۬ܽܽ;->ۧ:I

    .line 353
    iget-object v0, v0, Ll/۬ܽܽ;->֫:Ljava/lang/String;

    const/16 v2, 0x2f

    .line 354
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    return v4

    :cond_0
    const/4 v5, 0x0

    .line 357
    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    add-int/2addr v3, v6

    .line 358
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 359
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-eq v2, v4, :cond_1

    goto :goto_1

    .line 362
    :cond_1
    iget-boolean v2, p0, Ll/۫ܽܽ;->ܿ:Z

    if-nez v2, :cond_2

    if-ne v1, v6, :cond_2

    .line 363
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v2

    invoke-static {v2, v6, v5, v0}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    :cond_2
    const/4 v2, -0x1

    :goto_0
    if-ne v2, v4, :cond_3

    .line 364
    iget-object v3, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    if-eqz v3, :cond_3

    iget-boolean v6, p0, Ll/۫ܽܽ;->֫:Z

    if-nez v6, :cond_3

    .line 365
    invoke-static {v3, v1, v5, v0}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;ILjava/lang/String;Ljava/lang/String;)I

    move-result v2

    :cond_3
    if-ne v2, v4, :cond_4

    .line 367
    iget-object v0, p0, Ll/۫ܽܽ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_4

    .line 369
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_4
    return v2

    :cond_5
    :goto_1
    return v4
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 2

    .line 471
    iget-object v0, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    .line 504
    invoke-static {p1, v0}, Ll/۫ܽܽ;->֫(ILl/ۢ᩻ܽ;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 507
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "%08x"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ll/ܿᩳܽ;
    .locals 3

    .line 130
    iget-object v0, p0, Ll/۫ܽܽ;->ܽ:Ll/ܿᩳܽ;

    if-nez v0, :cond_1

    move-object v0, p0

    .line 131
    monitor-enter v0

    .line 132
    :try_start_0
    iget-object v1, p0, Ll/۫ܽܽ;->ܽ:Ll/ܿᩳܽ;

    if-nez v1, :cond_0

    .line 133
    new-instance v1, Ll/ܿᩳܽ;

    iget-object v2, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    invoke-direct {v1, v2}, Ll/ܿᩳܽ;-><init>(Ll/ۢ᩻ܽ;)V

    iput-object v1, p0, Ll/۫ܽܽ;->ܽ:Ll/ܿᩳܽ;

    .line 135
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 137
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/۫ܽܽ;->ܽ:Ll/ܿᩳܽ;

    return-object v0
.end method

.method public final ܽ(I)Ljava/lang/String;
    .locals 1

    .line 475
    iget-object v0, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    invoke-static {p1, v0}, Ll/۫ܽܽ;->֫(ILl/ۢ᩻ܽ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 318
    iget-boolean v0, p0, Ll/۫ܽܽ;->֫:Z

    return v0
.end method

.method public final ܿ(I)Ljava/lang/String;
    .locals 8

    const v0, 0xffff

    and-int/2addr v0, p1

    shr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v2, p1, 0x18

    and-int/lit16 v2, v2, 0xff

    .line 493
    iget-boolean v3, p0, Ll/۫ܽܽ;->֫:Z

    const/4 v4, 0x1

    iget-object v5, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    move-object v3, v6

    goto :goto_0

    :cond_0
    invoke-static {v5, v2, v1, v0, v4}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;IIIZ)Ljava/lang/String;

    move-result-object v3

    :goto_0
    const/4 v7, 0x0

    if-eqz v3, :cond_1

    move-object v6, v3

    goto :goto_1

    .line 496
    :cond_1
    invoke-static {v5}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 498
    :cond_2
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v3

    invoke-static {v3, v2, v1, v0, v7}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;IIIZ)Ljava/lang/String;

    move-result-object v6

    :goto_1
    if-eqz v6, :cond_3

    return-object v6

    .line 486
    :cond_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v4, [Ljava/lang/Object;

    aput-object p1, v0, v7

    const-string p1, "%08x"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ᩳ(I)Ljava/lang/String;
    .locals 5

    const v0, 0xffff

    and-int/2addr v0, p1

    shr-int/lit8 v1, p1, 0x10

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v2, p1, 0x18

    and-int/lit16 v2, v2, 0xff

    .line 526
    iget-object v3, p0, Ll/۫ܽܽ;->ۧ:Ll/ۢ᩻ܽ;

    invoke-static {v3, v2, v1, v0}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;III)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    .line 527
    invoke-static {v3}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 528
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v3

    invoke-static {v3, v2, v1, v0}, Ll/۫ܽܽ;->֫(Ll/ۢ᩻ܽ;III)Ljava/lang/String;

    move-result-object v4

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz v4, :cond_1

    .line 530
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v1

    aput-object p1, v2, v0

    const-string p1, "%s(%08x)"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 531
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "%08x"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
