.class public Ll/ᩳܳۘ;
.super Ll/ܿܳۘ;
.source "01M8"


# instance fields
.field public ܳ:Ll/ۛܳۘ;

.field public ܿ:Ll/ۛܳۘ;


# virtual methods
.method public ֫(IIII)V
    .locals 1

    .line 343
    new-instance v0, Ll/ۛܳۘ;

    sub-int/2addr p3, p1

    sub-int/2addr p4, p2

    invoke-direct {v0, p1, p2, p3, p4}, Ll/ۛܳۘ;-><init>(IIII)V

    .line 344
    iget-object p1, p0, Ll/ᩳܳۘ;->ܳ:Ll/ۛܳۘ;

    if-eqz p1, :cond_0

    .line 345
    iput-object v0, p1, Ll/ۛܳۘ;->ܿ:Ll/ۛܳۘ;

    goto :goto_0

    .line 347
    :cond_0
    iput-object v0, p0, Ll/ᩳܳۘ;->ܿ:Ll/ۛܳۘ;

    .line 349
    :goto_0
    iput-object v0, p0, Ll/ᩳܳۘ;->ܳ:Ll/ۛܳۘ;

    return-void
.end method

.method public final ܳ()Ll/֫ܳۘ;
    .locals 4

    .line 354
    invoke-virtual {p0}, Ll/ܿܳۘ;->֫()V

    .line 355
    iget-object v0, p0, Ll/ᩳܳۘ;->ܿ:Ll/ۛܳۘ;

    invoke-virtual {p0}, Ll/ܿܳۘ;->ᩳ()I

    move-result v1

    invoke-virtual {p0}, Ll/ܿܳۘ;->ܿ()I

    move-result v2

    .line 73
    new-instance v3, Ll/᩺ܿۘ;

    invoke-direct {v3, v0, v1, v2}, Ll/᩺ܿۘ;-><init>(Ll/ۛܳۘ;II)V

    return-object v3
.end method
