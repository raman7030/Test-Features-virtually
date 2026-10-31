.class public final Ll/ۖ᩷ܿ;
.super Ljava/lang/Object;
.source "W9TA"


# static fields
.field public static final ۖ:Ll/۟ۘܽ;

.field public static final ۘ:Ll/۟ۘܽ;

.field public static final ᩴ:Ll/۟ۘܽ;


# instance fields
.field public final ֫:Z

.field public final ۜ:Z

.field public ۡ:Z

.field public final ۢ:Ljava/util/List;

.field public final ۧ:Z

.field public final ܳ:Z

.field public final ܺ:Ljava/util/List;

.field public final ܽ:Z

.field public final ܿ:Z

.field public final ᩳ:Z

.field public final ᩷:Z

.field public final ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "0"

    .line 15
    invoke-static {v0}, Ll/۟ۘܽ;->֫(Ljava/lang/String;)Ll/۟ۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۖ᩷ܿ;->ᩴ:Ll/۟ۘܽ;

    const-string v0, "0123456789"

    .line 16
    invoke-static {v0}, Ll/۟ۘܽ;->֫(Ljava/lang/String;)Ll/۟ۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۖ᩷ܿ;->ۘ:Ll/۟ۘܽ;

    const-string v0, ".0123456789"

    .line 17
    invoke-static {v0}, Ll/۟ۘܽ;->֫(Ljava/lang/String;)Ll/۟ۘܽ;

    move-result-object v0

    sput-object v0, Ll/ۖ᩷ܿ;->ۖ:Ll/۟ۘܽ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v0, "\\|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string v1, "2"

    .line 94
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->ܽ:Z

    const-string v1, "8"

    .line 95
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->ᩳ:Z

    const-string v1, "10"

    .line 96
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->֫:Z

    const-string v1, "16"

    .line 97
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->ۧ:Z

    const-string v1, "f"

    .line 98
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->ܳ:Z

    const-string v1, "e"

    .line 99
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->ܿ:Z

    const-string v1, "p"

    .line 100
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->᩻:Z

    const-string v1, "_"

    .line 101
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->᩷:Z

    const-string v1, "\'"

    .line 102
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۖ᩷ܿ;->ۜ:Z

    .line 104
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 105
    invoke-virtual {p3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 106
    new-instance p3, Ll/۬ᩳܽ;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Ll/۬ᩳܽ;-><init>(I)V

    invoke-static {p1, p3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 107
    new-instance p3, Ll/ܺ᩷ܿ;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    invoke-static {p2, p3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 0
    new-instance p3, Ljava/util/ArrayList;

    array-length v0, p1

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p1, v2

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p3}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 108
    iput-object p1, p0, Ll/ۖ᩷ܿ;->ܺ:Ljava/util/List;

    .line 0
    new-instance p1, Ljava/util/ArrayList;

    array-length p3, p2

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    array-length p3, p2

    :goto_1
    if-ge v1, p3, :cond_1

    aget-object v0, p2, v1

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 109
    iput-object p1, p0, Ll/ۖ᩷ܿ;->ۢ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/ۖ᩷ܿ;)V
    .locals 1

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iget-boolean v0, p1, Ll/ۖ᩷ܿ;->ܽ:Z

    iput-boolean v0, p0, Ll/ۖ᩷ܿ;->ܽ:Z

    .line 115
    iget-boolean v0, p1, Ll/ۖ᩷ܿ;->ᩳ:Z

    iput-boolean v0, p0, Ll/ۖ᩷ܿ;->ᩳ:Z

    .line 116
    iget-boolean v0, p1, Ll/ۖ᩷ܿ;->֫:Z

    iput-boolean v0, p0, Ll/ۖ᩷ܿ;->֫:Z

    .line 117
    iget-boolean v0, p1, Ll/ۖ᩷ܿ;->ۧ:Z

    iput-boolean v0, p0, Ll/ۖ᩷ܿ;->ۧ:Z

    .line 118
    iget-boolean v0, p1, Ll/ۖ᩷ܿ;->ܳ:Z

    iput-boolean v0, p0, Ll/ۖ᩷ܿ;->ܳ:Z

    .line 119
    iget-boolean v0, p1, Ll/ۖ᩷ܿ;->ܿ:Z

    iput-boolean v0, p0, Ll/ۖ᩷ܿ;->ܿ:Z

    .line 120
    iget-boolean v0, p1, Ll/ۖ᩷ܿ;->᩻:Z

    iput-boolean v0, p0, Ll/ۖ᩷ܿ;->᩻:Z

    .line 121
    iget-boolean v0, p1, Ll/ۖ᩷ܿ;->᩷:Z

    iput-boolean v0, p0, Ll/ۖ᩷ܿ;->᩷:Z

    .line 122
    iget-boolean v0, p1, Ll/ۖ᩷ܿ;->ۜ:Z

    iput-boolean v0, p0, Ll/ۖ᩷ܿ;->ۜ:Z

    .line 123
    iget-object v0, p1, Ll/ۖ᩷ܿ;->ܺ:Ljava/util/List;

    iput-object v0, p0, Ll/ۖ᩷ܿ;->ܺ:Ljava/util/List;

    .line 124
    iget-object p1, p1, Ll/ۖ᩷ܿ;->ۢ:Ljava/util/List;

    iput-object p1, p0, Ll/ۖ᩷ܿ;->ۢ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 7

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v0

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 134
    :goto_0
    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->ܽ:Z

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 135
    :goto_1
    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->ᩳ:Z

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 136
    :goto_2
    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->֫:Z

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    .line 137
    :goto_3
    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->ۧ:Z

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    .line 138
    :goto_4
    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->ܳ:Z

    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    goto :goto_5

    :cond_5
    const/4 v1, 0x0

    .line 139
    :goto_5
    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->ܿ:Z

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_6

    const/4 v1, 0x1

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    .line 140
    :goto_6
    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->᩻:Z

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    goto :goto_7

    :cond_7
    const/4 v1, 0x0

    .line 141
    :goto_7
    iput-boolean v1, p0, Ll/ۖ᩷ܿ;->᩷:Z

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    const/4 v3, 0x0

    .line 142
    :goto_8
    iput-boolean v3, p0, Ll/ۖ᩷ܿ;->ۜ:Z

    .line 143
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܶ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\|"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 0
    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v0

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, v0

    const/4 v5, 0x0

    :goto_9
    if-ge v5, v4, :cond_9

    aget-object v6, v0, v5

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_9
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 143
    iput-object v0, p0, Ll/ۖ᩷ܿ;->ܺ:Ljava/util/List;

    .line 144
    invoke-virtual {p1}, Ll/۬ۜܽ;->ܶ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    :goto_a
    if-ge v2, v1, :cond_a

    aget-object v3, p1, v2

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_a
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 144
    iput-object p1, p0, Ll/ۖ᩷ܿ;->ۢ:Ljava/util/List;

    return-void
.end method

.method private ֫(ILjava/lang/CharSequence;Z)I
    .locals 3

    const/16 v0, 0xa

    const/4 v1, 0x0

    .line 445
    invoke-direct {p0, p2, p1, v0, v1}, Ll/ۖ᩷ܿ;->֫(Ljava/lang/CharSequence;IIZ)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    if-eqz p3, :cond_5

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    add-int/2addr p1, v1

    .line 454
    iget-boolean p3, p0, Ll/ۖ᩷ܿ;->ܿ:Z

    if-eqz p3, :cond_4

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-ge p1, p3, :cond_4

    .line 455
    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p3

    const/16 v0, 0x65

    if-eq p3, v0, :cond_1

    const/16 v0, 0x45

    if-ne p3, v0, :cond_4

    .line 457
    :cond_1
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    const/4 v0, 0x1

    sub-int/2addr p3, v0

    if-ge p1, p3, :cond_3

    add-int/2addr p1, v0

    .line 458
    invoke-direct {p0, p1, p2}, Ll/ۖ᩷ܿ;->ܽ(ILjava/lang/CharSequence;)I

    move-result p1

    if-ne p1, v2, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v1, v0

    goto :goto_1

    .line 462
    :cond_3
    iput-boolean v0, p0, Ll/ۖ᩷ܿ;->ۡ:Z

    .line 465
    :cond_4
    iget-boolean p3, p0, Ll/ۖ᩷ܿ;->ܳ:Z

    if-eqz p3, :cond_5

    .line 467
    iget-object p3, p0, Ll/ۖ᩷ܿ;->ۢ:Ljava/util/List;

    invoke-direct {p0, p3, p2, p1}, Ll/ۖ᩷ܿ;->֫(Ljava/util/List;Ljava/lang/CharSequence;I)I

    move-result p1

    :goto_1
    add-int/2addr v1, p1

    return v1

    :cond_5
    :goto_2
    return v2
.end method

.method private ֫(Ljava/lang/CharSequence;IIZ)I
    .locals 5

    .line 492
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge p2, v0, :cond_7

    add-int/lit8 v3, p2, 0x1

    .line 497
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p2

    const/16 v4, 0x30

    if-gt v4, p2, :cond_0

    const/16 v4, 0x39

    if-gt p2, v4, :cond_0

    add-int/lit8 v4, p2, -0x30

    if-lt v4, p3, :cond_2

    :cond_0
    const/16 v4, 0x61

    if-gt v4, p2, :cond_1

    const/16 v4, 0x66

    if-gt p2, v4, :cond_1

    add-int/lit8 v4, p2, -0x57

    if-lt v4, p3, :cond_2

    :cond_1
    const/16 v4, 0x41

    if-gt v4, p2, :cond_3

    const/16 v4, 0x46

    if-gt p2, v4, :cond_3

    add-int/lit8 v4, p2, -0x37

    if-ge v4, p3, :cond_3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    const/4 p2, 0x0

    const/4 v2, 0x0

    goto :goto_1

    .line 503
    :cond_3
    iget-boolean v4, p0, Ll/ۖ᩷ܿ;->᩷:Z

    if-eqz v4, :cond_4

    const/16 v4, 0x5f

    if-eq p2, v4, :cond_5

    :cond_4
    iget-boolean v4, p0, Ll/ۖ᩷ܿ;->ۜ:Z

    if-eqz v4, :cond_8

    const/16 v4, 0x27

    if-ne p2, v4, :cond_8

    :cond_5
    if-nez p4, :cond_6

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v1, v1, 0x1

    const/4 p2, 0x1

    const/4 v2, 0x1

    :goto_1
    move p2, v3

    goto :goto_0

    .line 516
    :cond_7
    iput-boolean v3, p0, Ll/ۖ᩷ܿ;->ۡ:Z

    :cond_8
    if-eqz v1, :cond_a

    if-eqz v2, :cond_9

    goto :goto_2

    :cond_9
    return v1

    :cond_a
    :goto_2
    const/4 p1, -0x1

    return p1
.end method

.method private ֫(Ljava/util/List;Ljava/lang/CharSequence;I)I
    .locals 10

    .line 528
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 531
    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ne p3, v0, :cond_1

    return v1

    .line 536
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_7

    .line 537
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 549
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ltz p3, :cond_6

    .line 550
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-le p3, v5, :cond_2

    goto :goto_2

    .line 553
    :cond_2
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    sub-int/2addr v5, p3

    .line 554
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_4

    add-int v8, p3, v7

    .line 556
    invoke-interface {p2, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v8

    .line 557
    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v8, v9, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    if-le v4, v5, :cond_5

    const/4 v3, 0x1

    .line 562
    iput-boolean v3, p0, Ll/ۖ᩷ܿ;->ۡ:Z

    goto :goto_2

    .line 539
    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p1

    return p1

    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    :goto_3
    return v1
.end method

.method public static ֫(I)Z
    .locals 1

    const/16 v0, 0x7f

    if-le p0, v0, :cond_0

    .line 622
    invoke-static {p0}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result p0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-gt v0, p0, :cond_1

    const/16 v0, 0x7a

    if-le p0, v0, :cond_3

    :cond_1
    const/16 v0, 0x41

    if-gt v0, p0, :cond_2

    const/16 v0, 0x5a

    if-le p0, v0, :cond_3

    :cond_2
    const/16 v0, 0x30

    if-gt v0, p0, :cond_4

    const/16 v0, 0x39

    if-gt p0, v0, :cond_4

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(ILjava/lang/CharSequence;)Z
    .locals 4

    if-gtz p0, :cond_0

    goto :goto_1

    .line 596
    :cond_0
    invoke-static {p1, p0}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v0

    const/16 v1, 0x5f

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    const/16 v1, 0x2e

    if-eq v0, v1, :cond_4

    .line 602
    invoke-static {v0}, Ll/ۖ᩷ܿ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 631
    :cond_1
    invoke-static {v0}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    sub-int/2addr p0, v2

    :goto_0
    if-ltz p0, :cond_3

    .line 607
    invoke-static {p1, p0}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 608
    invoke-static {v0}, Ll/ۖ᩷ܿ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_2

    return v2

    .line 631
    :cond_2
    invoke-static {v0}, Ljava/lang/Character;->getType(I)I

    move-result v0

    if-ne v0, v1, :cond_3

    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return p0

    :cond_4
    :goto_2
    return v2
.end method

.method private ۧ(ILjava/lang/CharSequence;Z)Z
    .locals 5

    .line 571
    invoke-static {p1, p2}, Ll/ۖ᩷ܿ;->ۧ(ILjava/lang/CharSequence;)Z

    move-result v0

    .line 573
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ge p1, v1, :cond_4

    .line 574
    invoke-static {p2, p1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    if-eqz p3, :cond_0

    .line 576
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    sub-int/2addr p3, v2

    if-ne p1, p3, :cond_0

    int-to-char p3, v1

    invoke-static {p3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 577
    iput-boolean v2, p0, Ll/ۖ᩷ܿ;->ۡ:Z

    :cond_0
    const/16 p3, 0x5f

    if-eq v1, p3, :cond_3

    const/16 p3, 0x2e

    if-eq v1, p3, :cond_3

    .line 602
    invoke-static {v1}, Ll/ۖ᩷ܿ;->֫(I)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    .line 631
    :cond_1
    invoke-static {v1}, Ljava/lang/Character;->getType(I)I

    move-result p3

    const/4 v1, 0x6

    if-ne p3, v1, :cond_5

    :goto_0
    if-ltz p1, :cond_5

    .line 607
    invoke-static {p2, p1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result p3

    .line 608
    invoke-static {p3}, Ll/ۖ᩷ܿ;->֫(I)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    .line 631
    :cond_2
    invoke-static {p3}, Ljava/lang/Character;->getType(I)I

    move-result p3

    if-ne p3, v1, :cond_5

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_3
    :goto_1
    const/4 p1, 0x1

    goto :goto_2

    :cond_4
    if-eqz p3, :cond_5

    .line 582
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-ne p1, p2, :cond_5

    .line 584
    iput-boolean v2, p0, Ll/ۖ᩷ܿ;->ۡ:Z

    :cond_5
    const/4 p1, 0x0

    :goto_2
    if-eq v0, p1, :cond_6

    return v2

    :cond_6
    return v3
.end method

.method private ܽ(ILjava/lang/CharSequence;)I
    .locals 4

    .line 475
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge p1, v0, :cond_1

    .line 476
    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v2, 0x2d

    if-eq v0, v2, :cond_0

    const/16 v2, 0x2b

    if-ne v0, v2, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    add-int v2, p1, v0

    const/16 v3, 0xa

    .line 481
    invoke-direct {p0, p2, v2, v3, v1}, Ll/ۖ᩷ܿ;->֫(Ljava/lang/CharSequence;IIZ)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    return v2

    :cond_2
    add-int/2addr v1, v0

    .line 488
    iget-object v0, p0, Ll/ۖ᩷ܿ;->ۢ:Ljava/util/List;

    add-int/2addr p1, v1

    invoke-direct {p0, v0, p2, p1}, Ll/ۖ᩷ܿ;->֫(Ljava/util/List;Ljava/lang/CharSequence;I)I

    move-result p1

    add-int/2addr v1, p1

    return v1
.end method

.method private ᩳ(ILjava/lang/CharSequence;)I
    .locals 4

    .line 427
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge p1, v0, :cond_1

    .line 428
    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v2, 0x2d

    if-eq v0, v2, :cond_0

    const/16 v2, 0x2b

    if-ne v0, v2, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    add-int v2, p1, v0

    const/16 v3, 0xa

    .line 433
    invoke-direct {p0, p2, v2, v3, v1}, Ll/ۖ᩷ܿ;->֫(Ljava/lang/CharSequence;IIZ)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    return v2

    :cond_2
    add-int/2addr v1, v0

    add-int/2addr p1, v1

    .line 441
    iget-object v0, p0, Ll/ۖ᩷ܿ;->ۢ:Ljava/util/List;

    invoke-direct {p0, v0, p2, p1}, Ll/ۖ᩷ܿ;->֫(Ljava/util/List;Ljava/lang/CharSequence;I)I

    move-result p1

    add-int/2addr v1, p1

    return v1
.end method


# virtual methods
.method public final ֫(ILjava/lang/CharSequence;)I
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    .line 252
    iput-boolean v3, v0, Ll/ۖ᩷ܿ;->ۡ:Z

    .line 253
    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/4 v5, -0x1

    if-ltz v1, :cond_2a

    if-le v1, v4, :cond_0

    goto/16 :goto_10

    .line 257
    :cond_0
    iget-boolean v6, v0, Ll/ۖ᩷ܿ;->᩻:Z

    iget-boolean v7, v0, Ll/ۖ᩷ܿ;->ܿ:Z

    iget-boolean v8, v0, Ll/ۖ᩷ܿ;->ܳ:Z

    iget-boolean v9, v0, Ll/ۖ᩷ܿ;->ۧ:Z

    iget-boolean v10, v0, Ll/ۖ᩷ܿ;->֫:Z

    iget-boolean v11, v0, Ll/ۖ᩷ܿ;->ᩳ:Z

    iget-boolean v12, v0, Ll/ۖ᩷ܿ;->ܽ:Z

    const/4 v13, 0x1

    if-ne v1, v4, :cond_3

    if-nez v12, :cond_1

    if-nez v11, :cond_1

    if-nez v10, :cond_1

    if-nez v9, :cond_1

    if-nez v8, :cond_1

    if-nez v7, :cond_1

    if-eqz v6, :cond_2

    .line 260
    :cond_1
    invoke-static/range {p1 .. p2}, Ll/ۖ᩷ܿ;->ۧ(ILjava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 261
    iput-boolean v13, v0, Ll/ۖ᩷ܿ;->ۡ:Z

    :cond_2
    return v5

    .line 265
    :cond_3
    invoke-direct {v0, v1, v2, v3}, Ll/ۖ᩷ܿ;->ۧ(ILjava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_4

    return v5

    .line 279
    :cond_4
    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    add-int/lit8 v4, v1, 0x1

    .line 280
    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v14, 0x30

    .line 281
    iget-object v15, v0, Ll/ۖ᩷ܿ;->ܺ:Ljava/util/List;

    if-ne v5, v14, :cond_1b

    if-ne v4, v3, :cond_7

    if-nez v12, :cond_6

    if-nez v11, :cond_6

    if-nez v10, :cond_6

    if-nez v9, :cond_6

    if-nez v8, :cond_6

    if-nez v7, :cond_6

    if-eqz v6, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x0

    goto :goto_1

    :cond_6
    :goto_0
    const/4 v3, 0x1

    .line 283
    :goto_1
    iput-boolean v3, v0, Ll/ۖ᩷ܿ;->ۡ:Z

    if-eqz v10, :cond_27

    const/4 v3, -0x1

    const/4 v4, 0x1

    goto/16 :goto_f

    .line 290
    :cond_7
    invoke-interface {v2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/4 v4, 0x2

    if-eqz v12, :cond_a

    const/16 v5, 0x62

    if-eq v3, v5, :cond_8

    const/16 v5, 0x42

    if-ne v3, v5, :cond_a

    :cond_8
    add-int/lit8 v5, v1, 0x2

    .line 355
    invoke-direct {v0, v2, v5, v4, v13}, Ll/ۖ᩷ܿ;->֫(Ljava/lang/CharSequence;IIZ)I

    move-result v4

    const/4 v12, -0x1

    if-ne v4, v12, :cond_9

    const/4 v4, -0x1

    goto :goto_2

    :cond_9
    add-int/2addr v5, v4

    .line 360
    invoke-direct {v0, v15, v2, v5}, Ll/ۖ᩷ܿ;->֫(Ljava/util/List;Ljava/lang/CharSequence;I)I

    move-result v5

    add-int/2addr v4, v5

    :goto_2
    if-eq v4, v12, :cond_a

    :goto_3
    add-int/lit8 v4, v4, 0x2

    goto/16 :goto_d

    :cond_a
    if-eqz v11, :cond_d

    const/16 v4, 0x6f

    if-eq v3, v4, :cond_b

    const/16 v4, 0x4f

    if-ne v3, v4, :cond_d

    :cond_b
    add-int/lit8 v4, v1, 0x2

    const/16 v5, 0x8

    .line 365
    invoke-direct {v0, v2, v4, v5, v13}, Ll/ۖ᩷ܿ;->֫(Ljava/lang/CharSequence;IIZ)I

    move-result v5

    const/4 v11, -0x1

    if-ne v5, v11, :cond_c

    const/4 v4, -0x1

    goto :goto_4

    :cond_c
    add-int/2addr v4, v5

    .line 370
    invoke-direct {v0, v15, v2, v4}, Ll/ۖ᩷ܿ;->֫(Ljava/util/List;Ljava/lang/CharSequence;I)I

    move-result v4

    add-int/2addr v4, v5

    :goto_4
    if-eq v4, v11, :cond_d

    goto :goto_3

    :cond_d
    if-nez v9, :cond_e

    if-eqz v6, :cond_1e

    :cond_e
    const/16 v4, 0x78

    if-eq v3, v4, :cond_f

    const/16 v4, 0x58

    if-ne v3, v4, :cond_1e

    :cond_f
    add-int/lit8 v3, v1, 0x2

    const/16 v4, 0x10

    .line 374
    invoke-direct {v0, v2, v3, v4, v13}, Ll/ۖ᩷ܿ;->֫(Ljava/lang/CharSequence;IIZ)I

    move-result v5

    const/4 v11, -0x1

    if-ne v5, v11, :cond_11

    const/4 v3, -0x1

    :cond_10
    const/4 v4, -0x1

    goto/16 :goto_a

    :cond_11
    add-int/2addr v3, v5

    if-eqz v9, :cond_12

    .line 379
    invoke-direct {v0, v15, v2, v3}, Ll/ۖ᩷ܿ;->֫(Ljava/util/List;Ljava/lang/CharSequence;I)I

    move-result v11

    add-int/2addr v11, v5

    goto :goto_5

    :cond_12
    const/4 v11, -0x1

    :goto_5
    if-eqz v6, :cond_1a

    .line 381
    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v3, v6, :cond_1a

    add-int/lit8 v6, v3, 0x1

    .line 382
    invoke-interface {v2, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v12, 0x50

    const/16 v13, 0x70

    const/16 v14, 0x2e

    if-ne v3, v14, :cond_18

    const/4 v3, 0x0

    .line 406
    invoke-direct {v0, v2, v6, v4, v3}, Ll/ۖ᩷ܿ;->֫(Ljava/lang/CharSequence;IIZ)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_13

    const/4 v3, -0x1

    :goto_6
    const/4 v4, -0x1

    goto :goto_7

    :cond_13
    add-int/2addr v6, v3

    .line 411
    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v6, v4, :cond_15

    add-int/lit8 v4, v6, 0x1

    .line 412
    invoke-interface {v2, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    if-eq v6, v13, :cond_14

    if-ne v6, v12, :cond_15

    .line 414
    :cond_14
    invoke-direct {v0, v4, v2}, Ll/ۖ᩷ܿ;->ᩳ(ILjava/lang/CharSequence;)I

    move-result v4

    const/4 v6, -0x1

    if-eq v4, v6, :cond_16

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v4

    goto :goto_6

    :cond_15
    const/4 v3, -0x1

    :cond_16
    const/4 v4, -0x1

    const/4 v3, -0x1

    :goto_7
    if-eq v3, v4, :cond_17

    goto :goto_8

    :cond_17
    move v3, v4

    goto :goto_9

    :cond_18
    const/4 v4, -0x1

    if-eq v3, v13, :cond_19

    if-ne v3, v12, :cond_1a

    .line 390
    :cond_19
    invoke-direct {v0, v6, v2}, Ll/ۖ᩷ܿ;->ᩳ(ILjava/lang/CharSequence;)I

    move-result v3

    if-eq v3, v4, :cond_1a

    :goto_8
    add-int/lit8 v5, v5, 0x1

    add-int/2addr v3, v5

    move/from16 v16, v4

    move v4, v3

    move/from16 v3, v16

    goto :goto_a

    :cond_1a
    const/4 v3, -0x1

    :goto_9
    if-eqz v9, :cond_10

    move v4, v11

    :goto_a
    if-eq v4, v3, :cond_1e

    goto/16 :goto_3

    :cond_1b
    const/16 v3, 0x2e

    if-ne v5, v3, :cond_1e

    if-nez v8, :cond_1c

    if-eqz v7, :cond_27

    :cond_1c
    const/4 v3, 0x0

    .line 311
    invoke-direct {v0, v4, v2, v3}, Ll/ۖ᩷ܿ;->֫(ILjava/lang/CharSequence;Z)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1d

    goto/16 :goto_e

    :cond_1d
    add-int/lit8 v4, v3, 0x1

    goto/16 :goto_d

    :cond_1e
    if-nez v10, :cond_1f

    if-nez v8, :cond_1f

    if-nez v7, :cond_1f

    goto :goto_e

    :cond_1f
    const/16 v3, 0xa

    const/4 v4, 0x0

    .line 320
    invoke-direct {v0, v2, v1, v3, v4}, Ll/ۖ᩷ܿ;->֫(Ljava/lang/CharSequence;IIZ)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_20

    goto :goto_e

    :cond_20
    add-int v4, v1, v3

    if-nez v8, :cond_21

    if-eqz v7, :cond_25

    .line 325
    :cond_21
    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v4, v5, :cond_25

    .line 326
    invoke-interface {v2, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    const/16 v6, 0x2e

    if-ne v5, v6, :cond_22

    add-int/lit8 v5, v4, 0x1

    const/4 v6, 0x1

    .line 328
    invoke-direct {v0, v5, v2, v6}, Ll/ۖ᩷ܿ;->֫(ILjava/lang/CharSequence;Z)I

    move-result v5

    const/4 v7, -0x1

    if-eq v5, v7, :cond_25

    add-int/2addr v3, v6

    add-int v4, v3, v5

    goto :goto_d

    :cond_22
    if-eqz v7, :cond_25

    const/16 v6, 0x65

    if-eq v5, v6, :cond_23

    const/16 v6, 0x45

    if-ne v5, v6, :cond_25

    :cond_23
    add-int/lit8 v4, v4, 0x1

    .line 333
    invoke-direct {v0, v4, v2}, Ll/ۖ᩷ܿ;->ܽ(ILjava/lang/CharSequence;)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_24

    goto :goto_e

    :cond_24
    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v4

    goto :goto_c

    .line 337
    :cond_25
    invoke-direct {v0, v15, v2, v4}, Ll/ۖ᩷ܿ;->֫(Ljava/util/List;Ljava/lang/CharSequence;I)I

    move-result v5

    if-nez v5, :cond_26

    .line 339
    iget-object v5, v0, Ll/ۖ᩷ܿ;->ۢ:Ljava/util/List;

    invoke-direct {v0, v5, v2, v4}, Ll/ۖ᩷ܿ;->֫(Ljava/util/List;Ljava/lang/CharSequence;I)I

    move-result v5

    if-eqz v5, :cond_26

    goto :goto_b

    :cond_26
    if-eqz v10, :cond_27

    :goto_b
    add-int/2addr v3, v5

    :goto_c
    move v4, v3

    :goto_d
    const/4 v3, -0x1

    goto :goto_f

    :cond_27
    :goto_e
    const/4 v3, -0x1

    const/4 v4, -0x1

    :goto_f
    if-ne v4, v3, :cond_28

    return v3

    :cond_28
    add-int/2addr v1, v4

    const/4 v5, 0x1

    .line 272
    invoke-direct {v0, v1, v2, v5}, Ll/ۖ᩷ܿ;->ۧ(ILjava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_29

    return v3

    :cond_29
    return v4

    :cond_2a
    :goto_10
    const/4 v1, -0x1

    return v1
.end method

.method public final ֫()Ll/ۖ᩷ܿ;
    .locals 1

    .line 129
    new-instance v0, Ll/ۖ᩷ܿ;

    invoke-direct {v0, p0}, Ll/ۖ᩷ܿ;-><init>(Ll/ۖ᩷ܿ;)V

    return-object v0
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 2

    .line 152
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ᩳ:Z

    iget-boolean v1, p0, Ll/ۖ᩷ܿ;->ܽ:Z

    if-eqz v0, :cond_0

    or-int/lit8 v1, v1, 0x2

    .line 155
    :cond_0
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->֫:Z

    if-eqz v0, :cond_1

    or-int/lit8 v1, v1, 0x4

    .line 158
    :cond_1
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ۧ:Z

    if-eqz v0, :cond_2

    or-int/lit8 v1, v1, 0x8

    .line 161
    :cond_2
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ܳ:Z

    if-eqz v0, :cond_3

    or-int/lit8 v1, v1, 0x10

    .line 164
    :cond_3
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ܿ:Z

    if-eqz v0, :cond_4

    or-int/lit8 v1, v1, 0x20

    .line 167
    :cond_4
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->᩻:Z

    if-eqz v0, :cond_5

    or-int/lit8 v1, v1, 0x40

    .line 170
    :cond_5
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->᩷:Z

    if-eqz v0, :cond_6

    or-int/lit16 v1, v1, 0x80

    .line 173
    :cond_6
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ۜ:Z

    if-eqz v0, :cond_7

    or-int/lit16 v1, v1, 0x100

    .line 176
    :cond_7
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ۡ(I)V

    .line 177
    iget-object v0, p0, Ll/ۖ᩷ܿ;->ܺ:Ljava/util/List;

    const-string v1, "|"

    invoke-static {v0, v1}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ᩳ(Ljava/lang/String;)V

    .line 178
    iget-object v0, p0, Ll/ۖ᩷ܿ;->ۢ:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ᩳ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 218
    iget-object v0, p0, Ll/ۖ᩷ܿ;->ۢ:Ljava/util/List;

    const-string v1, "|"

    invoke-static {v0, v1}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 229
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ۡ:Z

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 2

    .line 182
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 183
    iget-boolean v1, p0, Ll/ۖ᩷ܿ;->ܽ:Z

    if-eqz v1, :cond_0

    const-string v1, "2"

    .line 184
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    :cond_0
    iget-boolean v1, p0, Ll/ۖ᩷ܿ;->ᩳ:Z

    if-eqz v1, :cond_1

    const-string v1, "8"

    .line 187
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    :cond_1
    iget-boolean v1, p0, Ll/ۖ᩷ܿ;->֫:Z

    if-eqz v1, :cond_2

    const-string v1, "10"

    .line 190
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    :cond_2
    iget-boolean v1, p0, Ll/ۖ᩷ܿ;->ۧ:Z

    if-eqz v1, :cond_3

    const-string v1, "16"

    .line 193
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    :cond_3
    iget-boolean v1, p0, Ll/ۖ᩷ܿ;->ܳ:Z

    if-eqz v1, :cond_4

    const-string v1, "F"

    .line 196
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    :cond_4
    iget-boolean v1, p0, Ll/ۖ᩷ܿ;->ܿ:Z

    if-eqz v1, :cond_5

    const-string v1, "E"

    .line 199
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    :cond_5
    iget-boolean v1, p0, Ll/ۖ᩷ܿ;->᩻:Z

    if-eqz v1, :cond_6

    const-string v1, "P"

    .line 202
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    :cond_6
    iget-boolean v1, p0, Ll/ۖ᩷ܿ;->᩷:Z

    if-eqz v1, :cond_7

    const-string v1, "_"

    .line 205
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    :cond_7
    iget-boolean v1, p0, Ll/ۖ᩷ܿ;->ۜ:Z

    if-eqz v1, :cond_8

    const-string v1, "\'"

    .line 208
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    const-string v1, "|"

    .line 210
    invoke-static {v0, v1}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ll/۟ۘܽ;
    .locals 1

    .line 236
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ܳ:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ܿ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 239
    :cond_0
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->֫:Z

    if-eqz v0, :cond_1

    .line 240
    sget-object v0, Ll/ۖ᩷ܿ;->ۘ:Ll/۟ۘܽ;

    return-object v0

    .line 242
    :cond_1
    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ܽ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ᩳ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->ۧ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ۖ᩷ܿ;->᩻:Z

    if-eqz v0, :cond_2

    goto :goto_0

    .line 245
    :cond_2
    sget-object v0, Ll/۟ۘܽ;->᩻:Ll/۟ۘܽ;

    return-object v0

    .line 243
    :cond_3
    :goto_0
    sget-object v0, Ll/ۖ᩷ܿ;->ᩴ:Ll/۟ۘܽ;

    return-object v0

    .line 237
    :cond_4
    :goto_1
    sget-object v0, Ll/ۖ᩷ܿ;->ۖ:Ll/۟ۘܽ;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 2

    .line 214
    iget-object v0, p0, Ll/ۖ᩷ܿ;->ܺ:Ljava/util/List;

    const-string v1, "|"

    invoke-static {v0, v1}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
