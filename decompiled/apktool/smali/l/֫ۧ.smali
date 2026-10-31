.class public final Ll/֫ۧ;
.super Ljava/lang/Object;
.source "U6BF"


# static fields
.field public static ۙ۟ۧ:I


# direct methods
.method static native constructor <clinit>()V
.end method

.method public static ֫(Landroid/media/session/MediaSession$QueueItem;)Landroid/media/MediaDescription;
    .locals 0

    .line 2298
    invoke-virtual {p0}, Landroid/media/session/MediaSession$QueueItem;->getDescription()Landroid/media/MediaDescription;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/media/MediaDescription;J)Landroid/media/session/MediaSession$QueueItem;
    .locals 1

    .line 2293
    new-instance v0, Landroid/media/session/MediaSession$QueueItem;

    invoke-direct {v0, p0, p1, p2}, Landroid/media/session/MediaSession$QueueItem;-><init>(Landroid/media/MediaDescription;J)V

    return-object v0
.end method

.method public static ۖۡܺ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۗۛ᩻;
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۗܿۤ(Ljava/lang/Object;Ljava/lang/Object;)[B
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ۙܶ۟(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p0, Ll/᩵ۚۢ;

    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->֫(Z)V

    return-void
.end method

.method public static ۠ᩴۤ(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 0

    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static ۡۢۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/InputStream;
    .locals 0

    check-cast p0, Ll/᩵᩶ܿ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/᩵᩶ܿ;->᩻(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static ۢܰۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ᩳᩴۡ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ᩳᩴۡ;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public static ۢܺ᩸()I
    .locals 1

    const v0, 0x6507ac79

    return v0
.end method

.method public static ۧ(Landroid/media/session/MediaSession$QueueItem;)J
    .locals 2

    .line 2303
    invoke-virtual {p0}, Landroid/media/session/MediaSession$QueueItem;->getQueueId()J

    move-result-wide v0

    return-wide v0
.end method

.method public static ۫ܶܺ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    return p0
.end method

.method public static ܰۗۘ(ILjava/lang/Object;)I
    .locals 0

    check-cast p1, [B

    invoke-static {p0, p1}, Ll/ܺܰۡ;->֫(I[B)I

    move-result p0

    return p0
.end method

.method public static ܳܳۗ(Ljava/lang/Object;)Ll/᩵ۚۢ;
    .locals 0

    check-cast p0, Ll/۬ܺ᩷;

    invoke-interface {p0}, Ll/۬ܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    return-object p0
.end method

.method public static ܶۜܰ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->ۜ()Z

    move-result p0

    return p0
.end method

.method public static ܿ᩺᩹(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/ܽܳ᩷;

    invoke-virtual {p0}, Ll/ܽܳ᩷;->ۖ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ᩻᩹(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۗܺ᩷;

    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    return-void
.end method

.method public static ᩵ܳۘ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/᩻ᩴۡ;

    invoke-virtual {p0}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result p0

    return p0
.end method

.method public static ᩷ᩳ᩺([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ᩺ۧܿ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/ۚܽۚ;

    invoke-interface {p0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
