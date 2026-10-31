.class public final Ll/ۙܿܽ;
.super Ll/ۛᩳܽ;
.source "Y4TR"


# instance fields
.field public ۗ:Ll/ۗܿܽ;


# direct methods
.method public constructor <init>(Ll/ᩴܿܽ;III)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Ll/ۛᩳܽ;-><init>(Ll/᩷ᩳܽ;)V

    .line 18
    iput p2, p0, Ll/ۛᩳܽ;->᩹:I

    .line 19
    iput p3, p0, Ll/ۛᩳܽ;->ۙ:I

    .line 20
    iput p4, p0, Ll/ۛᩳܽ;->᩶:I

    return-void
.end method

.method public constructor <init>(Ll/ᩴܿܽ;Ljava/lang/String;[Ll/᩸᩻ܽ;I)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Ll/ۛᩳܽ;-><init>(Ll/᩷ᩳܽ;)V

    .line 87
    invoke-super {p0}, Ll/ۛᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object p1

    check-cast p1, Ll/ۡܿܽ;

    .line 25
    invoke-virtual {p1}, Ll/ۡܿܽ;->᩻ۧ()Ll/۬ܿܽ;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Ll/۬ܿܽ;->֫(Ljava/lang/String;[Ll/᩸᩻ܽ;)Ll/ۗܿܽ;

    move-result-object p1

    iput-object p1, p0, Ll/ۙܿܽ;->ۗ:Ll/ۗܿܽ;

    const/4 p1, 0x3

    .line 26
    iput p1, p0, Ll/ۛᩳܽ;->ۙ:I

    .line 27
    iput p4, p0, Ll/ۛᩳܽ;->᩶:I

    return-void
.end method


# virtual methods
.method public final getEntry()Ll/ᩴܿܽ;
    .locals 1

    .line 107
    invoke-super {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩴܿܽ;

    return-object v0
.end method

.method public final getEntry()Ll/᩷᩻ܽ;
    .locals 1

    .line 107
    invoke-super {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩴܿܽ;

    return-object v0
.end method

.method public final getValue()I
    .locals 2

    .line 39
    invoke-virtual {p0}, Ll/ۛᩳܽ;->ۖ()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۙܿܽ;->ۗ:Ll/ۗܿܽ;

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {v0}, Ll/ۗܿܽ;->ܳ()I

    move-result v0

    return v0

    .line 41
    :cond_0
    invoke-super {p0}, Ll/ۛᩳܽ;->getValue()I

    move-result v0

    return v0
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 87
    invoke-super {p0}, Ll/ۛᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۡܿܽ;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 54
    iput p1, p0, Ll/ۛᩳܽ;->᩹:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;[Ll/᩸᩻ܽ;)V
    .locals 1

    .line 87
    invoke-super {p0}, Ll/ۛᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۡܿܽ;

    .line 49
    invoke-virtual {v0}, Ll/ۡܿܽ;->᩻ۧ()Ll/۬ܿܽ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/۬ܿܽ;->֫(Ljava/lang/String;[Ll/᩸᩻ܽ;)Ll/ۗܿܽ;

    move-result-object p1

    iput-object p1, p0, Ll/ۙܿܽ;->ۗ:Ll/ۗܿܽ;

    const/4 p1, 0x3

    .line 50
    iput p1, p0, Ll/ۛᩳܽ;->ۙ:I

    return-void
.end method

.method public final ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 92
    invoke-super {p0}, Ll/ۛᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/۠ܿܽ;

    return-object v0
.end method

.method public final ܿۧ()Ll/ۗܿܽ;
    .locals 2

    .line 69
    iget-object v0, p0, Ll/ۙܿܽ;->ۗ:Ll/ۗܿܽ;

    if-eqz v0, :cond_0

    return-object v0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "stringItem == null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final bridge synthetic ܿۧ()Ll/ۗ᩻ܽ;
    .locals 1

    .line 13
    invoke-virtual {p0}, Ll/ۙܿܽ;->ܿۧ()Ll/ۗܿܽ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(I)V
    .locals 0

    .line 64
    iput p1, p0, Ll/ۛᩳܽ;->᩶:I

    return-void
.end method

.method public final ᩷֫()I
    .locals 4

    .line 107
    invoke-super {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩴܿܽ;

    .line 77
    invoke-virtual {v0}, Ll/ᩴܿܽ;->ܽ֫()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 79
    invoke-virtual {v0, v2}, Ll/ᩴܿܽ;->getValue(I)Ll/ۙܿܽ;

    move-result-object v3

    if-ne v3, p0, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public final ᩻(I)V
    .locals 1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    .line 58
    iget-object v0, p0, Ll/ۙܿܽ;->ۗ:Ll/ۗܿܽ;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 59
    iput-object v0, p0, Ll/ۙܿܽ;->ۗ:Ll/ۗܿܽ;

    .line 60
    :cond_0
    iput p1, p0, Ll/ۛᩳܽ;->ۙ:I

    return-void
.end method
