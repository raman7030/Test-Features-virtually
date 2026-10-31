.class public final Ll/ܺۧᩳ;
.super Ljava/lang/Object;
.source "56B1"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ᩸:Ll/ۖۧᩳ;


# direct methods
.method public constructor <init>(Ll/ۖۧᩳ;)V
    .locals 0

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۧᩳ;->᩸:Ll/ۖۧᩳ;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1

    .line 119
    iget-object p1, p0, Ll/ܺۧᩳ;->᩸:Ll/ۖۧᩳ;

    iget-object p1, p1, Ll/ۖۧᩳ;->ۜ:Ll/ۚۧᩳ;

    invoke-static {p1}, Ll/ۚۧᩳ;->ۜ(Ll/ۚۧᩳ;)Ll/ۧ۟ܽ;

    move-result-object p2

    const/4 p4, 0x0

    invoke-virtual {p2, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    .line 120
    invoke-static {p1}, Ll/ۚۧᩳ;->ۜ(Ll/ۚۧᩳ;)Ll/ۧ۟ܽ;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    .line 121
    invoke-static {p1}, Ll/ۚۧᩳ;->ۜ(Ll/ۚۧᩳ;)Ll/ۧ۟ܽ;

    move-result-object p5

    invoke-virtual {p5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 122
    invoke-static {p1}, Ll/ۚۧᩳ;->ܳ(Ll/ۚۧᩳ;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p3, p2, :cond_2

    .line 123
    invoke-static {p1}, Ll/ۚۧᩳ;->ܳ(Ll/ۚۧᩳ;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֨ۧᩳ;

    .line 125
    invoke-static {p2}, Ll/ۚۧᩳ;->֫(Ll/֨ۧᩳ;)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 127
    sget-object p5, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p5}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p5

    const-string v0, "auto_translation_record"

    .line 128
    invoke-interface {p5, v0, p3}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p3

    .line 129
    invoke-interface {p3}, Ll/۬ۤۡ;->apply()V

    .line 132
    :cond_0
    invoke-static {p1}, Ll/ۚۧᩳ;->ۜ(Ll/ۚۧᩳ;)Ll/ۧ۟ܽ;

    move-result-object p3

    invoke-virtual {p2, p3}, Ll/֨ۧᩳ;->֫(Ll/ۧ۟ܽ;)V

    .line 133
    invoke-virtual {p2}, Ll/֨ۧᩳ;->᩷()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 134
    invoke-static {p1}, Ll/ۚۧᩳ;->᩻(Ll/ۚۧᩳ;)Landroid/widget/CheckBox;

    move-result-object p1

    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 136
    :cond_1
    invoke-static {p1}, Ll/ۚۧᩳ;->᩻(Ll/ۚۧᩳ;)Landroid/widget/CheckBox;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 138
    :cond_2
    invoke-static {p1}, Ll/ۚۧᩳ;->᩻(Ll/ۚۧᩳ;)Landroid/widget/CheckBox;

    move-result-object p1

    invoke-virtual {p1, p4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 2

    .line 145
    iget-object p1, p0, Ll/ܺۧᩳ;->᩸:Ll/ۖۧᩳ;

    iget-object p1, p1, Ll/ۖۧᩳ;->ۜ:Ll/ۚۧᩳ;

    invoke-static {p1}, Ll/ۚۧᩳ;->ۜ(Ll/ۚۧᩳ;)Ll/ۧ۟ܽ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 146
    invoke-static {p1}, Ll/ۚۧᩳ;->ۜ(Ll/ۚۧᩳ;)Ll/ۧ۟ܽ;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    .line 147
    invoke-static {p1}, Ll/ۚۧᩳ;->ۜ(Ll/ۚۧᩳ;)Ll/ۧ۟ܽ;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method
