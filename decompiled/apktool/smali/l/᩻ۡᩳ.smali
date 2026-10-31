.class public abstract Ll/᩻ۡᩳ;
.super Ljava/lang/Object;
.source "71Y3"


# instance fields
.field public final ֫:Ll/ܿۡᩳ;

.field public final ۧ:Ll/ۚۢᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ll/ܿۡᩳ;Ll/ۚۢᩳ;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Ll/᩻ۡᩳ;->֫:Ll/ܿۡᩳ;

    .line 56
    iput-object p2, p0, Ll/᩻ۡᩳ;->ۧ:Ll/ۚۢᩳ;

    return-void
.end method

.method public static ֫(Ll/ܿۡᩳ;Ll/ۚܽۚ;)Ll/֨ۢۚ;
    .locals 2

    .line 121
    iget-object p0, p0, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    invoke-interface {p1}, Ll/ۚܽۚ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۡ֫ۚ;

    if-nez p0, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    sget-object v0, Ll/ܺۗ֡;->ܿ֫:Ll/ܺۗ֡;

    invoke-interface {p0}, Ll/ۡ֫ۚ;->ܽ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ܺۗ֡;->֫(I)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 126
    :cond_1
    invoke-interface {p0}, Ll/ۡ֫ۚ;->getMethods()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴ֫ۚ;

    .line 127
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 92
    sget-object p0, Ll/ܺۗ֡;->ܿ֫:Ll/ܺۗ֡;

    invoke-interface {v0}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܺۗ֡;->֫(I)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    .line 130
    :cond_3
    check-cast v0, Ll/֨ۢۚ;

    return-object v0

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/۫ۘܽ;
    .locals 7

    const/16 v0, 0x2a

    .line 301
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const-string v2, ""

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    const/16 v0, 0x10

    .line 302
    invoke-static {v0, p0}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object p0

    invoke-virtual {p0, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p0

    return-object p0

    .line 304
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x0

    .line 305
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_3

    .line 306
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v0, :cond_1

    const-string v5, ".+"

    .line 308
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v6, ".^$[]*+?|(){}\\"

    .line 309
    invoke-virtual {v6, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-eq v6, v3, :cond_2

    const/16 v6, 0x5c

    .line 310
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 312
    :cond_2
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 315
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object p0

    invoke-virtual {p0, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۚܽۚ;Ll/ۚܽۚ;)Z
    .locals 2

    .line 296
    invoke-interface {p0}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 297
    invoke-interface {p0}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p1}, Ll/ۚܽۚ;->ۘ()Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Ll/֨᩵ۚ;->֫(Ljava/util/List;Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "L"

    .line 81
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 83
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2f

    const/16 v1, 0x2e

    .line 84
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract ֫()Ljava/lang/String;
.end method

.method public abstract ֫(Ll/۟ۤ;)Z
.end method
