.class public final Ll/ۤۛ֡;
.super Ll/ܺ۬֡;
.source "74H5"

# interfaces
.implements Ll/ۘ֫ۚ;


# instance fields
.field public ۗ:I

.field public final ۙ:Ll/۬ۛ֡;

.field public final ۤ:Ll/ۤܽۚ;

.field public final ۫:I

.field public final ۬:I

.field public final ᩶:Ll/۠ۛ֡;

.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;Ll/۠ۛ֡;ILl/ܰܰ֡;I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput-object p1, p0, Ll/ۤۛ֡;->ۙ:Ll/۬ۛ֡;

    .line 108
    iput-object p3, p0, Ll/ۤۛ֡;->᩶:Ll/۠ۛ֡;

    .line 112
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ۢ()I

    move-result p1

    add-int/2addr p1, p4

    .line 114
    iput p1, p0, Ll/ۤۛ֡;->۬:I

    .line 115
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ܺ()I

    move-result p2

    iput p2, p0, Ll/ۤۛ֡;->᩸:I

    .line 117
    invoke-interface {p5, p1}, Ll/ܰܰ֡;->seekTo(I)I

    move-result p1

    iput p1, p0, Ll/ۤۛ֡;->᩹:I

    const/4 p1, 0x0

    .line 119
    iput-object p1, p0, Ll/ۤۛ֡;->ۤ:Ll/ۤܽۚ;

    .line 120
    iput p6, p0, Ll/ۤۛ֡;->۫:I

    return-void
.end method

.method public constructor <init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;Ll/۠ۛ֡;ILl/ܺ۟֡;Ll/ܰܰ֡;I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Ll/ۤۛ֡;->ۙ:Ll/۬ۛ֡;

    .line 86
    iput-object p3, p0, Ll/ۤۛ֡;->᩶:Ll/۠ۛ֡;

    .line 90
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ۢ()I

    move-result p1

    add-int/2addr p1, p4

    .line 92
    iput p1, p0, Ll/ۤۛ֡;->۬:I

    .line 93
    invoke-virtual {p2}, Ll/ᩴۨ֡;->ܺ()I

    move-result p2

    iput p2, p0, Ll/ۤۛ֡;->᩸:I

    .line 95
    invoke-interface {p6, p1}, Ll/ܰܰ֡;->seekTo(I)I

    move-result p1

    iput p1, p0, Ll/ۤۛ֡;->᩹:I

    .line 96
    invoke-virtual {p5}, Ll/ܺ۟֡;->ܽ()I

    .line 97
    invoke-virtual {p5}, Ll/ܺ۟֡;->ۧ()Ll/ۤܽۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۤۛ֡;->ۤ:Ll/ۤܽۚ;

    .line 98
    iput p7, p0, Ll/ۤۛ֡;->۫:I

    return-void
.end method

.method private ֡()I
    .locals 2

    .line 190
    iget v0, p0, Ll/ۤۛ֡;->ۗ:I

    if-nez v0, :cond_0

    .line 191
    iget-object v0, p0, Ll/ۤۛ֡;->ۙ:Ll/۬ۛ֡;

    iget v1, p0, Ll/ۤۛ֡;->۬:I

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۧ(I)I

    move-result v0

    iput v0, p0, Ll/ۤۛ֡;->ۗ:I

    .line 193
    :cond_0
    iget v0, p0, Ll/ۤۛ֡;->ۗ:I

    return v0
.end method


# virtual methods
.method public final getAnnotations()Ljava/util/Set;
    .locals 2

    .line 176
    iget-object v0, p0, Ll/ۤۛ֡;->ۙ:Ll/۬ۛ֡;

    iget v1, p0, Ll/ۤۛ֡;->᩹:I

    invoke-static {v0, v1}, Ll/ۧ۟֡;->֫(Ll/۬ۛ֡;I)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 3

    .line 139
    iget-object v0, p0, Ll/ۤۛ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-direct {p0}, Ll/ۤۛ֡;->֡()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->᩷(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 3

    .line 153
    iget-object v0, p0, Ll/ۤۛ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-direct {p0}, Ll/ۤۛ֡;->֡()I

    move-result v2

    add-int/lit8 v2, v2, 0x2

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/io/Writer;)V
    .locals 3

    .line 146
    iget-object v0, p0, Ll/ۤۛ֡;->ۙ:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    invoke-direct {p0}, Ll/ۤۛ֡;->֡()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    const/4 v2, 0x0

    .line 147
    invoke-virtual {v0, v1, p1, v2}, Ll/۬ۛ֡;->֫(ILjava/io/Writer;Z)V

    return-void
.end method

.method public final ֫(Ll/ۤۛ֡;Z)Z
    .locals 4

    .line 232
    invoke-virtual {p0}, Ll/ۤۛ֡;->getType()Ljava/lang/String;

    move-result-object v0

    .line 159
    iget-object v1, p0, Ll/ۤۛ֡;->᩶:Ll/۠ۛ֡;

    invoke-virtual {v1}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Ll/ۤۛ֡;->᩶:Ll/۠ۛ֡;

    invoke-virtual {v2}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v2

    .line 233
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 234
    invoke-virtual {p0}, Ll/ۤۛ֡;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۤۛ֡;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 235
    invoke-virtual {p1}, Ll/ۤۛ֡;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 164
    iget v1, p1, Ll/ۤۛ֡;->᩸:I

    .line 240
    iget v2, p0, Ll/ۤۛ֡;->᩸:I

    if-eq v2, v1, :cond_0

    goto/16 :goto_1

    .line 244
    :cond_0
    iget v1, p0, Ll/ۤۛ֡;->᩹:I

    if-nez v1, :cond_1

    iget v1, p1, Ll/ۤۛ֡;->᩹:I

    if-eqz v1, :cond_2

    .line 245
    :cond_1
    invoke-virtual {p0}, Ll/ۤۛ֡;->getAnnotations()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۤۛ֡;->getAnnotations()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ۗ᩻ۚ;->֫(Ljava/util/Set;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 249
    :cond_2
    iget v1, p0, Ll/ۤۛ֡;->۫:I

    const/4 v3, 0x7

    if-ne v1, v3, :cond_3

    iget v1, p1, Ll/ۤۛ֡;->۫:I

    if-eq v1, v3, :cond_4

    .line 251
    :cond_3
    invoke-virtual {p0}, Ll/ۤۛ֡;->᩵()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۤۛ֡;->᩵()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ۗ᩻ۚ;->֫(Ljava/util/Set;Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    .line 170
    :cond_4
    iget-object p1, p1, Ll/ۤۛ֡;->ۤ:Ll/ۤܽۚ;

    .line 257
    iget-object v1, p0, Ll/ۤۛ֡;->ۤ:Ll/ۤܽۚ;

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_0

    :cond_5
    if-nez v1, :cond_6

    .line 261
    invoke-static {v0}, Ll/᩻ܿۚ;->֫(Ljava/lang/String;)Ll/ܿܿۚ;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    if-nez p1, :cond_7

    .line 263
    invoke-static {v0}, Ll/᩻ܿۚ;->֫(Ljava/lang/String;)Ll/ܿܿۚ;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_7
    if-eqz p2, :cond_8

    .line 266
    sget-object p2, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {p2, v2}, Ll/ܺۗ֡;->֫(I)Z

    move-result p2

    if-eqz p2, :cond_8

    instance-of p2, v1, Ll/ܰܽۚ;

    if-eqz p2, :cond_8

    .line 267
    check-cast v1, Ll/ܰܽۚ;

    invoke-interface {v1}, Ll/ܰܽۚ;->getValue()I

    move-result p2

    ushr-int/lit8 p2, p2, 0x18

    const/16 v0, 0x7f

    if-ne p2, v0, :cond_8

    instance-of p2, p1, Ll/ܰܽۚ;

    if-eqz p2, :cond_8

    .line 268
    check-cast p1, Ll/ܰܽۚ;

    invoke-interface {p1}, Ll/ܰܽۚ;->getValue()I

    move-result p1

    ushr-int/lit8 p1, p1, 0x18

    if-ne p1, v0, :cond_8

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_8
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۚ֫()Ll/ۤܽۚ;
    .locals 1

    .line 170
    iget-object v0, p0, Ll/ۤۛ֡;->ۤ:Ll/ۤܽۚ;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ۤۛ֡;->᩶:Ll/۠ۛ֡;

    invoke-virtual {v0}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 164
    iget v0, p0, Ll/ۤۛ֡;->᩸:I

    return v0
.end method

.method public final ᩵()Ljava/util/Set;
    .locals 2

    const/4 v0, 0x7

    .line 182
    iget v1, p0, Ll/ۤۛ֡;->۫:I

    if-ne v1, v0, :cond_0

    .line 183
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object v0

    return-object v0

    .line 185
    :cond_0
    invoke-static {v1}, Ll/ᩴۗ֡;->ᩳ(I)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method
