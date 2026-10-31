.class public final Ll/᩵ܰᩳ;
.super Ljava/lang/Object;
.source "UAZ7"


# instance fields
.field public ֫:C

.field public ۧ:Ll/ܺۢᩴ;

.field public ܽ:I


# direct methods
.method public static ֫(Ll/ۗۤᩳ;Ljava/lang/CharSequence;II)I
    .locals 5

    .line 35
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge p2, v0, :cond_4

    .line 37
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_4

    const/16 v4, 0xd

    if-ne v3, v4, :cond_0

    goto :goto_2

    :cond_0
    const/16 v4, 0x9

    if-ne v3, v4, :cond_1

    .line 41
    rem-int v3, v2, p3

    sub-int v3, p3, v3

    add-int/2addr v3, v2

    move v2, v3

    goto :goto_1

    :cond_1
    const/16 v4, 0x20

    if-ne v3, v4, :cond_2

    add-int/lit8 v2, v2, 0x1

    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 2131
    :cond_2
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    if-ne p1, p3, :cond_3

    .line 2132
    invoke-virtual {p0}, Ll/ۗۤᩳ;->֡()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p0, p0, Ll/ۗۤᩳ;->ܺ:Ll/۫ۨᩳ;

    .line 8957
    iget-object p1, p0, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-object p0, p0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-boolean p3, p0, Ll/᩺֫ܿ;->ܰۧ:Z

    if-eqz p3, :cond_3

    invoke-virtual {p1}, Ll/ۜܺܿ;->ۢ()Z

    move-result p3

    if-eqz p3, :cond_3

    .line 8958
    invoke-virtual {p0}, Ll/ۢ۫ۡ;->ܺ()I

    move-result p0

    invoke-virtual {p1, p2, p0}, Ll/ۜܺܿ;->ᩳ(II)I

    move-result p0

    .line 8959
    invoke-virtual {p1, p2}, Ll/ۜܺܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 8960
    invoke-virtual {p1}, Ll/᩸᩷ܿ;->ۖ()I

    move-result p1

    if-ne p0, p1, :cond_3

    goto :goto_2

    :cond_3
    move v1, v3

    :cond_4
    :goto_2
    const p0, 0xffff

    and-int/2addr p0, v2

    shl-int/lit8 p1, v1, 0x10

    or-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IndentGuideLine{spacesCount="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩵ܰᩳ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", firstNotBlankChar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-char v1, p0, Ll/᩵ܰᩳ;->֫:C

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", markList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ܰᩳ;->ۧ:Ll/ܺۢᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
