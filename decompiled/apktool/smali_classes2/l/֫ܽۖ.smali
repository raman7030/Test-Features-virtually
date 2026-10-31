.class public final Ll/֫ܽۖ;
.super Ljava/lang/Object;
.source "T4T4"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:I


# virtual methods
.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 38
    iget-object v0, p0, Ll/֫ܽۖ;->֫:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 41
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Ll/֫ܽۖ;->ۧ:I

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ljava/util/regex/Pattern;)Z
    .locals 3

    .line 49
    iget-object v0, p0, Ll/֫ܽۖ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 53
    :cond_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-static {v1}, Ll/ۘܶܺ;->֫(Z)V

    .line 54
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->end()I

    move-result p1

    iput p1, p0, Ll/֫ܽۖ;->ۧ:I

    return v2
.end method
