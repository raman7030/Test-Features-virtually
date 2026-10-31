.class public abstract Ll/۫۫ۢ;
.super Ll/᩻ܳ֡;
.source "Z6PP"


# static fields
.field public static final ۙ:Ljava/util/Set;


# instance fields
.field public final ֡:Ljava/util/HashMap;

.field public ֨:Z

.field public final ۚ:Ll/ۗ۫ۢ;

.field public ۠:Z

.field public final ܶ:Ll/᩻ۤۢ;

.field public ᩵:Ljava/lang/String;

.field public ᩶:Z

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/16 v0, 0xa

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "script"

    aput-object v3, v1, v2

    const-string v3, "style"

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const-string v3, "title"

    const/4 v4, 0x2

    aput-object v3, v1, v4

    const-string v3, "textarea"

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const-string v3, "xmp"

    const/4 v4, 0x4

    aput-object v3, v1, v4

    const-string v3, "iframe"

    const/4 v4, 0x5

    aput-object v3, v1, v4

    const-string v3, "noembed"

    const/4 v4, 0x6

    aput-object v3, v1, v4

    const-string v3, "noframes"

    const/4 v4, 0x7

    aput-object v3, v1, v4

    const-string v3, "noscript"

    const/16 v4, 0x8

    aput-object v3, v1, v4

    const-string v3, "plaintext"

    const/16 v4, 0x9

    aput-object v3, v1, v4

    .line 0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, v1, v2

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "duplicate element: "

    invoke-static {v4, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 16
    sput-object v0, Ll/۫۫ۢ;->ۙ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ll/᩷ۤۢ;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1}, Ll/᩻ܳ֡;-><init>(Ll/᩺ܿ֡;)V

    .line 21
    new-instance v0, Ll/ۗ۫ۢ;

    invoke-direct {v0}, Ll/ۗ۫ۢ;-><init>()V

    iput-object v0, p0, Ll/۫۫ۢ;->ۚ:Ll/ۗ۫ۢ;

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۫۫ۢ;->֡:Ljava/util/HashMap;

    .line 30
    invoke-virtual {p1}, Ll/᩷ۤۢ;->ܽ()Ljava/lang/CharSequence;

    move-result-object p1

    instance-of v0, p1, Ll/᩻ۤۢ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩻ۤۢ;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Ll/۫۫ۢ;->ܶ:Ll/᩻ۤۢ;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    .line 173
    invoke-static {p1, p0, v0}, Ll/۫۫ۢ;->ۧ(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 233
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 234
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x41

    if-lt v2, v3, :cond_0

    const/16 v3, 0x5a

    if-gt v2, v3, :cond_0

    add-int/lit8 v2, v2, 0x20

    int-to-char v2, v2

    .line 235
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 237
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(C)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xc

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/CharSequence;I)Z
    .locals 5

    .line 217
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p2

    .line 218
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x0

    .line 219
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_3

    add-int v3, p2, v1

    .line 220
    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x41

    if-lt v3, v4, :cond_1

    const/16 v4, 0x5a

    if-gt v3, v4, :cond_1

    add-int/lit8 v3, v3, 0x20

    int-to-char v3, v3

    .line 222
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 224
    :cond_3
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    const/16 p1, 0x3e

    if-eq p0, p1, :cond_5

    const/16 p1, 0x2f

    if-eq p0, p1, :cond_5

    .line 225
    invoke-static {p0}, Ll/۫۫ۢ;->֫(C)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_4
    return v2

    :cond_5
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/CharSequence;I)I
    .locals 8

    const-string v0, "script"

    .line 177
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "</"

    .line 180
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 181
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge p2, v4, :cond_8

    and-int/lit16 v4, p2, 0x3ff

    if-nez v4, :cond_0

    .line 182
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    :cond_0
    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eqz v0, :cond_6

    if-nez v2, :cond_1

    const-string v6, "<!--"

    const/4 v7, 0x4

    .line 26
    invoke-static {p1, v1, p2, v6, v7}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_1

    add-int/lit8 p2, p2, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x2

    goto :goto_3

    :cond_1
    if-eqz v2, :cond_4

    .line 191
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    const/16 v7, 0x2d

    if-ne v6, v7, :cond_2

    add-int/lit8 v3, v3, 0x1

    .line 192
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    goto :goto_1

    :cond_2
    const/16 v7, 0x3e

    if-ne v6, v7, :cond_3

    if-ne v3, v5, :cond_3

    const/4 v2, 0x0

    :cond_3
    const/4 v3, 0x0

    :cond_4
    :goto_1
    if-ne v2, v4, :cond_5

    const-string v6, "<script"

    .line 198
    invoke-static {v6, p1, p2}, Ll/۫۫ۢ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v6

    if-eqz v6, :cond_5

    add-int/lit8 p2, p2, 0x6

    const/4 v2, 0x2

    goto :goto_2

    :cond_5
    if-ne v2, v5, :cond_6

    const-string v6, "</script"

    .line 204
    invoke-static {v6, p1, p2}, Ll/۫۫ۢ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v6

    if-eqz v6, :cond_6

    add-int/lit8 p2, p2, 0x7

    const/4 v2, 0x1

    :goto_2
    const/4 v3, 0x0

    goto :goto_3

    :cond_6
    if-eq v2, v5, :cond_7

    .line 211
    invoke-static {p0, p1, p2}, Ll/۫۫ۢ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)Z

    move-result v5

    if-eqz v5, :cond_7

    return p2

    :cond_7
    :goto_3
    add-int/2addr p2, v4

    goto :goto_0

    .line 213
    :cond_8
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final nextToken()Ll/֡ܳ֡;
    .locals 12

    .line 43
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 44
    iget-boolean v0, p0, Ll/۫۫ۢ;->᩶:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩻ܳ֡;->ۡ()Ll/֡ܳ֡;

    move-result-object v0

    return-object v0

    .line 45
    :cond_0
    iget-object v0, p0, Ll/۫۫ۢ;->᩸:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    invoke-interface {v0, v3}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_3

    .line 46
    invoke-interface {v0}, Ll/ܳܳ֡;->index()I

    move-result v10

    .line 47
    move-object v4, v0

    check-cast v4, Ll/᩷ۤۢ;

    invoke-virtual {v4}, Ll/᩷ۤۢ;->ܽ()Ljava/lang/CharSequence;

    move-result-object v4

    .line 48
    iget-object v5, p0, Ll/۫۫ۢ;->᩸:Ljava/lang/String;

    const-string v6, "plaintext"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    goto :goto_0

    :cond_1
    iget-object v5, p0, Ll/۫۫ۢ;->᩸:Ljava/lang/String;

    invoke-static {v5, v4, v10}, Ll/۫۫ۢ;->ۧ(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v4

    :goto_0
    sub-int/2addr v4, v10

    .line 50
    iput-object v2, p0, Ll/۫۫ۢ;->᩸:Ljava/lang/String;

    if-lez v4, :cond_3

    .line 52
    new-instance v2, Ll/ܰܿ֡;

    add-int v3, v10, v4

    add-int/lit8 v11, v3, -0x1

    iget-object v7, p0, Ll/᩻ܳ֡;->ۡ:Ll/᩷᩷֡;

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v11}, Ll/ܰܿ֡;-><init>(Ll/᩷᩷֡;IIII)V

    .line 54
    invoke-virtual {p0}, Ll/᩻ܳ֡;->getLine()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ܰܿ֡;->ܽ(I)V

    .line 55
    invoke-virtual {p0}, Ll/᩻ܳ֡;->֫()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ܰܿ֡;->ۧ(I)V

    :goto_1
    if-ge v1, v4, :cond_2

    .line 56
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ܿ()Ll/ۨܳ֡;

    move-result-object v3

    check-cast v3, Ll/ۘ᩻֡;

    invoke-virtual {v3, v0}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-object v2

    .line 60
    :cond_3
    invoke-super {p0}, Ll/᩻ܳ֡;->nextToken()Ll/֡ܳ֡;

    move-result-object v0

    const/16 v4, 0xe

    .line 61
    iget-object v5, p0, Ll/۫۫ۢ;->ܶ:Ll/᩻ۤۢ;

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v6

    if-ne v6, v4, :cond_4

    iget-object v6, p0, Ll/۫۫ۢ;->᩹:Ljava/lang/String;

    if-nez v6, :cond_4

    .line 62
    invoke-interface {v0}, Ll/֡ܳ֡;->ᩳ()I

    move-result v6

    invoke-interface {v0}, Ll/֡ܳ֡;->ܿ()I

    move-result v7

    add-int/2addr v7, v3

    invoke-virtual {v5, v6, v7}, Ll/᩻ۤۢ;->֫(II)Z

    move-result v6

    if-nez v6, :cond_a

    .line 103
    :cond_4
    iget-object v6, p0, Ll/۫۫ۢ;->ۚ:Ll/ۗ۫ۢ;

    const/16 v7, 0x13

    if-eqz v5, :cond_b

    iget-boolean v8, p0, Ll/۫۫ۢ;->֨:Z

    if-nez v8, :cond_b

    .line 104
    invoke-interface {v0}, Ll/֡ܳ֡;->ᩳ()I

    move-result v8

    invoke-interface {v0}, Ll/֡ܳ֡;->ܿ()I

    move-result v9

    add-int/2addr v9, v3

    invoke-virtual {v5, v8, v9}, Ll/᩻ۤۢ;->֫(II)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_5

    .line 105
    :cond_5
    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v5

    if-ne v5, v7, :cond_7

    iget-object v5, p0, Ll/۫۫ۢ;->᩵:Ljava/lang/String;

    if-nez v5, :cond_6

    goto :goto_2

    :cond_6
    const/4 v5, 0x0

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v5, 0x1

    :goto_3
    const-string v8, "annotation-xml"

    .line 106
    iget-object v9, p0, Ll/۫۫ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    if-nez v5, :cond_a

    iget-object v5, p0, Ll/۫۫ۢ;->᩵:Ljava/lang/String;

    const-string v8, "encoding"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_4

    :cond_8
    const-string v8, "font"

    .line 107
    iget-object v9, p0, Ll/۫۫ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    if-nez v5, :cond_9

    goto :goto_5

    .line 108
    :cond_9
    invoke-virtual {v6}, Ll/ۗ۫ۢ;->֫()Ll/ۙ۫ۢ;

    move-result-object v5

    if-eqz v5, :cond_b

    .line 111
    iget v8, v5, Ll/ۙ۫ۢ;->ܿ:I

    if-eqz v8, :cond_b

    iget-boolean v8, v5, Ll/ۙ۫ۢ;->ۧ:Z

    if-nez v8, :cond_b

    iget-boolean v5, v5, Ll/ۙ۫ۢ;->ܽ:Z

    if-nez v5, :cond_b

    .line 65
    :cond_a
    :goto_4
    iput-boolean v3, p0, Ll/۫۫ۢ;->᩶:Z

    .line 66
    invoke-virtual {p0}, Ll/᩻ܳ֡;->ۡ()Ll/֡ܳ֡;

    move-result-object v0

    return-object v0

    .line 68
    :cond_b
    :goto_5
    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v5

    const/4 v8, 0x6

    iget-object v9, p0, Ll/۫۫ۢ;->֡:Ljava/util/HashMap;

    if-eq v5, v8, :cond_17

    const/4 v10, 0x7

    if-eq v5, v10, :cond_17

    const/16 v8, 0xa

    if-eq v5, v8, :cond_12

    const/16 v10, 0xb

    if-eq v5, v10, :cond_12

    if-eq v5, v4, :cond_f

    if-eq v5, v7, :cond_c

    const/16 v1, 0x14

    if-eq v5, v1, :cond_c

    goto :goto_6

    .line 84
    :cond_c
    iget-object v1, p0, Ll/۫۫ۢ;->᩵:Ljava/lang/String;

    if-eqz v1, :cond_e

    iget-boolean v1, p0, Ll/۫۫ۢ;->۠:Z

    if-eqz v1, :cond_e

    .line 85
    invoke-interface {v0}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v1

    .line 86
    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v4

    if-ne v4, v7, :cond_d

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x2

    if-lt v4, v5, :cond_d

    .line 0
    invoke-static {v3, v3, v1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 89
    :cond_d
    iget-object v3, p0, Ll/۫۫ۢ;->᩵:Ljava/lang/String;

    invoke-virtual {v9, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    :cond_e
    iput-object v2, p0, Ll/۫۫ۢ;->᩵:Ljava/lang/String;

    return-object v0

    .line 76
    :cond_f
    iget-object v1, p0, Ll/۫۫ۢ;->᩹:Ljava/lang/String;

    if-nez v1, :cond_10

    invoke-interface {v0}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۫۫ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/۫۫ۢ;->᩹:Ljava/lang/String;

    return-object v0

    .line 78
    :cond_10
    invoke-interface {v0}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۫۫ۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/۫۫ۢ;->᩵:Ljava/lang/String;

    .line 79
    invoke-virtual {v9, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v2, v1, 0x1

    iput-boolean v2, p0, Ll/۫۫ۢ;->۠:Z

    if-nez v1, :cond_11

    .line 80
    iget-object v1, p0, Ll/۫۫ۢ;->᩵:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v9, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    :goto_6
    return-object v0

    .line 94
    :cond_12
    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v3

    if-ne v3, v8, :cond_13

    const/4 v1, 0x1

    .line 116
    :cond_13
    iget-object v3, p0, Ll/۫۫ۢ;->᩹:Ljava/lang/String;

    if-nez v3, :cond_14

    goto :goto_7

    .line 117
    :cond_14
    iget-boolean v4, p0, Ll/۫۫ۢ;->֨:Z

    if-eqz v4, :cond_15

    invoke-virtual {v6, v3}, Ll/ۗ۫ۢ;->֫(Ljava/lang/String;)Ll/ۙ۫ۢ;

    goto :goto_7

    .line 119
    :cond_15
    invoke-virtual {v6, v3, v9, v1, v2}, Ll/ۗ۫ۢ;->֫(Ljava/lang/String;Ljava/util/Map;ZLjava/lang/Object;)Ll/ۙ۫ۢ;

    move-result-object v1

    .line 120
    iget v1, v1, Ll/ۙ۫ۢ;->ܿ:I

    if-nez v1, :cond_16

    sget-object v1, Ll/۫۫ۢ;->ۙ:Ljava/util/Set;

    iget-object v3, p0, Ll/۫۫ۢ;->᩹:Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    iget-object v1, p0, Ll/۫۫ۢ;->᩹:Ljava/lang/String;

    iput-object v1, p0, Ll/۫۫ۢ;->᩸:Ljava/lang/String;

    .line 95
    :cond_16
    :goto_7
    iput-object v2, p0, Ll/۫۫ۢ;->᩹:Ljava/lang/String;

    return-object v0

    .line 70
    :cond_17
    iput-object v2, p0, Ll/۫۫ۢ;->᩹:Ljava/lang/String;

    .line 71
    invoke-interface {v0}, Ll/֡ܳ֡;->getType()I

    move-result v3

    if-ne v3, v8, :cond_18

    const/4 v1, 0x1

    :cond_18
    iput-boolean v1, p0, Ll/۫۫ۢ;->֨:Z

    .line 72
    invoke-virtual {v9}, Ljava/util/HashMap;->clear()V

    .line 73
    iput-object v2, p0, Ll/۫۫ۢ;->᩵:Ljava/lang/String;

    return-object v0
.end method

.method public final ۘ()V
    .locals 8

    .line 143
    iget-object v0, p0, Ll/۫۫ۢ;->ۚ:Ll/ۗ۫ۢ;

    invoke-virtual {v0}, Ll/ۗ۫ۢ;->֫()Ll/ۙ۫ۢ;

    move-result-object v0

    const/16 v1, 0x3e

    const/4 v2, -0x1

    const/4 v3, 0x2

    const/4 v4, 0x1

    .line 144
    iget-object v5, p0, Ll/᩻ܳ֡;->᩻:Ll/᩺ܿ֡;

    if-eqz v0, :cond_3

    iget v0, v0, Ll/ۙ۫ۢ;->ܿ:I

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 150
    :goto_0
    invoke-interface {v5, v4}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v6

    if-eq v6, v2, :cond_2

    .line 151
    invoke-interface {v5, v4}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v6

    .line 152
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ܿ()Ll/ۨܳ֡;

    move-result-object v7

    check-cast v7, Ll/ۘ᩻֡;

    invoke-virtual {v7, v5}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;)V

    if-ne v6, v1, :cond_1

    if-lt v0, v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 v7, 0x5d

    if-ne v6, v7, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 154
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_0

    :cond_2
    :goto_1
    return-void

    .line 164
    :cond_3
    :goto_2
    invoke-interface {v5, v4}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    if-eq v0, v2, :cond_4

    .line 165
    invoke-interface {v5, v4}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    .line 166
    invoke-virtual {p0}, Ll/ᩴܳ֡;->ܿ()Ll/ۨܳ֡;

    move-result-object v6

    check-cast v6, Ll/ۘ᩻֡;

    invoke-virtual {v6, v5}, Ll/ۘ᩻֡;->֫(Ll/᩺ܿ֡;)V

    if-ne v0, v1, :cond_3

    .line 308
    :cond_4
    iput v3, p0, Ll/᩻ܳ֡;->ᩴ:I

    return-void
.end method

.method public final ᩴ()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Ll/۫۫ۢ;->᩶:Z

    return v0
.end method
