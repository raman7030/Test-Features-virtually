.class public final synthetic Ll/ۗ᩵ۢ;
.super Ljava/lang/Object;
.source "I7BH"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 4

    .line 2
    check-cast p1, Ll/۟᩵ۢ;

    .line 1161
    invoke-static {p1}, Ll/۟᩵ۢ;->ܳ(Ll/۟᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    .line 1165
    :goto_0
    invoke-static {p1}, Ll/۟᩵ۢ;->ܳ(Ll/۟᩵ۢ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 1166
    invoke-static {p1}, Ll/۟᩵ۢ;->ܳ(Ll/۟᩵ۢ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method
