.class public final synthetic Ll/ۤۢۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Ll/᩵᩹᩷;


# instance fields
.field public final synthetic ᩸:Ll/۟ۡۢ;


# direct methods
.method public synthetic constructor <init>(Ll/۟ۡۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۢۢ;->᩸:Ll/۟ۡۢ;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;I)V
    .locals 1

    .line 2
    sget v0, Ll/۟ۡۢ;->ᩴۧ:I

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    if-eqz p1, :cond_0

    const-string p2, "apkPath"

    .line 138
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 341
    new-instance p2, Ll/ۜۡۢ;

    iget-object v0, p0, Ll/ۤۢۢ;->᩸:Ll/۟ۡۢ;

    invoke-direct {p2, v0, p1}, Ll/ۜۡۢ;-><init>(Ll/۟ۡۢ;Ljava/lang/String;)V

    .line 527
    invoke-virtual {p2}, Ll/۟ܶۡ;->᩻()V

    :cond_0
    return-void
.end method
