.class public final Ll/ۗۖ᩻;
.super Ll/۟ܶۡ;
.source "V89B"


# instance fields
.field public final synthetic ܳ:Ll/ۗܺ᩷;

.field public final synthetic ᩻:Ll/۬ۖ᩻;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/۬ۖ᩻;)V
    .locals 0

    .line 312
    iput-object p1, p0, Ll/ۗۖ᩻;->ܳ:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۗۖ᩻;->᩻:Ll/۬ۖ᩻;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 333
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const v0, 0x7f1206d4

    .line 335
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 340
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 342
    :cond_0
    iget-object v0, p0, Ll/ۗۖ᩻;->ܳ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 316
    iget-object v0, p0, Ll/ۗۖ᩻;->ܳ:Ll/ۗܺ᩷;

    const v1, 0x7f1206cd

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    .line 317
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ll/᩺ۤᩳ;

    const/4 v2, 0x3

    invoke-direct {v1, v2, v0}, Ll/᩺ۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܿ()V
    .locals 11

    .line 322
    new-instance v0, Lcom/amazonaws/internal/StaticCredentialsProvider;

    new-instance v1, Lcom/amazonaws/auth/BasicAWSCredentials;

    iget-object v2, p0, Ll/ۗۖ᩻;->᩻:Ll/۬ۖ᩻;

    iget-object v3, v2, Ll/۬ۖ᩻;->֫֫:Ljava/lang/String;

    iget-object v4, v2, Ll/۬ۖ᩻;->ܳ֫:Ljava/lang/String;

    invoke-direct {v1, v3, v4}, Lcom/amazonaws/auth/BasicAWSCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/amazonaws/internal/StaticCredentialsProvider;-><init>(Lcom/amazonaws/auth/BasicAWSCredentials;)V

    .line 323
    new-instance v1, Lcom/amazonaws/ClientConfiguration;

    invoke-direct {v1}, Lcom/amazonaws/ClientConfiguration;-><init>()V

    .line 324
    iget-object v3, v2, Ll/۬ۖ᩻;->ᩳ֫:Ljava/lang/String;

    invoke-static {v3, v1}, Ll/۬ۖ᩻;->֫(Ljava/lang/String;Lcom/amazonaws/ClientConfiguration;)Ljava/lang/String;

    move-result-object v3

    .line 325
    new-instance v4, Ll/֫ۖ᩻;

    .line 24
    invoke-direct {v4, v0, v1}, Lcom/amazonaws/services/s3/AmazonS3Client;-><init>(Lcom/amazonaws/auth/AWSCredentialsProvider;Lcom/amazonaws/ClientConfiguration;)V

    .line 326
    invoke-virtual {v4, v3}, Ll/֫ۖ᩻;->֫(Ljava/lang/String;)V

    .line 327
    iget-boolean v0, v2, Ll/۬ۖ᩻;->ܿ֫:Z

    invoke-virtual {v4, v0}, Ll/֫ۖ᩻;->֫(Z)V

    .line 328
    new-instance v0, Lcom/amazonaws/services/s3/model/ListObjectsRequest;

    iget-object v6, v2, Ll/۬ۖ᩻;->ۧ֫:Ljava/lang/String;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const-string v7, ""

    const-string v8, ""

    const-string v9, ""

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Lcom/amazonaws/services/s3/model/ListObjectsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v4, v0}, Lcom/amazonaws/services/s3/AmazonS3Client;->֫(Lcom/amazonaws/services/s3/model/ListObjectsRequest;)Lcom/amazonaws/services/s3/model/ObjectListing;

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 347
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 349
    :cond_0
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
