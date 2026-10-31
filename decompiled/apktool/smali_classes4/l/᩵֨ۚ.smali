.class public final Ll/᩵֨ۚ;
.super Ljava/lang/Object;
.source "JBJ2"


# static fields
.field public static final ܶ:[C

.field public static final ᩸:[I


# instance fields
.field public final ֡:Ll/ᩳۚۚ;

.field public ֨:Ll/᩵ܶۚ;

.field public ֫:Ll/ܿ֨ۚ;

.field public ۖ:Ljava/lang/String;

.field public ۘ:Ljava/lang/String;

.field public ۚ:Ll/ۢ֨ۚ;

.field public ۜ:Ll/᩻֨ۚ;

.field public ۠:Ll/ۡ֨ۚ;

.field public final ۡ:Ll/۟ۚۚ;

.field public ۢ:Ll/᩷֨ۚ;

.field public ۧ:I

.field public ܳ:Ll/ܳ֨ۚ;

.field public ܺ:Z

.field public final ܽ:Ljava/lang/StringBuilder;

.field public final ܿ:[I

.field public ᩳ:Ljava/lang/String;

.field public ᩴ:I

.field public final ᩵:[I

.field public ᩷:Ll/ۖ֨ۚ;

.field public ᩻:Ljava/lang/StringBuilder;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x7

    new-array v0, v0, [C

    .line 15
    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵֨ۚ;->ܶ:[C

    const/16 v1, 0x20

    new-array v1, v1, [I

    .line 20
    fill-array-data v1, :array_1

    sput-object v1, Ll/᩵֨ۚ;->᩸:[I

    .line 30
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

.method public constructor <init>(Ll/ᩳۚۚ;Ll/۟ۚۚ;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    sget-object v0, Ll/᩵ܶۚ;->֡֫:Ll/᩵ܶۚ;

    iput-object v0, p0, Ll/᩵֨ۚ;->֨:Ll/᩵ܶۚ;

    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Ll/᩵֨ۚ;->᩷:Ll/ۖ֨ۚ;

    const/4 v1, 0x0

    .line 38
    iput-boolean v1, p0, Ll/᩵֨ۚ;->ܺ:Z

    .line 39
    iput-object v0, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll/᩵֨ۚ;->ܽ:Ljava/lang/StringBuilder;

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Ll/᩵֨ۚ;->᩻:Ljava/lang/StringBuilder;

    .line 43
    new-instance v0, Ll/ۢ֨ۚ;

    invoke-direct {v0}, Ll/ۢ֨ۚ;-><init>()V

    iput-object v0, p0, Ll/᩵֨ۚ;->ۚ:Ll/ۢ֨ۚ;

    .line 44
    new-instance v1, Ll/᩷֨ۚ;

    invoke-direct {v1}, Ll/᩷֨ۚ;-><init>()V

    iput-object v1, p0, Ll/᩵֨ۚ;->ۢ:Ll/᩷֨ۚ;

    .line 45
    iput-object v0, p0, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    .line 46
    new-instance v0, Ll/ܿ֨ۚ;

    invoke-direct {v0}, Ll/ܿ֨ۚ;-><init>()V

    iput-object v0, p0, Ll/᩵֨ۚ;->֫:Ll/ܿ֨ۚ;

    .line 47
    new-instance v0, Ll/᩻֨ۚ;

    invoke-direct {v0}, Ll/᩻֨ۚ;-><init>()V

    iput-object v0, p0, Ll/᩵֨ۚ;->ۜ:Ll/᩻֨ۚ;

    .line 48
    new-instance v0, Ll/ܳ֨ۚ;

    invoke-direct {v0}, Ll/ܳ֨ۚ;-><init>()V

    iput-object v0, p0, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    const/4 v0, -0x1

    .line 53
    iput v0, p0, Ll/᩵֨ۚ;->ۧ:I

    const/4 v0, 0x1

    new-array v0, v0, [I

    .line 177
    iput-object v0, p0, Ll/᩵֨ۚ;->ܿ:[I

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 178
    iput-object v0, p0, Ll/᩵֨ۚ;->᩵:[I

    .line 56
    iput-object p1, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    .line 57
    iput-object p2, p0, Ll/᩵֨ۚ;->ۡ:Ll/۟ۚۚ;

    return-void
.end method

.method private varargs ۧ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 318
    iget-object v0, p0, Ll/᩵֨ۚ;->ۡ:Ll/۟ۚۚ;

    invoke-virtual {v0}, Ll/۟ۚۚ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 319
    new-instance v1, Ll/ܰۚۚ;

    const-string v2, "Invalid character reference: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    invoke-direct {v1, p2, p1}, Ll/ܰۚۚ;-><init>(Ll/ᩳۚۚ;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 297
    iget-object v0, p0, Ll/᩵֨ۚ;->ۘ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Z)Ll/ۡ֨ۚ;
    .locals 0

    if-eqz p1, :cond_0

    .line 258
    iget-object p1, p0, Ll/᩵֨ۚ;->ۚ:Ll/ۢ֨ۚ;

    invoke-virtual {p1}, Ll/ۢ֨ۚ;->᩻()Ll/ۡ֨ۚ;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll/᩵֨ۚ;->ۢ:Ll/᩷֨ۚ;

    invoke-virtual {p1}, Ll/ۡ֨ۚ;->᩻()Ll/ۡ֨ۚ;

    :goto_0
    iput-object p1, p0, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    return-object p1
.end method

.method public final ֫(C)V
    .locals 2

    .line 134
    iget-object v0, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 135
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    goto :goto_0

    .line 137
    :cond_0
    iget-object v0, p0, Ll/᩵֨ۚ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 138
    iget-object v1, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    :goto_0
    iget p1, p0, Ll/᩵֨ۚ;->ۧ:I

    iget-object v0, p0, Ll/᩵֨ۚ;->֫:Ll/ܿ֨ۚ;

    invoke-virtual {v0, p1}, Ll/ۖ֨ۚ;->ۧ(I)V

    .line 143
    iget-object p1, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    invoke-virtual {p1}, Ll/ᩳۚۚ;->֨()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۖ֨ۚ;->֫(I)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 107
    iget-object v0, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 108
    iput-object p1, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    goto :goto_0

    .line 110
    :cond_0
    iget-object v0, p0, Ll/᩵֨ۚ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 111
    iget-object v1, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    :goto_0
    iget p1, p0, Ll/᩵֨ۚ;->ۧ:I

    iget-object v0, p0, Ll/᩵֨ۚ;->֫:Ll/ܿ֨ۚ;

    invoke-virtual {v0, p1}, Ll/ۖ֨ۚ;->ۧ(I)V

    .line 116
    iget-object p1, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    invoke-virtual {p1}, Ll/ᩳۚۚ;->֨()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۖ֨ۚ;->֫(I)V

    return-void
.end method

.method public final varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 328
    iget-object v0, p0, Ll/᩵֨ۚ;->ۡ:Ll/۟ۚۚ;

    invoke-virtual {v0}, Ll/۟ۚۚ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 329
    new-instance v1, Ll/ܰۚۚ;

    iget-object v2, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    invoke-direct {v1, v2, p1, p2}, Ll/ܰۚۚ;-><init>(Ll/ᩳۚۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 2

    .line 121
    iget-object v0, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 122
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    goto :goto_0

    .line 124
    :cond_0
    iget-object v0, p0, Ll/᩵֨ۚ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 125
    iget-object v1, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 129
    :goto_0
    iget p1, p0, Ll/᩵֨ۚ;->ۧ:I

    iget-object v0, p0, Ll/᩵֨ۚ;->֫:Ll/ܿ֨ۚ;

    invoke-virtual {v0, p1}, Ll/ۖ֨ۚ;->ۧ(I)V

    .line 130
    iget-object p1, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    invoke-virtual {p1}, Ll/ᩳۚۚ;->֨()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۖ֨ۚ;->֫(I)V

    return-void
.end method

.method public final ֫(Ll/ۖ֨ۚ;)V
    .locals 3

    .line 85
    iget-boolean v0, p0, Ll/᩵֨ۚ;->ܺ:Z

    if-nez v0, :cond_2

    .line 87
    iput-object p1, p0, Ll/᩵֨ۚ;->᩷:Ll/ۖ֨ۚ;

    const/4 v0, 0x1

    .line 88
    iput-boolean v0, p0, Ll/᩵֨ۚ;->ܺ:Z

    .line 89
    iget v1, p0, Ll/᩵֨ۚ;->ᩴ:I

    invoke-virtual {p1, v1}, Ll/ۖ֨ۚ;->ۧ(I)V

    .line 90
    iget-object v1, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    invoke-virtual {v1}, Ll/ᩳۚۚ;->֨()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۖ֨ۚ;->֫(I)V

    const/4 v1, -0x1

    .line 91
    iput v1, p0, Ll/᩵֨ۚ;->ۧ:I

    .line 93
    iget-object v1, p1, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    sget-object v2, Ll/ܺ֨ۚ;->۫:Ll/ܺ֨ۚ;

    if-ne v1, v2, :cond_0

    .line 94
    check-cast p1, Ll/ۢ֨ۚ;

    .line 95
    iget-object p1, p1, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    iput-object p1, p0, Ll/᩵֨ۚ;->ۘ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 96
    iput-object p1, p0, Ll/᩵֨ۚ;->ۖ:Ljava/lang/String;

    return-void

    .line 97
    :cond_0
    sget-object v2, Ll/ܺ֨ۚ;->۬:Ll/ܺ֨ۚ;

    if-ne v1, v2, :cond_1

    .line 98
    check-cast p1, Ll/᩷֨ۚ;

    .line 99
    invoke-virtual {p1}, Ll/ۡ֨ۚ;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 194
    iget-object p1, p1, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "Attributes incorrectly present on end tag [/%s]"

    .line 100
    invoke-virtual {p0, p1, v0}, Ll/᩵֨ۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void

    .line 101
    :cond_2
    new-instance p1, Ll/ܳ֡ۚ;

    const-string v0, "Must be false"

    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 101
    throw p1
.end method

.method public final ֫(Ll/᩵ܶۚ;)V
    .locals 0

    .line 173
    invoke-virtual {p0, p1}, Ll/᩵֨ۚ;->ᩳ(Ll/᩵ܶۚ;)V

    .line 174
    iget-object p1, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    invoke-virtual {p1}, Ll/ᩳۚۚ;->֫()V

    return-void
.end method

.method public final ֫(Ljava/lang/Character;Z)[I
    .locals 8

    .line 180
    iget-object v0, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    invoke-virtual {v0}, Ll/ᩳۚۚ;->ۘ()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto/16 :goto_5

    :cond_0
    if-eqz p1, :cond_1

    .line 182
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {v0}, Ll/ᩳۚۚ;->ܺ()C

    move-result v1

    if-ne p1, v1, :cond_1

    goto/16 :goto_5

    .line 184
    :cond_1
    sget-object p1, Ll/᩵֨ۚ;->ܶ:[C

    invoke-virtual {v0, p1}, Ll/ᩳۚۚ;->ᩳ([C)Z

    move-result p1

    if-eqz p1, :cond_2

    goto/16 :goto_5

    .line 188
    :cond_2
    invoke-virtual {v0}, Ll/ᩳۚۚ;->ᩴ()V

    const-string p1, "#"

    .line 189
    invoke-virtual {v0, p1}, Ll/ᩳۚۚ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    const/4 v1, 0x1

    const-string v3, ";"

    const/4 v4, 0x0

    iget-object v5, p0, Ll/᩵֨ۚ;->ܿ:[I

    if-eqz p1, :cond_b

    const-string p1, "X"

    .line 190
    invoke-virtual {v0, p1}, Ll/ᩳۚۚ;->ܽ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 191
    invoke-virtual {v0}, Ll/ᩳۚۚ;->ܳ()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ll/ᩳۚۚ;->ܿ()Ljava/lang/String;

    move-result-object p2

    .line 192
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_4

    const-string p1, "numeric reference with no numerals"

    new-array p2, v4, [Ljava/lang/Object;

    .line 193
    invoke-direct {p0, p1, p2}, Ll/᩵֨ۚ;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    invoke-virtual {v0}, Ll/ᩳۚۚ;->۠()V

    return-object v2

    .line 198
    :cond_4
    invoke-virtual {v0}, Ll/ᩳۚۚ;->᩸()V

    .line 199
    invoke-virtual {v0, v3}, Ll/ᩳۚۚ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    new-array v0, v1, [Ljava/lang/Object;

    aput-object p2, v0, v4

    const-string v2, "missing semicolon on [&#%s]"

    .line 200
    invoke-direct {p0, v2, v0}, Ll/᩵֨ۚ;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    if-eqz p1, :cond_6

    const/16 p1, 0x10

    goto :goto_1

    :cond_6
    const/16 p1, 0xa

    :goto_1
    const/4 v0, -0x1

    .line 204
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

    .line 213
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-array v0, v1, [Ljava/lang/Object;

    aput-object p2, v0, v4

    const-string p2, "character [%s] is not a valid unicode code point"

    invoke-direct {p0, p2, v0}, Ll/᩵֨ۚ;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    add-int/lit8 p1, p1, -0x80

    .line 214
    sget-object p2, Ll/᩵֨ۚ;->᩸:[I

    aget p1, p2, p1

    .line 219
    :cond_9
    aput p1, v5, v4

    goto :goto_4

    .line 208
    :cond_a
    :goto_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    aput-object p1, p2, v4

    const-string p1, "character [%s] outside of valid range"

    invoke-direct {p0, p1, p2}, Ll/᩵֨ۚ;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    const p1, 0xfffd

    .line 209
    aput p1, v5, v4

    :goto_4
    return-object v5

    .line 224
    :cond_b
    invoke-virtual {v0}, Ll/ᩳۚۚ;->ۜ()Ljava/lang/String;

    move-result-object p1

    const/16 v6, 0x3b

    .line 225
    invoke-virtual {v0, v6}, Ll/ᩳۚۚ;->ۧ(C)Z

    move-result v6

    .line 227
    invoke-static {p1}, Ll/۬֡ۚ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_e

    invoke-static {p1}, Ll/۬֡ۚ;->ۧ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    if-eqz v6, :cond_c

    goto :goto_6

    .line 230
    :cond_c
    invoke-virtual {v0}, Ll/ᩳۚۚ;->۠()V

    if-eqz v6, :cond_d

    new-array p2, v1, [Ljava/lang/Object;

    aput-object p1, p2, v4

    const-string p1, "invalid named reference [%s]"

    .line 232
    invoke-direct {p0, p1, p2}, Ll/᩵֨ۚ;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_d
    :goto_5
    return-object v2

    :cond_e
    :goto_6
    if-eqz p2, :cond_10

    .line 235
    invoke-virtual {v0}, Ll/ᩳۚۚ;->ۚ()Z

    move-result p2

    if-nez p2, :cond_f

    invoke-virtual {v0}, Ll/ᩳۚۚ;->֡()Z

    move-result p2

    if-nez p2, :cond_f

    const/4 p2, 0x3

    new-array p2, p2, [C

    fill-array-data p2, :array_0

    invoke-virtual {v0, p2}, Ll/ᩳۚۚ;->ܽ([C)Z

    move-result p2

    if-eqz p2, :cond_10

    .line 237
    :cond_f
    invoke-virtual {v0}, Ll/ᩳۚۚ;->۠()V

    return-object v2

    .line 241
    :cond_10
    invoke-virtual {v0}, Ll/ᩳۚۚ;->᩸()V

    .line 242
    invoke-virtual {v0, v3}, Ll/ᩳۚۚ;->ۧ(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_11

    new-array p2, v1, [Ljava/lang/Object;

    aput-object p1, p2, v4

    const-string v0, "missing semicolon on [&%s]"

    .line 243
    invoke-direct {p0, v0, p2}, Ll/᩵֨ۚ;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :cond_11
    iget-object p2, p0, Ll/᩵֨ۚ;->᩵:[I

    invoke-static {p1, p2}, Ll/۬֡ۚ;->֫(Ljava/lang/String;[I)I

    move-result v0

    if-ne v0, v1, :cond_12

    .line 246
    aget p1, p2, v4

    aput p1, v5, v4

    return-object v5

    :cond_12
    const/4 v1, 0x2

    if-ne v0, v1, :cond_13

    return-object p2

    :cond_13
    const-string p2, "Unexpected characters returned for "

    .line 251
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 183
    new-instance p2, Ll/ܳ֡ۚ;

    .line 14
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 183
    throw p2

    :array_0
    .array-data 2
        0x3ds
        0x2ds
        0x5fs
    .end array-data
.end method

.method public final ۜ()Ll/ۖ֨ۚ;
    .locals 6

    .line 61
    :goto_0
    iget-boolean v0, p0, Ll/᩵֨ۚ;->ܺ:Z

    if-nez v0, :cond_0

    .line 62
    iget-object v0, p0, Ll/᩵֨ۚ;->֨:Ll/᩵ܶۚ;

    iget-object v1, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    invoke-virtual {v0, p0, v1}, Ll/᩵ܶۚ;->֫(Ll/᩵֨ۚ;Ll/ᩳۚۚ;)V

    goto :goto_0

    .line 67
    :cond_0
    iget-object v0, p0, Ll/᩵֨ۚ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/᩵֨ۚ;->֫:Ll/ܿ֨ۚ;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 70
    invoke-virtual {v3, v1}, Ll/ܿ֨ۚ;->֫(Ljava/lang/String;)V

    .line 71
    iput-object v2, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    return-object v3

    .line 73
    :cond_1
    iget-object v0, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 74
    invoke-virtual {v3, v0}, Ll/ܿ֨ۚ;->֫(Ljava/lang/String;)V

    .line 75
    iput-object v2, p0, Ll/᩵֨ۚ;->ᩳ:Ljava/lang/String;

    return-object v3

    .line 78
    :cond_2
    iput-boolean v4, p0, Ll/᩵֨ۚ;->ܺ:Z

    .line 80
    iget-object v0, p0, Ll/᩵֨ۚ;->᩷:Ll/ۖ֨ۚ;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 302
    iget-object v0, p0, Ll/᩵֨ۚ;->ۖ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 303
    iget-object v0, p0, Ll/᩵֨ۚ;->ۘ:Ljava/lang/String;

    const-string v1, "</"

    .line 0
    invoke-static {v1, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 303
    iput-object v0, p0, Ll/᩵֨ۚ;->ۖ:Ljava/lang/String;

    .line 304
    :cond_0
    iget-object v0, p0, Ll/᩵֨ۚ;->ۖ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ll/᩵ܶۚ;)V
    .locals 4

    .line 313
    iget-object v0, p0, Ll/᩵֨ۚ;->ۡ:Ll/۟ۚۚ;

    invoke-virtual {v0}, Ll/۟ۚۚ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 314
    new-instance v1, Ll/ܰۚۚ;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    iget-object p1, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    const-string v3, "Unexpectedly reached end of file (EOF) in input state [%s]"

    invoke-direct {v1, p1, v3, v2}, Ll/ܰۚۚ;-><init>(Ll/ᩳۚۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 263
    iget-object v0, p0, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {v0}, Ll/ۡ֨ۚ;->᩷()V

    .line 264
    iget-object v0, p0, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {p0, v0}, Ll/᩵֨ۚ;->֫(Ll/ۖ֨ۚ;)V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 289
    iget-object v0, p0, Ll/᩵֨ۚ;->᩻:Ljava/lang/StringBuilder;

    invoke-static {v0}, Ll/ۖ֨ۚ;->֫(Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public final ܽ(Ll/᩵ܶۚ;)V
    .locals 6

    .line 308
    iget-object v0, p0, Ll/᩵֨ۚ;->ۡ:Ll/۟ۚۚ;

    invoke-virtual {v0}, Ll/۟ۚۚ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 309
    new-instance v1, Ll/ܰۚۚ;

    iget-object v2, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    invoke-virtual {v2}, Ll/ᩳۚۚ;->ܺ()C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object p1, v4, v3

    const-string p1, "Unexpected character \'%s\' in input state [%s]"

    invoke-direct {v1, v2, p1, v4}, Ll/ܰۚۚ;-><init>(Ll/ᩳۚۚ;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 285
    iget-object v0, p0, Ll/᩵֨ۚ;->ۜ:Ll/᩻֨ۚ;

    invoke-virtual {p0, v0}, Ll/᩵֨ۚ;->֫(Ll/ۖ֨ۚ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 272
    iget-object v0, p0, Ll/᩵֨ۚ;->ܳ:Ll/ܳ֨ۚ;

    invoke-virtual {p0, v0}, Ll/᩵֨ۚ;->֫(Ll/ۖ֨ۚ;)V

    return-void
.end method

.method public final ᩳ(Ll/᩵ܶۚ;)V
    .locals 3

    .line 160
    sget-object v0, Ll/ᩴ֨ۚ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/᩵֨ۚ;->֡:Ll/ᩳۚۚ;

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 165
    :cond_0
    iget v0, p0, Ll/᩵֨ۚ;->ۧ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 166
    invoke-virtual {v2}, Ll/ᩳۚۚ;->֨()I

    move-result v0

    iput v0, p0, Ll/᩵֨ۚ;->ۧ:I

    goto :goto_0

    .line 162
    :cond_1
    invoke-virtual {v2}, Ll/ᩳۚۚ;->֨()I

    move-result v0

    iput v0, p0, Ll/᩵֨ۚ;->ᩴ:I

    .line 169
    :cond_2
    :goto_0
    iput-object p1, p0, Ll/᩵֨ۚ;->֨:Ll/᩵ܶۚ;

    return-void
.end method

.method public final ᩻()Z
    .locals 2

    .line 293
    iget-object v0, p0, Ll/᩵֨ۚ;->ۘ:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵֨ۚ;->۠:Ll/ۡ֨ۚ;

    invoke-virtual {v0}, Ll/ۡ֨ۚ;->ۡ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩵֨ۚ;->ۘ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
