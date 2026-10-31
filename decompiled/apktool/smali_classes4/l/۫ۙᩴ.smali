.class public final Ll/۫ۙᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ۖۗᩴ;


# instance fields
.field public final synthetic a:Ll/۬᩹ᩴ;

.field public final synthetic b:Ll/ۖۗᩴ;

.field public final synthetic c:Ll/ۖ᩶ᩴ;

.field public final synthetic d:Ll/ۚ᩹ᩴ;


# direct methods
.method public constructor <init>(Ll/۬᩹ᩴ;Ll/ۖۗᩴ;Ll/ۖ᩶ᩴ;Ll/ۚ᩹ᩴ;)V
    .locals 0

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۙᩴ;->a:Ll/۬᩹ᩴ;

    iput-object p2, p0, Ll/۫ۙᩴ;->b:Ll/ۖۗᩴ;

    iput-object p3, p0, Ll/۫ۙᩴ;->c:Ll/ۖ᩶ᩴ;

    iput-object p4, p0, Ll/۫ۙᩴ;->d:Ll/ۚ᩹ᩴ;

    return-void
.end method


# virtual methods
.method public final G(Ll/ۤۗᩴ;)J
    .locals 2

    .line 202
    iget-object v0, p0, Ll/۫ۙᩴ;->a:Ll/۬᩹ᩴ;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/ۤۗᩴ;->isDateBased()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 203
    invoke-interface {v0, p1}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 205
    :cond_0
    iget-object v0, p0, Ll/۫ۙᩴ;->b:Ll/ۖۗᩴ;

    invoke-interface {v0, p1}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 1

    .line 210
    sget-object v0, Ll/ۛۗᩴ;->b:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_0

    .line 211
    iget-object p1, p0, Ll/۫ۙᩴ;->c:Ll/ۖ᩶ᩴ;

    return-object p1

    .line 213
    :cond_0
    sget-object v0, Ll/ۛۗᩴ;->a:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_1

    .line 214
    iget-object p1, p0, Ll/۫ۙᩴ;->d:Ll/ۚ᩹ᩴ;

    return-object p1

    .line 216
    :cond_1
    sget-object v0, Ll/ۛۗᩴ;->c:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_2

    .line 217
    iget-object v0, p0, Ll/۫ۙᩴ;->b:Ll/ۖۗᩴ;

    invoke-interface {v0, p1}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 219
    :cond_2
    invoke-virtual {p1, p0}, Ll/ۡ֨ᩴ;->h(Ll/ۖۗᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 2

    .line 188
    iget-object v0, p0, Ll/۫ۙᩴ;->a:Ll/۬᩹ᩴ;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/ۤۗᩴ;->isDateBased()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 189
    invoke-interface {v0, p1}, Ll/۬᩹ᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result p1

    return p1

    .line 191
    :cond_0
    iget-object v0, p0, Ll/۫ۙᩴ;->b:Ll/ۖۗᩴ;

    invoke-interface {v0, p1}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result p1

    return p1
.end method

.method public final synthetic l(Ll/ۤۗᩴ;)I
    .locals 0

    invoke-static {p0, p1}, Ll/ۛۗᩴ;->a(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 2

    .line 195
    iget-object v0, p0, Ll/۫ۙᩴ;->a:Ll/۬᩹ᩴ;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/ۤۗᩴ;->isDateBased()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 196
    invoke-interface {v0, p1}, Ll/ۖۗᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 198
    :cond_0
    iget-object v0, p0, Ll/۫ۙᩴ;->b:Ll/ۖۗᩴ;

    invoke-interface {v0, p1}, Ll/ۖۗᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    const-string v0, ""

    .line 225
    iget-object v1, p0, Ll/۫ۙᩴ;->c:Ll/ۖ᩶ᩴ;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, " with chronology "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    .line 226
    :goto_0
    iget-object v2, p0, Ll/۫ۙᩴ;->d:Ll/ۚ᩹ᩴ;

    if-eqz v2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, " with zone "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Ll/۫ۙᩴ;->b:Ll/ۖۗᩴ;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
