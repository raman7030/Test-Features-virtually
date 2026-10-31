.class public final enum Lcom/umeng/analytics/Gender$3;
.super Lcom/umeng/analytics/Gender;
.source "Gender.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/umeng/analytics/Gender;-><init>(Ljava/lang/String;IILcom/umeng/analytics/Gender$1;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 31
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget v0, p0, Lcom/umeng/analytics/Gender;->value:I

    const-string v1, "Unknown:"

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
