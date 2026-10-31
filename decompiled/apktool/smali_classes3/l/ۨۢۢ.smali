.class public final Ll/ۨۢۢ;
.super Landroid/content/BroadcastReceiver;
.source "31PG"


# instance fields
.field public final synthetic ֫:Ll/۟ۡۢ;


# direct methods
.method public constructor <init>(Ll/۟ۡۢ;)V
    .locals 0

    .line 160
    iput-object p1, p0, Ll/ۨۢۢ;->֫:Ll/۟ۡۢ;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 163
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "bin.mt.protect.ProtectUploadService.ACTION_FAIL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    goto :goto_1

    :sswitch_1
    const-string v0, "bin.mt.protect.ProtectUploadService.ACTION_PROGRESS_CHANGED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "bin.mt.protect.ProtectUploadService.ACTION_SUCCESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    goto :goto_1

    :goto_0
    const/4 p1, -0x1

    :goto_1
    const-string v0, "taskID"

    iget-object v3, p0, Ll/ۨۢۢ;->֫:Ll/۟ۡۢ;

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_2

    .line 193
    :pswitch_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 194
    sget-object v0, Ll/ۡܺۢ;->ۤ:Ll/ᩴ᩵;

    invoke-virtual {v0, p1}, Ll/ᩴ᩵;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 195
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "message"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 196
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 198
    :cond_3
    invoke-static {v3}, Ll/۟ۡۢ;->᩻(Ll/۟ۡۢ;)Ll/ۖۢۡ;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 199
    invoke-static {v3, p1}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;Ljava/lang/String;)Ll/ܽܺۢ;

    move-result-object p1

    if-eqz p2, :cond_5

    if-eqz p1, :cond_5

    const/4 p2, -0x3

    .line 201
    iput p2, p1, Ll/ܽܺۢ;->۫:I

    .line 202
    invoke-static {v3}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;)Ll/ܺۡۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void

    .line 165
    :pswitch_1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 166
    invoke-static {v3}, Ll/۟ۡۢ;->᩻(Ll/۟ۡۢ;)Ll/ۖۢۡ;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    .line 167
    invoke-static {v3, p1}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;Ljava/lang/String;)Ll/ܽܺۢ;

    move-result-object p1

    if-eqz p2, :cond_5

    if-eqz p1, :cond_5

    .line 169
    iput v2, p1, Ll/ܽܺۢ;->۫:I

    .line 170
    invoke-static {v3, p1, p2}, Ll/۟ۡۢ;->֫(Ll/۟ۡۢ;Ll/ܽܺۢ;Landroid/widget/TextView;)V

    goto :goto_2

    .line 175
    :pswitch_2
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "id"

    .line 176
    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 177
    invoke-static {v3, p1}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;Ljava/lang/String;)Ll/ܽܺۢ;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 179
    iput p2, p1, Ll/ܽܺۢ;->ۙ:I

    .line 180
    iput v1, p1, Ll/ܽܺۢ;->۫:I

    .line 181
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {v3}, Ll/۟ۡۢ;->ܿ(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 182
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v3}, Ll/۟ۡۢ;->᩷(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 183
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 184
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 185
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {v3, p1}, Ll/۟ۡۢ;->֫(Ll/۟ۡۢ;Ljava/util/List;)V

    .line 186
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {v3, p1}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;Ljava/util/List;)V

    .line 187
    new-instance p1, Ll/᩵ۡۢ;

    invoke-direct {p1, v3}, Ll/᩵ۡۢ;-><init>(Ll/۟ۡۢ;)V

    .line 189
    :cond_4
    invoke-static {v3}, Ll/۟ۡۢ;->ۧ(Ll/۟ۡۢ;)Ll/ܺۡۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_5
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x59de2cbc -> :sswitch_2
        -0x11fe7fbf -> :sswitch_1
        0x696eb5d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
