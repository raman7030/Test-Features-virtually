.class public Ll/᩸᩸ᩳ;
.super Ljava/lang/Object;
.source "S9AL"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public final ᩶:Landroid/text/Editable;

.field public final ᩸:I

.field public final ᩹:Ll/ܶ᩸ᩳ;


# direct methods
.method public constructor <init>(Landroid/text/Editable;)V
    .locals 1

    const/16 v0, 0x2710

    .line 20
    invoke-direct {p0, p1, v0}, Ll/᩸᩸ᩳ;-><init>(Landroid/text/Editable;I)V

    return-void
.end method

.method public constructor <init>(Landroid/text/Editable;I)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ll/ܶ᩸ᩳ;

    invoke-direct {v0}, Ll/ܶ᩸ᩳ;-><init>()V

    iput-object v0, p0, Ll/᩸᩸ᩳ;->᩹:Ll/ܶ᩸ᩳ;

    const/4 v0, -0x1

    .line 16
    iput v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    .line 17
    iput v0, p0, Ll/᩸᩸ᩳ;->ۙ:I

    .line 24
    iput-object p1, p0, Ll/᩸᩸ᩳ;->᩶:Landroid/text/Editable;

    .line 25
    iput p2, p0, Ll/᩸᩸ᩳ;->᩸:I

    return-void
.end method

.method private ۧ(I)I
    .locals 1

    .line 43
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    sub-int/2addr p1, v0

    iget-object v0, p0, Ll/᩸᩸ᩳ;->᩹:Ll/ܶ᩸ᩳ;

    invoke-virtual {v0}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    sub-int/2addr p1, v0

    iget v0, p0, Ll/᩸᩸ᩳ;->ۙ:I

    add-int/2addr p1, v0

    return p1
.end method

.method private ܿ()V
    .locals 2

    const/4 v0, -0x1

    .line 227
    iget v1, p0, Ll/᩸᩸ᩳ;->᩸:I

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Ll/᩸᩸ᩳ;->᩹:Ll/ܶ᩸ᩳ;

    invoke-virtual {v0}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    if-lt v0, v1, :cond_0

    .line 228
    invoke-virtual {p0}, Ll/᩸᩸ᩳ;->ۧ()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 4

    .line 166
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    iget-object v1, p0, Ll/᩸᩸ᩳ;->᩶:Landroid/text/Editable;

    if-ge p1, v0, :cond_0

    .line 167
    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    .line 169
    :cond_0
    iget-object v2, p0, Ll/᩸᩸ᩳ;->᩹:Ll/ܶ᩸ᩳ;

    invoke-virtual {v2}, Ll/ܶ᩸ᩳ;->length()I

    move-result v3

    add-int/2addr v0, v3

    if-ge p1, v0, :cond_1

    .line 170
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    sub-int/2addr p1, v0

    invoke-virtual {v2, p1}, Ll/ܶ᩸ᩳ;->charAt(I)C

    move-result p1

    return p1

    .line 172
    :cond_1
    invoke-direct {p0, p1}, Ll/᩸᩸ᩳ;->ۧ(I)I

    move-result p1

    invoke-interface {v1, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final delete(II)V
    .locals 6

    if-ne p1, p2, :cond_0

    goto/16 :goto_2

    :cond_0
    if-gt p1, p2, :cond_8

    if-ltz p1, :cond_8

    .line 105
    invoke-virtual {p0}, Ll/᩸᩸ᩳ;->length()I

    move-result v0

    if-gt p2, v0, :cond_8

    .line 110
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 111
    iput p1, p0, Ll/᩸᩸ᩳ;->ۗ:I

    .line 112
    iput p2, p0, Ll/᩸᩸ᩳ;->ۙ:I

    return-void

    .line 117
    :cond_1
    iget-object v2, p0, Ll/᩸᩸ᩳ;->᩶:Landroid/text/Editable;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/᩸᩸ᩳ;->᩹:Ll/ܶ᩸ᩳ;

    if-gt p2, v0, :cond_2

    .line 118
    invoke-virtual {v4, v3, p2, v0, v2}, Ll/ܶ᩸ᩳ;->֫(IIILjava/lang/CharSequence;)V

    .line 119
    iput p1, p0, Ll/᩸᩸ᩳ;->ۗ:I

    .line 120
    invoke-direct {p0}, Ll/᩸᩸ᩳ;->ܿ()V

    return-void

    .line 125
    :cond_2
    invoke-virtual {v4}, Ll/ܶ᩸ᩳ;->length()I

    move-result v5

    add-int/2addr v0, v5

    if-lt p1, v0, :cond_3

    .line 126
    invoke-direct {p0, p1}, Ll/᩸᩸ᩳ;->ۧ(I)I

    move-result p1

    .line 127
    invoke-direct {p0, p2}, Ll/᩸᩸ᩳ;->ۧ(I)I

    move-result p2

    .line 128
    iget v0, p0, Ll/᩸᩸ᩳ;->ۙ:I

    .line 303
    invoke-virtual {v4}, Ll/ܶ᩸ᩳ;->length()I

    move-result v1

    invoke-virtual {v4, v1, v0, p1, v2}, Ll/ܶ᩸ᩳ;->֫(IIILjava/lang/CharSequence;)V

    .line 129
    iput p2, p0, Ll/᩸᩸ᩳ;->ۙ:I

    .line 130
    invoke-direct {p0}, Ll/᩸᩸ᩳ;->ܿ()V

    return-void

    .line 136
    :cond_3
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    if-gt p1, v0, :cond_4

    goto :goto_0

    :cond_4
    sub-int v3, p1, v0

    .line 142
    :goto_0
    invoke-virtual {v4}, Ll/ܶ᩸ᩳ;->length()I

    move-result v2

    add-int/2addr v0, v2

    if-lt p2, v0, :cond_5

    .line 143
    invoke-virtual {v4}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    .line 144
    invoke-direct {p0, p2}, Ll/᩸᩸ᩳ;->ۧ(I)I

    move-result p2

    iput p2, p0, Ll/᩸᩸ᩳ;->ۙ:I

    goto :goto_1

    .line 146
    :cond_5
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    sub-int v0, p2, v0

    .line 149
    :goto_1
    iget p2, p0, Ll/᩸᩸ᩳ;->ۗ:I

    if-gt p1, p2, :cond_6

    .line 150
    iput p1, p0, Ll/᩸᩸ᩳ;->ۗ:I

    .line 153
    :cond_6
    invoke-virtual {v4, v3, v0}, Ll/ܶ᩸ᩳ;->delete(II)V

    .line 154
    invoke-virtual {v4}, Ll/ܶ᩸ᩳ;->length()I

    move-result p1

    if-nez p1, :cond_7

    iget p1, p0, Ll/᩸᩸ᩳ;->ۗ:I

    iget p2, p0, Ll/᩸᩸ᩳ;->ۙ:I

    if-ne p1, p2, :cond_7

    .line 155
    iput v1, p0, Ll/᩸᩸ᩳ;->ۙ:I

    iput v1, p0, Ll/᩸᩸ᩳ;->ۗ:I

    :cond_7
    :goto_2
    return-void

    .line 106
    :cond_8
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final length()I
    .locals 2

    .line 161
    iget-object v0, p0, Ll/᩸᩸ᩳ;->᩶:Landroid/text/Editable;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 36
    iget v1, p0, Ll/᩸᩸ᩳ;->ۙ:I

    sub-int/2addr v0, v1

    iget v1, p0, Ll/᩸᩸ᩳ;->ۗ:I

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/᩸᩸ᩳ;->᩹:Ll/ܶ᩸ᩳ;

    invoke-virtual {v1}, Ll/ܶ᩸ᩳ;->length()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 5

    .line 178
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    const/4 v1, -0x1

    iget-object v2, p0, Ll/᩸᩸ᩳ;->᩶:Landroid/text/Editable;

    if-ne v0, v1, :cond_0

    .line 179
    invoke-interface {v2, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :cond_0
    if-gt p2, v0, :cond_1

    .line 182
    invoke-interface {v2, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    .line 184
    :cond_1
    iget-object v1, p0, Ll/᩸᩸ᩳ;->᩹:Ll/ܶ᩸ᩳ;

    invoke-virtual {v1}, Ll/ܶ᩸ᩳ;->length()I

    move-result v3

    add-int/2addr v0, v3

    if-lt p1, v0, :cond_2

    .line 185
    invoke-direct {p0, p1}, Ll/᩸᩸ᩳ;->ۧ(I)I

    move-result p1

    .line 186
    invoke-direct {p0, p2}, Ll/᩸᩸ᩳ;->ۧ(I)I

    move-result p2

    .line 187
    invoke-interface {v2, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    .line 189
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    sub-int v3, p2, p1

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 191
    iget v3, p0, Ll/᩸᩸ᩳ;->ۗ:I

    if-ge p1, v3, :cond_3

    .line 192
    invoke-interface {v2, p1, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    goto :goto_0

    :cond_3
    sub-int/2addr p1, v3

    .line 197
    :goto_0
    iget v3, p0, Ll/᩸᩸ᩳ;->ۗ:I

    invoke-virtual {v1}, Ll/ܶ᩸ᩳ;->length()I

    move-result v4

    add-int/2addr v3, v4

    if-le p2, v3, :cond_4

    .line 198
    invoke-virtual {v1}, Ll/ܶ᩸ᩳ;->length()I

    move-result v3

    goto :goto_1

    .line 200
    :cond_4
    iget v3, p0, Ll/᩸᩸ᩳ;->ۗ:I

    sub-int v3, p2, v3

    .line 202
    :goto_1
    invoke-virtual {v0, v1, p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 203
    iget p1, p0, Ll/᩸᩸ᩳ;->ۗ:I

    invoke-virtual {v1}, Ll/ܶ᩸ᩳ;->length()I

    move-result v1

    add-int/2addr p1, v1

    if-le p2, p1, :cond_5

    .line 204
    iget p1, p0, Ll/᩸᩸ᩳ;->ۙ:I

    invoke-direct {p0, p2}, Ll/᩸᩸ᩳ;->ۧ(I)I

    move-result p2

    invoke-interface {v2, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    :cond_5
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 235
    invoke-virtual {p0}, Ll/᩸᩸ᩳ;->ۧ()V

    .line 236
    iget-object v0, p0, Ll/᩸᩸ᩳ;->᩶:Landroid/text/Editable;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(IIILjava/lang/CharSequence;)V
    .locals 4

    if-ne p2, p3, :cond_0

    return-void

    :cond_0
    if-gt p2, p3, :cond_5

    if-ltz p2, :cond_5

    .line 63
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p3, v0, :cond_5

    if-ltz p1, :cond_4

    .line 66
    invoke-virtual {p0}, Ll/᩸᩸ᩳ;->length()I

    move-result v0

    if-gt p1, v0, :cond_4

    .line 71
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    const/4 v1, -0x1

    iget-object v2, p0, Ll/᩸᩸ᩳ;->᩹:Ll/ܶ᩸ᩳ;

    if-ne v0, v1, :cond_1

    .line 72
    iput p1, p0, Ll/᩸᩸ᩳ;->ۙ:I

    iput p1, p0, Ll/᩸᩸ᩳ;->ۗ:I

    .line 303
    invoke-virtual {v2}, Ll/ܶ᩸ᩳ;->length()I

    move-result p1

    invoke-virtual {v2, p1, p2, p3, p4}, Ll/ܶ᩸ᩳ;->֫(IIILjava/lang/CharSequence;)V

    return-void

    .line 78
    :cond_1
    iget-object v1, p0, Ll/᩸᩸ᩳ;->᩶:Landroid/text/Editable;

    if-ge p1, v0, :cond_2

    const/4 v0, 0x0

    .line 79
    invoke-virtual {v2, v0, p2, p3, p4}, Ll/ܶ᩸ᩳ;->֫(IIILjava/lang/CharSequence;)V

    sub-int/2addr p3, p2

    .line 80
    iget p2, p0, Ll/᩸᩸ᩳ;->ۗ:I

    invoke-virtual {v2, p3, p1, p2, v1}, Ll/ܶ᩸ᩳ;->֫(IIILjava/lang/CharSequence;)V

    .line 81
    iput p1, p0, Ll/᩸᩸ᩳ;->ۗ:I

    .line 82
    invoke-direct {p0}, Ll/᩸᩸ᩳ;->ܿ()V

    return-void

    .line 87
    :cond_2
    invoke-virtual {v2}, Ll/ܶ᩸ᩳ;->length()I

    move-result v3

    add-int/2addr v0, v3

    if-ge p1, v0, :cond_3

    .line 88
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    sub-int/2addr p1, v0

    invoke-virtual {v2, p1, p2, p3, p4}, Ll/ܶ᩸ᩳ;->֫(IIILjava/lang/CharSequence;)V

    .line 89
    invoke-direct {p0}, Ll/᩸᩸ᩳ;->ܿ()V

    return-void

    .line 94
    :cond_3
    invoke-direct {p0, p1}, Ll/᩸᩸ᩳ;->ۧ(I)I

    move-result p1

    .line 95
    iget v0, p0, Ll/᩸᩸ᩳ;->ۙ:I

    .line 303
    invoke-virtual {v2}, Ll/ܶ᩸ᩳ;->length()I

    move-result v3

    invoke-virtual {v2, v3, v0, p1, v1}, Ll/ܶ᩸ᩳ;->֫(IIILjava/lang/CharSequence;)V

    invoke-virtual {v2}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    invoke-virtual {v2, v0, p2, p3, p4}, Ll/ܶ᩸ᩳ;->֫(IIILjava/lang/CharSequence;)V

    .line 97
    iput p1, p0, Ll/᩸᩸ᩳ;->ۙ:I

    .line 98
    invoke-direct {p0}, Ll/᩸᩸ᩳ;->ܿ()V

    return-void

    .line 67
    :cond_4
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 64
    :cond_5
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ۧ()V
    .locals 6

    .line 218
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 219
    invoke-virtual {p0}, Ll/᩸᩸ᩳ;->֫()V

    .line 220
    iget v0, p0, Ll/᩸᩸ᩳ;->ۗ:I

    iget v2, p0, Ll/᩸᩸ᩳ;->ۙ:I

    iget-object v3, p0, Ll/᩸᩸ᩳ;->᩹:Ll/ܶ᩸ᩳ;

    invoke-virtual {v3}, Ll/ܶ᩸ᩳ;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Ll/᩸᩸ᩳ;->᩶:Landroid/text/Editable;

    invoke-interface {v5, v0, v2, v4}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 221
    invoke-virtual {v3}, Ll/ܶ᩸ᩳ;->clear()V

    .line 222
    iput v1, p0, Ll/᩸᩸ᩳ;->ۙ:I

    iput v1, p0, Ll/᩸᩸ᩳ;->ۗ:I

    :cond_0
    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 210
    iget-object v0, p0, Ll/᩸᩸ᩳ;->᩹:Ll/ܶ᩸ᩳ;

    invoke-virtual {v0}, Ll/ܶ᩸ᩳ;->length()I

    move-result v0

    return v0
.end method
