.class public Ll/ᩴܰ;
.super Ll/ۘܰ;
.source "M4Z7"


# instance fields
.field public ۖ:Ll/ۧ۬;


# direct methods
.method public constructor <init>(Ll/᩸ܰ;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1198
    invoke-direct {p0, p1, p2}, Ll/ۘܰ;-><init>(Ll/᩸ܰ;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 1195
    iput-object p1, p0, Ll/ᩴܰ;->ۖ:Ll/ۧ۬;

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۧ۬;)V
    .locals 0

    .line 1238
    iput-object p1, p0, Ll/ᩴܰ;->ۖ:Ll/ۧ۬;

    return-void
.end method

.method public ۢ()Z
    .locals 1

    .line 1208
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public ۧ()Ll/᩸ܰ;
    .locals 2

    .line 1214
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    .line 148
    invoke-static {v1, v0}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ll/ۧ۬;
    .locals 4

    .line 1226
    iget-object v0, p0, Ll/ᩴܰ;->ۖ:Ll/ۧ۬;

    if-nez v0, :cond_0

    .line 1228
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v1

    .line 1229
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v2

    .line 1230
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v3

    .line 1231
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v0

    .line 1227
    invoke-static {v1, v2, v3, v0}, Ll/ۧ۬;->֫(IIII)Ll/ۧ۬;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴܰ;->ۖ:Ll/ۧ۬;

    .line 1233
    :cond_0
    iget-object v0, p0, Ll/ᩴܰ;->ۖ:Ll/ۧ۬;

    return-object v0
.end method

.method public ܽ()Ll/᩸ܰ;
    .locals 2

    .line 1220
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    .line 148
    invoke-static {v1, v0}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object v0

    return-object v0
.end method
