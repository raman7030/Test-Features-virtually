.class public final Ll/۬۟ܺ;
.super Ljava/lang/Object;
.source "17NL"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ll/ۛ۬ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "\n"

    const-string v1, "\r"

    const-string v2, "\r\n"

    .line 45
    invoke-static {v2, v0, v1}, Ll/ۛ۬ܺ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۛ۬ܺ;

    move-result-object v0

    sput-object v0, Ll/۬۟ܺ;->ۧ:Ll/ۛ۬ܺ;

    return-void
.end method

.method public static ֫(ILjava/lang/String;)I
    .locals 3

    .line 58
    sget-object v0, Ll/۬۟ܺ;->ۧ:Ll/ۛ۬ܺ;

    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 59
    invoke-virtual {p1, v1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 71
    sget-object v0, Ll/۬۟ܺ;->ۧ:Ll/ۛ۬ܺ;

    invoke-virtual {v0}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 72
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 84
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 85
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-eq v1, v2, :cond_2

    const/16 v3, 0xd

    add-int/lit8 v0, v0, 0x1

    if-eq v1, v3, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    if-ne p0, v2, :cond_1

    const-string p0, "\r\n"

    return-object p0

    :cond_1
    const-string p0, "\r"

    return-object p0

    :cond_2
    const-string p0, "\n"

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 1

    .line 51
    sget-object v0, Ll/۬۟ܺ;->ۧ:Ll/ۛ۬ܺ;

    invoke-virtual {v0, p0}, Ll/᩺ۗܺ;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ܿ(Ljava/lang/String;)Ljava/util/Iterator;
    .locals 1

    .line 112
    new-instance v0, Ll/ۗ۟ܺ;

    invoke-direct {v0, p0}, Ll/ۗ۟ܺ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ᩳ(Ljava/lang/String;)Ljava/util/Iterator;
    .locals 1

    .line 119
    new-instance v0, Ll/ۙ۟ܺ;

    invoke-direct {v0, p0}, Ll/ۙ۟ܺ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
