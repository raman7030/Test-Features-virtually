.class public Lcom/amazonaws/ClientConfiguration;
.super Ljava/lang/Object;
.source "ClientConfiguration.java"


# static fields
.field public static final ۜ:Lcom/amazonaws/retry/RetryPolicy;

.field public static final ᩷:Ljava/lang/String;


# instance fields
.field public ֫:I

.field public ۧ:Lcom/amazonaws/Protocol;

.field public ܳ:Ljava/lang/String;

.field public ܽ:Lcom/amazonaws/retry/RetryPolicy;

.field public ܿ:I

.field public ᩳ:Ljava/lang/String;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    invoke-static {}, Lcom/amazonaws/util/VersionInfoUtils;->֫()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/ClientConfiguration;->᩷:Ljava/lang/String;

    .line 57
    sget-object v0, Lcom/amazonaws/retry/PredefinedRetryPolicies;->֫:Lcom/amazonaws/retry/RetryPolicy;

    sput-object v0, Lcom/amazonaws/ClientConfiguration;->ۜ:Lcom/amazonaws/retry/RetryPolicy;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    sget-object v0, Lcom/amazonaws/ClientConfiguration;->᩷:Ljava/lang/String;

    iput-object v0, p0, Lcom/amazonaws/ClientConfiguration;->ܳ:Ljava/lang/String;

    .line 77
    sget-object v0, Lcom/amazonaws/ClientConfiguration;->ۜ:Lcom/amazonaws/retry/RetryPolicy;

    iput-object v0, p0, Lcom/amazonaws/ClientConfiguration;->ܽ:Lcom/amazonaws/retry/RetryPolicy;

    .line 88
    sget-object v0, Lcom/amazonaws/Protocol;->ۙ:Lcom/amazonaws/Protocol;

    iput-object v0, p0, Lcom/amazonaws/ClientConfiguration;->ۧ:Lcom/amazonaws/Protocol;

    const/16 v0, 0x3a98

    .line 129
    iput v0, p0, Lcom/amazonaws/ClientConfiguration;->ܿ:I

    .line 136
    iput v0, p0, Lcom/amazonaws/ClientConfiguration;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 744
    iget v0, p0, Lcom/amazonaws/ClientConfiguration;->֫:I

    return v0
.end method

.method public final ֫(Lcom/amazonaws/Protocol;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lcom/amazonaws/ClientConfiguration;->ۧ:Lcom/amazonaws/Protocol;

    return-void
.end method

.method public final ۜ()V
    .locals 1

    const-string v0, "UnsignedPayloadSignerType"

    .line 955
    iput-object v0, p0, Lcom/amazonaws/ClientConfiguration;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public final ۧ()Lcom/amazonaws/Protocol;
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/amazonaws/ClientConfiguration;->ۧ:Lcom/amazonaws/Protocol;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 311
    iget-object v0, p0, Lcom/amazonaws/ClientConfiguration;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Lcom/amazonaws/retry/RetryPolicy;
    .locals 1

    .line 618
    iget-object v0, p0, Lcom/amazonaws/ClientConfiguration;->ܽ:Lcom/amazonaws/retry/RetryPolicy;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 701
    iget v0, p0, Lcom/amazonaws/ClientConfiguration;->ܿ:I

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 928
    iget-object v0, p0, Lcom/amazonaws/ClientConfiguration;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()V
    .locals 1

    const-string v0, "s3drive rclone s3 browser obsidian"

    .line 353
    iput-object v0, p0, Lcom/amazonaws/ClientConfiguration;->᩻:Ljava/lang/String;

    return-void
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/amazonaws/ClientConfiguration;->᩻:Ljava/lang/String;

    return-object v0
.end method
