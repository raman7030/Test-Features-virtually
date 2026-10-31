.class public Lcom/rosan/dhizuku/api/DhizukuClient;
.super Lcom/rosan/dhizuku/aidl/IDhizukuClient$Stub;
.source "DhizukuClient.java"


# static fields
.field public static final VERSION_CODE:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/rosan/dhizuku/aidl/IDhizukuClient$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public getVersionCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
