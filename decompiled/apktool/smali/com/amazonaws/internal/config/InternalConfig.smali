.class public Lcom/amazonaws/internal/config/InternalConfig;
.super Ljava/lang/Object;
.source "InternalConfig.java"


# static fields
.field public static final ᩻:Lcom/amazonaws/logging/Log;


# instance fields
.field public final ֫:Lcom/amazonaws/internal/config/SignerConfig;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܳ:Ljava/util/HashMap;

.field public final ܽ:Ljava/util/HashMap;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 33
    const-class v0, Lcom/amazonaws/internal/config/InternalConfig;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/internal/config/InternalConfig;->᩻:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    new-instance v0, Lcom/amazonaws/internal/config/SignerConfig;

    const-string v1, "AWS4SignerType"

    invoke-direct {v0, v1}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    .line 44
    iput-object v0, p0, Lcom/amazonaws/internal/config/InternalConfig;->֫:Lcom/amazonaws/internal/config/SignerConfig;

    .line 137
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 138
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v1}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v3, "eu-central-1"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v1}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v3, "cn-north-1"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iput-object v0, p0, Lcom/amazonaws/internal/config/InternalConfig;->ᩳ:Ljava/util/HashMap;

    .line 162
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 163
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    const-string v3, "QueryStringSignerType"

    invoke-direct {v2, v3}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "ec2"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v1}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v1, "email"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    const-string v4, "AWSS3V4SignerType"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v5, "s3"

    invoke-virtual {v0, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v3}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v3, "sdb"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    const-string v5, "AmazonLexV4Signer"

    invoke-direct {v2, v5}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v6, "lex"

    invoke-virtual {v0, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    const-string v7, "AmazonPollyCustomPresigner"

    invoke-direct {v2, v7}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v8, "polly"

    invoke-virtual {v0, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    iput-object v0, p0, Lcom/amazonaws/internal/config/InternalConfig;->ܳ:Ljava/util/HashMap;

    .line 145
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 146
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v8, "s3/eu-central-1"

    invoke-virtual {v0, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v8, "s3/cn-north-1"

    invoke-virtual {v0, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v8, "s3/us-east-2"

    invoke-virtual {v0, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v8, "s3/ca-central-1"

    invoke-virtual {v0, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v8, "s3/ap-south-1"

    invoke-virtual {v0, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v8, "s3/ap-northeast-2"

    invoke-virtual {v0, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "s3/eu-west-2"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v5}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "lex/eu-central-1"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v5}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "lex/cn-north-1"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v7}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "polly/eu-central-1"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    new-instance v2, Lcom/amazonaws/internal/config/SignerConfig;

    invoke-direct {v2, v7}, Lcom/amazonaws/internal/config/SignerConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "polly/cn-north-1"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    iput-object v0, p0, Lcom/amazonaws/internal/config/InternalConfig;->ܿ:Ljava/util/HashMap;

    .line 109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 110
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "monitoring"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonCloudWatchClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "logs"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonCloudWatchLogsClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "cognito-identity"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonCognitoIdentityClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "cognito-idp"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonCognitoIdentityProviderClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "cognito-sync"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonCognitoSyncClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "comprehend"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonComprehendClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "connect"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonConnectClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "firehose"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonKinesisFirehoseClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "kinesisvideo"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v5, "AWSKinesisVideoArchivedMediaClient"

    invoke-virtual {v0, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AWSKinesisVideoSignalingClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "execute-api"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AWSIotClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    invoke-direct {v2, v6}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonLexRuntimeClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "mobiletargeting"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonPinpointClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "mobileanalytics"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonPinpointAnalyticsClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v4, "sagemaker"

    invoke-direct {v2, v4}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v4, "AmazonSageMakerRuntimeClient"

    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    invoke-direct {v2, v3}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v3, "AmazonSimpleDBClient"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    new-instance v2, Lcom/amazonaws/internal/config/HttpClientConfig;

    invoke-direct {v2, v1}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v1, "AmazonSimpleEmailServiceClient"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    new-instance v1, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v2, "sts"

    invoke-direct {v1, v2}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v2, "AWSSecurityTokenServiceClient"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    new-instance v1, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v2, "textract"

    invoke-direct {v1, v2}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v2, "AmazonTextractClient"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    new-instance v1, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v2, "transcribe"

    invoke-direct {v1, v2}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v2, "AmazonTranscribeClient"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    new-instance v1, Lcom/amazonaws/internal/config/HttpClientConfig;

    const-string v2, "translate"

    invoke-direct {v1, v2}, Lcom/amazonaws/internal/config/HttpClientConfig;-><init>(Ljava/lang/String;)V

    const-string v2, "AmazonTranslateClient"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iput-object v0, p0, Lcom/amazonaws/internal/config/InternalConfig;->ܽ:Ljava/util/HashMap;

    .line 177
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 178
    new-instance v1, Lcom/amazonaws/internal/config/HostRegexToRegionMapping;

    const-string v2, "(.+\\.)?s3\\.amazonaws\\.com"

    const-string v3, "us-east-1"

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/internal/config/HostRegexToRegionMapping;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    new-instance v1, Lcom/amazonaws/internal/config/HostRegexToRegionMapping;

    const-string v2, "(.+\\.)?s3-external-1\\.amazonaws\\.com"

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/internal/config/HostRegexToRegionMapping;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    new-instance v1, Lcom/amazonaws/internal/config/HostRegexToRegionMapping;

    const-string v2, "(.+\\.)?s3-fips-us-gov-west-1\\.amazonaws\\.com"

    const-string v3, "us-gov-west-1"

    invoke-direct {v1, v2, v3}, Lcom/amazonaws/internal/config/HostRegexToRegionMapping;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    iput-object v0, p0, Lcom/amazonaws/internal/config/InternalConfig;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Lcom/amazonaws/internal/config/HttpClientConfig;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/amazonaws/internal/config/InternalConfig;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amazonaws/internal/config/HttpClientConfig;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Lcom/amazonaws/internal/config/SignerConfig;
    .locals 2

    if-eqz p1, :cond_3

    if-eqz p2, :cond_1

    const-string v0, "/"

    .line 0
    invoke-static {p1, v0, p2}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 84
    iget-object v1, p0, Lcom/amazonaws/internal/config/InternalConfig;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/internal/config/SignerConfig;

    if-eqz v0, :cond_0

    return-object v0

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/amazonaws/internal/config/InternalConfig;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/amazonaws/internal/config/SignerConfig;

    if-eqz p2, :cond_1

    return-object p2

    .line 95
    :cond_1
    iget-object p2, p0, Lcom/amazonaws/internal/config/InternalConfig;->ܳ:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/amazonaws/internal/config/SignerConfig;

    if-nez p1, :cond_2

    .line 97
    iget-object p1, p0, Lcom/amazonaws/internal/config/InternalConfig;->֫:Lcom/amazonaws/internal/config/SignerConfig;

    :cond_2
    return-object p1

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/amazonaws/internal/config/InternalConfig;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
