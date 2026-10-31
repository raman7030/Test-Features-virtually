.class public Ll/֨֫;
.super Ljava/lang/Object;
.source "N5R1"


# static fields
.field public static ᩺ܺ᩸:Z


# instance fields
.field public ֫:Ljava/util/HashMap;

.field public final ۧ:Landroid/media/session/MediaController;

.field public final ܽ:Ljava/lang/Object;

.field public final ܿ:Ll/ܳۧ;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Landroid/content/Context;Ll/ܳۧ;)V
    .locals 2

    .line 2007
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1996
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/֨֫;->ܽ:Ljava/lang/Object;

    .line 1998
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֨֫;->ᩳ:Ljava/util/ArrayList;

    .line 2001
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֨֫;->֫:Ljava/util/HashMap;

    .line 2008
    iput-object p2, p0, Ll/֨֫;->ܿ:Ll/ܳۧ;

    .line 2009
    new-instance v0, Landroid/media/session/MediaController;

    .line 2010
    invoke-virtual {p2}, Ll/ܳۧ;->ܽ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/session/MediaSession$Token;

    invoke-direct {v0, p1, v1}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V

    iput-object v0, p0, Ll/֨֫;->ۧ:Landroid/media/session/MediaController;

    .line 2011
    invoke-virtual {p2}, Ll/ܳۧ;->֫()Ll/ۖ֫;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2269
    new-instance p1, Ll/֡֫;

    invoke-direct {p1, p0}, Ll/֡֫;-><init>(Ll/֨֫;)V

    const-string p2, "android.support.v4.media.session.command.GET_EXTRA_BINDER"

    const/4 v1, 0x0

    .line 2231
    invoke-virtual {v0, p2, v1, p1}, Landroid/media/session/MediaController;->sendCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    :cond_0
    return-void
.end method

.method public static ֡֫ۙ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static ֡ۢ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Lbin/mt/plugin/api/PluginContext;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֨ܳۗ(Ljava/lang/Object;I)C
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    return p0
.end method

.method public static ֫ܶۚ()Z
    .locals 1

    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v0

    return v0
.end method

.method public static ֫ܿۢ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ()V

    return-void
.end method

.method public static ۖܺۜ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    return p0
.end method

.method public static ۚ۬᩷(I)V
    .locals 0

    invoke-static {p0}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void
.end method

.method public static ۚܺ᩵([SIII)Ljava/lang/String;
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

.method public static ۛۗ᩹(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    return p0
.end method

.method public static ۡۚܽ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    return p0
.end method

.method public static ܶ֨ۜ(Ljava/lang/Object;J)Landroid/animation/ObjectAnimator;
    .locals 0

    check-cast p0, Landroid/animation/ObjectAnimator;

    invoke-virtual {p0, p1, p2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ᩵ۧ(Ljava/lang/Object;I)Landroid/content/Intent;
    .locals 0

    check-cast p0, Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷ۖ֫(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    move-result p0

    return p0
.end method

.method public static ᩷ۚ᩷(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/֡ܶۡ;

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/֡ܶۡ;->֫([Ljava/lang/String;)V

    return-void
.end method

.method public static ᩷۟۬(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static ᩹᩸ۖ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩵ۚۢ;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 2274
    iget-object v0, p0, Ll/֨֫;->ܿ:Ll/ܳۧ;

    invoke-virtual {v0}, Ll/ܳۧ;->֫()Ll/ۖ֫;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 2277
    :cond_0
    iget-object v1, p0, Ll/֨֫;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵֫;

    .line 2278
    new-instance v4, Ll/ۚ֫;

    .line 2342
    invoke-direct {v4, v3}, Ll/ᩴ֫;-><init>(Ll/᩵֫;)V

    .line 2279
    iget-object v5, p0, Ll/֨֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v5, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2280
    iput-object v4, v3, Ll/᩵֫;->֫:Ll/᩷֫;

    .line 2282
    :try_start_0
    invoke-virtual {v0}, Ll/ܳۧ;->֫()Ll/ۖ֫;

    move-result-object v3

    invoke-interface {v3, v4}, Ll/ۖ֫;->֫(Ll/᩷֫;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2289
    :catch_0
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method
