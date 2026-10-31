.class public final synthetic Ll/᩶ۢᩴ;
.super Ljava/lang/Object;
.source "4BPK"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/᩺ܳۡ;
.implements Lcom/google/android/material/shape/ShapeAppearanceModel$CornerSizeUnaryOperator;
.implements Ll/᩺ۚ֡;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩶ۢᩴ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ll/ۗ᩹֫;)V
    .locals 0

    const/4 p1, 0x4

    .line 0
    iput p1, p0, Ll/᩶ۢᩴ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(IIII)I
    .locals 0

    add-int/2addr p0, p1

    mul-int p0, p0, p2

    add-int/2addr p0, p3

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 5
    invoke-interface {p4, p2, p0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 7
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public static ֫(Ll/ۙۢᩴ;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 1

    .line 76
    instance-of v0, p1, Ll/ۙۢᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۙۢᩴ;

    invoke-interface {p0, p1}, Ll/ۙۢᩴ;->֫(Ll/ۙۢᩴ;)Ll/᩹ۢᩴ;

    move-result-object p0

    return-object p0

    .line 77
    :cond_0
    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۘۨۚ;JLjava/lang/String;[Ljava/lang/Object;)Ll/۫ۗۚ;
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۘۨۚ;->֫(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 1
    new-instance p0, Ll/۫ۗۚ;

    .line 2
    invoke-direct {p0}, Ll/۫ۗۚ;-><init>()V

    .line 3
    invoke-virtual {p0}, Ll/۫ۗۚ;->ۧ()V

    return-object p0
.end method

.method public static synthetic ֫(Landroid/database/Cursor;)V
    .locals 1

    .line 0
    instance-of v0, p0, Ljava/lang/AutoCloseable;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/AutoCloseable;

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-void

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/concurrent/ExecutorService;

    invoke-static {p0}, Ll/۫۫;->֫(Ljava/util/concurrent/ExecutorService;)V

    return-void

    :cond_1
    instance-of v0, p0, Landroid/content/res/TypedArray;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/content/res/TypedArray;

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_2
    instance-of v0, p0, Landroid/media/MediaMetadataRetriever;

    if-eqz v0, :cond_3

    check-cast p0, Landroid/media/MediaMetadataRetriever;

    invoke-virtual {p0}, Landroid/media/MediaMetadataRetriever;->release()V

    return-void

    :cond_3
    instance-of v0, p0, Landroid/media/MediaDrm;

    if-eqz v0, :cond_4

    check-cast p0, Landroid/media/MediaDrm;

    invoke-virtual {p0}, Landroid/media/MediaDrm;->release()V

    return-void

    :cond_4
    instance-of v0, p0, Landroid/drm/DrmManagerClient;

    if-eqz v0, :cond_5

    check-cast p0, Landroid/drm/DrmManagerClient;

    invoke-virtual {p0}, Landroid/drm/DrmManagerClient;->release()V

    return-void

    :cond_5
    instance-of v0, p0, Landroid/content/ContentProviderClient;

    if-eqz v0, :cond_6

    check-cast p0, Landroid/content/ContentProviderClient;

    invoke-virtual {p0}, Landroid/content/ContentProviderClient;->release()Z

    return-void

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method


# virtual methods
.method public apply(Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/CornerSize;
    .locals 0

    .line 0
    invoke-static {p1}, Lcom/google/android/material/carousel/MaskableFrameLayout;->$r8$lambda$Agw_urQ8Ww6aiBeJU9RbO6qyqA8(Lcom/google/android/material/shape/CornerSize;)Lcom/google/android/material/shape/CornerSize;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩶ۢᩴ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/֨۬֫;

    .line 306
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 0
    :pswitch_0
    check-cast p1, Ll/֡᩵֫;

    .line 1047
    new-instance v0, Ll/ۙۙ֫;

    const-string v1, "Player release timed out."

    .line 76
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x3eb

    .line 1048
    invoke-static {v0, v1}, Ll/ᩳ᩶֫;->֫(Ljava/lang/RuntimeException;I)Ll/ᩳ᩶֫;

    move-result-object v0

    .line 1047
    invoke-interface {p1, v0}, Ll/֡᩵֫;->֫(Ll/ܺ᩵֫;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ljava/lang/String;Z)I
    .locals 0

    .line 0
    sget-object p1, Ll/ܰܳۡ;->ۢ֫:Ll/ۡۤۡ;

    const/4 p1, 0x1

    return p1
.end method

.method public ֫(Ll/ۙ᩵֡;)Ll/ۨۚ֡;
    .locals 1

    .line 0
    new-instance v0, Ll/᩺᩵֡;

    invoke-direct {v0, p1}, Ll/᩺᩵֡;-><init>(Ll/ۙ᩵֡;)V

    return-object v0
.end method
