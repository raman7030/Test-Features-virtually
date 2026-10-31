.class public final Ll/ۙۢۜ;
.super Ljava/lang/Object;
.source "K6XC"


# instance fields
.field public ֫:J

.field public ۜ:Ljava/lang/String;

.field public ۡ:Lbin/mt/json/JSONArray;

.field public ۢ:Z

.field public ۧ:Z

.field public final ܳ:Ljava/lang/String;

.field public final ܺ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/Integer;

.field public ᩷:Ljava/lang/String;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 362
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 356
    iput-boolean v0, p0, Ll/ۙۢۜ;->ۢ:Z

    .line 357
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Ll/ۙۢۜ;->ۡ:Lbin/mt/json/JSONArray;

    const-wide/16 v0, -0x1

    .line 358
    iput-wide v0, p0, Ll/ۙۢۜ;->֫:J

    .line 363
    iput-object p1, p0, Ll/ۙۢۜ;->ܽ:Ljava/lang/String;

    .line 364
    iput-object p2, p0, Ll/ۙۢۜ;->ܺ:Ljava/lang/String;

    .line 365
    iput-object p3, p0, Ll/ۙۢۜ;->ܿ:Ljava/lang/String;

    .line 366
    iput-object p4, p0, Ll/ۙۢۜ;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ۙۢۜ;Ll/ۗۢۜ;)V
    .locals 2

    .line 371
    invoke-static {p1}, Ll/ۗۢۜ;->ۧ(Ll/ۗۢۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۗۢۜ;->֫(Ll/ۗۢۜ;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    iput-wide v0, p0, Ll/ۙۢۜ;->֫:J

    return-void
.end method
