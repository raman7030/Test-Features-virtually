.class public final Ll/ܶۙᩳ;
.super Ljava/lang/Object;
.source "26UX"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/۫᩹ᩳ;

.field public final ۙ:Ll/ۖۗᩳ;

.field public final ᩶:J

.field public ᩸:Ll/ۖۙᩳ;

.field public ᩹:Ll/ۚۙᩳ;


# direct methods
.method public constructor <init>(Ll/۫᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;J)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    .line 23
    invoke-virtual {p2}, Ll/ۖۗᩳ;->᩺ۧ()V

    iput-object p2, p0, Ll/ܶۙᩳ;->ۙ:Ll/ۖۗᩳ;

    .line 24
    iput-wide p5, p0, Ll/ܶۙᩳ;->᩶:J

    .line 25
    iput-object p3, p0, Ll/ܶۙᩳ;->᩸:Ll/ۖۙᩳ;

    .line 26
    iput-object p4, p0, Ll/ܶۙᩳ;->᩹:Ll/ۚۙᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 31
    iget-object v0, p0, Ll/ܶۙᩳ;->ۙ:Ll/ۖۗᩳ;

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ܶۙᩳ;->᩸:Ll/ۖۙᩳ;

    .line 32
    iput-object v1, p0, Ll/ܶۙᩳ;->᩹:Ll/ۚۙᩳ;

    .line 33
    :try_start_0
    iget-object v1, p0, Ll/ܶۙᩳ;->ۗ:Ll/۫᩹ᩳ;

    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ll/ۖۗᩳ;->close()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ll/ۖۗᩳ;->close()V

    throw v1
.end method
