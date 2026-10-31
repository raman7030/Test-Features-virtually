.class public final Lcom/amazonaws/util/DateUtils$1;
.super Ljava/lang/ThreadLocal;
.source "DateUtils.java"


# instance fields
.field public final synthetic ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/amazonaws/util/DateUtils$1;->֫:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    .line 74
    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lcom/amazonaws/util/DateUtils$1;->֫:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 75
    invoke-static {}, Lcom/amazonaws/util/DateUtils;->֫()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const/4 v1, 0x0

    .line 76
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setLenient(Z)V

    return-object v0
.end method
