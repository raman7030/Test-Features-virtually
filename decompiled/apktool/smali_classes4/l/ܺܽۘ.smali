.class public Ll/ܺܽۘ;
.super Ljava/lang/Exception;
.source "D9HR"


# instance fields
.field public final ᩸:J


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 30
    iput-wide p1, p0, Ll/ܺܽۘ;->᩸:J

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۟۫ۖ;
    .locals 2

    .line 43
    iget-wide v0, p0, Ll/ܺܽۘ;->᩸:J

    invoke-static {v0, v1}, Ll/۟۫ۖ;->ᩳ(J)Ll/۟۫ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()J
    .locals 2

    .line 39
    iget-wide v0, p0, Ll/ܺܽۘ;->᩸:J

    return-wide v0
.end method
