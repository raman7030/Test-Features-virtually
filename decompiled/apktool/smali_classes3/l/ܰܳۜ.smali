.class public final Ll/ܰܳۜ;
.super Ljava/lang/Object;
.source "777Z"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Long;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Ll/ܰܳۜ;->֫:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Ll/ܰܳۜ;->ۧ:Ljava/lang/Long;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/Long;)Ll/ܰܳۜ;
    .locals 1

    .line 34
    new-instance v0, Ll/ܰܳۜ;

    invoke-direct {v0, p0, p1}, Ll/ܰܳۜ;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method public static ֫(Ll/ۗ᩺ۡ;)Ll/ܰܳۜ;
    .locals 4

    .line 27
    new-instance v0, Ll/ܰܳۜ;

    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ܰܳۜ;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method
