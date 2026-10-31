.class public final Ll/ۜᩳ֫;
.super Ljava/lang/Object;
.source "DB30"


# static fields
.field public static volatile ۡ:Ll/ۜᩳ֫;

.field public static final ۢ:Ljava/lang/Object;


# instance fields
.field public final ֫:Ll/ۧᩳ֫;

.field public final ۜ:Ll/ܿᩳ֫;

.field public final ۧ:Ll/᩺ܽ֫;

.field public final ܳ:Landroid/os/Handler;

.field public final ܽ:Ll/ᩴ᩵;

.field public volatile ܿ:I

.field public final ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final ᩷:Ll/֫ᩳ֫;

.field public final ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 349
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۜᩳ֫;->ۢ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/۟ܽ֫;)V
    .locals 4

    .line 461
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 462
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    const/4 v1, 0x3

    .line 463
    iput v1, p0, Ll/ۜᩳ֫;->ܿ:I

    .line 469
    iget-object v1, p1, Ll/۟ܽ֫;->ܽ:Ll/ܿᩳ֫;

    iput-object v1, p0, Ll/ۜᩳ֫;->ۜ:Ll/ܿᩳ֫;

    .line 470
    iget v2, p1, Ll/۟ܽ֫;->ۧ:I

    iput v2, p0, Ll/ۜᩳ֫;->᩻:I

    .line 471
    iget-object p1, p1, Ll/۟ܽ֫;->֫:Ll/ۧᩳ֫;

    iput-object p1, p0, Ll/ۜᩳ֫;->֫:Ll/ۧᩳ֫;

    .line 472
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {p1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Ll/ۜᩳ֫;->ܳ:Landroid/os/Handler;

    .line 473
    new-instance p1, Ll/ᩴ᩵;

    invoke-direct {p1}, Ll/ᩴ᩵;-><init>()V

    iput-object p1, p0, Ll/ۜᩳ֫;->ܽ:Ll/ᩴ᩵;

    .line 475
    new-instance p1, Ll/֫ᩳ֫;

    .line 1207
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 475
    iput-object p1, p0, Ll/ۜᩳ֫;->᩷:Ll/֫ᩳ֫;

    .line 479
    new-instance p1, Ll/᩺ܽ֫;

    .line 1703
    invoke-direct {p1, p0}, Ll/ܰܽ֫;-><init>(Ll/ۜᩳ֫;)V

    .line 479
    iput-object p1, p0, Ll/ۜᩳ֫;->ۧ:Ll/᩺ܽ֫;

    .line 692
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    if-nez v2, :cond_0

    const/4 v2, 0x0

    .line 695
    :try_start_0
    iput v2, p0, Ll/ۜᩳ֫;->ܿ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 698
    iget-object v0, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 699
    throw p1

    .line 698
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 701
    invoke-virtual {p0}, Ll/ۜᩳ֫;->֫()I

    move-result v0

    if-nez v0, :cond_1

    .line 1709
    :try_start_1
    new-instance v0, Ll/ۨܽ֫;

    invoke-direct {v0, p1}, Ll/ۨܽ֫;-><init>(Ll/᩺ܽ֫;)V

    .line 1720
    invoke-interface {v1, v0}, Ll/ܿᩳ֫;->֫(Ll/ܳᩳ֫;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :catchall_1
    move-exception p1

    .line 1722
    invoke-virtual {p0, p1}, Ll/ۜᩳ֫;->֫(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ۜᩳ֫;)Ll/֫ᩳ֫;
    .locals 0

    .line 111
    iget-object p0, p0, Ll/ۜᩳ֫;->᩷:Ll/֫ᩳ֫;

    return-object p0
.end method

.method public static ֫(Ll/۟ܽ֫;)V
    .locals 2

    .line 553
    sget-object v0, Ll/ۜᩳ֫;->ۡ:Ll/ۜᩳ֫;

    if-nez v0, :cond_1

    .line 555
    sget-object v0, Ll/ۜᩳ֫;->ۢ:Ljava/lang/Object;

    monitor-enter v0

    .line 556
    :try_start_0
    sget-object v1, Ll/ۜᩳ֫;->ۡ:Ll/ۜᩳ֫;

    if-nez v1, :cond_0

    .line 558
    new-instance v1, Ll/ۜᩳ֫;

    invoke-direct {v1, p0}, Ll/ۜᩳ֫;-><init>(Ll/۟ܽ֫;)V

    .line 559
    sput-object v1, Ll/ۜᩳ֫;->ۡ:Ll/ۜᩳ֫;

    .line 561
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    return-void
.end method

.method public static ֫(Landroid/text/Editable;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 867
    invoke-static {p0, p1, p2}, Ll/᩸ᩳ֫;->֫(Landroid/text/Editable;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/view/inputmethod/InputConnection;Landroid/text/Editable;IIZ)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_19

    if-ltz p2, :cond_19

    if-gez p3, :cond_0

    goto/16 :goto_9

    .line 519
    :cond_0
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v1

    .line 520
    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v1, v3, :cond_19

    if-eq v2, v3, :cond_19

    if-eq v1, v2, :cond_1

    goto/16 :goto_9

    :cond_1
    const/4 v4, 0x1

    if-eqz p4, :cond_16

    .line 531
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 806
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-ltz v1, :cond_b

    if-ge p4, v1, :cond_2

    goto :goto_2

    :cond_2
    if-gez p2, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    const/4 p4, 0x0

    :goto_1
    if-nez p2, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_6

    if-eqz p4, :cond_5

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    goto :goto_3

    .line 827
    :cond_6
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eqz p4, :cond_8

    .line 829
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p4

    if-nez p4, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    .line 836
    :cond_8
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v6

    if-nez v6, :cond_9

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    .line 840
    :cond_9
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p4

    if-eqz p4, :cond_a

    goto :goto_2

    :cond_a
    const/4 p4, 0x1

    goto :goto_1

    :cond_b
    :goto_2
    const/4 v1, -0x1

    .line 533
    :goto_3
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 862
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-ltz v2, :cond_14

    if-ge p3, v2, :cond_c

    goto :goto_6

    :cond_c
    if-gez p2, :cond_d

    goto :goto_6

    :cond_d
    :goto_4
    const/4 p4, 0x0

    :goto_5
    if-nez p2, :cond_e

    move p3, v2

    goto :goto_7

    :cond_e
    if-lt v2, p3, :cond_f

    if-eqz p4, :cond_15

    goto :goto_6

    .line 883
    :cond_f
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eqz p4, :cond_11

    .line 885
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result p4

    if-nez p4, :cond_10

    goto :goto_6

    :cond_10
    add-int/lit8 p2, p2, -0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 893
    :cond_11
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v6

    if-nez v6, :cond_12

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 898
    :cond_12
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result p4

    if-eqz p4, :cond_13

    goto :goto_6

    :cond_13
    add-int/lit8 v2, v2, 0x1

    const/4 p4, 0x1

    goto :goto_5

    :cond_14
    :goto_6
    const/4 p3, -0x1

    :cond_15
    :goto_7
    if-eq v1, v3, :cond_19

    if-ne p3, v3, :cond_17

    goto :goto_9

    :cond_16
    sub-int/2addr v1, p2

    .line 540
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v2, p3

    .line 541
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 544
    :cond_17
    const-class p2, Ll/᩹ᩳ֫;

    invoke-interface {p1, v1, p3, p2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ll/᩹ᩳ֫;

    if-eqz p2, :cond_19

    .line 545
    array-length p4, p2

    if-lez p4, :cond_19

    .line 546
    array-length p4, p2

    const/4 v2, 0x0

    :goto_8
    if-ge v2, p4, :cond_18

    .line 548
    aget-object v3, p2, v2

    .line 549
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    .line 550
    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v3

    .line 551
    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 552
    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 555
    :cond_18
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 556
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 558
    check-cast p0, Landroid/view/inputmethod/InputConnectionWrapper;

    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    .line 559
    invoke-interface {p1, p2, p3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 560
    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    return v4

    :cond_19
    :goto_9
    return v0
.end method

.method public static synthetic ۧ(Ll/ۜᩳ֫;)Ll/ۧᩳ֫;
    .locals 0

    .line 111
    iget-object p0, p0, Ll/ۜᩳ֫;->֫:Ll/ۧᩳ֫;

    return-object p0
.end method

.method public static ܿ()Z
    .locals 1

    .line 597
    sget-object v0, Ll/ۜᩳ֫;->ۡ:Ll/ۜᩳ֫;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ᩳ()Ll/ۜᩳ֫;
    .locals 4

    .line 652
    sget-object v0, Ll/ۜᩳ֫;->ۢ:Ljava/lang/Object;

    monitor-enter v0

    .line 653
    :try_start_0
    sget-object v1, Ll/ۜᩳ֫;->ۡ:Ll/ۜᩳ֫;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."

    if-eqz v2, :cond_1

    .line 655
    monitor-exit v0

    return-object v1

    .line 168
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 656
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 787
    iget-object v0, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 789
    :try_start_0
    iget v0, p0, Ll/ۜᩳ֫;->ܿ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 791
    iget-object v1, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 792
    throw v0
.end method

.method public final ֫(IILjava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 4

    .line 799
    invoke-virtual {p0}, Ll/ۜᩳ֫;->֫()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_9

    if-ltz p1, :cond_8

    if-ltz p2, :cond_7

    if-gt p1, p2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const-string v3, "start should be <= than end"

    .line 1103
    invoke-static {v3, v0}, Ll/ܰۤ;->֫(Ljava/lang/String;Z)V

    if-nez p3, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 1110
    :cond_2
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p1, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    const-string v3, "start should be < than charSequence length"

    invoke-static {v3, v0}, Ll/ܰۤ;->֫(Ljava/lang/String;Z)V

    .line 1112
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p2, v0, :cond_4

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    const-string v0, "end should be < than charSequence length"

    invoke-static {v0, v2}, Ll/ܰۤ;->֫(Ljava/lang/String;Z)V

    .line 1116
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-eqz v0, :cond_6

    if-ne p1, p2, :cond_5

    goto :goto_4

    .line 1134
    :cond_5
    iget-object v0, p0, Ll/ۜᩳ֫;->ۧ:Ll/᩺ܽ֫;

    invoke-virtual {v0, p3, p1, p2, v1}, Ll/᩺ܽ֫;->֫(Ljava/lang/CharSequence;IIZ)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_4
    return-object p3

    .line 208
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "end cannot be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "start cannot be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 168
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not initialized yet"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Landroid/view/inputmethod/EditorInfo;)V
    .locals 2

    .line 799
    invoke-virtual {p0}, Ll/ۜᩳ֫;->֫()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    if-nez p1, :cond_0

    return-void

    .line 1174
    :cond_0
    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    if-nez v0, :cond_1

    .line 1175
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 1177
    :cond_1
    iget-object v0, p0, Ll/ۜᩳ֫;->ۧ:Ll/᩺ܽ֫;

    invoke-virtual {v0, p1}, Ll/᩺ܽ֫;->֫(Landroid/view/inputmethod/EditorInfo;)V

    :cond_2
    return-void
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 4

    .line 723
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 724
    iget-object v1, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x2

    .line 726
    :try_start_0
    iput v1, p0, Ll/ۜᩳ֫;->ܿ:I

    .line 727
    iget-object v1, p0, Ll/ۜᩳ֫;->ܽ:Ll/ᩴ᩵;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 728
    iget-object v1, p0, Ll/ۜᩳ֫;->ܽ:Ll/ᩴ᩵;

    invoke-virtual {v1}, Ll/ᩴ᩵;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 730
    iget-object v1, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 732
    iget-object v1, p0, Ll/ۜᩳ֫;->ܳ:Landroid/os/Handler;

    new-instance v2, Ll/ᩳᩳ֫;

    iget v3, p0, Ll/ۜᩳ֫;->ܿ:I

    invoke-direct {v2, v0, v3, p1}, Ll/ᩳᩳ֫;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    .line 730
    iget-object v0, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 731
    throw p1
.end method

.method public final ֫(Ll/ܽᩳ֫;)V
    .locals 5

    const-string v0, "initCallback cannot be null"

    .line 750
    invoke-static {p1, v0}, Ll/ܰۤ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 752
    iget-object v0, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 754
    :try_start_0
    iget v0, p0, Ll/ۜᩳ֫;->ܿ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget v0, p0, Ll/ۜᩳ֫;->ܿ:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 757
    :cond_0
    iget-object v0, p0, Ll/ۜᩳ֫;->ܽ:Ll/ᩴ᩵;

    invoke-virtual {v0, p1}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 755
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۜᩳ֫;->ܳ:Landroid/os/Handler;

    new-instance v2, Ll/ᩳᩳ֫;

    iget v3, p0, Ll/ۜᩳ֫;->ܿ:I

    new-array v1, v1, [Ll/ܽᩳ֫;

    const/4 v4, 0x0

    aput-object p1, v1, v4

    .line 1595
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    invoke-direct {v2, p1, v3, v1}, Ll/ᩳᩳ֫;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 755
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 760
    :goto_1
    iget-object p1, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 761
    throw p1
.end method

.method public final ۧ()V
    .locals 3

    .line 676
    iget v0, p0, Ll/ۜᩳ֫;->᩻:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    .line 799
    invoke-virtual {p0}, Ll/ۜᩳ֫;->֫()I

    move-result v0

    if-ne v0, v2, :cond_1

    return-void

    .line 680
    :cond_1
    iget-object v0, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 682
    :try_start_0
    iget v0, p0, Ll/ۜᩳ֫;->ܿ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_2

    .line 685
    iget-object v0, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    .line 683
    :cond_2
    :try_start_1
    iput v1, p0, Ll/ۜᩳ֫;->ܿ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 685
    iget-object v0, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 688
    iget-object v0, p0, Ll/ۜᩳ֫;->ۧ:Ll/᩺ܽ֫;

    .line 1709
    iget-object v1, v0, Ll/ܰܽ֫;->֫:Ll/ۜᩳ֫;

    :try_start_2
    new-instance v2, Ll/ۨܽ֫;

    invoke-direct {v2, v0}, Ll/ۨܽ֫;-><init>(Ll/᩺ܽ֫;)V

    .line 1720
    iget-object v0, v1, Ll/ۜᩳ֫;->ۜ:Ll/ܿᩳ֫;

    invoke-interface {v0, v2}, Ll/ܿᩳ֫;->֫(Ll/ܳᩳ֫;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 1722
    invoke-virtual {v1, v0}, Ll/ۜᩳ֫;->֫(Ljava/lang/Throwable;)V

    return-void

    :catchall_1
    move-exception v0

    .line 685
    iget-object v1, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 686
    throw v0

    .line 168
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ll/ܽᩳ֫;)V
    .locals 2

    const-string v0, "initCallback cannot be null"

    .line 770
    invoke-static {p1, v0}, Ll/ܰۤ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 771
    iget-object v0, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 773
    :try_start_0
    iget-object v1, p0, Ll/ۜᩳ֫;->ܽ:Ll/ᩴ᩵;

    invoke-virtual {v1, p1}, Ll/ᩴ᩵;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 775
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 776
    throw p1
.end method

.method public final ܽ()V
    .locals 5

    .line 708
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 709
    iget-object v1, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x1

    .line 711
    :try_start_0
    iput v1, p0, Ll/ۜᩳ֫;->ܿ:I

    .line 712
    iget-object v1, p0, Ll/ۜᩳ֫;->ܽ:Ll/ᩴ᩵;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 713
    iget-object v1, p0, Ll/ۜᩳ֫;->ܽ:Ll/ᩴ᩵;

    invoke-virtual {v1}, Ll/ᩴ᩵;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 715
    iget-object v1, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 718
    iget-object v1, p0, Ll/ۜᩳ֫;->ܳ:Landroid/os/Handler;

    new-instance v2, Ll/ᩳᩳ֫;

    iget v3, p0, Ll/ۜᩳ֫;->ܿ:I

    const/4 v4, 0x0

    .line 1601
    invoke-direct {v2, v0, v3, v4}, Ll/ᩳᩳ֫;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 718
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    .line 715
    iget-object v1, p0, Ll/ۜᩳ֫;->ᩳ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 716
    throw v0
.end method
