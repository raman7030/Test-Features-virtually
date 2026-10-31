.class public final synthetic Ll/ۚᩳ᩻;
.super Ljava/lang/Object;
.source "195F"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Landroid/widget/Spinner;

.field public final synthetic ۙ:Ll/ۤۤᩳ;

.field public final synthetic ۬:Landroid/widget/TextView;

.field public final synthetic ᩶:Landroid/widget/Spinner;

.field public final synthetic ᩸:Lbin/mt/plus/Main;

.field public final synthetic ᩹:J


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;JLandroid/widget/Spinner;Ll/ۤۤᩳ;Landroid/widget/Spinner;Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚᩳ᩻;->᩸:Lbin/mt/plus/Main;

    iput-wide p2, p0, Ll/ۚᩳ᩻;->᩹:J

    iput-object p4, p0, Ll/ۚᩳ᩻;->᩶:Landroid/widget/Spinner;

    iput-object p5, p0, Ll/ۚᩳ᩻;->ۙ:Ll/ۤۤᩳ;

    iput-object p6, p0, Ll/ۚᩳ᩻;->ۗ:Landroid/widget/Spinner;

    iput-object p7, p0, Ll/ۚᩳ᩻;->۬:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 2
    iget-object v0, p0, Ll/ۚᩳ᩻;->ۗ:Landroid/widget/Spinner;

    .line 148
    iget-object v1, p0, Ll/ۚᩳ᩻;->᩶:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    const/4 v2, 0x2

    .line 234
    iget-object v3, p0, Ll/ۚᩳ᩻;->۬:Landroid/widget/TextView;

    if-eq v1, v2, :cond_9

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v2, 0x0

    .line 239
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 241
    iget-object v4, p0, Ll/ۚᩳ᩻;->᩸:Lbin/mt/plus/Main;

    iget-wide v5, p0, Ll/ۚᩳ᩻;->᩹:J

    iget-object v7, p0, Ll/ۚᩳ᩻;->ۙ:Ll/ۤۤᩳ;

    const/4 v8, 0x1

    const-string v9, "..."

    const-wide/16 v10, 0x1

    if-nez v1, :cond_4

    .line 242
    :try_start_0
    invoke-virtual {v7}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    int-to-long v12, v1

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    shl-long v0, v10, v0

    mul-long v12, v12, v0

    const-wide/16 v0, 0x0

    cmp-long v10, v12, v0

    if-nez v10, :cond_1

    .line 244
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 247
    :cond_1
    div-long v0, v5, v12

    long-to-int v1, v0

    int-to-long v10, v1

    mul-long v10, v10, v12

    cmp-long v0, v10, v5

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    :goto_0
    add-int/lit8 v1, v1, 0x1

    .line 253
    :cond_3
    invoke-virtual {v4}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v8, [Ljava/lang/Object;

    aput-object v4, v5, v2

    const v2, 0x7f110011

    invoke-virtual {v0, v2, v1, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_4
    if-ne v1, v8, :cond_8

    .line 255
    invoke-virtual {v7}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_5

    .line 257
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    int-to-long v0, v0

    .line 260
    div-long v0, v5, v0

    cmp-long v12, v0, v10

    if-gez v12, :cond_6

    cmp-long v12, v0, v5

    if-gez v12, :cond_6

    goto :goto_1

    :cond_6
    move-wide v10, v0

    .line 264
    :goto_1
    invoke-static {v10, v11}, Ll/᩺ۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v0

    new-array v1, v8, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const v0, 0x7f1209c0

    invoke-virtual {v4, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 267
    :goto_2
    invoke-virtual {v7}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v1

    if-nez v1, :cond_7

    .line 268
    invoke-virtual {v3, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 270
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    :goto_3
    return-void

    :cond_9
    :goto_4
    const/4 v0, 0x0

    .line 235
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v0, 0x8

    .line 236
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
