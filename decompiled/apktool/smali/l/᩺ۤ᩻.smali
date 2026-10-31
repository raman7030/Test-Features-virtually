.class public final Ll/᩺ۤ᩻;
.super Ljava/lang/Object;
.source "H79P"


# instance fields
.field public final ֫:Lbin/mt/json/JSONValue;

.field public final ۧ:Ll/ۚܳܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳܳ;Lbin/mt/json/JSONValue;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    iput-object p1, p0, Ll/᩺ۤ᩻;->ۧ:Ll/ۚܳܳ;

    .line 172
    iput-object p2, p0, Ll/᩺ۤ᩻;->֫:Lbin/mt/json/JSONValue;

    return-void
.end method

.method public static ֫(Ll/֨ܳܳ;)Ll/᩺ۤ᩻;
    .locals 2

    .line 164
    new-instance v0, Ll/᩺ۤ᩻;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/᩺ۤ᩻;-><init>(Ll/ۚܳܳ;Lbin/mt/json/JSONValue;)V

    return-object v0
.end method

.method public static ֫(Ll/֨ܳܳ;Lbin/mt/json/JSONObject;)Ll/᩺ۤ᩻;
    .locals 1

    .line 157
    new-instance v0, Ll/᩺ۤ᩻;

    invoke-direct {v0, p0, p1}, Ll/᩺ۤ᩻;-><init>(Ll/ۚܳܳ;Lbin/mt/json/JSONValue;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Lbin/mt/json/JSONValue;
    .locals 1

    .line 179
    iget-object v0, p0, Ll/᩺ۤ᩻;->֫:Lbin/mt/json/JSONValue;

    return-object v0
.end method

.method public final ۧ()Ll/۠ܳܳ;
    .locals 3

    .line 186
    iget-object v0, p0, Ll/᩺ۤ᩻;->ۧ:Ll/ۚܳܳ;

    iget-object v1, p0, Ll/᩺ۤ᩻;->֫:Lbin/mt/json/JSONValue;

    if-nez v1, :cond_0

    const-string v1, "text/plain; charset=UTF-8"

    const-string v2, ""

    .line 38
    invoke-static {v0, v1, v2}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v2, "application/json"

    .line 31
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0
.end method
