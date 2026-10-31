.class public final Ll/ᩴ᩻ᩳ;
.super Landroid/widget/BaseAdapter;
.source "B688"


# instance fields
.field public final ᩸:Ll/ۜۜᩳ;

.field public final ᩹:Ll/᩻ۜᩳ;


# direct methods
.method public constructor <init>(Ll/ۜۜᩳ;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 28
    iput-object p1, p0, Ll/ᩴ᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    .line 29
    iget-object p1, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput-object p1, p0, Ll/ᩴ᩻ᩳ;->᩹:Ll/᩻ۜᩳ;

    return-void
.end method

.method public static ֫(Ll/۫᩻ܽ;IILandroid/widget/TextView;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 196
    check-cast p0, Ll/᩷ܿܽ;

    invoke-virtual {p0, p2}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_f

    const/4 v1, 0x7

    if-ne p1, v1, :cond_1

    goto/16 :goto_1

    :cond_1
    const/4 v1, 0x2

    if-eq p1, v1, :cond_e

    const/16 v1, 0x8

    if-ne p1, v1, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v1, 0x1c

    if-lt p1, v1, :cond_5

    const/16 v1, 0x1f

    if-gt p1, v1, :cond_5

    if-eqz p3, :cond_4

    ushr-int/lit8 p1, p2, 0x18

    and-int/lit16 p1, p1, 0xff

    const/16 v1, 0x40

    if-le p1, v1, :cond_3

    .line 123
    sget p1, Ll/᩹֡᩷;->ܳ֫:I

    invoke-static {p2, p1}, Ll/۟۫ۡ;->ۧ(II)I

    move-result p1

    .line 207
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 208
    :cond_3
    invoke-virtual {p3, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 210
    :cond_4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Object;

    aput-object p1, p2, p0

    const-string p0, "Color: %08X"

    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const/4 p3, 0x4

    if-ne p1, p3, :cond_6

    .line 212
    invoke-static {p2}, Ll/֡ۜᩳ;->֫(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    const/4 p3, 0x5

    if-ne p1, p3, :cond_7

    .line 214
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Dimen: "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    invoke-static {p2, v0}, Ll/ۗۨۡ;->֫(II)Ljava/lang/String;

    move-result-object p1

    .line 214
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ll/ۗۨۡ;->֫:[Ljava/lang/String;

    and-int/lit8 p2, p2, 0xf

    aget-object p1, p1, p2

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    const/4 p3, 0x6

    if-ne p1, p3, :cond_8

    and-int/lit8 p0, p2, 0xf

    .line 218
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Frac: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object p3, Ll/ۗۨۡ;->ۧ:[I

    aget p3, p3, p0

    .line 219
    invoke-static {p2, p3}, Ll/ۗۨۡ;->֫(II)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Ll/ۗۨۡ;->ܽ:[Ljava/lang/String;

    aget-object p0, p2, p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_8
    const/16 p3, 0x11

    if-ne p1, p3, :cond_9

    .line 222
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Hex: "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p0, p2}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    const/16 p3, 0x10

    if-ne p1, p3, :cond_a

    const-string p0, "Dec: "

    invoke-static {p2, p0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_a
    const/16 p3, 0x12

    if-ne p1, p3, :cond_c

    .line 226
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Boolean: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_b

    const/4 p0, 0x1

    :cond_b
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_c
    if-eqz p1, :cond_d

    const-string p0, "Unknown Type ID: "

    const-string p3, " Data: "

    .line 0
    invoke-static {p0, p1, p2, p3}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_d
    const/4 p0, 0x0

    return-object p0

    .line 202
    :cond_e
    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Object;

    aput-object p1, p2, p0

    const-string p0, "Attr: ?%08X"

    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 199
    :cond_f
    :goto_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Object;

    aput-object p1, p2, p0

    const-string p0, "Ref: @%08X"

    invoke-static {p0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ll/᩸ۜᩳ;I)V
    .locals 8

    .line 91
    iget-object v0, p1, Ll/᩸ۜᩳ;->֫:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 92
    iget-object v0, p1, Ll/᩸ۜᩳ;->֫:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    iget-object v2, p1, Ll/᩸ۜᩳ;->ۧ:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 94
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    iget-object v1, p1, Ll/᩸ۜᩳ;->ܽ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 96
    sget-object v3, Ll/ۘ᩻ᩳ;->֫:[I

    iget-object v4, p0, Ll/ᩴ᩻ᩳ;->᩹:Ll/᩻ۜᩳ;

    invoke-virtual {v4}, Ll/᩻ۜᩳ;->ᩳ()Ll/ۙۜᩳ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v3, v3, v5

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    packed-switch v3, :pswitch_data_0

    return-void

    .line 168
    :pswitch_0
    iget-object v0, v4, Ll/᩻ۜᩳ;->ۡ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴܿܽ;

    .line 169
    invoke-static {v4, p2, p1}, Ll/ᩴ᩻ᩳ;->֫(Ll/᩻ۜᩳ;Ll/ᩴܿܽ;Ll/᩸ۜᩳ;)V

    .line 170
    invoke-virtual {p2}, Ll/᩷ᩳܽ;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    return-void

    .line 155
    :pswitch_1
    iget-boolean p1, v4, Ll/᩻ۜᩳ;->ܳ֫:Z

    if-eqz p1, :cond_0

    .line 156
    iget-object p1, v4, Ll/᩻ۜᩳ;->۟:[I

    aget p2, p1, p2

    .line 158
    :cond_0
    iget-object p1, v4, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    invoke-virtual {p1, p2}, Ll/ᩴܿܽ;->getValue(I)Ll/ۙܿܽ;

    move-result-object p1

    .line 159
    iget-object p2, v4, Ll/᩻ۜᩳ;->ۛ:Ll/۫ܽܽ;

    invoke-virtual {p1}, Ll/ۛᩳܽ;->ۡ֫()I

    move-result v0

    invoke-virtual {p2, v0}, Ll/۫ܽܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 161
    invoke-virtual {v2, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 162
    sget-object p2, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 163
    invoke-virtual {p1}, Ll/ۛᩳܽ;->ۖ()I

    move-result p2

    .line 164
    invoke-virtual {p1}, Ll/ۙܿܽ;->getValue()I

    move-result p1

    .line 165
    iget-object v0, v4, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-static {v0, p2, p1, v2}, Ll/ᩴ᩻ᩳ;->֫(Ll/۫᩻ܽ;IILandroid/widget/TextView;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 145
    :pswitch_2
    iget-boolean v1, v4, Ll/᩻ۜᩳ;->᩻֫:Z

    if-eqz v1, :cond_1

    .line 146
    iget-object v1, v4, Ll/᩻ۜᩳ;->ܽ֫:[I

    aget p2, v1, p2

    .line 147
    :cond_1
    iget-object v1, v4, Ll/᩻ۜᩳ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴܿܽ;

    .line 148
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 149
    invoke-virtual {p2}, Ll/᩷ᩳܽ;->ۚۧ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v6, [Ljava/lang/Object;

    aput-object v1, v2, v7

    const-string v1, "  %04X"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    invoke-static {v4, p2, p1}, Ll/ᩴ᩻ᩳ;->֫(Ll/᩻ۜᩳ;Ll/ᩴܿܽ;Ll/᩸ۜᩳ;)V

    return-void

    .line 142
    :pswitch_3
    iget-object p1, v4, Ll/᩻ۜᩳ;->ۤ:Ll/᩶ܿܽ;

    invoke-virtual {p1, p2}, Ll/᩶ܿܽ;->ܿ(I)Ll/ۖܿܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۜᩳܽ;->ۧۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 135
    :pswitch_4
    iget-object p1, v4, Ll/᩻ۜᩳ;->۫:Ll/۠ܿܽ;

    .line 136
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 137
    invoke-virtual {p1}, Ll/۠ᩳܽ;->᩻()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 138
    invoke-virtual {p1, p2}, Ll/۠ܿܽ;->getType(I)Ll/᩶ܿܽ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Object;

    aput-object v2, v4, v7

    aput-object v3, v4, v6

    const-string v2, "  %02X%02X"

    .line 137
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    invoke-virtual {p1, p2}, Ll/۠ܿܽ;->getType(I)Ll/᩶ܿܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 120
    :pswitch_5
    iget-object p1, v4, Ll/᩻ۜᩳ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚۜᩳ;

    .line 121
    iget-object p2, p1, Ll/ۚۜᩳ;->֫:Ll/ᩴܿܽ;

    iget-object v0, p1, Ll/ۚۜᩳ;->ܽ:Ll/ۙܿܽ;

    invoke-virtual {p2}, Ll/᩷ᩳܽ;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 123
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 124
    invoke-virtual {v2, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 125
    sget-object p2, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    if-eqz v0, :cond_2

    .line 127
    invoke-virtual {v0}, Ll/ۛᩳܽ;->ۖ()I

    move-result p1

    .line 128
    invoke-virtual {v0}, Ll/ۙܿܽ;->getValue()I

    move-result p2

    .line 129
    iget-object v0, v4, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-static {v0, p1, p2, v2}, Ll/ᩴ᩻ᩳ;->֫(Ll/۫᩻ܽ;IILandroid/widget/TextView;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 131
    :cond_2
    iget-object p1, p1, Ll/ۚۜᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 114
    :pswitch_6
    iget-boolean p1, v4, Ll/᩻ۜᩳ;->᩻֫:Z

    if-eqz p1, :cond_3

    .line 115
    iget-object p1, v4, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    iget-object v0, v4, Ll/᩻ۜᩳ;->ܽ֫:[I

    aget p2, v0, p2

    invoke-virtual {p1, p2}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 117
    :cond_3
    iget-object p1, v4, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-virtual {p1, p2}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_7
    if-eqz p2, :cond_6

    if-eq p2, v6, :cond_5

    if-eq p2, v5, :cond_4

    .line 109
    iget-object p1, v4, Ll/᩻ۜᩳ;->۬:Ll/ۡܿܽ;

    add-int/lit8 p2, p2, -0x3

    invoke-virtual {p1, p2}, Ll/ۡܿܽ;->ۢ(I)Ll/۠ܿܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۠ᩳܽ;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_4
    const p1, 0x7f1208f2

    .line 106
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_5
    const p1, 0x7f1208ff

    .line 103
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_6
    const p1, 0x7f120a00

    .line 100
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/᩻ۜᩳ;Ll/ᩴܿܽ;Ll/᩸ۜᩳ;)V
    .locals 4

    .line 177
    iget-object v0, p2, Ll/᩸ۜᩳ;->ܽ:Landroid/widget/TextView;

    iget-object p2, p2, Ll/᩸ۜᩳ;->ۧ:Landroid/widget/TextView;

    invoke-virtual {p1}, Ll/ᩴܿܽ;->۟֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    invoke-virtual {p1}, Ll/ᩴܿܽ;->getType()Ll/᩶ܿܽ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 179
    invoke-virtual {v0}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "id"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    invoke-virtual {p1}, Ll/ᩴܿܽ;->᩻֫()Z

    move-result v2

    if-nez v2, :cond_1

    .line 180
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 181
    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 182
    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 183
    invoke-virtual {p1, v1}, Ll/ᩴܿܽ;->getValue(I)Ll/ۙܿܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛᩳܽ;->ۖ()I

    move-result v0

    .line 184
    invoke-virtual {p1, v1}, Ll/ᩴܿܽ;->getValue(I)Ll/ۙܿܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙܿܽ;->getValue()I

    move-result p1

    .line 185
    iget-object p0, p0, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-static {p0, v0, p1, p2}, Ll/ᩴ᩻ᩳ;->֫(Ll/۫᩻ܽ;IILandroid/widget/TextView;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 186
    :cond_1
    invoke-virtual {p1}, Ll/ᩴܿܽ;->᩻֫()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ll/ۤᩳܽ;->getTypeName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "style"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll/᩷ᩳܽ;->getParent()I

    move-result v0

    if-eqz v0, :cond_2

    .line 187
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 188
    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 189
    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 190
    iget-object p0, p0, Ll/᩻ۜᩳ;->ۛ:Ll/۫ܽܽ;

    invoke-virtual {p1}, Ll/᩷ᩳܽ;->getParent()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/۫ܽܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 3

    .line 34
    sget-object v0, Ll/ۘ᩻ᩳ;->֫:[I

    iget-object v1, p0, Ll/ᩴ᩻ᩳ;->᩹:Ll/᩻ۜᩳ;

    invoke-virtual {v1}, Ll/᩻ۜᩳ;->ᩳ()Ll/ۙۜᩳ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    .line 52
    :pswitch_0
    iget-object v0, v1, Ll/᩻ۜᩳ;->ۡ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    .line 50
    :pswitch_1
    iget-boolean v0, v1, Ll/᩻ۜᩳ;->ܳ֫:Z

    if-eqz v0, :cond_0

    iget v0, v1, Ll/᩻ۜᩳ;->֫֫:I

    return v0

    :cond_0
    iget-object v0, v1, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    invoke-virtual {v0}, Ll/ᩴܿܽ;->ܽ֫()I

    move-result v0

    return v0

    .line 46
    :pswitch_2
    iget-boolean v0, v1, Ll/᩻ۜᩳ;->᩻֫:Z

    if-eqz v0, :cond_1

    iget v0, v1, Ll/᩻ۜᩳ;->ᩳ֫:I

    return v0

    :cond_1
    iget-object v0, v1, Ll/᩻ۜᩳ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    .line 44
    :pswitch_3
    iget-object v0, v1, Ll/᩻ۜᩳ;->ۤ:Ll/᩶ܿܽ;

    invoke-virtual {v0}, Ll/᩶ܿܽ;->ۜ֫()I

    move-result v0

    return v0

    .line 42
    :pswitch_4
    iget-object v0, v1, Ll/᩻ۜᩳ;->۫:Ll/۠ܿܽ;

    invoke-virtual {v0}, Ll/۠ܿܽ;->ۗ()I

    move-result v0

    return v0

    .line 40
    :pswitch_5
    iget-object v0, v1, Ll/᩻ۜᩳ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    .line 38
    :pswitch_6
    iget-boolean v0, v1, Ll/᩻ۜᩳ;->᩻֫:Z

    if-eqz v0, :cond_2

    iget v0, v1, Ll/᩻ۜᩳ;->ᩳ֫:I

    return v0

    :cond_2
    iget-object v0, v1, Ll/᩻ۜᩳ;->ۘ֫:Ll/۬ܿܽ;

    invoke-virtual {v0}, Ll/۬ܿܽ;->size()I

    move-result v0

    return v0

    .line 36
    :pswitch_7
    iget-object v0, v1, Ll/᩻ۜᩳ;->۬:Ll/ۡܿܽ;

    invoke-virtual {v0}, Ll/ۡܿܽ;->ۚ()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .locals 4

    if-nez p2, :cond_0

    .line 71
    iget-object p2, p0, Ll/ᩴ᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    invoke-virtual {p2}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0145

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 72
    invoke-static {p2}, Ll/ᩳ᩹ۡ;->֫(Landroid/view/View;)V

    .line 73
    new-instance p3, Ll/᩸ۜᩳ;

    invoke-direct {p3, p2}, Ll/᩸ۜᩳ;-><init>(Landroid/view/View;)V

    .line 74
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩸ۜᩳ;

    .line 78
    :goto_0
    :try_start_0
    invoke-direct {p0, p3, p1}, Ll/ᩴ᩻ᩳ;->֫(Ll/᩸ۜᩳ;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    .line 80
    iget-object v0, p3, Ll/᩸ۜᩳ;->֫:Landroid/widget/TextView;

    iget-object v1, p3, Ll/᩸ۜᩳ;->ܽ:Landroid/widget/TextView;

    iget-object v2, p3, Ll/᩸ۜᩳ;->ۧ:Landroid/widget/TextView;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 81
    iget-object p3, p3, Ll/᩸ۜᩳ;->֫:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p3, 0x8

    .line 82
    invoke-virtual {v2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 83
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    invoke-virtual {v1}, Landroid/widget/TextView;->setSingleLine()V

    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
