.class public Lcom/amazonaws/ResponseMetadata;
.super Ljava/lang/Object;
.source "ResponseMetadata.java"


# instance fields
.field public final ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/amazonaws/ResponseMetadata;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/amazonaws/ResponseMetadata;->֫:Ljava/util/HashMap;

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
