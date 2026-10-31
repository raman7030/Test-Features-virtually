.class public Ll/᩺ۖ֫;
.super Ljava/lang/Object;
.source "X6AW"

# interfaces
.implements Ll/ۛۖ֫;


# instance fields
.field public ֫:Landroid/os/Messenger;

.field public final ۧ:Ljava/util/ArrayList;

.field public ܽ:Landroid/service/media/MediaBrowserService;

.field public final synthetic ᩳ:Ll/ܶۘ֫;


# direct methods
.method public constructor <init>(Ll/ܶۘ֫;)V
    .locals 0

    .line 300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۖ֫;->ᩳ:Ll/ܶۘ֫;

    .line 301
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩺ۖ֫;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .line 307
    new-instance v0, Ll/ۨۖ֫;

    iget-object v1, p0, Ll/᩺ۖ֫;->ᩳ:Ll/ܶۘ֫;

    invoke-direct {v0, p0, v1}, Ll/ۨۖ֫;-><init>(Ll/᩺ۖ֫;Landroid/content/Context;)V

    iput-object v0, p0, Ll/᩺ۖ֫;->ܽ:Landroid/service/media/MediaBrowserService;

    .line 308
    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService;->onCreate()V

    return-void
.end method
