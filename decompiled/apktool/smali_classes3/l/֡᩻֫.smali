.class public Ll/֡᩻֫;
.super Ll/᩻ܽ;
.source "O4XG"

# interfaces
.implements Ll/ۖ᩹;
.implements Ll/ۘ᩹;


# static fields
.field public static final synthetic ۖ֫:I


# instance fields
.field public ۜ֫:Z

.field public ۡ֫:Z

.field public final ۢ֫:Ll/᩹᩻֫;

.field public ܺ֫:Z

.field public final ᩷֫:Ll/᩷ۡ֫;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 108
    invoke-direct {p0}, Ll/᩻ܽ;-><init>()V

    .line 89
    new-instance v0, Ll/᩵᩻֫;

    invoke-direct {v0, p0}, Ll/᩵᩻֫;-><init>(Ll/֡᩻֫;)V

    invoke-static {v0}, Ll/᩹᩻֫;->֫(Ll/ۙ᩻֫;)Ll/᩹᩻֫;

    move-result-object v0

    iput-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    .line 96
    new-instance v0, Ll/᩷ۡ֫;

    invoke-direct {v0, p0}, Ll/᩷ۡ֫;-><init>(Ll/᩻ۡ֫;)V

    iput-object v0, p0, Ll/֡᩻֫;->᩷֫:Ll/᩷ۡ֫;

    const/4 v0, 0x1

    .line 100
    iput-boolean v0, p0, Ll/֡᩻֫;->ܺ֫:Z

    .line 129
    invoke-virtual {p0}, Ll/᩻ܽ;->getSavedStateRegistry()Ll/ܶ۫ۧ;

    move-result-object v0

    new-instance v1, Ll/ܺ᩻֫;

    invoke-direct {v1, p0}, Ll/ܺ᩻֫;-><init>(Ll/֡᩻֫;)V

    const-string v2, "android:support:lifecycle"

    invoke-virtual {v0, v2, v1}, Ll/ܶ۫ۧ;->֫(Ljava/lang/String;Ll/۠۫ۧ;)V

    .line 136
    new-instance v0, Ll/ۖ᩻֫;

    invoke-direct {v0, p0}, Ll/ۖ᩻֫;-><init>(Ll/֡᩻֫;)V

    invoke-virtual {p0, v0}, Ll/᩻ܽ;->֫(Ll/۬ۤ;)V

    .line 139
    new-instance v0, Ll/ۘ᩻֫;

    invoke-direct {v0, p0}, Ll/ۘ᩻֫;-><init>(Ll/֡᩻֫;)V

    invoke-virtual {p0, v0}, Ll/᩻ܽ;->֫(Ll/ۘ᩻֫;)V

    .line 140
    new-instance v0, Ll/ᩴ᩻֫;

    invoke-direct {v0, p0}, Ll/ᩴ᩻֫;-><init>(Ll/֡᩻֫;)V

    invoke-virtual {p0, v0}, Ll/᩻ܽ;->֫(Ll/ܳᩳ;)V

    return-void
.end method

.method public static ֫(Ll/ۚۜ֫;Ll/ܰۢ֫;)Z
    .locals 4

    .line 770
    invoke-virtual {p0}, Ll/ۚۜ֫;->֨()Ljava/util/List;

    move-result-object p0

    .line 771
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩻֫;

    if-nez v1, :cond_1

    goto :goto_0

    .line 775
    :cond_1
    invoke-virtual {v1}, Ll/ۡ᩻֫;->getHost()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 776
    invoke-virtual {v1}, Ll/ۡ᩻֫;->getChildFragmentManager()Ll/ۚۜ֫;

    move-result-object v2

    .line 777
    invoke-static {v2, p1}, Ll/֡᩻֫;->֫(Ll/ۚۜ֫;Ll/ܰۢ֫;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 779
    :cond_2
    iget-object v2, v1, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    if-eqz v2, :cond_3

    .line 780
    invoke-virtual {v2}, Ll/ۖ᩷֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v2

    invoke-virtual {v2}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    sget-object v3, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v2, v3}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 781
    iget-object v0, v1, Ll/ۡ᩻֫;->mViewLifecycleOwner:Ll/ۖ᩷֫;

    invoke-virtual {v0, p1}, Ll/ۖ᩷֫;->֫(Ll/ܰۢ֫;)V

    const/4 v0, 0x1

    .line 784
    :cond_3
    iget-object v2, v1, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    invoke-virtual {v2}, Ll/᩷ۡ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    sget-object v3, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v2, v3}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 785
    iget-object v0, v1, Ll/ۡ᩻֫;->mLifecycleRegistry:Ll/᩷ۡ֫;

    invoke-virtual {v0, p1}, Ll/᩷ۡ֫;->֫(Ll/ܰۢ֫;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method


# virtual methods
.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    .line 411
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    if-eqz p4, :cond_5

    .line 147
    array-length v0, p4

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 149
    aget-object v0, p4, v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v1, "--autofill"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 150
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_5

    goto :goto_0

    :sswitch_1
    const-string v1, "--contentcapture"

    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 151
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_5

    goto :goto_0

    :sswitch_2
    const-string v1, "--list-dumpables"

    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :sswitch_3
    const-string v1, "--dump-dumpable"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 153
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_5

    goto :goto_0

    :sswitch_4
    const-string v1, "--translation"

    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 152
    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    .line 417
    :cond_5
    :goto_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 418
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    .line 419
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 420
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 421
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 422
    iget-boolean v1, p0, Ll/֡᩻֫;->ۜ֫:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 423
    iget-boolean v1, p0, Ll/֡᩻֫;->ۡ֫:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 424
    iget-boolean v1, p0, Ll/֡᩻֫;->ܺ֫:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 426
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 427
    invoke-static {p0}, Ll/ܿۖ֫;->֫(Ll/᩻ۡ֫;)Ll/ܿۖ֫;

    move-result-object v1

    invoke-virtual {v1, v0, p2, p3, p4}, Ll/ܿۖ֫;->֫(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 429
    :cond_6
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۚۜ֫;->֫(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x2673d6ef -> :sswitch_4
        0x5fd0f67 -> :sswitch_3
        0x1c2b8816 -> :sswitch_2
        0x4519f64d -> :sswitch_1
        0x56b9c952 -> :sswitch_0
    .end sparse-switch
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 151
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ۡ()V

    .line 152
    invoke-super {p0, p1, p2, p3}, Ll/᩻ܽ;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 217
    invoke-super {p0, p1}, Ll/᩻ܽ;->onCreate(Landroid/os/Bundle;)V

    .line 219
    iget-object p1, p0, Ll/֡᩻֫;->᩷֫:Ll/᩷ۡ֫;

    sget-object v0, Ll/᩺ۢ֫;->ۙ:Ll/᩺ۢ֫;

    invoke-virtual {p1, v0}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    .line 220
    iget-object p1, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {p1}, Ll/᩹᩻֫;->ܽ()V

    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 248
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩹᩻֫;->֫(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 229
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    const/4 v0, 0x0

    .line 248
    iget-object v1, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v1, v0, p1, p2, p3}, Ll/᩹᩻֫;->֫(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 240
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 258
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 259
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ᩳ()V

    .line 260
    iget-object v0, p0, Ll/֡᩻֫;->᩷֫:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 265
    invoke-super {p0, p1, p2}, Ll/᩻ܽ;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    .line 270
    iget-object p1, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {p1, p2}, Ll/᩹᩻֫;->֫(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onPause()V
    .locals 2

    .line 283
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    .line 284
    iput-boolean v0, p0, Ll/֡᩻֫;->ۡ֫:Z

    .line 285
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ܿ()V

    .line 286
    iget-object v0, p0, Ll/֡᩻֫;->᩷֫:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->۬:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public onPostResume()V
    .locals 2

    .line 322
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 333
    iget-object v0, p0, Ll/֡᩻֫;->᩷֫:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    .line 334
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ܳ()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 489
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ۡ()V

    .line 490
    invoke-super {p0, p1, p2, p3}, Ll/᩻ܽ;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 2

    .line 309
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ۡ()V

    .line 310
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v1, 0x1

    .line 311
    iput-boolean v1, p0, Ll/֡᩻֫;->ۡ֫:Z

    .line 312
    invoke-virtual {v0}, Ll/᩹᩻֫;->᩷()V

    return-void
.end method

.method public onStart()V
    .locals 3

    .line 344
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ۡ()V

    .line 345
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v1, 0x0

    .line 347
    iput-boolean v1, p0, Ll/֡᩻֫;->ܺ֫:Z

    .line 349
    iget-boolean v1, p0, Ll/֡᩻֫;->ۜ֫:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 350
    iput-boolean v1, p0, Ll/֡᩻֫;->ۜ֫:Z

    .line 351
    invoke-virtual {v0}, Ll/᩹᩻֫;->ۧ()V

    .line 354
    :cond_0
    invoke-virtual {v0}, Ll/᩹᩻֫;->᩷()V

    .line 358
    iget-object v1, p0, Ll/֡᩻֫;->᩷֫:Ll/᩷ۡ֫;

    sget-object v2, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    invoke-virtual {v1, v2}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    .line 359
    invoke-virtual {v0}, Ll/᩹᩻֫;->᩻()V

    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    .line 297
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ۡ()V

    return-void
.end method

.method public onStop()V
    .locals 2

    .line 369
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    .line 371
    iput-boolean v0, p0, Ll/֡᩻֫;->ܺ֫:Z

    .line 372
    invoke-virtual {p0}, Ll/֡᩻֫;->ۡ()V

    .line 374
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ۜ()V

    .line 375
    iget-object v0, p0, Ll/֡᩻֫;->᩷֫:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public final ۡ()V
    .locals 2

    .line 462
    :cond_0
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object v0

    .line 764
    sget-object v1, Ll/ܰۢ֫;->᩹:Ll/ܰۢ֫;

    invoke-static {v0, v1}, Ll/֡᩻֫;->֫(Ll/ۚۜ֫;Ll/ܰۢ֫;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public final ۢ()Ll/ۚۜ֫;
    .locals 1

    .line 462
    iget-object v0, p0, Ll/֡᩻֫;->ۢ֫:Ll/᩹᩻֫;

    invoke-virtual {v0}, Ll/᩹᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object v0

    return-object v0
.end method
