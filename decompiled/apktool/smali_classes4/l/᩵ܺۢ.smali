.class public final Ll/᩵ܺۢ;
.super Ljava/lang/Object;
.source "V75L"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 3

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "address"

    const-wide/16 v1, 0x0

    .line 45
    invoke-static {p1, v0, v1, v2}, Ll/᩻ۖۢ;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    const-string v0, "size"

    const/4 v1, 0x0

    .line 46
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/᩵ܺۢ;->֫:I

    const-string v0, "bytes"

    const-string v1, ""

    .line 47
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "text"

    .line 48
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ܺۢ;->ۧ:Ljava/lang/String;

    return-void
.end method
