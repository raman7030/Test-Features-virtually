.class public abstract Lcom/amazonaws/services/s3/internal/SSEResultBase;
.super Ljava/lang/Object;
.source "SSEResultBase.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;


# instance fields
.field public ᩶:Ljava/lang/String;

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/SSEResultBase;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/SSEResultBase;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/SSEResultBase;->᩹:Ljava/lang/String;

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/SSEResultBase;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/SSEResultBase;->᩶:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/SSEResultBase;->᩸:Ljava/lang/String;

    return-void
.end method
