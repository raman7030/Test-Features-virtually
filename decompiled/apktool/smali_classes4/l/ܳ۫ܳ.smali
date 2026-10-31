.class public final Ll/ܳ۫ܳ;
.super Ll/᩶ۗۧ;
.source "A940"


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܽ:Ll/֫ۗۧ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;Ll/֫ۗۧ;)V
    .locals 0

    .line 100
    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 101
    iput-object p1, p0, Ll/ܳ۫ܳ;->֫:Ll/ۗܺ᩷;

    .line 102
    iput-object p2, p0, Ll/ܳ۫ܳ;->ۧ:Ljava/util/ArrayList;

    .line 103
    iput-object p3, p0, Ll/ܳ۫ܳ;->ܽ:Ll/֫ۗۧ;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ܳ۫ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 3

    .line 95
    check-cast p1, Ll/᩻۫ܳ;

    .line 114
    iget-object v0, p0, Ll/ܳ۫ܳ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳۜܳ;

    .line 115
    iget-object p1, p1, Ll/᩻۫ܳ;->᩸:Ll/ܿۜܳ;

    .line 117
    invoke-virtual {p1}, Ll/ܿۜܳ;->᩻()Ll/ܳܺ;

    move-result-object v0

    invoke-interface {p2}, Ll/ᩳۜܳ;->᩺()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    invoke-interface {p2}, Ll/ᩳۜܳ;->ۗ֫()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 120
    invoke-virtual {p1}, Ll/ܿۜܳ;->ۜ()Ll/ܳܺ;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 121
    :cond_0
    invoke-interface {p2}, Ll/ᩳۜܳ;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    invoke-virtual {p1}, Ll/ܿۜܳ;->ۜ()Ll/ܳܺ;

    move-result-object v0

    invoke-interface {p2}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 124
    :cond_1
    invoke-virtual {p1}, Ll/ܿۜܳ;->ۜ()Ll/ܳܺ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    :goto_0
    invoke-virtual {p1}, Ll/ܿۜܳ;->ܳ()Ll/ܳܺ;

    move-result-object v0

    .line 127
    invoke-interface {p2}, Ll/ᩳۜܳ;->۬()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 128
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const-string v1, "->"

    .line 129
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 130
    :cond_2
    invoke-interface {p2}, Ll/ᩳۜܳ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 131
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const-string v1, "* "

    .line 132
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    const/4 v1, 0x4

    .line 134
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const-string v1, " "

    .line 135
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    :goto_1
    invoke-interface {p2}, Ll/ᩳۜܳ;->᩸()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_4

    .line 139
    invoke-interface {p2}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/ܿۤۡ;->ܽ(J)Ljava/lang/String;

    move-result-object v0

    .line 141
    :cond_4
    invoke-virtual {p1}, Ll/ܿۜܳ;->ܽ()Ll/ܳܺ;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    invoke-interface {p2}, Ll/ᩳۜܳ;->getIcon()Ll/ۨܺ᩷;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 145
    invoke-virtual {p1}, Ll/ܿۜܳ;->ܿ()Ll/ᩳۡ;

    move-result-object p1

    invoke-virtual {p2}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_5
    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 5

    .line 109
    new-instance p2, Ll/᩻۫ܳ;

    .line 160
    iget-object v0, p0, Ll/ܳ۫ܳ;->֫:Ll/ۗܺ᩷;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0156

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 161
    iget-object p1, p0, Ll/ܳ۫ܳ;->ܽ:Ll/֫ۗۧ;

    iput-object p1, p2, Ll/᩻۫ܳ;->᩹:Ll/֫ۗۧ;

    .line 162
    iget-object p1, p2, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    check-cast p1, Landroid/view/ViewGroup;

    .line 163
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܿۜܳ;

    iput-object v0, p2, Ll/᩻۫ܳ;->᩸:Ll/ܿۜܳ;

    .line 164
    invoke-virtual {v0}, Ll/ܿۜܳ;->᩷()V

    .line 165
    invoke-virtual {v0}, Ll/ܿۜܳ;->᩻()Ll/ܳܺ;

    move-result-object v1

    sget v3, Ll/᩶ۖ᩷;->᩷:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    const/4 v2, 0x1

    :cond_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 166
    invoke-virtual {v0}, Ll/ܿۜܳ;->᩻()Ll/ܳܺ;

    move-result-object v1

    sget v2, Ll/᩶ۖ᩷;->᩷:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 167
    sget v1, Ll/᩶ۖ᩷;->ۜ:I

    const/4 v2, 0x2

    if-ne v1, v4, :cond_1

    .line 168
    invoke-virtual {v0}, Ll/ܿۜܳ;->᩻()Ll/ܳܺ;

    move-result-object v1

    const/high16 v3, 0x41500000    # 13.0f

    invoke-virtual {v1, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 169
    invoke-virtual {v0}, Ll/ܿۜܳ;->ۜ()Ll/ܳܺ;

    move-result-object v1

    const/high16 v3, 0x41200000    # 10.0f

    invoke-virtual {v1, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 170
    invoke-virtual {v0}, Ll/ܿۜܳ;->ܳ()Ll/ܳܺ;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 171
    invoke-virtual {v0}, Ll/ܿۜܳ;->ܽ()Ll/ܳܺ;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    goto :goto_0

    :cond_1
    if-ne v1, v2, :cond_2

    .line 173
    invoke-virtual {v0}, Ll/ܿۜܳ;->᩻()Ll/ܳܺ;

    move-result-object v1

    const/high16 v3, 0x41700000    # 15.0f

    invoke-virtual {v1, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 174
    invoke-virtual {v0}, Ll/ܿۜܳ;->ۜ()Ll/ܳܺ;

    move-result-object v1

    const/high16 v3, 0x41300000    # 11.0f

    invoke-virtual {v1, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 175
    invoke-virtual {v0}, Ll/ܿۜܳ;->ܳ()Ll/ܳܺ;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 176
    invoke-virtual {v0}, Ll/ܿۜܳ;->ܽ()Ll/ܳܺ;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    goto :goto_0

    :cond_2
    const/4 v3, 0x3

    if-ne v1, v3, :cond_3

    .line 178
    invoke-virtual {v0}, Ll/ܿۜܳ;->᩻()Ll/ܳܺ;

    move-result-object v1

    const/high16 v3, 0x41880000    # 17.0f

    invoke-virtual {v1, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 179
    invoke-virtual {v0}, Ll/ܿۜܳ;->ۜ()Ll/ܳܺ;

    move-result-object v1

    const/high16 v3, 0x41400000    # 12.0f

    invoke-virtual {v1, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 180
    invoke-virtual {v0}, Ll/ܿۜܳ;->ܳ()Ll/ܳܺ;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 181
    invoke-virtual {v0}, Ll/ܿۜܳ;->ܽ()Ll/ܳܺ;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ll/ܳܺ;->setTextSize(IF)V

    .line 184
    :cond_3
    :goto_0
    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    const/high16 v0, 0x3f400000    # 0.75f

    .line 185
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 186
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 187
    invoke-virtual {p1, v4}, Landroid/view/View;->setFocusable(Z)V

    .line 188
    invoke-virtual {p1, v4}, Landroid/view/View;->setClickable(Z)V

    return-object p2
.end method
