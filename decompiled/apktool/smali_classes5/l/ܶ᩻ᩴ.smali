.class public final Ll/ܶ᩻ᩴ;
.super Ll/ۛܿᩴ;
.source "M1N0"


# instance fields
.field public final synthetic ᩸:Ll/ۤ᩻ᩴ;


# direct methods
.method public constructor <init>(Ll/ۤ᩻ᩴ;)V
    .locals 0

    .line 1194
    iput-object p1, p0, Ll/ܶ᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1235
    iget-object v0, p0, Ll/ܶ᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    invoke-virtual {v0}, Ll/ۤ᩻ᩴ;->clear()V

    return-void
.end method

.method public final contains(I)Z
    .locals 1

    .line 1223
    iget-object v0, p0, Ll/ܶ᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    invoke-virtual {v0, p1}, Ll/ۤ᩻ᩴ;->֫(I)Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/IntConsumer;)V
    .locals 3

    .line 1208
    iget-object v0, p0, Ll/ܶ᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    iget-object v1, v0, Ll/ۤ᩻ᩴ;->ۗ:[I

    .line 1209
    iget-boolean v2, v0, Ll/ۤ᩻ᩴ;->᩹:Z

    if-eqz v2, :cond_0

    iget v2, v0, Ll/ۤ᩻ᩴ;->ۨ:I

    aget v2, v1, v2

    invoke-interface {p1, v2}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 1210
    :cond_0
    iget v0, v0, Ll/ۤ᩻ᩴ;->ۨ:I

    :goto_0
    add-int/lit8 v2, v0, -0x1

    if-eqz v0, :cond_2

    .line 1211
    aget v0, v1, v2

    if-eqz v0, :cond_1

    .line 1212
    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final iterator()Ll/ۜۡᩴ;
    .locals 2

    .line 1197
    new-instance v0, Ll/۠᩻ᩴ;

    iget-object v1, p0, Ll/ܶ᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    invoke-direct {v0, v1}, Ll/۠᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;)V

    return-object v0
.end method

.method public final remove(I)Z
    .locals 2

    .line 1228
    iget-object v0, p0, Ll/ܶ᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    iget v1, v0, Ll/ۤ᩻ᩴ;->᩺:I

    .line 1229
    invoke-virtual {v0, p1}, Ll/ۤ᩻ᩴ;->remove(I)I

    .line 1230
    iget p1, v0, Ll/ۤ᩻ᩴ;->᩺:I

    if-eq p1, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final size()I
    .locals 1

    .line 1218
    iget-object v0, p0, Ll/ܶ᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    iget v0, v0, Ll/ۤ᩻ᩴ;->᩺:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܶ᩻ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 1194
    invoke-virtual {p0}, Ll/ܶ᩻ᩴ;->spliterator()Ll/ܽܺᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܽܺᩴ;
    .locals 2

    .line 1202
    new-instance v0, Ll/᩸᩻ᩴ;

    iget-object v1, p0, Ll/ܶ᩻ᩴ;->᩸:Ll/ۤ᩻ᩴ;

    invoke-direct {v0, v1}, Ll/᩸᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;)V

    return-object v0
.end method
