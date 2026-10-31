.class public final Ll/ᩳ֫᩻;
.super Ll/۬ۗܿ;
.source "SAKA"


# instance fields
.field public final synthetic ֫֫:Landroid/widget/CheckBox;

.field public final synthetic ۟:Ll/᩻֫᩻;

.field public final synthetic ۧ֫:Landroid/widget/CheckBox;

.field public final synthetic ܽ֫:Ll/֨۠ᩳ;

.field public final synthetic ᩳ֫:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/᩻֫᩻;Lbin/mt/plus/Main;Landroid/view/View;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/֨۠ᩳ;)V
    .locals 0

    .line 54
    iput-object p1, p0, Ll/ᩳ֫᩻;->۟:Ll/᩻֫᩻;

    iput-object p3, p0, Ll/ᩳ֫᩻;->ᩳ֫:Landroid/view/View;

    iput-object p4, p0, Ll/ᩳ֫᩻;->֫֫:Landroid/widget/CheckBox;

    iput-object p5, p0, Ll/ᩳ֫᩻;->ۧ֫:Landroid/widget/CheckBox;

    iput-object p6, p0, Ll/ᩳ֫᩻;->ܽ֫:Ll/֨۠ᩳ;

    const p4, 0x7f12020f

    invoke-direct {p0, p2, p4}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    .line 56
    invoke-static {p1}, Ll/᩻֫᩻;->֫(Ll/᩻֫᩻;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 57
    invoke-virtual {p0}, Ll/۬ۗܿ;->᩻()Landroid/widget/FrameLayout;

    move-result-object p1

    const/4 p2, 0x0

    .line 58
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 59
    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 8

    .line 65
    iget-object v1, p0, Ll/ᩳ֫᩻;->۟:Ll/᩻֫᩻;

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 67
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 70
    :cond_0
    invoke-static {v0}, Ll/ܿۤۡ;->ۧ(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    const v0, 0x7f12022a

    .line 72
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 76
    :cond_1
    :try_start_0
    invoke-static {v1}, Ll/᩻֫᩻;->ᩳ(Ll/᩻֫᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->֨()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ll/ܽ֨ۢ;->ۗ:Ll/ܽ֨ۢ;

    invoke-static {v0, v4}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V
    :try_end_0
    .catch Ll/֫ۛۡ; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    invoke-static {v1}, Ll/᩻֫᩻;->֫(Ll/᩻֫᩻;)Z

    move-result v0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ᩳ֫᩻;->֫֫:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 82
    :goto_0
    invoke-static {v1}, Ll/᩻֫᩻;->֫(Ll/᩻֫᩻;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ᩳ֫᩻;->ۧ֫:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    const/4 v5, 0x1

    :cond_3
    const/4 v0, 0x0

    .line 83
    invoke-static {v1}, Ll/᩻֫᩻;->ܽ(Ll/᩻֫᩻;)Z

    move-result v6

    if-nez v6, :cond_4

    if-nez v4, :cond_4

    if-nez v5, :cond_4

    invoke-static {v1}, Ll/᩻֫᩻;->ۧ(Ll/᩻֫᩻;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v6

    cmp-long v0, v2, v6

    if-eqz v0, :cond_5

    .line 101
    :cond_4
    new-instance v7, Ll/ܿ֫᩻;

    iget-object v6, p0, Ll/ᩳ֫᩻;->ܽ֫:Ll/֨۠ᩳ;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/ܿ֫᩻;-><init>(Ll/᩻֫᩻;JZZLl/֨۠ᩳ;)V

    .line 191
    invoke-virtual {v7}, Ll/۟ܶۡ;->᩻()V

    .line 86
    :cond_5
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :catch_0
    move-exception v0

    .line 78
    invoke-static {v1}, Ll/᩻֫᩻;->ᩳ(Ll/᩻֫᩻;)Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method
