.class public final Ll/ܳ᩻ۘ;
.super Ljava/lang/Object;
.source "L1LA"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public final ᩸:Ljava/lang/CharSequence;

.field public final ᩹:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ll/ܳ᩻ۘ;->᩸:Ljava/lang/CharSequence;

    .line 12
    iput-object p2, p0, Ll/ܳ᩻ۘ;->᩹:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final charAt(I)C
    .locals 2

    .line 22
    iget-object v0, p0, Ll/ܳ᩻ۘ;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    .line 23
    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr p1, v0

    iget-object v0, p0, Ll/ܳ᩻ۘ;->᩹:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1
.end method

.method public final length()I
    .locals 2

    .line 17
    iget-object v0, p0, Ll/ܳ᩻ۘ;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget-object v1, p0, Ll/ܳ᩻ۘ;->᩹:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 4

    if-nez p1, :cond_0

    .line 28
    invoke-virtual {p0}, Ll/ܳ᩻ۘ;->length()I

    move-result v0

    if-ne p2, v0, :cond_0

    return-object p0

    .line 29
    :cond_0
    iget-object v0, p0, Ll/ܳ᩻ۘ;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p1, v1, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p2, v1, :cond_1

    invoke-interface {v0, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    .line 30
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iget-object v2, p0, Ll/ܳ᩻ۘ;->᩹:Ljava/lang/CharSequence;

    if-lt p1, v1, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lt p2, v1, :cond_2

    .line 31
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-interface {v2, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    .line 32
    :cond_2
    new-instance v1, Ll/ܳ᩻ۘ;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-interface {v0, p1, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr p2, v0

    const/4 v0, 0x0

    invoke-interface {v2, v0, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Ll/ܳ᩻ۘ;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܳ᩻ۘ;->᩸:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳ᩻ۘ;->᩹:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
