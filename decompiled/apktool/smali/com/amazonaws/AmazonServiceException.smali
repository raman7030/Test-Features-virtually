.class public Lcom/amazonaws/AmazonServiceException;
.super Lcom/amazonaws/AmazonClientException;
.source "AmazonServiceException.java"


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public ۗ:I

.field public ۙ:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 59
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 88
    sget-object v0, Lcom/amazonaws/AmazonServiceException$ErrorType;->᩹:Lcom/amazonaws/AmazonServiceException$ErrorType;

    .line 110
    iput-object p1, p0, Lcom/amazonaws/AmazonServiceException;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 3

    .line 237
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    iget-object v1, p0, Lcom/amazonaws/AmazonServiceException;->᩹:Ljava/lang/String;

    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (Service: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    iget-object v1, p0, Lcom/amazonaws/AmazonServiceException;->ۙ:Ljava/lang/String;

    .line 238
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "; Status Code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    iget v1, p0, Lcom/amazonaws/AmazonServiceException;->ۗ:I

    .line 239
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "; Error Code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    invoke-virtual {p0}, Lcom/amazonaws/AmazonServiceException;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "; Request ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    iget-object v1, p0, Lcom/amazonaws/AmazonServiceException;->᩶:Ljava/lang/String;

    const-string v2, ")"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫()Ljava/lang/String;
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/amazonaws/AmazonServiceException;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 221
    iput p1, p0, Lcom/amazonaws/AmazonServiceException;->ۗ:I

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/amazonaws/AmazonServiceException;->᩸:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/amazonaws/AmazonServiceException;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/amazonaws/AmazonServiceException;->᩹:Ljava/lang/String;

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/amazonaws/AmazonServiceException;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/amazonaws/AmazonServiceException;->᩶:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 232
    iget v0, p0, Lcom/amazonaws/AmazonServiceException;->ۗ:I

    return v0
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/amazonaws/AmazonServiceException;->ۙ:Ljava/lang/String;

    return-void
.end method
