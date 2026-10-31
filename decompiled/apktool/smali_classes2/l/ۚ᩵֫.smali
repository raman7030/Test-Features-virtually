.class public final Ll/ۚ᩵֫;
.super Ljava/lang/Object;
.source "98OO"


# instance fields
.field public final ֫:I

.field public final ۜ:J

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:J

.field public final ܿ:I

.field public final ᩳ:Ll/ۧ᩵֫;

.field public final ᩷:Ljava/lang/Object;

.field public final ᩻:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    .line 0
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۚ۬ۚ;->֫(IIIII)V

    const/4 v0, 0x5

    .line 409
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x6

    .line 410
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILl/ۧ᩵֫;Ljava/lang/Object;IJJII)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 333
    iput-object p1, p0, Ll/ۚ᩵֫;->᩷:Ljava/lang/Object;

    .line 335
    iput p2, p0, Ll/ۚ᩵֫;->ܿ:I

    .line 336
    iput-object p3, p0, Ll/ۚ᩵֫;->ᩳ:Ll/ۧ᩵֫;

    .line 337
    iput-object p4, p0, Ll/ۚ᩵֫;->᩻:Ljava/lang/Object;

    .line 338
    iput p5, p0, Ll/ۚ᩵֫;->ܳ:I

    .line 339
    iput-wide p6, p0, Ll/ۚ᩵֫;->ۜ:J

    .line 340
    iput-wide p8, p0, Ll/ۚ᩵֫;->ܽ:J

    .line 341
    iput p10, p0, Ll/ۚ᩵֫;->֫:I

    .line 342
    iput p11, p0, Ll/ۚ᩵֫;->ۧ:I

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

    .line 350
    const-class v2, Ll/ۚ᩵֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 353
    :cond_1
    check-cast p1, Ll/ۚ᩵֫;

    .line 395
    iget v2, p0, Ll/ۚ᩵֫;->ܿ:I

    iget v3, p1, Ll/ۚ᩵֫;->ܿ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ۚ᩵֫;->ܳ:I

    iget v3, p1, Ll/ۚ᩵֫;->ܳ:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ll/ۚ᩵֫;->ۜ:J

    iget-wide v4, p1, Ll/ۚ᩵֫;->ۜ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/ۚ᩵֫;->ܽ:J

    iget-wide v4, p1, Ll/ۚ᩵֫;->ܽ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget v2, p0, Ll/ۚ᩵֫;->֫:I

    iget v3, p1, Ll/ۚ᩵֫;->֫:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ۚ᩵֫;->ۧ:I

    iget v3, p1, Ll/ۚ᩵֫;->ۧ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/ۚ᩵֫;->ᩳ:Ll/ۧ᩵֫;

    iget-object v3, p1, Ll/ۚ᩵֫;->ᩳ:Ll/ۧ᩵֫;

    .line 401
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 354
    iget-object v2, p0, Ll/ۚ᩵֫;->᩷:Ljava/lang/Object;

    iget-object v3, p1, Ll/ۚ᩵֫;->᩷:Ljava/lang/Object;

    .line 355
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ۚ᩵֫;->᩻:Ljava/lang/Object;

    iget-object p1, p1, Ll/ۚ᩵֫;->᩻:Ljava/lang/Object;

    .line 356
    invoke-static {v2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 9

    .line 361
    iget v0, p0, Ll/ۚ᩵֫;->ܿ:I

    .line 363
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ۚ᩵֫;->ܳ:I

    .line 366
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-wide v2, p0, Ll/ۚ᩵֫;->ۜ:J

    .line 367
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, Ll/ۚ᩵֫;->ܽ:J

    .line 368
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget v4, p0, Ll/ۚ᩵֫;->֫:I

    .line 369
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v5, p0, Ll/ۚ᩵֫;->ۧ:I

    .line 370
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x9

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    iget-object v8, p0, Ll/ۚ᩵֫;->᩷:Ljava/lang/Object;

    aput-object v8, v6, v7

    const/4 v7, 0x1

    aput-object v0, v6, v7

    const/4 v0, 0x2

    iget-object v7, p0, Ll/ۚ᩵֫;->ᩳ:Ll/ۧ᩵֫;

    aput-object v7, v6, v0

    const/4 v0, 0x3

    iget-object v7, p0, Ll/ۚ᩵֫;->᩻:Ljava/lang/Object;

    aput-object v7, v6, v0

    const/4 v0, 0x4

    aput-object v1, v6, v0

    const/4 v0, 0x5

    aput-object v2, v6, v0

    const/4 v0, 0x6

    aput-object v3, v6, v0

    const/4 v0, 0x7

    aput-object v4, v6, v0

    const/16 v0, 0x8

    aput-object v5, v6, v0

    .line 361
    invoke-static {v6}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 375
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mediaItem="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۚ᩵֫;->ܿ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", period="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۚ᩵֫;->ܳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/ۚ᩵֫;->ۜ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, -0x1

    .line 377
    iget v2, p0, Ll/ۚ᩵֫;->֫:I

    if-ne v2, v1, :cond_0

    return-object v0

    :cond_0
    const-string v1, ", contentPos="

    .line 0
    invoke-static {v0, v1}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 380
    iget-wide v3, p0, Ll/ۚ᩵֫;->ܽ:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", adGroup="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ad="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۚ᩵֫;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
