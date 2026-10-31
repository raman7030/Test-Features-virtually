.class public final Ll/ۗܽ֫;
.super Ljava/lang/Object;
.source "UB1K"


# instance fields
.field public final ֫:Ll/۬ܽ֫;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 246
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 247
    new-instance v0, Ll/ۤܽ֫;

    .line 262
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 249
    :cond_0
    new-instance v0, Ll/۫ܽ֫;

    .line 262
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 120
    :goto_0
    iput-object v0, p0, Ll/ۗܽ֫;->֫:Ll/۬ܽ֫;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;)Ll/۬ᩳ֫;
    .locals 8

    .line 159
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "Package manager required to locate emoji font provider"

    .line 161
    invoke-static {v0, v1}, Ll/ܰۤ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    new-instance v1, Landroid/content/Intent;

    const-string v2, "androidx.content.action.LOAD_EMOJI_FONT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۗܽ֫;->֫:Ll/۬ܽ֫;

    invoke-virtual {v2, v0, v1}, Ll/۬ܽ֫;->֫(Landroid/content/pm/PackageManager;Landroid/content/Intent;)Ljava/util/List;

    move-result-object v1

    .line 186
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 187
    invoke-virtual {v2, v3}, Ll/۬ܽ֫;->֫(Landroid/content/pm/ResolveInfo;)Landroid/content/pm/ProviderInfo;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 201
    iget-object v5, v3, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v5, :cond_0

    iget v5, v5, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v6, 0x1

    and-int/2addr v5, v6

    if-ne v5, v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    if-nez v3, :cond_2

    goto :goto_2

    .line 219
    :cond_2
    :try_start_0
    iget-object v1, v3, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 220
    iget-object v3, v3, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 222
    invoke-virtual {v2, v0, v3}, Ll/۬ܽ֫;->֫(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object v0

    .line 234
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 235
    array-length v5, v0

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_3

    aget-object v7, v0, v6

    .line 236
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 238
    :cond_3
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 225
    new-instance v2, Ll/ۨ۫;

    const-string v5, "emojicompat-emoji-font"

    invoke-direct {v2, v1, v3, v5, v0}, Ll/ۨ۫;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    :goto_2
    move-object v2, v4

    :goto_3
    if-nez v2, :cond_4

    goto :goto_4

    .line 145
    :cond_4
    new-instance v4, Ll/۬ᩳ֫;

    invoke-direct {v4, p1, v2}, Ll/۬ᩳ֫;-><init>(Landroid/content/Context;Ll/ۨ۫;)V

    :goto_4
    return-object v4
.end method
