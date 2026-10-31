.class public abstract Ll/ۜ᩺ᩴ;
.super Ll/ۛ᩺ᩴ;
.source "N673"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 644
    const-class v0, Ll/ۛ᩺ᩴ;

    return-void
.end method


# virtual methods
.method public final p0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final parallel()Ll/ۧ᩺ᩴ;
    .locals 2

    .line 311
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/۫᩺ᩴ;->r:Z

    return-object p0
.end method

.method public final sequential()Ll/ۧ᩺ᩴ;
    .locals 2

    .line 304
    iget-object v0, p0, Ll/۫᩺ᩴ;->h:Ll/۫᩺ᩴ;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/۫᩺ᩴ;->r:Z

    return-object p0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 644
    invoke-virtual {p0}, Ll/ۛ᩺ᩴ;->spliterator()Ll/ᩴ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final unordered()Ll/۫ۨᩴ;
    .locals 3

    .line 513
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    iget v1, p0, Ll/۫᩺ᩴ;->m:I

    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 345
    :cond_0
    new-instance v0, Ll/ܰᩳ᩵;

    sget v1, Ll/۟۟ᩴ;->r:I

    const/4 v2, 0x1

    .line 91
    invoke-direct {v0, p0, v1, v2}, Ll/ܰᩳ᩵;-><init>(Ll/۫᩺ᩴ;II)V

    return-object v0
.end method
