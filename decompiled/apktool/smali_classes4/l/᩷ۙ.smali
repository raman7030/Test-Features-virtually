.class public final Ll/᩷ۙ;
.super Ljava/lang/Object;
.source "I53K"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩸:Ljava/util/ArrayList;

.field public final ᩹:Ll/֨ܿ;


# direct methods
.method public constructor <init>(Ll/֨ܿ;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩷ۙ;->᩸:Ljava/util/ArrayList;

    .line 82
    iput-object p1, p0, Ll/᩷ۙ;->᩹:Ll/֨ܿ;

    return-void
.end method

.method public static ۧ(Ll/֨ܿ;)Ll/᩷ۙ;
    .locals 1

    .line 94
    new-instance v0, Ll/᩷ۙ;

    invoke-direct {v0, p0}, Ll/᩷ۙ;-><init>(Ll/֨ܿ;)V

    return-object v0
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 257
    iget-object v0, p0, Ll/᩷ۙ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֨ܿ;)V
    .locals 4

    .line 160
    invoke-interface {p1}, Ll/ۜۙ;->ۧ()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 163
    invoke-static {p1}, Ll/ᩳ᩶;->֫(Ll/֨ܿ;)Landroid/content/Intent;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_3

    .line 169
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    .line 170
    iget-object v1, p0, Ll/᩷ۙ;->᩹:Ll/֨ܿ;

    if-nez p1, :cond_1

    .line 171
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p1

    .line 201
    :cond_1
    iget-object v2, p0, Ll/᩷ۙ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 203
    :try_start_0
    invoke-static {v1, p1}, Ll/ᩳ᩶;->֫(Ll/֨ܿ;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    .line 205
    invoke-virtual {v2, v3, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 206
    invoke-virtual {p1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ᩳ᩶;->֫(Ll/֨ܿ;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 120
    :cond_2
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :catch_0
    move-exception p1

    .line 210
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 284
    iget-object v0, p0, Ll/᩷ۙ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v2, v1, [Landroid/content/Intent;

    .line 289
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/content/Intent;

    .line 290
    new-instance v2, Landroid/content/Intent;

    aget-object v3, v0, v1

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v3, 0x1000c000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v2

    aput-object v2, v0, v1

    .line 292
    iget-object v1, p0, Ll/᩷ۙ;->᩹:Ll/֨ܿ;

    const/4 v2, 0x0

    .line 272
    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    .line 285
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No intents added to TaskStackBuilder; cannot startActivities"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
