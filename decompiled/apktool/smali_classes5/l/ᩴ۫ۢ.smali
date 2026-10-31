.class public final Ll/ᩴ۫ۢ;
.super Ljava/lang/Object;
.source "H6P4"

# interfaces
.implements Ll/᩺ܿ֡;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/ᩴ۫ۢ;->ܽ:Ljava/lang/CharSequence;

    return-void
.end method

.method public static ܽ()V
    .locals 1

    .line 22
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 23
    :cond_0
    new-instance v0, Ll/ۘ۫ۢ;

    .line 53
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 23
    throw v0
.end method


# virtual methods
.method public final index()I
    .locals 1

    .line 44
    iget v0, p0, Ll/ᩴ۫ۢ;->֫:I

    return v0
.end method

.method public final size()I
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ᩴ۫ۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0
.end method

.method public final ֫()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final ֫(Ll/ܳ᩷֡;)Ljava/lang/String;
    .locals 3

    .line 49
    iget v0, p1, Ll/ܳ᩷֡;->֫:I

    iget-object v1, p0, Ll/ᩴ۫ۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    iget p1, p1, Ll/ܳ᩷֡;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v0, p1, v1}, Ll/ۖ᩵ۘ;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)V
    .locals 0

    .line 45
    iput p1, p0, Ll/ᩴ۫ۢ;->֫:I

    return-void
.end method

.method public final ۧ(I)I
    .locals 2

    .line 36
    iget v0, p0, Ll/ᩴ۫ۢ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ᩴ۫ۢ;->ۧ:I

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 38
    :cond_1
    iget v0, p0, Ll/ᩴ۫ۢ;->֫:I

    if-lez p1, :cond_2

    add-int/lit8 p1, p1, -0x1

    :cond_2
    add-int/2addr v0, p1

    if-ltz v0, :cond_4

    .line 39
    iget-object p1, p0, Ll/ᩴ۫ۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lt v0, v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    :cond_4
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ۧ()V
    .locals 2

    .line 29
    iget v0, p0, Ll/ᩴ۫ۢ;->֫:I

    iget-object v1, p0, Ll/ᩴ۫ۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 30
    iget v0, p0, Ll/ᩴ۫ۢ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ᩴ۫ۢ;->֫:I

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    .line 31
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    :cond_0
    return-void

    .line 29
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot consume EOF"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(I)V
    .locals 0

    return-void
.end method

.method public final ᩳ(I)C
    .locals 1

    .line 19
    iget-object v0, p0, Ll/ᩴ۫ۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1
.end method
