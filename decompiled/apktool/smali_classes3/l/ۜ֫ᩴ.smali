.class public final Ll/ۜ֫ᩴ;
.super Ll/֡ܰۘ;
.source "97L"


# instance fields
.field public final synthetic ᩸:Ll/᩵֫ᩴ;


# direct methods
.method public constructor <init>(Ll/᩵֫ᩴ;)V
    .locals 0

    .line 1111
    iput-object p1, p0, Ll/ۜ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1152
    iget-object v0, p0, Ll/ۜ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    invoke-virtual {v0}, Ll/᩵֫ᩴ;->clear()V

    return-void
.end method

.method public final iterator()Ll/ܺۧᩴ;
    .locals 2

    .line 1114
    new-instance v0, Ll/᩻֫ᩴ;

    iget-object v1, p0, Ll/ۜ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    invoke-direct {v0, v1}, Ll/᩻֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1135
    iget-object v0, p0, Ll/ۜ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    iget v0, v0, Ll/᩵֫ᩴ;->ۨ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۜ֫ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 1111
    invoke-virtual {p0}, Ll/ۜ֫ᩴ;->spliterator()Ll/ܽܽᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܽܽᩴ;
    .locals 2

    .line 1119
    new-instance v0, Ll/᩷֫ᩴ;

    iget-object v1, p0, Ll/ۜ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    invoke-direct {v0, v1}, Ll/᩷֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    return-object v0
.end method

.method public final ֫(Ll/᩻ۧᩴ;)V
    .locals 3

    .line 1125
    iget-object v0, p0, Ll/ۜ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    iget-object v1, v0, Ll/᩵֫ᩴ;->ۙ:[C

    .line 1126
    iget-boolean v2, v0, Ll/᩵֫ᩴ;->᩸:Z

    if-eqz v2, :cond_0

    iget v2, v0, Ll/᩵֫ᩴ;->ۛ:I

    aget-char v2, v1, v2

    invoke-interface {p1, v2}, Ll/᩻ۧᩴ;->ܽ(C)V

    .line 1127
    :cond_0
    iget v0, v0, Ll/᩵֫ᩴ;->ۛ:I

    :goto_0
    add-int/lit8 v2, v0, -0x1

    if-eqz v0, :cond_2

    .line 1128
    aget-char v0, v1, v2

    if-eqz v0, :cond_1

    .line 1129
    invoke-interface {p1, v0}, Ll/᩻ۧᩴ;->ܽ(C)V

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫(C)Z
    .locals 2

    .line 1145
    iget-object v0, p0, Ll/ۜ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    iget v1, v0, Ll/᩵֫ᩴ;->ۨ:I

    .line 1146
    invoke-virtual {v0, p1}, Ll/᩵֫ᩴ;->ܿ(C)Ljava/lang/Object;

    .line 1147
    iget p1, v0, Ll/᩵֫ᩴ;->ۨ:I

    if-eq p1, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩻(C)Z
    .locals 1

    .line 1140
    iget-object v0, p0, Ll/ۜ֫ᩴ;->᩸:Ll/᩵֫ᩴ;

    invoke-virtual {v0, p1}, Ll/᩵֫ᩴ;->֫(C)Z

    move-result p1

    return p1
.end method
