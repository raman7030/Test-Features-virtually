.class public final Ll/ܰۖ᩻;
.super Ljava/lang/Object;
.source "Q87M"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Lcom/amazonaws/services/s3/model/S3ObjectSummary;


# direct methods
.method public constructor <init>(Lcom/amazonaws/services/s3/model/S3ObjectSummary;)V
    .locals 1

    .line 624
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 625
    iput-object v0, p0, Ll/ܰۖ᩻;->֫:Ljava/lang/String;

    .line 626
    iput-object p1, p0, Ll/ܰۖ᩻;->ܽ:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    .line 627
    invoke-virtual {p1}, Lcom/amazonaws/services/s3/model/S3ObjectSummary;->֫()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x2f

    .line 628
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 629
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۖ᩻;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 612
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 613
    iput-object p1, p0, Ll/ܰۖ᩻;->֫:Ljava/lang/String;

    const/4 v0, 0x0

    .line 614
    iput-object v0, p0, Ll/ܰۖ᩻;->ܽ:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    const-string v0, "/"

    .line 615
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x2f

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 616
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v0

    add-int/2addr v0, v2

    .line 0
    invoke-static {v2, v0, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 617
    iput-object p1, p0, Ll/ܰۖ᩻;->ۧ:Ljava/lang/String;

    return-void

    .line 619
    :cond_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    add-int/2addr v0, v2

    .line 620
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۖ᩻;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰۖ᩻;)Lcom/amazonaws/services/s3/model/S3ObjectSummary;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۖ᩻;->ܽ:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/۠ۖ᩻;
    .locals 1

    .line 633
    iget-object v0, p0, Ll/ܰۖ᩻;->֫:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 634
    iget-object v0, p0, Ll/ܰۖ᩻;->ܽ:Lcom/amazonaws/services/s3/model/S3ObjectSummary;

    invoke-static {v0}, Ll/۠ۖ᩻;->֫(Lcom/amazonaws/services/s3/model/S3ObjectSummary;)Ll/۠ۖ᩻;

    move-result-object v0

    return-object v0

    .line 636
    :cond_0
    invoke-static {v0}, Ll/۠ۖ᩻;->ۧ(Ljava/lang/String;)Ll/۠ۖ᩻;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 645
    iget-object v0, p0, Ll/ܰۖ᩻;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 641
    iget-object v0, p0, Ll/ܰۖ᩻;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
