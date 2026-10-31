.class public final Ll/۠ۖ᩵;
.super Ljava/lang/Object;
.source "5A0Y"

# interfaces
.implements Ll/᩹ۖ᩵;
.implements Ll/᩹ۡ᩵;


# instance fields
.field public ᩸:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 56
    iput-wide v0, p0, Ll/۠ۖ᩵;->᩸:J

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 102
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "EndOfFileInformation[endOfFile="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/۠ۖ᩵;->᩸:J

    const-string v4, "]"

    .line 0
    invoke-static {v1, v2, v3, v4}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 102
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(II[B)I
    .locals 0

    .line 67
    invoke-static {p1, p3}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide p1

    iput-wide p1, p0, Ll/۠ۖ᩵;->᩸:J

    const/16 p1, 0x8

    return p1
.end method

.method public final ֫(I[B)I
    .locals 2

    .line 90
    iget-wide v0, p0, Ll/۠ۖ᩵;->᩸:J

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    const/16 p1, 0x8

    return p1
.end method

.method public final ۧ()B
    .locals 1

    const/16 v0, 0x14

    return v0
.end method
