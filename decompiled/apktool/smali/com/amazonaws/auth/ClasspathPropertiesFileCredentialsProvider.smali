.class public Lcom/amazonaws/auth/ClasspathPropertiesFileCredentialsProvider;
.super Ljava/lang/Object;
.source "ClasspathPropertiesFileCredentialsProvider.java"

# interfaces
.implements Lcom/amazonaws/auth/AWSCredentialsProvider;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "/"

    const-string v1, "AwsCredentials.properties"

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/amazonaws/auth/ClasspathPropertiesFileCredentialsProvider;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/amazonaws/auth/ClasspathPropertiesFileCredentialsProvider;->֫:Ljava/lang/String;

    const-string v2, ")"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Lcom/amazonaws/auth/AWSCredentials;
    .locals 5

    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/amazonaws/auth/ClasspathPropertiesFileCredentialsProvider;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    const-string v2, " file on the classpath"

    const-string v3, "Unable to load AWS credentials from the "

    if-eqz v0, :cond_0

    .line 93
    :try_start_0
    new-instance v4, Lcom/amazonaws/auth/PropertiesCredentials;

    invoke-direct {v4, v0}, Lcom/amazonaws/auth/PropertiesCredentials;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    :catch_0
    move-exception v0

    .line 95
    new-instance v4, Lcom/amazonaws/AmazonClientException;

    .line 0
    invoke-static {v3, v1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-direct {v4, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    throw v4

    .line 88
    :cond_0
    new-instance v0, Lcom/amazonaws/AmazonClientException;

    .line 0
    invoke-static {v3, v1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 59
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 88
    throw v0
.end method
