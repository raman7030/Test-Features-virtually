.class public final Ll/ۗܳᩳ;
.super Ljava/lang/Object;
.source "4B3Z"


# instance fields
.field public ֫:J

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/۟۫ܳ;)V
    .locals 2

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 199
    iget-boolean v0, p1, Ll/۟۫ܳ;->ᩳ:Z

    iget-object v1, p1, Ll/۟۫ܳ;->ۜ:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "/"

    .line 0
    invoke-static {v1, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 200
    iput-object v0, p0, Ll/ۗܳᩳ;->ܽ:Ljava/lang/String;

    goto :goto_0

    .line 202
    :cond_0
    iput-object v1, p0, Ll/ۗܳᩳ;->ܽ:Ljava/lang/String;

    .line 203
    iget-wide v0, p1, Ll/۟۫ܳ;->᩷:J

    iput-wide v0, p0, Ll/ۗܳᩳ;->֫:J

    .line 205
    :goto_0
    iget-wide v0, p1, Ll/۟۫ܳ;->ۢ:J

    iput-wide v0, p0, Ll/ۗܳᩳ;->ᩳ:J

    .line 206
    iget-boolean v0, p1, Ll/۟۫ܳ;->ܿ:Z

    if-eqz v0, :cond_1

    .line 207
    iget-object p1, p1, Ll/۟۫ܳ;->ܳ:Ljava/lang/String;

    iput-object p1, p0, Ll/ۗܳᩳ;->ۧ:Ljava/lang/String;

    :cond_1
    return-void
.end method
