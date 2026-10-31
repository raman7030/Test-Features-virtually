.class public final Ll/ۗܽܿ;
.super Ll/᩸ܽܿ;
.source "D7UG"


# instance fields
.field public final ۖ:Ll/ۡᩳܿ;

.field public ۜ:Z

.field public ۡ:I

.field public ۢ:I

.field public final ܺ:Landroid/text/TextWatcher;

.field public ᩷:I

.field public final ᩻:Landroid/text/style/ForegroundColorSpan;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x30

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0, p1}, Ll/᩸ܽܿ;-><init>(Landroid/content/Context;)V

    .line 20
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    sget v0, Ll/᩹֡᩷;->֫:I

    invoke-direct {p1, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iput-object p1, p0, Ll/ۗܽܿ;->᩻:Landroid/text/style/ForegroundColorSpan;

    .line 21
    new-instance p1, Ll/ۡᩳܿ;

    invoke-direct {p1}, Ll/ۡᩳܿ;-><init>()V

    iput-object p1, p0, Ll/ۗܽܿ;->ۖ:Ll/ۡᩳܿ;

    .line 22
    new-instance p1, Ll/ۙܽܿ;

    invoke-direct {p1, p0}, Ll/ۙܽܿ;-><init>(Ll/ۗܽܿ;)V

    iput-object p1, p0, Ll/ۗܽܿ;->ܺ:Landroid/text/TextWatcher;

    return-void
.end method

.method public static synthetic ֫(Ll/ۗܽܿ;Ll/ۤܽܿ;)Landroid/text/SpannableString;
    .locals 10

    .line 94
    iget-object p0, p0, Ll/ۗܽܿ;->᩻:Landroid/text/style/ForegroundColorSpan;

    new-instance v0, Landroid/text/SpannableString;

    iget-object v1, p1, Ll/ۤܽܿ;->֫:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 98
    iget-object p1, p1, Ll/ۤܽܿ;->ۧ:[I

    array-length v1, p1

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, -0x1

    :goto_0
    const/16 v7, 0x21

    if-ge v4, v1, :cond_3

    aget v8, p1, v4

    if-ne v5, v2, :cond_0

    add-int/lit8 v5, v8, 0x1

    move v6, v5

    move v5, v8

    goto :goto_2

    :cond_0
    if-ne v8, v6, :cond_1

    add-int/lit8 v8, v8, 0x1

    move v6, v8

    goto :goto_2

    :cond_1
    if-eqz v3, :cond_2

    move-object v3, p0

    goto :goto_1

    .line 105
    :cond_2
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    sget v9, Ll/᩹֡᩷;->֫:I

    invoke-direct {v3, v9}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    :goto_1
    invoke-virtual {v0, v3, v5, v6, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v3, v8, 0x1

    const/4 v5, 0x0

    move v6, v3

    move v5, v8

    const/4 v3, 0x0

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-eq v5, v2, :cond_5

    if-eqz v3, :cond_4

    goto :goto_3

    .line 112
    :cond_4
    new-instance p0, Landroid/text/style/ForegroundColorSpan;

    sget p1, Ll/᩹֡᩷;->֫:I

    invoke-direct {p0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    :goto_3
    invoke-virtual {v0, p0, v5, v6, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    :cond_5
    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ۗܽܿ;)Ll/ۡᩳܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܽܿ;->ۖ:Ll/ۡᩳܿ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۗܽܿ;Ljava/lang/String;Ll/ۢᩳܿ;)Z
    .locals 1

    .line 89
    invoke-virtual {p2}, Ll/᩵ܽܿ;->ۧ()Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    iget-object p0, p0, Ll/ۗܽܿ;->ۖ:Ll/ۡᩳܿ;

    invoke-virtual {p0, p2}, Ll/ۡᩳܿ;->֫(Ll/ۢᩳܿ;)I

    move-result p0

    if-le p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v0
.end method


# virtual methods
.method public final ֫(ILjava/lang/CharSequence;)Ll/ܶܽܿ;
    .locals 5

    .line 71
    iget-object v0, p0, Ll/ۗܽܿ;->ۖ:Ll/ۡᩳܿ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2}, Ll/ۡᩳܿ;->ܽ(ILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_0

    .line 75
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int v2, p1, v2

    .line 81
    iget v3, p0, Ll/ۗܽܿ;->ۡ:I

    if-ge v3, v2, :cond_1

    goto :goto_0

    .line 0
    :cond_1
    invoke-static {v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 85
    invoke-static {p1, p2}, Ll/ۡᩳܿ;->ᩳ(ILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 87
    invoke-virtual {v0}, Ll/ۡᩳܿ;->֫()Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v3, Ll/᩹ܽܿ;

    invoke-direct {v3, p0, p2}, Ll/᩹ܽܿ;-><init>(Ll/ۗܽܿ;Ljava/lang/String;)V

    .line 88
    invoke-interface {v0, v3}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    .line 176
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 178
    new-instance v3, Ll/۬ܽܿ;

    invoke-direct {v3, v1, v0}, Ll/۬ܽܿ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v3}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/۫ܽܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 179
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    new-instance v0, Ll/᩺᩺ۡ;

    const/4 v3, 0x1

    invoke-direct {v0, v3}, Ll/᩺᩺ۡ;-><init>(I)V

    .line 180
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->sorted(Ljava/util/Comparator;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    .line 93
    new-instance v0, Ll/᩶ܽܿ;

    const/4 v4, 0x0

    invoke-direct {v0, v4, p0}, Ll/᩶ܽܿ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p2

    .line 115
    sget v0, Ll/ܶܽܿ;->᩹:I

    .line 570
    new-instance v0, Ll/۠ܽܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/᩺ۨᩴ;->toCollection(Ljava/util/function/Supplier;)Ll/ۨۨᩴ;

    move-result-object v0

    .line 115
    invoke-interface {p2, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܶܽܿ;

    .line 117
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 121
    :cond_2
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ne v0, v3, :cond_3

    invoke-virtual {p2, v4}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/SpannableString;

    invoke-virtual {v0}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 125
    :cond_3
    invoke-virtual {p2, v2}, Ll/ܶܽܿ;->֫(I)V

    .line 126
    iput v2, p0, Ll/ۗܽܿ;->ۢ:I

    .line 127
    iput p1, p0, Ll/ۗܽܿ;->᩷:I

    return-object p2
.end method

.method public native ֫(Ljava/lang/CharSequence;III)V
.end method

.method public final ֫(Ll/۫ۨᩳ;)V
    .locals 2

    .line 39
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object p1

    .line 40
    :try_start_0
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->length()I

    move-result v0

    const v1, 0x186a0

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/ۗܽܿ;->ۜ:Z

    if-eqz v0, :cond_1

    .line 41
    new-instance v0, Ll/᩺ܽܿ;

    invoke-direct {v0, v1, p1}, Ll/᩺ܽܿ;-><init>(ILjava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    move-object v0, p1

    .line 42
    :goto_1
    iget-object v1, p0, Ll/ۗܽܿ;->ۖ:Ll/ۡᩳܿ;

    invoke-virtual {v1, v0}, Ll/ۡᩳܿ;->֫(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v0

    .line 39
    :try_start_1
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
.end method

.method public final ֫(Ll/۫ۨᩳ;Ljava/lang/CharSequence;)V
    .locals 3

    .line 18
    check-cast p2, Landroid/text/SpannableString;

    .line 133
    invoke-virtual {p2}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object p2

    .line 134
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    iget v1, p0, Ll/ۗܽܿ;->ۢ:I

    iget v2, p0, Ll/ۗܽܿ;->᩷:I

    invoke-interface {v0, v1, v2, p2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 135
    iget v0, p0, Ll/ۗܽܿ;->ۢ:I

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->ᩴ(I)V

    return-void
.end method

.method public final ۧ(Ll/۫ۨᩳ;Ljava/lang/CharSequence;)Z
    .locals 5

    .line 18
    check-cast p2, Landroid/text/SpannableString;

    .line 140
    invoke-virtual {p2}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object p2

    .line 141
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    iget v1, p0, Ll/ۗܽܿ;->ۢ:I

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    iget v3, p0, Ll/ۗܽܿ;->᩷:I

    iget-object v4, p0, Ll/ۗܽܿ;->ۖ:Ll/ۡᩳܿ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v3}, Ll/ۡᩳܿ;->֫(Ll/۟᩺ᩳ;I)I

    move-result v2

    invoke-interface {v0, v1, v2, p2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 142
    iget v0, p0, Ll/ۗܽܿ;->ۢ:I

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, v0

    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->ᩴ(I)V

    const/4 p1, 0x1

    return p1
.end method
