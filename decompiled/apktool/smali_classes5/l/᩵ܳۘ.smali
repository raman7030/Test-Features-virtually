.class public final Ll/᩵ܳۘ;
.super Ljava/lang/Object;
.source "Z1MK"

# interfaces
.implements Ll/ᩴܳۘ;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput p1, p0, Ll/᩵ܳۘ;->ܽ:I

    .line 34
    iput p2, p0, Ll/᩵ܳۘ;->֫:I

    .line 35
    iput p3, p0, Ll/᩵ܳۘ;->ᩳ:I

    .line 36
    iput p4, p0, Ll/᩵ܳۘ;->ۧ:I

    if-ne p1, p2, :cond_0

    if-ne p3, p4, :cond_0

    .line 40
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "DiffFragmentImpl should not be empty: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/᩵ܳۘ;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 42
    :cond_0
    iget p1, p0, Ll/᩵ܳۘ;->ܽ:I

    iget p2, p0, Ll/᩵ܳۘ;->֫:I

    if-gt p1, p2, :cond_2

    iget p1, p0, Ll/᩵ܳۘ;->ᩳ:I

    iget p2, p0, Ll/᩵ܳۘ;->ۧ:I

    if-le p1, p2, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 44
    :cond_2
    :goto_0
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "DiffFragmentImpl is invalid: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/᩵ܳۘ;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/᩵ܳۘ;->ܽ:I

    .line 50
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/᩵ܳۘ;->֫:I

    .line 51
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    iput v0, p0, Ll/᩵ܳۘ;->ᩳ:I

    .line 52
    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    iput p1, p0, Ll/᩵ܳۘ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DiffFragmentImpl ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩵ܳۘ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩵ܳۘ;->֫:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") - ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩵ܳۘ;->ᩳ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ܳۘ;->ۧ:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 62
    iget v0, p0, Ll/᩵ܳۘ;->֫:I

    return v0
.end method

.method public final ֫(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 43
    invoke-virtual {p0}, Ll/᩵ܳۘ;->ᩳ()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Ll/᩵ܳۘ;->ܿ()I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    .line 97
    iget v0, p0, Ll/᩵ܳۘ;->ܽ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 98
    iget v0, p0, Ll/᩵ܳۘ;->֫:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 99
    iget v0, p0, Ll/᩵ܳۘ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 100
    iget v0, p0, Ll/᩵ܳۘ;->ۧ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    .line 92
    iput p1, p0, Ll/᩵ܳۘ;->ۧ:I

    return-void
.end method

.method public final ۧ(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    .line 52
    invoke-virtual {p0, p1}, Ll/᩵ܳۘ;->ܿ(I)V

    return-void

    .line 54
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩵ܳۘ;->ܳ(I)V

    return-void
.end method

.method public final ܳ(I)V
    .locals 0

    .line 87
    iput p1, p0, Ll/᩵ܳۘ;->ᩳ:I

    return-void
.end method

.method public final ܽ(Z)I
    .locals 0

    if-eqz p1, :cond_0

    .line 47
    invoke-virtual {p0}, Ll/᩵ܳۘ;->֫()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Ll/᩵ܳۘ;->᩻()I

    move-result p1

    return p1
.end method

.method public final ܽ(I)V
    .locals 0

    .line 82
    iput p1, p0, Ll/᩵ܳۘ;->֫:I

    return-void
.end method

.method public final ܿ()I
    .locals 1

    .line 67
    iget v0, p0, Ll/᩵ܳۘ;->ᩳ:I

    return v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 77
    iput p1, p0, Ll/᩵ܳۘ;->ܽ:I

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 57
    iget v0, p0, Ll/᩵ܳۘ;->ܽ:I

    return v0
.end method

.method public final ᩳ(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    .line 60
    invoke-virtual {p0, p1}, Ll/᩵ܳۘ;->ܽ(I)V

    return-void

    .line 62
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩵ܳۘ;->ۧ(I)V

    return-void
.end method

.method public final ᩻()I
    .locals 1

    .line 72
    iget v0, p0, Ll/᩵ܳۘ;->ۧ:I

    return v0
.end method
