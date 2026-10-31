.class public final Ll/ܶۡ֫;
.super Ljava/lang/Object;
.source "0B0W"

# interfaces
.implements Ll/᩷ۤۧ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    const-string v0, "context"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-static {p1}, Ll/᩻ۤۧ;->֫(Landroid/content/Context;)Ll/᩻ۤۧ;

    move-result-object v0

    const-string v1, "getInstance(context)"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {v0}, Ll/᩻ۤۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    invoke-static {p1}, Ll/ᩳۡ֫;->֫(Landroid/content/Context;)V

    .line 90
    invoke-static {}, Ll/ۗۡ֫;->ܿ()Ll/ۗۡ֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۗۡ֫;->֫(Landroid/content/Context;)V

    .line 85
    invoke-static {}, Ll/ۗۡ֫;->ܿ()Ll/ۗۡ֫;

    move-result-object p1

    return-object p1

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name=\'androidx.lifecycle.ProcessLifecycleInitializer\'\n                   android:value=\'androidx.startup\' />\n               under InitializationProvider in your AndroidManifest.xml"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 41
    sget-object v0, Ll/ۡܶ᩵;->᩸:Ll/ۡܶ᩵;

    return-object v0
.end method
