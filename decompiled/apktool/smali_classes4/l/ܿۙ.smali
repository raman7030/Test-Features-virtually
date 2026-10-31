.class public final Ll/ܿۙ;
.super Ljava/lang/Object;
.source "D2TL"


# instance fields
.field public ֫:Ljava/lang/CharSequence;

.field public final ۧ:Landroid/content/Context;

.field public final ܽ:Landroid/content/Intent;

.field public ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 3

    .line 309
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    iput-object p1, p0, Ll/ܿۙ;->ۧ:Landroid/content/Context;

    .line 311
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.SEND"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Ll/ܿۙ;->ܽ:Landroid/content/Intent;

    const-string v1, "androidx.core.app.EXTRA_CALLING_PACKAGE"

    .line 312
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.support.v4.app.EXTRA_CALLING_PACKAGE"

    .line 313
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v1, 0x80000

    .line 314
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 318
    :goto_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    .line 319
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 320
    check-cast p1, Landroid/app/Activity;

    goto :goto_1

    .line 323
    :cond_0
    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    .line 327
    invoke-virtual {p1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object p1

    .line 328
    iget-object v0, p0, Ll/ܿۙ;->ܽ:Landroid/content/Intent;

    const-string v1, "androidx.core.app.EXTRA_CALLING_ACTIVITY"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 329
    iget-object v0, p0, Ll/ܿۙ;->ܽ:Landroid/content/Intent;

    const-string v1, "android.support.v4.app.EXTRA_CALLING_ACTIVITY"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const v0, 0x7f120606

    .line 444
    iget-object v1, p0, Ll/ܿۙ;->ۧ:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    .line 432
    iput-object v0, p0, Ll/ܿۙ;->֫:Ljava/lang/CharSequence;

    return-void
.end method

.method public final ֫(Landroid/net/Uri;)V
    .locals 1

    .line 527
    iget-object v0, p0, Ll/ܿۙ;->ᩳ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 528
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿۙ;->ᩳ:Ljava/util/ArrayList;

    .line 530
    :cond_0
    iget-object v0, p0, Ll/ܿۙ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 675
    iget-object v0, p0, Ll/ܿۙ;->ܽ:Landroid/content/Intent;

    const-string v1, "android.intent.extra.SUBJECT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 357
    iget-object v0, p0, Ll/ܿۙ;->ᩳ:Ljava/util/ArrayList;

    const-string v1, "android.intent.extra.STREAM"

    iget-object v2, p0, Ll/ܿۙ;->ܽ:Landroid/content/Intent;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v3, 0x1

    if-le v0, v3, :cond_0

    const-string v0, "android.intent.action.SEND_MULTIPLE"

    .line 370
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 371
    iget-object v0, p0, Ll/ܿۙ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 372
    iget-object v0, p0, Ll/ܿۙ;->ᩳ:Ljava/util/ArrayList;

    invoke-static {v2, v0}, Ll/ܳۙ;->֫(Landroid/content/Intent;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_0
    const-string v0, "android.intent.action.SEND"

    .line 360
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 361
    iget-object v0, p0, Ll/ܿۙ;->ᩳ:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 362
    iget-object v0, p0, Ll/ܿۙ;->ᩳ:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 363
    iget-object v0, p0, Ll/ܿۙ;->ᩳ:Ljava/util/ArrayList;

    invoke-static {v2, v0}, Ll/ܳۙ;->֫(Landroid/content/Intent;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 365
    :cond_1
    invoke-virtual {v2, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 366
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    .line 367
    invoke-virtual {v2}, Landroid/content/Intent;->getFlags()I

    move-result v0

    and-int/lit8 v0, v0, -0x2

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 414
    :goto_0
    iget-object v0, p0, Ll/ܿۙ;->֫:Ljava/lang/CharSequence;

    invoke-static {v2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    .line 421
    iget-object v1, p0, Ll/ܿۙ;->ۧ:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 456
    iget-object v0, p0, Ll/ܿۙ;->ܽ:Landroid/content/Intent;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    return-void
.end method
