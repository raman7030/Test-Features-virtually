.class public final Ll/᩷ۤۢ;
.super Ljava/lang/Object;
.source "16QA"

# interfaces
.implements Ll/᩺ܿ֡;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Ll/᩷ۤۢ;->ܽ:Ljava/lang/CharSequence;

    .line 15
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-string v2, "\n"

    if-ge v0, v1, :cond_4

    and-int/lit16 v1, v0, 0x3ff

    if-nez v1, :cond_0

    .line 29
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 30
    :cond_0
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v3, 0xa

    if-ne v1, v3, :cond_1

    return-object v2

    :cond_1
    const/16 v2, 0xd

    if-ne v1, v2, :cond_3

    add-int/lit8 v0, v0, 0x1

    .line 32
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    if-ne p0, v3, :cond_2

    const-string p0, "\r\n"

    return-object p0

    :cond_2
    const-string p0, "\r"

    return-object p0

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-object v2
.end method

.method public static ᩳ()V
    .locals 1

    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ll/ۜۤۢ;

    .line 60
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 23
    throw v0
.end method


# virtual methods
.method public final index()I
    .locals 1

    .line 51
    iget v0, p0, Ll/᩷ۤۢ;->֫:I

    return v0
.end method

.method public final size()I
    .locals 1

    .line 53
    iget-object v0, p0, Ll/᩷ۤۢ;->ܽ:Ljava/lang/CharSequence;

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

    .line 56
    iget v0, p1, Ll/ܳ᩷֡;->֫:I

    iget-object v1, p0, Ll/᩷ۤۢ;->ܽ:Ljava/lang/CharSequence;

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

    .line 52
    iput p1, p0, Ll/᩷ۤۢ;->֫:I

    return-void
.end method

.method public final ۧ(I)I
    .locals 5

    .line 43
    iget v0, p0, Ll/᩷ۤۢ;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩷ۤۢ;->ۧ:I

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 45
    :cond_1
    iget v0, p0, Ll/᩷ۤۢ;->֫:I

    int-to-long v0, v0

    if-lez p1, :cond_2

    add-int/lit8 p1, p1, -0x1

    :cond_2
    int-to-long v2, p1

    add-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-ltz p1, :cond_4

    .line 46
    iget-object p1, p0, Ll/᩷ۤۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-ltz v4, :cond_3

    goto :goto_0

    :cond_3
    long-to-int v1, v0

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    :cond_4
    :goto_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ۧ()V
    .locals 2

    .line 38
    iget v0, p0, Ll/᩷ۤۢ;->֫:I

    iget-object v1, p0, Ll/᩷ۤۢ;->ܽ:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 39
    iget v0, p0, Ll/᩷ۤۢ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩷ۤۢ;->֫:I

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    :cond_0
    return-void

    .line 38
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot consume EOF"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()Ljava/lang/CharSequence;
    .locals 1

    .line 19
    iget-object v0, p0, Ll/᩷ۤۢ;->ܽ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 0

    return-void
.end method
