.class public Ll/ۗᩳ֡;
.super Ljava/lang/Object;
.source "44OF"

# interfaces
.implements Ll/ۜܿ֡;
.implements Ljava/io/Serializable;


# instance fields
.field public ۗ:I

.field public transient ۙ:Ll/ۙᩳ֡;

.field public ۛ:I

.field public ۤ:Ljava/lang/String;

.field public ۫:I

.field public ۬:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 35
    iput v0, p0, Ll/ۗᩳ֡;->᩹:I

    .line 46
    iput v0, p0, Ll/ۗᩳ֡;->᩶:I

    .line 67
    iput p1, p0, Ll/ۗᩳ֡;->ۛ:I

    const/4 p1, 0x0

    .line 68
    iput p1, p0, Ll/ۗᩳ֡;->᩸:I

    .line 69
    iput-object p2, p0, Ll/ۗᩳ֡;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ۜܿ֡;)V
    .locals 2

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 35
    iput v0, p0, Ll/ۗᩳ֡;->᩹:I

    const/4 v1, 0x0

    .line 36
    iput v1, p0, Ll/ۗᩳ֡;->᩸:I

    .line 46
    iput v0, p0, Ll/ۗᩳ֡;->᩶:I

    .line 73
    invoke-interface {p1}, Ll/ۜܿ֡;->getText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۗᩳ֡;->ۤ:Ljava/lang/String;

    .line 74
    invoke-interface {p1}, Ll/ۜܿ֡;->getType()I

    move-result v0

    iput v0, p0, Ll/ۗᩳ֡;->ۛ:I

    .line 75
    invoke-interface {p1}, Ll/ۜܿ֡;->getLine()I

    move-result v0

    iput v0, p0, Ll/ۗᩳ֡;->ۗ:I

    .line 76
    invoke-interface {p1}, Ll/ۜܿ֡;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ۗᩳ֡;->᩶:I

    .line 77
    invoke-interface {p1}, Ll/ۜܿ֡;->֫()I

    move-result v0

    iput v0, p0, Ll/ۗᩳ֡;->᩹:I

    .line 78
    invoke-interface {p1}, Ll/ۜܿ֡;->ۧ()I

    move-result v0

    iput v0, p0, Ll/ۗᩳ֡;->᩸:I

    .line 79
    invoke-interface {p1}, Ll/ۜܿ֡;->getInputStream()Ll/ۙᩳ֡;

    move-result-object v0

    iput-object v0, p0, Ll/ۗᩳ֡;->ۙ:Ll/ۙᩳ֡;

    .line 80
    instance-of v0, p1, Ll/ۗᩳ֡;

    if-eqz v0, :cond_0

    .line 81
    check-cast p1, Ll/ۗᩳ֡;

    iget v0, p1, Ll/ۗᩳ֡;->۬:I

    iput v0, p0, Ll/ۗᩳ֡;->۬:I

    .line 82
    iget p1, p1, Ll/ۗᩳ֡;->۫:I

    iput p1, p0, Ll/ۗᩳ֡;->۫:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final getInputStream()Ll/ۙᩳ֡;
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ۗᩳ֡;->ۙ:Ll/ۙᩳ֡;

    return-object v0
.end method

.method public final getLine()I
    .locals 1

    .line 125
    iget v0, p0, Ll/ۗᩳ֡;->ۗ:I

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 2

    .line 98
    iget-object v0, p0, Ll/ۗᩳ֡;->ۤ:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 101
    :cond_0
    iget-object v0, p0, Ll/ۗᩳ֡;->ۙ:Ll/ۙᩳ֡;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 104
    :cond_1
    invoke-interface {v0}, Ll/ۨᩳ֡;->size()I

    move-result v0

    .line 105
    iget v1, p0, Ll/ۗᩳ֡;->۬:I

    if-ge v1, v0, :cond_2

    iget v1, p0, Ll/ۗᩳ֡;->۫:I

    if-ge v1, v0, :cond_2

    .line 106
    iget-object v0, p0, Ll/ۗᩳ֡;->ۙ:Ll/ۙᩳ֡;

    invoke-interface {v0}, Ll/ۙᩳ֡;->ᩳ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, "<EOF>"

    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 88
    iget v0, p0, Ll/ۗᩳ֡;->ۛ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 192
    iget v0, p0, Ll/ۗᩳ֡;->᩸:I

    if-lez v0, :cond_0

    .line 193
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ",channel="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۗᩳ֡;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 195
    :goto_0
    invoke-virtual {p0}, Ll/ۗᩳ֡;->getText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "\n"

    const-string v3, "\\\\n"

    .line 197
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\r"

    const-string v3, "\\\\r"

    .line 198
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\t"

    const-string v3, "\\\\t"

    .line 199
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const-string v1, "<no text>"

    .line 204
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[@"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    iget v3, p0, Ll/ۗᩳ֡;->᩶:I

    .line 204
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Ll/ۗᩳ֡;->۬:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, Ll/ۗᩳ֡;->۫:I

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "=\'"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\',<"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۗᩳ֡;->ۛ:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۗᩳ֡;->ۗ:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    iget v0, p0, Ll/ۗᩳ֡;->᩹:I

    const-string v1, "]"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 130
    iget v0, p0, Ll/ۗᩳ֡;->᩹:I

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 135
    iput p1, p0, Ll/ۗᩳ֡;->᩹:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Ll/ۗᩳ֡;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 140
    iget v0, p0, Ll/ۗᩳ֡;->᩸:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 93
    iput p1, p0, Ll/ۗᩳ֡;->ۗ:I

    return-void
.end method

.method public final ܽ()I
    .locals 1

    .line 171
    iget v0, p0, Ll/ۗᩳ֡;->᩶:I

    return v0
.end method

.method public final ܽ(I)V
    .locals 0

    .line 158
    iput p1, p0, Ll/ۗᩳ֡;->۬:I

    return-void
.end method

.method public final ܿ(I)V
    .locals 0

    .line 150
    iput p1, p0, Ll/ۗᩳ֡;->ۛ:I

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/16 v0, 0x63

    .line 145
    iput v0, p0, Ll/ۗᩳ֡;->᩸:I

    return-void
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 166
    iput p1, p0, Ll/ۗᩳ֡;->۫:I

    return-void
.end method
