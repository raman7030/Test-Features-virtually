.class public final Ll/ۡۢۧ;
.super Ljava/lang/Object;
.source "J8LY"


# static fields
.field public static final ܽ:Ll/ۡۢۧ;


# instance fields
.field public final ֫:J

.field public final ۧ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 26
    new-instance v0, Ll/ۡۢۧ;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Ll/ۡۢۧ;-><init>(JJ)V

    sput-object v0, Ll/ۡۢۧ;->ܽ:Ll/ۡۢۧ;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-wide p1, p0, Ll/ۡۢۧ;->ۧ:J

    .line 40
    iput-wide p3, p0, Ll/ۡۢۧ;->֫:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 53
    const-class v2, Ll/ۡۢۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    check-cast p1, Ll/ۡۢۧ;

    .line 57
    iget-wide v2, p0, Ll/ۡۢۧ;->ۧ:J

    iget-wide v4, p1, Ll/ۡۢۧ;->ۧ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/ۡۢۧ;->֫:J

    iget-wide v4, p1, Ll/ۡۢۧ;->֫:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 62
    iget-wide v0, p0, Ll/ۡۢۧ;->ۧ:J

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 63
    iget-wide v2, p0, Ll/ۡۢۧ;->֫:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[timeUs="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/ۡۢۧ;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۡۢۧ;->֫:J

    const-string v3, "]"

    .line 0
    invoke-static {v0, v1, v2, v3}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
