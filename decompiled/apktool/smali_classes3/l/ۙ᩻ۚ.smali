.class public Ll/ۙ᩻ۚ;
.super Ljava/lang/Object;
.source "72QW"

# interfaces
.implements Ll/ᩳ᩻ۚ;


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 36
    check-cast p1, Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x5b

    if-ne v1, v2, :cond_0

    const-string v1, "["

    .line 41
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 43
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 44
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Ll/ۙ᩻ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 0
    invoke-static {v0, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 48
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۙ᩻ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p1
.end method
