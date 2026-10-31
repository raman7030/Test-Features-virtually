.class public final Ll/ۖ᩶ۜ;
.super Ll/ۙ֫;
.source "Q8UX"


# instance fields
.field public final synthetic ܳ:Ll/ۘ᩶ۜ;


# direct methods
.method public constructor <init>(Ll/ۘ᩶ۜ;)V
    .locals 0

    .line 273
    iput-object p1, p0, Ll/ۖ᩶ۜ;->ܳ:Ll/ۘ᩶ۜ;

    invoke-direct {p0}, Ll/ۙ֫;-><init>()V

    return-void
.end method

.method private ܿ()Ll/ۜ᩶ۜ;
    .locals 2

    .line 277
    invoke-static {}, Ll/᩷᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object v0

    .line 278
    iget-object v1, p0, Ll/ۖ᩶ۜ;->ܳ:Ll/ۘ᩶ۜ;

    invoke-static {v1, v0}, Ll/ۘ᩶ۜ;->֫(Ll/ۘ᩶ۜ;Ll/ۜ᩶ۜ;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 291
    invoke-direct {p0}, Ll/ۖ᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 293
    invoke-virtual {v0}, Ll/ۜ᩶ۜ;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ֫(J)V
    .locals 2

    .line 315
    invoke-direct {p0}, Ll/ۖ᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 938
    iput-boolean v1, v0, Ll/ۜ᩶ۜ;->ܺ:Z

    long-to-int p2, p1

    .line 318
    invoke-virtual {v0, p2}, Ll/ۜ᩶ۜ;->֫(I)V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/content/Intent;)Z
    .locals 2

    const-string v0, "android.intent.extra.KEY_EVENT"

    .line 325
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/view/KeyEvent;

    if-eqz v0, :cond_1

    .line 326
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_1

    .line 327
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x55

    if-ne v0, v1, :cond_1

    .line 328
    invoke-direct {p0}, Ll/ۖ᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 330
    invoke-virtual {p1}, Ll/ۜ᩶ۜ;->ܽ()V

    :cond_0
    const/4 p1, 0x1

    return p1

    .line 335
    :cond_1
    invoke-super {p0, p1}, Ll/ۙ֫;->֫(Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()V
    .locals 1

    .line 283
    invoke-direct {p0}, Ll/ۖ᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 285
    invoke-virtual {v0}, Ll/ۜ᩶ۜ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 299
    invoke-direct {p0}, Ll/ۖ᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 301
    invoke-virtual {v0}, Ll/ۜ᩶ۜ;->ܿ()V

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 307
    invoke-direct {p0}, Ll/ۖ᩶ۜ;->ܿ()Ll/ۜ᩶ۜ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 309
    invoke-virtual {v0}, Ll/ۜ᩶ۜ;->ܳ()V

    :cond_0
    return-void
.end method
