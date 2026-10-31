.class public final Ll/ܿܳᩴ;
.super Ll/֡᩺ۘ;
.source "1N3"


# instance fields
.field public final synthetic ᩸:Ll/ۚܳᩴ;


# direct methods
.method public constructor <init>(Ll/ۚܳᩴ;)V
    .locals 0

    .line 1306
    iput-object p1, p0, Ll/ܿܳᩴ;->᩸:Ll/ۚܳᩴ;

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1338
    iget-object v0, p0, Ll/ܿܳᩴ;->᩸:Ll/ۚܳᩴ;

    invoke-virtual {v0}, Ll/ۚܳᩴ;->clear()V

    return-void
.end method

.method public final iterator()Ll/۬᩺ۘ;
    .locals 2

    .line 1309
    new-instance v0, Ll/᩵ܳᩴ;

    iget-object v1, p0, Ll/ܿܳᩴ;->᩸:Ll/ۚܳᩴ;

    invoke-direct {v0, v1}, Ll/᩵ܳᩴ;-><init>(Ll/ۚܳᩴ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1328
    iget-object v0, p0, Ll/ܿܳᩴ;->᩸:Ll/ۚܳᩴ;

    iget v0, v0, Ll/ۚܳᩴ;->ۛ:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܿܳᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 2

    .line 1314
    new-instance v0, Ll/֡ܳᩴ;

    iget-object v1, p0, Ll/ܿܳᩴ;->᩸:Ll/ۚܳᩴ;

    invoke-direct {v0, v1}, Ll/֡ܳᩴ;-><init>(Ll/ۚܳᩴ;)V

    return-object v0
.end method

.method public final ۧ(Ll/᩶᩺ۘ;)V
    .locals 4

    .line 1320
    iget-object v0, p0, Ll/ܿܳᩴ;->᩸:Ll/ۚܳᩴ;

    iget-object v1, v0, Ll/ۚܳᩴ;->᩶:[I

    .line 1321
    iget-object v2, v0, Ll/ۚܳᩴ;->ۨ:[B

    .line 1322
    iget-boolean v3, v0, Ll/ۚܳᩴ;->᩸:Z

    if-eqz v3, :cond_0

    iget v3, v0, Ll/ۚܳᩴ;->ۤ:I

    aget-byte v3, v2, v3

    invoke-interface {p1, v3}, Ll/᩶᩺ۘ;->֫(B)V

    .line 1323
    :cond_0
    iget v0, v0, Ll/ۚܳᩴ;->ۤ:I

    :goto_0
    add-int/lit8 v3, v0, -0x1

    if-eqz v0, :cond_2

    aget v0, v1, v3

    if-eqz v0, :cond_1

    aget-byte v0, v2, v3

    invoke-interface {p1, v0}, Ll/᩶᩺ۘ;->֫(B)V

    :cond_1
    move v0, v3

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ܽ(B)Z
    .locals 1

    .line 1333
    iget-object v0, p0, Ll/ܿܳᩴ;->᩸:Ll/ۚܳᩴ;

    invoke-virtual {v0, p1}, Ll/ۚܳᩴ;->֫(B)Z

    move-result p1

    return p1
.end method
