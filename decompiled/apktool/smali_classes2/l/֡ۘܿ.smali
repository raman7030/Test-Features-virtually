.class public final Ll/֡ۘܿ;
.super Ljava/lang/Object;
.source "4AWL"

# interfaces
.implements Ll/᩵ۘܿ;


# instance fields
.field public final ᩶:Z

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZ)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 19
    iput-object p1, p0, Ll/֡ۘܿ;->᩸:Ljava/lang/String;

    .line 20
    iput-boolean p2, p0, Ll/֡ۘܿ;->᩶:Z

    .line 21
    iput-boolean p3, p0, Ll/֡ۘܿ;->᩹:Z

    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 7
    check-cast p1, Ll/᩵ۘܿ;

    .line 96
    instance-of v0, p1, Ll/ۚۘܿ;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 99
    :cond_0
    instance-of v0, p1, Ll/֡ۘܿ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/֡ۘܿ;

    .line 100
    iget-object v0, p0, Ll/֡ۘܿ;->᩸:Ljava/lang/String;

    iget-object p1, p1, Ll/֡ۘܿ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    neg-int p1, p1

    return p1

    .line 102
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{start=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֡ۘܿ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', insertSpace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/֡ۘܿ;->᩶:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩸᩸ᩳ;II[I)I
    .locals 5

    .line 60
    invoke-static {p2, p3, p1}, Ll/ᩴۘܿ;->֫(IILjava/lang/CharSequence;)V

    .line 61
    invoke-static {p2, p3, p1}, Ll/ᩴۘܿ;->ܽ(IILjava/lang/CharSequence;)I

    move-result p2

    .line 62
    iget-object v0, p0, Ll/֡ۘܿ;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, p2

    const/4 v2, 0x0

    if-le v1, p3, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1, p2, v1}, Ll/᩸᩸ᩳ;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    .line 66
    iget-boolean v4, p0, Ll/֡ۘܿ;->᩹:Z

    if-eqz v4, :cond_1

    .line 67
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    return v2

    :cond_2
    if-eq v1, p3, :cond_3

    .line 73
    invoke-virtual {p1, v1}, Ll/᩸᩸ᩳ;->charAt(I)C

    move-result p3

    const/16 v0, 0x20

    if-ne p3, v0, :cond_3

    add-int/lit8 v1, v1, 0x1

    .line 76
    :cond_3
    invoke-virtual {p1, p2, v1}, Ll/᩸᩸ᩳ;->delete(II)V

    sub-int/2addr v1, p2

    .line 78
    :goto_1
    array-length p1, p4

    if-ge v2, p1, :cond_5

    .line 79
    aget p1, p4, v2

    if-le p1, p2, :cond_4

    sub-int p3, p1, p2

    .line 80
    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    sub-int/2addr p1, p3

    aput p1, p4, v2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    return v1
.end method

.method public final ֫(Ll/۟᩺ᩳ;II)Z
    .locals 2

    .line 26
    invoke-static {p2, p3, p1}, Ll/ᩴۘܿ;->֫(IILjava/lang/CharSequence;)V

    .line 27
    invoke-static {p2, p3, p1}, Ll/ᩴۘܿ;->ܽ(IILjava/lang/CharSequence;)I

    move-result p2

    if-ne p2, p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    sub-int/2addr p3, p2

    .line 31
    iget-object v0, p0, Ll/֡ۘܿ;->᩸:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p3, v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 33
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p3

    add-int/2addr p3, p2

    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 34
    iget-boolean p2, p0, Ll/֡ۘܿ;->᩹:Z

    if-eqz p2, :cond_2

    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    return p1

    .line 37
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/᩸᩸ᩳ;II[I)I
    .locals 2

    .line 43
    invoke-static {p2, p3, p1}, Ll/ᩴۘܿ;->֫(IILjava/lang/CharSequence;)V

    .line 44
    invoke-static {p2, p3, p1}, Ll/ᩴۘܿ;->ܽ(IILjava/lang/CharSequence;)I

    move-result p2

    const/4 v0, 0x0

    if-ne p2, p3, :cond_0

    return v0

    .line 48
    :cond_0
    iget-boolean p3, p0, Ll/֡ۘܿ;->᩶:Z

    iget-object v1, p0, Ll/֡ۘܿ;->᩸:Ljava/lang/String;

    if-eqz p3, :cond_1

    const-string p3, " "

    .line 0
    invoke-static {v1, p3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 56
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p3

    invoke-virtual {p1, p2, v0, p3, v1}, Ll/᩸᩸ᩳ;->֫(IIILjava/lang/CharSequence;)V

    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p1

    .line 51
    :goto_0
    array-length p3, p4

    if-ge v0, p3, :cond_3

    .line 52
    aget p3, p4, v0

    if-lt p3, p2, :cond_2

    add-int/2addr p3, p1

    .line 53
    aput p3, p4, v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return p1
.end method
