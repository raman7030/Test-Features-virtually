.class public final Ll/ۗ᩵᩷;
.super Ljava/lang/Object;
.source "6AY4"


# direct methods
.method public static final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2
    sget v0, Ll/᩵֡᩷;->۟ۧ:I

    .line 1477
    invoke-static {p0}, Ll/ۗۙ᩵;->ۧ(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const-string p0, "."

    return-object p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 1478
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "substring(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toLowerCase(...)"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
