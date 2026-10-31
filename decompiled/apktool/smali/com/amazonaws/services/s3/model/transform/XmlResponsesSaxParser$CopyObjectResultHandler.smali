.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;
.source "XmlResponsesSaxParser.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/ObjectExpirationResult;
.implements Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;
.implements Lcom/amazonaws/services/s3/internal/S3VersionResult;


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Ljava/lang/String;

.field public final ۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

.field public ۬:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1219
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;-><init>()V

    .line 1223
    new-instance v0, Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/CopyObjectResult;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    const/4 v0, 0x0

    .line 1226
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->᩶:Ljava/lang/String;

    .line 1227
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۗ:Ljava/lang/String;

    .line 1228
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۬:Ljava/lang/String;

    .line 1229
    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۙ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 1248
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    .line 1312
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "CopyObjectResult"

    .line 1313
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "CopyPartResult"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "Error"

    .line 1315
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/util/Date;)V
    .locals 1

    .line 1258
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->֫(Ljava/util/Date;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 1302
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->֫(Z)V

    return-void
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 1

    .line 1263
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ܳ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ljava/util/Date;
    .locals 1

    .line 1238
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->᩻()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 1276
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 1

    .line 1288
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۬:Ljava/lang/String;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 1284
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;
    .locals 1

    .line 1234
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    return-object v0
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 2

    const-string v0, "CopyObjectResult"

    .line 1323
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "CopyPartResult"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Error"

    .line 1331
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "Code"

    .line 1332
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1333
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->᩶:Ljava/lang/String;

    return-void

    :cond_1
    const-string v0, "Message"

    .line 1334
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1335
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۗ:Ljava/lang/String;

    return-void

    :cond_2
    const-string v0, "RequestId"

    .line 1336
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1337
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۬:Ljava/lang/String;

    return-void

    :cond_3
    const-string v0, "HostId"

    .line 1338
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1339
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۙ:Ljava/lang/String;

    return-void

    :cond_4
    :goto_0
    const-string v0, "LastModified"

    .line 1324
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    if-eqz v0, :cond_5

    .line 1325
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    sget v0, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    .line 79
    invoke-static {p1}, Lcom/amazonaws/util/DateUtils;->ۧ(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    .line 1325
    invoke-virtual {v1, p1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۧ(Ljava/util/Date;)V

    return-void

    :cond_5
    const-string v0, "ETag"

    .line 1326
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1327
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ܳ(Ljava/lang/String;)V

    :cond_6
    return-void
.end method

.method public final ܺ()Ljava/util/Date;
    .locals 1

    .line 1253
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ܿ()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 1268
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 1243
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ۜ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵()Z
    .locals 1

    .line 1297
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->᩷()Z

    move-result v0

    return v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 1280
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 1272
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$CopyObjectResultHandler;->۫:Lcom/amazonaws/services/s3/model/CopyObjectResult;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/CopyObjectResult;->ᩳ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
