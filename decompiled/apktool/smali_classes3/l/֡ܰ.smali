.class public Ll/֡ܰ;
.super Ll/᩵ܰ;
.source "M4Z7"


# instance fields
.field public ۘ:Ll/ۧ۬;

.field public ᩴ:Ll/ۧ۬;

.field public ᩵:Ll/ۧ۬;


# direct methods
.method public constructor <init>(Ll/᩸ܰ;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1289
    invoke-direct {p0, p1, p2}, Ll/᩵ܰ;-><init>(Ll/᩸ܰ;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 1284
    iput-object p1, p0, Ll/֡ܰ;->ᩴ:Ll/ۧ۬;

    .line 1285
    iput-object p1, p0, Ll/֡ܰ;->ۘ:Ll/ۧ۬;

    .line 1286
    iput-object p1, p0, Ll/֡ܰ;->᩵:Ll/ۧ۬;

    return-void
.end method


# virtual methods
.method public ֫(IIII)Ll/᩸ܰ;
    .locals 1

    .line 1327
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    .line 148
    invoke-static {p2, p1}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ۧ۬;)V
    .locals 0

    return-void
.end method

.method public ܿ()Ll/ۧ۬;
    .locals 1

    .line 1308
    iget-object v0, p0, Ll/֡ܰ;->ۘ:Ll/ۧ۬;

    if-nez v0, :cond_0

    .line 1309
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    .line 1310
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۬;->֫(Landroid/graphics/Insets;)Ll/ۧ۬;

    move-result-object v0

    iput-object v0, p0, Ll/֡ܰ;->ۘ:Ll/ۧ۬;

    .line 1312
    :cond_0
    iget-object v0, p0, Ll/֡ܰ;->ۘ:Ll/ۧ۬;

    return-object v0
.end method

.method public ᩷()Ll/ۧ۬;
    .locals 1

    .line 1318
    iget-object v0, p0, Ll/֡ܰ;->᩵:Ll/ۧ۬;

    if-nez v0, :cond_0

    .line 1319
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۬;->֫(Landroid/graphics/Insets;)Ll/ۧ۬;

    move-result-object v0

    iput-object v0, p0, Ll/֡ܰ;->᩵:Ll/ۧ۬;

    .line 1321
    :cond_0
    iget-object v0, p0, Ll/֡ܰ;->᩵:Ll/ۧ۬;

    return-object v0
.end method

.method public ᩻()Ll/ۧ۬;
    .locals 1

    .line 1299
    iget-object v0, p0, Ll/֡ܰ;->ᩴ:Ll/ۧ۬;

    if-nez v0, :cond_0

    .line 1300
    iget-object v0, p0, Ll/ۘܰ;->ᩳ:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۬;->֫(Landroid/graphics/Insets;)Ll/ۧ۬;

    move-result-object v0

    iput-object v0, p0, Ll/֡ܰ;->ᩴ:Ll/ۧ۬;

    .line 1302
    :cond_0
    iget-object v0, p0, Ll/֡ܰ;->ᩴ:Ll/ۧ۬;

    return-object v0
.end method
