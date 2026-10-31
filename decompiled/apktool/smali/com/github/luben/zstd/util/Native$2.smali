.class public Lcom/github/luben/zstd/util/Native$2;
.super Ljava/lang/Object;
.source "Native.java"

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field public final synthetic val$libFileName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/github/luben/zstd/util/Native$2;->val$libFileName:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic run()Ljava/lang/Object;
    .locals 1

    .line 79
    invoke-virtual {p0}, Lcom/github/luben/zstd/util/Native$2;->run()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public run()Ljava/lang/Void;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/github/luben/zstd/util/Native$2;->val$libFileName:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
