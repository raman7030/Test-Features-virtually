.class public final Ll/ۢ֨֡;
.super Ljava/lang/Object;
.source "43ZG"


# instance fields
.field public ֫:I

.field public ۧ:Ll/ܽ֨֡;

.field public ܽ:I

.field public final ܿ:Ljava/util/List;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    const/4 v1, 0x0

    .line 30
    invoke-static {v0, v1}, Ll/ܽ֨֡;->֫(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)Ll/ܽ֨֡;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ֨֡;->ۧ:Ll/ܽ֨֡;

    const/4 v0, 0x0

    .line 31
    iput v0, p0, Ll/ۢ֨֡;->ᩳ:I

    .line 34
    iput-object p1, p0, Ll/ۢ֨֡;->ܿ:Ljava/util/List;

    .line 35
    iput v0, p0, Ll/ۢ֨֡;->ܽ:I

    .line 36
    iput v0, p0, Ll/ۢ֨֡;->֫:I

    .line 37
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 38
    invoke-direct {p0, v0, v0}, Ll/ۢ֨֡;->֫(II)V

    .line 39
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ֨֡;

    .line 268
    iput-object p1, p0, Ll/ۢ֨֡;->ۧ:Ll/ܽ֨֡;

    .line 269
    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Ll/ۢ֨֡;->ᩳ:I

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ᩳ֨֡;)Ll/ۢ֨֡;
    .locals 1

    .line 44
    new-instance v0, Ll/ۢ֨֡;

    invoke-virtual {p0}, Ll/ᩳ֨֡;->ۧ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۢ֨֡;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method

.method private ֫(II)V
    .locals 3

    .line 273
    iget-object v0, p0, Ll/ۢ֨֡;->ܿ:Ljava/util/List;

    if-ltz p1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_1

    .line 277
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ֨֡;

    if-ltz p2, :cond_0

    .line 278
    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p2, v0, :cond_0

    return-void

    .line 279
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Index "

    const-string v2, " out of range, line length: "

    .line 0
    invoke-static {p2, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 280
    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 274
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, "Line index "

    const-string v2, " out of range, number of lines: "

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 275
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final ֫(C)I
    .locals 2

    const/4 v0, 0x0

    .line 199
    :goto_0
    invoke-virtual {p0}, Ll/ۢ֨֡;->ܽ()C

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 206
    invoke-virtual {p0}, Ll/ۢ֨֡;->ۧ()V

    goto :goto_0
.end method

.method public final ֫(Ll/۟֨֡;)I
    .locals 3

    const/4 v0, 0x0

    .line 170
    :goto_0
    invoke-virtual {p0}, Ll/ۢ֨֡;->ܽ()C

    move-result v1

    move-object v2, p1

    check-cast v2, Ll/ܰ֨֡;

    invoke-virtual {v2, v1}, Ll/ܰ֨֡;->֫(C)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 172
    invoke-virtual {p0}, Ll/ۢ֨֡;->ۧ()V

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final ֫(Ll/᩷֨֡;Ll/᩷֨֡;)Ll/ᩳ֨֡;
    .locals 6

    .line 240
    iget v0, p1, Ll/᩷֨֡;->᩹:I

    iget p1, p1, Ll/᩷֨֡;->᩸:I

    iget v1, p2, Ll/᩷֨֡;->᩹:I

    iget p2, p2, Ll/᩷֨֡;->᩸:I

    iget-object v2, p0, Ll/ۢ֨֡;->ܿ:Ljava/util/List;

    if-ne v0, v1, :cond_1

    .line 242
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ֨֡;

    .line 243
    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 245
    invoke-virtual {v0}, Ll/ܽ֨֡;->ۧ()Ll/᩶ۚ֡;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 247
    invoke-virtual {v0, p1, p2}, Ll/᩶ۚ֡;->֫(II)Ll/᩶ۚ֡;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 249
    :goto_0
    invoke-static {v1, p1}, Ll/ܽ֨֡;->֫(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)Ll/ܽ֨֡;

    move-result-object p1

    .line 21
    new-instance p2, Ll/ᩳ֨֡;

    invoke-direct {p2}, Ll/ᩳ֨֡;-><init>()V

    .line 22
    invoke-virtual {p2, p1}, Ll/ᩳ֨֡;->֫(Ll/ܽ֨֡;)V

    return-object p2

    .line 17
    :cond_1
    new-instance v3, Ll/ᩳ֨֡;

    invoke-direct {v3}, Ll/ᩳ֨֡;-><init>()V

    .line 253
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽ֨֡;

    .line 254
    invoke-virtual {v4}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    invoke-virtual {v4, p1, v5}, Ll/ܽ֨֡;->֫(II)Ll/ܽ֨֡;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/ᩳ֨֡;->֫(Ll/ܽ֨֡;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    if-ge v0, v1, :cond_2

    .line 258
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ֨֡;

    invoke-virtual {v3, p1}, Ll/ᩳ֨֡;->֫(Ll/ܽ֨֡;)V

    goto :goto_1

    .line 261
    :cond_2
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ֨֡;

    const/4 v0, 0x0

    .line 262
    invoke-virtual {p1, v0, p2}, Ll/ܽ֨֡;->֫(II)Ll/ܽ֨֡;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/ᩳ֨֡;->֫(Ll/ܽ֨֡;)V

    return-object v3
.end method

.method public final ֫(Ll/᩷֨֡;)V
    .locals 2

    .line 231
    iget v0, p1, Ll/᩷֨֡;->᩹:I

    iget v1, p1, Ll/᩷֨֡;->᩸:I

    invoke-direct {p0, v0, v1}, Ll/ۢ֨֡;->֫(II)V

    .line 232
    iget p1, p1, Ll/᩷֨֡;->᩹:I

    iput p1, p0, Ll/ۢ֨֡;->ܽ:I

    .line 233
    iput v1, p0, Ll/ۢ֨֡;->֫:I

    .line 234
    iget-object v0, p0, Ll/ۢ֨֡;->ܿ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ֨֡;

    .line 268
    iput-object p1, p0, Ll/ۢ֨֡;->ۧ:Ll/ܽ֨֡;

    .line 269
    invoke-virtual {p1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Ll/ۢ֨֡;->ᩳ:I

    return-void
.end method

.method public final ֫()Z
    .locals 3

    .line 101
    iget v0, p0, Ll/ۢ֨֡;->֫:I

    iget v1, p0, Ll/ۢ֨֡;->ᩳ:I

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    return v2

    .line 105
    :cond_0
    iget v0, p0, Ll/ۢ֨֡;->ܽ:I

    iget-object v1, p0, Ll/ۢ֨֡;->ܿ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 4

    .line 145
    iget v0, p0, Ll/ۢ֨֡;->֫:I

    iget v1, p0, Ll/ۢ֨֡;->ᩳ:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    iget v0, p0, Ll/ۢ֨֡;->ᩳ:I

    if-gt v1, v0, :cond_2

    const/4 v0, 0x0

    .line 147
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 148
    iget-object v1, p0, Ll/ۢ֨֡;->ۧ:Ll/ܽ֨֡;

    invoke-virtual {v1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    iget v3, p0, Ll/ۢ֨֡;->֫:I

    add-int/2addr v3, v0

    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 152
    :cond_1
    iget v0, p0, Ll/ۢ֨֡;->֫:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۢ֨֡;->֫:I

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    return v2
.end method

.method public final ۧ(C)I
    .locals 2

    const/4 v0, 0x0

    .line 161
    :goto_0
    invoke-virtual {p0}, Ll/ۢ֨֡;->ܽ()C

    move-result v1

    if-ne v1, p1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 163
    invoke-virtual {p0}, Ll/ۢ֨֡;->ۧ()V

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final ۧ()V
    .locals 3

    .line 110
    iget v0, p0, Ll/ۢ֨֡;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۢ֨֡;->֫:I

    .line 111
    iget v1, p0, Ll/ۢ֨֡;->ᩳ:I

    if-le v0, v1, :cond_1

    .line 112
    iget v0, p0, Ll/ۢ֨֡;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۢ֨֡;->ܽ:I

    .line 113
    iget-object v1, p0, Ll/ۢ֨֡;->ܿ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 114
    iget v0, p0, Ll/ۢ֨֡;->ܽ:I

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ֨֡;

    goto :goto_0

    :cond_0
    const-string v0, ""

    const/4 v1, 0x0

    .line 116
    invoke-static {v0, v1}, Ll/ܽ֨֡;->֫(Ljava/lang/CharSequence;Ll/᩶ۚ֡;)Ll/ܽ֨֡;

    move-result-object v0

    .line 268
    :goto_0
    iput-object v0, p0, Ll/ۢ֨֡;->ۧ:Ll/ܽ֨֡;

    .line 269
    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iput v0, p0, Ll/ۢ֨֡;->ᩳ:I

    const/4 v0, 0x0

    .line 118
    iput v0, p0, Ll/ۢ֨֡;->֫:I

    :cond_1
    return-void
.end method

.method public final ܳ()Ll/᩷֨֡;
    .locals 3

    .line 227
    new-instance v0, Ll/᩷֨֡;

    iget v1, p0, Ll/ۢ֨֡;->ܽ:I

    iget v2, p0, Ll/ۢ֨֡;->֫:I

    invoke-direct {v0, v1, v2}, Ll/᩷֨֡;-><init>(II)V

    return-object v0
.end method

.method public final ܽ()C
    .locals 2

    .line 48
    iget v0, p0, Ll/ۢ֨֡;->֫:I

    iget v1, p0, Ll/ۢ֨֡;->ᩳ:I

    if-ge v0, v1, :cond_0

    .line 49
    iget-object v0, p0, Ll/ۢ֨֡;->ۧ:Ll/ܽ֨֡;

    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    iget v1, p0, Ll/ۢ֨֡;->֫:I

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    return v0

    .line 51
    :cond_0
    iget v0, p0, Ll/ۢ֨֡;->ܽ:I

    iget-object v1, p0, Ll/ۢ֨֡;->ܿ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    const/16 v0, 0xa

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(C)Z
    .locals 1

    .line 129
    invoke-virtual {p0}, Ll/ۢ֨֡;->ܽ()C

    move-result v0

    if-ne v0, p1, :cond_0

    .line 130
    invoke-virtual {p0}, Ll/ۢ֨֡;->ۧ()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ()I
    .locals 4

    .line 81
    iget v0, p0, Ll/ۢ֨֡;->֫:I

    if-lez v0, :cond_1

    add-int/lit8 v1, v0, -0x1

    .line 83
    iget-object v2, p0, Ll/ۢ֨֡;->ۧ:Ll/ܽ֨֡;

    invoke-virtual {v2}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    .line 84
    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_0

    if-lez v1, :cond_0

    .line 85
    iget-object v1, p0, Ll/ۢ֨֡;->ۧ:Ll/ܽ֨֡;

    invoke-virtual {v1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    add-int/lit8 v0, v0, -0x2

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 86
    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 87
    invoke-static {v0, v2}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    return v0

    :cond_0
    return v2

    .line 92
    :cond_1
    iget v0, p0, Ll/ۢ֨֡;->ܽ:I

    if-lez v0, :cond_2

    const/16 v0, 0xa

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 3

    .line 61
    iget v0, p0, Ll/ۢ֨֡;->֫:I

    iget v1, p0, Ll/ۢ֨֡;->ᩳ:I

    if-ge v0, v1, :cond_1

    .line 62
    iget-object v0, p0, Ll/ۢ֨֡;->ۧ:Ll/ܽ֨֡;

    invoke-virtual {v0}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    iget v1, p0, Ll/ۢ֨֡;->֫:I

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 63
    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Ll/ۢ֨֡;->֫:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Ll/ۢ֨֡;->ᩳ:I

    if-ge v1, v2, :cond_0

    .line 64
    iget-object v1, p0, Ll/ۢ֨֡;->ۧ:Ll/ܽ֨֡;

    invoke-virtual {v1}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v1

    iget v2, p0, Ll/ۢ֨֡;->֫:I

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    .line 65
    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 66
    invoke-static {v0, v1}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    :cond_0
    return v0

    .line 71
    :cond_1
    iget v0, p0, Ll/ۢ֨֡;->ܽ:I

    iget-object v1, p0, Ll/ۢ֨֡;->ܿ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_2

    const/16 v0, 0xa

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()I
    .locals 3

    const/4 v0, 0x0

    .line 180
    :goto_0
    invoke-virtual {p0}, Ll/ۢ֨֡;->ܽ()C

    move-result v1

    const/16 v2, 0x20

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    return v0

    :cond_0
    :pswitch_0
    add-int/lit8 v0, v0, 0x1

    .line 188
    invoke-virtual {p0}, Ll/ۢ֨֡;->ۧ()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
