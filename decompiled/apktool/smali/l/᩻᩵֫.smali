.class public final Ll/᩻᩵֫;
.super Ljava/lang/Object;
.source "8AVI"


# instance fields
.field public final ֫:[Ll/ܳ᩵֫;

.field public final ۧ:J


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public varargs constructor <init>(J[Ll/ܳ᩵֫;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-wide p1, p0, Ll/᩻᩵֫;->ۧ:J

    .line 83
    iput-object p3, p0, Ll/᩻᩵֫;->֫:[Ll/ܳ᩵֫;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ܳ᩵֫;

    .line 90
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/ܳ᩵֫;

    invoke-direct {p0, p1}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    return-void
.end method

.method public varargs constructor <init>([Ll/ܳ᩵֫;)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    invoke-direct {p0, v0, v1, p1}, Ll/᩻᩵֫;-><init>(J[Ll/ܳ᩵֫;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 163
    const-class v2, Ll/᩻᩵֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 166
    :cond_1
    check-cast p1, Ll/᩻᩵֫;

    .line 167
    iget-object v2, p0, Ll/᩻᩵֫;->֫:[Ll/ܳ᩵֫;

    iget-object v3, p1, Ll/᩻᩵֫;->֫:[Ll/ܳ᩵֫;

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-wide v2, p0, Ll/᩻᩵֫;->ۧ:J

    iget-wide v4, p1, Ll/᩻᩵֫;->ۧ:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 172
    iget-object v0, p0, Ll/᩻᩵֫;->֫:[Ll/ܳ᩵֫;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 173
    iget-wide v1, p0, Ll/᩻᩵֫;->ۧ:J

    invoke-static {v1, v2}, Ll/ۛ᩺ܺ;->֫(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "entries="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩻᩵֫;->֫:[Ll/ܳ᩵֫;

    .line 180
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 181
    iget-wide v3, p0, Ll/᩻᩵֫;->ۧ:J

    cmp-long v5, v3, v1

    if-nez v5, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", presentationTimeUs="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 103
    iget-object v0, p0, Ll/᩻᩵֫;->֫:[Ll/ܳ᩵֫;

    array-length v0, v0

    return v0
.end method

.method public final ֫(I)Ll/ܳ᩵֫;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/᩻᩵֫;->֫:[Ll/ܳ᩵֫;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫(J)Ll/᩻᩵֫;
    .locals 3

    .line 152
    iget-wide v0, p0, Ll/᩻᩵֫;->ۧ:J

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    return-object p0

    .line 155
    :cond_0
    new-instance v0, Ll/᩻᩵֫;

    iget-object v1, p0, Ll/᩻᩵֫;->֫:[Ll/ܳ᩵֫;

    invoke-direct {v0, p1, p2, v1}, Ll/᩻᩵֫;-><init>(J[Ll/ܳ᩵֫;)V

    return-object v0
.end method

.method public final ֫(Ll/᩻᩵֫;)Ll/᩻᩵֫;
    .locals 0

    if-nez p1, :cond_0

    return-object p0

    .line 128
    :cond_0
    iget-object p1, p1, Ll/᩻᩵֫;->֫:[Ll/ܳ᩵֫;

    invoke-virtual {p0, p1}, Ll/᩻᩵֫;->֫([Ll/ܳ᩵֫;)Ll/᩻᩵֫;

    move-result-object p1

    return-object p1
.end method

.method public final varargs ֫([Ll/ܳ᩵֫;)Ll/᩻᩵֫;
    .locals 5

    .line 138
    array-length v0, p1

    if-nez v0, :cond_0

    return-object p0

    .line 141
    :cond_0
    new-instance v0, Ll/᩻᩵֫;

    .line 142
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 682
    iget-object v1, p0, Ll/᩻᩵֫;->֫:[Ll/ܳ᩵֫;

    array-length v2, v1

    array-length v3, p1

    add-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    .line 683
    array-length v1, v1

    array-length v3, p1

    const/4 v4, 0x0

    invoke-static {p1, v4, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    check-cast v2, [Ll/ܳ᩵֫;

    iget-wide v3, p0, Ll/᩻᩵֫;->ۧ:J

    invoke-direct {v0, v3, v4, v2}, Ll/᩻᩵֫;-><init>(J[Ll/ܳ᩵֫;)V

    return-object v0
.end method
