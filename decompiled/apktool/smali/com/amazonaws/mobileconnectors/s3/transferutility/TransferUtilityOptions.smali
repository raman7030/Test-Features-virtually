.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;
.super Ljava/lang/Object;
.source "TransferUtilityOptions.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x1L

.field public static final ᩶:Lcom/amazonaws/logging/Log;

.field public static final synthetic ᩹:I


# instance fields
.field public ᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 50
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;->᩶:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 245
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;->᩹:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    .line 96
    iput-object v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;->᩸:Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferNetworkConnectionType;

    return-void
.end method
