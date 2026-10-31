.class public final Ll/᩹ܺۢ;
.super Ljava/lang/Object;
.source "T753"

# interfaces
.implements Ll/۠ܺۢ;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "name"

    const-string v1, ""

    .line 12
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ܺۢ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;)Ll/᩹ܺۢ;
    .locals 1

    .line 19
    new-instance v0, Ll/᩹ܺۢ;

    invoke-direct {v0, p0}, Ll/᩹ܺۢ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method
