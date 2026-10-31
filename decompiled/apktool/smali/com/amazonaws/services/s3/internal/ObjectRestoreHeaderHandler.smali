.class public Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;
.super Ljava/lang/Object;
.source "ObjectRestoreHeaderHandler.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/HeaderHandler;


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;

.field public static final ۧ:Ljava/util/regex/Pattern;

.field public static final ܽ:Lcom/amazonaws/logging/Log;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "expiry-date=\"(.*?)\""

    .line 40
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;->֫:Ljava/util/regex/Pattern;

    const-string v0, "ongoing-request=\"(.*?)\""

    .line 42
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;->ۧ:Ljava/util/regex/Pattern;

    .line 44
    const-class v0, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;

    .line 45
    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;->ܽ:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Lcom/amazonaws/services/s3/internal/ObjectRestoreResult;Lcom/amazonaws/http/HttpResponse;)V
    .locals 5

    .line 55
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p1

    const-string v0, "x-amz-restore"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 66
    sget-object v0, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;->֫:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 67
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    .line 68
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 70
    :try_start_0
    sget v1, Lcom/amazonaws/services/s3/internal/ServiceUtils;->֫:I

    const-string v1, "EEE, dd MMM yyyy HH:mm:ss z"

    .line 149
    invoke-static {v1, v0}, Lcom/amazonaws/util/DateUtils;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 72
    sget-object v1, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;->ܽ:Lcom/amazonaws/logging/Log;

    const-string v4, "Error parsing expiry-date from x-amz-restore header."

    invoke-interface {v1, v4, v0}, Lcom/amazonaws/logging/Log;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    move-object v0, v2

    .line 57
    :goto_0
    invoke-interface {p0, v0}, Lcom/amazonaws/services/s3/internal/ObjectRestoreResult;->ۧ(Ljava/util/Date;)V

    .line 82
    sget-object v0, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    invoke-virtual {p1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    .line 85
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    .line 60
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {p0, p1}, Lcom/amazonaws/services/s3/internal/ObjectRestoreResult;->ܽ(Z)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Lcom/amazonaws/http/HttpResponse;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/amazonaws/services/s3/internal/ObjectRestoreResult;

    invoke-static {p1, p2}, Lcom/amazonaws/services/s3/internal/ObjectRestoreHeaderHandler;->֫(Lcom/amazonaws/services/s3/internal/ObjectRestoreResult;Lcom/amazonaws/http/HttpResponse;)V

    return-void
.end method
