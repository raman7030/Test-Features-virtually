.class public abstract Ll/᩷ᩴ֡;
.super Ll/ۨۘ֡;
.source "M2DV"


# virtual methods
.method public ֫(Ljava/lang/CharSequence;ILjava/io/StringWriter;)I
    .locals 0

    if-eqz p2, :cond_1

    .line 31
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    .line 47
    invoke-virtual {p2}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    :goto_0
    const-string p3, ".translate(final CharSequence input, final int index, final Writer out) can not handle a non-zero index."

    .line 31
    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 35
    :cond_1
    invoke-virtual {p0, p1, p3}, Ll/᩷ᩴ֡;->֫(Ljava/lang/CharSequence;Ljava/io/StringWriter;)V

    .line 37
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    invoke-static {p1, p2, p3}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    move-result p1

    return p1
.end method

.method public abstract ֫(Ljava/lang/CharSequence;Ljava/io/StringWriter;)V
.end method
