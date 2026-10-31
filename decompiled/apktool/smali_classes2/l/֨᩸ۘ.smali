.class public final Ll/֨᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Landroid/os/Bundle;

.field public final synthetic ᩸:Ll/᩸۠ۘ;

.field public final synthetic ᩹:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Ll/᩸۠ۘ;Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩸ۘ;->᩸:Ll/᩸۠ۘ;

    iput-object p2, p0, Ll/֨᩸ۘ;->᩹:Landroid/app/Activity;

    iput-object p3, p0, Ll/֨᩸ۘ;->᩶:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 272
    :try_start_0
    iget-object v0, p0, Ll/֨᩸ۘ;->᩸:Ll/᩸۠ۘ;

    iget-object v1, p0, Ll/֨᩸ۘ;->᩹:Landroid/app/Activity;

    iget-object v2, p0, Ll/֨᩸ۘ;->᩶:Landroid/os/Bundle;

    invoke-static {v0, v1, v2}, Ll/᩸᩸ۘ;->֫(Ll/᩸۠ۘ;Landroid/app/Activity;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/ܶ᩸ۘ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ll/۠᩸ۘ; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
