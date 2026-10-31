.class public final Ll/֫۫֨;
.super Ll/᩸۫֨;
.source "W7SR"


# instance fields
.field public final synthetic ۧ:Ll/ܽ۫֨;

.field public final synthetic ܽ:Ll/ۙ֨֨;


# direct methods
.method public constructor <init>(Ll/ܽ۫֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 1256
    iput-object p1, p0, Ll/֫۫֨;->ۧ:Ll/ܽ۫֨;

    iput-object p2, p0, Ll/֫۫֨;->ܽ:Ll/ۙ֨֨;

    invoke-direct {p0}, Ll/᩸۫֨;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤ֡۠;)V
    .locals 3

    .line 1259
    iget-object p1, p1, Ll/ۤ֡۠;->ۗ:Ll/۫᩵۠;

    if-eqz p1, :cond_0

    .line 1260
    iget-object v0, p0, Ll/֫۫֨;->ۧ:Ll/ܽ۫֨;

    iget-object v1, v0, Ll/ܽ۫֨;->ᩳ:Ll/ۙ֨֨;

    .line 1262
    :try_start_0
    iget-object v2, p0, Ll/֫۫֨;->ܽ:Ll/ۙ֨֨;

    iput-object v2, v0, Ll/ܽ۫֨;->ᩳ:Ll/ۙ֨֨;

    .line 1263
    invoke-virtual {v0, p1}, Ll/ܶ۫֨;->ۧ(Ll/ۚۚ۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1265
    iput-object v1, v0, Ll/ܽ۫֨;->ᩳ:Ll/ۙ֨֨;

    return-void

    :catchall_0
    move-exception p1

    iput-object v1, v0, Ll/ܽ۫֨;->ᩳ:Ll/ۙ֨֨;

    .line 1266
    throw p1

    :cond_0
    return-void
.end method
