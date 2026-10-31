.class public final Ll/᩻۫֫;
.super Landroid/database/ContentObserver;
.source "O8SZ"


# instance fields
.field public final ֫:Landroid/content/ContentResolver;

.field public final ۧ:Landroid/net/Uri;

.field public final synthetic ܽ:Ll/᩷۫֫;


# direct methods
.method public constructor <init>(Ll/᩷۫֫;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 0

    .line 232
    iput-object p1, p0, Ll/᩻۫֫;->ܽ:Ll/᩷۫֫;

    .line 233
    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 234
    iput-object p3, p0, Ll/᩻۫֫;->֫:Landroid/content/ContentResolver;

    .line 235
    iput-object p4, p0, Ll/᩻۫֫;->ۧ:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 3

    .line 248
    iget-object p1, p0, Ll/᩻۫֫;->ܽ:Ll/᩷۫֫;

    invoke-static {p1}, Ll/᩷۫֫;->ۧ(Ll/᩷۫֫;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1}, Ll/᩷۫֫;->֫(Ll/᩷۫֫;)Ll/ᩳᩴ֫;

    move-result-object v1

    invoke-static {p1}, Ll/᩷۫֫;->ܽ(Ll/᩷۫֫;)Ll/ۢ۫֫;

    move-result-object v2

    .line 249
    invoke-static {v0, v1, v2}, Ll/ᩳ۫֫;->֫(Landroid/content/Context;Ll/ᩳᩴ֫;Ll/ۢ۫֫;)Ll/ᩳ۫֫;

    move-result-object v0

    .line 248
    invoke-static {p1, v0}, Ll/᩷۫֫;->֫(Ll/᩷۫֫;Ll/ᩳ۫֫;)V

    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 239
    iget-object v0, p0, Ll/᩻۫֫;->ۧ:Landroid/net/Uri;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/᩻۫֫;->֫:Landroid/content/ContentResolver;

    invoke-virtual {v2, v0, v1, p0}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 243
    iget-object v0, p0, Ll/᩻۫֫;->֫:Landroid/content/ContentResolver;

    invoke-virtual {v0, p0}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    return-void
.end method
