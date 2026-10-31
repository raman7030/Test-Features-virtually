.class public final Ll/᩵ۜ᩻;
.super Ll/۬ۗܿ;
.source "TAHS"


# instance fields
.field public final synthetic ֫֫:Landroid/widget/CheckBox;

.field public final synthetic ۟:Ll/۠ۜ᩻;

.field public final synthetic ۧ֫:Landroid/widget/CheckBox;

.field public final synthetic ܽ֫:Ll/᩷᩷᩻;

.field public final synthetic ᩳ֫:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/۠ۜ᩻;Lbin/mt/plus/Main;Landroid/view/View;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/᩷᩷᩻;)V
    .locals 0

    .line 50
    iput-object p1, p0, Ll/᩵ۜ᩻;->۟:Ll/۠ۜ᩻;

    iput-object p3, p0, Ll/᩵ۜ᩻;->ᩳ֫:Landroid/view/View;

    iput-object p4, p0, Ll/᩵ۜ᩻;->֫֫:Landroid/widget/CheckBox;

    iput-object p5, p0, Ll/᩵ۜ᩻;->ۧ֫:Landroid/widget/CheckBox;

    iput-object p6, p0, Ll/᩵ۜ᩻;->ܽ֫:Ll/᩷᩷᩻;

    const p4, 0x7f12020f

    invoke-direct {p0, p2, p4}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    .line 52
    invoke-static {p1}, Ll/۠ۜ᩻;->֫(Ll/۠ۜ᩻;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 53
    invoke-virtual {p0}, Ll/۬ۗܿ;->᩻()Landroid/widget/FrameLayout;

    move-result-object p1

    const/4 p2, 0x0

    .line 54
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 55
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 8

    .line 61
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 63
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 66
    :cond_0
    invoke-static {v0}, Ll/ܿۤۡ;->ۧ(Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v0, 0x0

    cmp-long v2, v4, v0

    if-gez v2, :cond_1

    const v0, 0x7f12022a

    .line 68
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 71
    :cond_1
    iget-object v2, p0, Ll/᩵ۜ᩻;->۟:Ll/۠ۜ᩻;

    invoke-static {v2}, Ll/۠ۜ᩻;->֫(Ll/۠ۜ᩻;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩵ۜ᩻;->֫֫:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    const/4 v6, 0x0

    .line 72
    :goto_0
    invoke-static {v2}, Ll/۠ۜ᩻;->֫(Ll/۠ۜ᩻;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/᩵ۜ᩻;->ۧ֫:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    const/4 v7, 0x0

    .line 73
    :goto_1
    invoke-static {v2}, Ll/۠ۜ᩻;->ܽ(Ll/۠ۜ᩻;)Z

    move-result v0

    if-nez v0, :cond_4

    if-nez v6, :cond_4

    if-nez v7, :cond_4

    invoke-static {v2}, Ll/۠ۜ᩻;->ۧ(Ll/۠ۜ᩻;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v0

    cmp-long v3, v4, v0

    if-eqz v3, :cond_5

    .line 74
    :cond_4
    iget-object v3, p0, Ll/᩵ۜ᩻;->ܽ֫:Ll/᩷᩷᩻;

    invoke-static/range {v2 .. v7}, Ll/۠ۜ᩻;->֫(Ll/۠ۜ᩻;Ll/᩷᩷᩻;JZZ)V

    .line 76
    :cond_5
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
