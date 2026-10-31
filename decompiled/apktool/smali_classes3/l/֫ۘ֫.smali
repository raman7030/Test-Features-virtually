.class public Ll/֫ۘ֫;
.super Ll/᩺ۖ֫;
.source "X6AW"


# instance fields
.field public final synthetic ܿ:Ll/ܶۘ֫;


# direct methods
.method public constructor <init>(Ll/ܶۘ֫;)V
    .locals 0

    .line 532
    iput-object p1, p0, Ll/֫ۘ֫;->ܿ:Ll/ܶۘ֫;

    invoke-direct {p0, p1}, Ll/᩺ۖ֫;-><init>(Ll/ܶۘ֫;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .line 535
    new-instance v0, Ll/۟ۖ֫;

    iget-object v1, p0, Ll/֫ۘ֫;->ܿ:Ll/ܶۘ֫;

    invoke-direct {v0, p0, v1}, Ll/۟ۖ֫;-><init>(Ll/֫ۘ֫;Landroid/content/Context;)V

    iput-object v0, p0, Ll/᩺ۖ֫;->ܽ:Landroid/service/media/MediaBrowserService;

    .line 536
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService;->onCreate()V

    return-void
.end method
