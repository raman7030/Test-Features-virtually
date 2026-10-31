.class public final Ll/۫᩹ܳ;
.super Ll/᩶ۗۧ;
.source "164Z"


# instance fields
.field public ֫:Ll/֡ۚۢ;

.field public ۧ:Ll/֫ۗۧ;

.field public final ܳ:Ljava/util/ArrayList;

.field public ܽ:Ll/ۛ᩹ܳ;

.field public final synthetic ܿ:Ll/ܽ᩶ܳ;

.field public final ᩳ:Ll/۬۬ۧ;


# direct methods
.method public constructor <init>(Ll/ܽ᩶ܳ;Ll/۬۬ۧ;Ljava/util/ArrayList;)V
    .locals 0

    .line 993
    iput-object p1, p0, Ll/۫᩹ܳ;->ܿ:Ll/ܽ᩶ܳ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 994
    iput-object p2, p0, Ll/۫᩹ܳ;->ᩳ:Ll/۬۬ۧ;

    .line 995
    iput-object p3, p0, Ll/۫᩹ܳ;->ܳ:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic ֫(Ll/۫᩹ܳ;)V
    .locals 2

    .line 1002
    iget-object v0, p0, Ll/۫᩹ܳ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ll/᩶ۗۧ;->notifyItemRangeChanged(II)V

    return-void
.end method

.method public static ֫(Ll/۫᩹ܳ;Ll/֡ۚۢ;Ll/֫ۗۧ;Landroid/view/View;)V
    .locals 0

    .line 999
    iput-object p1, p0, Ll/۫᩹ܳ;->֫:Ll/֡ۚۢ;

    .line 1000
    iput-object p2, p0, Ll/۫᩹ܳ;->ۧ:Ll/֫ۗۧ;

    .line 1001
    new-instance p1, Ll/ۛ᩹ܳ;

    new-instance p2, Ll/۬᩹ܳ;

    invoke-direct {p2, p0}, Ll/۬᩹ܳ;-><init>(Ll/۫᩹ܳ;)V

    invoke-direct {p1, p3, p2}, Ll/ۛ᩹ܳ;-><init>(Landroid/view/View;Ll/۬᩹ܳ;)V

    iput-object p1, p0, Ll/۫᩹ܳ;->ܽ:Ll/ۛ᩹ܳ;

    return-void
.end method

.method public static synthetic ֫(Ll/۫᩹ܳ;Ll/ۧ᩶ܳ;)V
    .locals 1

    .line 1050
    invoke-direct {p0}, Ll/۫᩹ܳ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۫᩹ܳ;->֫:Ll/֡ۚۢ;

    if-eqz v0, :cond_0

    .line 1051
    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 1052
    iget-object p0, p0, Ll/۫᩹ܳ;->ܿ:Ll/ܽ᩶ܳ;

    iget-object p0, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {p1, p0}, Ll/ۧ᩶ܳ;->֫(Lbin/mt/plus/Main;)V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/۫᩹ܳ;Ll/ܶ᩹ܳ;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1064
    invoke-direct {p0}, Ll/۫᩹ܳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۫᩹ܳ;->ۧ:Ll/֫ۗۧ;

    if-eqz v0, :cond_0

    .line 1065
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p2

    if-nez p2, :cond_0

    .line 1066
    iget-object p0, p0, Ll/۫᩹ܳ;->ۧ:Ll/֫ۗۧ;

    invoke-virtual {p0, p1}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_0
    return-void
.end method

.method private ֫()Z
    .locals 1

    .line 1006
    iget-object v0, p0, Ll/۫᩹ܳ;->ܽ:Ll/ۛ᩹ܳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۛ᩹ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic ֫(Ll/۫᩹ܳ;Ll/ۧ᩶ܳ;Landroid/view/View;)Z
    .locals 8

    .line 1056
    invoke-direct {p0}, Ll/۫᩹ܳ;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v5, p0, Ll/۫᩹ܳ;->֫:Ll/֡ۚۢ;

    if-nez v5, :cond_0

    goto :goto_0

    .line 1059
    :cond_0
    iget-object v1, p0, Ll/۫᩹ܳ;->ܿ:Ll/ܽ᩶ܳ;

    new-instance v6, Ll/᩸᩹ܳ;

    invoke-direct {v6, p0}, Ll/᩸᩹ܳ;-><init>(Ll/۫᩹ܳ;)V

    new-instance v7, Ll/᩹᩹ܳ;

    invoke-direct {v7, p0, p1}, Ll/᩹᩹ܳ;-><init>(Ll/۫᩹ܳ;Ll/ۧ᩶ܳ;)V

    const/4 v4, 0x1

    move-object v2, p2

    move-object v3, p1

    invoke-static/range {v1 .. v7}, Ll/ܽ᩶ܳ;->֫(Ll/ܽ᩶ܳ;Landroid/view/View;Ll/֫᩶ܳ;ZLl/֡ۚۢ;Ljava/lang/Runnable;Ll/᩹᩹ܳ;)V

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ll/۫᩹ܳ;)V
    .locals 0

    .line 1013
    iget-object p0, p0, Ll/۫᩹ܳ;->ܽ:Ll/ۛ᩹ܳ;

    if-eqz p0, :cond_0

    .line 1014
    invoke-virtual {p0}, Ll/ۛ᩹ܳ;->֫()V

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/۫᩹ܳ;Ll/ۧ᩶ܳ;)V
    .locals 3

    .line 1022
    iget-object v0, p0, Ll/۫᩹ܳ;->ܳ:Ljava/util/ArrayList;

    .line 1120
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    .line 1124
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1125
    invoke-virtual {p0, v1}, Ll/᩶ۗۧ;->notifyItemRemoved(I)V

    :goto_0
    if-ne v1, v2, :cond_1

    goto :goto_1

    .line 1026
    :cond_1
    iget-object v1, p0, Ll/۫᩹ܳ;->ܿ:Ll/ܽ᩶ܳ;

    iget-object p1, p1, Ll/ۧ᩶ܳ;->֫:Ljava/lang/String;

    invoke-static {v1, p1}, Ll/ܽ᩶ܳ;->֫(Ll/ܽ᩶ܳ;Ljava/lang/String;)V

    .line 1027
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1028
    iget-object p1, p0, Ll/۫᩹ܳ;->ᩳ:Ll/۬۬ۧ;

    iget-object p0, p0, Ll/۫᩹ܳ;->֫:Ll/֡ۚۢ;

    .line 1083
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 1084
    new-instance v1, Ll/ᩴ᩹ܳ;

    invoke-direct {v1, v0, p0, p1}, Ll/ᩴ᩹ܳ;-><init>(Landroid/view/ViewTreeObserver;Ll/֡ۚۢ;Ll/۬۬ۧ;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static bridge synthetic ܽ(Ll/۫᩹ܳ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۫᩹ܳ;->֫()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 1074
    iget-object v0, p0, Ll/۫᩹ܳ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 2

    .line 985
    check-cast p1, Ll/ܶ᩹ܳ;

    .line 1043
    iget-object v0, p0, Ll/۫᩹ܳ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۧ᩶ܳ;

    .line 1044
    invoke-static {p1}, Ll/ܶ᩹ܳ;->ۧ(Ll/ܶ᩹ܳ;)Ll/ۤܺ᩷;

    move-result-object v0

    .line 1202
    iget-object v1, p2, Ll/ۧ᩶ܳ;->ܿ:Ll/᩶ۖܳ;

    .line 252
    iget-object v1, v1, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    .line 1044
    invoke-virtual {v0, v1}, Ll/ۤܺ᩷;->֫(Ll/ۨܺ᩷;)V

    .line 1045
    invoke-static {p1}, Ll/ܶ᩹ܳ;->ۧ(Ll/ܶ᩹ܳ;)Ll/ۤܺ᩷;

    move-result-object v0

    invoke-virtual {p2}, Ll/ۧ᩶ܳ;->ܽ()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤܺ᩷;->֫(Z)V

    .line 1046
    invoke-static {p1}, Ll/ܶ᩹ܳ;->ܽ(Ll/ܶ᩹ܳ;)Landroid/widget/TextView;

    move-result-object v0

    .line 1198
    iget v1, p2, Ll/ۧ᩶ܳ;->ۧ:I

    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 1046
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1047
    invoke-static {p1}, Ll/ܶ᩹ܳ;->ܽ(Ll/ܶ᩹ܳ;)Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 1048
    invoke-static {p1}, Ll/ܶ᩹ܳ;->֫(Ll/ܶ᩹ܳ;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-direct {p0}, Ll/۫᩹ܳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1049
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    new-instance v1, Ll/᩶᩹ܳ;

    invoke-direct {v1, p0, p2}, Ll/᩶᩹ܳ;-><init>(Ll/۫᩹ܳ;Ll/ۧ᩶ܳ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1055
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    new-instance v1, Ll/ۙ᩹ܳ;

    invoke-direct {v1, p0, p2}, Ll/ۙ᩹ܳ;-><init>(Ll/۫᩹ܳ;Ll/ۧ᩶ܳ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1063
    invoke-static {p1}, Ll/ܶ᩹ܳ;->֫(Ll/ܶ᩹ܳ;)Landroid/widget/ImageView;

    move-result-object p2

    new-instance v0, Ll/ۗ᩹ܳ;

    invoke-direct {v0, p0, p1}, Ll/ۗ᩹ܳ;-><init>(Ll/۫᩹ܳ;Ll/ܶ᩹ܳ;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 2

    .line 1035
    iget-object p2, p0, Ll/۫᩹ܳ;->ܿ:Ll/ܽ᩶ܳ;

    iget-object p2, p2, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d015c

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 1037
    new-instance p2, Ll/ܶ᩹ܳ;

    invoke-direct {p2, v1, p1}, Ll/ܶ᩹ܳ;-><init>(ILandroid/view/View;)V

    return-object p2
.end method
