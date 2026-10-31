.class public final Ll/ۚ֨۠;
.super Ll/ܺ֨۠;
.source "M445"


# direct methods
.method public constructor <init>(Ll/ۨܶ۠;Ll/ܳܶ۠;)V
    .locals 1

    .line 76
    new-instance v0, Ll/֡֨۠;

    invoke-direct {v0, p1}, Ll/֡֨۠;-><init>(Ll/ۨܶ۠;)V

    invoke-direct {p0, p2, v0}, Ll/ܺ֨۠;-><init>(Ll/ܳܶ۠;Ll/ۡ֨۠;)V

    return-void
.end method


# virtual methods
.method public final getConfiguration()Ll/ۙۖ֨;
    .locals 1

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v0

    check-cast v0, Ll/֡֨۠;

    return-object v0
.end method

.method public final getConfiguration()Ll/ۡ֨۠;
    .locals 1

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v0

    check-cast v0, Ll/֡֨۠;

    return-object v0
.end method

.method public final bridge synthetic ֫(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 67
    invoke-virtual {p0, p1, p2}, Ll/ۚ֨۠;->ۜ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۜ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 7

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    invoke-virtual {p0, p1, p2}, Ll/ܺ֨۠;->ᩳ(Ll/ܽܶ۠;Ljava/util/Locale;)Ll/ۖܶ۠;

    move-result-object v1

    .line 112
    invoke-virtual {p1}, Ll/ܽܶ۠;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ll/ۖܶ۠;->toArray()[Ljava/lang/Object;

    move-result-object v1

    .line 347
    iget-object v3, p0, Ll/ܺ֨۠;->ᩳ:Ll/ܳܶ۠;

    invoke-virtual {v3, p2, v2, v1}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\n"

    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 114
    array-length v3, v1

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_0

    new-array v1, v4, [Ljava/lang/String;

    const-string v3, ""

    aput-object v3, v1, v5

    .line 215
    :cond_0
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v3

    check-cast v3, Ll/֡֨۠;

    .line 478
    iget-object v3, v3, Ll/ۡ֨۠;->ܽ:Ljava/util/EnumSet;

    invoke-static {v3}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object v3

    .line 116
    sget-object v6, Ll/᩹ۖ֨;->۬:Ll/᩹ۖ֨;

    invoke-virtual {v3, v6}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v3

    check-cast v3, Ll/֡֨۠;

    .line 117
    invoke-virtual {v3, v6}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;)I

    move-result v3

    .line 118
    aget-object v5, v1, v5

    invoke-static {v3, v5}, Ll/ܺ֨۠;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v5, v3

    .line 120
    :cond_1
    array-length v3, v1

    if-le v3, v4, :cond_2

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v3

    check-cast v3, Ll/֡֨۠;

    .line 478
    iget-object v3, v3, Ll/ۡ֨۠;->ܽ:Ljava/util/EnumSet;

    invoke-static {v3}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object v3

    .line 120
    sget-object v6, Ll/᩹ۖ֨;->᩹:Ll/᩹ۖ֨;

    invoke-virtual {v3, v6}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v3

    check-cast v3, Ll/֡֨۠;

    .line 121
    invoke-virtual {v3, v6}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;)I

    move-result v3

    add-int/2addr v5, v3

    .line 122
    :goto_0
    array-length v3, v1

    if-ge v4, v3, :cond_2

    .line 123
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v6, v1, v4

    invoke-static {v5, v6}, Ll/ܺ֨۠;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 0
    :cond_2
    instance-of v1, p1, Ll/᩺۠۠;

    if-eqz v1, :cond_3

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v1

    check-cast v1, Ll/֡֨۠;

    .line 478
    iget-object v1, v1, Ll/ۡ֨۠;->ܽ:Ljava/util/EnumSet;

    invoke-static {v1}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object v1

    .line 126
    sget-object v3, Ll/᩹ۖ֨;->ۗ:Ll/᩹ۖ֨;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v1

    check-cast v1, Ll/֡֨۠;

    .line 127
    invoke-virtual {v1, v3}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;)I

    move-result v1

    add-int/2addr v1, v5

    .line 128
    invoke-virtual {p0, p1, p2}, Ll/ܺ֨۠;->᩻(Ll/ܽܶ۠;Ljava/util/Locale;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 129
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, p2}, Ll/ܺ֨۠;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 132
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 10

    .line 89
    iget-object v0, p0, Ll/ܺ֨۠;->ᩳ:Ll/ܳܶ۠;

    if-nez p2, :cond_0

    .line 90
    invoke-virtual {v0}, Ll/ܳܶ۠;->֫()Ljava/util/Locale;

    move-result-object p2

    .line 199
    :cond_0
    invoke-virtual {p1}, Ll/ܽܶ۠;->ܿ()Ll/ܳ۠۠;

    move-result-object v1

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v2

    check-cast v2, Ll/֡֨۠;

    .line 200
    sget-object v3, Ll/ᩴ֨۠;->᩶:Ll/ᩴ֨۠;

    .line 392
    iget-object v2, v2, Ll/֡֨۠;->ᩳ:Ljava/util/EnumMap;

    invoke-virtual {v2, v3}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, -0x1

    if-eqz v1, :cond_2

    .line 201
    sget-object v4, Ll/ܳ۠۠;->᩷:Ll/ܳ۠۠;

    if-eq v1, v4, :cond_2

    .line 202
    invoke-virtual {p1}, Ll/ܽܶ۠;->᩻()I

    move-result v4

    if-eq v4, v3, :cond_1

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v1

    check-cast v1, Ll/֡֨۠;

    .line 203
    sget-object v2, Ll/ᩴ֨۠;->ۙ:Ll/ᩴ֨۠;

    .line 392
    :goto_0
    iget-object v1, v1, Ll/֡֨۠;->ᩳ:Ljava/util/EnumMap;

    invoke-virtual {v1, v2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    goto :goto_1

    .line 68
    :cond_1
    iget-object v1, v1, Ll/ܳ۠۠;->ᩳ:Ll/ᩳ᩶۠;

    if-eqz v1, :cond_2

    .line 205
    invoke-interface {v1}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v1

    sget-object v4, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    if-ne v1, v4, :cond_2

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v1

    check-cast v1, Ll/֡֨۠;

    .line 206
    sget-object v2, Ll/ᩴ֨۠;->᩹:Ll/ᩴ֨۠;

    goto :goto_0

    .line 92
    :cond_2
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 93
    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v5, v6, :cond_15

    .line 94
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x25

    const/4 v8, 0x1

    if-ne v6, v7, :cond_3

    .line 96
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v9

    sub-int/2addr v9, v8

    if-ge v5, v9, :cond_3

    add-int/lit8 v5, v5, 0x1

    .line 98
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/4 v9, 0x1

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    :goto_3
    if-eqz v9, :cond_13

    if-eq v6, v7, :cond_12

    const/16 v7, 0x4c

    const-string v9, ""

    if-eq v6, v7, :cond_10

    const/16 v7, 0x5f

    if-eq v6, v7, :cond_f

    const/16 v7, 0x62

    if-eq v6, v7, :cond_e

    const/16 v7, 0x63

    if-eq v6, v7, :cond_d

    const/16 v7, 0x65

    if-eq v6, v7, :cond_c

    const/16 v7, 0x66

    if-eq v6, v7, :cond_b

    const/16 v7, 0x6c

    if-eq v6, v7, :cond_a

    const/16 v7, 0x6d

    if-eq v6, v7, :cond_9

    const/16 v7, 0x6f

    if-eq v6, v7, :cond_8

    const/16 v7, 0x70

    if-eq v6, v7, :cond_7

    const/16 v7, 0x73

    if-eq v6, v7, :cond_6

    const/16 v7, 0x74

    if-eq v6, v7, :cond_4

    .line 194
    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v9

    goto/16 :goto_5

    .line 170
    :cond_4
    sget-object v6, Ll/ۘ֨۠;->֫:[I

    invoke-virtual {p1}, Ll/ܽܶ۠;->ܺ()Ll/۬۠۠;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    if-eq v6, v8, :cond_14

    const/4 v7, 0x2

    if-eq v6, v7, :cond_5

    goto :goto_4

    .line 175
    :cond_5
    invoke-virtual {p1}, Ll/ܽܶ۠;->᩻()I

    move-result v6

    if-ne v6, v3, :cond_14

    .line 181
    :goto_4
    invoke-virtual {p0, p1, p2}, Ll/ܺ֨۠;->ܳ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 167
    :cond_6
    sget-object v6, Ll/ۗۖ֨;->۬:Ll/ۗۖ֨;

    invoke-static {p1, v6}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Ll/ۗۖ֨;)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 165
    :cond_7
    invoke-virtual {p0, p1, p2}, Ll/ܺ֨۠;->ܳ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 163
    :cond_8
    sget-object v6, Ll/ۗۖ֨;->ۗ:Ll/ۗۖ֨;

    invoke-static {p1, v6}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Ll/ۗۖ֨;)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 186
    :cond_9
    invoke-virtual {p0, p1, p2}, Ll/ۚ֨۠;->ۜ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 159
    :cond_a
    sget-object v6, Ll/ۗۖ֨;->ۙ:Ll/ۗۖ֨;

    invoke-static {p1, v6}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Ll/ۗۖ֨;)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 157
    :cond_b
    invoke-static {p1, v8}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Z)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 155
    :cond_c
    sget-object v6, Ll/ۗۖ֨;->᩶:Ll/ۗۖ֨;

    invoke-static {p1, v6}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Ll/ۗۖ֨;)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 161
    :cond_d
    sget-object v6, Ll/ۗۖ֨;->᩹:Ll/ۗۖ֨;

    invoke-static {p1, v6}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Ll/ۗۖ֨;)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    .line 153
    :cond_e
    invoke-static {p1, v4}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Z)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    :cond_f
    const-string v9, " "

    goto :goto_5

    .line 332
    :cond_10
    invoke-virtual {p1}, Ll/ܽܶ۠;->᩷()Ll/᩶ᩴ֨;

    move-result-object v6

    if-nez v6, :cond_11

    goto :goto_5

    .line 335
    :cond_11
    iget-object v6, v6, Ll/᩶ᩴ֨;->᩹:Ljava/lang/String;

    new-array v7, v8, [Ljava/lang/Object;

    aput-object v6, v7, v4

    const-string v6, "compiler.warn.lintOption"

    .line 347
    invoke-virtual {v0, p2, v6, v7}, Ll/ܳܶ۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_5

    :cond_12
    const-string v9, "%"

    goto :goto_5

    .line 100
    :cond_13
    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v9

    :cond_14
    :goto_5
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr v5, v8

    goto/16 :goto_2

    .line 102
    :cond_15
    iget p2, p0, Ll/ܺ֨۠;->ܽ:I

    if-nez p2, :cond_19

    .line 103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 136
    invoke-virtual {p0, p1}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;)Z

    move-result v0

    if-nez v0, :cond_16

    return-object p2

    .line 215
    :cond_16
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v0

    check-cast v0, Ll/֡֨۠;

    .line 140
    sget-object v1, Ll/᩹ۖ֨;->ۙ:Ll/᩹ۖ֨;

    invoke-virtual {v0, v1}, Ll/֡֨۠;->֫(Ll/᩹ۖ֨;)I

    move-result v0

    .line 141
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 142
    invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 215
    invoke-super {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object v0

    check-cast v0, Ll/֡֨۠;

    .line 356
    iget-object v0, v0, Ll/֡֨۠;->ܳ:Ll/᩵֨۠;

    .line 143
    sget-object v1, Ll/᩵֨۠;->᩶:Ll/᩵֨۠;

    if-ne v0, v1, :cond_17

    goto :goto_6

    .line 146
    :cond_17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v2, p1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 0
    :cond_18
    :goto_6
    invoke-static {p2, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 105
    :cond_19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
