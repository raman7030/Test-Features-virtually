.class public final Ll/۫᩺ᩳ;
.super Ljava/lang/Object;
.source "H6NE"

# interfaces
.implements Ll/᩺ۘܽ;


# instance fields
.field public final ֫:Ljava/lang/Runnable;

.field public ۧ:I

.field public ܽ:[I

.field public final ܿ:Ll/۟᩸ᩳ;

.field public final ᩳ:Ll/ۨۘܽ;


# direct methods
.method public constructor <init>(Ll/۟᩸ᩳ;Ll/ۨۘܽ;Ljava/lang/Runnable;)V
    .locals 1

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 175
    iput-object v0, p0, Ll/۫᩺ᩳ;->ܽ:[I

    .line 178
    iput-object p1, p0, Ll/۫᩺ᩳ;->ܿ:Ll/۟᩸ᩳ;

    .line 179
    iput-object p2, p0, Ll/۫᩺ᩳ;->ᩳ:Ll/ۨۘܽ;

    .line 180
    iput-object p3, p0, Ll/۫᩺ᩳ;->֫:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final end(I)I
    .locals 1

    .line 195
    iget-object v0, p0, Ll/۫᩺ᩳ;->ܽ:[I

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 1

    .line 191
    iget-object v0, p0, Ll/۫᩺ᩳ;->ܿ:Ll/۟᩸ᩳ;

    return-object v0
.end method

.method public final group(I)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    if-ltz p1, :cond_2

    .line 197
    iget v1, p0, Ll/۫᩺ᩳ;->ۧ:I

    if-le p1, v1, :cond_0

    goto :goto_0

    .line 198
    :cond_0
    invoke-virtual {p0, p1}, Ll/۫᩺ᩳ;->start(I)I

    move-result v1

    invoke-virtual {p0, p1}, Ll/۫᩺ᩳ;->end(I)I

    move-result p1

    if-ltz v1, :cond_2

    if-gez p1, :cond_1

    goto :goto_0

    .line 199
    :cond_1
    iget-object v0, p0, Ll/۫᩺ᩳ;->ܿ:Ll/۟᩸ᩳ;

    invoke-virtual {v0, v1, p1}, Ll/۟᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final groupCount()I
    .locals 1

    .line 193
    iget v0, p0, Ll/۫᩺ᩳ;->ۧ:I

    return v0
.end method

.method public final pattern()Ll/ۨۘܽ;
    .locals 1

    .line 192
    iget-object v0, p0, Ll/۫᩺ᩳ;->ᩳ:Ll/ۨۘܽ;

    return-object v0
.end method

.method public final start(I)I
    .locals 1

    .line 194
    iget-object v0, p0, Ll/۫᩺ᩳ;->ܽ:[I

    mul-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method public final ֫()V
    .locals 1

    .line 201
    iget-object v0, p0, Ll/۫᩺ᩳ;->֫:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final ֫(Ll/۫ۘܽ;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 183
    invoke-virtual {p1}, Ll/۫ۘܽ;->groupCount()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput p2, p0, Ll/۫᩺ᩳ;->ۧ:I

    add-int/lit8 p2, p2, 0x1

    mul-int/lit8 p2, p2, 0x2

    .line 185
    iget-object v1, p0, Ll/۫᩺ᩳ;->ܽ:[I

    array-length v1, v1

    if-ge v1, p2, :cond_1

    new-array p2, p2, [I

    iput-object p2, p0, Ll/۫᩺ᩳ;->ܽ:[I

    .line 186
    :cond_1
    :goto_1
    iget p2, p0, Ll/۫᩺ᩳ;->ۧ:I

    if-gt v0, p2, :cond_2

    .line 187
    iget-object p2, p0, Ll/۫᩺ᩳ;->ܽ:[I

    mul-int/lit8 v1, v0, 0x2

    invoke-virtual {p1, v0}, Ll/۫ۘܽ;->start(I)I

    move-result v2

    aput v2, p2, v1

    .line 188
    iget-object p2, p0, Ll/۫᩺ᩳ;->ܽ:[I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v0}, Ll/۫ۘܽ;->end(I)I

    move-result v2

    aput v2, p2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method
