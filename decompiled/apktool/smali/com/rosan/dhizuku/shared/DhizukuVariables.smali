.class public Lcom/rosan/dhizuku/shared/DhizukuVariables;
.super Ljava/lang/Object;
.source "DhizukuVariables.java"


# static fields
.field public static final BINDER_DESCRIPTOR:Ljava/lang/String; = "com.rosan.dhizuku.server"

.field public static final EXTRA_CLIENT:Ljava/lang/String; = "client"

.field public static final OFFICIAL_PACKAGE_NAME:Ljava/lang/String; = "com.rosan.dhizuku"

.field public static final PARAM_CLIENT_REQUEST_PERMISSION_BINDER:Ljava/lang/String; = "request_permission_binder"

.field public static final PARAM_CLIENT_UID:Ljava/lang/String; = "uid"

.field public static final PARAM_COMPONENT:Ljava/lang/String; = "component"

.field public static final PARAM_DHIZUKU_BINDER:Ljava/lang/String; = "dhizuku_binder"

.field public static final PERMISSION_API:Ljava/lang/String; = "com.rosan.dhizuku.permission.API"

.field public static final PROVIDER_METHOD_CLIENT:Ljava/lang/String; = "client"

.field public static final TRANSACT_CODE_REMOTE_BINDER:I = 0xb


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getActionRequestPermission(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "com.rosan.dhizuku"

    .line 19
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "com.rosan.dhizuku.action.request.permission"

    return-object p0

    :cond_0
    const-string v0, ".action.REQUEST_DHIZUKU_PERMISSION"

    .line 0
    invoke-static {p0, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getProviderAuthorityName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "com.rosan.dhizuku"

    .line 13
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "com.rosan.dhizuku.server.provider"

    return-object p0

    :cond_0
    const-string v0, ".dhizuku_server.provider"

    .line 0
    invoke-static {p0, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
