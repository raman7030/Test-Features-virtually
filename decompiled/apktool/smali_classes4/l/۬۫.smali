.class public final Ll/۬۫;
.super Ljava/lang/Object;
.source "SB10"

# interfaces
.implements Ll/ۗ۫;


# instance fields
.field public final ֫:Landroid/content/ContentProviderClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    .line 251
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 252
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->acquireUnstableContentProviderClient(Landroid/net/Uri;)Landroid/content/ContentProviderClient;

    move-result-object p1

    iput-object p1, p0, Ll/۬۫;->֫:Landroid/content/ContentProviderClient;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 272
    iget-object v0, p0, Ll/۬۫;->֫:Landroid/content/ContentProviderClient;

    if-eqz v0, :cond_0

    .line 273
    invoke-virtual {v0}, Landroid/content/ContentProviderClient;->release()Z

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/net/Uri;[Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8

    const-string v3, "query = ?"

    const/4 v7, 0x0

    .line 258
    iget-object v0, p0, Ll/۬۫;->֫:Landroid/content/ContentProviderClient;

    if-nez v0, :cond_0

    return-object v7

    :cond_0
    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    .line 262
    :try_start_0
    invoke-virtual/range {v0 .. v6}, Landroid/content/ContentProviderClient;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v7
.end method
