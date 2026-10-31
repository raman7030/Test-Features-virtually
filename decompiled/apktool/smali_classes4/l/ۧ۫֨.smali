.class public final Ll/ۧ۫֨;
.super Ll/۬۫֨;
.source "W7SR"


# instance fields
.field public final synthetic ۧ:Ll/ܽ۫֨;


# direct methods
.method public constructor <init>(Ll/ܽ۫֨;)V
    .locals 0

    .line 1276
    iput-object p1, p0, Ll/ۧ۫֨;->ۧ:Ll/ܽ۫֨;

    invoke-direct {p0}, Ll/۬۫֨;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖۚ۠;)V
    .locals 2

    .line 1279
    iget-object v0, p0, Ll/ۧ۫֨;->ۧ:Ll/ܽ۫֨;

    iget-object v1, v0, Ll/ܽ۫֨;->ᩳ:Ll/ۙ֨֨;

    .line 1281
    :try_start_0
    iput-object v1, v0, Ll/ܽ۫֨;->ᩳ:Ll/ۙ֨֨;

    .line 1282
    iget-object p1, p1, Ll/ۖۚ۠;->۬:Ll/۫᩵۠;

    invoke-virtual {v0, p1}, Ll/ܶ۫֨;->ۧ(Ll/ۚۚ۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1284
    iput-object v1, v0, Ll/ܽ۫֨;->ᩳ:Ll/ۙ֨֨;

    return-void

    :catchall_0
    move-exception p1

    iput-object v1, v0, Ll/ܽ۫֨;->ᩳ:Ll/ۙ֨֨;

    .line 1285
    throw p1
.end method
