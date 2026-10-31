.class public final Ll/ܶ۫ۘ;
.super Ljava/lang/Object;
.source "JBJ2"


# static fields
.field public static final ֨:[I

.field public static final ۚ:[C


# instance fields
.field public ֡:Ll/ۚ۫ۘ;

.field public ֫:Ll/ܺ۫ۘ;

.field public final ۖ:[I

.field public final ۘ:Ll/ۜ۫ۘ;

.field public ۜ:Ll/۠۫ۘ;

.field public ۡ:Z

.field public final ۢ:Ll/ۢ۫ۘ;

.field public ۧ:Ljava/lang/StringBuilder;

.field public ܳ:Ljava/lang/StringBuilder;

.field public ܺ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ll/ۖ۫ۘ;

.field public final ᩳ:[I

.field public ᩴ:Ll/֡۫ۘ;

.field public ᩵:Ll/ܶۛۘ;

.field public ᩷:Ll/᩵۫ۘ;

.field public ᩻:Ll/ۘ۫ۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x7

    new-array v0, v0, [C

    .line 13
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܶ۫ۘ;->ۚ:[C

    const/16 v1, 0x20

    new-array v1, v1, [I

    .line 18
    fill-array-data v1, :array_1

    sput-object v1, Ll/ܶ۫ۘ;->֨:[I

    .line 28
    invoke-static {v0}, Ljava/util/Arrays;->sort([C)V

    return-void

    nop

    :array_0
    .array-data 2
        0x9s
        0xas
        0xds
        0xcs
        0x20s
        0x3cs
        0x26s
    .end array-data

    nop

    :array_1
    .array-data 4
        0x20ac
        0x81
        0x201a
        0x192
        0x201e
        0x2026
        0x2020
        0x2021
        0x2c6
        0x2030
        0x160
        0x2039
        0x152
        0x8d
        0x17d
        0x8f
        0x90
        0x2018
        0x2019
        0x201c
        0x201d
        0x2022
        0x2013
        0x2014
        0x2dc
        0x2122
        0x161
        0x203a
        0x153
        0x9d
        0x17e
        0x178
    .end array-data
.end method

.method public constructor <init>(Ll/ۜ۫ۘ;Ll/ۢ۫ۘ;)V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    sget-object v0, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    iput-object v0, p0, Ll/ܶ۫ۘ;->᩵:Ll/ܶۛۘ;

    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Ll/ܶ۫ۘ;->ۡ:Z

    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Ll/ܶ۫ۘ;->ܽ:Ljava/lang/String;

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll/ܶ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll/ܶ۫ۘ;->ܳ:Ljava/lang/StringBuilder;

    .line 42
    new-instance v0, Ll/֡۫ۘ;

    invoke-direct {v0}, Ll/֡۫ۘ;-><init>()V

    iput-object v0, p0, Ll/ܶ۫ۘ;->ᩴ:Ll/֡۫ۘ;

    .line 43
    new-instance v0, Ll/᩵۫ۘ;

    invoke-direct {v0}, Ll/᩵۫ۘ;-><init>()V

    iput-object v0, p0, Ll/ܶ۫ۘ;->᩷:Ll/᩵۫ۘ;

    .line 44
    new-instance v0, Ll/ܺ۫ۘ;

    invoke-direct {v0}, Ll/ܺ۫ۘ;-><init>()V

    iput-object v0, p0, Ll/ܶ۫ۘ;->֫:Ll/ܺ۫ۘ;

    .line 45
    new-instance v0, Ll/ۘ۫ۘ;

    invoke-direct {v0}, Ll/ۘ۫ۘ;-><init>()V

    iput-object v0, p0, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    .line 46
    new-instance v0, Ll/ۖ۫ۘ;

    invoke-direct {v0}, Ll/ۖ۫ۘ;-><init>()V

    iput-object v0, p0, Ll/ܶ۫ۘ;->ܿ:Ll/ۖ۫ۘ;

    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 128
    iput-object v0, p0, Ll/ܶ۫ۘ;->ᩳ:[I

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 129
    iput-object v0, p0, Ll/ܶ۫ۘ;->ۖ:[I

    .line 50
    iput-object p1, p0, Ll/ܶ۫ۘ;->ۘ:Ll/ۜ۫ۘ;

    .line 51
    iput-object p2, p0, Ll/ܶ۫ۘ;->ۢ:Ll/ۢ۫ۘ;

    return-void
.end method

.method private ۧ(Ljava/lang/String;)V
    .locals 5

    .line 255
    iget-object v0, p0, Ll/ܶ۫ۘ;->ۢ:Ll/ۢ۫ۘ;

    invoke-virtual {v0}, Ll/ۢ۫ۘ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 256
    new-instance v1, Ll/᩷۫ۘ;

    iget-object v2, p0, Ll/ܶ۫ۘ;->ۘ:Ll/ۜ۫ۘ;

    invoke-virtual {v2}, Ll/ۜ۫ۘ;->ᩴ()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string p1, "Invalid character reference: %s"

    invoke-direct {v1, v2, p1, v3}, Ll/᩷۫ۘ;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 241
    iget-object v0, p0, Ll/ܶ۫ۘ;->ܺ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Z)Ll/ۚ۫ۘ;
    .locals 0

    if-eqz p1, :cond_0

    .line 207
    iget-object p1, p0, Ll/ܶ۫ۘ;->ᩴ:Ll/֡۫ۘ;

    invoke-virtual {p1}, Ll/֡۫ۘ;->֫()Ll/ۚ۫ۘ;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/ܶ۫ۘ;->᩷:Ll/᩵۫ۘ;

    invoke-virtual {p1}, Ll/ۚ۫ۘ;->֫()Ll/ۚ۫ۘ;

    :goto_0
    iput-object p1, p0, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    return-object p1
.end method

.method public final ֫(C)V
    .locals 0

    .line 112
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ۫ۘ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 93
    iget-object v0, p0, Ll/ܶ۫ۘ;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 94
    iput-object p1, p0, Ll/ܶ۫ۘ;->ܽ:Ljava/lang/String;

    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Ll/ܶ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 97
    iget-object v1, p0, Ll/ܶ۫ۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ll/۠۫ۘ;)V
    .locals 2

    .line 75
    iget-boolean v0, p0, Ll/ܶ۫ۘ;->ۡ:Z

    if-nez v0, :cond_2

    .line 77
    iput-object p1, p0, Ll/ܶ۫ۘ;->ۜ:Ll/۠۫ۘ;

    const/4 v0, 0x1

    .line 78
    iput-boolean v0, p0, Ll/ܶ۫ۘ;->ۡ:Z

    .line 80
    iget-object v0, p1, Ll/۠۫ۘ;->֫:Ll/֨۫ۘ;

    sget-object v1, Ll/֨۫ۘ;->۫:Ll/֨۫ۘ;

    if-ne v0, v1, :cond_0

    .line 81
    check-cast p1, Ll/֡۫ۘ;

    .line 82
    iget-object p1, p1, Ll/ۚ۫ۘ;->ۢ:Ljava/lang/String;

    iput-object p1, p0, Ll/ܶ۫ۘ;->ܺ:Ljava/lang/String;

    return-void

    .line 83
    :cond_0
    sget-object v1, Ll/֨۫ۘ;->۬:Ll/֨۫ۘ;

    if-ne v0, v1, :cond_1

    .line 84
    check-cast p1, Ll/᩵۫ۘ;

    .line 85
    iget-object p1, p1, Ll/ۚ۫ۘ;->ۧ:Ll/ܳ۫ۘ;

    if-eqz p1, :cond_1

    .line 260
    iget-object p1, p0, Ll/ܶ۫ۘ;->ۢ:Ll/ۢ۫ۘ;

    invoke-virtual {p1}, Ll/ۢ۫ۘ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 261
    new-instance v0, Ll/᩷۫ۘ;

    iget-object v1, p0, Ll/ܶ۫ۘ;->ۘ:Ll/ۜ۫ۘ;

    invoke-virtual {v1}, Ll/ۜ۫ۘ;->ᩴ()I

    move-result v1

    invoke-direct {v0, v1}, Ll/᩷۫ۘ;-><init>(I)V

    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void

    .line 71
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "There is an unread token pending!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܶۛۘ;)V
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ܶ۫ۘ;->ۘ:Ll/ۜ۫ۘ;

    invoke-virtual {v0}, Ll/ۜ۫ۘ;->֫()V

    .line 125
    iput-object p1, p0, Ll/ܶ۫ۘ;->᩵:Ll/ܶۛۘ;

    return-void
.end method

.method public final ֫(Ljava/lang/Character;Z)[I
    .locals 8

    .line 132
    iget-object v0, p0, Ll/ܶ۫ۘ;->ۘ:Ll/ۜ۫ۘ;

    invoke-virtual {v0}, Ll/ۜ۫ۘ;->ۡ()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    if-eqz p1, :cond_1

    .line 134
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {v0}, Ll/ۜ۫ۘ;->ۢ()C

    move-result v1

    if-ne p1, v1, :cond_1

    goto/16 :goto_4

    .line 136
    :cond_1
    sget-object p1, Ll/ܶ۫ۘ;->ۚ:[C

    invoke-virtual {v0, p1}, Ll/ۜ۫ۘ;->ᩳ([C)Z

    move-result p1

    if-eqz p1, :cond_2

    goto/16 :goto_4

    .line 140
    :cond_2
    invoke-virtual {v0}, Ll/ۜ۫ۘ;->ܺ()V

    const-string p1, "#"

    .line 141
    invoke-virtual {v0, p1}, Ll/ۜ۫ۘ;->֫(Ljava/lang/String;)Z

    move-result p1

    const-string v1, "missing semicolon"

    const-string v3, ";"

    const/4 v4, 0x0

    iget-object v5, p0, Ll/ܶ۫ۘ;->ᩳ:[I

    if-eqz p1, :cond_b

    const-string p1, "X"

    .line 142
    invoke-virtual {v0, p1}, Ll/ۜ۫ۘ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 143
    invoke-virtual {v0}, Ll/ۜ۫ۘ;->ܿ()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ll/ۜ۫ۘ;->ᩳ()Ljava/lang/String;

    move-result-object p2

    .line 144
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_4

    const-string p1, "numeric reference with no numerals"

    .line 145
    invoke-direct {p0, p1}, Ll/ܶ۫ۘ;->ۧ(Ljava/lang/String;)V

    .line 146
    invoke-virtual {v0}, Ll/ۜ۫ۘ;->᩵()V

    return-object v2

    .line 149
    :cond_4
    invoke-virtual {v0, v3}, Ll/ۜ۫ۘ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 150
    invoke-direct {p0, v1}, Ll/ܶ۫ۘ;->ۧ(Ljava/lang/String;)V

    :cond_5
    if-eqz p1, :cond_6

    const/16 p1, 0x10

    goto :goto_1

    :cond_6
    const/16 p1, 0xa

    :goto_1
    const/4 v0, -0x1

    .line 154
    :try_start_0
    invoke-static {p2, p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/4 p1, -0x1

    :goto_2
    if-eq p1, v0, :cond_a

    const p2, 0xd800

    if-lt p1, p2, :cond_7

    const p2, 0xdfff

    if-le p1, p2, :cond_a

    :cond_7
    const p2, 0x10ffff

    if-le p1, p2, :cond_8

    goto :goto_3

    :cond_8
    const/16 p2, 0x80

    if-lt p1, p2, :cond_9

    const/16 p2, 0xa0

    if-ge p1, p2, :cond_9

    const-string p2, "character is not a valid unicode code point"

    .line 164
    invoke-direct {p0, p2}, Ll/ܶ۫ۘ;->ۧ(Ljava/lang/String;)V

    add-int/lit8 p1, p1, -0x80

    .line 165
    sget-object p2, Ll/ܶ۫ۘ;->֨:[I

    aget p1, p2, p1

    .line 170
    :cond_9
    aput p1, v5, v4

    return-object v5

    :cond_a
    :goto_3
    const-string p1, "character outside of valid range"

    .line 158
    invoke-direct {p0, p1}, Ll/ܶ۫ۘ;->ۧ(Ljava/lang/String;)V

    const p1, 0xfffd

    .line 159
    aput p1, v5, v4

    return-object v5

    .line 175
    :cond_b
    invoke-virtual {v0}, Ll/ۜ۫ۘ;->᩻()Ljava/lang/String;

    move-result-object p1

    const/16 v6, 0x3b

    .line 176
    invoke-virtual {v0, v6}, Ll/ۜ۫ۘ;->ۧ(C)Z

    move-result v6

    .line 178
    invoke-static {p1}, Ll/᩻۫ۘ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_11

    if-eqz v6, :cond_11

    if-eqz p2, :cond_d

    .line 186
    invoke-virtual {v0}, Ll/ۜ۫ۘ;->ۘ()Z

    move-result p2

    if-nez p2, :cond_c

    invoke-virtual {v0}, Ll/ۜ۫ۘ;->ۖ()Z

    move-result p2

    if-nez p2, :cond_c

    const/4 p2, 0x3

    new-array p2, p2, [C

    fill-array-data p2, :array_0

    invoke-virtual {v0, p2}, Ll/ۜ۫ۘ;->ܽ([C)Z

    move-result p2

    if-eqz p2, :cond_d

    .line 188
    :cond_c
    invoke-virtual {v0}, Ll/ۜ۫ۘ;->᩵()V

    return-object v2

    .line 191
    :cond_d
    invoke-virtual {v0, v3}, Ll/ۜ۫ۘ;->֫(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_e

    .line 192
    invoke-direct {p0, v1}, Ll/ܶ۫ۘ;->ۧ(Ljava/lang/String;)V

    .line 193
    :cond_e
    iget-object p2, p0, Ll/ܶ۫ۘ;->ۖ:[I

    invoke-static {p1, p2}, Ll/᩻۫ۘ;->֫(Ljava/lang/String;[I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_f

    .line 195
    aget p1, p2, v4

    aput p1, v5, v4

    return-object v5

    :cond_f
    const/4 v1, 0x2

    if-ne v0, v1, :cond_10

    return-object p2

    :cond_10
    const-string p2, "Unexpected characters returned for "

    .line 200
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 122
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 181
    :cond_11
    invoke-virtual {v0}, Ll/ۜ۫ۘ;->᩵()V

    if-eqz v6, :cond_12

    const-string p2, "invalid named referenece \'"

    const-string v0, "\'"

    .line 0
    invoke-static {p2, p1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 183
    invoke-direct {p0, p1}, Ll/ܶ۫ۘ;->ۧ(Ljava/lang/String;)V

    :cond_12
    :goto_4
    return-object v2

    nop

    :array_0
    .array-data 2
        0x3ds
        0x2ds
        0x5fs
    .end array-data
.end method

.method public final ۧ()V
    .locals 1

    .line 233
    iget-object v0, p0, Ll/ܶ۫ۘ;->ܳ:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/۠۫ۘ;->֫(Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public final ۧ(Ll/ܶۛۘ;)V
    .locals 5

    .line 250
    iget-object v0, p0, Ll/ܶ۫ۘ;->ۢ:Ll/ۢ۫ۘ;

    invoke-virtual {v0}, Ll/ۢ۫ۘ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 251
    new-instance v1, Ll/᩷۫ۘ;

    iget-object v2, p0, Ll/ܶ۫ۘ;->ۘ:Ll/ۜ۫ۘ;

    invoke-virtual {v2}, Ll/ۜ۫ۘ;->ᩴ()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string p1, "Unexpectedly reached end of file (EOF) in input state [%s]"

    invoke-direct {v1, v2, p1, v3}, Ll/᩷۫ۘ;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ܳ()Z
    .locals 2

    .line 237
    iget-object v0, p0, Ll/ܶ۫ۘ;->ܺ:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {v0}, Ll/ۚ۫ۘ;->ܽ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ܶ۫ۘ;->ܺ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 1

    .line 221
    iget-object v0, p0, Ll/ܶ۫ۘ;->ܿ:Ll/ۖ۫ۘ;

    invoke-virtual {p0, v0}, Ll/ܶ۫ۘ;->֫(Ll/۠۫ۘ;)V

    return-void
.end method

.method public final ܽ(Ll/ܶۛۘ;)V
    .locals 6

    .line 245
    iget-object v0, p0, Ll/ܶ۫ۘ;->ۢ:Ll/ۢ۫ۘ;

    invoke-virtual {v0}, Ll/ۢ۫ۘ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 246
    new-instance v1, Ll/᩷۫ۘ;

    iget-object v2, p0, Ll/ܶ۫ۘ;->ۘ:Ll/ۜ۫ۘ;

    invoke-virtual {v2}, Ll/ۜ۫ۘ;->ᩴ()I

    move-result v3

    invoke-virtual {v2}, Ll/ۜ۫ۘ;->ۢ()C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object p1, v4, v2

    const-string p1, "Unexpected character \'%s\' in input state [%s]"

    invoke-direct {v1, v3, p1, v4}, Ll/᩷۫ۘ;-><init>(ILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 212
    iget-object v0, p0, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {v0}, Ll/ۚ۫ۘ;->ۧ()V

    .line 213
    iget-object v0, p0, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    invoke-virtual {p0, v0}, Ll/ܶ۫ۘ;->֫(Ll/۠۫ۘ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ܶ۫ۘ;->᩻:Ll/ۘ۫ۘ;

    invoke-virtual {p0, v0}, Ll/ܶ۫ۘ;->֫(Ll/۠۫ۘ;)V

    return-void
.end method

.method public final ᩳ(Ll/ܶۛۘ;)V
    .locals 0

    .line 120
    iput-object p1, p0, Ll/ܶ۫ۘ;->᩵:Ll/ܶۛۘ;

    return-void
.end method

.method public final ᩻()Ll/۠۫ۘ;
    .locals 6

    .line 55
    :goto_0
    iget-boolean v0, p0, Ll/ܶ۫ۘ;->ۡ:Z

    if-nez v0, :cond_0

    .line 56
    iget-object v0, p0, Ll/ܶ۫ۘ;->᩵:Ll/ܶۛۘ;

    iget-object v1, p0, Ll/ܶ۫ۘ;->ۘ:Ll/ۜ۫ۘ;

    invoke-virtual {v0, p0, v1}, Ll/ܶۛۘ;->֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V

    goto :goto_0

    .line 59
    :cond_0
    iget-object v0, p0, Ll/ܶ۫ۘ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    iget-object v2, p0, Ll/ܶ۫ۘ;->֫:Ll/ܺ۫ۘ;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-lez v1, :cond_1

    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 62
    iput-object v3, p0, Ll/ܶ۫ۘ;->ܽ:Ljava/lang/String;

    .line 63
    invoke-virtual {v2, v1}, Ll/ܺ۫ۘ;->֫(Ljava/lang/String;)V

    return-object v2

    .line 64
    :cond_1
    iget-object v0, p0, Ll/ܶ۫ۘ;->ܽ:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 65
    invoke-virtual {v2, v0}, Ll/ܺ۫ۘ;->֫(Ljava/lang/String;)V

    .line 66
    iput-object v3, p0, Ll/ܶ۫ۘ;->ܽ:Ljava/lang/String;

    return-object v2

    .line 69
    :cond_2
    iput-boolean v4, p0, Ll/ܶ۫ۘ;->ۡ:Z

    .line 70
    iget-object v0, p0, Ll/ܶ۫ۘ;->ۜ:Ll/۠۫ۘ;

    return-object v0
.end method
