.class public final Ll/ۤᩴ֡;
.super Ll/ۡ֨֡;
.source "4917"


# instance fields
.field public final ֫:Ll/֨ᩴ֡;

.field public ۧ:Z

.field public final ܳ:Ljava/util/ArrayList;

.field public ܽ:I

.field public final ܿ:Ljava/lang/Integer;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ll/ܽ֨֡;)V
    .locals 3

    const v0, 0xf4240

    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v1, Ll/֨ᩴ֡;

    invoke-direct {v1}, Ll/֨ᩴ֡;-><init>()V

    iput-object v1, p0, Ll/ۤᩴ֡;->֫:Ll/֨ᩴ֡;

    .line 18
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ۤᩴ֡;->ܳ:Ljava/util/ArrayList;

    const/4 v2, 0x0

    .line 21
    iput v2, p0, Ll/ۤᩴ֡;->ܽ:I

    const/4 v2, 0x1

    .line 23
    iput-boolean v2, p0, Ll/ۤᩴ֡;->ۧ:Z

    .line 26
    iput-object p1, p0, Ll/ۤᩴ֡;->ᩳ:Ljava/util/ArrayList;

    .line 27
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    iput-object v0, p0, Ll/ۤᩴ֡;->ܿ:Ljava/lang/Integer;

    return-void
.end method

.method private ֫(Ll/ܽ֨֡;ILl/ۨۚ֡;)Ll/᩸ᩴ֡;
    .locals 3

    .line 122
    iget-object v0, p0, Ll/ۤᩴ֡;->ܿ:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 123
    iget v1, p0, Ll/ۤᩴ֡;->ܽ:I

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 129
    iget v0, p0, Ll/ۤᩴ֡;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۤᩴ֡;->ܽ:I

    goto :goto_0

    .line 124
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Aborting parsing because maximum number of cells reached (maxCells = "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ")"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 131
    :cond_1
    :goto_0
    new-instance v0, Ll/᩸ᩴ֡;

    invoke-direct {v0}, Ll/᩸ᩴ֡;-><init>()V

    .line 132
    invoke-virtual {p1}, Ll/ܽ֨֡;->ۧ()Ll/᩶ۚ֡;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 134
    invoke-virtual {v0, v1}, Ll/֡ۚ֡;->֫(Ll/᩶ۚ֡;)V

    .line 137
    :cond_2
    iget-object v1, p0, Ll/ۤᩴ֡;->ᩳ:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge p2, v2, :cond_3

    .line 138
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۫ᩴ֡;

    .line 139
    invoke-virtual {p2}, Ll/۫ᩴ֡;->֫()Ll/ܶᩴ֡;

    move-result-object p2

    invoke-virtual {v0, p2}, Ll/᩸ᩴ֡;->֫(Ll/ܶᩴ֡;)V

    .line 143
    :cond_3
    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p2

    const/4 v1, 0x0

    .line 144
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {v1, v2, p2}, Ll/ۡ۠ۘ;->֫(IILjava/lang/CharSequence;)I

    move-result v1

    .line 145
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v2, v1, p2}, Ll/ۡ۠ۘ;->ۧ(IILjava/lang/CharSequence;)I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    .line 146
    invoke-virtual {p1, v1, p2}, Ll/ܽ֨֡;->֫(II)Ll/ܽ֨֡;

    move-result-object p1

    .line 21
    new-instance p2, Ll/ᩳ֨֡;

    invoke-direct {p2}, Ll/ᩳ֨֡;-><init>()V

    .line 22
    invoke-virtual {p2, p1}, Ll/ᩳ֨֡;->֫(Ll/ܽ֨֡;)V

    .line 146
    invoke-interface {p3, p2, v0}, Ll/ۨۚ֡;->֫(Ll/ᩳ֨֡;Ll/֡ۚ֡;)V

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/ܽ֨֡;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۤᩴ֡;->ܽ(Ll/ܽ֨֡;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Ll/ܽ֨֡;)Ljava/util/ArrayList;
    .locals 11

    .line 152
    invoke-virtual {p0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    .line 153
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1, v0}, Ll/ۡ۠ۘ;->֫(IILjava/lang/CharSequence;)I

    move-result v1

    .line 155
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    .line 156
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v5, 0x7c

    if-ne v4, v5, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 160
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-static {v3, v1, v0}, Ll/ۡ۠ۘ;->ۧ(IILjava/lang/CharSequence;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    .line 163
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 164
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move v7, v1

    :goto_0
    if-ge v1, v3, :cond_4

    .line 166
    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    const/16 v9, 0x5c

    if-eq v8, v9, :cond_2

    if-eq v8, v5, :cond_1

    .line 190
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 182
    :cond_1
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 184
    invoke-virtual {p0, v7, v1}, Ll/ܽ֨֡;->֫(II)Ll/ܽ֨֡;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܽ֨֡;->ۧ()Ll/᩶ۚ֡;

    move-result-object v7

    invoke-static {v8, v7}, Ll/ܽ֨֡;->֫(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)Ll/ܽ֨֡;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    add-int/lit8 v7, v1, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v8, v1, 0x1

    if-ge v8, v3, :cond_3

    .line 169
    invoke-interface {v0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-ne v10, v5, :cond_3

    .line 174
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v1, v8

    goto :goto_1

    .line 178
    :cond_3
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 193
    :cond_4
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_5

    .line 194
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 198
    invoke-virtual {p0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {p0, v7, v1}, Ll/ܽ֨֡;->֫(II)Ll/ܽ֨֡;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܽ֨֡;->ۧ()Ll/᩶ۚ֡;

    move-result-object p0

    .line 196
    invoke-static {v0, p0}, Ll/ܽ֨֡;->֫(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)Ll/ܽ֨֡;

    move-result-object p0

    .line 195
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object v4
.end method


# virtual methods
.method public final ֫(Ll/᩵֨֡;)Ll/ܳ᩵֡;
    .locals 4

    .line 43
    invoke-interface {p1}, Ll/᩵֨֡;->getLine()Ll/ܽ֨֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    const/16 v1, 0x7c

    .line 44
    invoke-interface {p1}, Ll/᩵֨֡;->ᩳ()I

    move-result v2

    invoke-static {v1, v0, v2}, Ll/ۡ۠ۘ;->֫(CLjava/lang/CharSequence;I)I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    .line 46
    invoke-interface {p1}, Ll/᩵֨֡;->ᩳ()I

    move-result v2

    if-ne v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 49
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {v1, v2, v0}, Ll/ۡ۠ۘ;->֫(IILjava/lang/CharSequence;)I

    move-result v1

    .line 50
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ne v1, v0, :cond_0

    const/4 p1, 0x0

    .line 52
    iput-boolean p1, p0, Ll/ۤᩴ֡;->ۧ:Z

    return-object v3

    .line 56
    :cond_0
    invoke-interface {p1}, Ll/᩵֨֡;->getIndex()I

    move-result p1

    invoke-static {p1}, Ll/ܳ᩵֡;->֫(I)Ll/ܳ᩵֡;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v3
.end method

.method public final ֫(Ll/ۨۚ֡;)V
    .locals 12

    .line 69
    iget-object v0, p0, Ll/ۤᩴ֡;->֫:Ll/֨ᩴ֡;

    invoke-virtual {v0}, Ll/֡ۚ֡;->ܳ()Ljava/util/List;

    move-result-object v1

    .line 71
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v2, :cond_0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ۚ֡;

    goto :goto_0

    :cond_0
    move-object v2, v3

    .line 72
    :goto_0
    new-instance v5, Ll/᩹ᩴ֡;

    invoke-direct {v5}, Ll/᩹ᩴ֡;-><init>()V

    if-eqz v2, :cond_1

    .line 74
    invoke-virtual {v5, v2}, Ll/֡ۚ֡;->֫(Ll/᩶ۚ֡;)V

    .line 76
    :cond_1
    invoke-virtual {v0, v5}, Ll/֡ۚ֡;->֫(Ll/֡ۚ֡;)V

    .line 78
    new-instance v2, Ll/᩶ᩴ֡;

    invoke-direct {v2}, Ll/᩶ᩴ֡;-><init>()V

    .line 79
    invoke-virtual {v5}, Ll/֡ۚ֡;->ܳ()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v2, v6}, Ll/֡ۚ֡;->֫(Ljava/util/List;)V

    .line 80
    invoke-virtual {v5, v2}, Ll/֡ۚ֡;->֫(Ll/֡ۚ֡;)V

    .line 82
    iget-object v5, p0, Ll/ۤᩴ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽ֨֡;

    invoke-static {v4}, Ll/ۤᩴ֡;->ܽ(Ll/ܽ֨֡;)Ljava/util/ArrayList;

    move-result-object v4

    .line 83
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_2

    .line 85
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܽ֨֡;

    .line 86
    invoke-direct {p0, v8, v7, p1}, Ll/ۤᩴ֡;->֫(Ll/ܽ֨֡;ILl/ۨۚ֡;)Ll/᩸ᩴ֡;

    move-result-object v8

    .line 87
    invoke-virtual {v8}, Ll/᩸ᩴ֡;->ۡ()V

    .line 88
    invoke-virtual {v2, v8}, Ll/֡ۚ֡;->֫(Ll/֡ۚ֡;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x2

    move-object v4, v3

    .line 93
    :goto_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v2, v7, :cond_8

    .line 94
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܽ֨֡;

    .line 96
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    if-ge v2, v8, :cond_3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩶ۚ֡;

    goto :goto_3

    :cond_3
    move-object v8, v3

    .line 97
    :goto_3
    invoke-static {v7}, Ll/ۤᩴ֡;->ܽ(Ll/ܽ֨֡;)Ljava/util/ArrayList;

    move-result-object v7

    .line 98
    new-instance v9, Ll/᩶ᩴ֡;

    invoke-direct {v9}, Ll/᩶ᩴ֡;-><init>()V

    if-eqz v8, :cond_4

    .line 100
    invoke-virtual {v9, v8}, Ll/֡ۚ֡;->֫(Ll/᩶ۚ֡;)V

    :cond_4
    const/4 v10, 0x0

    :goto_4
    if-ge v10, v6, :cond_6

    .line 105
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_5

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܽ֨֡;

    goto :goto_5

    :cond_5
    const-string v11, ""

    invoke-static {v11, v3}, Ll/ܽ֨֡;->֫(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)Ll/ܽ֨֡;

    move-result-object v11

    .line 106
    :goto_5
    invoke-direct {p0, v11, v10, p1}, Ll/ۤᩴ֡;->֫(Ll/ܽ֨֡;ILl/ۨۚ֡;)Ll/᩸ᩴ֡;

    move-result-object v11

    .line 107
    invoke-virtual {v9, v11}, Ll/֡ۚ֡;->֫(Ll/֡ۚ֡;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_6
    if-nez v4, :cond_7

    .line 113
    new-instance v4, Ll/۠ᩴ֡;

    invoke-direct {v4}, Ll/۠ᩴ֡;-><init>()V

    .line 114
    invoke-virtual {v0, v4}, Ll/֡ۚ֡;->֫(Ll/֡ۚ֡;)V

    .line 116
    :cond_7
    invoke-virtual {v4, v9}, Ll/֡ۚ֡;->֫(Ll/֡ۚ֡;)V

    .line 117
    invoke-virtual {v4, v8}, Ll/֡ۚ֡;->֫(Ll/᩶ۚ֡;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_8
    return-void
.end method

.method public final ֫(Ll/ܽ֨֡;)V
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۤᩴ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܿ()Ll/ۨ֡֡;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۤᩴ֡;->֫:Ll/֨ᩴ֡;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Ll/ۤᩴ֡;->ۧ:Z

    return v0
.end method
