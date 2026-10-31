.class public final Ll/ܰ᩸ᩳ;
.super Ljava/lang/Object;
.source "06R7"

# interfaces
.implements Ljava/lang/CharSequence;
.implements Landroid/text/GetChars;


# instance fields
.field public final synthetic ۗ:Ll/۟᩸ᩳ;

.field public ۙ:I

.field public ۬:Ll/᩺᩹ᩳ;

.field public ᩶:I

.field public ᩸:[C

.field public ᩹:Ll/᩷᩹ᩳ;


# direct methods
.method public constructor <init>(Ll/۟᩸ᩳ;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩸ᩳ;->ۗ:Ll/۟᩸ᩳ;

    return-void
.end method

.method public static ֫(Ll/ܰ᩸ᩳ;)V
    .locals 3

    const/4 v0, 0x0

    .line 146
    iput v0, p0, Ll/ܰ᩸ᩳ;->᩶:I

    iput v0, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    const/4 v0, 0x0

    .line 147
    iput-object v0, p0, Ll/ܰ᩸ᩳ;->᩸:[C

    .line 149
    :try_start_0
    iget-object v1, p0, Ll/ܰ᩸ᩳ;->᩹:Ll/᩷᩹ᩳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/᩷᩹ᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    :cond_0
    iput-object v0, p0, Ll/ܰ᩸ᩳ;->᩹:Ll/᩷᩹ᩳ;

    .line 152
    iget-object v1, p0, Ll/ܰ᩸ᩳ;->۬:Ll/᩺᩹ᩳ;

    if-eqz v1, :cond_1

    .line 153
    invoke-virtual {v1}, Ll/᩺᩹ᩳ;->close()V

    .line 154
    iput-object v0, p0, Ll/ܰ᩸ᩳ;->۬:Ll/᩺᩹ᩳ;

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 151
    iput-object v0, p0, Ll/ܰ᩸ᩳ;->᩹:Ll/᩷᩹ᩳ;

    .line 152
    iget-object v2, p0, Ll/ܰ᩸ᩳ;->۬:Ll/᩺᩹ᩳ;

    if-eqz v2, :cond_2

    .line 153
    invoke-virtual {v2}, Ll/᩺᩹ᩳ;->close()V

    .line 154
    iput-object v0, p0, Ll/ܰ᩸ᩳ;->۬:Ll/᩺᩹ᩳ;

    .line 156
    :cond_2
    throw v1
.end method

.method private ܽ(I)V
    .locals 7

    .line 92
    iget-object v0, p0, Ll/ܰ᩸ᩳ;->ۗ:Ll/۟᩸ᩳ;

    invoke-static {v0}, Ll/۟᩸ᩳ;->ܿ(Ll/۟᩸ᩳ;)V

    if-ltz p1, :cond_8

    .line 93
    invoke-static {v0}, Ll/۟᩸ᩳ;->ۧ(Ll/۟᩸ᩳ;)I

    move-result v1

    if-ge p1, v1, :cond_8

    .line 94
    invoke-static {v0}, Ll/۟᩸ᩳ;->ᩳ(Ll/۟᩸ᩳ;)V

    .line 95
    iget v1, p0, Ll/ܰ᩸ᩳ;->᩶:I

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    iget v3, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    sub-int/2addr v1, v3

    const/16 v3, 0x200

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 96
    iget p1, p0, Ll/ܰ᩸ᩳ;->᩶:I

    sub-int/2addr p1, v1

    goto :goto_1

    :cond_1
    iget v3, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    if-ge p1, v3, :cond_2

    add-int/lit16 p1, p1, -0x200

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 97
    iget-object v3, p0, Ll/ܰ᩸ᩳ;->᩸:[C

    iget v4, p0, Ll/ܰ᩸ᩳ;->᩶:I

    iget v5, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    sub-int/2addr v4, v5

    sub-int/2addr v4, v1

    invoke-static {v3, v4, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 99
    :cond_3
    iput v2, p0, Ll/ܰ᩸ᩳ;->᩶:I

    iput v2, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    .line 100
    iget-object v2, p0, Ll/ܰ᩸ᩳ;->۬:Ll/᩺᩹ᩳ;

    const/16 v3, 0x800

    if-nez v2, :cond_4

    .line 101
    new-instance v2, Ll/᩺᩹ᩳ;

    invoke-static {v0}, Ll/۟᩸ᩳ;->ܽ(Ll/۟᩸ᩳ;)Ll/۫᩹ᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۬᩹ᩳ;->ܳ()Ll/ۨ᩹ᩳ;

    move-result-object v4

    iget-object v4, v4, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    invoke-direct {v2, v4, v3}, Ll/᩺᩹ᩳ;-><init>(Ll/᩸۬ᩳ;I)V

    iput-object v2, p0, Ll/ܰ᩸ᩳ;->۬:Ll/᩺᩹ᩳ;

    .line 102
    invoke-virtual {v2}, Ll/᩺᩹ᩳ;->֫()[C

    move-result-object v2

    iput-object v2, p0, Ll/ܰ᩸ᩳ;->᩸:[C

    :cond_4
    add-int/2addr v1, p1

    .line 105
    invoke-static {v0}, Ll/۟᩸ᩳ;->ۧ(Ll/۟᩸ᩳ;)I

    move-result v2

    sub-int/2addr v2, p1

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/2addr v2, p1

    .line 106
    iget-object v3, p0, Ll/ܰ᩸ᩳ;->᩹:Ll/᩷᩹ᩳ;

    if-nez v3, :cond_5

    invoke-static {v0}, Ll/۟᩸ᩳ;->ܽ(Ll/۟᩸ᩳ;)Ll/۫᩹ᩳ;

    move-result-object v3

    invoke-virtual {v3, v1}, Ll/۬᩹ᩳ;->ۧ(I)Ll/᩷᩹ᩳ;

    move-result-object v3

    iput-object v3, p0, Ll/ܰ᩸ᩳ;->᩹:Ll/᩷᩹ᩳ;

    goto :goto_2

    .line 107
    :cond_5
    invoke-virtual {v3}, Ll/᩷᩹ᩳ;->position()I

    move-result v3

    if-eq v3, v1, :cond_6

    iget-object v3, p0, Ll/ܰ᩸ᩳ;->᩹:Ll/᩷᩹ᩳ;

    invoke-virtual {v3, v1}, Ll/᩷᩹ᩳ;->֫(I)V

    :cond_6
    :goto_2
    if-ge v1, v2, :cond_7

    .line 109
    invoke-static {v0}, Ll/۟᩸ᩳ;->ᩳ(Ll/۟᩸ᩳ;)V

    const/16 v3, 0x400

    sub-int v4, v2, v1

    .line 110
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 111
    iget-object v4, p0, Ll/ܰ᩸ᩳ;->᩹:Ll/᩷᩹ᩳ;

    iget-object v5, p0, Ll/ܰ᩸ᩳ;->᩸:[C

    sub-int v6, v1, p1

    invoke-virtual {v4, v5, v6, v3}, Ll/᩷᩹ᩳ;->֫([CII)V

    add-int/2addr v1, v3

    goto :goto_2

    .line 114
    :cond_7
    iput p1, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    .line 115
    iput v2, p0, Ll/ܰ᩸ᩳ;->᩶:I

    return-void

    .line 93
    :cond_8
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid character index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final charAt(I)C
    .locals 2

    .line 69
    iget v0, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Ll/ܰ᩸ᩳ;->᩶:I

    if-lt p1, v0, :cond_1

    :cond_0
    invoke-direct {p0, p1}, Ll/ܰ᩸ᩳ;->ܽ(I)V

    .line 70
    :cond_1
    iget-object v0, p0, Ll/ܰ᩸ᩳ;->᩸:[C

    iget v1, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    sub-int/2addr p1, v1

    aget-char p1, v0, p1

    return p1
.end method

.method public final getChars(II[CI)V
    .locals 4

    .line 119
    iget-object v0, p0, Ll/ܰ᩸ᩳ;->ۗ:Ll/۟᩸ᩳ;

    invoke-static {v0}, Ll/۟᩸ᩳ;->ܿ(Ll/۟᩸ᩳ;)V

    .line 120
    invoke-static {v0}, Ll/۟᩸ᩳ;->ۧ(Ll/۟᩸ᩳ;)I

    move-result v1

    invoke-static {p1, p2, v1}, Ll/ۨ᩹ᩳ;->֫(III)V

    sub-int v1, p2, p1

    .line 121
    invoke-static {p3, p4, v1}, Ll/۬᩹ᩳ;->֫([CII)V

    :goto_0
    if-ge p1, p2, :cond_2

    .line 123
    invoke-static {v0}, Ll/۟᩸ᩳ;->ᩳ(Ll/۟᩸ᩳ;)V

    .line 124
    iget v1, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    if-lt p1, v1, :cond_0

    iget v1, p0, Ll/ܰ᩸ᩳ;->᩶:I

    if-lt p1, v1, :cond_1

    :cond_0
    invoke-direct {p0, p1}, Ll/ܰ᩸ᩳ;->ܽ(I)V

    .line 125
    :cond_1
    iget v1, p0, Ll/ܰ᩸ᩳ;->᩶:I

    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr v1, p1

    .line 126
    iget-object v2, p0, Ll/ܰ᩸ᩳ;->᩸:[C

    iget v3, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    sub-int v3, p1, v3

    invoke-static {v2, v3, p3, p4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p1, v1

    add-int/2addr p4, v1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final length()I
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ܰ᩸ᩳ;->ۗ:Ll/۟᩸ᩳ;

    invoke-static {v0}, Ll/۟᩸ᩳ;->ܿ(Ll/۟᩸ᩳ;)V

    invoke-static {v0}, Ll/۟᩸ᩳ;->ۧ(Ll/۟᩸ᩳ;)I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subSequence(II)Ljava/lang/CharSequence;
    .locals 0

    .line 55
    invoke-virtual {p0, p1, p2}, Ll/ܰ᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final subSequence(II)Ljava/lang/String;
    .locals 3

    .line 133
    iget-object v0, p0, Ll/ܰ᩸ᩳ;->ۗ:Ll/۟᩸ᩳ;

    invoke-static {v0}, Ll/۟᩸ᩳ;->ܿ(Ll/۟᩸ᩳ;)V

    .line 134
    invoke-static {v0}, Ll/۟᩸ᩳ;->ۧ(Ll/۟᩸ᩳ;)I

    move-result v1

    invoke-static {p1, p2, v1}, Ll/ۨ᩹ᩳ;->֫(III)V

    .line 135
    invoke-static {v0}, Ll/۟᩸ᩳ;->ᩳ(Ll/۟᩸ᩳ;)V

    if-ne p1, p2, :cond_0

    const-string p1, ""

    return-object p1

    .line 137
    :cond_0
    iget v0, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    if-lt p1, v0, :cond_1

    iget v1, p0, Ll/ܰ᩸ᩳ;->᩶:I

    if-gt p2, v1, :cond_1

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Ll/ܰ᩸ᩳ;->᩸:[C

    sub-int v0, p1, v0

    sub-int/2addr p2, p1

    invoke-direct {v1, v2, v0, p2}, Ljava/lang/String;-><init>([CII)V

    return-object v1

    :cond_1
    sub-int v0, p2, p1

    .line 138
    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 139
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/ܰ᩸ᩳ;->getChars(II[CI)V

    .line 140
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([C)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 143
    iget-object v0, p0, Ll/ܰ᩸ᩳ;->ۗ:Ll/۟᩸ᩳ;

    invoke-static {v0}, Ll/۟᩸ᩳ;->ۧ(Ll/۟᩸ᩳ;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ll/ܰ᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 89
    iget v0, p0, Ll/ܰ᩸ᩳ;->᩶:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 85
    iget v0, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    return v0
.end method

.method public final ۧ(I)[C
    .locals 1

    .line 79
    iget v0, p0, Ll/ܰ᩸ᩳ;->ۙ:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Ll/ܰ᩸ᩳ;->᩶:I

    if-lt p1, v0, :cond_1

    :cond_0
    invoke-direct {p0, p1}, Ll/ܰ᩸ᩳ;->ܽ(I)V

    .line 80
    :cond_1
    iget-object p1, p0, Ll/ܰ᩸ᩳ;->᩸:[C

    return-object p1
.end method
