.class public final Ll/ܺ;
.super Landroid/media/browse/MediaBrowser$ConnectionCallback;
.source "95XT"


# instance fields
.field public final synthetic ֫:Ll/ۖ;


# direct methods
.method public constructor <init>(Ll/ۖ;)V
    .locals 0

    .line 696
    iput-object p1, p0, Ll/ܺ;->֫:Ll/ۖ;

    invoke-direct {p0}, Landroid/media/browse/MediaBrowser$ConnectionCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnected()V
    .locals 2

    .line 701
    iget-object v0, p0, Ll/ܺ;->֫:Ll/ۖ;

    iget-object v1, v0, Ll/ۖ;->ۧ:Ll/᩵;

    if-eqz v1, :cond_0

    .line 702
    invoke-virtual {v1}, Ll/᩵;->ᩳ()V

    .line 704
    :cond_0
    invoke-virtual {v0}, Ll/ۖ;->֫()V

    return-void
.end method

.method public final onConnectionFailed()V
    .locals 1

    .line 717
    iget-object v0, p0, Ll/ܺ;->֫:Ll/ۖ;

    .line 720
    invoke-virtual {v0}, Ll/ۖ;->ۧ()V

    return-void
.end method

.method public final onConnectionSuspended()V
    .locals 2

    .line 709
    iget-object v0, p0, Ll/ܺ;->֫:Ll/ۖ;

    iget-object v1, v0, Ll/ۖ;->ۧ:Ll/᩵;

    if-eqz v1, :cond_0

    .line 710
    invoke-virtual {v1}, Ll/᩵;->ܿ()V

    .line 712
    :cond_0
    invoke-virtual {v0}, Ll/ۖ;->ܽ()V

    return-void
.end method
