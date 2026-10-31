.class public final synthetic Ll/ۡᩴ᩻;
.super Ljava/lang/Object;
.source "AAGU"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 2
    check-cast p1, Ll/ۙۢ᩻;

    .line 4
    check-cast p2, Ll/ۙۢ᩻;

    .line 6
    sget v0, Ll/ᩴᩴ᩻;->ۨ:I

    .line 199
    invoke-virtual {p1}, Ll/ۙۢ᩻;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    .line 200
    invoke-virtual {p2}, Ll/ۙۢ᩻;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-ne v0, v1, :cond_0

    .line 202
    invoke-virtual {p1}, Ll/ۙۢ᩻;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/ۙۢ᩻;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method
