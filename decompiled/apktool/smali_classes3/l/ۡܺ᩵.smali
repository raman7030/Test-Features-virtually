.class public abstract Ll/ۡܺ᩵;
.super Ll/ۛܺ᩵;
.source "MA0S"

# interfaces
.implements Ll/ۜܺ᩵;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۬:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 33
    iput v0, p0, Ll/ۡܺ᩵;->ۗ:I

    const/4 v0, 0x0

    .line 34
    iput v0, p0, Ll/ۡܺ᩵;->᩶:I

    .line 35
    iput v0, p0, Ll/ۡܺ᩵;->ۙ:I

    .line 36
    iput v0, p0, Ll/ۡܺ᩵;->᩹:I

    .line 37
    iput v0, p0, Ll/ۡܺ᩵;->᩸:I

    .line 38
    iput v0, p0, Ll/ۡܺ᩵;->۬:I

    return-void
.end method


# virtual methods
.method public abstract ֫()I
.end method

.method public final ֫(Ll/۬ܺ᩵;)V
    .locals 5

    .line 140
    invoke-virtual {p0, p1}, Ll/ۡܺ᩵;->ܽ(Ll/۬ܺ᩵;)V

    .line 142
    iget v0, p0, Ll/ۡܺ᩵;->ۗ:I

    const/16 v1, 0xc

    const/16 v2, 0xd

    const/4 v3, 0x2

    const/4 v4, 0x3

    if-eq v0, v1, :cond_1

    if-eq v0, v3, :cond_1

    if-eq v0, v4, :cond_1

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    new-instance p1, Ll/۫ܺ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected ptype: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۡܺ᩵;->ۗ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 143
    throw p1

    :cond_1
    :goto_0
    if-eq v0, v3, :cond_2

    if-ne v0, v4, :cond_3

    .line 146
    :cond_2
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    iput v0, p0, Ll/ۡܺ᩵;->᩸:I

    .line 147
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ۧ()I

    .line 148
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ۧ()I

    .line 150
    :cond_3
    iget v0, p0, Ll/ۡܺ᩵;->ۗ:I

    if-eq v0, v4, :cond_5

    if-ne v0, v2, :cond_4

    goto :goto_1

    .line 153
    :cond_4
    invoke-virtual {p0, p1}, Ll/ۡܺ᩵;->ᩳ(Ll/۬ܺ᩵;)V

    return-void

    .line 151
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result p1

    iput p1, p0, Ll/ۡܺ᩵;->۬:I

    return-void
.end method

.method public ۧ()Ll/ۢܺ᩵;
    .locals 6

    .line 74
    iget v0, p0, Ll/ۡܺ᩵;->۬:I

    if-eqz v0, :cond_3

    .line 75
    new-instance v0, Ll/ۢܺ᩵;

    iget v1, p0, Ll/ۡܺ᩵;->۬:I

    const/4 v2, 0x0

    const/16 v3, 0x9

    :goto_0
    if-lt v3, v2, :cond_2

    add-int v4, v2, v3

    .line 44
    div-int/lit8 v4, v4, 0x2

    .line 46
    sget-object v5, Ll/᩷ܺ᩵;->ۢ:[I

    aget v5, v5, v4

    if-le v1, v5, :cond_0

    add-int/lit8 v2, v4, 0x1

    goto :goto_0

    :cond_0
    if-ge v1, v5, :cond_1

    add-int/lit8 v3, v4, -0x1

    goto :goto_0

    .line 51
    :cond_1
    sget-object v1, Ll/᩷ܺ᩵;->ۡ:[Ljava/lang/String;

    aget-object v1, v1, v4

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    .line 55
    invoke-static {v1, v2}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0x"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 58
    :goto_1
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(Ll/۬ܺ᩵;)V
    .locals 4

    .line 80
    iget v0, p1, Ll/۬ܺ᩵;->ܽ:I

    const/16 v1, 0x10

    .line 115
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->֫(I)V

    .line 116
    iget v1, p0, Ll/ۡܺ᩵;->ۗ:I

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 80
    iget v1, p1, Ll/۬ܺ᩵;->ܽ:I

    .line 118
    invoke-virtual {p1, v2}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 119
    invoke-virtual {p1, v2}, Ll/۬ܺ᩵;->ܿ(I)V

    .line 120
    invoke-virtual {p0}, Ll/ۡܺ᩵;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/۬ܺ᩵;->ܿ(I)V

    move v2, v1

    .line 123
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۡܺ᩵;->ܳ(Ll/۬ܺ᩵;)V

    .line 80
    iget v1, p1, Ll/۬ܺ᩵;->ܽ:I

    sub-int/2addr v1, v0

    .line 124
    iput v1, p0, Ll/ۡܺ᩵;->ۙ:I

    .line 126
    iget v3, p0, Ll/ۡܺ᩵;->ۗ:I

    if-nez v3, :cond_1

    .line 85
    iput v2, p1, Ll/۬ܺ᩵;->ܽ:I

    sub-int/2addr v1, v2

    .line 128
    iput v1, p0, Ll/ۡܺ᩵;->᩸:I

    .line 129
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 85
    :cond_1
    iput v0, p1, Ll/۬ܺ᩵;->ܽ:I

    .line 133
    invoke-virtual {p0, p1}, Ll/ۡܺ᩵;->ܿ(Ll/۬ܺ᩵;)V

    .line 134
    iget v1, p0, Ll/ۡܺ᩵;->ۙ:I

    add-int/2addr v0, v1

    .line 85
    iput v0, p1, Ll/۬ܺ᩵;->ܽ:I

    return-void
.end method

.method public abstract ܳ(Ll/۬ܺ᩵;)V
.end method

.method public final ܽ(Ll/۬ܺ᩵;)V
    .locals 2

    .line 94
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ܽ()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Ll/۬ܺ᩵;->ܽ()I

    move-result v0

    if-nez v0, :cond_2

    .line 97
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ۡܺ᩵;->ۗ:I

    .line 98
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ۡܺ᩵;->᩶:I

    .line 99
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    .line 102
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ۧ()I

    move-result v0

    iput v0, p0, Ll/ۡܺ᩵;->ۙ:I

    .line 103
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    .line 106
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result p1

    iput p1, p0, Ll/ۡܺ᩵;->᩹:I

    return-void

    .line 104
    :cond_0
    new-instance p1, Ll/۫ܺ᩵;

    const-string v0, "DCERPC authentication not supported"

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 104
    throw p1

    .line 100
    :cond_1
    new-instance p1, Ll/۫ܺ᩵;

    const-string v0, "Data representation not supported"

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 100
    throw p1

    .line 95
    :cond_2
    new-instance p1, Ll/۫ܺ᩵;

    const-string v0, "DCERPC version not supported"

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 95
    throw p1
.end method

.method public final ܿ(Ll/۬ܺ᩵;)V
    .locals 2

    const/4 v0, 0x5

    .line 81
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ܳ(I)V

    const/4 v0, 0x0

    .line 82
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ܳ(I)V

    .line 83
    iget v1, p0, Ll/ۡܺ᩵;->ۗ:I

    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ܳ(I)V

    .line 84
    iget v1, p0, Ll/ۡܺ᩵;->᩶:I

    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ܳ(I)V

    const/16 v1, 0x10

    .line 85
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 86
    iget v1, p0, Ll/ۡܺ᩵;->ۙ:I

    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ܿ(I)V

    .line 87
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ܿ(I)V

    .line 88
    iget v0, p0, Ll/ۡܺ᩵;->᩹:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    return-void
.end method

.method public abstract ᩳ(Ll/۬ܺ᩵;)V
.end method
