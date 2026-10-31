.class public final Ll/ۧۙܳ;
.super Landroid/widget/BaseAdapter;
.source "X5LN"


# instance fields
.field public final synthetic ᩶:Ll/ܽۢܳ;

.field public final synthetic ᩸:Ll/ۢۢۡ;

.field public final synthetic ᩹:Ll/ܽۙܳ;


# direct methods
.method public constructor <init>(Ll/ܽۙܳ;Ll/ܽۢܳ;Ll/ۢۢۡ;)V
    .locals 0

    .line 792
    iput-object p1, p0, Ll/ۧۙܳ;->᩹:Ll/ܽۙܳ;

    iput-object p2, p0, Ll/ۧۙܳ;->᩶:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/ۧۙܳ;->᩸:Ll/ۢۢۡ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 795
    iget-object v0, p0, Ll/ۧۙܳ;->᩹:Ll/ܽۙܳ;

    iget-object v0, v0, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 812
    iget-object v0, p0, Ll/ۧۙܳ;->᩶:Ll/ܽۢܳ;

    if-nez p2, :cond_0

    .line 813
    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d016a

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 814
    new-instance p3, Ll/ܿۙܳ;

    invoke-direct {p3, v2}, Ll/ܿۙܳ;-><init>(I)V

    const v1, 0x7f0a0631

    .line 815
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p3, Ll/ܿۙܳ;->ܽ:Landroid/widget/TextView;

    const v1, 0x7f0a0534

    .line 816
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p3, Ll/ܿۙܳ;->ۧ:Landroid/widget/TextView;

    const v1, 0x7f0a0535

    .line 817
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p3, Ll/ܿۙܳ;->ᩳ:Landroid/widget/TextView;

    const v1, 0x7f0a01e9

    .line 818
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p3, Ll/ܿۙܳ;->֫:Landroid/widget/ImageView;

    .line 819
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 821
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܿۙܳ;

    .line 822
    :goto_0
    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    .line 823
    iget-object v1, p0, Ll/ۧۙܳ;->᩹:Ll/ܽۙܳ;

    iget-object v2, v1, Ll/ܽۙܳ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->ۗ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 824
    iget-object v1, v1, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫ۙܳ;

    .line 825
    iget-object v1, p3, Ll/ܿۙܳ;->ܽ:Landroid/widget/TextView;

    invoke-virtual {p1}, Ll/۫ۙܳ;->ۧ()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x64

    invoke-static {v3, v2}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 826
    invoke-virtual {p1}, Ll/۫ۙܳ;->֫()Ll/ᩳۜܳ;

    move-result-object v1

    .line 827
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll/ܿۤۡ;->ܽ(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 828
    invoke-interface {v1}, Ll/ᩳۜܳ;->᩸֫()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "  "

    .line 829
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 831
    :cond_1
    iget-object v1, p3, Ll/ܿۙܳ;->ۧ:Landroid/widget/TextView;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 832
    iget-object v1, p3, Ll/ܿۙܳ;->ᩳ:Landroid/widget/TextView;

    invoke-virtual {p1}, Ll/۫ۙܳ;->ܽ()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xfa

    invoke-static {v3, v2}, Ll/ۜۚۜ;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 833
    iget-object p3, p3, Ll/ܿۙܳ;->֫:Landroid/widget/ImageView;

    invoke-static {}, Ll/ܳۙܳ;->ۧ()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iget-object v2, p0, Ll/ۧۙܳ;->᩸:Ll/ۢۢۡ;

    invoke-virtual {p1, v0, p3, v1, v2}, Ll/۫ۙܳ;->֫(Ll/ܽ᩷ܳ;Landroid/widget/ImageView;Ljava/util/concurrent/ExecutorService;Ll/ۢۢۡ;)V

    .line 834
    iget-boolean p1, p1, Ll/۫ۙܳ;->֫:Z

    if-eqz p1, :cond_2

    const/high16 p1, 0x3f000000    # 0.5f

    goto :goto_1

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_1
    invoke-virtual {p2, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_3
    return-object p2
.end method
