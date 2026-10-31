.class public final Ll/ۖܺۧ;
.super Ljava/lang/Object;
.source "O8SY"

# interfaces
.implements Ll/ܳ᩵֫;


# instance fields
.field public final ֫:J

.field public final ۧ:J

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:J


# direct methods
.method public constructor <init>(JJJJJ)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-wide p1, p0, Ll/ۖܺۧ;->ܽ:J

    .line 54
    iput-wide p3, p0, Ll/ۖܺۧ;->ۧ:J

    .line 55
    iput-wide p5, p0, Ll/ۖܺۧ;->֫:J

    .line 56
    iput-wide p7, p0, Ll/ۖܺۧ;->ܿ:J

    .line 57
    iput-wide p9, p0, Ll/ۖܺۧ;->ᩳ:J

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

    .line 65
    const-class v2, Ll/ۖܺۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 68
    :cond_1
    check-cast p1, Ll/ۖܺۧ;

    .line 69
    iget-wide v2, p0, Ll/ۖܺۧ;->ܽ:J

    iget-wide v4, p1, Ll/ۖܺۧ;->ܽ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/ۖܺۧ;->ۧ:J

    iget-wide v4, p1, Ll/ۖܺۧ;->ۧ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/ۖܺۧ;->֫:J

    iget-wide v4, p1, Ll/ۖܺۧ;->֫:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/ۖܺۧ;->ܿ:J

    iget-wide v4, p1, Ll/ۖܺۧ;->ܿ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/ۖܺۧ;->ᩳ:J

    iget-wide v4, p1, Ll/ۖܺۧ;->ᩳ:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 79
    iget-wide v0, p0, Ll/ۖܺۧ;->ܽ:J

    invoke-static {v0, v1}, Ll/ۛ᩺ܺ;->֫(J)I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 80
    iget-wide v1, p0, Ll/ۖܺۧ;->ۧ:J

    invoke-static {v1, v2}, Ll/ۛ᩺ܺ;->֫(J)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 81
    iget-wide v2, p0, Ll/ۖܺۧ;->֫:J

    invoke-static {v2, v3}, Ll/ۛ᩺ܺ;->֫(J)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 82
    iget-wide v1, p0, Ll/ۖܺۧ;->ܿ:J

    invoke-static {v1, v2}, Ll/ۛ᩺ܺ;->֫(J)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 83
    iget-wide v2, p0, Ll/ۖܺۧ;->ᩳ:J

    invoke-static {v2, v3}, Ll/ۛ᩺ܺ;->֫(J)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Motion photo metadata: photoStartPosition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/ۖܺۧ;->ܽ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", photoSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۖܺۧ;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", photoPresentationTimestampUs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۖܺۧ;->֫:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", videoStartPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۖܺۧ;->ܿ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", videoSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۖܺۧ;->ᩳ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫()Ll/۠ᩴ֫;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ᩳ᩵֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ۧ()[B
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
