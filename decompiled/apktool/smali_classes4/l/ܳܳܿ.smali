.class public final Ll/ܳܳܿ;
.super Ll/ۗ۬ۧ;
.source "4AWI"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ۗ:Landroid/widget/TextView;

.field public final synthetic ۙ:Ll/᩻ܳܿ;

.field public ᩶:Landroid/widget/TextView;

.field public ᩸:Landroid/widget/ImageView;

.field public ᩹:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Ll/᩻ܳܿ;Landroid/view/View;)V
    .locals 1

    .line 1032
    iput-object p1, p0, Ll/ܳܳܿ;->ۙ:Ll/᩻ܳܿ;

    .line 1033
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 1034
    invoke-static {p2}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 1035
    sget v0, Ll/ᩳ᩹ۡ;->֫:I

    .line 26
    new-instance v0, Ll/ܽ᩹ۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1036
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1037
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0a0631

    .line 1038
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ܳܳܿ;->ۗ:Landroid/widget/TextView;

    const v0, 0x7f0a03b2

    .line 1039
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ܳܳܿ;->᩶:Landroid/widget/TextView;

    const v0, 0x7f0a0163

    .line 1040
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Ll/ܳܳܿ;->᩸:Landroid/widget/ImageView;

    .line 1041
    iget-object p1, p1, Ll/᩻ܳܿ;->ۢ:Ll/֡ܳܿ;

    const v0, 0x7f0801ee

    invoke-static {p1, v0}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1042
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/ܳܳܿ;->᩹:Landroid/graphics/drawable/Drawable;

    const/16 v0, 0x77

    .line 1043
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1044
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1045
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 p1, 0x1

    .line 1046
    invoke-virtual {p2, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 1047
    invoke-virtual {p2, p1}, Landroid/view/View;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1052
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 1053
    iget-object v0, p0, Ll/ܳܳܿ;->ۙ:Ll/᩻ܳܿ;

    iget-object v1, v0, Ll/᩻ܳܿ;->ܽ:Ljava/util/BitSet;

    iget-object v2, v0, Ll/᩻ܳܿ;->ۢ:Ll/֡ܳܿ;

    invoke-static {v2}, Ll/֡ܳܿ;->ۧ(Ll/֡ܳܿ;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    .line 1054
    invoke-virtual {v1, p1}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    xor-int/lit8 v5, v3, 0x1

    .line 1055
    invoke-virtual {v1, p1, v5}, Ljava/util/BitSet;->set(IZ)V

    const/4 p1, 0x1

    if-nez v3, :cond_0

    .line 1057
    iget v1, v0, Ll/᩻ܳܿ;->ۧ:I

    add-int/2addr v1, p1

    iput v1, v0, Ll/᩻ܳܿ;->ۧ:I

    goto :goto_0

    .line 1059
    :cond_0
    iget v1, v0, Ll/᩻ܳܿ;->ۧ:I

    sub-int/2addr v1, p1

    iput v1, v0, Ll/᩻ܳܿ;->ۧ:I

    :goto_0
    const/4 v1, -0x1

    .line 1061
    iput v1, v0, Ll/᩻ܳܿ;->ᩳ:I

    .line 1062
    iget-object v1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    if-nez v3, :cond_1

    sget v5, Ll/᩹֡᩷;->ܺ:I

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v1, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1063
    iget v1, v0, Ll/᩻ܳܿ;->ۧ:I

    if-lez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-static {v2, v1}, Ll/֡ܳܿ;->֫(Ll/֡ܳܿ;Z)V

    if-nez v3, :cond_5

    .line 1065
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v1

    .line 1066
    iget v2, v0, Ll/᩻ܳܿ;->ۜ:I

    sub-int v2, v1, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    .line 1067
    iput v1, v0, Ll/᩻ܳܿ;->ۜ:I

    if-ne v2, p1, :cond_3

    .line 1069
    iget v1, v0, Ll/᩻ܳܿ;->ܿ:I

    add-int/2addr v1, p1

    iput v1, v0, Ll/᩻ܳܿ;->ܿ:I

    goto :goto_3

    .line 1071
    :cond_3
    iput p1, v0, Ll/᩻ܳܿ;->ܿ:I

    .line 1073
    :goto_3
    iget p1, v0, Ll/᩻ܳܿ;->ܿ:I

    const/4 v1, 0x5

    if-ne p1, v1, :cond_4

    const p1, 0x7f120917

    .line 1074
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(I)V

    .line 1075
    iput v4, v0, Ll/᩻ܳܿ;->ܿ:I

    :cond_4
    return-void

    :cond_5
    const/4 p1, -0x2

    .line 1078
    iput p1, v0, Ll/᩻ܳܿ;->ۜ:I

    return-void

    .line 1082
    :cond_6
    invoke-virtual {v0}, Ll/᩻ܳܿ;->֫()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶܳܿ;

    new-instance v1, Ll/ۧܳܿ;

    invoke-direct {v1, p0, p1}, Ll/ۧܳܿ;-><init>(Ll/ܳܳܿ;I)V

    const p1, 0x7f1202dd

    invoke-static {v2, v0, p1, v4, v1}, Ll/֡ܳܿ;->֫(Ll/֡ܳܿ;Ll/ܶܳܿ;IZLl/۬ۤ;)V

    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 8

    .line 1091
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 1092
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v0

    .line 1093
    iget-object v2, p0, Ll/ܳܳܿ;->ۙ:Ll/᩻ܳܿ;

    iget-object v3, v2, Ll/᩻ܳܿ;->ܽ:Ljava/util/BitSet;

    iget-object v4, v2, Ll/᩻ܳܿ;->ۢ:Ll/֡ܳܿ;

    invoke-static {v4}, Ll/֡ܳܿ;->ۧ(Ll/֡ܳܿ;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_7

    .line 1094
    iget p1, v2, Ll/᩻ܳܿ;->ᩳ:I

    const/4 v5, -0x1

    if-ne p1, v5, :cond_2

    .line 1095
    iput v0, v2, Ll/᩻ܳܿ;->ᩳ:I

    .line 1096
    invoke-virtual {v3, v0}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    if-nez p1, :cond_1

    .line 1097
    invoke-virtual {v3, v0}, Ljava/util/BitSet;->set(I)V

    .line 1098
    iget p1, v2, Ll/᩻ܳܿ;->ۧ:I

    add-int/2addr p1, v1

    iput p1, v2, Ll/᩻ܳܿ;->ۧ:I

    .line 1099
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    sget v0, Ll/᩹֡᩷;->ܺ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1100
    iget p1, v2, Ll/᩻ܳܿ;->ۧ:I

    if-lez p1, :cond_0

    const/4 v6, 0x1

    :cond_0
    invoke-static {v4, v6}, Ll/֡ܳܿ;->֫(Ll/֡ܳܿ;Z)V

    :cond_1
    return v1

    .line 1105
    :cond_2
    iput v5, v2, Ll/᩻ܳܿ;->ᩳ:I

    if-le p1, v0, :cond_3

    goto :goto_0

    :cond_3
    move v7, v0

    move v0, p1

    move p1, v7

    :goto_0
    if-gt v0, p1, :cond_5

    .line 1112
    invoke-virtual {v3, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-nez v5, :cond_4

    .line 1113
    invoke-virtual {v3, v0}, Ljava/util/BitSet;->set(I)V

    .line 1114
    iget v5, v2, Ll/᩻ܳܿ;->ۧ:I

    add-int/2addr v5, v1

    iput v5, v2, Ll/᩻ܳܿ;->ۧ:I

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1117
    :cond_5
    iget-object p1, v2, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 1118
    iget p1, v2, Ll/᩻ܳܿ;->ۧ:I

    if-lez p1, :cond_6

    const/4 v6, 0x1

    :cond_6
    invoke-static {v4, v6}, Ll/֡ܳܿ;->֫(Ll/֡ܳܿ;Z)V

    return v1

    .line 1122
    :cond_7
    new-instance v2, Ll/᩸ۖ;

    .line 68
    invoke-direct {v2, v4, p1, v6}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 1123
    invoke-virtual {v2}, Ll/᩸ۖ;->ᩳ()V

    .line 1124
    invoke-virtual {v2}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v4, 0x7f1202dd

    invoke-interface {v3, v6, v4, v6, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    const v4, 0x7f0801f0

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1125
    invoke-virtual {v2}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v4, 0x7f1205ad

    invoke-interface {v3, v6, v4, v6, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    const v4, 0x7f0801ce

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1126
    invoke-virtual {v2}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v4, 0x7f1205c2

    invoke-interface {v3, v6, v4, v6, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    const v4, 0x7f0801e4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1127
    invoke-virtual {v2}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v4, 0x7f1205ca

    invoke-interface {v3, v6, v4, v6, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    const v4, 0x7f0801e7

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1128
    invoke-virtual {v2}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v4, 0x7f12011f

    invoke-interface {v3, v6, v4, v6, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    const v4, 0x7f0801ee

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1129
    new-instance v3, Ll/֫ܳܿ;

    invoke-direct {v3, p0, p1, v0}, Ll/֫ܳܿ;-><init>(Ll/ܳܳܿ;Landroid/view/View;I)V

    invoke-virtual {v2, v3}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 1167
    invoke-static {p1, v2}, Ll/ᩳ᩹ۡ;->֫(Landroid/view/View;Ll/᩸ۖ;)V

    return v1
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1173
    iget-object p1, p0, Ll/ܳܳܿ;->᩸:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    .line 1174
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 1175
    iget-object p1, p0, Ll/ܳܳܿ;->ۙ:Ll/᩻ܳܿ;

    iget-object p1, p1, Ll/᩻ܳܿ;->᩻:Ll/֫ۗۧ;

    invoke-virtual {p1, p0}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
