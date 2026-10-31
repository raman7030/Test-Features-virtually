.class public Ll/᩺֡ᩳ;
.super Ljava/lang/Object;
.source "RAP3"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ۗ:Ll/ۤۤᩳ;

.field public final synthetic ۙ:Ll/ۤۤᩳ;

.field public final synthetic ᩶:Ll/ܶܳܿ;

.field public ᩸:Ll/ۡۤۡ;

.field public final synthetic ᩹:Ll/֫ܿܿ;


# direct methods
.method public constructor <init>(Ll/ܶܳܿ;Ll/ۤۤᩳ;Ll/ۤۤᩳ;Ll/֫ܿܿ;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺֡ᩳ;->᩶:Ll/ܶܳܿ;

    iput-object p2, p0, Ll/᩺֡ᩳ;->ۗ:Ll/ۤۤᩳ;

    iput-object p3, p0, Ll/᩺֡ᩳ;->ۙ:Ll/ۤۤᩳ;

    iput-object p4, p0, Ll/᩺֡ᩳ;->᩹:Ll/֫ܿܿ;

    .line 63
    invoke-static {}, Ll/ۡۤۡ;->ܿ()Ll/ۡۤۡ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺֡ᩳ;->᩸:Ll/ۡۤۡ;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 68
    iget-object v0, p0, Ll/᩺֡ᩳ;->᩶:Ll/ܶܳܿ;

    invoke-virtual {v0}, Ll/ܶܳܿ;->ܽ()Ll/ۧܿܿ;

    move-result-object v0

    .line 69
    iget-object v1, p0, Ll/᩺֡ᩳ;->ۗ:Ll/ۤۤᩳ;

    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    move-result v2

    iget-object v3, p0, Ll/᩺֡ᩳ;->᩸:Ll/ۡۤۡ;

    iget-object v4, p0, Ll/᩺֡ᩳ;->ۙ:Ll/ۤۤᩳ;

    if-nez v2, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->hasFocus()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 70
    :cond_0
    invoke-virtual {v0}, Ll/ۧܿܿ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 71
    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v4

    .line 72
    :goto_0
    invoke-virtual {v0}, Ll/ۧܿܿ;->᩻()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v3}, Ll/ۡۤۡ;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v0, p1, v1}, Ll/ۧܿܿ;->֫(Landroid/view/View;Ll/ۤۤᩳ;)V

    return-void

    .line 79
    :cond_3
    invoke-virtual {v0}, Ll/ۧܿܿ;->᩻()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v3}, Ll/ۡۤۡ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    return-void

    .line 82
    :cond_4
    iget-object v1, p0, Ll/᩺֡ᩳ;->᩹:Ll/֫ܿܿ;

    invoke-virtual {v0, p1, v1}, Ll/ۧܿܿ;->֫(Landroid/view/View;Ll/֫ܿܿ;)V

    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 5
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 88
    iget-object v0, p0, Ll/᩺֡ᩳ;->᩶:Ll/ܶܳܿ;

    invoke-virtual {v0}, Ll/ܶܳܿ;->ۧ()Ll/ۧܿܿ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 92
    :cond_0
    iget-object v1, p0, Ll/᩺֡ᩳ;->ۗ:Ll/ۤۤᩳ;

    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    move-result v2

    const/4 v3, 0x1

    iget-object v4, p0, Ll/᩺֡ᩳ;->ۙ:Ll/ۤۤᩳ;

    if-nez v2, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->hasFocus()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 93
    :cond_1
    invoke-virtual {v0}, Ll/ۧܿܿ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 94
    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v4

    .line 95
    :goto_0
    invoke-virtual {v0, p1, v1}, Ll/ۧܿܿ;->֫(Landroid/view/View;Ll/ۤۤᩳ;)V

    return v3

    .line 99
    :cond_3
    iget-object v1, p0, Ll/᩺֡ᩳ;->᩹:Ll/֫ܿܿ;

    invoke-virtual {v0, p1, v1}, Ll/ۧܿܿ;->֫(Landroid/view/View;Ll/֫ܿܿ;)V

    return v3
.end method
