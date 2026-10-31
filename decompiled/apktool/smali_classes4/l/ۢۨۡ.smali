.class public final synthetic Ll/ۢۨۡ;
.super Ljava/lang/Object;
.source "PAIZ"

# interfaces
.implements Ll/֫᩹᩵;


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 1

    const-string v0, "android.view.WindowManagerGlobal"

    .line 14
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x0

    return-object v0
.end method
