.class public final Ll/ᩴܺܺ;
.super Ll/ܰۡܺ;
.source "1BH4"


# instance fields
.field public final ۗ:Ll/᩺ܺܺ;

.field public final ۙ:Ll/᩶ܺܺ;

.field public final ۬:Ljava/util/ArrayList;

.field public ᩶:Ll/۫ܺܺ;

.field public final ᩸:I

.field public ᩹:Ll/ܳܺܺ;


# direct methods
.method public constructor <init>(ILl/᩶ܺܺ;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ll/ܰۡܺ;-><init>()V

    .line 79
    iput p1, p0, Ll/ᩴܺܺ;->᩸:I

    .line 80
    iput-object p2, p0, Ll/ᩴܺܺ;->ۙ:Ll/᩶ܺܺ;

    .line 81
    invoke-virtual {p2}, Ll/᩶ܺܺ;->ܺ()Ll/۬ܺܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ܺܺ;->֫(Ljava/lang/String;)Ll/᩺ܺܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴܺܺ;->ۗ:Ll/᩺ܺܺ;

    .line 82
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩴܺܺ;->۬:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(ILl/᩶ܺܺ;)Ll/ᩴܺܺ;
    .locals 1

    .line 69
    new-instance v0, Ll/ᩴܺܺ;

    invoke-direct {v0, p0, p1}, Ll/ᩴܺܺ;-><init>(ILl/᩶ܺܺ;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 110
    invoke-virtual {p0}, Ll/ᩴܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ll/ܳܺܺ;
    .locals 1

    .line 245
    iget-object v0, p0, Ll/ᩴܺܺ;->᩹:Ll/ܳܺܺ;

    return-object v0
.end method

.method public final ֨()Ll/᩺ܺܺ;
    .locals 1

    .line 186
    iget-object v0, p0, Ll/ᩴܺܺ;->ۗ:Ll/᩺ܺܺ;

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 126
    iget-object v0, p0, Ll/ᩴܺܺ;->᩶:Ll/۫ܺܺ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۫ܺܺ;->֫()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Unknown"

    :goto_0
    const-string v1, "InvokeDynamic("

    const-string v2, ":"

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 127
    iget v1, p0, Ll/ᩴܺܺ;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩴܺܺ;->ۙ:Ll/᩶ܺܺ;

    invoke-virtual {v1}, Ll/᩶ܺܺ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۫ܺܺ;)V
    .locals 1

    .line 206
    iget-object v0, p0, Ll/ᩴܺܺ;->᩶:Ll/۫ܺܺ;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 211
    iput-object p1, p0, Ll/ᩴܺܺ;->᩶:Ll/۫ܺܺ;

    return-void

    .line 209
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "declaringClass == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 207
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "already added declaring class"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܳܺܺ;)V
    .locals 1

    .line 231
    iget-object v0, p0, Ll/ᩴܺܺ;->᩹:Ll/ܳܺܺ;

    if-nez v0, :cond_0

    .line 236
    iput-object p1, p0, Ll/ᩴܺܺ;->᩹:Ll/ܳܺܺ;

    return-void

    .line 232
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "already added call site"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۚ()Ll/᩶ܺܺ;
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ᩴܺܺ;->ۙ:Ll/᩶ܺܺ;

    return-object v0
.end method

.method public final ۠()Ljava/util/ArrayList;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ᩴܺܺ;->۬:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)I
    .locals 2

    .line 143
    check-cast p1, Ll/ᩴܺܺ;

    .line 144
    iget v0, p0, Ll/ᩴܺܺ;->᩸:I

    .line 168
    iget v1, p1, Ll/ᩴܺܺ;->᩸:I

    .line 144
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 149
    :cond_0
    iget-object v0, p0, Ll/ᩴܺܺ;->ۙ:Ll/᩶ܺܺ;

    .line 177
    iget-object v1, p1, Ll/ᩴܺܺ;->ۙ:Ll/᩶ܺܺ;

    .line 149
    invoke-virtual {v0, v1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 154
    :cond_1
    iget-object v0, p0, Ll/ᩴܺܺ;->᩶:Ll/۫ܺܺ;

    .line 220
    iget-object v1, p1, Ll/ᩴܺܺ;->᩶:Ll/۫ܺܺ;

    .line 154
    invoke-virtual {v0, v1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    .line 159
    :cond_2
    iget-object v0, p0, Ll/ᩴܺܺ;->᩹:Ll/ܳܺܺ;

    .line 245
    iget-object p1, p1, Ll/ᩴܺܺ;->᩹:Ll/ܳܺܺ;

    .line 159
    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Ll/᩻ܺܺ;
    .locals 3

    .line 91
    new-instance v0, Ll/᩻ܺܺ;

    iget-object v1, p0, Ll/ᩴܺܺ;->۬:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, p0, v2}, Ll/᩻ܺܺ;-><init>(Ll/ᩴܺܺ;I)V

    .line 92
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ᩳ()Ll/۟ܺܺ;
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ᩴܺܺ;->ۗ:Ll/᩺ܺܺ;

    invoke-virtual {v0}, Ll/᩺ܺܺ;->ᩳ()Ll/۟ܺܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 168
    iget v0, p0, Ll/ᩴܺܺ;->᩸:I

    return v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "InvokeDynamic"

    return-object v0
.end method
