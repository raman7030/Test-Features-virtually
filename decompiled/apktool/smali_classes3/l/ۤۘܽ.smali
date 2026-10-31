.class public final Ll/ۤۘܽ;
.super Ljava/lang/Object;
.source "97NX"

# interfaces
.implements Lbin/mt/plugin/api/regex/MatcherSnapshot;
.implements Ll/᩺ۘܽ;


# instance fields
.field public ֫:Ljava/lang/Runnable;

.field public ۧ:I

.field public ܳ:Ljava/lang/CharSequence;

.field public ܽ:[I

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ll/ۨۘܽ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 6
    iput-object v0, p0, Ll/ۤۘܽ;->ܽ:[I

    return-void
.end method

.method public constructor <init>(Ll/۫ۘܽ;)V
    .locals 7

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 6
    iput-object v1, p0, Ll/ۤۘܽ;->ܽ:[I

    .line 23
    invoke-virtual {p1}, Ll/۫ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v1

    iput-object v1, p0, Ll/ۤۘܽ;->ᩳ:Ll/ۨۘܽ;

    .line 24
    invoke-virtual {p1}, Ll/۫ۘܽ;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, p0, Ll/ۤۘܽ;->ܳ:Ljava/lang/CharSequence;

    .line 26
    invoke-virtual {p1}, Ll/۫ۘܽ;->ۧ()Ljava/lang/Runnable;

    move-result-object v1

    iput-object v1, p0, Ll/ۤۘܽ;->֫:Ljava/lang/Runnable;

    .line 27
    invoke-virtual {p1}, Ll/۫ۘܽ;->groupCount()I

    move-result v1

    iput v1, p0, Ll/ۤۘܽ;->ۧ:I

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v2, v1, 0x2

    .line 30
    iget-object v3, p0, Ll/ۤۘܽ;->ܽ:[I

    array-length v3, v3

    if-ge v3, v2, :cond_0

    .line 31
    new-array v2, v2, [I

    iput-object v2, p0, Ll/ۤۘܽ;->ܽ:[I

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 33
    iget-object v4, p0, Ll/ۤۘܽ;->ܽ:[I

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {p1, v2}, Ll/۫ۘܽ;->start(I)I

    move-result v6

    aput v6, v4, v3

    .line 34
    iget-object v4, p0, Ll/ۤۘܽ;->ܽ:[I

    add-int/2addr v3, v0

    invoke-virtual {p1, v2}, Ll/۫ۘܽ;->end(I)I

    move-result v6

    aput v6, v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Ll/ۤۘܽ;->ܿ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final clearComputedReplacement()V
    .locals 1

    const/4 v0, 0x0

    .line 130
    iput-object v0, p0, Ll/ۤۘܽ;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public final end()I
    .locals 2

    .line 62
    iget-object v0, p0, Ll/ۤۘܽ;->ܽ:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public final end(I)I
    .locals 2

    if-ltz p1, :cond_0

    .line 137
    iget v0, p0, Ll/ۤۘܽ;->ۧ:I

    if-gt p1, v0, :cond_0

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    .line 68
    iget-object v0, p0, Ll/ۤۘܽ;->ܽ:[I

    aget p1, v0, p1

    return p1

    .line 138
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "No group "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 138
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final expandReplacement(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    invoke-static {p0, v0, p1}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final expandReplacementInto(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 0

    .line 111
    invoke-static {p0, p1, p2}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method public final getComputedReplacement()Ljava/lang/String;
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ۤۘܽ;->ܿ:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 123
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Please call prepareReplacement() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۤۘܽ;->ܳ:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final group()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 77
    invoke-virtual {p0, v0}, Ll/ۤۘܽ;->group(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final group(I)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-ltz p1, :cond_2

    .line 82
    iget v1, p0, Ll/ۤۘܽ;->ۧ:I

    if-le p1, v1, :cond_0

    goto :goto_0

    :cond_0
    mul-int/lit8 p1, p1, 0x2

    .line 84
    iget-object v1, p0, Ll/ۤۘܽ;->ܽ:[I

    aget v2, v1, p1

    add-int/lit8 p1, p1, 0x1

    .line 85
    aget p1, v1, p1

    const/4 v1, -0x1

    if-eq v2, v1, :cond_2

    if-ne p1, v1, :cond_1

    goto :goto_0

    .line 89
    :cond_1
    iget-object v0, p0, Ll/ۤۘܽ;->ܳ:Ljava/lang/CharSequence;

    invoke-interface {v0, v2, p1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final groupCount()I
    .locals 1

    .line 94
    iget v0, p0, Ll/ۤۘܽ;->ۧ:I

    return v0
.end method

.method public final pattern()Ll/ۨۘܽ;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۤۘܽ;->ᩳ:Ll/ۨۘܽ;

    return-object v0
.end method

.method public final prepareReplacement(Ljava/lang/String;)V
    .locals 0

    .line 116
    invoke-virtual {p0, p1}, Ll/ۤۘܽ;->expandReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۤۘܽ;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public final start()I
    .locals 2

    .line 51
    iget-object v0, p0, Ll/ۤۘܽ;->ܽ:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public final start(I)I
    .locals 2

    if-ltz p1, :cond_0

    .line 137
    iget v0, p0, Ll/ۤۘܽ;->ۧ:I

    if-gt p1, v0, :cond_0

    mul-int/lit8 p1, p1, 0x2

    .line 57
    iget-object v0, p0, Ll/ۤۘܽ;->ܽ:[I

    aget p1, v0, p1

    return p1

    .line 138
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "No group "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 138
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫()V
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ۤۘܽ;->֫:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method
