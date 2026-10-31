.class public final Ll/۫᩵ܿ;
.super Ljava/lang/Object;
.source "66XX"


# instance fields
.field public final ֫:Ll/ܶ᩵ܿ;

.field public final ۧ:J

.field public final ܽ:J

.field public final ܿ:Ll/ۗ᩵ܿ;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/ۗ᩵ܿ;JJLjava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Ll/۫᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    .line 55
    iput-object p2, p0, Ll/۫᩵ܿ;->ܿ:Ll/ۗ᩵ܿ;

    .line 56
    iput-wide p3, p0, Ll/۫᩵ܿ;->ܽ:J

    .line 57
    iput-wide p5, p0, Ll/۫᩵ܿ;->ۧ:J

    .line 58
    iput-object p7, p0, Ll/۫᩵ܿ;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Ll/۫᩵ܿ;
    .locals 9

    .line 63
    new-instance v8, Ll/۫᩵ܿ;

    sget-object v2, Ll/ۗ᩵ܿ;->ۙ:Ll/ۗ᩵ܿ;

    const-wide/16 v5, -0x1

    const/4 v7, 0x0

    const-wide/16 v3, -0x1

    move-object v0, v8

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Ll/۫᩵ܿ;-><init>(Ll/ܶ᩵ܿ;Ll/ۗ᩵ܿ;JJLjava/lang/String;)V

    return-object v8
.end method


# virtual methods
.method public final ֫()Ll/ܶ᩵ܿ;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/۫᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ۧ()J
    .locals 2

    .line 83
    iget-wide v0, p0, Ll/۫᩵ܿ;->ۧ:J

    return-wide v0
.end method

.method public final ܽ()J
    .locals 2

    .line 78
    iget-wide v0, p0, Ll/۫᩵ܿ;->ܽ:J

    return-wide v0
.end method

.method public final ܿ()Ll/ۗ᩵ܿ;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/۫᩵ܿ;->ܿ:Ll/ۗ᩵ܿ;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/۫᩵ܿ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method
